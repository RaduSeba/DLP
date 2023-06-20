// Generated from C:/Users/Seba/DLP/DLP23/src/parser\Pmm.g4 by ANTLR 4.12.0
package parser;

    import ast.expresions.*;
    import ast.*;
    import ast.definitions.*;
    import ast.statements.*;
    import ast.types.*;
    import errorhandler.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(PmmParser.DefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#function_call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression(PmmParser.Function_call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(PmmParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(PmmParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_statement(PmmParser.Function_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(PmmParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PmmParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(PmmParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PmmParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(PmmParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(PmmParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PmmParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(PmmParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(PmmParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#simple_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_def(PmmParser.Simple_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#assign_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_def(PmmParser.Assign_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#multi_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_def(PmmParser.Multi_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(PmmParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(PmmParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PmmParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#main_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_def(PmmParser.Main_defContext ctx);
}