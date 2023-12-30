// Generated from c://Users//Vahid//Desktop//Dev//compiler//ASTListener//AssignmentStatement.g4 by ANTLR 4.13.1
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, INT=33, FLOAT=34, String=35, ID=36, ARRAY_TYPE=37, INT_ARRAY=38, 
		FLOAT_ARRAY=39, STRING_ARRAY=40, WS=41, NEWLINE=42, RELOP=43;
	public static final int
		RULE_start = 0, RULE_prog = 1, RULE_declaration = 2, RULE_variable_declaration = 3, 
		RULE_type = 4, RULE_compoundst = 5, RULE_statement = 6, RULE_ifst = 7, 
		RULE_whilest = 8, RULE_switchst = 9, RULE_case = 10, RULE_forst = 11, 
		RULE_cond = 12, RULE_assign = 13, RULE_expr = 14, RULE_term = 15, RULE_factor = 16, 
		RULE_number = 17, RULE_array = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "prog", "declaration", "variable_declaration", "type", "compoundst", 
			"statement", "ifst", "whilest", "switchst", "case", "forst", "cond", 
			"assign", "expr", "term", "factor", "number", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "':'", "'float'", "'int'", "'string'", "'begin'", 
			"'end'", "'if'", "'then'", "'else'", "'while'", "'do'", "'switch'", "'('", 
			"')'", "'{'", "'}'", "'case'", "'for'", "':='", "'to'", "'>'", "'<'", 
			"'=='", "'!='", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INT", "FLOAT", 
			"String", "ID", "ARRAY_TYPE", "INT_ARRAY", "FLOAT_ARRAY", "STRING_ARRAY", 
			"WS", "NEWLINE", "RELOP"
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
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			prog();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(39);
				match(NEWLINE);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			match(ID);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					match(NEWLINE);
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(55);
				declaration();
				}
			}

			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				match(NEWLINE);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(63);
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
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__1);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(66);
				match(NEWLINE);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				variable_declaration();
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(73);
						match(NEWLINE);
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				}
				setState(81); 
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
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ID);
			setState(84);
			match(T__2);
			setState(85);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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
	}

	public final CompoundstContext compoundst() throws RecognitionException {
		CompoundstContext _localctx = new CompoundstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compoundst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__6);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(90);
				match(NEWLINE);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				statement();
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					match(NEWLINE);
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68720546432L) != 0) );
			setState(106);
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
		public WhilestContext whilest() {
			return getRuleContext(WhilestContext.class,0);
		}
		public SwitchstContext switchst() {
			return getRuleContext(SwitchstContext.class,0);
		}
		public ForstContext forst() {
			return getRuleContext(ForstContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				ifst();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				assign();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				compoundst();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				whilest();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				switchst();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				forst();
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
	}

	public final IfstContext ifst() throws RecognitionException {
		IfstContext _localctx = new IfstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifst);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__8);
			setState(117);
			cond();
			setState(118);
			match(T__9);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(119);
				match(NEWLINE);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			statement();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					match(NEWLINE);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(132);
				match(T__10);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(133);
					match(NEWLINE);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
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
	}

	public final WhilestContext whilest() throws RecognitionException {
		WhilestContext _localctx = new WhilestContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whilest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__11);
			setState(143);
			cond();
			setState(144);
			match(T__12);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(145);
				match(NEWLINE);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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
	public static class SwitchstContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public TerminalNode ID() { return getToken(AssignmentStatementParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AssignmentStatementParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssignmentStatementParser.NEWLINE, i);
		}
		public List<CaseContext> case_() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case_(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public SwitchstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchst; }
	}

	public final SwitchstContext switchst() throws RecognitionException {
		SwitchstContext _localctx = new SwitchstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_switchst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__13);
			setState(154);
			match(T__14);
			setState(155);
			match(ID);
			setState(156);
			match(T__15);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(157);
				match(NEWLINE);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__16);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(164);
				match(NEWLINE);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				case_();
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
			setState(175);
			match(T__17);
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
	public static class CaseContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public TerminalNode INT() { return getToken(AssignmentStatementParser.INT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AssignmentStatementParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssignmentStatementParser.NEWLINE, i);
		}
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__18);
			setState(178);
			match(INT);
			setState(179);
			match(T__2);
			setState(180);
			statement();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(181);
				match(NEWLINE);
				}
				}
				setState(186);
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
	public static class ForstContext extends ParserRuleContext {
		public  value_attr = str();
		public  type_attr = str();
		public TerminalNode ID() { return getToken(AssignmentStatementParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
	}

	public final ForstContext forst() throws RecognitionException {
		ForstContext _localctx = new ForstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__19);
			setState(188);
			match(ID);
			setState(189);
			match(T__20);
			setState(190);
			expr(0);
			setState(191);
			match(T__21);
			setState(192);
			expr(0);
			setState(193);
			match(T__12);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(194);
				match(NEWLINE);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
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
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			expr(0);
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
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
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ID);
			setState(207);
			match(T__20);
			setState(208);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Term4Context extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term4Context(ExprContext ctx) { copyFrom(ctx); }
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Term4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(211);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_term_plusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(214);
						match(T__28);
						setState(215);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new Expr_term_minusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(217);
						match(T__29);
						setState(218);
						term(0);
						}
						break;
					case 3:
						{
						_localctx = new Expr_term_relopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(220);
						match(RELOP);
						setState(221);
						term(0);
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Factor3Context extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Factor3Context(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Factor3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(228);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new Term_fact_mutiplyContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(230);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(231);
						match(T__30);
						setState(232);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new Term_fact_divideContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(233);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(234);
						match(T__31);
						setState(235);
						factor();
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Fact_idContext extends FactorContext {
		public TerminalNode ID() { return getToken(AssignmentStatementParser.ID, 0); }
		public Fact_idContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Fact_numberContext extends FactorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Fact_numberContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Fact_arrayContext extends FactorContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Fact_arrayContext(FactorContext ctx) { copyFrom(ctx); }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new Fact_exprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__14);
				setState(242);
				expr(0);
				setState(243);
				match(T__15);
				}
				break;
			case ID:
				_localctx = new Fact_idContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(ID);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new Fact_numberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				number();
				}
				break;
			case INT_ARRAY:
			case FLOAT_ARRAY:
			case STRING_ARRAY:
				_localctx = new Fact_arrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Number_intContext extends NumberContext {
		public TerminalNode INT() { return getToken(AssignmentStatementParser.INT, 0); }
		public Number_intContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				_localctx = new Number_floatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(FLOAT);
				}
				break;
			case INT:
				_localctx = new Number_intContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_stringContext extends ArrayContext {
		public TerminalNode STRING_ARRAY() { return getToken(AssignmentStatementParser.STRING_ARRAY, 0); }
		public Array_stringContext(ArrayContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_intContext extends ArrayContext {
		public TerminalNode INT_ARRAY() { return getToken(AssignmentStatementParser.INT_ARRAY, 0); }
		public Array_intContext(ArrayContext ctx) { copyFrom(ctx); }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_ARRAY:
				_localctx = new Array_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(INT_ARRAY);
				}
				break;
			case FLOAT_ARRAY:
				_localctx = new Array_floatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(FLOAT_ARRAY);
				}
				break;
			case STRING_ARRAY:
				_localctx = new Array_stringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 15:
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
		"\u0004\u0001+\u0104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"3\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0003\u00019\b\u0001\u0001"+
		"\u0001\u0004\u0001<\b\u0001\u000b\u0001\f\u0001=\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002D\b\u0002\n\u0002\f\u0002G\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002K\b\u0002\n\u0002\f\u0002N\t\u0002"+
		"\u0004\u0002P\b\u0002\u000b\u0002\f\u0002Q\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\\\b\u0005\n\u0005\f\u0005_\t\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005c\b\u0005\u000b\u0005\f\u0005d\u0004\u0005g\b\u0005\u000b\u0005"+
		"\f\u0005h\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007y\b\u0007\n\u0007\f\u0007"+
		"|\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0080\b\u0007\n\u0007\f"+
		"\u0007\u0083\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0087\b\u0007"+
		"\n\u0007\f\u0007\u008a\t\u0007\u0001\u0007\u0003\u0007\u008d\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0093\b\b\n\b\f\b\u0096\t\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u009f\b\t\n\t"+
		"\f\t\u00a2\t\t\u0001\t\u0001\t\u0005\t\u00a6\b\t\n\t\f\t\u00a9\t\t\u0001"+
		"\t\u0004\t\u00ac\b\t\u000b\t\f\t\u00ad\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u00b7\b\n\n\n\f\n\u00ba\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00c4\b\u000b\n\u000b\f\u000b\u00c7\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00df\b\u000e\n\u000e\f\u000e\u00e2\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ed\b\u000f\n\u000f\f\u000f"+
		"\u00f0\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00f9\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00fd\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0102\b\u0012\u0001\u0012\u0000\u0002\u001c\u001e\u0013\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$\u0000\u0002\u0001\u0000\u0004\u0006\u0001\u0000\u0017\u001c\u0114\u0000"+
		"&\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u0004A\u0001"+
		"\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000"+
		"\u0000\nY\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000et\u0001"+
		"\u0000\u0000\u0000\u0010\u008e\u0001\u0000\u0000\u0000\u0012\u0099\u0001"+
		"\u0000\u0000\u0000\u0014\u00b1\u0001\u0000\u0000\u0000\u0016\u00bb\u0001"+
		"\u0000\u0000\u0000\u0018\u00ca\u0001\u0000\u0000\u0000\u001a\u00ce\u0001"+
		"\u0000\u0000\u0000\u001c\u00d2\u0001\u0000\u0000\u0000\u001e\u00e3\u0001"+
		"\u0000\u0000\u0000 \u00f8\u0001\u0000\u0000\u0000\"\u00fc\u0001\u0000"+
		"\u0000\u0000$\u0101\u0001\u0000\u0000\u0000&*\u0003\u0002\u0001\u0000"+
		"\')\u0005*\u0000\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001.\u0001"+
		"\u0001\u0000\u0000\u0000/0\u0005\u0001\u0000\u000004\u0005$\u0000\u0000"+
		"13\u0005*\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000079\u0003\u0004\u0002\u000087\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:<\u0005"+
		"*\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?@\u0003\n\u0005\u0000@\u0003\u0001\u0000\u0000\u0000AE\u0005\u0002\u0000"+
		"\u0000BD\u0005*\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FO\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000HL\u0003\u0006\u0003\u0000IK\u0005"+
		"*\u0000\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OH\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0005\u0001"+
		"\u0000\u0000\u0000ST\u0005$\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0003"+
		"\b\u0004\u0000V\u0007\u0001\u0000\u0000\u0000WX\u0007\u0000\u0000\u0000"+
		"X\t\u0001\u0000\u0000\u0000Y]\u0005\u0007\u0000\u0000Z\\\u0005*\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^f\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000`b\u0003\f\u0006\u0000ac\u0005*\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\b\u0000\u0000k\u000b\u0001"+
		"\u0000\u0000\u0000ls\u0003\u000e\u0007\u0000ms\u0003\u001a\r\u0000ns\u0003"+
		"\n\u0005\u0000os\u0003\u0010\b\u0000ps\u0003\u0012\t\u0000qs\u0003\u0016"+
		"\u000b\u0000rl\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000\u0000rn\u0001"+
		"\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000s\r\u0001\u0000\u0000\u0000tu\u0005\t\u0000"+
		"\u0000uv\u0003\u0018\f\u0000vz\u0005\n\u0000\u0000wy\u0005*\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}\u0081\u0003\f\u0006\u0000~\u0080\u0005*\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u008c"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0088"+
		"\u0005\u000b\u0000\u0000\u0085\u0087\u0005*\u0000\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008d\u0003"+
		"\f\u0006\u0000\u008c\u0084\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u008f\u0005\f\u0000"+
		"\u0000\u008f\u0090\u0003\u0018\f\u0000\u0090\u0094\u0005\r\u0000\u0000"+
		"\u0091\u0093\u0005*\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0003\f\u0006\u0000\u0098\u0011"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000e\u0000\u0000\u009a\u009b"+
		"\u0005\u000f\u0000\u0000\u009b\u009c\u0005$\u0000\u0000\u009c\u00a0\u0005"+
		"\u0010\u0000\u0000\u009d\u009f\u0005*\u0000\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a7\u0005\u0011"+
		"\u0000\u0000\u00a4\u00a6\u0005*\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ac\u0003\u0014\n\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0012\u0000\u0000"+
		"\u00b0\u0013\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0013\u0000\u0000"+
		"\u00b2\u00b3\u0005!\u0000\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4"+
		"\u00b8\u0003\f\u0006\u0000\u00b5\u00b7\u0005*\u0000\u0000\u00b6\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0015"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0014\u0000\u0000\u00bc\u00bd\u0005$\u0000\u0000\u00bd\u00be\u0005"+
		"\u0015\u0000\u0000\u00be\u00bf\u0003\u001c\u000e\u0000\u00bf\u00c0\u0005"+
		"\u0016\u0000\u0000\u00c0\u00c1\u0003\u001c\u000e\u0000\u00c1\u00c5\u0005"+
		"\r\u0000\u0000\u00c2\u00c4\u0005*\u0000\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\f\u0006"+
		"\u0000\u00c9\u0017\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\u001c\u000e"+
		"\u0000\u00cb\u00cc\u0007\u0001\u0000\u0000\u00cc\u00cd\u0003\u001c\u000e"+
		"\u0000\u00cd\u0019\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005$\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0015\u0000\u0000\u00d0\u00d1\u0003\u001c\u000e\u0000"+
		"\u00d1\u001b\u0001\u0000\u0000\u0000\u00d2\u00d3\u0006\u000e\uffff\uffff"+
		"\u0000\u00d3\u00d4\u0003\u001e\u000f\u0000\u00d4\u00e0\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\n\u0004\u0000\u0000\u00d6\u00d7\u0005\u001d\u0000\u0000"+
		"\u00d7\u00df\u0003\u001e\u000f\u0000\u00d8\u00d9\n\u0003\u0000\u0000\u00d9"+
		"\u00da\u0005\u001e\u0000\u0000\u00da\u00df\u0003\u001e\u000f\u0000\u00db"+
		"\u00dc\n\u0002\u0000\u0000\u00dc\u00dd\u0005+\u0000\u0000\u00dd\u00df"+
		"\u0003\u001e\u000f\u0000\u00de\u00d5\u0001\u0000\u0000\u0000\u00de\u00d8"+
		"\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00df\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u001d\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0006\u000f\uffff\uffff\u0000\u00e4"+
		"\u00e5\u0003 \u0010\u0000\u00e5\u00ee\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\n\u0003\u0000\u0000\u00e7\u00e8\u0005\u001f\u0000\u0000\u00e8\u00ed\u0003"+
		" \u0010\u0000\u00e9\u00ea\n\u0002\u0000\u0000\u00ea\u00eb\u0005 \u0000"+
		"\u0000\u00eb\u00ed\u0003 \u0010\u0000\u00ec\u00e6\u0001\u0000\u0000\u0000"+
		"\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u001f\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0005\u000f\u0000\u0000\u00f2\u00f3\u0003\u001c\u000e\u0000"+
		"\u00f3\u00f4\u0005\u0010\u0000\u0000\u00f4\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f9\u0005$\u0000\u0000\u00f6\u00f9\u0003\"\u0011\u0000\u00f7"+
		"\u00f9\u0003$\u0012\u0000\u00f8\u00f1\u0001\u0000\u0000\u0000\u00f8\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9!\u0001\u0000\u0000\u0000\u00fa\u00fd\u0005"+
		"\"\u0000\u0000\u00fb\u00fd\u0005!\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd#\u0001\u0000\u0000"+
		"\u0000\u00fe\u0102\u0005&\u0000\u0000\u00ff\u0102\u0005\'\u0000\u0000"+
		"\u0100\u0102\u0005(\u0000\u0000\u0101\u00fe\u0001\u0000\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102"+
		"%\u0001\u0000\u0000\u0000\u001c*48=ELQ]dhrz\u0081\u0088\u008c\u0094\u00a0"+
		"\u00a7\u00ad\u00b8\u00c5\u00de\u00e0\u00ec\u00ee\u00f8\u00fc\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}