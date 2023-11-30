# Generated from TypeChecker.g4 by ANTLR 4.13.1
from antlr4 import *
from Compiler_hw2.TypeCheckerListener import TypeCheckerListener
if "." in __name__:
    from .TypeCheckerParser import TypeCheckerParser
else:
    from TypeCheckerParser import TypeCheckerParser


# This class defines a complete listener for a parse tree produced by TypeCheckerParser.
# class TypeCheckerListener(ParseTreeListener):
class TypeCheckerListener_v2(TypeCheckerListener):

    def __init__(self):
        self.type = ""

    def Result(self):
        return self.type
        # print (self.type)

    # Enter a parse tree produced by TypeCheckerParser#start.
    def enterStart(self, ctx):
        pass

    # Exit a parse tree produced by TypeCheckerParser#start.
    def exitStart(self, ctx):
        print (self.type)
        # return self.type

        # pass


    # Enter a parse tree produced by TypeCheckerParser#expr3.
    def enterExpr3(self, ctx):
        pass

    # Exit a parse tree produced by TypeCheckerParser#expr3.
    def exitExpr3(self, ctx):
        ctx.type = ctx.getChild(0).type
        self.type = ctx.type
        # print (self.type)


    # Enter a parse tree produced by TypeCheckerParser#expr2.
    def enterExpr2(self, ctx):
        LType = ctx.getChild(0).type_
        RType = ctx.getChild(2).type_

        if LType == "Integer" and RType == "Integer":
            ctx.type = "Integer"
        elif LType == "Float" and RType == "Float":
            ctx.type = "Float"
        elif LType == "Integer" and RType == "Float":
            ctx.type = "Float"
        elif LType == "Float" and RType == "Integer":
            ctx.type = "Float"

        elif LType == "String" or RType == "String":
            raise Exception("Type error: String cannot be concatenated.")

        self.type = ctx.type_
        # print("Here 1", self.type)

    # Exit a parse tree produced by TypeCheckerParser#expr2.
    def exitExpr2(self, ctx):
        pass


    # Enter a parse tree produced by TypeCheckerParser#expr1.
    def enterExpr1(self, ctx):
        pass

    # Exit a parse tree produced by TypeCheckerParser#expr1.
    def exitExpr1(self, ctx):
        LType = ctx.getChild(0).type
        RType = ctx.getChild(2).type
        if LType == "Integer" and RType == "Integer":
            ctx.type = "Integer"
        elif LType == "Float" and RType == "Float":
            ctx.type = "Float"
        elif LType == "Integer" and RType == "Float":
            ctx.type = "Float"
        elif LType == "Float" and RType == "Integer":
            ctx.type = "Float"
        elif LType == "String" and RType == "Integer":
            ctx.type = "String"
        elif LType == "String" and RType == "Float":
            ctx.type = "String"
        elif LType == "String" and RType == "String":
            ctx.type = "String"


        elif LType == "Integer" and RType == "String":
            raise Exception("Type error: Integer and String can not be concatenated.")

        elif LType == "Float" and RType == "String":
            raise Exception("Type error: Float and String can not be concatenated.")

        # else:
        #     raise Exception("None")

        self.type = ctx.type
        # print("Here 2: ", self.type)


    # Enter a parse tree produced by TypeCheckerParser#term2.
    def enterTerm2(self, ctx):
        pass

    # Exit a parse tree produced by TypeCheckerParser#term2.
    def exitTerm2(self, ctx):
        left_type = ctx.getChild(0).type
        right_type = ctx.getChild(2).type

        if left_type == "Integer" and right_type == "Integer":
            ctx.type = "Float"
        elif left_type == "Float" and right_type == "Float":
            ctx.type = "Float"
        elif left_type == "Integer" and right_type == "Float":
            ctx.type = "Float"
        elif left_type == "Float" and right_type == "Integer":
            ctx.type = "Float"

        elif left_type == "String" or right_type == "String":
            raise Exception("Type error: String cannot be devided")
        else:
            raise Exception("None")

        self.type = ctx.type
        # print("Here 3", self.type)


    # Enter a parse tree produced by TypeCheckerParser#term3.
    def enterTerm3(self, ctx):
        pass

    # Exit a parse tree produced by TypeCheckerParser#term3.
    def exitTerm3(self, ctx):
        ctx.type = ctx.getChild(0).type
        self.type = ctx.type
        # print("Here 4" , self.type)


    # Enter a parse tree produced by TypeCheckerParser#term1.
    def enterTerm1(self, ctx):
        pass

    # Exit a parse tree produced by TypeCheckerParser#term1.
    def exitTerm1(self, ctx):
        left_type = ctx.getChild(0).type
        right_type = ctx.getChild(2).type

        if left_type == "Integer" and right_type == "Integer":
            ctx.type = "Integer"
        elif left_type == "Float" and right_type == "Float":
            ctx.type = "Float"
        elif left_type == "Integer" and right_type == "Float":
            ctx.type = "Float"
        elif left_type == "Float" and right_type == "Integer":
            ctx.type = "Float"

        elif left_type == "String" or right_type == "String":
            raise Exception("Type error: String cannot be multiplied")
        else:
            raise Exception("None")

        self.type = ctx.type
        # print("Here 5", self.type)


    # Enter a parse tree produced by TypeCheckerParser#factString.
    def enterFactString(self, ctx):
        pass

    # Exit a parse tree produced by TypeCheckerParser#factString.
    def exitFactString(self, ctx):
        ctx.type = "String"
        self.type = ctx.type
        # print("Here 6", self.type)


    # Enter a parse tree produced by TypeCheckerParser#factInteger.
    def enterFactInteger(self, ctx):
        pass

    # Exit a parse tree produced by TypeCheckerParser#factInteger.
    def exitFactInteger(self, ctx):
        ctx.type = "Integer"
        self.type = ctx.type
        # print("Here 7" , self.type)


    # Enter a parse tree produced by TypeCheckerParser#factFloat.
    def enterFactFloat(self, ctx):
        pass

    # Exit a parse tree produced by TypeCheckerParser#factFloat.
    def exitFactFloat(self, ctx):
        ctx.type = "Float"
        self.type = ctx.type
        # print("Here 8", self.type)

    # Enter a parse tree produced by TypeCheckerParser#factExpr.
    def enterFactExpr(self, ctx):
        pass

    # Exit a parse tree produced by TypeCheckerParser#factExpr.
    def exitFactExpr(self, ctx):
        ctx.type = ctx.getChild(1).type_
        self.type = ctx.type
        # print("Here 9",  self.type)
