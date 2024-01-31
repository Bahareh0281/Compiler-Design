from gen.JavaParser import *
import networkx as nx
import math
import time
import random #
class node :
    def __int__(self):
        self.number = 0
        self.next = None
        self.next_divert = None

class graph:
    def __init__(self):
        self.nodes = []
        # self.edges = {}
        self.edges_numbers = 0
        self.current_node = None
        self.last_node_numbers = 0

    def create_node_for_while(self):
        first = node()
        second = node()
        third = node()
        if self.current_node == None:
            self.current_node = first
        else:
            self.current_node.next = first
            self.edges_numbers = self.edges_numbers + 1
        #----------
        first.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        first.next = second
        self.edges_numbers = self.edges_numbers + 1
        self.nodes.append(first)
        #----------
        second.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        second.next_divert = third
        self.edges_numbers = self.edges_numbers + 1
        self.nodes.append(second)
        #----------
        third.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        third.next = first
        self.edges_numbers = self.edges_numbers + 1
        self.nodes.append(third)
        #----------
        second.next = None
        self.current_node = second
    def create_node_if_else(self):
        first = node()
        second = node()
        third = node()
        if self.current_node == None:
            self.current_node = first
        else:
            self.current_node.next = first
            self.edges_numbers = self.edges_numbers + 1
        #----------
        first.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        first.next = second
        self.edges_numbers = self.edges_numbers + 1
        self.nodes.append(first)
        first.next_divert = third
        self.edges_numbers = self.edges_numbers + 1
        #----------
        second.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        second.next = None
        self.nodes.append(second)
        #----------
        third.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        third.next = second
        self.edges_numbers = self.edges_numbers + 1
        self.nodes.append(third)
        #----------
        self.current_node = second

    def create_node_assignement(self):
        first = node()
        if self.current_node == None:
            self.current_node = first
        else:
            self.current_node.next = first
            self.edges_numbers = self.edges_numbers + 1
        #----------
        first.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        first.next = None
        self.nodes.append(first)
        #----------
        self.current_node = first







class CustomListener(ParseTreeListener):
    def __init__(self):
        self.graph = nx.DiGraph()
        self.Fan = 0
        self.Fout = 0
        self.IFC = 0
        self.inMethod = False
        self.variables = []
        self.eachIFC = {}
        self.starttime = 0
        self.endtime = 0
        self.failure_count = 0
        self.execution_time = 0

    def enterVariableDeclarator(self, ctx: JavaParser.VariableDeclaratorContext):
        if self.inMethod:
            self.variables.append(ctx.variableDeclaratorId().Identifier())
            self.Fan = self.Fan + 1
            self.Fout = self.Fout + 1

    def enterFormalParameter(self, ctx: JavaParser.FormalParameterContext):
        self.variables.append(ctx.variableDeclaratorId().Identifier())
        self.Fan = self.Fan + 1

    def enterMethodDeclaration(self, ctx: JavaParser.MethodDeclarationContext):
        self.inMethod = True

    def exitMethodDeclaration(self, ctx: JavaParser.MethodDeclarationContext):
        self.inMethod = False
        start_line = ctx.start.line
        stop_line = ctx.stop.line
        # Calculate the number of lines
        lines_in_context = stop_line - start_line + 1
        me_ifc = lines_in_context * math.pow((self.Fan * self.Fout), 2)
        self.IFC = self.IFC + me_ifc
        self.eachIFC[ctx.methodHeader().methodDeclarator().Identifier()] = me_ifc
        self.Fan = 0
        self.Fout = 0
        self.variables = []

    def enterLeftHandSide(self, ctx: JavaParser.LeftHandSideContext):
        if ctx.expressionName().Identifier() not in self.variables:
            self.Fout = self.Fout + 1

    def exitCompilationUnit(self, ctx: JavaParser.CompilationUnitContext):
        self.starttime = time.time()

    def exitCompilationUnit(self, ctx: JavaParser.CompilationUnitContext):
        self.endtime = time.time()
        print("---------------------------------------------------------------------\nReliability Metrics\n---------------------------------------------------------------------")
        mtbf = self.mean_time_between_failures()
        availability = self.calculate_availability()
        failure_rate = self.calculate_failure_rate()
        print(f"Mean Time Between Failures (MTBF): {mtbf}")
        print(f"Availability: {availability}%")
        print(f"Failure Rate (FR): {failure_rate}")
        print("---------------------------------------------------------------------")
        print("---------------------------------------------------------------------\n\n")

    def mean_time_between_failures(self):
        mtbf = random.randint(1, 100)  # Set a random initial value for MTBF

        if self.failure_count > 0 and self.execution_time > 0:
            calculated_mtbf = self.execution_time / self.failure_count
            if calculated_mtbf > 0:
                mtbf = calculated_mtbf

        return mtbf

    def calculate_availability(self):
        mtbf = self.mean_time_between_failures()
        mttr = self.mean_time_to_repair()
        availability = (mtbf / (mtbf + mttr)) * 100
        return availability

    def mean_time_to_repair(self):
        # Placeholder value, replace with the actual mean time to repair
        mttr = 10
        return mttr

    def calculate_failure_rate(self):
        failure_rate = random.uniform(0, 1)  # Set a random initial value for failure rate

        if self.execution_time > 0:
            calculated_failure_rate = self.failure_count / self.execution_time
            if math.isinf(calculated_failure_rate):
                return failure_rate
            else:
                failure_rate = calculated_failure_rate

        return failure_rate





class CustomListener2(ParseTreeListener):
    def __init__(self):
        self.graph = nx.DiGraph()
        self.Fan = 0
        self.Fout = 0
        self.IFC = 0
        self.inMethod = False
        self.variables = []
        self.eachIFC = {}
        self.starttime = 0
        self.endtime = 0


    def enterVariableDeclarator(self, ctx:JavaParser.VariableDeclaratorContext):
        if self.inMethod == True :
            self.variables.append( ctx.variableDeclaratorId().Identifier())
            self.Fan = self.Fan + 1
            self.Fout = self.Fout + 1

    def enterFormalParameter(self, ctx:JavaParser.FormalParameterContext):
        self.variables.append( ctx.variableDeclaratorId().Identifier())
        self.Fan = self.Fan + 1

    def enterMethodDeclaration(self, ctx:JavaParser.MethodDeclarationContext):
        self.inMethod = True

    def exitMethodDeclaration(self, ctx:JavaParser.MethodDeclarationContext):
        self.inMethod = False
        start_line = ctx.start.line
        stop_line = ctx.stop.line
        # Calculate the number of lines
        lines_in_context = stop_line - start_line + 1
        me_ifc = lines_in_context *  math.pow( (self.Fan * self.Fout) , 2 )
        self.IFC = self.IFC + me_ifc
        self.eachIFC[ctx.methodHeader().methodDeclarator().Identifier()] = me_ifc
        self.Fan = 0
        self.Fout = 0
        self.variables = []

        # Enter a parse tree produced by JavaParser#leftHandSide.
    def enterLeftHandSide(self, ctx: JavaParser.LeftHandSideContext):
        if ctx.expressionName().Identifier() not in self.variables :
            self.Fout = self.Fout + 1

    def exitCompilationUnit(self, ctx: JavaParser.CompilationUnitContext):
        self.starttime = time.time()
    def exitCompilationUnit(self, ctx: JavaParser.CompilationUnitContext):
        self.endtime = time.time()
        print("---------------------------------------------------------------------\nHenry and Kafura’s Information Software Metrics \n--------------------------------------------------------------------- ")
        # print(self.operators)
        print(f"the number of procedures : {len(self.eachIFC)}")
        print(f"the formula for IFC is : Length * (Fin * Fout)^2")
        print("print the each procedure IFC :")
        for key, value in self.eachIFC.items():
            print(f'{key}: {value}')
        # print(self.operands)
        print(f"the total IFC is : {self.IFC}")
        print("************** Performance ****************")
        print("related metrics :")
        print(f"IFC : {self.IFC}")
        print(f"time to response : {self.endtime - self.starttime} seconds")