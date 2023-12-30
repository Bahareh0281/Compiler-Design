# Generated from C:/PHD/ILGenerator/AssignmentStatement.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .AssignmentStatementParser import AssignmentStatementParser
else:
    from AssignmentStatementParser import AssignmentStatementParser

# This class defines a complete listener for a parse tree produced by AssignmentStatementParser.
class AssignmentStatementListener(ParseTreeListener):

    # Enter a parse tree produced by AssignmentStatementParser#start.
    def enterStart(self, ctx:AssignmentStatementParser.StartContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#start.
    def exitStart(self, ctx:AssignmentStatementParser.StartContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#prog.
    def enterProg(self, ctx:AssignmentStatementParser.ProgContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#prog.
    def exitProg(self, ctx:AssignmentStatementParser.ProgContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#declaration.
    def enterDeclaration(self, ctx:AssignmentStatementParser.DeclarationContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#declaration.
    def exitDeclaration(self, ctx:AssignmentStatementParser.DeclarationContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#variable_declaration.
    def enterVariable_declaration(self, ctx:AssignmentStatementParser.Variable_declarationContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#variable_declaration.
    def exitVariable_declaration(self, ctx:AssignmentStatementParser.Variable_declarationContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#type.
    def enterType(self, ctx:AssignmentStatementParser.TypeContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#type.
    def exitType(self, ctx:AssignmentStatementParser.TypeContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#compoundst.
    def enterCompoundst(self, ctx:AssignmentStatementParser.CompoundstContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#compoundst.
    def exitCompoundst(self, ctx:AssignmentStatementParser.CompoundstContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#statement.
    def enterStatement(self, ctx:AssignmentStatementParser.StatementContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#statement.
    def exitStatement(self, ctx:AssignmentStatementParser.StatementContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#ifst.
    def enterIfst(self, ctx:AssignmentStatementParser.IfstContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#ifst.
    def exitIfst(self, ctx:AssignmentStatementParser.IfstContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#whilest.
    def enterWhilest(self, ctx:AssignmentStatementParser.WhilestContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#whilest.
    def exitWhilest(self, ctx:AssignmentStatementParser.WhilestContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#switchst.
    def enterSwitchst(self, ctx:AssignmentStatementParser.SwitchstContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#switchst.
    def exitSwitchst(self, ctx:AssignmentStatementParser.SwitchstContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#case.
    def enterCase(self, ctx:AssignmentStatementParser.CaseContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#case.
    def exitCase(self, ctx:AssignmentStatementParser.CaseContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#forst.
    def enterForst(self, ctx:AssignmentStatementParser.ForstContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#forst.
    def exitForst(self, ctx:AssignmentStatementParser.ForstContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#cond.
    def enterCond(self, ctx:AssignmentStatementParser.CondContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#cond.
    def exitCond(self, ctx:AssignmentStatementParser.CondContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#assign.
    def enterAssign(self, ctx:AssignmentStatementParser.AssignContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#assign.
    def exitAssign(self, ctx:AssignmentStatementParser.AssignContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#ternary.
    def enterTernary(self, ctx:AssignmentStatementParser.TernaryContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#ternary.
    def exitTernary(self, ctx:AssignmentStatementParser.TernaryContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#expr_term_minus.
    def enterExpr_term_minus(self, ctx:AssignmentStatementParser.Expr_term_minusContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#expr_term_minus.
    def exitExpr_term_minus(self, ctx:AssignmentStatementParser.Expr_term_minusContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#expr_term_plus.
    def enterExpr_term_plus(self, ctx:AssignmentStatementParser.Expr_term_plusContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#expr_term_plus.
    def exitExpr_term_plus(self, ctx:AssignmentStatementParser.Expr_term_plusContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#term4.
    def enterTerm4(self, ctx:AssignmentStatementParser.Term4Context):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#term4.
    def exitTerm4(self, ctx:AssignmentStatementParser.Term4Context):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#expr_term_relop.
    def enterExpr_term_relop(self, ctx:AssignmentStatementParser.Expr_term_relopContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#expr_term_relop.
    def exitExpr_term_relop(self, ctx:AssignmentStatementParser.Expr_term_relopContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#term_fact_divide.
    def enterTerm_fact_divide(self, ctx:AssignmentStatementParser.Term_fact_divideContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#term_fact_divide.
    def exitTerm_fact_divide(self, ctx:AssignmentStatementParser.Term_fact_divideContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#term_fact_mutiply.
    def enterTerm_fact_mutiply(self, ctx:AssignmentStatementParser.Term_fact_mutiplyContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#term_fact_mutiply.
    def exitTerm_fact_mutiply(self, ctx:AssignmentStatementParser.Term_fact_mutiplyContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#factor3.
    def enterFactor3(self, ctx:AssignmentStatementParser.Factor3Context):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#factor3.
    def exitFactor3(self, ctx:AssignmentStatementParser.Factor3Context):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#fact_expr.
    def enterFact_expr(self, ctx:AssignmentStatementParser.Fact_exprContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#fact_expr.
    def exitFact_expr(self, ctx:AssignmentStatementParser.Fact_exprContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#fact_id.
    def enterFact_id(self, ctx:AssignmentStatementParser.Fact_idContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#fact_id.
    def exitFact_id(self, ctx:AssignmentStatementParser.Fact_idContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#fact_number.
    def enterFact_number(self, ctx:AssignmentStatementParser.Fact_numberContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#fact_number.
    def exitFact_number(self, ctx:AssignmentStatementParser.Fact_numberContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#fact_array.
    def enterFact_array(self, ctx:AssignmentStatementParser.Fact_arrayContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#fact_array.
    def exitFact_array(self, ctx:AssignmentStatementParser.Fact_arrayContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#number_float.
    def enterNumber_float(self, ctx:AssignmentStatementParser.Number_floatContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#number_float.
    def exitNumber_float(self, ctx:AssignmentStatementParser.Number_floatContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#number_int.
    def enterNumber_int(self, ctx:AssignmentStatementParser.Number_intContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#number_int.
    def exitNumber_int(self, ctx:AssignmentStatementParser.Number_intContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#array_int.
    def enterArray_int(self, ctx:AssignmentStatementParser.Array_intContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#array_int.
    def exitArray_int(self, ctx:AssignmentStatementParser.Array_intContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#array_float.
    def enterArray_float(self, ctx:AssignmentStatementParser.Array_floatContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#array_float.
    def exitArray_float(self, ctx:AssignmentStatementParser.Array_floatContext):
        pass


    # Enter a parse tree produced by AssignmentStatementParser#array_string.
    def enterArray_string(self, ctx:AssignmentStatementParser.Array_stringContext):
        pass

    # Exit a parse tree produced by AssignmentStatementParser#array_string.
    def exitArray_string(self, ctx:AssignmentStatementParser.Array_stringContext):
        pass



del AssignmentStatementParser