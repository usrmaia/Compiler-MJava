// Generated from /home/srmaia/Documentos/GitHub/Compiler-MJava/mjava.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mjavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		WHITESPACE=39, COMMENTLINES=40, COMMENTLINE=41, RESERVEDWORDS=42, NUMBER=43, 
		OPERATORSPOINTING=44, ID=45;
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_classe = 2, RULE_var = 3, RULE_metodo = 4, 
		RULE_params = 5, RULE_tipo = 6, RULE_cmd = 7, RULE_exp = 8, RULE_rexp = 9, 
		RULE_aexp = 10, RULE_mexp = 11, RULE_sexp = 12, RULE_pexp = 13, RULE_exps = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "classe", "var", "metodo", "params", "tipo", "cmd", "exp", 
			"rexp", "aexp", "mexp", "sexp", "pexp", "exps"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
			"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "'return'", 
			"','", "'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'='", "'&&'", "'<'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'!'", 
			"'true'", "'false'", "'new'", "'.'", "'length'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WHITESPACE", "COMMENTLINES", "COMMENTLINE", "RESERVEDWORDS", 
			"NUMBER", "OPERATORSPOINTING", "ID"
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
	public String getGrammarFileName() { return "mjava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mjavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ClasseContext> classe() {
			return getRuleContexts(ClasseContext.class);
		}
		public ClasseContext classe(int i) {
			return getRuleContext(ClasseContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					classe();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(36);
			main();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(37);
				classe();
				}
				}
				setState(42);
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

	public static class MainContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(mjavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mjavaParser.ID, i);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(ID);
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			setState(47);
			match(T__3);
			setState(48);
			match(T__4);
			setState(49);
			match(T__5);
			setState(50);
			match(T__6);
			setState(51);
			match(T__7);
			setState(52);
			match(T__8);
			setState(53);
			match(T__9);
			setState(54);
			match(ID);
			setState(55);
			match(T__10);
			setState(56);
			match(T__1);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				setState(57);
				cmd();
				}
			}

			setState(60);
			match(T__11);
			setState(61);
			match(T__11);
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

	public static class ClasseContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(mjavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mjavaParser.ID, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__0);
			setState(64);
			match(ID);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(65);
				match(T__12);
				setState(66);
				match(ID);
				}
			}

			setState(69);
			match(T__1);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__17:
				case ID:
					{
					setState(70);
					var();
					}
					break;
				case T__2:
					{
					setState(71);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__11);
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

	public static class VarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(mjavaParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			tipo();
			setState(80);
			match(ID);
			setState(81);
			match(T__13);
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

	public static class MetodoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(mjavaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__2);
			setState(84);
			tipo();
			setState(85);
			match(ID);
			setState(86);
			match(T__6);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(87);
				params();
				}
			}

			setState(90);
			match(T__10);
			setState(91);
			match(T__1);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(92);
					var();
					}
					break;
				case 2:
					{
					setState(93);
					cmd();
					}
					break;
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__14);
			setState(100);
			exp(0);
			setState(101);
			match(T__13);
			setState(102);
			match(T__11);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(mjavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mjavaParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			tipo();
			setState(105);
			match(ID);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(106);
				match(T__15);
				setState(107);
				tipo();
				setState(108);
				match(ID);
				}
				}
				setState(114);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjavaParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__16);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(116);
					match(T__8);
					setState(117);
					match(T__9);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(T__17);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(ID);
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

	public static class CmdContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ID() { return getToken(mjavaParser.ID, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__1);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
					{
					setState(129);
					cmd();
					}
				}

				setState(132);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__18);
				setState(134);
				match(T__6);
				setState(135);
				exp(0);
				setState(136);
				match(T__10);
				setState(137);
				cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__18);
				setState(140);
				match(T__6);
				setState(141);
				exp(0);
				setState(142);
				match(T__10);
				setState(143);
				cmd();
				setState(144);
				match(T__19);
				setState(145);
				cmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(T__20);
				setState(148);
				match(T__6);
				setState(149);
				exp(0);
				setState(150);
				match(T__10);
				setState(151);
				cmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(T__21);
				setState(154);
				match(T__6);
				setState(155);
				exp(0);
				setState(156);
				match(T__10);
				setState(157);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(ID);
				setState(160);
				match(T__22);
				setState(161);
				exp(0);
				setState(162);
				match(T__13);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				match(ID);
				setState(165);
				match(T__8);
				setState(166);
				exp(0);
				setState(167);
				match(T__9);
				setState(168);
				match(T__22);
				setState(169);
				exp(0);
				setState(170);
				match(T__13);
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

	public static class ExpContext extends ParserRuleContext {
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(175);
			rexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(177);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(178);
					match(T__23);
					setState(179);
					rexp(0);
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class RexpContext extends ParserRuleContext {
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public RexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexp; }
	}

	public final RexpContext rexp() throws RecognitionException {
		return rexp(0);
	}

	private RexpContext rexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RexpContext _localctx = new RexpContext(_ctx, _parentState);
		RexpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_rexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(186);
			aexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(188);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(189);
						match(T__24);
						setState(190);
						aexp(0);
						}
						break;
					case 2:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(191);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(192);
						match(T__25);
						setState(193);
						aexp(0);
						}
						break;
					case 3:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(194);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(195);
						match(T__26);
						setState(196);
						aexp(0);
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AexpContext extends ParserRuleContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
	}

	public final AexpContext aexp() throws RecognitionException {
		return aexp(0);
	}

	private AexpContext aexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexpContext _localctx = new AexpContext(_ctx, _parentState);
		AexpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_aexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(203);
			mexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206);
						match(T__27);
						setState(207);
						mexp(0);
						}
						break;
					case 2:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(208);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(209);
						match(T__28);
						setState(210);
						mexp(0);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class MexpContext extends ParserRuleContext {
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public MexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mexp; }
	}

	public final MexpContext mexp() throws RecognitionException {
		return mexp(0);
	}

	private MexpContext mexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MexpContext _localctx = new MexpContext(_ctx, _parentState);
		MexpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_mexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			sexp();
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(219);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(220);
						match(T__29);
						setState(221);
						sexp();
						}
						break;
					case 2:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(222);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(223);
						match(T__30);
						setState(224);
						sexp();
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class SexpContext extends ParserRuleContext {
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
		public SexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexp; }
	}

	public final SexpContext sexp() throws RecognitionException {
		SexpContext _localctx = new SexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sexp);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(T__31);
				setState(231);
				sexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(T__28);
				setState(233);
				sexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(T__33);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(T__34);
				setState(237);
				match(T__16);
				setState(238);
				match(T__8);
				setState(239);
				exp(0);
				setState(240);
				match(T__9);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				pexp(0);
				setState(243);
				match(T__35);
				setState(244);
				match(T__36);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				pexp(0);
				setState(247);
				match(T__8);
				setState(248);
				exp(0);
				setState(249);
				match(T__9);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(251);
				pexp(0);
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

	public static class PexpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjavaParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(mjavaParser.NUMBER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public PexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pexp; }
	}

	public final PexpContext pexp() throws RecognitionException {
		return pexp(0);
	}

	private PexpContext pexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PexpContext _localctx = new PexpContext(_ctx, _parentState);
		PexpContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_pexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(255);
				match(ID);
				}
				break;
			case NUMBER:
				{
				setState(256);
				match(NUMBER);
				}
				break;
			case T__37:
				{
				setState(257);
				match(T__37);
				}
				break;
			case T__34:
				{
				setState(258);
				match(T__34);
				setState(259);
				match(ID);
				setState(260);
				match(T__6);
				setState(261);
				match(T__10);
				}
				break;
			case T__6:
				{
				setState(262);
				match(T__6);
				setState(263);
				exp(0);
				setState(264);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new PexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pexp);
						setState(268);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(269);
						match(T__35);
						setState(270);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new PexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pexp);
						setState(271);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(272);
						match(T__35);
						setState(273);
						match(ID);
						setState(274);
						match(T__6);
						setState(276);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << NUMBER) | (1L << ID))) != 0)) {
							{
							setState(275);
							exps();
							}
						}

						setState(278);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class ExpsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			exp(0);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(285);
				match(T__15);
				setState(286);
				exp(0);
				}
				}
				setState(291);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 9:
			return rexp_sempred((RexpContext)_localctx, predIndex);
		case 10:
			return aexp_sempred((AexpContext)_localctx, predIndex);
		case 11:
			return mexp_sempred((MexpContext)_localctx, predIndex);
		case 13:
			return pexp_sempred((PexpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rexp_sempred(RexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean aexp_sempred(AexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mexp_sempred(MexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean pexp_sempred(PexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5"+
		"\4F\n\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6d\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13\7\3\b"+
		"\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\5\b\u0081\n\b\3\t\3\t\5\t"+
		"\u0085\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00af\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\n\u00b7\n\n\f\n\16\n\u00ba\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u00c8\n\13\f\13\16\13\u00cb\13\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d6\n\f\f\f\16\f\u00d9\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e4\n\r\f\r\16\r\u00e7\13\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ff\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010d\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0117\n\17\3\17\7\17\u011a\n\17\f\17\16"+
		"\17\u011d\13\17\3\20\3\20\3\20\7\20\u0122\n\20\f\20\16\20\u0125\13\20"+
		"\3\20\2\7\22\24\26\30\34\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2"+
		"\2\u0143\2#\3\2\2\2\4-\3\2\2\2\6A\3\2\2\2\bQ\3\2\2\2\nU\3\2\2\2\fj\3\2"+
		"\2\2\16\u0080\3\2\2\2\20\u00ae\3\2\2\2\22\u00b0\3\2\2\2\24\u00bb\3\2\2"+
		"\2\26\u00cc\3\2\2\2\30\u00da\3\2\2\2\32\u00fe\3\2\2\2\34\u010c\3\2\2\2"+
		"\36\u011e\3\2\2\2 \"\5\6\4\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2"+
		"$&\3\2\2\2%#\3\2\2\2&*\5\4\3\2\')\5\6\4\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2"+
		"\2*+\3\2\2\2+\3\3\2\2\2,*\3\2\2\2-.\7\3\2\2./\7/\2\2/\60\7\4\2\2\60\61"+
		"\7\5\2\2\61\62\7\6\2\2\62\63\7\7\2\2\63\64\7\b\2\2\64\65\7\t\2\2\65\66"+
		"\7\n\2\2\66\67\7\13\2\2\678\7\f\2\289\7/\2\29:\7\r\2\2:<\7\4\2\2;=\5\20"+
		"\t\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\16\2\2?@\7\16\2\2@\5\3\2\2\2AB"+
		"\7\3\2\2BE\7/\2\2CD\7\17\2\2DF\7/\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GL"+
		"\7\4\2\2HK\5\b\5\2IK\5\n\6\2JH\3\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2L"+
		"M\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\16\2\2P\7\3\2\2\2QR\5\16\b\2RS\7/\2"+
		"\2ST\7\20\2\2T\t\3\2\2\2UV\7\5\2\2VW\5\16\b\2WX\7/\2\2XZ\7\t\2\2Y[\5\f"+
		"\7\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\r\2\2]b\7\4\2\2^a\5\b\5\2_a\5"+
		"\20\t\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db"+
		"\3\2\2\2ef\7\21\2\2fg\5\22\n\2gh\7\20\2\2hi\7\16\2\2i\13\3\2\2\2jk\5\16"+
		"\b\2kr\7/\2\2lm\7\22\2\2mn\5\16\b\2no\7/\2\2oq\3\2\2\2pl\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tr\3\2\2\2uz\7\23\2\2vw\7\13\2\2wy"+
		"\7\f\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0081\3\2\2\2|z\3\2"+
		"\2\2}\u0081\7\23\2\2~\u0081\7\24\2\2\177\u0081\7/\2\2\u0080u\3\2\2\2\u0080"+
		"}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\17\3\2\2\2\u0082\u0084"+
		"\7\4\2\2\u0083\u0085\5\20\t\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u00af\7\16\2\2\u0087\u0088\7\25\2\2\u0088\u0089"+
		"\7\t\2\2\u0089\u008a\5\22\n\2\u008a\u008b\7\r\2\2\u008b\u008c\5\20\t\2"+
		"\u008c\u00af\3\2\2\2\u008d\u008e\7\25\2\2\u008e\u008f\7\t\2\2\u008f\u0090"+
		"\5\22\n\2\u0090\u0091\7\r\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\26\2"+
		"\2\u0093\u0094\5\20\t\2\u0094\u00af\3\2\2\2\u0095\u0096\7\27\2\2\u0096"+
		"\u0097\7\t\2\2\u0097\u0098\5\22\n\2\u0098\u0099\7\r\2\2\u0099\u009a\5"+
		"\20\t\2\u009a\u00af\3\2\2\2\u009b\u009c\7\30\2\2\u009c\u009d\7\t\2\2\u009d"+
		"\u009e\5\22\n\2\u009e\u009f\7\r\2\2\u009f\u00a0\7\20\2\2\u00a0\u00af\3"+
		"\2\2\2\u00a1\u00a2\7/\2\2\u00a2\u00a3\7\31\2\2\u00a3\u00a4\5\22\n\2\u00a4"+
		"\u00a5\7\20\2\2\u00a5\u00af\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7\u00a8\7\13"+
		"\2\2\u00a8\u00a9\5\22\n\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\7\31\2\2\u00ab"+
		"\u00ac\5\22\n\2\u00ac\u00ad\7\20\2\2\u00ad\u00af\3\2\2\2\u00ae\u0082\3"+
		"\2\2\2\u00ae\u0087\3\2\2\2\u00ae\u008d\3\2\2\2\u00ae\u0095\3\2\2\2\u00ae"+
		"\u009b\3\2\2\2\u00ae\u00a1\3\2\2\2\u00ae\u00a6\3\2\2\2\u00af\21\3\2\2"+
		"\2\u00b0\u00b1\b\n\1\2\u00b1\u00b2\5\24\13\2\u00b2\u00b8\3\2\2\2\u00b3"+
		"\u00b4\f\4\2\2\u00b4\u00b5\7\32\2\2\u00b5\u00b7\5\24\13\2\u00b6\u00b3"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\23\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\b\13\1\2\u00bc\u00bd\5\26"+
		"\f\2\u00bd\u00c9\3\2\2\2\u00be\u00bf\f\6\2\2\u00bf\u00c0\7\33\2\2\u00c0"+
		"\u00c8\5\26\f\2\u00c1\u00c2\f\5\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00c8\5"+
		"\26\f\2\u00c4\u00c5\f\4\2\2\u00c5\u00c6\7\35\2\2\u00c6\u00c8\5\26\f\2"+
		"\u00c7\u00be\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\25\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\b\f\1\2\u00cd\u00ce\5\30\r\2\u00ce\u00d7\3"+
		"\2\2\2\u00cf\u00d0\f\5\2\2\u00d0\u00d1\7\36\2\2\u00d1\u00d6\5\30\r\2\u00d2"+
		"\u00d3\f\4\2\2\u00d3\u00d4\7\37\2\2\u00d4\u00d6\5\30\r\2\u00d5\u00cf\3"+
		"\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\27\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\b\r\1"+
		"\2\u00db\u00dc\5\32\16\2\u00dc\u00e5\3\2\2\2\u00dd\u00de\f\5\2\2\u00de"+
		"\u00df\7 \2\2\u00df\u00e4\5\32\16\2\u00e0\u00e1\f\4\2\2\u00e1\u00e2\7"+
		"!\2\2\u00e2\u00e4\5\32\16\2\u00e3\u00dd\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\31\3\2\2"+
		"\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\"\2\2\u00e9\u00ff\5\32\16\2\u00ea"+
		"\u00eb\7\37\2\2\u00eb\u00ff\5\32\16\2\u00ec\u00ff\7#\2\2\u00ed\u00ff\7"+
		"$\2\2\u00ee\u00ef\7%\2\2\u00ef\u00f0\7\23\2\2\u00f0\u00f1\7\13\2\2\u00f1"+
		"\u00f2\5\22\n\2\u00f2\u00f3\7\f\2\2\u00f3\u00ff\3\2\2\2\u00f4\u00f5\5"+
		"\34\17\2\u00f5\u00f6\7&\2\2\u00f6\u00f7\7\'\2\2\u00f7\u00ff\3\2\2\2\u00f8"+
		"\u00f9\5\34\17\2\u00f9\u00fa\7\13\2\2\u00fa\u00fb\5\22\n\2\u00fb\u00fc"+
		"\7\f\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff\5\34\17\2\u00fe\u00e8\3\2\2\2"+
		"\u00fe\u00ea\3\2\2\2\u00fe\u00ec\3\2\2\2\u00fe\u00ed\3\2\2\2\u00fe\u00ee"+
		"\3\2\2\2\u00fe\u00f4\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\33\3\2\2\2\u0100\u0101\b\17\1\2\u0101\u010d\7/\2\2\u0102\u010d\7-\2\2"+
		"\u0103\u010d\7(\2\2\u0104\u0105\7%\2\2\u0105\u0106\7/\2\2\u0106\u0107"+
		"\7\t\2\2\u0107\u010d\7\r\2\2\u0108\u0109\7\t\2\2\u0109\u010a\5\22\n\2"+
		"\u010a\u010b\7\r\2\2\u010b\u010d\3\2\2\2\u010c\u0100\3\2\2\2\u010c\u0102"+
		"\3\2\2\2\u010c\u0103\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u0108\3\2\2\2\u010d"+
		"\u011b\3\2\2\2\u010e\u010f\f\4\2\2\u010f\u0110\7&\2\2\u0110\u011a\7/\2"+
		"\2\u0111\u0112\f\3\2\2\u0112\u0113\7&\2\2\u0113\u0114\7/\2\2\u0114\u0116"+
		"\7\t\2\2\u0115\u0117\5\36\20\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u011a\7\r\2\2\u0119\u010e\3\2\2\2\u0119\u0111"+
		"\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\35\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0123\5\22\n\2\u011f\u0120\7\22"+
		"\2\2\u0120\u0122\5\22\n\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\37\3\2\2\2\u0125\u0123\3\2\2"+
		"\2\35#*<EJLZ`brz\u0080\u0084\u00ae\u00b8\u00c7\u00c9\u00d5\u00d7\u00e3"+
		"\u00e5\u00fe\u010c\u0116\u0119\u011b\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}