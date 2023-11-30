# Generated from D:/Bahareh/7/Files/Compiler/pythonProject4/Chaloos_Otagh.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .Chaloos_OtaghParser import Chaloos_OtaghParser
else:
    from Chaloos_OtaghParser import Chaloos_OtaghParser

# This class defines a complete generic visitor for a parse tree produced by Chaloos_OtaghParser.

class Chaloos_OtaghVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by Chaloos_OtaghParser#program.
    def visitProgram(self, ctx:Chaloos_OtaghParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#statement.
    def visitStatement(self, ctx:Chaloos_OtaghParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#assignment.
    def visitAssignment(self, ctx:Chaloos_OtaghParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#variableDeclaration.
    def visitVariableDeclaration(self, ctx:Chaloos_OtaghParser.VariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#variableType.
    def visitVariableType(self, ctx:Chaloos_OtaghParser.VariableTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#variableName.
    def visitVariableName(self, ctx:Chaloos_OtaghParser.VariableNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#expression.
    def visitExpression(self, ctx:Chaloos_OtaghParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#additionExpression.
    def visitAdditionExpression(self, ctx:Chaloos_OtaghParser.AdditionExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#comparisonExpression.
    def visitComparisonExpression(self, ctx:Chaloos_OtaghParser.ComparisonExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#primaryExpression.
    def visitPrimaryExpression(self, ctx:Chaloos_OtaghParser.PrimaryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#comparisonOperator.
    def visitComparisonOperator(self, ctx:Chaloos_OtaghParser.ComparisonOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#booleanValue.
    def visitBooleanValue(self, ctx:Chaloos_OtaghParser.BooleanValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#ifStatement.
    def visitIfStatement(self, ctx:Chaloos_OtaghParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#whileStatement.
    def visitWhileStatement(self, ctx:Chaloos_OtaghParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#compoundStatement.
    def visitCompoundStatement(self, ctx:Chaloos_OtaghParser.CompoundStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Chaloos_OtaghParser#booleanCondition.
    def visitBooleanCondition(self, ctx:Chaloos_OtaghParser.BooleanConditionContext):
        return self.visitChildren(ctx)



del Chaloos_OtaghParser