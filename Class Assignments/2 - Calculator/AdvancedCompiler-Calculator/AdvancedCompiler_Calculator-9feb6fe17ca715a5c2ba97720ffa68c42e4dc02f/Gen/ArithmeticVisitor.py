# Generated from E:/AIDA/PythonProject/TestAntlr/Arithmetic.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ArithmeticParser import ArithmeticParser
else:
    from ArithmeticParser import ArithmeticParser

# This class defines a complete generic visitor for a parse tree produced by ArithmeticParser.

class ArithmeticVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ArithmeticParser#start.
    def visitStart(self, ctx:ArithmeticParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArithmeticParser#expr.
    def visitExpr(self, ctx:ArithmeticParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArithmeticParser#term.
    def visitTerm(self, ctx:ArithmeticParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArithmeticParser#factor.
    def visitFactor(self, ctx:ArithmeticParser.FactorContext):
        return self.visitChildren(ctx)



del ArithmeticParser