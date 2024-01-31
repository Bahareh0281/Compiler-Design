# Generated from D:/Bahareh/7/Files/Compiler/Git/Compiler-Design/Homeworks/pythonProject/JavaLike.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .JavaLikeParser import JavaLikeParser
else:
    from JavaLikeParser import JavaLikeParser

# This class defines a complete generic visitor for a parse tree produced by JavaLikeParser.

class JavaLikeVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by JavaLikeParser#program.
    def visitProgram(self, ctx:JavaLikeParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#classDef.
    def visitClassDef(self, ctx:JavaLikeParser.ClassDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#classMember.
    def visitClassMember(self, ctx:JavaLikeParser.ClassMemberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#fieldDecl.
    def visitFieldDecl(self, ctx:JavaLikeParser.FieldDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#methodDecl.
    def visitMethodDecl(self, ctx:JavaLikeParser.MethodDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#paramList.
    def visitParamList(self, ctx:JavaLikeParser.ParamListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#paramDecl.
    def visitParamDecl(self, ctx:JavaLikeParser.ParamDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#typeVar.
    def visitTypeVar(self, ctx:JavaLikeParser.TypeVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#block.
    def visitBlock(self, ctx:JavaLikeParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#statement.
    def visitStatement(self, ctx:JavaLikeParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#expressionStmt.
    def visitExpressionStmt(self, ctx:JavaLikeParser.ExpressionStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#selectionStmt.
    def visitSelectionStmt(self, ctx:JavaLikeParser.SelectionStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#iterationStmt.
    def visitIterationStmt(self, ctx:JavaLikeParser.IterationStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#expr.
    def visitExpr(self, ctx:JavaLikeParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#op.
    def visitOp(self, ctx:JavaLikeParser.OpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#intLiteral.
    def visitIntLiteral(self, ctx:JavaLikeParser.IntLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaLikeParser#boolLiteral.
    def visitBoolLiteral(self, ctx:JavaLikeParser.BoolLiteralContext):
        return self.visitChildren(ctx)



del JavaLikeParser