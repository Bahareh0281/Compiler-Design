// Generated from c://Users//Vahid//Desktop//Dev//compiler//ASTListener//AssignmentStatement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssignmentStatementParser}.
 */
public interface AssignmentStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AssignmentStatementParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AssignmentStatementParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AssignmentStatementParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AssignmentStatementParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AssignmentStatementParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AssignmentStatementParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(AssignmentStatementParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(AssignmentStatementParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AssignmentStatementParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AssignmentStatementParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#compoundst}.
	 * @param ctx the parse tree
	 */
	void enterCompoundst(AssignmentStatementParser.CompoundstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#compoundst}.
	 * @param ctx the parse tree
	 */
	void exitCompoundst(AssignmentStatementParser.CompoundstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AssignmentStatementParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AssignmentStatementParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#ifst}.
	 * @param ctx the parse tree
	 */
	void enterIfst(AssignmentStatementParser.IfstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#ifst}.
	 * @param ctx the parse tree
	 */
	void exitIfst(AssignmentStatementParser.IfstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#whilest}.
	 * @param ctx the parse tree
	 */
	void enterWhilest(AssignmentStatementParser.WhilestContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#whilest}.
	 * @param ctx the parse tree
	 */
	void exitWhilest(AssignmentStatementParser.WhilestContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#forst}.
	 * @param ctx the parse tree
	 */
	void enterForst(AssignmentStatementParser.ForstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#forst}.
	 * @param ctx the parse tree
	 */
	void exitForst(AssignmentStatementParser.ForstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(AssignmentStatementParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(AssignmentStatementParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStatementParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(AssignmentStatementParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStatementParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(AssignmentStatementParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_term_minus}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_term_minus(AssignmentStatementParser.Expr_term_minusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_term_minus}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_term_minus(AssignmentStatementParser.Expr_term_minusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_term_plus}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_term_plus(AssignmentStatementParser.Expr_term_plusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_term_plus}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_term_plus(AssignmentStatementParser.Expr_term_plusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term4}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTerm4(AssignmentStatementParser.Term4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code term4}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTerm4(AssignmentStatementParser.Term4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_term_relop}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_term_relop(AssignmentStatementParser.Expr_term_relopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_term_relop}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_term_relop(AssignmentStatementParser.Expr_term_relopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_fact_divide}
	 * labeled alternative in {@link AssignmentStatementParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_fact_divide(AssignmentStatementParser.Term_fact_divideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_fact_divide}
	 * labeled alternative in {@link AssignmentStatementParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_fact_divide(AssignmentStatementParser.Term_fact_divideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_fact_mutiply}
	 * labeled alternative in {@link AssignmentStatementParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_fact_mutiply(AssignmentStatementParser.Term_fact_mutiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_fact_mutiply}
	 * labeled alternative in {@link AssignmentStatementParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_fact_mutiply(AssignmentStatementParser.Term_fact_mutiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor3}
	 * labeled alternative in {@link AssignmentStatementParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactor3(AssignmentStatementParser.Factor3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code factor3}
	 * labeled alternative in {@link AssignmentStatementParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactor3(AssignmentStatementParser.Factor3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code fact_expr}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFact_expr(AssignmentStatementParser.Fact_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fact_expr}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFact_expr(AssignmentStatementParser.Fact_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fact_id}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFact_id(AssignmentStatementParser.Fact_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fact_id}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFact_id(AssignmentStatementParser.Fact_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fact_number}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFact_number(AssignmentStatementParser.Fact_numberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fact_number}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFact_number(AssignmentStatementParser.Fact_numberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fact_array}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFact_array(AssignmentStatementParser.Fact_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fact_array}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFact_array(AssignmentStatementParser.Fact_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number_float}
	 * labeled alternative in {@link AssignmentStatementParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber_float(AssignmentStatementParser.Number_floatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number_float}
	 * labeled alternative in {@link AssignmentStatementParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber_float(AssignmentStatementParser.Number_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number_int}
	 * labeled alternative in {@link AssignmentStatementParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber_int(AssignmentStatementParser.Number_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number_int}
	 * labeled alternative in {@link AssignmentStatementParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber_int(AssignmentStatementParser.Number_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_int}
	 * labeled alternative in {@link AssignmentStatementParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray_int(AssignmentStatementParser.Array_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_int}
	 * labeled alternative in {@link AssignmentStatementParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray_int(AssignmentStatementParser.Array_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_float}
	 * labeled alternative in {@link AssignmentStatementParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray_float(AssignmentStatementParser.Array_floatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_float}
	 * labeled alternative in {@link AssignmentStatementParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray_float(AssignmentStatementParser.Array_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_string}
	 * labeled alternative in {@link AssignmentStatementParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray_string(AssignmentStatementParser.Array_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_string}
	 * labeled alternative in {@link AssignmentStatementParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray_string(AssignmentStatementParser.Array_stringContext ctx);
}