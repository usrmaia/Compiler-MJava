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
		WHITESPACE=39, RESERVEDWORDS=40, NUMBER=41, OPERATORSPOINTING=42, COMMENT=43, 
		ID=44;
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
			null, null, null, "WHITESPACE", "RESERVEDWORDS", "NUMBER", "OPERATORSPOINTING", 
			"COMMENT", "ID"
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(38);
			match(ID);
			setState(39);
			match(T__1);
			setState(40);
			match(T__2);
			setState(41);
			match(T__3);
			setState(42);
			match(T__4);
			setState(43);
			match(T__5);
			setState(44);
			match(T__6);
			setState(45);
			match(T__7);
			setState(46);
			match(T__8);
			setState(47);
			match(T__9);
			setState(48);
			match(ID);
			setState(49);
			match(T__10);
			setState(50);
			match(T__1);
			setState(51);
			cmd();
			setState(52);
			match(T__11);
			setState(53);
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
			setState(55);
			match(T__0);
			setState(56);
			match(ID);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(57);
				match(T__12);
				setState(58);
				match(ID);
				}
			}

			setState(61);
			match(T__1);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__17:
				case ID:
					{
					setState(62);
					var();
					}
					break;
				case T__2:
					{
					setState(63);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
			setState(71);
			tipo();
			setState(72);
			match(ID);
			setState(73);
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
			setState(75);
			match(T__2);
			setState(76);
			tipo();
			setState(77);
			match(ID);
			setState(78);
			match(T__6);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(79);
				params();
				}
			}

			setState(82);
			match(T__10);
			setState(83);
			match(T__1);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(84);
					var();
					}
					break;
				case 2:
					{
					setState(85);
					cmd();
					}
					break;
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__14);
			setState(92);
			exp(0);
			setState(93);
			match(T__13);
			setState(94);
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
			setState(96);
			tipo();
			setState(97);
			match(ID);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(98);
				match(T__15);
				setState(99);
				tipo();
				setState(100);
				match(ID);
				}
				}
				setState(106);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__16);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(108);
					match(T__8);
					setState(109);
					match(T__9);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(T__17);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__1);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
					{
					setState(121);
					cmd();
					}
				}

				setState(124);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__18);
				setState(126);
				match(T__6);
				setState(127);
				exp(0);
				setState(128);
				match(T__10);
				setState(129);
				cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(T__18);
				setState(132);
				match(T__6);
				setState(133);
				exp(0);
				setState(134);
				match(T__10);
				setState(135);
				cmd();
				setState(136);
				match(T__19);
				setState(137);
				cmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(T__20);
				setState(140);
				match(T__6);
				setState(141);
				exp(0);
				setState(142);
				match(T__10);
				setState(143);
				cmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(T__21);
				setState(146);
				match(T__6);
				setState(147);
				exp(0);
				setState(148);
				match(T__10);
				setState(149);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(ID);
				setState(152);
				match(T__22);
				setState(153);
				exp(0);
				setState(154);
				match(T__13);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				match(ID);
				setState(157);
				match(T__8);
				setState(158);
				exp(0);
				setState(159);
				match(T__9);
				setState(160);
				match(T__22);
				setState(161);
				exp(0);
				setState(162);
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
			setState(167);
			rexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
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
					setState(169);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(170);
					match(T__23);
					setState(171);
					rexp(0);
					}
					} 
				}
				setState(176);
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
			setState(178);
			aexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(180);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(181);
						match(T__24);
						setState(182);
						aexp(0);
						}
						break;
					case 2:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184);
						match(T__25);
						setState(185);
						aexp(0);
						}
						break;
					case 3:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187);
						match(T__26);
						setState(188);
						aexp(0);
						}
						break;
					}
					} 
				}
				setState(193);
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
			setState(195);
			mexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						match(T__27);
						setState(199);
						mexp(0);
						}
						break;
					case 2:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(200);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(201);
						match(T__28);
						setState(202);
						mexp(0);
						}
						break;
					}
					} 
				}
				setState(207);
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
			setState(209);
			sexp();
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(211);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(212);
						match(T__29);
						setState(213);
						sexp();
						}
						break;
					case 2:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(214);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(215);
						match(T__30);
						setState(216);
						sexp();
						}
						break;
					}
					} 
				}
				setState(221);
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__31);
				setState(223);
				sexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__28);
				setState(225);
				sexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(T__33);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(T__34);
				setState(229);
				match(T__16);
				setState(230);
				match(T__8);
				setState(231);
				exp(0);
				setState(232);
				match(T__9);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				pexp(0);
				setState(235);
				match(T__35);
				setState(236);
				match(T__36);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				pexp(0);
				setState(239);
				match(T__8);
				setState(240);
				exp(0);
				setState(241);
				match(T__9);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
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
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(247);
				match(ID);
				}
				break;
			case NUMBER:
				{
				setState(248);
				match(NUMBER);
				}
				break;
			case T__37:
				{
				setState(249);
				match(T__37);
				}
				break;
			case T__34:
				{
				setState(250);
				match(T__34);
				setState(251);
				match(ID);
				setState(252);
				match(T__6);
				setState(253);
				match(T__10);
				}
				break;
			case T__6:
				{
				setState(254);
				match(T__6);
				setState(255);
				exp(0);
				setState(256);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pexp);
						setState(260);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(261);
						match(T__35);
						setState(262);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new PexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pexp);
						setState(263);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(264);
						match(T__35);
						setState(265);
						match(ID);
						setState(266);
						match(T__6);
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << NUMBER) | (1L << ID))) != 0)) {
							{
							setState(267);
							exps();
							}
						}

						setState(270);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(275);
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
			setState(276);
			exp(0);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(277);
				match(T__15);
				setState(278);
				exp(0);
				}
				}
				setState(283);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u011f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\7\4C\n\4\f\4\16\4"+
		"F\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\6\3\6\3"+
		"\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\b\3\b\3\b\7\bq\n\b\f\b\16\bt\13\b\3\b"+
		"\3\b\3\b\5\by\n\b\3\t\3\t\5\t}\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a7\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00af\n\n\f\n\16\n\u00b2\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c0\n\13\f\13\16"+
		"\13\u00c3\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ce\n\f\f\f"+
		"\16\f\u00d1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00dc\n\r\f\r"+
		"\16\r\u00df\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f7\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0105"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010f\n\17\3\17\7\17"+
		"\u0112\n\17\f\17\16\17\u0115\13\17\3\20\3\20\3\20\7\20\u011a\n\20\f\20"+
		"\16\20\u011d\13\20\3\20\2\7\22\24\26\30\34\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\2\2\u0139\2 \3\2\2\2\4\'\3\2\2\2\69\3\2\2\2\bI\3\2\2"+
		"\2\nM\3\2\2\2\fb\3\2\2\2\16x\3\2\2\2\20\u00a6\3\2\2\2\22\u00a8\3\2\2\2"+
		"\24\u00b3\3\2\2\2\26\u00c4\3\2\2\2\30\u00d2\3\2\2\2\32\u00f6\3\2\2\2\34"+
		"\u0104\3\2\2\2\36\u0116\3\2\2\2 $\5\4\3\2!#\5\6\4\2\"!\3\2\2\2#&\3\2\2"+
		"\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2\'(\7\3\2\2()\7.\2\2)*\7\4"+
		"\2\2*+\7\5\2\2+,\7\6\2\2,-\7\7\2\2-.\7\b\2\2./\7\t\2\2/\60\7\n\2\2\60"+
		"\61\7\13\2\2\61\62\7\f\2\2\62\63\7.\2\2\63\64\7\r\2\2\64\65\7\4\2\2\65"+
		"\66\5\20\t\2\66\67\7\16\2\2\678\7\16\2\28\5\3\2\2\29:\7\3\2\2:=\7.\2\2"+
		";<\7\17\2\2<>\7.\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?D\7\4\2\2@C\5\b\5\2"+
		"AC\5\n\6\2B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2"+
		"FD\3\2\2\2GH\7\16\2\2H\7\3\2\2\2IJ\5\16\b\2JK\7.\2\2KL\7\20\2\2L\t\3\2"+
		"\2\2MN\7\5\2\2NO\5\16\b\2OP\7.\2\2PR\7\t\2\2QS\5\f\7\2RQ\3\2\2\2RS\3\2"+
		"\2\2ST\3\2\2\2TU\7\r\2\2UZ\7\4\2\2VY\5\b\5\2WY\5\20\t\2XV\3\2\2\2XW\3"+
		"\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\21\2\2"+
		"^_\5\22\n\2_`\7\20\2\2`a\7\16\2\2a\13\3\2\2\2bc\5\16\b\2cj\7.\2\2de\7"+
		"\22\2\2ef\5\16\b\2fg\7.\2\2gi\3\2\2\2hd\3\2\2\2il\3\2\2\2jh\3\2\2\2jk"+
		"\3\2\2\2k\r\3\2\2\2lj\3\2\2\2mr\7\23\2\2no\7\13\2\2oq\7\f\2\2pn\3\2\2"+
		"\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sy\3\2\2\2tr\3\2\2\2uy\7\23\2\2vy\7\24"+
		"\2\2wy\7.\2\2xm\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\17\3\2\2\2z|\7"+
		"\4\2\2{}\5\20\t\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u00a7\7\16\2\2\177\u0080"+
		"\7\25\2\2\u0080\u0081\7\t\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7\r\2\2"+
		"\u0083\u0084\5\20\t\2\u0084\u00a7\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u0087"+
		"\7\t\2\2\u0087\u0088\5\22\n\2\u0088\u0089\7\r\2\2\u0089\u008a\5\20\t\2"+
		"\u008a\u008b\7\26\2\2\u008b\u008c\5\20\t\2\u008c\u00a7\3\2\2\2\u008d\u008e"+
		"\7\27\2\2\u008e\u008f\7\t\2\2\u008f\u0090\5\22\n\2\u0090\u0091\7\r\2\2"+
		"\u0091\u0092\5\20\t\2\u0092\u00a7\3\2\2\2\u0093\u0094\7\30\2\2\u0094\u0095"+
		"\7\t\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\r\2\2\u0097\u0098\7\20\2\2"+
		"\u0098\u00a7\3\2\2\2\u0099\u009a\7.\2\2\u009a\u009b\7\31\2\2\u009b\u009c"+
		"\5\22\n\2\u009c\u009d\7\20\2\2\u009d\u00a7\3\2\2\2\u009e\u009f\7.\2\2"+
		"\u009f\u00a0\7\13\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3"+
		"\7\31\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\7\20\2\2\u00a5\u00a7\3\2\2"+
		"\2\u00a6z\3\2\2\2\u00a6\177\3\2\2\2\u00a6\u0085\3\2\2\2\u00a6\u008d\3"+
		"\2\2\2\u00a6\u0093\3\2\2\2\u00a6\u0099\3\2\2\2\u00a6\u009e\3\2\2\2\u00a7"+
		"\21\3\2\2\2\u00a8\u00a9\b\n\1\2\u00a9\u00aa\5\24\13\2\u00aa\u00b0\3\2"+
		"\2\2\u00ab\u00ac\f\4\2\2\u00ac\u00ad\7\32\2\2\u00ad\u00af\5\24\13\2\u00ae"+
		"\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\23\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\b\13\1\2\u00b4\u00b5"+
		"\5\26\f\2\u00b5\u00c1\3\2\2\2\u00b6\u00b7\f\6\2\2\u00b7\u00b8\7\33\2\2"+
		"\u00b8\u00c0\5\26\f\2\u00b9\u00ba\f\5\2\2\u00ba\u00bb\7\34\2\2\u00bb\u00c0"+
		"\5\26\f\2\u00bc\u00bd\f\4\2\2\u00bd\u00be\7\35\2\2\u00be\u00c0\5\26\f"+
		"\2\u00bf\u00b6\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\25\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\b\f\1\2\u00c5\u00c6\5\30\r\2\u00c6\u00cf\3"+
		"\2\2\2\u00c7\u00c8\f\5\2\2\u00c8\u00c9\7\36\2\2\u00c9\u00ce\5\30\r\2\u00ca"+
		"\u00cb\f\4\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00ce\5\30\r\2\u00cd\u00c7\3"+
		"\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\27\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\r\1"+
		"\2\u00d3\u00d4\5\32\16\2\u00d4\u00dd\3\2\2\2\u00d5\u00d6\f\5\2\2\u00d6"+
		"\u00d7\7 \2\2\u00d7\u00dc\5\32\16\2\u00d8\u00d9\f\4\2\2\u00d9\u00da\7"+
		"!\2\2\u00da\u00dc\5\32\16\2\u00db\u00d5\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\31\3\2\2"+
		"\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\"\2\2\u00e1\u00f7\5\32\16\2\u00e2"+
		"\u00e3\7\37\2\2\u00e3\u00f7\5\32\16\2\u00e4\u00f7\7#\2\2\u00e5\u00f7\7"+
		"$\2\2\u00e6\u00e7\7%\2\2\u00e7\u00e8\7\23\2\2\u00e8\u00e9\7\13\2\2\u00e9"+
		"\u00ea\5\22\n\2\u00ea\u00eb\7\f\2\2\u00eb\u00f7\3\2\2\2\u00ec\u00ed\5"+
		"\34\17\2\u00ed\u00ee\7&\2\2\u00ee\u00ef\7\'\2\2\u00ef\u00f7\3\2\2\2\u00f0"+
		"\u00f1\5\34\17\2\u00f1\u00f2\7\13\2\2\u00f2\u00f3\5\22\n\2\u00f3\u00f4"+
		"\7\f\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f7\5\34\17\2\u00f6\u00e0\3\2\2\2"+
		"\u00f6\u00e2\3\2\2\2\u00f6\u00e4\3\2\2\2\u00f6\u00e5\3\2\2\2\u00f6\u00e6"+
		"\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\33\3\2\2\2\u00f8\u00f9\b\17\1\2\u00f9\u0105\7.\2\2\u00fa\u0105\7+\2\2"+
		"\u00fb\u0105\7(\2\2\u00fc\u00fd\7%\2\2\u00fd\u00fe\7.\2\2\u00fe\u00ff"+
		"\7\t\2\2\u00ff\u0105\7\r\2\2\u0100\u0101\7\t\2\2\u0101\u0102\5\22\n\2"+
		"\u0102\u0103\7\r\2\2\u0103\u0105\3\2\2\2\u0104\u00f8\3\2\2\2\u0104\u00fa"+
		"\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u0100\3\2\2\2\u0105"+
		"\u0113\3\2\2\2\u0106\u0107\f\4\2\2\u0107\u0108\7&\2\2\u0108\u0112\7.\2"+
		"\2\u0109\u010a\f\3\2\2\u010a\u010b\7&\2\2\u010b\u010c\7.\2\2\u010c\u010e"+
		"\7\t\2\2\u010d\u010f\5\36\20\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010f\u0110\3\2\2\2\u0110\u0112\7\r\2\2\u0111\u0106\3\2\2\2\u0111\u0109"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\35\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011b\5\22\n\2\u0117\u0118\7\22"+
		"\2\2\u0118\u011a\5\22\n\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\37\3\2\2\2\u011d\u011b\3\2\2"+
		"\2\33$=BDRXZjrx|\u00a6\u00b0\u00bf\u00c1\u00cd\u00cf\u00db\u00dd\u00f6"+
		"\u0104\u010e\u0111\u0113\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}