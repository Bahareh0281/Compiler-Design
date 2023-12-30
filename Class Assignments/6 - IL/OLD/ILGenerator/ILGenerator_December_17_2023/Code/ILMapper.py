class ILMapper:
    def __init__(self):
        self.max_register_count = -1
        self.register_counter = -1
        self.stack = []
        self.il_codes = []
        self.global_variables = []
        self.label_counter = 0

    relational_operators = ['>=', '>', '==', '!=', '<', '<=', '&&', '||', ]
    arithmetic_operators = ['+', '-', '*', '/',]
    operators = ['\":=\"',
                 '>=', '>', '==', '!=', '<', '<=',
                '+', '-', '*', '/',
                '&&', '||',
                '!', '&', '|', '^',
                '>>', '<<',
                'if', 'for', 'while',
                '\"?:\"',
                'block',
                 ]


    def create_temp_reg(self):
        self.register_counter += 1
        self.max_register_count += 1
        return 'T' + str(self.register_counter)

    def create_new_label(self):
        self.label_counter += 1
        return 'Label' + str(self.label_counter)

    def get_current_reg(self):
        self.register_counter += 1
        self.max_register_count += 1
        return 'T' + str(self.register_counter)
    
    def free_temp_reg(self):
        self.register_counter -= 1

    def add_global_variable(self,item):
        if item in self.global_variables:
            return
        else:
            self.global_variables.append(item)

    def generate_intermediate_language(self, post_order_array, pre_order_array=None):
        for item in post_order_array:
            if self.is_operator(item):
                self.il_codes.append(self.generate_il_based_on_operator(item))
            else:
                if self.is_identifier(item):
                    self.add_global_variable(item)
                self.stack.append(item)

        result = ''
        for string in self.il_codes:
            if string is not None:
                result += string

        with open("output.il", "w") as my_file:
            my_file.write(self.get_msil_header(self.max_register_count))
            my_file.write(result)
            my_file.write(self.get_msil_footer())
        return result

    def is_temp_reg(self, code):
        return str.startswith(code, "T")

    def is_operator(self, item):
        if item in self.operators:
            return True
        else:
            return False

    def is_identifier(self, item):
        if not self.is_operator(item) and item[0].isalpha():
            return True
        else:
            return False

    def generate_il_based_on_operator(self, item):
        if item == '\":=\"':
            second_operand = self.stack.pop()
            first_operand = self.stack.pop()
            return self.assignment(first_operand, second_operand)
        if item in self.arithmetic_operators:
            second_operand = self.stack.pop()
            first_operand = self.stack.pop()
            return self.arithmetic(first_operand, second_operand,item)
        if item in self.relational_operators:
            second_operand = self.stack.pop()
            first_operand = self.stack.pop()
            return self.relational(first_operand, second_operand, item)
        if item == '\"?:\"':
            second_operand = self.stack.pop()
            first_operand = self.stack.pop()
            condition = self.stack.pop()
            return self.ternary(condition,first_operand,second_operand)
        if item == 'if':
            # pass
            condition = self.stack.pop()
            true_block = self.stack.pop()
            false_block = self.stack.pop()
            return self.if_statement(condition, true_block, false_block)

        if item == 'for':
            loop_variable = self.stack.pop()
            start_value = self.stack.pop()
            end_value = self.stack.pop()
            step_value = self.stack.pop()
            loop_block = self.stack.pop()
            return self.for_loop(loop_variable, start_value, end_value, step_value, loop_block)

        if item == 'while':
            condition = self.stack.pop()
            loop_block = self.stack.pop()
            return self.while_loop(condition, loop_block)

    def if_statement(self, condition, true_block, false_block):
        il_code = f"if {condition} goto {true_block} else goto {false_block}"
        return il_code

    def for_loop(self, loop_variable, start_value, end_value, step_value, loop_block):
        il_code = f"for {loop_variable} = {start_value} to {end_value} step {step_value} do {loop_block}"
        return il_code

    def while_loop(self, condition, loop_block):
        il_code = f"while {condition} do {loop_block}"
        return il_code



    def get_msil_header(self,used_regs):
        result = (".assembly extern mscorlib {}\n"
                ".assembly output {}\n"
                ".module output.exe\n"
                ".class private auto ansi beforefieldinit ConsoleApp1.Program extends [mscorlib]System.Object\n"
                "{\n"
                ".method private hidebysig static void  Main(string[] args) cil managed\n"
                "{\n"
                ".entrypoint\n"
                ".maxstack  100\n")
        for i in range(used_regs+1):
            result += f".locals init ([{i}] int64 T{i})\n"

        for i in range(len(self.global_variables)):
            result += f".locals init ([{i+used_regs+1}] int64 {self.global_variables[i] })\n"
        if not 'output' in self.global_variables:
            result += f".locals init ([{len(self.global_variables)+used_regs+1}] int64 output)\n"


        result += ("nop\n"
                "///////////////////////// IL CODE\n")

        return result

    @staticmethod
    def get_msil_footer():
        return ("\n///////////////////////// IL CODE\n"
                "ldloca.s   output\n"
                "call       instance string [mscorlib]System.Int64::ToString()\n"
                "call       void [mscorlib]System.Console::WriteLine(string)\n"
                "nop\n"
                "ret\n"
                "} // end of method Program::Main\n"
                ".method public hidebysig specialname rtspecialname instance void  .ctor() cil managed\n"
                "{\n"
                ".maxstack  8\n"
                "ldarg.0\n"
                "call       instance void [mscorlib]System.Object::.ctor()\n"
                "nop\n"
                "ret\n"
                "} // end of method Program::.ctor\n"
                "} // end of class\n")

    def arithmetic(self, a, b,item):
        first_load_statement = None
        second_load_statement = None
        operator = 'add' if item=='+' else 'sub' if item=='-' else 'div' if item=='/' else 'mul'
        if self.is_identifier(a):
            first_load_statement = f"ldloc {a}\n"
            if self.is_temp_reg(a):
                self.free_temp_reg()
        else:
            first_load_statement = f"ldc.i8 {a}\n"
        if self.is_identifier(b):
            second_load_statement = f"ldloc {b}\n"
            if self.is_temp_reg(b):
                self.free_temp_reg()
        else:
            second_load_statement = f"ldc.i8 {b}\n"

        result_reg = self.create_temp_reg()
        self.stack.append(result_reg)
        return first_load_statement + second_load_statement + f"{operator}\n"+f"stloc {result_reg}\n"

    def assignment(self,first_operand, second_operand):
        if not self.is_identifier(first_operand):
            raise Exception
        if self.is_identifier(second_operand):
            load_statement = f"ldloc {second_operand}\n"
            if self.is_temp_reg(second_operand):
                self.free_temp_reg()
        else:
            load_statement = f"ldc.i8 {second_operand}\n"
        return load_statement+f"stloc {first_operand}\n"

    def relational(self, a, b, item):
        first_load_statement = None
        second_load_statement = None
        operator = 'and' if item == '&&' else 'or' if item == '||' else 'ceq' if item == '==' else 'cgt'
        if self.is_identifier(a):
            first_load_statement = f"ldloc {a}\n"
            if self.is_temp_reg(a):
                self.free_temp_reg()
        else:
            first_load_statement = f"ldc.i8 {a}\n"
        if self.is_identifier(b):
            second_load_statement = f"ldloc {b}\n"
            if self.is_temp_reg(b):
                self.free_temp_reg()
        else:
            second_load_statement = f"ldc.i8 {b}\n"

        result_reg = self.create_temp_reg()
        self.stack.append(result_reg)
        return first_load_statement + second_load_statement + f"{operator}\n" + f"stloc {result_reg}\n"

    def ternary(self, condition, a, b):
        first_load_statement = None
        second_load_statement = None
        if self.is_identifier(condition):
            condition_load_statement = f"ldloc {condition}\n"
            if self.is_temp_reg(condition):
                self.free_temp_reg()
        else:
            condition_load_statement = f"ldc.i8 {condition}\n"
        if self.is_identifier(a):
            first_load_statement = f"ldloc {a}\n"
            if self.is_temp_reg(a):
                self.free_temp_reg()
        else:
            first_load_statement = f"ldc.i8 {a}\n"
        if self.is_identifier(b):
            second_load_statement = f"ldloc {b}\n"
            if self.is_temp_reg(b):
                self.free_temp_reg()
        else:
            second_load_statement = f"ldc.i8 {b}\n"

        result_reg = self.create_temp_reg()
        self.stack.append(result_reg)
        true_start_label = self.create_new_label()
        false_start_label = self.create_new_label()
        false_end_label = self.create_new_label()

        return condition_load_statement+f"brtrue {true_start_label}\n"+f"br {false_start_label}\n"+f"{true_start_label+':'}\n"+first_load_statement +f"br {false_end_label} \n" +f"{false_start_label+':'}\n"+second_load_statement+f"{false_end_label+':'}\n"+ f"stloc {result_reg}\n"



