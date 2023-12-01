# Generated from /Users/elhamgholami/PycharmProjects/HW2/TypeChecker.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .TypeCheckerParser import TypeCheckerParser
else:
    from TypeCheckerParser import TypeCheckerParser

# This class defines a complete listener for a parse tree produced by TypeCheckerParser.
class TypeCheckerListener(ParseTreeListener):
    def __int__(self):
        self.result = None

    # Exit a parse tree produced by TypeCheckerParser#start.
    def exitStart(self, ctx:TypeCheckerParser.StartContext):
        print("Expression Type:", ctx.expr().type)


    # Exit a parse tree produced by TypeCheckerParser#expr3.
    def exitExpr3(self, ctx:TypeCheckerParser.Expr3Context):
        ctx.type = ctx.term().type
        ctx.value = ctx.term().value
        self.result = ctx.value


    # Exit a parse tree produced by TypeCheckerParser#expr2.
    def exitExpr2(self, ctx:TypeCheckerParser.Expr2Context):
        if ctx.getChild(0).type == "String" or ctx.getChild(2).type == "String":
            raise Exception("TypeError: unsupported operand type(s) for -")
        elif ctx.getChild(0).type == "Float" or ctx.getChild(2).type == "Float":
            ctx.type = "Float"
        else:
            ctx.type = "Integer"
        ctx.value = ctx.getChild(0).value - ctx.getChild(2).value
        self.result = ctx.value

    # Exit a parse tree produced by TypeCheckerParser#expr1.
    def exitExpr1(self, ctx:TypeCheckerParser.Expr1Context):
        if ctx.getChild(0).type == "String":
            ctx.type = "String"
            ctx.value = ctx.getChild(0).value + str(ctx.getChild(2).value)
        elif ctx.getChild(2).type == "String":
            raise Exception("Type error: String cannot be concatenated to an Integer")
        elif ctx.getChild(0).type == "Float" or ctx.getChild(2).type == "Float":
            ctx.type = "Float"
            ctx.value = ctx.getChild(0).value + ctx.getChild(2).value
        else:
            ctx.type = "Integer"
            ctx.value = ctx.getChild(0).value + ctx.getChild(2).value
        self.result = ctx.value
   
    # Exit a parse tree produced by TypeCheckerParser#term2.
    def exitTerm2(self, ctx:TypeCheckerParser.Term2Context):
        if ctx.getChild(0).type == "String" or ctx.getChild(2).type == "String":
            raise Exception("Type Error: String cannot be divided")
        else:
            ctx.type = "Float"
        ctx.value = ctx.getChild(0).value / ctx.getChild(2).value
        self.result = ctx.value


    # Exit a parse tree produced by TypeCheckerParser#term3.
    def exitTerm3(self, ctx:TypeCheckerParser.Term3Context):
        ctx.type = ctx.getChild(0).type
        ctx.value = ctx.getChild(0).value
        self.result = ctx.value



    # Exit a parse tree produced by TypeCheckerParser#term1.
    def exitTerm1(self, ctx:TypeCheckerParser.Term1Context):
        if ctx.getChild(0).type == "String" or ctx.getChild(2).type == "String":
            raise  Exception("Type Error: String cannot be multiplied")
        elif ctx.getChild(0).type == "Float" or ctx.getChild(2).type == "Float":
            ctx.type = "Float"
        else:
            ctx.type = "Integer"
        ctx.value = ctx.getChild(0).value * ctx.getChild(2).value
        self.result = ctx.value


    # Exit a parse tree produced by TypeCheckerParser#factString.
    def exitFactString(self, ctx:TypeCheckerParser.FactStringContext):
        ctx.type = "String"
        ctx.value = ctx.getText().strip("\"")
        self.result = ctx.value

    
    # Exit a parse tree produced by TypeCheckerParser#factInteger.
    def exitFactInteger(self, ctx:TypeCheckerParser.FactIntegerContext):
        ctx.type = "Integer"
        ctx.value = int(ctx.getText())
        self.result = ctx.value
   
    # Exit a parse tree produced by TypeCheckerParser#factFloat.
    def exitFactFloat(self, ctx:TypeCheckerParser.FactFloatContext):
        ctx.type = "Float"
        ctx.value = float(ctx.getText())
        self.result = ctx.value


    # Exit a parse tree produced by TypeCheckerParser#factExpr.
    def exitFactExpr(self, ctx:TypeCheckerParser.FactExprContext):
        ctx.type = ctx.getChild(1).type
        ctx.value = ctx.getChild(1).value
        self.result = ctx.value


del TypeCheckerParser
