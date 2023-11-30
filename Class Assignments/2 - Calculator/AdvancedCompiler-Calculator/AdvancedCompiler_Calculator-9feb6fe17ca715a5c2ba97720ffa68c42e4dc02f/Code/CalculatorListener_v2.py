from antlr4 import *
from Gen.ArithmeticLexer import ArithmeticLexer
from Gen.ArithmeticListener import ArithmeticListener
from Gen.ArithmeticParser import ArithmeticParser

class CalculatorListener(ArithmeticListener):

    def __init__(self):
        self.result = 0
    def exitExpr(self, ctx: ArithmeticParser.ExprContext):
        if ctx.getChildCount() == 1:
            self.result = ctx.getChild(0).value
            ctx.value = self.result
        else:
            result = ctx.getChild(0).value
            len = ctx.getChildCount() - 1
            for i in range(1, len, 2):
                op = ctx.getChild(i).getText()
                if (op == '+'):
                    value = ctx.getChild(i + 1).value
                    result = result + value
                elif (op == '-'):
                    value = ctx.getChild(i + 1).value
                    result = result - value
            self.result = result
            ctx.value = result

    def exitTerm(self, ctx:ArithmeticParser.TermContext):
        if ctx.getChildCount() == 1:
            self.result = ctx.getChild(0).value
            ctx.value = self.result
        else:
            result = ctx.getChild(0).value
            len = ctx.getChildCount() - 1

            for i in range(1, len, 2):
                op = ctx.getChild(i).getText()
                if (op == '*'):
                    value = ctx.getChild(i + 1).value
                    result = result * value
                elif (op == '/'):
                    value = ctx.getChild(i + 1).value
                    result = result / value
            self.result = result
            ctx.value = result

    def exitFactor(self, ctx:ArithmeticParser.FactorContext):
        if ctx.getChildCount() == 1:
             ctx.value = float(ctx.NUMBER().getText())
        else:
            ctx.value = ctx.getChild(1).value