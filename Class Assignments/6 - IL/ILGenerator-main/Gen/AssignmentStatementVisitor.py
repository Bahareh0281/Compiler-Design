# Generated from C:/PHD/ILGenerator/AssignmentStatement.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .AssignmentStatementParser import AssignmentStatementParser
else:
    from AssignmentStatementParser import AssignmentStatementParser

# This class defines a complete generic visitor for a parse tree produced by AssignmentStatementParser.

class AssignmentStatementVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by AssignmentStatementParser#start.
    def visitStart(self, ctx:AssignmentStatementParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#prog.
    def visitProg(self, ctx:AssignmentStatementParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#declaration.
    def visitDeclaration(self, ctx:AssignmentStatementParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#variable_declaration.
    def visitVariable_declaration(self, ctx:AssignmentStatementParser.Variable_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#type.
    def visitType(self, ctx:AssignmentStatementParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#compoundst.
    def visitCompoundst(self, ctx:AssignmentStatementParser.CompoundstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#statement.
    def visitStatement(self, ctx:AssignmentStatementParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#ifst.
    def visitIfst(self, ctx:AssignmentStatementParser.IfstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#whilest.
    def visitWhilest(self, ctx:AssignmentStatementParser.WhilestContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#switchst.
    def visitSwitchst(self, ctx:AssignmentStatementParser.SwitchstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#case.
    def visitCase(self, ctx:AssignmentStatementParser.CaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#forst.
    def visitForst(self, ctx:AssignmentStatementParser.ForstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#cond.
    def visitCond(self, ctx:AssignmentStatementParser.CondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#assign.
    def visitAssign(self, ctx:AssignmentStatementParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#ternary.
    def visitTernary(self, ctx:AssignmentStatementParser.TernaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#expr_term_minus.
    def visitExpr_term_minus(self, ctx:AssignmentStatementParser.Expr_term_minusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#expr_term_plus.
    def visitExpr_term_plus(self, ctx:AssignmentStatementParser.Expr_term_plusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#term4.
    def visitTerm4(self, ctx:AssignmentStatementParser.Term4Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#expr_term_relop.
    def visitExpr_term_relop(self, ctx:AssignmentStatementParser.Expr_term_relopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#term_fact_divide.
    def visitTerm_fact_divide(self, ctx:AssignmentStatementParser.Term_fact_divideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#term_fact_mutiply.
    def visitTerm_fact_mutiply(self, ctx:AssignmentStatementParser.Term_fact_mutiplyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#factor3.
    def visitFactor3(self, ctx:AssignmentStatementParser.Factor3Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#fact_expr.
    def visitFact_expr(self, ctx:AssignmentStatementParser.Fact_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#fact_id.
    def visitFact_id(self, ctx:AssignmentStatementParser.Fact_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#fact_number.
    def visitFact_number(self, ctx:AssignmentStatementParser.Fact_numberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#fact_array.
    def visitFact_array(self, ctx:AssignmentStatementParser.Fact_arrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#number_float.
    def visitNumber_float(self, ctx:AssignmentStatementParser.Number_floatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#number_int.
    def visitNumber_int(self, ctx:AssignmentStatementParser.Number_intContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#array_int.
    def visitArray_int(self, ctx:AssignmentStatementParser.Array_intContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#array_float.
    def visitArray_float(self, ctx:AssignmentStatementParser.Array_floatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AssignmentStatementParser#array_string.
    def visitArray_string(self, ctx:AssignmentStatementParser.Array_stringContext):
        return self.visitChildren(ctx)



del AssignmentStatementParser