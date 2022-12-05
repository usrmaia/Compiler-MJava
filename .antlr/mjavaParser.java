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
		T__38=39, T__39=40, ID_=41, COMMENT=42, TEXT=43, WHITESPACE=44, LINEBREAK=45, 
		TAB=46, RETURN=47, PAGEFEATURE=48;
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
			"'String'", "'['", "']'", "')'", "'}'", "'extends'", "'return'", "';'", 
			"','", "'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'='", "'&&'", "'<'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'!'", 
			"'true'", "'false'", "'num'", "'new'", "'.'", "'length'", "'this'", "'id'", 
			null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID_", "COMMENT", "TEXT", "WHITESPACE", 
			"LINEBREAK", "TAB", "RETURN", "PAGEFEATURE"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			main();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(31);
				classe();
				}
				}
				setState(36);
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
		public TerminalNode WHITESPACE() { return getToken(mjavaParser.WHITESPACE, 0); }
		public List<TerminalNode> ID_() { return getTokens(mjavaParser.ID_); }
		public TerminalNode ID_(int i) {
			return getToken(mjavaParser.ID_, i);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(38);
			match(WHITESPACE);
			setState(39);
			match(ID_);
			setState(40);
			match(T__1);
			setState(41);
			match(T__2);
			setState(42);
			match(T__3);
			setState(43);
			match(T__4);
			setState(44);
			match(T__5);
			setState(45);
			match(T__6);
			setState(46);
			match(T__7);
			setState(47);
			match(T__8);
			setState(48);
			match(T__9);
			setState(49);
			match(ID_);
			setState(50);
			match(T__10);
			setState(51);
			match(T__1);
			setState(52);
			cmd();
			setState(53);
			match(T__11);
			setState(54);
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
		public List<TerminalNode> ID_() { return getTokens(mjavaParser.ID_); }
		public TerminalNode ID_(int i) {
			return getToken(mjavaParser.ID_, i);
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
			setState(56);
			match(T__0);
			setState(57);
			match(ID_);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(58);
				match(T__8);
				setState(59);
				match(T__12);
				setState(60);
				match(ID_);
				setState(61);
				match(T__9);
				}
			}

			setState(64);
			match(T__1);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << ID_))) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__17:
				case ID_:
					{
					setState(65);
					var();
					}
					break;
				case T__2:
					{
					setState(66);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
		public TerminalNode ID_() { return getToken(mjavaParser.ID_, 0); }
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
			setState(74);
			tipo();
			setState(75);
			match(ID_);
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
		public TerminalNode ID_() { return getToken(mjavaParser.ID_, 0); }
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
			setState(77);
			match(T__2);
			setState(78);
			tipo();
			setState(79);
			match(ID_);
			setState(80);
			match(T__6);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << ID_))) != 0)) {
				{
				setState(81);
				params();
				}
			}

			setState(84);
			match(T__10);
			setState(85);
			match(T__1);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID_))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(86);
					var();
					}
					break;
				case 2:
					{
					setState(87);
					cmd();
					}
					break;
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__13);
			setState(94);
			exp(0);
			setState(95);
			match(T__14);
			setState(96);
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
		public List<TerminalNode> ID_() { return getTokens(mjavaParser.ID_); }
		public TerminalNode ID_(int i) {
			return getToken(mjavaParser.ID_, i);
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
			setState(98);
			tipo();
			setState(99);
			match(ID_);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(100);
				match(T__15);
				setState(101);
				tipo();
				setState(102);
				match(ID_);
				}
				}
				setState(108);
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
		public TerminalNode ID_() { return getToken(mjavaParser.ID_, 0); }
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__16);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(110);
					match(T__8);
					setState(111);
					match(T__9);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(T__17);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(ID_);
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
		public TerminalNode ID_() { return getToken(mjavaParser.ID_, 0); }
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__1);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID_))) != 0)) {
					{
					setState(123);
					cmd();
					}
				}

				setState(126);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(T__18);
				setState(128);
				match(T__6);
				setState(129);
				exp(0);
				setState(130);
				match(T__10);
				setState(131);
				cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				setState(138);
				match(T__19);
				setState(139);
				cmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(T__20);
				setState(142);
				match(T__6);
				setState(143);
				exp(0);
				setState(144);
				match(T__10);
				setState(145);
				cmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(T__21);
				setState(148);
				match(T__6);
				setState(149);
				exp(0);
				setState(150);
				match(T__10);
				setState(151);
				match(T__14);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				match(ID_);
				setState(154);
				match(T__22);
				setState(155);
				exp(0);
				setState(156);
				match(T__14);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				match(ID_);
				setState(159);
				match(T__8);
				setState(160);
				exp(0);
				setState(161);
				match(T__9);
				setState(162);
				match(T__22);
				setState(163);
				exp(0);
				setState(164);
				match(T__14);
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
			setState(169);
			rexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(171);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(172);
					match(T__23);
					setState(173);
					rexp(0);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(180);
			aexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(182);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(183);
						match(T__24);
						setState(184);
						aexp(0);
						}
						break;
					case 2:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(185);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(186);
						match(T__25);
						setState(187);
						aexp(0);
						}
						break;
					case 3:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(188);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(189);
						match(T__26);
						setState(190);
						aexp(0);
						}
						break;
					}
					} 
				}
				setState(195);
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
			setState(197);
			mexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(199);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(200);
						match(T__27);
						setState(201);
						mexp(0);
						}
						break;
					case 2:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(202);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(203);
						match(T__28);
						setState(204);
						mexp(0);
						}
						break;
					}
					} 
				}
				setState(209);
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
			setState(211);
			sexp();
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(213);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(214);
						match(T__29);
						setState(215);
						sexp();
						}
						break;
					case 2:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(216);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(217);
						match(T__30);
						setState(218);
						sexp();
						}
						break;
					}
					} 
				}
				setState(223);
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
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(T__31);
				setState(225);
				sexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(T__28);
				setState(227);
				sexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(T__33);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(T__34);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(T__35);
				setState(232);
				match(T__16);
				setState(233);
				match(T__8);
				setState(234);
				exp(0);
				setState(235);
				match(T__9);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				pexp(0);
				setState(238);
				match(T__36);
				setState(239);
				match(T__37);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(241);
				pexp(0);
				setState(242);
				match(T__8);
				setState(243);
				exp(0);
				setState(244);
				match(T__9);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(246);
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
		public TerminalNode ID_() { return getToken(mjavaParser.ID_, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
		public List<ExpsContext> exps() {
			return getRuleContexts(ExpsContext.class);
		}
		public ExpsContext exps(int i) {
			return getRuleContext(ExpsContext.class,i);
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
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_:
				{
				setState(250);
				match(ID_);
				}
				break;
			case T__38:
				{
				setState(251);
				match(T__38);
				}
				break;
			case T__35:
				{
				setState(252);
				match(T__35);
				setState(253);
				match(T__39);
				setState(254);
				match(T__6);
				setState(255);
				match(T__10);
				}
				break;
			case T__6:
				{
				setState(256);
				match(T__6);
				setState(257);
				exp(0);
				setState(258);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pexp);
						setState(262);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(263);
						match(T__36);
						setState(264);
						match(ID_);
						}
						break;
					case 2:
						{
						_localctx = new PexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pexp);
						setState(265);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(266);
						match(T__36);
						setState(267);
						match(ID_);
						setState(268);
						match(T__6);
						setState(272);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__38) | (1L << ID_))) != 0)) {
							{
							{
							setState(269);
							exps();
							}
							}
							setState(274);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(275);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(281);
			exp(0);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(282);
				match(T__15);
				setState(283);
				exp(0);
				}
				}
				setState(288);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0124\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\4\3\4\3\4\7\4"+
		"F\n\4\f\4\16\4I\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6U\n\6"+
		"\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\b\3\b\3\b\7\bs\n\b\f\b\16\bv"+
		"\13\b\3\b\3\b\3\b\5\b{\n\b\3\t\3\t\5\t\177\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00a9\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b1\n\n\f\n\16\n\u00b4\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c2"+
		"\n\13\f\13\16\13\u00c5\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d0"+
		"\n\f\f\f\16\f\u00d3\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00de"+
		"\n\r\f\r\16\r\u00e1\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00fa\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0107\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0111\n"+
		"\17\f\17\16\17\u0114\13\17\3\17\7\17\u0117\n\17\f\17\16\17\u011a\13\17"+
		"\3\20\3\20\3\20\7\20\u011f\n\20\f\20\16\20\u0122\13\20\3\20\2\7\22\24"+
		"\26\30\34\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u013e\2 \3\2"+
		"\2\2\4\'\3\2\2\2\6:\3\2\2\2\bL\3\2\2\2\nO\3\2\2\2\fd\3\2\2\2\16z\3\2\2"+
		"\2\20\u00a8\3\2\2\2\22\u00aa\3\2\2\2\24\u00b5\3\2\2\2\26\u00c6\3\2\2\2"+
		"\30\u00d4\3\2\2\2\32\u00f9\3\2\2\2\34\u0106\3\2\2\2\36\u011b\3\2\2\2 "+
		"$\5\4\3\2!#\5\6\4\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2"+
		"\2&$\3\2\2\2\'(\7\3\2\2()\7.\2\2)*\7+\2\2*+\7\4\2\2+,\7\5\2\2,-\7\6\2"+
		"\2-.\7\7\2\2./\7\b\2\2/\60\7\t\2\2\60\61\7\n\2\2\61\62\7\13\2\2\62\63"+
		"\7\f\2\2\63\64\7+\2\2\64\65\7\r\2\2\65\66\7\4\2\2\66\67\5\20\t\2\678\7"+
		"\16\2\289\7\16\2\29\5\3\2\2\2:;\7\3\2\2;@\7+\2\2<=\7\13\2\2=>\7\17\2\2"+
		">?\7+\2\2?A\7\f\2\2@<\3\2\2\2@A\3\2\2\2AB\3\2\2\2BG\7\4\2\2CF\5\b\5\2"+
		"DF\5\n\6\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2"+
		"IG\3\2\2\2JK\7\16\2\2K\7\3\2\2\2LM\5\16\b\2MN\7+\2\2N\t\3\2\2\2OP\7\5"+
		"\2\2PQ\5\16\b\2QR\7+\2\2RT\7\t\2\2SU\5\f\7\2TS\3\2\2\2TU\3\2\2\2UV\3\2"+
		"\2\2VW\7\r\2\2W\\\7\4\2\2X[\5\b\5\2Y[\5\20\t\2ZX\3\2\2\2ZY\3\2\2\2[^\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\20\2\2`a\5\22\n"+
		"\2ab\7\21\2\2bc\7\16\2\2c\13\3\2\2\2de\5\16\b\2el\7+\2\2fg\7\22\2\2gh"+
		"\5\16\b\2hi\7+\2\2ik\3\2\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m"+
		"\r\3\2\2\2nl\3\2\2\2ot\7\23\2\2pq\7\13\2\2qs\7\f\2\2rp\3\2\2\2sv\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2u{\3\2\2\2vt\3\2\2\2w{\7\23\2\2x{\7\24\2\2y{\7+"+
		"\2\2zo\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\17\3\2\2\2|~\7\4\2\2}\177"+
		"\5\20\t\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u00a9\7\16\2"+
		"\2\u0081\u0082\7\25\2\2\u0082\u0083\7\t\2\2\u0083\u0084\5\22\n\2\u0084"+
		"\u0085\7\r\2\2\u0085\u0086\5\20\t\2\u0086\u00a9\3\2\2\2\u0087\u0088\7"+
		"\25\2\2\u0088\u0089\7\t\2\2\u0089\u008a\5\22\n\2\u008a\u008b\7\r\2\2\u008b"+
		"\u008c\5\20\t\2\u008c\u008d\7\26\2\2\u008d\u008e\5\20\t\2\u008e\u00a9"+
		"\3\2\2\2\u008f\u0090\7\27\2\2\u0090\u0091\7\t\2\2\u0091\u0092\5\22\n\2"+
		"\u0092\u0093\7\r\2\2\u0093\u0094\5\20\t\2\u0094\u00a9\3\2\2\2\u0095\u0096"+
		"\7\30\2\2\u0096\u0097\7\t\2\2\u0097\u0098\5\22\n\2\u0098\u0099\7\r\2\2"+
		"\u0099\u009a\7\21\2\2\u009a\u00a9\3\2\2\2\u009b\u009c\7+\2\2\u009c\u009d"+
		"\7\31\2\2\u009d\u009e\5\22\n\2\u009e\u009f\7\21\2\2\u009f\u00a9\3\2\2"+
		"\2\u00a0\u00a1\7+\2\2\u00a1\u00a2\7\13\2\2\u00a2\u00a3\5\22\n\2\u00a3"+
		"\u00a4\7\f\2\2\u00a4\u00a5\7\31\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7"+
		"\21\2\2\u00a7\u00a9\3\2\2\2\u00a8|\3\2\2\2\u00a8\u0081\3\2\2\2\u00a8\u0087"+
		"\3\2\2\2\u00a8\u008f\3\2\2\2\u00a8\u0095\3\2\2\2\u00a8\u009b\3\2\2\2\u00a8"+
		"\u00a0\3\2\2\2\u00a9\21\3\2\2\2\u00aa\u00ab\b\n\1\2\u00ab\u00ac\5\24\13"+
		"\2\u00ac\u00b2\3\2\2\2\u00ad\u00ae\f\4\2\2\u00ae\u00af\7\32\2\2\u00af"+
		"\u00b1\5\24\13\2\u00b0\u00ad\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\b\13\1\2\u00b6\u00b7\5\26\f\2\u00b7\u00c3\3\2\2\2\u00b8\u00b9\f"+
		"\6\2\2\u00b9\u00ba\7\33\2\2\u00ba\u00c2\5\26\f\2\u00bb\u00bc\f\5\2\2\u00bc"+
		"\u00bd\7\34\2\2\u00bd\u00c2\5\26\f\2\u00be\u00bf\f\4\2\2\u00bf\u00c0\7"+
		"\35\2\2\u00c0\u00c2\5\26\f\2\u00c1\u00b8\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1"+
		"\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\25\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\b\f\1\2\u00c7\u00c8"+
		"\5\30\r\2\u00c8\u00d1\3\2\2\2\u00c9\u00ca\f\5\2\2\u00ca\u00cb\7\36\2\2"+
		"\u00cb\u00d0\5\30\r\2\u00cc\u00cd\f\4\2\2\u00cd\u00ce\7\37\2\2\u00ce\u00d0"+
		"\5\30\r\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\27\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d5\b\r\1\2\u00d5\u00d6\5\32\16\2\u00d6\u00df\3\2\2\2"+
		"\u00d7\u00d8\f\5\2\2\u00d8\u00d9\7 \2\2\u00d9\u00de\5\32\16\2\u00da\u00db"+
		"\f\4\2\2\u00db\u00dc\7!\2\2\u00dc\u00de\5\32\16\2\u00dd\u00d7\3\2\2\2"+
		"\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\31\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\"\2\2\u00e3"+
		"\u00fa\5\32\16\2\u00e4\u00e5\7\37\2\2\u00e5\u00fa\5\32\16\2\u00e6\u00fa"+
		"\7#\2\2\u00e7\u00fa\7$\2\2\u00e8\u00fa\7%\2\2\u00e9\u00ea\7&\2\2\u00ea"+
		"\u00eb\7\23\2\2\u00eb\u00ec\7\13\2\2\u00ec\u00ed\5\22\n\2\u00ed\u00ee"+
		"\7\f\2\2\u00ee\u00fa\3\2\2\2\u00ef\u00f0\5\34\17\2\u00f0\u00f1\7\'\2\2"+
		"\u00f1\u00f2\7(\2\2\u00f2\u00fa\3\2\2\2\u00f3\u00f4\5\34\17\2\u00f4\u00f5"+
		"\7\13\2\2\u00f5\u00f6\5\22\n\2\u00f6\u00f7\7\f\2\2\u00f7\u00fa\3\2\2\2"+
		"\u00f8\u00fa\5\34\17\2\u00f9\u00e2\3\2\2\2\u00f9\u00e4\3\2\2\2\u00f9\u00e6"+
		"\3\2\2\2\u00f9\u00e7\3\2\2\2\u00f9\u00e8\3\2\2\2\u00f9\u00e9\3\2\2\2\u00f9"+
		"\u00ef\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\33\3\2\2"+
		"\2\u00fb\u00fc\b\17\1\2\u00fc\u0107\7+\2\2\u00fd\u0107\7)\2\2\u00fe\u00ff"+
		"\7&\2\2\u00ff\u0100\7*\2\2\u0100\u0101\7\t\2\2\u0101\u0107\7\r\2\2\u0102"+
		"\u0103\7\t\2\2\u0103\u0104\5\22\n\2\u0104\u0105\7\r\2\2\u0105\u0107\3"+
		"\2\2\2\u0106\u00fb\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u00fe\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u0107\u0118\3\2\2\2\u0108\u0109\f\4\2\2\u0109\u010a\7\'"+
		"\2\2\u010a\u0117\7+\2\2\u010b\u010c\f\3\2\2\u010c\u010d\7\'\2\2\u010d"+
		"\u010e\7+\2\2\u010e\u0112\7\t\2\2\u010f\u0111\5\36\20\2\u0110\u010f\3"+
		"\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7\r\2\2\u0116\u0108\3\2"+
		"\2\2\u0116\u010b\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\35\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0120\5\22\n"+
		"\2\u011c\u011d\7\22\2\2\u011d\u011f\5\22\n\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\37\3\2\2"+
		"\2\u0122\u0120\3\2\2\2\33$@EGTZ\\ltz~\u00a8\u00b2\u00c1\u00c3\u00cf\u00d1"+
		"\u00dd\u00df\u00f9\u0106\u0112\u0116\u0118\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}