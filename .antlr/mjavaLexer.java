// Generated from /home/srmaia/Documentos/GitHub/Compiler-MJava/mjava.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mjavaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "WHITESPACE", "COMMENTLINES", 
			"COMMENTLINE", "RESERVEDWORDS", "NUMBER", "OPERATORSPOINTING", "ID"
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


	public mjavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mjava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u0106\n(\3(\3(\3)"+
		"\3)\3)\3)\7)\u010e\n)\f)\16)\u0111\13)\3)\3)\3)\3*\3*\3*\3*\7*\u011a\n"+
		"*\f*\16*\u011d\13*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u018a"+
		"\n+\3,\6,\u018d\n,\r,\16,\u018e\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u019a\n"+
		"-\3.\5.\u019d\n.\3.\7.\u01a0\n.\f.\16.\u01a3\13.\4\u010f\u011b\2/\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\t\5\2\n\f\17\17\"\"\3\2\f\f\3\2\62"+
		";\n\2*+..\60\60=?]]__}}\177\177\5\2,-//\61\61\4\2C\\c|\7\2//\62;C\\aa"+
		"c|\2\u01c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5c\3\2"+
		"\2\2\7e\3\2\2\2\tl\3\2\2\2\13s\3\2\2\2\rx\3\2\2\2\17}\3\2\2\2\21\177\3"+
		"\2\2\2\23\u0086\3\2\2\2\25\u0088\3\2\2\2\27\u008a\3\2\2\2\31\u008c\3\2"+
		"\2\2\33\u008e\3\2\2\2\35\u0096\3\2\2\2\37\u0098\3\2\2\2!\u009f\3\2\2\2"+
		"#\u00a1\3\2\2\2%\u00a5\3\2\2\2\'\u00ad\3\2\2\2)\u00b0\3\2\2\2+\u00b5\3"+
		"\2\2\2-\u00bb\3\2\2\2/\u00ce\3\2\2\2\61\u00d0\3\2\2\2\63\u00d3\3\2\2\2"+
		"\65\u00d5\3\2\2\2\67\u00d8\3\2\2\29\u00db\3\2\2\2;\u00dd\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e1\3\2\2\2A\u00e3\3\2\2\2C\u00e5\3\2\2\2E\u00ea\3\2\2\2G"+
		"\u00f0\3\2\2\2I\u00f4\3\2\2\2K\u00f6\3\2\2\2M\u00fd\3\2\2\2O\u0105\3\2"+
		"\2\2Q\u0109\3\2\2\2S\u0115\3\2\2\2U\u0189\3\2\2\2W\u018c\3\2\2\2Y\u0199"+
		"\3\2\2\2[\u019c\3\2\2\2]^\7e\2\2^_\7n\2\2_`\7c\2\2`a\7u\2\2ab\7u\2\2b"+
		"\4\3\2\2\2cd\7}\2\2d\6\3\2\2\2ef\7r\2\2fg\7w\2\2gh\7d\2\2hi\7n\2\2ij\7"+
		"k\2\2jk\7e\2\2k\b\3\2\2\2lm\7u\2\2mn\7v\2\2no\7c\2\2op\7v\2\2pq\7k\2\2"+
		"qr\7e\2\2r\n\3\2\2\2st\7x\2\2tu\7q\2\2uv\7k\2\2vw\7f\2\2w\f\3\2\2\2xy"+
		"\7o\2\2yz\7c\2\2z{\7k\2\2{|\7p\2\2|\16\3\2\2\2}~\7*\2\2~\20\3\2\2\2\177"+
		"\u0080\7U\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2"+
		"\u0083\u0084\7p\2\2\u0084\u0085\7i\2\2\u0085\22\3\2\2\2\u0086\u0087\7"+
		"]\2\2\u0087\24\3\2\2\2\u0088\u0089\7_\2\2\u0089\26\3\2\2\2\u008a\u008b"+
		"\7+\2\2\u008b\30\3\2\2\2\u008c\u008d\7\177\2\2\u008d\32\3\2\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7z\2\2\u0090\u0091\7v\2\2\u0091\u0092\7g\2\2"+
		"\u0092\u0093\7p\2\2\u0093\u0094\7f\2\2\u0094\u0095\7u\2\2\u0095\34\3\2"+
		"\2\2\u0096\u0097\7=\2\2\u0097\36\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7g\2\2\u009a\u009b\7v\2\2\u009b\u009c\7w\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7p\2\2\u009e \3\2\2\2\u009f\u00a0\7.\2\2\u00a0\"\3\2\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4$\3\2\2\2\u00a5"+
		"\u00a6\7d\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7n\2\2"+
		"\u00a9\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7p\2\2\u00ac&\3\2\2"+
		"\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7h\2\2\u00af(\3\2\2\2\u00b0\u00b1\7"+
		"g\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4*"+
		"\3\2\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7j\2\2\u00b7\u00b8\7k\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7U\2\2\u00bc"+
		"\u00bd\7{\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7g\2\2"+
		"\u00c0\u00c1\7o\2\2\u00c1\u00c2\7\60\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4"+
		"\7w\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7\60\2\2\u00c6\u00c7\7r\2\2\u00c7"+
		"\u00c8\7t\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7v\2\2"+
		"\u00cb\u00cc\7n\2\2\u00cc\u00cd\7p\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7?\2"+
		"\2\u00cf\60\3\2\2\2\u00d0\u00d1\7(\2\2\u00d1\u00d2\7(\2\2\u00d2\62\3\2"+
		"\2\2\u00d3\u00d4\7>\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6\u00d7"+
		"\7?\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7#\2\2\u00d9\u00da\7?\2\2\u00da8"+
		"\3\2\2\2\u00db\u00dc\7-\2\2\u00dc:\3\2\2\2\u00dd\u00de\7/\2\2\u00de<\3"+
		"\2\2\2\u00df\u00e0\7,\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2@\3"+
		"\2\2\2\u00e3\u00e4\7#\2\2\u00e4B\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7"+
		"\7t\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7g\2\2\u00e9D\3\2\2\2\u00ea\u00eb"+
		"\7h\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		"\u00ef\7g\2\2\u00efF\3\2\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f3\7y\2\2\u00f3H\3\2\2\2\u00f4\u00f5\7\60\2\2\u00f5J\3\2\2\2\u00f6"+
		"\u00f7\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7i\2\2"+
		"\u00fa\u00fb\7v\2\2\u00fb\u00fc\7j\2\2\u00fcL\3\2\2\2\u00fd\u00fe\7v\2"+
		"\2\u00fe\u00ff\7j\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7u\2\2\u0101N\3\2"+
		"\2\2\u0102\u0106\t\2\2\2\u0103\u0106\5S*\2\u0104\u0106\5Q)\2\u0105\u0102"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\b(\2\2\u0108P\3\2\2\2\u0109\u010a\7\61\2\2\u010a\u010b\7,\2\2\u010b"+
		"\u010f\3\2\2\2\u010c\u010e\13\2\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\7,\2\2\u0113\u0114\7\61\2\2\u0114R\3\2\2\2"+
		"\u0115\u0116\7\61\2\2\u0116\u0117\7\61\2\2\u0117\u011b\3\2\2\2\u0118\u011a"+
		"\13\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f"+
		"\t\3\2\2\u011fT\3\2\2\2\u0120\u0121\7d\2\2\u0121\u0122\7q\2\2\u0122\u0123"+
		"\7q\2\2\u0123\u0124\7n\2\2\u0124\u0125\7g\2\2\u0125\u0126\7c\2\2\u0126"+
		"\u018a\7p\2\2\u0127\u0128\7e\2\2\u0128\u0129\7n\2\2\u0129\u012a\7c\2\2"+
		"\u012a\u012b\7u\2\2\u012b\u018a\7u\2\2\u012c\u012d\7g\2\2\u012d\u012e"+
		"\7z\2\2\u012e\u012f\7v\2\2\u012f\u0130\7g\2\2\u0130\u0131\7p\2\2\u0131"+
		"\u0132\7f\2\2\u0132\u018a\7u\2\2\u0133\u0134\7r\2\2\u0134\u0135\7w\2\2"+
		"\u0135\u0136\7d\2\2\u0136\u0137\7n\2\2\u0137\u0138\7k\2\2\u0138\u018a"+
		"\7e\2\2\u0139\u013a\7u\2\2\u013a\u013b\7v\2\2\u013b\u013c\7c\2\2\u013c"+
		"\u013d\7v\2\2\u013d\u013e\7k\2\2\u013e\u018a\7e\2\2\u013f\u0140\7x\2\2"+
		"\u0140\u0141\7q\2\2\u0141\u0142\7k\2\2\u0142\u018a\7f\2\2\u0143\u0144"+
		"\7o\2\2\u0144\u0145\7c\2\2\u0145\u0146\7k\2\2\u0146\u018a\7p\2\2\u0147"+
		"\u0148\7U\2\2\u0148\u0149\7v\2\2\u0149\u014a\7t\2\2\u014a\u014b\7k\2\2"+
		"\u014b\u014c\7p\2\2\u014c\u018a\7i\2\2\u014d\u014e\7t\2\2\u014e\u014f"+
		"\7g\2\2\u014f\u0150\7v\2\2\u0150\u0151\7w\2\2\u0151\u0152\7t\2\2\u0152"+
		"\u018a\7p\2\2\u0153\u0154\7k\2\2\u0154\u0155\7p\2\2\u0155\u018a\7v\2\2"+
		"\u0156\u0157\7k\2\2\u0157\u018a\7h\2\2\u0158\u0159\7g\2\2\u0159\u015a"+
		"\7n\2\2\u015a\u015b\7u\2\2\u015b\u018a\7g\2\2\u015c\u015d\7y\2\2\u015d"+
		"\u015e\7j\2\2\u015e\u015f\7k\2\2\u015f\u0160\7n\2\2\u0160\u018a\7g\2\2"+
		"\u0161\u0162\7U\2\2\u0162\u0163\7{\2\2\u0163\u0164\7u\2\2\u0164\u0165"+
		"\7v\2\2\u0165\u0166\7g\2\2\u0166\u0167\7o\2\2\u0167\u0168\7\60\2\2\u0168"+
		"\u0169\7q\2\2\u0169\u016a\7w\2\2\u016a\u016b\7v\2\2\u016b\u016c\7\60\2"+
		"\2\u016c\u016d\7r\2\2\u016d\u016e\7t\2\2\u016e\u016f\7k\2\2\u016f\u0170"+
		"\7p\2\2\u0170\u0171\7v\2\2\u0171\u0172\7n\2\2\u0172\u018a\7p\2\2\u0173"+
		"\u0174\7n\2\2\u0174\u0175\7g\2\2\u0175\u0176\7p\2\2\u0176\u0177\7i\2\2"+
		"\u0177\u0178\7v\2\2\u0178\u018a\7j\2\2\u0179\u017a\7v\2\2\u017a\u017b"+
		"\7t\2\2\u017b\u017c\7w\2\2\u017c\u018a\7g\2\2\u017d\u017e\7h\2\2\u017e"+
		"\u017f\7c\2\2\u017f\u0180\7n\2\2\u0180\u0181\7u\2\2\u0181\u018a\7g\2\2"+
		"\u0182\u0183\7v\2\2\u0183\u0184\7j\2\2\u0184\u0185\7k\2\2\u0185\u018a"+
		"\7u\2\2\u0186\u0187\7p\2\2\u0187\u0188\7g\2\2\u0188\u018a\7y\2\2\u0189"+
		"\u0120\3\2\2\2\u0189\u0127\3\2\2\2\u0189\u012c\3\2\2\2\u0189\u0133\3\2"+
		"\2\2\u0189\u0139\3\2\2\2\u0189\u013f\3\2\2\2\u0189\u0143\3\2\2\2\u0189"+
		"\u0147\3\2\2\2\u0189\u014d\3\2\2\2\u0189\u0153\3\2\2\2\u0189\u0156\3\2"+
		"\2\2\u0189\u0158\3\2\2\2\u0189\u015c\3\2\2\2\u0189\u0161\3\2\2\2\u0189"+
		"\u0173\3\2\2\2\u0189\u0179\3\2\2\2\u0189\u017d\3\2\2\2\u0189\u0182\3\2"+
		"\2\2\u0189\u0186\3\2\2\2\u018aV\3\2\2\2\u018b\u018d\t\4\2\2\u018c\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"X\3\2\2\2\u0190\u019a\t\5\2\2\u0191\u0192\7?\2\2\u0192\u019a\7?\2\2\u0193"+
		"\u0194\7#\2\2\u0194\u019a\7?\2\2\u0195\u019a\t\6\2\2\u0196\u0197\7(\2"+
		"\2\u0197\u019a\7(\2\2\u0198\u019a\7#\2\2\u0199\u0190\3\2\2\2\u0199\u0191"+
		"\3\2\2\2\u0199\u0193\3\2\2\2\u0199\u0195\3\2\2\2\u0199\u0196\3\2\2\2\u0199"+
		"\u0198\3\2\2\2\u019aZ\3\2\2\2\u019b\u019d\t\7\2\2\u019c\u019b\3\2\2\2"+
		"\u019d\u01a1\3\2\2\2\u019e\u01a0\t\b\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\\\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\f\2\u0105\u010f\u011b\u0189\u018e\u0199\u019c\u019f\u01a1"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}