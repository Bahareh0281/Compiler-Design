// Generated from e://IUST//Fall-2023//Compiler//TA-Session-01//grammars//typevar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class typevarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, SEMICOL=3, SPACE=4, STR=5;
	public static final int
		RULE_start = 0, RULE_instruction = 1, RULE_intdec = 2, RULE_floatdec = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instruction", "intdec", "floatdec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "';'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "SEMICOL", "SPACE", "STR"
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
	public String getGrammarFileName() { return "typevar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public typevarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(typevarParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
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
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==FLOAT) {
				{
				{
				setState(8);
				instruction();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
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
	public static class InstructionContext extends ParserRuleContext {
		public IntdecContext intdec() {
			return getRuleContext(IntdecContext.class,0);
		}
		public FloatdecContext floatdec() {
			return getRuleContext(FloatdecContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				intdec();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				floatdec();
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
	public static class IntdecContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(typevarParser.INT, 0); }
		public TerminalNode SPACE() { return getToken(typevarParser.SPACE, 0); }
		public TerminalNode STR() { return getToken(typevarParser.STR, 0); }
		public TerminalNode SEMICOL() { return getToken(typevarParser.SEMICOL, 0); }
		public IntdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intdec; }
	}

	public final IntdecContext intdec() throws RecognitionException {
		IntdecContext _localctx = new IntdecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_intdec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(INT);
			setState(21);
			match(SPACE);
			setState(22);
			match(STR);
			setState(23);
			match(SEMICOL);
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
	public static class FloatdecContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(typevarParser.FLOAT, 0); }
		public TerminalNode SPACE() { return getToken(typevarParser.SPACE, 0); }
		public TerminalNode STR() { return getToken(typevarParser.STR, 0); }
		public TerminalNode SEMICOL() { return getToken(typevarParser.SEMICOL, 0); }
		public FloatdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatdec; }
	}

	public final FloatdecContext floatdec() throws RecognitionException {
		FloatdecContext _localctx = new FloatdecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_floatdec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(FLOAT);
			setState(26);
			match(SPACE);
			setState(27);
			match(STR);
			setState(28);
			match(SEMICOL);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0005\u001f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000"+
		"\n\b\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0000\u001c\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000"+
		"\u0000\u0000\u0004\u0014\u0001\u0000\u0000\u0000\u0006\u0019\u0001\u0000"+
		"\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n"+
		"\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001"+
		"\u0000\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0005\u0000\u0000\u0001\u000f\u0001\u0001\u0000"+
		"\u0000\u0000\u0010\u0013\u0003\u0004\u0002\u0000\u0011\u0013\u0003\u0006"+
		"\u0003\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0011\u0001\u0000"+
		"\u0000\u0000\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0001"+
		"\u0000\u0000\u0015\u0016\u0005\u0004\u0000\u0000\u0016\u0017\u0005\u0005"+
		"\u0000\u0000\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u0005\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a\u001b\u0005\u0004"+
		"\u0000\u0000\u001b\u001c\u0005\u0005\u0000\u0000\u001c\u001d\u0005\u0003"+
		"\u0000\u0000\u001d\u0007\u0001\u0000\u0000\u0000\u0002\u000b\u0012";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}