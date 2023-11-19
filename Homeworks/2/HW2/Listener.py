from gen.JavaParserListener import JavaParserListener
class VariableListener(JavaParserListener):
    def enterLocalVariableDeclaration(self, ctx):
        variable_declarator_list = ctx.variableDeclaratorList()
        variable_type = self.get_type(ctx)
        line_number = ctx.start.line

        for variable_declarator in variable_declarator_list.variableDeclarator():
            variable_name = variable_declarator.variableDeclaratorId().getText()
            print(f"Line {line_number}: {variable_type} - name: {variable_name}")

    def get_type(self, ctx):
        type_context = ctx.parentCtx.getChild(0).getChild(0)
        return type_context.getText()