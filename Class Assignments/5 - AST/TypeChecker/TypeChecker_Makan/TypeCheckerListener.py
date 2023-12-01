# Generated from C:/Users/Administrator/PycharmProjects/HW2/TypeChecker.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .TypeCheckerParser import TypeCheckerParser
else:
    from TypeCheckerParser import TypeCheckerParser

# This class defines a complete listener for a parse tree produced by TypeCheckerParser.

    # This class defines a complete listener for a parse tree produced by TypeCheckerParser.
class TypeCheckerListener(ParseTreeListener):
    # Enter a parse tree produced by TypeCheckerParser#start.
    def exitExpr(self, ctx: TypeCheckerParser.ExprContext):
        if ctx.getChildCount() == 1:
            ctx.type = ctx.getChild(0).type
        else:
            op = ctx.getChild(1).getText()
            if op == "+":
                if ctx.getChild(0).type == "INTEGER" and ctx.getChild(2).type == "INTEGER":
                    ctx.type = "INTEGER"

                elif ctx.getChild(0).type == "STRING":
                    ctx.type = "STRING"

                elif ctx.getChild(2).type == "STRING":
                    ctx.type = "Type error: String cannot be concatenated to an Integer"

                else:
                    ctx.type = "FLOAT"

            if op == "-":
                if ctx.getChild(0).type == "INTEGER" and ctx.getChild(2).type == "INTEGER":
                    ctx.type = "INTEGER"

                elif ctx.getChild(0).type == "STRING":
                    ctx.type = "ERROR"

    def exitTerm(self, ctx: TypeCheckerParser.TermContext):
        if ctx.getChildCount() == 1:
            ctx.type = ctx.getChild(0).type
        else:
            op = ctx.getChild(1).getText()
            if ctx.getChild(0).type == "STRING" or ctx.getChild(2).type == "STRING":
                if op == "/":
                    ctx.type = "Type error: String cannot be divided"
                else:
                    ctx.type = "Type error: String cannot be multiplied"
            else:
                if op == "*" and ctx.getChild(0).type == "INTEGER" and ctx.getChild(2).type == "INTEGER":
                    ctx.type = "INTEGER"
                else:
                    ctx.type = "FLOAT"
# Enter a parse tree produced by TypeCheckerParser#factString.
    def enterFactString(self, ctx:TypeCheckerParser.FactStringContext):
        pass

    # Exit a parse tree produced by TypeCheckerParser#factString.
    def exitFactString(self, ctx:TypeCheckerParser.FactStringContext):
        ctx.type = "STRING"


    # Enter a parse tree produced by TypeCheckerParser#factInteger.
    def enterFactInteger(self, ctx:TypeCheckerParser.FactIntegerContext):
        pass

    # Exit a parse tree produced by TypeCheckerParser#factInteger.
    def exitFactInteger(self, ctx:TypeCheckerParser.FactIntegerContext):
        ctx.type = "INTEGER"


    # Enter a parse tree produced by TypeCheckerParser#factFloat.
    def enterFactFloat(self, ctx:TypeCheckerParser.FactFloatContext):
        pass

    # Exit a parse tree produced by TypeCheckerParser#factFloat.
    def exitFactFloat(self, ctx:TypeCheckerParser.FactFloatContext):
        ctx.type = "FLOAT"


    # Enter a parse tree produced by TypeCheckerParser#factExpr.
    def enterFactExpr(self, ctx:TypeCheckerParser.FactExprContext):
        pass

    # Exit a parse tree produced by TypeCheckerParser#factExpr.
    def exitFactExpr(self, ctx:TypeCheckerParser.FactExprContext):
        ctx.type = ctx.getChild(1).type

    def exitStart(self, ctx: TypeCheckerParser.StartContext):
        print("Overall type:", ctx.getChild(0).type)



del TypeCheckerParser