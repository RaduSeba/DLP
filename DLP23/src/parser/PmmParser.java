// Generated from C:/Users/Seba/DLP/DLP23/src/parser\Pmm.g4 by ANTLR 4.12.0
package parser;

    import ast.expresions.*;
    import ast.*;
    import ast.definitions.*;
    import ast.statements.*;
    import ast.types.*;
    import errorhandler.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_CONSTANT=38, 
		REAL_CONSTANT=39, CHAR_CONSTANT=40, ID=41, COMMENTEND=42, COMMENT=43, 
		TRASH=44;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_expression = 2, RULE_function_call_expression = 3, 
		RULE_expressions = 4, RULE_type = 5, RULE_field = 6, RULE_statement = 7, 
		RULE_function_call_statement = 8, RULE_arguments = 9, RULE_if_statement = 10, 
		RULE_else_statement = 11, RULE_body = 12, RULE_return_statement = 13, 
		RULE_input = 14, RULE_print = 15, RULE_while = 16, RULE_assignation = 17, 
		RULE_simple_def = 18, RULE_multi_def = 19, RULE_var_def = 20, RULE_func_def = 21, 
		RULE_parameters = 22, RULE_main_def = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "expression", "function_call_expression", "expressions", 
			"type", "field", "statement", "function_call_statement", "arguments", 
			"if_statement", "else_statement", "body", "return_statement", "input", 
			"print", "while", "assignation", "simple_def", "multi_def", "var_def", 
			"func_def", "parameters", "main_def"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "';'", "'}'", "'['", 
			"']'", "'.'", "'!'", "'-'", "'*'", "'/'", "'%'", "'+'", "'&&'", "'||'", 
			"'>='", "'=='", "'>'", "'<'", "'<='", "'!='", "','", "'char'", "'int'", 
			"'double'", "'struct'", "'if'", "'else'", "'return'", "'input'", "'print'", 
			"'while'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID", "COMMENTEND", 
			"COMMENT", "TRASH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public DefinitionsContext definitions;
		public Token D;
		public Var_defContext v1;
		public StatementContext statement;
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			List<Definition> defs=new ArrayList<Definition>();
			setState(49);
			((ProgramContext)_localctx).definitions = definitions();
			defs.addAll(((ProgramContext)_localctx).definitions.ast);
			setState(51);
			((ProgramContext)_localctx).D = match(T__0);
			setState(52);
			match(T__1);
			setState(53);
			match(T__2);
			setState(54);
			match(T__3);
			setState(55);
			match(T__4);
			setState(56);
			match(T__5);
			List<Definition> def=new ArrayList<Definition>();
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					((ProgramContext)_localctx).v1 = var_def();
					def.addAll(((ProgramContext)_localctx).v1.ast);
					setState(60);
					match(T__6);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			List<Statement> sts=new ArrayList<Statement>();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4254165118984L) != 0)) {
				{
				{
				setState(68);
				((ProgramContext)_localctx).statement = statement();
				sts.add(((ProgramContext)_localctx).statement.ast);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__7);
			setState(77);
			match(EOF);
			defs.add(new FuncDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, "main",new FunctionType(((ProgramContext)_localctx).D.getLine(),((ProgramContext)_localctx).D.getCharPositionInLine()+1,new VoidType(((ProgramContext)_localctx).D.getLine(),((ProgramContext)_localctx).D.getCharPositionInLine()+1),new ArrayList<Definition>()),def,sts));
			((ProgramContext)_localctx).ast = new Program((((ProgramContext)_localctx).definitions!=null?(((ProgramContext)_localctx).definitions.start):null).getLine(),(((ProgramContext)_localctx).definitions!=null?(((ProgramContext)_localctx).definitions.start):null).getCharPositionInLine()+1,defs);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionsContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public Var_defContext var_def;
		public Func_defContext func_def;
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(88);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(81);
						((DefinitionsContext)_localctx).var_def = var_def();
						setState(82);
						match(T__6);
						_localctx.ast.addAll(((DefinitionsContext)_localctx).var_def.ast);
						}
						break;
					case T__0:
						{
						setState(85);
						((DefinitionsContext)_localctx).func_def = func_def();
						_localctx.ast.add(((DefinitionsContext)_localctx).func_def.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public ExpressionContext exp1;
		public TypeContext t;
		public Function_call_expressionContext f;
		public Token INT_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token REAL_CONSTANT;
		public Token ID;
		public Token OP;
		public ExpressionContext e2;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_call_expressionContext function_call_expression() {
			return getRuleContext(Function_call_expressionContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(94);
				match(T__2);
				setState(95);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(96);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast;  
				}
				break;
			case 2:
				{
				setState(99);
				match(T__2);
				setState(100);
				((ExpressionContext)_localctx).t = type();
				setState(101);
				match(T__3);
				setState(102);
				((ExpressionContext)_localctx).e1 = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast((((ExpressionContext)_localctx).t!=null?(((ExpressionContext)_localctx).t.start):null).getLine(), (((ExpressionContext)_localctx).t!=null?(((ExpressionContext)_localctx).t.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).t.ast, ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 3:
				{
				setState(105);
				match(T__11);
				setState(106);
				((ExpressionContext)_localctx).e1 = expression(11);
				 ((ExpressionContext)_localctx).ast =  new Not((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast );   
				}
				break;
			case 4:
				{
				setState(109);
				match(T__12);
				setState(110);
				((ExpressionContext)_localctx).e1 = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryMinus((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast);  
				}
				break;
			case 5:
				{
				setState(113);
				((ExpressionContext)_localctx).f = function_call_expression();
				((ExpressionContext)_localctx).ast = ((ExpressionContext)_localctx).f.ast;
				}
				break;
			case 6:
				{
				setState(116);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral (((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt(((ExpressionContext)_localctx).INT_CONSTANT.getText()));  
				}
				break;
			case 7:
				{
				setState(118);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar(((ExpressionContext)_localctx).CHAR_CONSTANT.getText()));
				}
				break;
			case 8:
				{
				setState(120);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal(((ExpressionContext)_localctx).REAL_CONSTANT.getText()));
				}
				break;
			case 9:
				{
				setState(122);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).ID.getText());
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(127);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						((ExpressionContext)_localctx).e2 = expression(10);
						 ((ExpressionContext)_localctx).ast =  new  Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(),(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).e2.ast);  
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(132);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__16) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(133);
						((ExpressionContext)_localctx).exp2 = expression(9);
						  ((ExpressionContext)_localctx).ast =   new Arithmetic((((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getLine(),   (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).exp1.ast,  ((ExpressionContext)_localctx).OP.getText()   ,((ExpressionContext)_localctx).exp2.ast );   
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(137);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						((ExpressionContext)_localctx).e2 = expression(8);
						((ExpressionContext)_localctx).ast =  new Logic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(142);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						((ExpressionContext)_localctx).e2 = expression(7);
						((ExpressionContext)_localctx).ast =  new Comparison((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(),(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(147);
						match(T__8);
						setState(148);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(149);
						match(T__9);
						 ((ExpressionContext)_localctx).ast =  new ArrayIndexer((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(153);
						match(T__10);
						setState(154);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new RecordNavigation((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null) ,((ExpressionContext)_localctx).e1.ast);  
						}
						break;
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_expressionContext extends ParserRuleContext {
		public Expression ast;
		public Token ID;
		public ArgumentsContext a;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_call_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_expressionContext function_call_expression() throws RecognitionException {
		Function_call_expressionContext _localctx = new Function_call_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_call_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((Function_call_expressionContext)_localctx).ID = match(ID);
			setState(162);
			((Function_call_expressionContext)_localctx).a = arguments();
			((Function_call_expressionContext)_localctx).ast =  new  FunctionInvocExpression(((Function_call_expressionContext)_localctx).ID.getLine(),((Function_call_expressionContext)_localctx).ID.getCharPositionInLine()+1, new Variable(((Function_call_expressionContext)_localctx).ID.getLine(),((Function_call_expressionContext)_localctx).ID.getCharPositionInLine()+1,(((Function_call_expressionContext)_localctx).ID!=null?((Function_call_expressionContext)_localctx).ID.getText():null)),((Function_call_expressionContext)_localctx).a.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((ExpressionsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ExpressionsContext)_localctx).e1.ast);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(167);
				match(T__25);
				setState(168);
				((ExpressionsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).e2.ast);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Token t;
		public Token INT_CONSTANT;
		public TypeContext type;
		public FieldContext f;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				((TypeContext)_localctx).t = match(T__26);
				((TypeContext)_localctx).ast =  new  CharType(((TypeContext)_localctx).t.getLine(),((TypeContext)_localctx).t.getCharPositionInLine()+1);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((TypeContext)_localctx).t = match(T__27);
				((TypeContext)_localctx).ast =  new IntType(((TypeContext)_localctx).t.getLine(), ((TypeContext)_localctx).t.getCharPositionInLine()+1);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				((TypeContext)_localctx).t = match(T__28);
				((TypeContext)_localctx).ast =  new DoubleType(((TypeContext)_localctx).t.getLine(), ((TypeContext)_localctx).t.getCharPositionInLine()+1);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(T__8);
				setState(183);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(184);
				match(T__9);
				setState(185);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).INT_CONSTANT.getLine(), ((TypeContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,((TypeContext)_localctx).type.ast,LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				((TypeContext)_localctx).t = match(T__29);
				setState(189);
				match(T__5);
				setState(190);
				((TypeContext)_localctx).f = field();
				setState(191);
				match(T__7);
				((TypeContext)_localctx).ast =  new StructType(((TypeContext)_localctx).t.getLine(),((TypeContext)_localctx).t.getCharPositionInLine()+1,((TypeContext)_localctx).f.ast);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public List<FieldDefinition> ast = new ArrayList<FieldDefinition>();
		public Token id1;
		public Token id2;
		public TypeContext type;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(196);
				((FieldContext)_localctx).id1 = match(ID);
				if(_localctx.ast.contains(new FieldDefinition(((FieldContext)_localctx).id1.getLine(), ((FieldContext)_localctx).id1.getCharPositionInLine()+1,(((FieldContext)_localctx).id1!=null?((FieldContext)_localctx).id1.getText():null),null))){new ErrorType(((FieldContext)_localctx).id1.getLine(), ((FieldContext)_localctx).id1.getCharPositionInLine()+1, "Duplicate field error: " + (((FieldContext)_localctx).id1!=null?((FieldContext)_localctx).id1.getText():null));}else {_localctx.ast.add(new FieldDefinition(((FieldContext)_localctx).id1.getLine(), ((FieldContext)_localctx).id1.getCharPositionInLine()+1,(((FieldContext)_localctx).id1!=null?((FieldContext)_localctx).id1.getText():null),null));}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(198);
					match(T__25);
					setState(199);
					((FieldContext)_localctx).id2 = match(ID);
					if(_localctx.ast.contains(new FieldDefinition(((FieldContext)_localctx).id2.getLine(), ((FieldContext)_localctx).id2.getCharPositionInLine()+1,(((FieldContext)_localctx).id2!=null?((FieldContext)_localctx).id2.getText():null),null))){new ErrorType(((FieldContext)_localctx).id2.getLine(), ((FieldContext)_localctx).id2.getCharPositionInLine()+1, "Duplicate field error: " + (((FieldContext)_localctx).id2!=null?((FieldContext)_localctx).id2.getText():null));}else {_localctx.ast.add(new FieldDefinition(((FieldContext)_localctx).id2.getLine(), ((FieldContext)_localctx).id2.getCharPositionInLine()+1,(((FieldContext)_localctx).id2!=null?((FieldContext)_localctx).id2.getText():null),null));}
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(T__4);
				setState(207);
				((FieldContext)_localctx).type = type();
				setState(208);
				match(T__6);
				for(FieldDefinition d: _localctx.ast){if(d.getType()==null)d.setType(((FieldContext)_localctx).type.ast);}
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public Function_call_statementContext f;
		public If_statementContext ifs;
		public Return_statementContext rs;
		public InputContext in;
		public PrintContext p;
		public WhileContext w;
		public AssignationContext a;
		public Function_call_statementContext function_call_statement() {
			return getRuleContext(Function_call_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				((StatementContext)_localctx).f = function_call_statement();
				setState(217);
				match(T__6);
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).f.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((StatementContext)_localctx).ifs = if_statement();
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ifs.ast;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				((StatementContext)_localctx).rs = return_statement();
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).rs.ast;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				((StatementContext)_localctx).in = input();
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).in.ast;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				((StatementContext)_localctx).p = print();
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).p.ast;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				((StatementContext)_localctx).w = while_();
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).w.ast;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				((StatementContext)_localctx).a = assignation();
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).a.ast;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_statementContext extends ParserRuleContext {
		public Statement ast;
		public Token ID;
		public ArgumentsContext a;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunction_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_statementContext function_call_statement() throws RecognitionException {
		Function_call_statementContext _localctx = new Function_call_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((Function_call_statementContext)_localctx).ID = match(ID);
			setState(241);
			((Function_call_statementContext)_localctx).a = arguments();
			((Function_call_statementContext)_localctx).ast =  new  FunctionInvocExpression(((Function_call_statementContext)_localctx).ID.getLine(),((Function_call_statementContext)_localctx).ID.getCharPositionInLine()+1, new Variable(((Function_call_statementContext)_localctx).ID.getLine(),((Function_call_statementContext)_localctx).ID.getCharPositionInLine()+1,(((Function_call_statementContext)_localctx).ID!=null?((Function_call_statementContext)_localctx).ID.getText():null)),((Function_call_statementContext)_localctx).a.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionsContext es;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arguments);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__2);
				setState(245);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__2);
				setState(247);
				((ArgumentsContext)_localctx).es = expressions();
				setState(248);
				match(T__3);
				((ArgumentsContext)_localctx).ast =  ((ArgumentsContext)_localctx).es.ast;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public BodyContext b;
		public Else_statementContext es;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__30);
			setState(254);
			((If_statementContext)_localctx).e1 = expression(0);
			setState(255);
			match(T__4);
			setState(256);
			((If_statementContext)_localctx).b = body();
			Condition cond = new Condition((((If_statementContext)_localctx).e1!=null?(((If_statementContext)_localctx).e1.start):null).getLine(),(((If_statementContext)_localctx).e1!=null?(((If_statementContext)_localctx).e1.start):null).getCharPositionInLine()+1,((If_statementContext)_localctx).e1.ast,((If_statementContext)_localctx).b.ast, new ArrayList<Statement>()); 
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(258);
				((If_statementContext)_localctx).es = else_statement();
				cond.setElseBody(((If_statementContext)_localctx).es.ast);
				}
				break;
			}
			((If_statementContext)_localctx).ast = cond;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public List<Statement> ast;
		public BodyContext b;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__31);
			setState(266);
			match(T__4);
			setState(267);
			((Else_statementContext)_localctx).b = body();
			((Else_statementContext)_localctx).ast =  ((Else_statementContext)_localctx).b.ast;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__11:
			case T__12:
			case T__30:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				((BodyContext)_localctx).s = statement();
				_localctx.ast.add(((BodyContext)_localctx).s.ast);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__5);
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					((BodyContext)_localctx).s = statement();
					_localctx.ast.add(((BodyContext)_localctx).s.ast);
					}
					}
					setState(279); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4254165118984L) != 0) );
				setState(281);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__32);
			setState(286);
			((Return_statementContext)_localctx).e1 = expression(0);
			setState(287);
			match(T__6);
			((Return_statementContext)_localctx).ast =  new Return((((Return_statementContext)_localctx).e1!=null?(((Return_statementContext)_localctx).e1.start):null).getLine(),(((Return_statementContext)_localctx).e1!=null?(((Return_statementContext)_localctx).e1.start):null).getCharPositionInLine()+1,((Return_statementContext)_localctx).e1.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionsContext es;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__33);
			setState(291);
			((InputContext)_localctx).es = expressions();
			setState(292);
			match(T__6);
			((InputContext)_localctx).ast =  new Input((((InputContext)_localctx).es!=null?(((InputContext)_localctx).es.start):null).getLine(),(((InputContext)_localctx).es!=null?(((InputContext)_localctx).es.start):null).getCharPositionInLine()+1,((InputContext)_localctx).es.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionsContext es;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__34);
			setState(296);
			((PrintContext)_localctx).es = expressions();
			setState(297);
			match(T__6);
			((PrintContext)_localctx).ast =  new Print((((PrintContext)_localctx).es!=null?(((PrintContext)_localctx).es.start):null).getLine(),(((PrintContext)_localctx).es!=null?(((PrintContext)_localctx).es.start):null).getCharPositionInLine()+1,((PrintContext)_localctx).es.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public BodyContext b;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__35);
			setState(301);
			((WhileContext)_localctx).e1 = expression(0);
			setState(302);
			match(T__4);
			setState(303);
			((WhileContext)_localctx).b = body();
			((WhileContext)_localctx).ast =  new While((((WhileContext)_localctx).e1!=null?(((WhileContext)_localctx).e1.start):null).getLine(),(((WhileContext)_localctx).e1!=null?(((WhileContext)_localctx).e1.start):null).getCharPositionInLine()+1,((WhileContext)_localctx).e1.ast,((WhileContext)_localctx).b.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignationContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((AssignationContext)_localctx).e1 = expression(0);
			setState(307);
			match(T__36);
			setState(308);
			((AssignationContext)_localctx).e2 = expression(0);
			setState(309);
			match(T__6);
			((AssignationContext)_localctx).ast =  new Assignment((((AssignationContext)_localctx).e1!=null?(((AssignationContext)_localctx).e1.start):null).getLine(),(((AssignationContext)_localctx).e1!=null?(((AssignationContext)_localctx).e1.start):null).getCharPositionInLine()+1,((AssignationContext)_localctx).e1.ast,((AssignationContext)_localctx).e2.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_defContext extends ParserRuleContext {
		public Definition ast;
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Simple_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSimple_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_defContext simple_def() throws RecognitionException {
		Simple_defContext _localctx = new Simple_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simple_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((Simple_defContext)_localctx).ID = match(ID);
			setState(313);
			match(T__4);
			setState(314);
			((Simple_defContext)_localctx).type = type();
			((Simple_defContext)_localctx).ast =  new VarDefinition (((Simple_defContext)_localctx).ID.getLine(), ((Simple_defContext)_localctx).ID.getCharPositionInLine()+1,(((Simple_defContext)_localctx).ID!=null?((Simple_defContext)_localctx).ID.getText():null),((Simple_defContext)_localctx).type.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multi_defContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public Token id1;
		public Token id2;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public Multi_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMulti_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_defContext multi_def() throws RecognitionException {
		Multi_defContext _localctx = new Multi_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multi_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((Multi_defContext)_localctx).id1 = match(ID);
			_localctx.ast.add(new VarDefinition(((Multi_defContext)_localctx).id1.getLine(), ((Multi_defContext)_localctx).id1.getCharPositionInLine()+1, (((Multi_defContext)_localctx).id1!=null?((Multi_defContext)_localctx).id1.getText():null), null));
			setState(322); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(319);
				match(T__25);
				setState(320);
				((Multi_defContext)_localctx).id2 = match(ID);
				if(_localctx.ast.contains(new VarDefinition(((Multi_defContext)_localctx).id2.getLine(), ((Multi_defContext)_localctx).id2.getCharPositionInLine()+1, (((Multi_defContext)_localctx).id2!=null?((Multi_defContext)_localctx).id2.getText():null), null))){new ErrorType(((Multi_defContext)_localctx).id2.getLine(), ((Multi_defContext)_localctx).id2.getCharPositionInLine()+1, "Duplicate variable definition error: " + (((Multi_defContext)_localctx).id2!=null?((Multi_defContext)_localctx).id2.getText():null));}else{_localctx.ast.add(new VarDefinition(((Multi_defContext)_localctx).id2.getLine(), ((Multi_defContext)_localctx).id2.getCharPositionInLine()+1, (((Multi_defContext)_localctx).id2!=null?((Multi_defContext)_localctx).id2.getText():null), null));}
				}
				}
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__25 );
			setState(326);
			match(T__4);
			setState(327);
			((Multi_defContext)_localctx).type = type();
			for(Definition d: _localctx.ast){d.setType(((Multi_defContext)_localctx).type.ast);}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_defContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public Simple_defContext simple_def;
		public Multi_defContext multi_def;
		public Simple_defContext simple_def() {
			return getRuleContext(Simple_defContext.class,0);
		}
		public Multi_defContext multi_def() {
			return getRuleContext(Multi_defContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var_def);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				((Var_defContext)_localctx).simple_def = simple_def();
				_localctx.ast.add(((Var_defContext)_localctx).simple_def.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				((Var_defContext)_localctx).multi_def = multi_def();
				_localctx.ast.addAll(((Var_defContext)_localctx).multi_def.ast);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_defContext extends ParserRuleContext {
		public Definition ast;
		public Token ID;
		public ParametersContext parameters;
		public TypeContext type;
		public Var_defContext var_def;
		public StatementContext statement;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_func_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__0);
			setState(339);
			((Func_defContext)_localctx).ID = match(ID);
			setState(340);
			((Func_defContext)_localctx).parameters = parameters();
			setState(341);
			match(T__4);
			Type returnType= new VoidType (((Func_defContext)_localctx).ID.getLine(),((Func_defContext)_localctx).ID.getCharPositionInLine()+1);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013266432L) != 0)) {
				{
				setState(343);
				((Func_defContext)_localctx).type = type();
				returnType = ((Func_defContext)_localctx).type.ast;
				}
			}

			setState(348);
			match(T__5);
			List<Definition> defs=new ArrayList<Definition>();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(350);
					((Func_defContext)_localctx).var_def = var_def();
					defs.addAll(((Func_defContext)_localctx).var_def.ast);
					setState(352);
					match(T__6);
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			List<Statement> sts=new ArrayList<Statement>();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4254165118984L) != 0)) {
				{
				{
				setState(360);
				((Func_defContext)_localctx).statement = statement();
				sts.add(((Func_defContext)_localctx).statement.ast);
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			match(T__7);
			((Func_defContext)_localctx).ast = new FuncDefinition(((Func_defContext)_localctx).ID.getLine(),((Func_defContext)_localctx).ID.getCharPositionInLine()+1,(((Func_defContext)_localctx).ID!=null?((Func_defContext)_localctx).ID.getText():null),new FunctionType(((Func_defContext)_localctx).ID.getLine(),((Func_defContext)_localctx).ID.getCharPositionInLine()+1,returnType,((Func_defContext)_localctx).parameters.ast),defs,sts);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public Simple_defContext s1;
		public Simple_defContext s2;
		public List<Simple_defContext> simple_def() {
			return getRuleContexts(Simple_defContext.class);
		}
		public Simple_defContext simple_def(int i) {
			return getRuleContext(Simple_defContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameters);
		int _la;
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(T__2);
				setState(372);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(T__2);
				setState(374);
				((ParametersContext)_localctx).s1 = simple_def();
				_localctx.ast.add(((ParametersContext)_localctx).s1.ast);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(376);
					match(T__25);
					setState(377);
					((ParametersContext)_localctx).s2 = simple_def();
					_localctx.ast.add(((ParametersContext)_localctx).s2.ast);
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(385);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Main_defContext extends ParserRuleContext {
		public Definition ast;
		public Token d;
		public Var_defContext v1;
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public Main_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_defContext main_def() throws RecognitionException {
		Main_defContext _localctx = new Main_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_main_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			((Main_defContext)_localctx).d = match(T__0);
			setState(390);
			match(T__1);
			setState(391);
			match(T__2);
			setState(392);
			match(T__3);
			setState(393);
			match(T__4);
			setState(394);
			match(T__5);
			List<Definition> defs=new ArrayList<Definition>();
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(396);
					((Main_defContext)_localctx).v1 = var_def();
					defs.addAll(((Main_defContext)_localctx).v1.ast);
					setState(398);
					match(T__6);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			List<Statement> sts=new ArrayList<Statement>();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4254165118984L) != 0)) {
				{
				{
				setState(406);
				((Main_defContext)_localctx).statement = statement();
				sts.add(((Main_defContext)_localctx).statement.ast);
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(T__7);
			setState(415);
			match(EOF);
			 ((Main_defContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, "main",new FunctionType(((Main_defContext)_localctx).d.getLine(),((Main_defContext)_localctx).d.getCharPositionInLine()+1,new VoidType(((Main_defContext)_localctx).d.getLine(),((Main_defContext)_localctx).d.getCharPositionInLine()+1),new ArrayList<Definition>()),defs,sts); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u01a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001Y\b\u0001\n\u0001\f\u0001\\\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"}\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u009d\b\u0002\n\u0002\f\u0002\u00a0\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00ac\b\u0004\n"+
		"\u0004\f\u0004\u00af\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c3\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ca\b\u0006\n"+
		"\u0006\f\u0006\u00cd\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00d4\b\u0006\n\u0006\f\u0006\u00d7\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ef\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00fc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0106\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0116\b\f\u000b\f\f\f\u0117"+
		"\u0001\f\u0001\f\u0003\f\u011c\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0004\u0013\u0143\b\u0013\u000b\u0013\f\u0013"+
		"\u0144\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0151"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u015b\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0163"+
		"\b\u0015\n\u0015\f\u0015\u0166\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u016c\b\u0015\n\u0015\f\u0015\u016f\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u017d\b\u0016\n\u0016\f\u0016\u0180\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0184\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0191\b\u0017\n\u0017\f\u0017\u0194\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u019a\b\u0017\n"+
		"\u0017\f\u0017\u019d\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0000\u0001\u0004\u0018\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000"+
		"\u0004\u0001\u0000\u000e\u0010\u0002\u0000\r\r\u0011\u0011\u0001\u0000"+
		"\u0012\u0013\u0001\u0000\u0014\u0019\u01b6\u00000\u0001\u0000\u0000\u0000"+
		"\u0002Z\u0001\u0000\u0000\u0000\u0004|\u0001\u0000\u0000\u0000\u0006\u00a1"+
		"\u0001\u0000\u0000\u0000\b\u00a5\u0001\u0000\u0000\u0000\n\u00c2\u0001"+
		"\u0000\u0000\u0000\f\u00d5\u0001\u0000\u0000\u0000\u000e\u00ee\u0001\u0000"+
		"\u0000\u0000\u0010\u00f0\u0001\u0000\u0000\u0000\u0012\u00fb\u0001\u0000"+
		"\u0000\u0000\u0014\u00fd\u0001\u0000\u0000\u0000\u0016\u0109\u0001\u0000"+
		"\u0000\u0000\u0018\u011b\u0001\u0000\u0000\u0000\u001a\u011d\u0001\u0000"+
		"\u0000\u0000\u001c\u0122\u0001\u0000\u0000\u0000\u001e\u0127\u0001\u0000"+
		"\u0000\u0000 \u012c\u0001\u0000\u0000\u0000\"\u0132\u0001\u0000\u0000"+
		"\u0000$\u0138\u0001\u0000\u0000\u0000&\u013d\u0001\u0000\u0000\u0000("+
		"\u0150\u0001\u0000\u0000\u0000*\u0152\u0001\u0000\u0000\u0000,\u0183\u0001"+
		"\u0000\u0000\u0000.\u0185\u0001\u0000\u0000\u000001\u0006\u0000\uffff"+
		"\uffff\u000012\u0003\u0002\u0001\u000023\u0006\u0000\uffff\uffff\u0000"+
		"34\u0005\u0001\u0000\u000045\u0005\u0002\u0000\u000056\u0005\u0003\u0000"+
		"\u000067\u0005\u0004\u0000\u000078\u0005\u0005\u0000\u000089\u0005\u0006"+
		"\u0000\u00009@\u0006\u0000\uffff\uffff\u0000:;\u0003(\u0014\u0000;<\u0006"+
		"\u0000\uffff\uffff\u0000<=\u0005\u0007\u0000\u0000=?\u0001\u0000\u0000"+
		"\u0000>:\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CI\u0006\u0000\uffff\uffff\u0000DE\u0003\u000e\u0007"+
		"\u0000EF\u0006\u0000\uffff\uffff\u0000FH\u0001\u0000\u0000\u0000GD\u0001"+
		"\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000LM\u0005\b\u0000\u0000MN\u0005\u0000\u0000\u0001NO\u0006\u0000\uffff"+
		"\uffff\u0000OP\u0006\u0000\uffff\uffff\u0000P\u0001\u0001\u0000\u0000"+
		"\u0000QR\u0003(\u0014\u0000RS\u0005\u0007\u0000\u0000ST\u0006\u0001\uffff"+
		"\uffff\u0000TY\u0001\u0000\u0000\u0000UV\u0003*\u0015\u0000VW\u0006\u0001"+
		"\uffff\uffff\u0000WY\u0001\u0000\u0000\u0000XQ\u0001\u0000\u0000\u0000"+
		"XU\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\u0003\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000]^\u0006\u0002\uffff\uffff\u0000^_\u0005\u0003\u0000"+
		"\u0000_`\u0003\u0004\u0002\u0000`a\u0005\u0004\u0000\u0000ab\u0006\u0002"+
		"\uffff\uffff\u0000b}\u0001\u0000\u0000\u0000cd\u0005\u0003\u0000\u0000"+
		"de\u0003\n\u0005\u0000ef\u0005\u0004\u0000\u0000fg\u0003\u0004\u0002\f"+
		"gh\u0006\u0002\uffff\uffff\u0000h}\u0001\u0000\u0000\u0000ij\u0005\f\u0000"+
		"\u0000jk\u0003\u0004\u0002\u000bkl\u0006\u0002\uffff\uffff\u0000l}\u0001"+
		"\u0000\u0000\u0000mn\u0005\r\u0000\u0000no\u0003\u0004\u0002\nop\u0006"+
		"\u0002\uffff\uffff\u0000p}\u0001\u0000\u0000\u0000qr\u0003\u0006\u0003"+
		"\u0000rs\u0006\u0002\uffff\uffff\u0000s}\u0001\u0000\u0000\u0000tu\u0005"+
		"&\u0000\u0000u}\u0006\u0002\uffff\uffff\u0000vw\u0005(\u0000\u0000w}\u0006"+
		"\u0002\uffff\uffff\u0000xy\u0005\'\u0000\u0000y}\u0006\u0002\uffff\uffff"+
		"\u0000z{\u0005)\u0000\u0000{}\u0006\u0002\uffff\uffff\u0000|]\u0001\u0000"+
		"\u0000\u0000|c\u0001\u0000\u0000\u0000|i\u0001\u0000\u0000\u0000|m\u0001"+
		"\u0000\u0000\u0000|q\u0001\u0000\u0000\u0000|t\u0001\u0000\u0000\u0000"+
		"|v\u0001\u0000\u0000\u0000|x\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000}\u009e\u0001\u0000\u0000\u0000~\u007f\n\t\u0000\u0000\u007f\u0080"+
		"\u0007\u0000\u0000\u0000\u0080\u0081\u0003\u0004\u0002\n\u0081\u0082\u0006"+
		"\u0002\uffff\uffff\u0000\u0082\u009d\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\n\b\u0000\u0000\u0084\u0085\u0007\u0001\u0000\u0000\u0085\u0086\u0003"+
		"\u0004\u0002\t\u0086\u0087\u0006\u0002\uffff\uffff\u0000\u0087\u009d\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\n\u0007\u0000\u0000\u0089\u008a\u0007\u0002"+
		"\u0000\u0000\u008a\u008b\u0003\u0004\u0002\b\u008b\u008c\u0006\u0002\uffff"+
		"\uffff\u0000\u008c\u009d\u0001\u0000\u0000\u0000\u008d\u008e\n\u0006\u0000"+
		"\u0000\u008e\u008f\u0007\u0003\u0000\u0000\u008f\u0090\u0003\u0004\u0002"+
		"\u0007\u0090\u0091\u0006\u0002\uffff\uffff\u0000\u0091\u009d\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\n\u000e\u0000\u0000\u0093\u0094\u0005\t\u0000"+
		"\u0000\u0094\u0095\u0003\u0004\u0002\u0000\u0095\u0096\u0005\n\u0000\u0000"+
		"\u0096\u0097\u0006\u0002\uffff\uffff\u0000\u0097\u009d\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\n\r\u0000\u0000\u0099\u009a\u0005\u000b\u0000\u0000"+
		"\u009a\u009b\u0005)\u0000\u0000\u009b\u009d\u0006\u0002\uffff\uffff\u0000"+
		"\u009c~\u0001\u0000\u0000\u0000\u009c\u0083\u0001\u0000\u0000\u0000\u009c"+
		"\u0088\u0001\u0000\u0000\u0000\u009c\u008d\u0001\u0000\u0000\u0000\u009c"+
		"\u0092\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009d"+
		"\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u0005\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005)\u0000\u0000\u00a2\u00a3"+
		"\u0003\u0012\t\u0000\u00a3\u00a4\u0006\u0003\uffff\uffff\u0000\u00a4\u0007"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\u0004\u0002\u0000\u00a6\u00ad"+
		"\u0006\u0004\uffff\uffff\u0000\u00a7\u00a8\u0005\u001a\u0000\u0000\u00a8"+
		"\u00a9\u0003\u0004\u0002\u0000\u00a9\u00aa\u0006\u0004\uffff\uffff\u0000"+
		"\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\t\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u001b\u0000\u0000\u00b1"+
		"\u00c3\u0006\u0005\uffff\uffff\u0000\u00b2\u00b3\u0005\u001c\u0000\u0000"+
		"\u00b3\u00c3\u0006\u0005\uffff\uffff\u0000\u00b4\u00b5\u0005\u001d\u0000"+
		"\u0000\u00b5\u00c3\u0006\u0005\uffff\uffff\u0000\u00b6\u00b7\u0005\t\u0000"+
		"\u0000\u00b7\u00b8\u0005&\u0000\u0000\u00b8\u00b9\u0005\n\u0000\u0000"+
		"\u00b9\u00ba\u0003\n\u0005\u0000\u00ba\u00bb\u0006\u0005\uffff\uffff\u0000"+
		"\u00bb\u00c3\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u001e\u0000\u0000"+
		"\u00bd\u00be\u0005\u0006\u0000\u0000\u00be\u00bf\u0003\f\u0006\u0000\u00bf"+
		"\u00c0\u0005\b\u0000\u0000\u00c0\u00c1\u0006\u0005\uffff\uffff\u0000\u00c1"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00b2\u0001\u0000\u0000\u0000\u00c2\u00b4\u0001\u0000\u0000\u0000\u00c2"+
		"\u00b6\u0001\u0000\u0000\u0000\u00c2\u00bc\u0001\u0000\u0000\u0000\u00c3"+
		"\u000b\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005)\u0000\u0000\u00c5\u00cb"+
		"\u0006\u0006\uffff\uffff\u0000\u00c6\u00c7\u0005\u001a\u0000\u0000\u00c7"+
		"\u00c8\u0005)\u0000\u0000\u00c8\u00ca\u0006\u0006\uffff\uffff\u0000\u00c9"+
		"\u00c6\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005\u0005\u0000\u0000\u00cf\u00d0\u0003\n\u0005\u0000\u00d0\u00d1"+
		"\u0005\u0007\u0000\u0000\u00d1\u00d2\u0006\u0006\uffff\uffff\u0000\u00d2"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d3\u00c4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\r\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003\u0010\b\u0000\u00d9\u00da\u0005"+
		"\u0007\u0000\u0000\u00da\u00db\u0006\u0007\uffff\uffff\u0000\u00db\u00ef"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003\u0014\n\u0000\u00dd\u00de\u0006"+
		"\u0007\uffff\uffff\u0000\u00de\u00ef\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0003\u001a\r\u0000\u00e0\u00e1\u0006\u0007\uffff\uffff\u0000\u00e1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003\u001c\u000e\u0000\u00e3\u00e4"+
		"\u0006\u0007\uffff\uffff\u0000\u00e4\u00ef\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0003\u001e\u000f\u0000\u00e6\u00e7\u0006\u0007\uffff\uffff\u0000"+
		"\u00e7\u00ef\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003 \u0010\u0000\u00e9"+
		"\u00ea\u0006\u0007\uffff\uffff\u0000\u00ea\u00ef\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0003\"\u0011\u0000\u00ec\u00ed\u0006\u0007\uffff\uffff\u0000"+
		"\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00d8\u0001\u0000\u0000\u0000"+
		"\u00ee\u00dc\u0001\u0000\u0000\u0000\u00ee\u00df\u0001\u0000\u0000\u0000"+
		"\u00ee\u00e2\u0001\u0000\u0000\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000"+
		"\u00ee\u00e8\u0001\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ef\u000f\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005)\u0000\u0000\u00f1"+
		"\u00f2\u0003\u0012\t\u0000\u00f2\u00f3\u0006\b\uffff\uffff\u0000\u00f3"+
		"\u0011\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0003\u0000\u0000\u00f5"+
		"\u00fc\u0005\u0004\u0000\u0000\u00f6\u00f7\u0005\u0003\u0000\u0000\u00f7"+
		"\u00f8\u0003\b\u0004\u0000\u00f8\u00f9\u0005\u0004\u0000\u0000\u00f9\u00fa"+
		"\u0006\t\uffff\uffff\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f4"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fc\u0013"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u001f\u0000\u0000\u00fe\u00ff"+
		"\u0003\u0004\u0002\u0000\u00ff\u0100\u0005\u0005\u0000\u0000\u0100\u0101"+
		"\u0003\u0018\f\u0000\u0101\u0105\u0006\n\uffff\uffff\u0000\u0102\u0103"+
		"\u0003\u0016\u000b\u0000\u0103\u0104\u0006\n\uffff\uffff\u0000\u0104\u0106"+
		"\u0001\u0000\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0006\n\uffff\uffff\u0000\u0108\u0015\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0005 \u0000\u0000\u010a\u010b\u0005\u0005\u0000\u0000\u010b\u010c\u0003"+
		"\u0018\f\u0000\u010c\u010d\u0006\u000b\uffff\uffff\u0000\u010d\u0017\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0003\u000e\u0007\u0000\u010f\u0110\u0006"+
		"\f\uffff\uffff\u0000\u0110\u011c\u0001\u0000\u0000\u0000\u0111\u0115\u0005"+
		"\u0006\u0000\u0000\u0112\u0113\u0003\u000e\u0007\u0000\u0113\u0114\u0006"+
		"\f\uffff\uffff\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0112\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005\b\u0000\u0000\u011a\u011c\u0001\u0000"+
		"\u0000\u0000\u011b\u010e\u0001\u0000\u0000\u0000\u011b\u0111\u0001\u0000"+
		"\u0000\u0000\u011c\u0019\u0001\u0000\u0000\u0000\u011d\u011e\u0005!\u0000"+
		"\u0000\u011e\u011f\u0003\u0004\u0002\u0000\u011f\u0120\u0005\u0007\u0000"+
		"\u0000\u0120\u0121\u0006\r\uffff\uffff\u0000\u0121\u001b\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0005\"\u0000\u0000\u0123\u0124\u0003\b\u0004\u0000"+
		"\u0124\u0125\u0005\u0007\u0000\u0000\u0125\u0126\u0006\u000e\uffff\uffff"+
		"\u0000\u0126\u001d\u0001\u0000\u0000\u0000\u0127\u0128\u0005#\u0000\u0000"+
		"\u0128\u0129\u0003\b\u0004\u0000\u0129\u012a\u0005\u0007\u0000\u0000\u012a"+
		"\u012b\u0006\u000f\uffff\uffff\u0000\u012b\u001f\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005$\u0000\u0000\u012d\u012e\u0003\u0004\u0002\u0000\u012e"+
		"\u012f\u0005\u0005\u0000\u0000\u012f\u0130\u0003\u0018\f\u0000\u0130\u0131"+
		"\u0006\u0010\uffff\uffff\u0000\u0131!\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0003\u0004\u0002\u0000\u0133\u0134\u0005%\u0000\u0000\u0134\u0135\u0003"+
		"\u0004\u0002\u0000\u0135\u0136\u0005\u0007\u0000\u0000\u0136\u0137\u0006"+
		"\u0011\uffff\uffff\u0000\u0137#\u0001\u0000\u0000\u0000\u0138\u0139\u0005"+
		")\u0000\u0000\u0139\u013a\u0005\u0005\u0000\u0000\u013a\u013b\u0003\n"+
		"\u0005\u0000\u013b\u013c\u0006\u0012\uffff\uffff\u0000\u013c%\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0005)\u0000\u0000\u013e\u0142\u0006\u0013\uffff"+
		"\uffff\u0000\u013f\u0140\u0005\u001a\u0000\u0000\u0140\u0141\u0005)\u0000"+
		"\u0000\u0141\u0143\u0006\u0013\uffff\uffff\u0000\u0142\u013f\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\u0005\u0000\u0000\u0147\u0148\u0003\n\u0005"+
		"\u0000\u0148\u0149\u0006\u0013\uffff\uffff\u0000\u0149\'\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0003$\u0012\u0000\u014b\u014c\u0006\u0014\uffff\uffff"+
		"\u0000\u014c\u0151\u0001\u0000\u0000\u0000\u014d\u014e\u0003&\u0013\u0000"+
		"\u014e\u014f\u0006\u0014\uffff\uffff\u0000\u014f\u0151\u0001\u0000\u0000"+
		"\u0000\u0150\u014a\u0001\u0000\u0000\u0000\u0150\u014d\u0001\u0000\u0000"+
		"\u0000\u0151)\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0001\u0000\u0000"+
		"\u0153\u0154\u0005)\u0000\u0000\u0154\u0155\u0003,\u0016\u0000\u0155\u0156"+
		"\u0005\u0005\u0000\u0000\u0156\u015a\u0006\u0015\uffff\uffff\u0000\u0157"+
		"\u0158\u0003\n\u0005\u0000\u0158\u0159\u0006\u0015\uffff\uffff\u0000\u0159"+
		"\u015b\u0001\u0000\u0000\u0000\u015a\u0157\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0005\u0006\u0000\u0000\u015d\u0164\u0006\u0015\uffff\uffff\u0000"+
		"\u015e\u015f\u0003(\u0014\u0000\u015f\u0160\u0006\u0015\uffff\uffff\u0000"+
		"\u0160\u0161\u0005\u0007\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000"+
		"\u0162\u015e\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000"+
		"\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0167\u016d\u0006\u0015\uffff\uffff\u0000\u0168\u0169\u0003\u000e\u0007"+
		"\u0000\u0169\u016a\u0006\u0015\uffff\uffff\u0000\u016a\u016c\u0001\u0000"+
		"\u0000\u0000\u016b\u0168\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0005\b\u0000\u0000\u0171\u0172\u0006\u0015\uffff"+
		"\uffff\u0000\u0172+\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u0003\u0000"+
		"\u0000\u0174\u0184\u0005\u0004\u0000\u0000\u0175\u0176\u0005\u0003\u0000"+
		"\u0000\u0176\u0177\u0003$\u0012\u0000\u0177\u017e\u0006\u0016\uffff\uffff"+
		"\u0000\u0178\u0179\u0005\u001a\u0000\u0000\u0179\u017a\u0003$\u0012\u0000"+
		"\u017a\u017b\u0006\u0016\uffff\uffff\u0000\u017b\u017d\u0001\u0000\u0000"+
		"\u0000\u017c\u0178\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000"+
		"\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000"+
		"\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0005\u0004\u0000\u0000\u0182\u0184\u0001\u0000\u0000"+
		"\u0000\u0183\u0173\u0001\u0000\u0000\u0000\u0183\u0175\u0001\u0000\u0000"+
		"\u0000\u0184-\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u0001\u0000\u0000"+
		"\u0186\u0187\u0005\u0002\u0000\u0000\u0187\u0188\u0005\u0003\u0000\u0000"+
		"\u0188\u0189\u0005\u0004\u0000\u0000\u0189\u018a\u0005\u0005\u0000\u0000"+
		"\u018a\u018b\u0005\u0006\u0000\u0000\u018b\u0192\u0006\u0017\uffff\uffff"+
		"\u0000\u018c\u018d\u0003(\u0014\u0000\u018d\u018e\u0006\u0017\uffff\uffff"+
		"\u0000\u018e\u018f\u0005\u0007\u0000\u0000\u018f\u0191\u0001\u0000\u0000"+
		"\u0000\u0190\u018c\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0195\u019b\u0006\u0017\uffff\uffff\u0000\u0196\u0197\u0003\u000e"+
		"\u0007\u0000\u0197\u0198\u0006\u0017\uffff\uffff\u0000\u0198\u019a\u0001"+
		"\u0000\u0000\u0000\u0199\u0196\u0001\u0000\u0000\u0000\u019a\u019d\u0001"+
		"\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001"+
		"\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d\u019b\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0005\b\u0000\u0000\u019f\u01a0\u0005\u0000"+
		"\u0000\u0001\u01a0\u01a1\u0006\u0017\uffff\uffff\u0000\u01a1/\u0001\u0000"+
		"\u0000\u0000\u0019@IXZ|\u009c\u009e\u00ad\u00c2\u00cb\u00d5\u00ee\u00fb"+
		"\u0105\u0117\u011b\u0144\u0150\u015a\u0164\u016d\u017e\u0183\u0192\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}