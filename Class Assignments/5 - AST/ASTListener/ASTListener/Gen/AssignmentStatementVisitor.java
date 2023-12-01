// Generated from D:/Bahareh/7/Files/Compiler/Git/Compiler-Design/Class Assignments/5 - AST/ASTListener/ASTListener/AssignmentStatement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssignmentStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssignmentStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AssignmentStatementParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(AssignmentStatementParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AssignmentStatementParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(AssignmentStatementParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AssignmentStatementParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#compoundst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundst(AssignmentStatementParser.CompoundstContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AssignmentStatementParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#ifst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfst(AssignmentStatementParser.IfstContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#forst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForst(AssignmentStatementParser.ForstContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#whilest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilest(AssignmentStatementParser.WhilestContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#switchcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchcase(AssignmentStatementParser.SwitchcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(AssignmentStatementParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStatementParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(AssignmentStatementParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_term_minus}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_term_minus(AssignmentStatementParser.Expr_term_minusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_term_plus}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_term_plus(AssignmentStatementParser.Expr_term_plusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term4}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm4(AssignmentStatementParser.Term4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_term_relop}
	 * labeled alternative in {@link AssignmentStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_term_relop(AssignmentStatementParser.Expr_term_relopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_fact_divide}
	 * labeled alternative in {@link AssignmentStatementParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_fact_divide(AssignmentStatementParser.Term_fact_divideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_fact_mutiply}
	 * labeled alternative in {@link AssignmentStatementParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_fact_mutiply(AssignmentStatementParser.Term_fact_mutiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor3}
	 * labeled alternative in {@link AssignmentStatementParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor3(AssignmentStatementParser.Factor3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fact_expr}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact_expr(AssignmentStatementParser.Fact_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fact_id}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact_id(AssignmentStatementParser.Fact_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fact_number}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact_number(AssignmentStatementParser.Fact_numberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fact_array}
	 * labeled alternative in {@link AssignmentStatementParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact_array(AssignmentStatementParser.Fact_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number_float}
	 * labeled alternative in {@link AssignmentStatementParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_float(AssignmentStatementParser.Number_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number_int}
	 * labeled alternative in {@link AssignmentStatementParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_int(AssignmentStatementParser.Number_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_int}
	 * labeled alternative in {@link AssignmentStatementParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_int(AssignmentStatementParser.Array_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_float}
	 * labeled alternative in {@link AssignmentStatementParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_float(AssignmentStatementParser.Array_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_string}
	 * labeled alternative in {@link AssignmentStatementParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_string(AssignmentStatementParser.Array_stringContext ctx);
}