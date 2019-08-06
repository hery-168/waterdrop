// Generated from E:\git_workspace\github\waterdrop\waterdrop-core\src\main\antlr4\BoolExpr.g4 by ANTLR 4.5.3
package io.github.interestinglab.waterdrop.configparser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BoolExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, AND=3, OR=4, NOT=5, TRUE=6, FALSE=7, GT=8, GE=9, LT=10, 
		LE=11, EQ=12, LPAREN=13, RPAREN=14, DECIMAL=15, IDENTIFIER=16, FIELD_REFERENCE=17, 
		WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ELSE", "AND", "OR", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", 
		"EQ", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", "FIELD_REFERENCE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'AND'", "'OR'", "'NOT'", "'true'", "'false'", 
		"'>'", "'>='", "'<'", "'<='", "'=='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "AND", "OR", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", 
		"LE", "EQ", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", "FIELD_REFERENCE", 
		"WS"
	};
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


	public BoolExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BoolExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\5\20X\n\20\3\20\6\20[\n\20\r\20\16\20\\\3\20\3\20\6\20a\n\20\r\20"+
		"\16\20b\5\20e\n\20\3\21\3\21\7\21i\n\21\f\21\16\21l\13\21\3\21\3\21\6"+
		"\21p\n\21\r\21\16\21q\7\21t\n\21\f\21\16\21w\13\21\3\22\3\22\3\22\3\22"+
		"\6\22}\n\22\r\22\16\22~\3\22\3\22\6\22\u0083\n\22\r\22\16\22\u0084\7\22"+
		"\u0087\n\22\f\22\16\22\u008a\13\22\3\22\3\22\3\23\6\23\u008f\n\23\r\23"+
		"\16\23\u0090\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\3\2\62;\5\2C\\aa"+
		"c|\7\2//\62;C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\u009e\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\3\'\3\2\2\2\5*\3\2\2\2\7/\3\2\2\2\t\63\3\2\2\2\13\66\3\2\2\2\r:\3"+
		"\2\2\2\17?\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31"+
		"O\3\2\2\2\33R\3\2\2\2\35T\3\2\2\2\37W\3\2\2\2!f\3\2\2\2#x\3\2\2\2%\u008e"+
		"\3\2\2\2\'(\7k\2\2()\7h\2\2)\4\3\2\2\2*+\7g\2\2+,\7n\2\2,-\7u\2\2-.\7"+
		"g\2\2.\6\3\2\2\2/\60\7C\2\2\60\61\7P\2\2\61\62\7F\2\2\62\b\3\2\2\2\63"+
		"\64\7Q\2\2\64\65\7T\2\2\65\n\3\2\2\2\66\67\7P\2\2\678\7Q\2\289\7V\2\2"+
		"9\f\3\2\2\2:;\7v\2\2;<\7t\2\2<=\7w\2\2=>\7g\2\2>\16\3\2\2\2?@\7h\2\2@"+
		"A\7c\2\2AB\7n\2\2BC\7u\2\2CD\7g\2\2D\20\3\2\2\2EF\7@\2\2F\22\3\2\2\2G"+
		"H\7@\2\2HI\7?\2\2I\24\3\2\2\2JK\7>\2\2K\26\3\2\2\2LM\7>\2\2MN\7?\2\2N"+
		"\30\3\2\2\2OP\7?\2\2PQ\7?\2\2Q\32\3\2\2\2RS\7*\2\2S\34\3\2\2\2TU\7+\2"+
		"\2U\36\3\2\2\2VX\7/\2\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\t\2\2\2ZY\3\2"+
		"\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]d\3\2\2\2^`\7\60\2\2_a\t\2\2\2`"+
		"_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2d^\3\2\2\2de\3\2\2\2"+
		"e \3\2\2\2fj\t\3\2\2gi\t\4\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"ku\3\2\2\2lj\3\2\2\2mo\7\60\2\2np\t\4\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2rt\3\2\2\2sm\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\"\3\2"+
		"\2\2wu\3\2\2\2xy\7&\2\2yz\7}\2\2z|\3\2\2\2{}\t\5\2\2|{\3\2\2\2}~\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0088\3\2\2\2\u0080\u0082\7\60\2\2\u0081"+
		"\u0083\t\5\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0080\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\177\2\2\u008c$\3\2\2\2\u008d\u008f"+
		"\t\6\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\23\2\2\u0093&\3\2\2\2"+
		"\16\2W\\bdjqu~\u0084\u0088\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}