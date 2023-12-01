// Generated from D:/Bahareh/7/Files/Compiler/Git/Compiler-Design/Class Assignments/5 - AST/ASTListener/ASTListener/AssignmentStatement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AssignmentStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, INT=24, FLOAT=25, 
		String=26, ID=27, ARRAY_TYPE=28, INT_ARRAY=29, FLOAT_ARRAY=30, STRING_ARRAY=31, 
		WS=32, NEWLINE=33, RELOP=34, STRING=35;
	public static final int
		RULE_start = 0, RULE_prog = 1, RULE_declaration = 2, RULE_variable_declaration = 3, 
		RULE_type = 4, RULE_compoundst = 5, RULE_statement = 6, RULE_ifst = 7, 
		RULE_forst = 8, RULE_whilest = 9, RULE_switchcase = 10, RULE_cond = 11, 
		RULE_assign = 12, RULE_expr = 13, RULE_term = 14, RULE_factor = 15, RULE_number = 16, 
		RULE_array = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "prog", "declaration", "variable_declaration", "type", "compoundst", 
			"statement", "ifst", "forst", "whilest", "switchcase", "cond", "assign", 
			"expr", "term", "factor", "number", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "':'", "'float'", "'int'", "'string'", "'begin'", 
			"'end'", "'if'", "'then'", "'else'", "'for'", "'('", "';'", "')'", "'while'", 
			"'switch'", "'case'", "':='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INT", "FLOAT", "String", "ID", "ARRAY_TYPE", "INT_ARRAY", "FLOAT_ARRAY", 
			"STRING_ARRAY", "WS", "NEWLINE", "RELOP", "STRING"
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
	public String getGrammarFileName() { return "AssignmentStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssignmentStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AssignmentStatementParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AssignmentStatementParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssignmentStatementParser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			prog();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(37);
				match(NEWLINE);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(EOF);
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
	public static class ProgContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public TerminalNode ID() { return getToken(AssignmentStatementParser.ID, 0); }
		public CompoundstContext compoundst() {
			return getRuleContext(CompoundstContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AssignmentStatementParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssignmentStatementParser.NEWLINE, i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(ID);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					match(NEWLINE);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(53);
				declaration();
				}
			}

			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				match(NEWLINE);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(61);
			compoundst();
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
	public static class DeclarationContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public List<TerminalNode> NEWLINE() { return getTokens(AssignmentStatementParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssignmentStatementParser.NEWLINE, i);
		}
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__1);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(64);
				match(NEWLINE);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				variable_declaration();
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(71);
						match(NEWLINE);
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public TerminalNode ID() { return getToken(AssignmentStatementParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(82);
			match(T__2);
			setState(83);
			type();
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
		public  value_attr = str();
		public  type_attr = str();
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class CompoundstContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public List<TerminalNode> NEWLINE() { return getTokens(AssignmentStatementParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssignmentStatementParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterCompoundst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitCompoundst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitCompoundst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundstContext compoundst() throws RecognitionException {
		CompoundstContext _localctx = new CompoundstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compoundst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__6);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(88);
				match(NEWLINE);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				statement();
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95);
					match(NEWLINE);
					}
					}
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 134419072L) != 0) );
			setState(104);
			match(T__7);
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
		public  value_attr = str();
		public  type_attr = str();
		public IfstContext ifst() {
			return getRuleContext(IfstContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CompoundstContext compoundst() {
			return getRuleContext(CompoundstContext.class,0);
		}
		public ForstContext forst() {
			return getRuleContext(ForstContext.class,0);
		}
		public WhilestContext whilest() {
			return getRuleContext(WhilestContext.class,0);
		}
		public SwitchcaseContext switchcase() {
			return getRuleContext(SwitchcaseContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				ifst();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				assign();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				compoundst();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				forst();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				whilest();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				switchcase();
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
	public static class IfstContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AssignmentStatementParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssignmentStatementParser.NEWLINE, i);
		}
		public IfstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterIfst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitIfst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitIfst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstContext ifst() throws RecognitionException {
		IfstContext _localctx = new IfstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifst);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__8);
			setState(115);
			cond();
			setState(116);
			match(T__9);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(117);
				match(NEWLINE);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			statement();
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(NEWLINE);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(130);
				match(T__10);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(131);
					match(NEWLINE);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				statement();
				}
				break;
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
	public static class ForstContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AssignmentStatementParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssignmentStatementParser.NEWLINE, i);
		}
		public ForstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterForst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitForst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitForst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstContext forst() throws RecognitionException {
		ForstContext _localctx = new ForstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__11);
			setState(141);
			match(T__12);
			setState(142);
			assign();
			setState(143);
			match(T__13);
			setState(144);
			cond();
			setState(145);
			match(T__13);
			setState(146);
			assign();
			setState(147);
			match(T__14);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(148);
				match(NEWLINE);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			statement();
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
	public static class WhilestContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AssignmentStatementParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssignmentStatementParser.NEWLINE, i);
		}
		public WhilestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterWhilest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitWhilest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitWhilest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestContext whilest() throws RecognitionException {
		WhilestContext _localctx = new WhilestContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__15);
			setState(157);
			cond();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(158);
				match(NEWLINE);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			statement();
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
	public static class SwitchcaseContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public TerminalNode ID() { return getToken(AssignmentStatementParser.ID, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode INT() { return getToken(AssignmentStatementParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(AssignmentStatementParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(AssignmentStatementParser.STRING, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AssignmentStatementParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssignmentStatementParser.NEWLINE, i);
		}
		public SwitchcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterSwitchcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitSwitchcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitSwitchcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchcaseContext switchcase() throws RecognitionException {
		SwitchcaseContext _localctx = new SwitchcaseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_switchcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__16);
			setState(167);
			match(ID);
			setState(168);
			match(T__17);
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34410070016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			match(T__2);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(171);
				match(NEWLINE);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			statement();
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
	public static class CondContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(AssignmentStatementParser.RELOP, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expr(0);
			setState(180);
			match(RELOP);
			setState(181);
			expr(0);
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
	public static class AssignContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public TerminalNode ID() { return getToken(AssignmentStatementParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ID);
			setState(184);
			match(T__18);
			setState(185);
			expr(0);
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
	public static class ExprContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.value_attr = ctx.value_attr;
			this.type_attr = ctx.type_attr;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expr_term_minusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_term_minusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterExpr_term_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitExpr_term_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitExpr_term_minus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expr_term_plusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_term_plusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterExpr_term_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitExpr_term_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitExpr_term_plus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Term4Context extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term4Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterTerm4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitTerm4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitTerm4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expr_term_relopContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RELOP() { return getToken(AssignmentStatementParser.RELOP, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_term_relopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterExpr_term_relop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitExpr_term_relop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitExpr_term_relop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Term4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(188);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_term_plusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(191);
						match(T__19);
						setState(192);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new Expr_term_minusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(194);
						match(T__20);
						setState(195);
						term(0);
						}
						break;
					case 3:
						{
						_localctx = new Expr_term_relopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(197);
						match(RELOP);
						setState(198);
						term(0);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class TermContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
			this.value_attr = ctx.value_attr;
			this.type_attr = ctx.type_attr;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Term_fact_divideContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_fact_divideContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterTerm_fact_divide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitTerm_fact_divide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitTerm_fact_divide(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Term_fact_mutiplyContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_fact_mutiplyContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterTerm_fact_mutiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitTerm_fact_mutiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitTerm_fact_mutiply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Factor3Context extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Factor3Context(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterFactor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitFactor3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitFactor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Factor3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(205);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Term_fact_mutiplyContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						match(T__21);
						setState(209);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new Term_fact_divideContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						match(T__22);
						setState(212);
						factor();
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	public static class FactorContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
			this.value_attr = ctx.value_attr;
			this.type_attr = ctx.type_attr;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Fact_exprContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Fact_exprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterFact_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitFact_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitFact_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Fact_idContext extends FactorContext {
		public TerminalNode ID() { return getToken(AssignmentStatementParser.ID, 0); }
		public Fact_idContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterFact_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitFact_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitFact_id(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Fact_numberContext extends FactorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Fact_numberContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterFact_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitFact_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitFact_number(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Fact_arrayContext extends FactorContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Fact_arrayContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterFact_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitFact_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitFact_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new Fact_exprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__12);
				setState(219);
				expr(0);
				setState(220);
				match(T__14);
				}
				break;
			case ID:
				_localctx = new Fact_idContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(ID);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new Fact_numberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				number();
				}
				break;
			case INT_ARRAY:
			case FLOAT_ARRAY:
			case STRING_ARRAY:
				_localctx = new Fact_arrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				array();
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
	public static class NumberContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
			this.value_attr = ctx.value_attr;
			this.type_attr = ctx.type_attr;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Number_floatContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(AssignmentStatementParser.FLOAT, 0); }
		public Number_floatContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterNumber_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitNumber_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitNumber_float(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Number_intContext extends NumberContext {
		public TerminalNode INT() { return getToken(AssignmentStatementParser.INT, 0); }
		public Number_intContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterNumber_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitNumber_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitNumber_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				_localctx = new Number_floatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(FLOAT);
				}
				break;
			case INT:
				_localctx = new Number_intContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(INT);
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
	public static class ArrayContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
			this.value_attr = ctx.value_attr;
			this.type_attr = ctx.type_attr;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_floatContext extends ArrayContext {
		public TerminalNode FLOAT_ARRAY() { return getToken(AssignmentStatementParser.FLOAT_ARRAY, 0); }
		public Array_floatContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterArray_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitArray_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitArray_float(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_stringContext extends ArrayContext {
		public TerminalNode STRING_ARRAY() { return getToken(AssignmentStatementParser.STRING_ARRAY, 0); }
		public Array_stringContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterArray_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitArray_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitArray_string(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_intContext extends ArrayContext {
		public TerminalNode INT_ARRAY() { return getToken(AssignmentStatementParser.INT_ARRAY, 0); }
		public Array_intContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).enterArray_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssignmentStatementListener ) ((AssignmentStatementListener)listener).exitArray_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssignmentStatementVisitor ) return ((AssignmentStatementVisitor<? extends T>)visitor).visitArray_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_ARRAY:
				_localctx = new Array_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(INT_ARRAY);
				}
				break;
			case FLOAT_ARRAY:
				_localctx = new Array_floatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(FLOAT_ARRAY);
				}
				break;
			case STRING_ARRAY:
				_localctx = new Array_stringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(STRING_ARRAY);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 14:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u00ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b\u0001\n\u0001\f\u0001"+
		"4\t\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0001\u0004\u0001:\b"+
		"\u0001\u000b\u0001\f\u0001;\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002L\t\u0002\u0004\u0002N\b\u0002"+
		"\u000b\u0002\f\u0002O\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005Z\b\u0005"+
		"\n\u0005\f\u0005]\t\u0005\u0001\u0005\u0001\u0005\u0004\u0005a\b\u0005"+
		"\u000b\u0005\f\u0005b\u0004\u0005e\b\u0005\u000b\u0005\f\u0005f\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006q\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007w\b\u0007\n\u0007\f\u0007z\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007~\b\u0007\n\u0007\f\u0007\u0081\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0085\b\u0007\n\u0007\f\u0007\u0088"+
		"\t\u0007\u0001\u0007\u0003\u0007\u008b\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0096\b\b\n\b"+
		"\f\b\u0099\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00a0\b"+
		"\t\n\t\f\t\u00a3\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00ad\b\n\n\n\f\n\u00b0\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00c8\b\r\n\r\f\r\u00cb\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00d6\b\u000e\n\u000e\f\u000e\u00d9\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00e2\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00e6\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00eb\b"+
		"\u0011\u0001\u0011\u0000\u0002\u001a\u001c\u0012\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000"+
		"\u0002\u0001\u0000\u0004\u0006\u0002\u0000\u0018\u0019##\u00fb\u0000$"+
		"\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004?\u0001\u0000"+
		"\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000"+
		"\nW\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000er\u0001\u0000"+
		"\u0000\u0000\u0010\u008c\u0001\u0000\u0000\u0000\u0012\u009c\u0001\u0000"+
		"\u0000\u0000\u0014\u00a6\u0001\u0000\u0000\u0000\u0016\u00b3\u0001\u0000"+
		"\u0000\u0000\u0018\u00b7\u0001\u0000\u0000\u0000\u001a\u00bb\u0001\u0000"+
		"\u0000\u0000\u001c\u00cc\u0001\u0000\u0000\u0000\u001e\u00e1\u0001\u0000"+
		"\u0000\u0000 \u00e5\u0001\u0000\u0000\u0000\"\u00ea\u0001\u0000\u0000"+
		"\u0000$(\u0003\u0002\u0001\u0000%\'\u0005!\u0000\u0000&%\u0001\u0000\u0000"+
		"\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005"+
		"\u0000\u0000\u0001,\u0001\u0001\u0000\u0000\u0000-.\u0005\u0001\u0000"+
		"\u0000.2\u0005\u001b\u0000\u0000/1\u0005!\u0000\u00000/\u0001\u0000\u0000"+
		"\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000057\u0003"+
		"\u0004\u0002\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"79\u0001\u0000\u0000\u00008:\u0005!\u0000\u000098\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=>\u0003\n\u0005\u0000>\u0003\u0001\u0000"+
		"\u0000\u0000?C\u0005\u0002\u0000\u0000@B\u0005!\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DM\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"FJ\u0003\u0006\u0003\u0000GI\u0005!\u0000\u0000HG\u0001\u0000\u0000\u0000"+
		"IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MF\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000P\u0005\u0001\u0000\u0000\u0000QR\u0005\u001b\u0000"+
		"\u0000RS\u0005\u0003\u0000\u0000ST\u0003\b\u0004\u0000T\u0007\u0001\u0000"+
		"\u0000\u0000UV\u0007\u0000\u0000\u0000V\t\u0001\u0000\u0000\u0000W[\u0005"+
		"\u0007\u0000\u0000XZ\u0005!\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\d\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0003\f\u0006"+
		"\u0000_a\u0005!\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000"+
		"\u0000\u0000d^\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hi\u0005\b\u0000\u0000i\u000b\u0001\u0000\u0000\u0000jq\u0003\u000e\u0007"+
		"\u0000kq\u0003\u0018\f\u0000lq\u0003\n\u0005\u0000mq\u0003\u0010\b\u0000"+
		"nq\u0003\u0012\t\u0000oq\u0003\u0014\n\u0000pj\u0001\u0000\u0000\u0000"+
		"pk\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\r\u0001\u0000"+
		"\u0000\u0000rs\u0005\t\u0000\u0000st\u0003\u0016\u000b\u0000tx\u0005\n"+
		"\u0000\u0000uw\u0005!\u0000\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{\u007f\u0003\f\u0006\u0000"+
		"|~\u0005!\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u008a\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0086\u0005\u000b\u0000\u0000\u0083\u0085\u0005!\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0003\f\u0006\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u000f\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\f\u0000\u0000\u008d\u008e\u0005\r\u0000\u0000\u008e\u008f\u0003"+
		"\u0018\f\u0000\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u0091\u0003\u0016"+
		"\u000b\u0000\u0091\u0092\u0005\u000e\u0000\u0000\u0092\u0093\u0003\u0018"+
		"\f\u0000\u0093\u0097\u0005\u000f\u0000\u0000\u0094\u0096\u0005!\u0000"+
		"\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0003\f\u0006\u0000\u009b\u0011\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005\u0010\u0000\u0000\u009d\u00a1\u0003\u0016\u000b\u0000"+
		"\u009e\u00a0\u0005!\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\f\u0006\u0000\u00a5\u0013"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0011\u0000\u0000\u00a7\u00a8"+
		"\u0005\u001b\u0000\u0000\u00a8\u00a9\u0005\u0012\u0000\u0000\u00a9\u00aa"+
		"\u0007\u0001\u0000\u0000\u00aa\u00ae\u0005\u0003\u0000\u0000\u00ab\u00ad"+
		"\u0005!\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0003\f\u0006\u0000\u00b2\u0015\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0003\u001a\r\u0000\u00b4\u00b5\u0005\"\u0000"+
		"\u0000\u00b5\u00b6\u0003\u001a\r\u0000\u00b6\u0017\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005\u001b\u0000\u0000\u00b8\u00b9\u0005\u0013\u0000\u0000"+
		"\u00b9\u00ba\u0003\u001a\r\u0000\u00ba\u0019\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0006\r\uffff\uffff\u0000\u00bc\u00bd\u0003\u001c\u000e\u0000\u00bd"+
		"\u00c9\u0001\u0000\u0000\u0000\u00be\u00bf\n\u0004\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0014\u0000\u0000\u00c0\u00c8\u0003\u001c\u000e\u0000\u00c1\u00c2"+
		"\n\u0003\u0000\u0000\u00c2\u00c3\u0005\u0015\u0000\u0000\u00c3\u00c8\u0003"+
		"\u001c\u000e\u0000\u00c4\u00c5\n\u0002\u0000\u0000\u00c5\u00c6\u0005\""+
		"\u0000\u0000\u00c6\u00c8\u0003\u001c\u000e\u0000\u00c7\u00be\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c1\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u001b\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0006\u000e"+
		"\uffff\uffff\u0000\u00cd\u00ce\u0003\u001e\u000f\u0000\u00ce\u00d7\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\n\u0003\u0000\u0000\u00d0\u00d1\u0005\u0016"+
		"\u0000\u0000\u00d1\u00d6\u0003\u001e\u000f\u0000\u00d2\u00d3\n\u0002\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0017\u0000\u0000\u00d4\u00d6\u0003\u001e\u000f"+
		"\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u001d\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0005\r\u0000\u0000"+
		"\u00db\u00dc\u0003\u001a\r\u0000\u00dc\u00dd\u0005\u000f\u0000\u0000\u00dd"+
		"\u00e2\u0001\u0000\u0000\u0000\u00de\u00e2\u0005\u001b\u0000\u0000\u00df"+
		"\u00e2\u0003 \u0010\u0000\u00e0\u00e2\u0003\"\u0011\u0000\u00e1\u00da"+
		"\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u001f"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e6\u0005\u0019\u0000\u0000\u00e4\u00e6"+
		"\u0005\u0018\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6!\u0001\u0000\u0000\u0000\u00e7\u00eb\u0005"+
		"\u001d\u0000\u0000\u00e8\u00eb\u0005\u001e\u0000\u0000\u00e9\u00eb\u0005"+
		"\u001f\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb#\u0001\u0000"+
		"\u0000\u0000\u0019(26;CJO[bfpx\u007f\u0086\u008a\u0097\u00a1\u00ae\u00c7"+
		"\u00c9\u00d5\u00d7\u00e1\u00e5\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}