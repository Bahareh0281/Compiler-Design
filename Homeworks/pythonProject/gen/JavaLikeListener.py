# Generated from D:/Bahareh/7/Files/Compiler/Git/Compiler-Design/Homeworks/pythonProject/JavaLike.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .JavaLikeParser import JavaLikeParser
else:
    from JavaLikeParser import JavaLikeParser

# This class defines a complete listener for a parse tree produced by JavaLikeParser.
class JavaLikeListener(ParseTreeListener):

    # Enter a parse tree produced by JavaLikeParser#program.
    def enterProgram(self, ctx:JavaLikeParser.ProgramContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#program.
    def exitProgram(self, ctx:JavaLikeParser.ProgramContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#classDef.
    def enterClassDef(self, ctx:JavaLikeParser.ClassDefContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#classDef.
    def exitClassDef(self, ctx:JavaLikeParser.ClassDefContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#classMember.
    def enterClassMember(self, ctx:JavaLikeParser.ClassMemberContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#classMember.
    def exitClassMember(self, ctx:JavaLikeParser.ClassMemberContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#fieldDecl.
    def enterFieldDecl(self, ctx:JavaLikeParser.FieldDeclContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#fieldDecl.
    def exitFieldDecl(self, ctx:JavaLikeParser.FieldDeclContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#methodDecl.
    def enterMethodDecl(self, ctx:JavaLikeParser.MethodDeclContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#methodDecl.
    def exitMethodDecl(self, ctx:JavaLikeParser.MethodDeclContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#paramList.
    def enterParamList(self, ctx:JavaLikeParser.ParamListContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#paramList.
    def exitParamList(self, ctx:JavaLikeParser.ParamListContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#paramDecl.
    def enterParamDecl(self, ctx:JavaLikeParser.ParamDeclContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#paramDecl.
    def exitParamDecl(self, ctx:JavaLikeParser.ParamDeclContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#typeVar.
    def enterTypeVar(self, ctx:JavaLikeParser.TypeVarContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#typeVar.
    def exitTypeVar(self, ctx:JavaLikeParser.TypeVarContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#block.
    def enterBlock(self, ctx:JavaLikeParser.BlockContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#block.
    def exitBlock(self, ctx:JavaLikeParser.BlockContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#statement.
    def enterStatement(self, ctx:JavaLikeParser.StatementContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#statement.
    def exitStatement(self, ctx:JavaLikeParser.StatementContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#expressionStmt.
    def enterExpressionStmt(self, ctx:JavaLikeParser.ExpressionStmtContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#expressionStmt.
    def exitExpressionStmt(self, ctx:JavaLikeParser.ExpressionStmtContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#selectionStmt.
    def enterSelectionStmt(self, ctx:JavaLikeParser.SelectionStmtContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#selectionStmt.
    def exitSelectionStmt(self, ctx:JavaLikeParser.SelectionStmtContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#iterationStmt.
    def enterIterationStmt(self, ctx:JavaLikeParser.IterationStmtContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#iterationStmt.
    def exitIterationStmt(self, ctx:JavaLikeParser.IterationStmtContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#expr.
    def enterExpr(self, ctx:JavaLikeParser.ExprContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#expr.
    def exitExpr(self, ctx:JavaLikeParser.ExprContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#op.
    def enterOp(self, ctx:JavaLikeParser.OpContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#op.
    def exitOp(self, ctx:JavaLikeParser.OpContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#intLiteral.
    def enterIntLiteral(self, ctx:JavaLikeParser.IntLiteralContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#intLiteral.
    def exitIntLiteral(self, ctx:JavaLikeParser.IntLiteralContext):
        pass


    # Enter a parse tree produced by JavaLikeParser#boolLiteral.
    def enterBoolLiteral(self, ctx:JavaLikeParser.BoolLiteralContext):
        pass

    # Exit a parse tree produced by JavaLikeParser#boolLiteral.
    def exitBoolLiteral(self, ctx:JavaLikeParser.BoolLiteralContext):
        pass



del JavaLikeParser