// Generated from C:/Users/Anna/Documents/GitHub/OBP-IntelliJ-plugin/src/obp/settings/scalagrammar\Scala.g4 by ANTLR 4.9.1
package obp.settings.antlrgenerated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScalaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, Id=62, BooleanLiteral=63, CharacterLiteral=64, SymbolLiteral=65, 
		IntegerLiteral=66, StringLiteral=67, FloatingPointLiteral=68, Varid=69, 
		BoundVarid=70, Paren=71, Delim=72, Semi=73, NL=74, NEWLINE=75, WS=76, 
		COMMENT=77, LINE_COMMENT=78;
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
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "Id", "BooleanLiteral", "CharacterLiteral", 
			"SymbolLiteral", "IntegerLiteral", "StringLiteral", "FloatingPointLiteral", 
			"Varid", "BoundVarid", "Paren", "Delim", "Semi", "NL", "CharNoBackQuoteOrNewline", 
			"UnicodeEscape", "WhiteSpace", "Opchar", "Op", "Idrest", "StringElement", 
			"MultiLineChars", "HexDigit", "FloatType", "Upper", "Lower", "Letter", 
			"ExponentPart", "PrintableChar", "PrintableCharExceptWhitespace", "CharEscapeSeq", 
			"DecimalNumeral", "HexNumeral", "Digit", "NonZeroDigit", "VaridFragment", 
			"Plainid", "UnicodeLetter", "UnicodeClass_LU", "UnicodeClass_LL", "UnicodeClass_LT", 
			"UnicodeClass_LM", "UnicodeClass_LO", "UnicodeDigit", "NEWLINE", "WS", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'null'", "'.'", "','", "'this'", "'super'", "'['", "']'", 
			"'=>'", "'('", "')'", "'forSome'", "'{'", "'}'", "'type'", "'val'", "'with'", 
			"'#'", "':'", "'_'", "'*'", "'implicit'", "'if'", "'else'", "'while'", 
			"'try'", "'catch'", "'finally'", "'do'", "'for'", "'yield'", "'throw'", 
			"'return'", "'='", "'match'", "'+'", "'~'", "'!'", "'new'", "'lazy'", 
			"'<-'", "'case'", "'|'", "'@'", "'>:'", "'<:'", "'<%'", "'var'", "'override'", 
			"'abstract'", "'final'", "'sealed'", "'private'", "'protected'", "'import'", 
			"'def'", "'class'", "'object'", "'trait'", "'extends'", "'package'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Id", "BooleanLiteral", "CharacterLiteral", "SymbolLiteral", 
			"IntegerLiteral", "StringLiteral", "FloatingPointLiteral", "Varid", "BoundVarid", 
			"Paren", "Delim", "Semi", "NL", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT"
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


	public ScalaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scala.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u0327\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\3"+
		"9\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\6?\u01f6\n"+
		"?\r?\16?\u01f7\3?\3?\5?\u01fc\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0207\n"+
		"@\3A\3A\3A\5A\u020c\nA\3A\3A\3B\3B\3B\3C\3C\5C\u0215\nC\3C\5C\u0218\n"+
		"C\3D\3D\7D\u021c\nD\fD\16D\u021f\13D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D"+
		"\u022b\nD\3E\6E\u022e\nE\rE\16E\u022f\3E\3E\6E\u0234\nE\rE\16E\u0235\3"+
		"E\5E\u0239\nE\3E\5E\u023c\nE\3E\3E\6E\u0240\nE\rE\16E\u0241\3E\5E\u0245"+
		"\nE\3E\5E\u0248\nE\3E\3E\3E\5E\u024d\nE\3E\6E\u0250\nE\rE\16E\u0251\3"+
		"E\5E\u0255\nE\3E\3E\5E\u0259\nE\3F\3F\3F\3G\3G\3G\3G\3G\5G\u0263\nG\3"+
		"H\3H\3I\3I\3J\3J\6J\u026b\nJ\rJ\16J\u026c\5J\u026f\nJ\3J\3J\3K\3K\3K\5"+
		"K\u0276\nK\5K\u0278\nK\3L\3L\3M\3M\3M\5M\u027f\nM\3M\3M\3M\3M\3M\3N\3"+
		"N\3O\3O\3P\5P\u028b\nP\3P\6P\u028e\nP\rP\16P\u028f\3Q\3Q\7Q\u0294\nQ\f"+
		"Q\16Q\u0297\13Q\3Q\3Q\5Q\u029b\nQ\3R\3R\5R\u029f\nR\3S\3S\7S\u02a3\nS"+
		"\fS\16S\u02a6\13S\3T\3T\3U\3U\3V\3V\5V\u02ae\nV\3W\3W\5W\u02b2\nW\3X\3"+
		"X\3X\3X\5X\u02b8\nX\3Y\3Y\5Y\u02bc\nY\3Y\6Y\u02bf\nY\rY\16Y\u02c0\3Z\3"+
		"Z\3[\3[\3\\\3\\\3\\\3]\3]\3]\7]\u02cd\n]\f]\16]\u02d0\13]\5]\u02d2\n]"+
		"\3^\3^\3^\3^\6^\u02d8\n^\r^\16^\u02d9\3_\3_\5_\u02de\n_\3`\3`\3a\3a\3"+
		"b\3b\3b\3b\3b\3b\3b\5b\u02eb\nb\3c\3c\3c\3c\3c\5c\u02f2\nc\3d\3d\3e\3"+
		"e\3f\3f\3g\3g\3h\3h\3i\3i\3j\6j\u0301\nj\rj\16j\u0302\3j\3j\3k\6k\u0308"+
		"\nk\rk\16k\u0309\3k\3k\3l\3l\3l\3l\3l\7l\u0313\nl\fl\16l\u0316\13l\3l"+
		"\3l\3l\3l\3l\3m\3m\3m\3m\7m\u0321\nm\fm\16m\u0324\13m\3m\3m\2\2n\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2"+
		"\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3"+
		"\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5"+
		"\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3M\u00d5N\u00d7"+
		"O\u00d9P\3\2\26\4\2NNnn\7\2*+]]__}}\177\177\b\2$$))..\60\60==bb\4\2\""+
		"(*\u0080\5\2\13\f\17\17\"\"\r\2##%%\'(,-//<<>B^^``~~\u0080\u0080\4\2\""+
		"#%\u0081\5\2\62;CHch\6\2FFHHffhh\5\2&&C\\aa\4\2GGgg\4\2--//\n\2$$))^^"+
		"ddhhppttvvT\2C\\\u00c2\u00d8\u00da\u00e0\u0102\u0138\u013b\u0149\u014c"+
		"\u017f\u0183\u0184\u0186\u018d\u0190\u0193\u0195\u0196\u0198\u019a\u019e"+
		"\u019f\u01a1\u01a2\u01a4\u01ab\u01ae\u01b5\u01b7\u01be\u01c6\u01cf\u01d1"+
		"\u01dd\u01e0\u01f0\u01f3\u01f6\u01f8\u01fa\u01fc\u0234\u023c\u023d\u023f"+
		"\u0240\u0243\u0248\u024a\u0250\u0372\u0374\u0378\u0381\u0388\u038c\u038e"+
		"\u03a3\u03a5\u03ad\u03d1\u03d6\u03da\u03f0\u03f6\u03f9\u03fb\u03fc\u03ff"+
		"\u0431\u0462\u0482\u048c\u04cf\u04d2\u0530\u0533\u0558\u10a2\u10c7\u10c9"+
		"\u10cf\u1e02\u1e96\u1ea0\u1f00\u1f0a\u1f11\u1f1a\u1f1f\u1f2a\u1f31\u1f3a"+
		"\u1f41\u1f4a\u1f4f\u1f5b\u1f61\u1f6a\u1f71\u1fba\u1fbd\u1fca\u1fcd\u1fda"+
		"\u1fdd\u1fea\u1fee\u1ffa\u1ffd\u2104\u2109\u210d\u210f\u2112\u2114\u2117"+
		"\u211f\u2126\u212f\u2132\u2135\u2140\u2141\u2147\u2185\u2c02\u2c30\u2c62"+
		"\u2c66\u2c69\u2c72\u2c74\u2c77\u2c80\u2c82\u2c84\u2ce4\u2ced\u2cef\u2cf4"+
		"\ua642\ua644\ua66e\ua682\ua69c\ua724\ua730\ua734\ua770\ua77b\ua788\ua78d"+
		"\ua78f\ua792\ua794\ua798\ua7af\ua7b2\ua7b3\uff23\uff3cS\2c|\u00b7\u00f8"+
		"\u00fa\u0101\u0103\u0179\u017c\u0182\u0185\u0187\u018a\u0194\u0197\u019d"+
		"\u01a0\u01a3\u01a5\u01a7\u01aa\u01af\u01b2\u01b6\u01b8\u01c1\u01c8\u01ce"+
		"\u01d0\u01f5\u01f7\u01fb\u01fd\u023b\u023e\u0244\u0249\u0295\u0297\u02b1"+
		"\u0373\u0375\u0379\u037f\u0392\u03d0\u03d2\u03d3\u03d7\u03d9\u03db\u03f5"+
		"\u03f7\u0461\u0463\u0483\u048d\u04c1\u04c4\u0531\u0563\u0589\u1d02\u1d2d"+
		"\u1d6d\u1d79\u1d7b\u1d9c\u1e03\u1e9f\u1ea1\u1f09\u1f12\u1f17\u1f22\u1f29"+
		"\u1f32\u1f39\u1f42\u1f47\u1f52\u1f59\u1f62\u1f69\u1f72\u1f7f\u1f82\u1f89"+
		"\u1f92\u1f99\u1fa2\u1fa9\u1fb2\u1fb6\u1fb8\u1fb9\u1fc0\u1fc6\u1fc8\u1fc9"+
		"\u1fd2\u1fd5\u1fd8\u1fd9\u1fe2\u1fe9\u1ff4\u1ff6\u1ff8\u1ff9\u210c\u2115"+
		"\u2131\u213b\u213e\u213f\u2148\u214b\u2150\u2186\u2c32\u2c60\u2c63\u2c6e"+
		"\u2c73\u2c7d\u2c83\u2cee\u2cf0\u2cf5\u2d02\u2d27\u2d29\u2d2f\ua643\ua66f"+
		"\ua683\ua69d\ua725\ua733\ua735\ua77a\ua77c\ua77e\ua781\ua789\ua78e\ua790"+
		"\ua793\ua797\ua799\ua7ab\ua7fc\uab5c\uab66\uab67\ufb02\ufb08\ufb15\ufb19"+
		"\uff43\uff5c\b\2\u01c7\u01cd\u01f4\u1f91\u1f9a\u1fa1\u1faa\u1fb1\u1fbe"+
		"\u1fce\u1ffe\u1ffe#\2\u02b2\u02c3\u02c8\u02d3\u02e2\u02e6\u02ee\u02f0"+
		"\u0376\u037c\u055b\u0642\u06e7\u06e8\u07f6\u07f7\u07fc\u081c\u0826\u082a"+
		"\u0973\u0e48\u0ec8\u10fe\u17d9\u1845\u1aa9\u1c7f\u1d2e\u1d6c\u1d7a\u1dc1"+
		"\u2073\u2081\u2092\u209e\u2c7e\u2c7f\u2d71\u2e31\u3007\u3037\u303d\u3100"+
		"\ua017\ua4ff\ua60e\ua681\ua69e\ua69f\ua719\ua721\ua772\ua78a\ua7fa\ua7fb"+
		"\ua9d1\ua9e8\uaa72\uaadf\uaaf5\uaaf6\uab5e\uab61\uff72\uffa1\u00ec\2\u00ac"+
		"\u00bc\u01bd\u01c5\u0296\u05ec\u05f2\u05f4\u0622\u0641\u0643\u064c\u0670"+
		"\u0671\u0673\u06d5\u06d7\u06fe\u0701\u0712\u0714\u0731\u074f\u07a7\u07b3"+
		"\u07ec\u0802\u0817\u0842\u085a\u08a2\u08b4\u0906\u093b\u093f\u0952\u095a"+
		"\u0963\u0974\u0982\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4"+
		"\u09bb\u09bf\u09d0\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11"+
		"\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b"+
		"\u0a5e\u0a60\u0a76\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4"+
		"\u0ab5\u0ab7\u0abb\u0abf\u0ad2\u0ae2\u0ae3\u0b07\u0b0e\u0b11\u0b12\u0b15"+
		"\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b63\u0b73\u0b85\u0b87"+
		"\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0bac\u0bb0\u0bbb\u0bd2"+
		"\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c3b\u0c3f\u0c8e\u0c90\u0c92\u0c94"+
		"\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0ce0\u0ce2\u0ce3\u0cf3\u0cf4\u0d07"+
		"\u0d0e\u0d10\u0d12\u0d14\u0d3c\u0d3f\u0d50\u0d62\u0d63\u0d7c\u0d81\u0d87"+
		"\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42"+
		"\u0e47\u0e83\u0e84\u0e86\u0e8c\u0e8f\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7"+
		"\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ec6\u0ede\u0ee1\u0f02"+
		"\u0f49\u0f4b\u0f6e\u0f8a\u0f8e\u1002\u102c\u1041\u1057\u105c\u105f\u1063"+
		"\u1072\u1077\u1083\u1090\u10fc\u10ff\u124a\u124c\u124f\u1252\u1258\u125a"+
		"\u125f\u1262\u128a\u128c\u128f\u1292\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2"+
		"\u12c7\u12ca\u12d8\u12da\u1312\u1314\u1317\u131a\u135c\u1382\u1391\u13a2"+
		"\u13f6\u1403\u166e\u1671\u1681\u1683\u169c\u16a2\u16ec\u16f3\u16fa\u1702"+
		"\u170e\u1710\u1713\u1722\u1733\u1742\u1753\u1762\u176e\u1770\u1772\u1782"+
		"\u17b5\u17de\u1844\u1846\u1879\u1882\u18aa\u18ac\u18f7\u1902\u1920\u1952"+
		"\u196f\u1972\u1976\u1982\u19ad\u19c3\u19c9\u1a02\u1a18\u1a22\u1a56\u1b07"+
		"\u1b35\u1b47\u1b4d\u1b85\u1ba2\u1bb0\u1bb1\u1bbc\u1be7\u1c02\u1c25\u1c4f"+
		"\u1c51\u1c5c\u1c79\u1ceb\u1cee\u1cf0\u1cf3\u1cf7\u1cf8\u2137\u213a\u2d32"+
		"\u2d69\u2d82\u2d98\u2da2\u2da8\u2daa\u2db0\u2db2\u2db8\u2dba\u2dc0\u2dc2"+
		"\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda\u2de0\u3008\u303e\u3043\u3098\u30a1"+
		"\u30fc\u3101\u312f\u3133\u3190\u31a2\u31bc\u31f2\u3201\u3402\u4db7\u4e02"+
		"\u9fce\ua002\ua016\ua018\ua48e\ua4d2\ua4f9\ua502\ua60d\ua612\ua621\ua62c"+
		"\ua62d\ua670\ua6e7\ua7f9\ua803\ua805\ua807\ua809\ua80c\ua80e\ua824\ua842"+
		"\ua875\ua884\ua8b5\ua8f4\ua8f9\ua8fd\ua927\ua932\ua948\ua962\ua97e\ua986"+
		"\ua9b4\ua9e2\ua9e6\ua9e9\ua9f1\ua9fc\uaa00\uaa02\uaa2a\uaa42\uaa44\uaa46"+
		"\uaa4d\uaa62\uaa71\uaa73\uaa78\uaa7c\uaab1\uaab3\uaabf\uaac2\uaac4\uaadd"+
		"\uaade\uaae2\uaaec\uaaf4\uab08\uab0b\uab10\uab13\uab18\uab22\uab28\uab2a"+
		"\uab30\uabc2\uabe4\uac02\ud7a5\ud7b2\ud7c8\ud7cd\ud7fd\uf902\ufa6f\ufa72"+
		"\ufadb\ufb1f\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufbb3\ufbd5\ufd3f\ufd52"+
		"\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe76\ufe78\ufefe\uff68\uff71\uff73"+
		"\uff9f\uffa2\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\'\2"+
		"\62;\u0662\u066b\u06f2\u06fb\u07c2\u07cb\u0968\u0971\u09e8\u09f1\u0a68"+
		"\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be8\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68"+
		"\u0d71\u0de8\u0df1\u0e52\u0e5b\u0ed2\u0edb\u0f22\u0f2b\u1042\u104b\u1092"+
		"\u109b\u17e2\u17eb\u1812\u181b\u1948\u1951\u19d2\u19db\u1a82\u1a8b\u1a92"+
		"\u1a9b\u1b52\u1b5b\u1bb2\u1bbb\u1c42\u1c4b\u1c52\u1c5b\ua622\ua62b\ua8d2"+
		"\ua8db\ua902\ua90b\ua9d2\ua9db\ua9f2\ua9fb\uaa52\uaa5b\uabf2\uabfb\uff12"+
		"\uff1b\4\2\f\f\17\17\2\u0343\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2"+
		"\2\2\u00d9\3\2\2\2\3\u00db\3\2\2\2\5\u00dd\3\2\2\2\7\u00e2\3\2\2\2\t\u00e4"+
		"\3\2\2\2\13\u00e6\3\2\2\2\r\u00eb\3\2\2\2\17\u00f1\3\2\2\2\21\u00f3\3"+
		"\2\2\2\23\u00f5\3\2\2\2\25\u00f8\3\2\2\2\27\u00fa\3\2\2\2\31\u00fc\3\2"+
		"\2\2\33\u0104\3\2\2\2\35\u0106\3\2\2\2\37\u0108\3\2\2\2!\u010d\3\2\2\2"+
		"#\u0111\3\2\2\2%\u0116\3\2\2\2\'\u0118\3\2\2\2)\u011a\3\2\2\2+\u011c\3"+
		"\2\2\2-\u011e\3\2\2\2/\u0127\3\2\2\2\61\u012a\3\2\2\2\63\u012f\3\2\2\2"+
		"\65\u0135\3\2\2\2\67\u0139\3\2\2\29\u013f\3\2\2\2;\u0147\3\2\2\2=\u014a"+
		"\3\2\2\2?\u014e\3\2\2\2A\u0154\3\2\2\2C\u015a\3\2\2\2E\u0161\3\2\2\2G"+
		"\u0163\3\2\2\2I\u0169\3\2\2\2K\u016b\3\2\2\2M\u016d\3\2\2\2O\u016f\3\2"+
		"\2\2Q\u0173\3\2\2\2S\u0178\3\2\2\2U\u017b\3\2\2\2W\u0180\3\2\2\2Y\u0182"+
		"\3\2\2\2[\u0184\3\2\2\2]\u0187\3\2\2\2_\u018a\3\2\2\2a\u018d\3\2\2\2c"+
		"\u0191\3\2\2\2e\u019a\3\2\2\2g\u01a3\3\2\2\2i\u01a9\3\2\2\2k\u01b0\3\2"+
		"\2\2m\u01b8\3\2\2\2o\u01c2\3\2\2\2q\u01c9\3\2\2\2s\u01cd\3\2\2\2u\u01d3"+
		"\3\2\2\2w\u01da\3\2\2\2y\u01e0\3\2\2\2{\u01e8\3\2\2\2}\u01fb\3\2\2\2\177"+
		"\u0206\3\2\2\2\u0081\u0208\3\2\2\2\u0083\u020f\3\2\2\2\u0085\u0214\3\2"+
		"\2\2\u0087\u022a\3\2\2\2\u0089\u0258\3\2\2\2\u008b\u025a\3\2\2\2\u008d"+
		"\u0262\3\2\2\2\u008f\u0264\3\2\2\2\u0091\u0266\3\2\2\2\u0093\u026e\3\2"+
		"\2\2\u0095\u0277\3\2\2\2\u0097\u0279\3\2\2\2\u0099\u027b\3\2\2\2\u009b"+
		"\u0285\3\2\2\2\u009d\u0287\3\2\2\2\u009f\u028a\3\2\2\2\u00a1\u0295\3\2"+
		"\2\2\u00a3\u029e\3\2\2\2\u00a5\u02a4\3\2\2\2\u00a7\u02a7\3\2\2\2\u00a9"+
		"\u02a9\3\2\2\2\u00ab\u02ad\3\2\2\2\u00ad\u02b1\3\2\2\2\u00af\u02b7\3\2"+
		"\2\2\u00b1\u02b9\3\2\2\2\u00b3\u02c2\3\2\2\2\u00b5\u02c4\3\2\2\2\u00b7"+
		"\u02c6\3\2\2\2\u00b9\u02d1\3\2\2\2\u00bb\u02d3\3\2\2\2\u00bd\u02dd\3\2"+
		"\2\2\u00bf\u02df\3\2\2\2\u00c1\u02e1\3\2\2\2\u00c3\u02ea\3\2\2\2\u00c5"+
		"\u02f1\3\2\2\2\u00c7\u02f3\3\2\2\2\u00c9\u02f5\3\2\2\2\u00cb\u02f7\3\2"+
		"\2\2\u00cd\u02f9\3\2\2\2\u00cf\u02fb\3\2\2\2\u00d1\u02fd\3\2\2\2\u00d3"+
		"\u0300\3\2\2\2\u00d5\u0307\3\2\2\2\u00d7\u030d\3\2\2\2\u00d9\u031c\3\2"+
		"\2\2\u00db\u00dc\7/\2\2\u00dc\4\3\2\2\2\u00dd\u00de\7p\2\2\u00de\u00df"+
		"\7w\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7n\2\2\u00e1\6\3\2\2\2\u00e2\u00e3"+
		"\7\60\2\2\u00e3\b\3\2\2\2\u00e4\u00e5\7.\2\2\u00e5\n\3\2\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7u\2\2\u00ea"+
		"\f\3\2\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7r\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef\u00f0\7t\2\2\u00f0\16\3\2\2\2\u00f1\u00f2\7]\2\2\u00f2"+
		"\20\3\2\2\2\u00f3\u00f4\7_\2\2\u00f4\22\3\2\2\2\u00f5\u00f6\7?\2\2\u00f6"+
		"\u00f7\7@\2\2\u00f7\24\3\2\2\2\u00f8\u00f9\7*\2\2\u00f9\26\3\2\2\2\u00fa"+
		"\u00fb\7+\2\2\u00fb\30\3\2\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7q\2\2\u00fe"+
		"\u00ff\7t\2\2\u00ff\u0100\7U\2\2\u0100\u0101\7q\2\2\u0101\u0102\7o\2\2"+
		"\u0102\u0103\7g\2\2\u0103\32\3\2\2\2\u0104\u0105\7}\2\2\u0105\34\3\2\2"+
		"\2\u0106\u0107\7\177\2\2\u0107\36\3\2\2\2\u0108\u0109\7v\2\2\u0109\u010a"+
		"\7{\2\2\u010a\u010b\7r\2\2\u010b\u010c\7g\2\2\u010c \3\2\2\2\u010d\u010e"+
		"\7x\2\2\u010e\u010f\7c\2\2\u010f\u0110\7n\2\2\u0110\"\3\2\2\2\u0111\u0112"+
		"\7y\2\2\u0112\u0113\7k\2\2\u0113\u0114\7v\2\2\u0114\u0115\7j\2\2\u0115"+
		"$\3\2\2\2\u0116\u0117\7%\2\2\u0117&\3\2\2\2\u0118\u0119\7<\2\2\u0119("+
		"\3\2\2\2\u011a\u011b\7a\2\2\u011b*\3\2\2\2\u011c\u011d\7,\2\2\u011d,\3"+
		"\2\2\2\u011e\u011f\7k\2\2\u011f\u0120\7o\2\2\u0120\u0121\7r\2\2\u0121"+
		"\u0122\7n\2\2\u0122\u0123\7k\2\2\u0123\u0124\7e\2\2\u0124\u0125\7k\2\2"+
		"\u0125\u0126\7v\2\2\u0126.\3\2\2\2\u0127\u0128\7k\2\2\u0128\u0129\7h\2"+
		"\2\u0129\60\3\2\2\2\u012a\u012b\7g\2\2\u012b\u012c\7n\2\2\u012c\u012d"+
		"\7u\2\2\u012d\u012e\7g\2\2\u012e\62\3\2\2\2\u012f\u0130\7y\2\2\u0130\u0131"+
		"\7j\2\2\u0131\u0132\7k\2\2\u0132\u0133\7n\2\2\u0133\u0134\7g\2\2\u0134"+
		"\64\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7{\2\2\u0138"+
		"\66\3\2\2\2\u0139\u013a\7e\2\2\u013a\u013b\7c\2\2\u013b\u013c\7v\2\2\u013c"+
		"\u013d\7e\2\2\u013d\u013e\7j\2\2\u013e8\3\2\2\2\u013f\u0140\7h\2\2\u0140"+
		"\u0141\7k\2\2\u0141\u0142\7p\2\2\u0142\u0143\7c\2\2\u0143\u0144\7n\2\2"+
		"\u0144\u0145\7n\2\2\u0145\u0146\7{\2\2\u0146:\3\2\2\2\u0147\u0148\7f\2"+
		"\2\u0148\u0149\7q\2\2\u0149<\3\2\2\2\u014a\u014b\7h\2\2\u014b\u014c\7"+
		"q\2\2\u014c\u014d\7t\2\2\u014d>\3\2\2\2\u014e\u014f\7{\2\2\u014f\u0150"+
		"\7k\2\2\u0150\u0151\7g\2\2\u0151\u0152\7n\2\2\u0152\u0153\7f\2\2\u0153"+
		"@\3\2\2\2\u0154\u0155\7v\2\2\u0155\u0156\7j\2\2\u0156\u0157\7t\2\2\u0157"+
		"\u0158\7q\2\2\u0158\u0159\7y\2\2\u0159B\3\2\2\2\u015a\u015b\7t\2\2\u015b"+
		"\u015c\7g\2\2\u015c\u015d\7v\2\2\u015d\u015e\7w\2\2\u015e\u015f\7t\2\2"+
		"\u015f\u0160\7p\2\2\u0160D\3\2\2\2\u0161\u0162\7?\2\2\u0162F\3\2\2\2\u0163"+
		"\u0164\7o\2\2\u0164\u0165\7c\2\2\u0165\u0166\7v\2\2\u0166\u0167\7e\2\2"+
		"\u0167\u0168\7j\2\2\u0168H\3\2\2\2\u0169\u016a\7-\2\2\u016aJ\3\2\2\2\u016b"+
		"\u016c\7\u0080\2\2\u016cL\3\2\2\2\u016d\u016e\7#\2\2\u016eN\3\2\2\2\u016f"+
		"\u0170\7p\2\2\u0170\u0171\7g\2\2\u0171\u0172\7y\2\2\u0172P\3\2\2\2\u0173"+
		"\u0174\7n\2\2\u0174\u0175\7c\2\2\u0175\u0176\7|\2\2\u0176\u0177\7{\2\2"+
		"\u0177R\3\2\2\2\u0178\u0179\7>\2\2\u0179\u017a\7/\2\2\u017aT\3\2\2\2\u017b"+
		"\u017c\7e\2\2\u017c\u017d\7c\2\2\u017d\u017e\7u\2\2\u017e\u017f\7g\2\2"+
		"\u017fV\3\2\2\2\u0180\u0181\7~\2\2\u0181X\3\2\2\2\u0182\u0183\7B\2\2\u0183"+
		"Z\3\2\2\2\u0184\u0185\7@\2\2\u0185\u0186\7<\2\2\u0186\\\3\2\2\2\u0187"+
		"\u0188\7>\2\2\u0188\u0189\7<\2\2\u0189^\3\2\2\2\u018a\u018b\7>\2\2\u018b"+
		"\u018c\7\'\2\2\u018c`\3\2\2\2\u018d\u018e\7x\2\2\u018e\u018f\7c\2\2\u018f"+
		"\u0190\7t\2\2\u0190b\3\2\2\2\u0191\u0192\7q\2\2\u0192\u0193\7x\2\2\u0193"+
		"\u0194\7g\2\2\u0194\u0195\7t\2\2\u0195\u0196\7t\2\2\u0196\u0197\7k\2\2"+
		"\u0197\u0198\7f\2\2\u0198\u0199\7g\2\2\u0199d\3\2\2\2\u019a\u019b\7c\2"+
		"\2\u019b\u019c\7d\2\2\u019c\u019d\7u\2\2\u019d\u019e\7v\2\2\u019e\u019f"+
		"\7t\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1\7e\2\2\u01a1\u01a2\7v\2\2\u01a2"+
		"f\3\2\2\2\u01a3\u01a4\7h\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6\7p\2\2\u01a6"+
		"\u01a7\7c\2\2\u01a7\u01a8\7n\2\2\u01a8h\3\2\2\2\u01a9\u01aa\7u\2\2\u01aa"+
		"\u01ab\7g\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7g\2\2"+
		"\u01ae\u01af\7f\2\2\u01afj\3\2\2\2\u01b0\u01b1\7r\2\2\u01b1\u01b2\7t\2"+
		"\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7x\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6"+
		"\7v\2\2\u01b6\u01b7\7g\2\2\u01b7l\3\2\2\2\u01b8\u01b9\7r\2\2\u01b9\u01ba"+
		"\7t\2\2\u01ba\u01bb\7q\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7g\2\2\u01bd"+
		"\u01be\7e\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0\7g\2\2\u01c0\u01c1\7f\2\2"+
		"\u01c1n\3\2\2\2\u01c2\u01c3\7k\2\2\u01c3\u01c4\7o\2\2\u01c4\u01c5\7r\2"+
		"\2\u01c5\u01c6\7q\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8\7v\2\2\u01c8p\3\2"+
		"\2\2\u01c9\u01ca\7f\2\2\u01ca\u01cb\7g\2\2\u01cb\u01cc\7h\2\2\u01ccr\3"+
		"\2\2\2\u01cd\u01ce\7e\2\2\u01ce\u01cf\7n\2\2\u01cf\u01d0\7c\2\2\u01d0"+
		"\u01d1\7u\2\2\u01d1\u01d2\7u\2\2\u01d2t\3\2\2\2\u01d3\u01d4\7q\2\2\u01d4"+
		"\u01d5\7d\2\2\u01d5\u01d6\7l\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7e\2\2"+
		"\u01d8\u01d9\7v\2\2\u01d9v\3\2\2\2\u01da\u01db\7v\2\2\u01db\u01dc\7t\2"+
		"\2\u01dc\u01dd\7c\2\2\u01dd\u01de\7k\2\2\u01de\u01df\7v\2\2\u01dfx\3\2"+
		"\2\2\u01e0\u01e1\7g\2\2\u01e1\u01e2\7z\2\2\u01e2\u01e3\7v\2\2\u01e3\u01e4"+
		"\7g\2\2\u01e4\u01e5\7p\2\2\u01e5\u01e6\7f\2\2\u01e6\u01e7\7u\2\2\u01e7"+
		"z\3\2\2\2\u01e8\u01e9\7r\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\7e\2\2\u01eb"+
		"\u01ec\7m\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee\7i\2\2\u01ee\u01ef\7g\2\2"+
		"\u01ef|\3\2\2\2\u01f0\u01fc\5\u00c3b\2\u01f1\u01f5\7b\2\2\u01f2\u01f6"+
		"\5\u0097L\2\u01f3\u01f6\5\u0099M\2\u01f4\u01f6\5\u00b7\\\2\u01f5\u01f2"+
		"\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\7b"+
		"\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f0\3\2\2\2\u01fb\u01f1\3\2\2\2\u01fc"+
		"~\3\2\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7t\2\2\u01ff\u0200\7w\2\2\u0200"+
		"\u0207\7g\2\2\u0201\u0202\7h\2\2\u0202\u0203\7c\2\2\u0203\u0204\7n\2\2"+
		"\u0204\u0205\7u\2\2\u0205\u0207\7g\2\2\u0206\u01fd\3\2\2\2\u0206\u0201"+
		"\3\2\2\2\u0207\u0080\3\2\2\2\u0208\u020b\7)\2\2\u0209\u020c\5\u00b3Z\2"+
		"\u020a\u020c\5\u00b7\\\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\7)\2\2\u020e\u0082\3\2\2\2\u020f\u0210\7)\2"+
		"\2\u0210\u0211\5\u00c3b\2\u0211\u0084\3\2\2\2\u0212\u0215\5\u00b9]\2\u0213"+
		"\u0215\5\u00bb^\2\u0214\u0212\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u0217"+
		"\3\2\2\2\u0216\u0218\t\2\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0086\3\2\2\2\u0219\u021d\7$\2\2\u021a\u021c\5\u00a3R\2\u021b\u021a\3"+
		"\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0220\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u022b\7$\2\2\u0221\u0222\7$\2"+
		"\2\u0222\u0223\7$\2\2\u0223\u0224\7$\2\2\u0224\u0225\3\2\2\2\u0225\u0226"+
		"\5\u00a5S\2\u0226\u0227\7$\2\2\u0227\u0228\7$\2\2\u0228\u0229\7$\2\2\u0229"+
		"\u022b\3\2\2\2\u022a\u0219\3\2\2\2\u022a\u0221\3\2\2\2\u022b\u0088\3\2"+
		"\2\2\u022c\u022e\5\u00bd_\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\7\60"+
		"\2\2\u0232\u0234\5\u00bd_\2\u0233\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0239\5\u00b1"+
		"Y\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a"+
		"\u023c\5\u00a9U\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0259"+
		"\3\2\2\2\u023d\u023f\7\60\2\2\u023e\u0240\5\u00bd_\2\u023f\u023e\3\2\2"+
		"\2\u0240\u0241\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244"+
		"\3\2\2\2\u0243\u0245\5\u00b1Y\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2"+
		"\2\u0245\u0247\3\2\2\2\u0246\u0248\5\u00a9U\2\u0247\u0246\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0259\3\2\2\2\u0249\u024a\5\u00bd_\2\u024a\u024c"+
		"\5\u00b1Y\2\u024b\u024d\5\u00a9U\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u0259\3\2\2\2\u024e\u0250\5\u00bd_\2\u024f\u024e\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2"+
		"\2\2\u0253\u0255\5\u00b1Y\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0257\5\u00a9U\2\u0257\u0259\3\2\2\2\u0258\u022d"+
		"\3\2\2\2\u0258\u023d\3\2\2\2\u0258\u0249\3\2\2\2\u0258\u024f\3\2\2\2\u0259"+
		"\u008a\3\2\2\2\u025a\u025b\5\u00adW\2\u025b\u025c\5\u00a1Q\2\u025c\u008c"+
		"\3\2\2\2\u025d\u0263\5\u008bF\2\u025e\u025f\7b\2\2\u025f\u0260\5\u008b"+
		"F\2\u0260\u0261\7b\2\2\u0261\u0263\3\2\2\2\u0262\u025d\3\2\2\2\u0262\u025e"+
		"\3\2\2\2\u0263\u008e\3\2\2\2\u0264\u0265\t\3\2\2\u0265\u0090\3\2\2\2\u0266"+
		"\u0267\t\4\2\2\u0267\u0092\3\2\2\2\u0268\u026f\7=\2\2\u0269\u026b\5\u0095"+
		"K\2\u026a\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u0268\3\2\2\2\u026e\u026a\3\2"+
		"\2\2\u026f\u0270\3\2\2\2\u0270\u0271\bJ\2\2\u0271\u0094\3\2\2\2\u0272"+
		"\u0278\7\f\2\2\u0273\u0275\7\17\2\2\u0274\u0276\7\f\2\2\u0275\u0274\3"+
		"\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0272\3\2\2\2\u0277"+
		"\u0273\3\2\2\2\u0278\u0096\3\2\2\2\u0279\u027a\t\5\2\2\u027a\u0098\3\2"+
		"\2\2\u027b\u027c\7^\2\2\u027c\u027e\7w\2\2\u027d\u027f\7w\2\2\u027e\u027d"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\5\u00a7T"+
		"\2\u0281\u0282\5\u00a7T\2\u0282\u0283\5\u00a7T\2\u0283\u0284\5\u00a7T"+
		"\2\u0284\u009a\3\2\2\2\u0285\u0286\t\6\2\2\u0286\u009c\3\2\2\2\u0287\u0288"+
		"\t\7\2\2\u0288\u009e\3\2\2\2\u0289\u028b\7\61\2\2\u028a\u0289\3\2\2\2"+
		"\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028e\5\u009dO\2\u028d"+
		"\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290\u00a0\3\2\2\2\u0291\u0294\5\u00afX\2\u0292\u0294\5\u00bd_\2"+
		"\u0293\u0291\3\2\2\2\u0293\u0292\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u029a\3\2\2\2\u0297\u0295\3\2\2\2\u0298"+
		"\u0299\7a\2\2\u0299\u029b\5\u009fP\2\u029a\u0298\3\2\2\2\u029a\u029b\3"+
		"\2\2\2\u029b\u00a2\3\2\2\2\u029c\u029f\t\b\2\2\u029d\u029f\5\u00b7\\\2"+
		"\u029e\u029c\3\2\2\2\u029e\u029d\3\2\2\2\u029f\u00a4\3\2\2\2\u02a0\u02a3"+
		"\5\u00a3R\2\u02a1\u02a3\5\u0095K\2\u02a2\u02a0\3\2\2\2\u02a2\u02a1\3\2"+
		"\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u00a6\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\t\t\2\2\u02a8\u00a8\3\2"+
		"\2\2\u02a9\u02aa\t\n\2\2\u02aa\u00aa\3\2\2\2\u02ab\u02ae\t\13\2\2\u02ac"+
		"\u02ae\5\u00c7d\2\u02ad\u02ab\3\2\2\2\u02ad\u02ac\3\2\2\2\u02ae\u00ac"+
		"\3\2\2\2\u02af\u02b2\4c|\2\u02b0\u02b2\5\u00c9e\2\u02b1\u02af\3\2\2\2"+
		"\u02b1\u02b0\3\2\2\2\u02b2\u00ae\3\2\2\2\u02b3\u02b8\5\u00abV\2\u02b4"+
		"\u02b8\5\u00adW\2\u02b5\u02b8\5\u00cfh\2\u02b6\u02b8\5\u00cbf\2\u02b7"+
		"\u02b3\3\2\2\2\u02b7\u02b4\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b6\3\2"+
		"\2\2\u02b8\u00b0\3\2\2\2\u02b9\u02bb\t\f\2\2\u02ba\u02bc\t\r\2\2\u02bb"+
		"\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bf\5\u00bd"+
		"_\2\u02be\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u00b2\3\2\2\2\u02c2\u02c3\4\"\u0081\2\u02c3\u00b4"+
		"\3\2\2\2\u02c4\u02c5\4#\u0081\2\u02c5\u00b6\3\2\2\2\u02c6\u02c7\7^\2\2"+
		"\u02c7\u02c8\t\16\2\2\u02c8\u00b8\3\2\2\2\u02c9\u02d2\7\62\2\2\u02ca\u02ce"+
		"\5\u00bf`\2\u02cb\u02cd\5\u00bd_\2\u02cc\u02cb\3\2\2\2\u02cd\u02d0\3\2"+
		"\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d1\u02c9\3\2\2\2\u02d1\u02ca\3\2\2\2\u02d2\u00ba\3\2"+
		"\2\2\u02d3\u02d4\7\62\2\2\u02d4\u02d5\7z\2\2\u02d5\u02d7\5\u00a7T\2\u02d6"+
		"\u02d8\5\u00a7T\2\u02d7\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02d7"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u00bc\3\2\2\2\u02db\u02de\7\62\2\2"+
		"\u02dc\u02de\5\u00bf`\2\u02dd\u02db\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de"+
		"\u00be\3\2\2\2\u02df\u02e0\4\63;\2\u02e0\u00c0\3\2\2\2\u02e1\u02e2\5\u008b"+
		"F\2\u02e2\u00c2\3\2\2\2\u02e3\u02e4\5\u00abV\2\u02e4\u02e5\5\u00a1Q\2"+
		"\u02e5\u02eb\3\2\2\2\u02e6\u02e7\5\u00adW\2\u02e7\u02e8\5\u00a1Q\2\u02e8"+
		"\u02eb\3\2\2\2\u02e9\u02eb\5\u009fP\2\u02ea\u02e3\3\2\2\2\u02ea\u02e6"+
		"\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb\u00c4\3\2\2\2\u02ec\u02f2\5\u00c7d"+
		"\2\u02ed\u02f2\5\u00c9e\2\u02ee\u02f2\5\u00cbf\2\u02ef\u02f2\5\u00cdg"+
		"\2\u02f0\u02f2\5\u00cfh\2\u02f1\u02ec\3\2\2\2\u02f1\u02ed\3\2\2\2\u02f1"+
		"\u02ee\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f0\3\2\2\2\u02f2\u00c6\3\2"+
		"\2\2\u02f3\u02f4\t\17\2\2\u02f4\u00c8\3\2\2\2\u02f5\u02f6\t\20\2\2\u02f6"+
		"\u00ca\3\2\2\2\u02f7\u02f8\t\21\2\2\u02f8\u00cc\3\2\2\2\u02f9\u02fa\t"+
		"\22\2\2\u02fa\u00ce\3\2\2\2\u02fb\u02fc\t\23\2\2\u02fc\u00d0\3\2\2\2\u02fd"+
		"\u02fe\t\24\2\2\u02fe\u00d2\3\2\2\2\u02ff\u0301\5\u0095K\2\u0300\u02ff"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0305\bj\2\2\u0305\u00d4\3\2\2\2\u0306\u0308\5\u009b"+
		"N\2\u0307\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0307\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\bk\2\2\u030c\u00d6\3\2"+
		"\2\2\u030d\u030e\7\61\2\2\u030e\u030f\7,\2\2\u030f\u0314\3\2\2\2\u0310"+
		"\u0313\5\u00d7l\2\u0311\u0313\13\2\2\2\u0312\u0310\3\2\2\2\u0312\u0311"+
		"\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315"+
		"\u0317\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0318\7,\2\2\u0318\u0319\7\61"+
		"\2\2\u0319\u031a\3\2\2\2\u031a\u031b\bl\2\2\u031b\u00d8\3\2\2\2\u031c"+
		"\u031d\7\61\2\2\u031d\u031e\7\61\2\2\u031e\u0322\3\2\2\2\u031f\u0321\n"+
		"\25\2\2\u0320\u031f\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0326\bm"+
		"\2\2\u0326\u00da\3\2\2\2\65\2\u01f5\u01f7\u01fb\u0206\u020b\u0214\u0217"+
		"\u021d\u022a\u022f\u0235\u0238\u023b\u0241\u0244\u0247\u024c\u0251\u0254"+
		"\u0258\u0262\u026c\u026e\u0275\u0277\u027e\u028a\u028f\u0293\u0295\u029a"+
		"\u029e\u02a2\u02a4\u02ad\u02b1\u02b7\u02bb\u02c0\u02ce\u02d1\u02d9\u02dd"+
		"\u02ea\u02f1\u0302\u0309\u0312\u0314\u0322\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}