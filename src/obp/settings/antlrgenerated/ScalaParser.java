// Generated from C:/Users/Anna/Documents/GitHub/OBP-IntelliJ-plugin/src/obp/settings/scalagrammar\Scala.g4 by ANTLR 4.9.1
package obp.settings.antlrgenerated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScalaParser extends Parser {
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
	public static final int
		RULE_literal = 0, RULE_qualId = 1, RULE_ids = 2, RULE_stableId = 3, RULE_classQualifier = 4, 
		RULE_type_ = 5, RULE_functionArgTypes = 6, RULE_existentialClause = 7, 
		RULE_existentialDcl = 8, RULE_infixType = 9, RULE_compoundType = 10, RULE_annotType = 11, 
		RULE_simpleType = 12, RULE_typeArgs = 13, RULE_types = 14, RULE_refinement = 15, 
		RULE_refineStat = 16, RULE_typePat = 17, RULE_ascription = 18, RULE_expr = 19, 
		RULE_expr1 = 20, RULE_prefixDef = 21, RULE_postfixExpr = 22, RULE_infixExpr = 23, 
		RULE_prefixExpr = 24, RULE_simpleExpr = 25, RULE_simpleExpr1 = 26, RULE_exprs = 27, 
		RULE_argumentExprs = 28, RULE_args = 29, RULE_blockExpr = 30, RULE_block = 31, 
		RULE_blockStat = 32, RULE_resultExpr = 33, RULE_enumerators = 34, RULE_generator = 35, 
		RULE_caseClauses = 36, RULE_caseClause = 37, RULE_guard = 38, RULE_pattern = 39, 
		RULE_pattern1 = 40, RULE_pattern2 = 41, RULE_pattern3 = 42, RULE_simplePattern = 43, 
		RULE_patterns = 44, RULE_typeParamClause = 45, RULE_funTypeParamClause = 46, 
		RULE_variantTypeParam = 47, RULE_typeParam = 48, RULE_paramClauses = 49, 
		RULE_paramClause = 50, RULE_params = 51, RULE_param = 52, RULE_paramType = 53, 
		RULE_classParamClauses = 54, RULE_classParamClause = 55, RULE_classParams = 56, 
		RULE_classParam = 57, RULE_bindings = 58, RULE_binding = 59, RULE_modifier = 60, 
		RULE_localModifier = 61, RULE_accessModifier = 62, RULE_accessQualifier = 63, 
		RULE_annotation = 64, RULE_constrAnnotation = 65, RULE_templateBody = 66, 
		RULE_templateStat = 67, RULE_selfType = 68, RULE_import_ = 69, RULE_importExpr = 70, 
		RULE_importSelectors = 71, RULE_importSelector = 72, RULE_dcl = 73, RULE_valDcl = 74, 
		RULE_varDcl = 75, RULE_funDcl = 76, RULE_funSig = 77, RULE_typeDcl = 78, 
		RULE_patVarDef = 79, RULE_def = 80, RULE_patDef = 81, RULE_varDef = 82, 
		RULE_funDef = 83, RULE_typeDef = 84, RULE_tmplDef = 85, RULE_classDef = 86, 
		RULE_traitDef = 87, RULE_objectDef = 88, RULE_classTemplateOpt = 89, RULE_traitTemplateOpt = 90, 
		RULE_classTemplate = 91, RULE_traitTemplate = 92, RULE_classParents = 93, 
		RULE_traitParents = 94, RULE_constr = 95, RULE_earlyDefs = 96, RULE_earlyDef = 97, 
		RULE_constrExpr = 98, RULE_constrBlock = 99, RULE_selfInvocation = 100, 
		RULE_topStatSeq = 101, RULE_topStat = 102, RULE_packaging = 103, RULE_packageObject = 104, 
		RULE_compilationUnit = 105;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "qualId", "ids", "stableId", "classQualifier", "type_", "functionArgTypes", 
			"existentialClause", "existentialDcl", "infixType", "compoundType", "annotType", 
			"simpleType", "typeArgs", "types", "refinement", "refineStat", "typePat", 
			"ascription", "expr", "expr1", "prefixDef", "postfixExpr", "infixExpr", 
			"prefixExpr", "simpleExpr", "simpleExpr1", "exprs", "argumentExprs", 
			"args", "blockExpr", "block", "blockStat", "resultExpr", "enumerators", 
			"generator", "caseClauses", "caseClause", "guard", "pattern", "pattern1", 
			"pattern2", "pattern3", "simplePattern", "patterns", "typeParamClause", 
			"funTypeParamClause", "variantTypeParam", "typeParam", "paramClauses", 
			"paramClause", "params", "param", "paramType", "classParamClauses", "classParamClause", 
			"classParams", "classParam", "bindings", "binding", "modifier", "localModifier", 
			"accessModifier", "accessQualifier", "annotation", "constrAnnotation", 
			"templateBody", "templateStat", "selfType", "import_", "importExpr", 
			"importSelectors", "importSelector", "dcl", "valDcl", "varDcl", "funDcl", 
			"funSig", "typeDcl", "patVarDef", "def", "patDef", "varDef", "funDef", 
			"typeDef", "tmplDef", "classDef", "traitDef", "objectDef", "classTemplateOpt", 
			"traitTemplateOpt", "classTemplate", "traitTemplate", "classParents", 
			"traitParents", "constr", "earlyDefs", "earlyDef", "constrExpr", "constrBlock", 
			"selfInvocation", "topStatSeq", "topStat", "packaging", "packageObject", 
			"compilationUnit"
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

	@Override
	public String getGrammarFileName() { return "Scala.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScalaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ScalaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ScalaParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ScalaParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ScalaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ScalaParser.StringLiteral, 0); }
		public TerminalNode SymbolLiteral() { return getToken(ScalaParser.SymbolLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(212);
					match(T__0);
					}
				}

				setState(215);
				match(IntegerLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(216);
					match(T__0);
					}
				}

				setState(219);
				match(FloatingPointLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(CharacterLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(StringLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				match(SymbolLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
				match(T__1);
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

	public static class QualIdContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public QualIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterQualId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitQualId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitQualId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualIdContext qualId() throws RecognitionException {
		QualIdContext _localctx = new QualIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(Id);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(228);
				match(T__2);
				setState(229);
				match(Id);
				}
				}
				setState(234);
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

	public static class IdsContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(Id);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(236);
				match(T__3);
				setState(237);
				match(Id);
				}
				}
				setState(242);
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

	public static class StableIdContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public ClassQualifierContext classQualifier() {
			return getRuleContext(ClassQualifierContext.class,0);
		}
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public StableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterStableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitStableId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitStableId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StableIdContext stableId() throws RecognitionException {
		return stableId(0);
	}

	private StableIdContext stableId(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StableIdContext _localctx = new StableIdContext(_ctx, _parentState);
		StableIdContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_stableId, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(244);
				match(Id);
				}
				break;
			case 2:
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(245);
					match(Id);
					setState(246);
					match(T__2);
					}
				}

				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(249);
					match(T__4);
					}
					break;
				case T__5:
					{
					setState(250);
					match(T__5);
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(251);
						classQualifier();
						}
					}

					setState(254);
					match(T__2);
					setState(255);
					match(Id);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StableIdContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stableId);
					setState(260);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(261);
					match(T__2);
					setState(262);
					match(Id);
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ClassQualifierContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ClassQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitClassQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassQualifierContext classQualifier() throws RecognitionException {
		ClassQualifierContext _localctx = new ClassQualifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__6);
			setState(269);
			match(Id);
			setState(270);
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

	public static class Type_Context extends ParserRuleContext {
		public FunctionArgTypesContext functionArgTypes() {
			return getRuleContext(FunctionArgTypesContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public ExistentialClauseContext existentialClause() {
			return getRuleContext(ExistentialClauseContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				functionArgTypes();
				setState(273);
				match(T__8);
				setState(274);
				type_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				infixType();
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(277);
					existentialClause();
					}
				}

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

	public static class FunctionArgTypesContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public List<ParamTypeContext> paramType() {
			return getRuleContexts(ParamTypeContext.class);
		}
		public ParamTypeContext paramType(int i) {
			return getRuleContext(ParamTypeContext.class,i);
		}
		public FunctionArgTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterFunctionArgTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitFunctionArgTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitFunctionArgTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgTypesContext functionArgTypes() throws RecognitionException {
		FunctionArgTypesContext _localctx = new FunctionArgTypesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionArgTypes);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				infixType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(T__9);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << Id))) != 0) || _la==NL) {
					{
					setState(284);
					paramType();
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(285);
						match(T__3);
						setState(286);
						paramType();
						}
						}
						setState(291);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(294);
				match(T__10);
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

	public static class ExistentialClauseContext extends ParserRuleContext {
		public List<ExistentialDclContext> existentialDcl() {
			return getRuleContexts(ExistentialDclContext.class);
		}
		public ExistentialDclContext existentialDcl(int i) {
			return getRuleContext(ExistentialDclContext.class,i);
		}
		public ExistentialClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existentialClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterExistentialClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitExistentialClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitExistentialClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistentialClauseContext existentialClause() throws RecognitionException {
		ExistentialClauseContext _localctx = new ExistentialClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_existentialClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__11);
			setState(298);
			match(T__12);
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(299);
				existentialDcl();
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 || _la==T__15 );
			setState(304);
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

	public static class ExistentialDclContext extends ParserRuleContext {
		public TypeDclContext typeDcl() {
			return getRuleContext(TypeDclContext.class,0);
		}
		public ValDclContext valDcl() {
			return getRuleContext(ValDclContext.class,0);
		}
		public ExistentialDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existentialDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterExistentialDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitExistentialDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitExistentialDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistentialDclContext existentialDcl() throws RecognitionException {
		ExistentialDclContext _localctx = new ExistentialDclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_existentialDcl);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(T__14);
				setState(307);
				typeDcl();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(T__15);
				setState(309);
				valDcl();
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

	public static class InfixTypeContext extends ParserRuleContext {
		public List<CompoundTypeContext> compoundType() {
			return getRuleContexts(CompoundTypeContext.class);
		}
		public CompoundTypeContext compoundType(int i) {
			return getRuleContext(CompoundTypeContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public InfixTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterInfixType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitInfixType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitInfixType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixTypeContext infixType() throws RecognitionException {
		InfixTypeContext _localctx = new InfixTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_infixType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			compoundType();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					match(Id);
					setState(314);
					compoundType();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class CompoundTypeContext extends ParserRuleContext {
		public List<AnnotTypeContext> annotType() {
			return getRuleContexts(AnnotTypeContext.class);
		}
		public AnnotTypeContext annotType(int i) {
			return getRuleContext(AnnotTypeContext.class,i);
		}
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public CompoundTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterCompoundType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitCompoundType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitCompoundType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundTypeContext compoundType() throws RecognitionException {
		CompoundTypeContext _localctx = new CompoundTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compoundType);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__9:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				annotType();
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(321);
					match(T__16);
					setState(322);
					annotType();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(328);
					refinement();
					}
					break;
				}
				}
				break;
			case T__12:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				refinement();
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

	public static class AnnotTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterAnnotType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitAnnotType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitAnnotType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotTypeContext annotType() throws RecognitionException {
		AnnotTypeContext _localctx = new AnnotTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			simpleType(0);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					annotation();
					}
					} 
				}
				setState(340);
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
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypeArgsContext typeArgs() {
			return getRuleContext(TypeArgsContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		return simpleType(0);
	}

	private SimpleTypeContext simpleType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, _parentState);
		SimpleTypeContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_simpleType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case Id:
				{
				setState(342);
				stableId(0);
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(343);
					match(T__2);
					setState(344);
					match(T__14);
					}
					break;
				}
				}
				break;
			case T__9:
				{
				setState(347);
				match(T__9);
				setState(348);
				types();
				setState(349);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(358);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleType);
						setState(353);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(354);
						typeArgs();
						}
						break;
					case 2:
						{
						_localctx = new SimpleTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleType);
						setState(355);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(356);
						match(T__17);
						setState(357);
						match(Id);
						}
						break;
					}
					} 
				}
				setState(362);
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

	public static class TypeArgsContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TypeArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypeArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypeArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTypeArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgsContext typeArgs() throws RecognitionException {
		TypeArgsContext _localctx = new TypeArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__6);
			setState(364);
			types();
			setState(365);
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

	public static class TypesContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			type_();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(368);
				match(T__3);
				setState(369);
				type_();
				}
				}
				setState(374);
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

	public static class RefinementContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public List<RefineStatContext> refineStat() {
			return getRuleContexts(RefineStatContext.class);
		}
		public RefineStatContext refineStat(int i) {
			return getRuleContext(RefineStatContext.class,i);
		}
		public RefinementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterRefinement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitRefinement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitRefinement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_refinement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(375);
				match(NL);
				}
			}

			setState(378);
			match(T__12);
			setState(380); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(379);
				refineStat();
				}
				}
				setState(382); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__47) | (1L << T__55))) != 0) );
			setState(384);
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

	public static class RefineStatContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public RefineStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refineStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterRefineStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitRefineStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitRefineStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefineStatContext refineStat() throws RecognitionException {
		RefineStatContext _localctx = new RefineStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_refineStat);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				dcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(T__14);
				setState(388);
				typeDef();
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

	public static class TypePatContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypePatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypePat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypePat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTypePat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePatContext typePat() throws RecognitionException {
		TypePatContext _localctx = new TypePatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typePat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			type_();
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

	public static class AscriptionContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AscriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterAscription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitAscription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitAscription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscriptionContext ascription() throws RecognitionException {
		AscriptionContext _localctx = new AscriptionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ascription);
		try {
			int _alt;
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(T__18);
				setState(394);
				infixType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(T__18);
				setState(397); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(396);
						annotation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(399); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(T__18);
				setState(402);
				match(T__19);
				setState(403);
				match(T__20);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BindingsContext bindings() {
			return getRuleContext(BindingsContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		int _la;
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(406);
					bindings();
					}
					break;
				case T__21:
				case Id:
					{
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(407);
						match(T__21);
						}
					}

					setState(410);
					match(Id);
					}
					break;
				case T__19:
					{
					setState(411);
					match(T__19);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(414);
				match(T__8);
				setState(415);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				expr1();
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

	public static class Expr1Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ScalaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ScalaParser.NL, i);
		}
		public EnumeratorsContext enumerators() {
			return getRuleContext(EnumeratorsContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SimpleExpr1Context simpleExpr1() {
			return getRuleContext(SimpleExpr1Context.class,0);
		}
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public AscriptionContext ascription() {
			return getRuleContext(AscriptionContext.class,0);
		}
		public CaseClausesContext caseClauses() {
			return getRuleContext(CaseClausesContext.class,0);
		}
		public GeneratorContext generator() {
			return getRuleContext(GeneratorContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr1);
		int _la;
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(T__22);
				setState(420);
				match(T__9);
				setState(421);
				expr();
				setState(422);
				match(T__10);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(423);
					match(NL);
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(429);
				expr();
				setState(432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(430);
					match(T__23);
					setState(431);
					expr();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(T__24);
				setState(435);
				match(T__9);
				setState(436);
				expr();
				setState(437);
				match(T__10);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(438);
					match(NL);
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(444);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(T__25);
				setState(447);
				expr();
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(448);
					match(T__26);
					setState(449);
					expr();
					}
					break;
				}
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(452);
					match(T__27);
					setState(453);
					expr();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				match(T__28);
				setState(457);
				expr();
				setState(458);
				match(T__24);
				setState(459);
				match(T__9);
				setState(460);
				expr();
				setState(461);
				match(T__10);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
				match(T__29);
				setState(472);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(464);
					match(T__9);
					setState(465);
					enumerators();
					setState(466);
					match(T__10);
					}
					break;
				case T__12:
					{
					setState(468);
					match(T__12);
					setState(469);
					enumerators();
					setState(470);
					match(T__13);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(474);
					match(T__30);
					}
				}

				setState(477);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(479);
				match(T__31);
				setState(480);
				expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(481);
				match(T__32);
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(482);
					expr();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(490);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(485);
						simpleExpr();
						}
						break;
					case 2:
						{
						setState(486);
						simpleExpr1(0);
						setState(488);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__19) {
							{
							setState(487);
							match(T__19);
							}
						}

						}
						break;
					}
					setState(492);
					match(T__2);
					}
					break;
				}
				setState(496);
				match(Id);
				setState(497);
				match(T__33);
				setState(498);
				expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(499);
				simpleExpr1(0);
				setState(500);
				argumentExprs();
				setState(501);
				match(T__33);
				setState(502);
				expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(504);
				postfixExpr();
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(505);
					ascription();
					}
				}

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(508);
				postfixExpr();
				setState(509);
				match(T__34);
				setState(510);
				match(T__12);
				setState(511);
				caseClauses();
				setState(512);
				match(T__13);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(514);
				generator();
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

	public static class PrefixDefContext extends ParserRuleContext {
		public PrefixDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPrefixDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPrefixDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPrefixDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixDefContext prefixDef() throws RecognitionException {
		PrefixDefContext _localctx = new PrefixDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_prefixDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
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

	public static class PostfixExprContext extends ParserRuleContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public List<PrefixDefContext> prefixDef() {
			return getRuleContexts(PrefixDefContext.class);
		}
		public PrefixDefContext prefixDef(int i) {
			return getRuleContext(PrefixDefContext.class,i);
		}
		public List<SimpleExpr1Context> simpleExpr1() {
			return getRuleContexts(SimpleExpr1Context.class);
		}
		public SimpleExpr1Context simpleExpr1(int i) {
			return getRuleContext(SimpleExpr1Context.class,i);
		}
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_postfixExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			infixExpr(0);
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(520);
				match(Id);
				}
				break;
			}
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					prefixDef();
					setState(524);
					simpleExpr1(0);
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(531);
				match(NL);
				}
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

	public static class InfixExprContext extends ParserRuleContext {
		public PrefixExprContext prefixExpr() {
			return getRuleContext(PrefixExprContext.class,0);
		}
		public List<InfixExprContext> infixExpr() {
			return getRuleContexts(InfixExprContext.class);
		}
		public InfixExprContext infixExpr(int i) {
			return getRuleContext(InfixExprContext.class,i);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public InfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprContext infixExpr() throws RecognitionException {
		return infixExpr(0);
	}

	private InfixExprContext infixExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprContext _localctx = new InfixExprContext(_ctx, _parentState);
		InfixExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_infixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(535);
			prefixExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
					setState(537);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(538);
					match(Id);
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NL) {
						{
						setState(539);
						match(NL);
						}
					}

					setState(542);
					infixExpr(2);
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class PrefixExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SimpleExpr1Context simpleExpr1() {
			return getRuleContext(SimpleExpr1Context.class,0);
		}
		public PrefixDefContext prefixDef() {
			return getRuleContext(PrefixDefContext.class,0);
		}
		public PrefixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPrefixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPrefixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixExprContext prefixExpr() throws RecognitionException {
		PrefixExprContext _localctx = new PrefixExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_prefixExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(548);
				prefixDef();
				}
				break;
			}
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(551);
				simpleExpr();
				}
				break;
			case 2:
				{
				setState(552);
				simpleExpr1(0);
				setState(554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(553);
					match(T__19);
					}
					break;
				}
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

	public static class SimpleExprContext extends ParserRuleContext {
		public ClassTemplateContext classTemplate() {
			return getRuleContext(ClassTemplateContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_simpleExpr);
		try {
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(T__38);
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(559);
					classTemplate();
					}
					break;
				case 2:
					{
					setState(560);
					templateBody();
					}
					break;
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				blockExpr();
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

	public static class SimpleExpr1Context extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeArgsContext typeArgs() {
			return getRuleContext(TypeArgsContext.class,0);
		}
		public SimpleExpr1Context simpleExpr1() {
			return getRuleContext(SimpleExpr1Context.class,0);
		}
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public SimpleExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSimpleExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSimpleExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitSimpleExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpr1Context simpleExpr1() throws RecognitionException {
		return simpleExpr1(0);
	}

	private SimpleExpr1Context simpleExpr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpr1Context _localctx = new SimpleExpr1Context(_ctx, _parentState);
		SimpleExpr1Context _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_simpleExpr1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(567);
				literal();
				}
				break;
			case 2:
				{
				setState(568);
				stableId(0);
				}
				break;
			case 3:
				{
				setState(569);
				match(T__19);
				}
				break;
			case 4:
				{
				setState(570);
				match(T__9);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__12) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << Id) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Varid - 64)) | (1L << (BoundVarid - 64)))) != 0)) {
					{
					setState(571);
					exprs();
					}
				}

				setState(574);
				match(T__10);
				}
				break;
			case 5:
				{
				setState(575);
				simpleExpr();
				setState(576);
				match(T__2);
				setState(577);
				match(Id);
				}
				break;
			case 6:
				{
				setState(579);
				simpleExpr();
				setState(580);
				typeArgs();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(597);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExpr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr1);
						setState(584);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(586);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__19) {
							{
							setState(585);
							match(T__19);
							}
						}

						setState(588);
						match(T__2);
						setState(589);
						match(Id);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExpr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr1);
						setState(590);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(592);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__19) {
							{
							setState(591);
							match(T__19);
							}
						}

						setState(594);
						typeArgs();
						}
						break;
					case 3:
						{
						_localctx = new SimpleExpr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr1);
						setState(595);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(596);
						argumentExprs();
						}
						break;
					}
					} 
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			expr();
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(603);
					match(T__3);
					setState(604);
					expr();
					}
					} 
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class ArgumentExprsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public ArgumentExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterArgumentExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitArgumentExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitArgumentExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExprsContext argumentExprs() throws RecognitionException {
		ArgumentExprsContext _localctx = new ArgumentExprsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argumentExprs);
		int _la;
		try {
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(T__9);
				setState(611);
				args();
				setState(612);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(T__12);
				setState(615);
				args();
				setState(616);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(618);
					match(NL);
					}
				}

				setState(621);
				blockExpr();
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

	public static class ArgsContext extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_args);
		int _la;
		try {
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__12) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << Id) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Varid - 64)) | (1L << (BoundVarid - 64)))) != 0)) {
					{
					setState(624);
					exprs();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(627);
					exprs();
					setState(628);
					match(T__3);
					}
					break;
				}
				setState(632);
				postfixExpr();
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
					{
					setState(633);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

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

	public static class BlockExprContext extends ParserRuleContext {
		public CaseClausesContext caseClauses() {
			return getRuleContext(CaseClausesContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitBlockExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitBlockExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExprContext blockExpr() throws RecognitionException {
		BlockExprContext _localctx = new BlockExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_blockExpr);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				match(T__12);
				setState(639);
				caseClauses();
				setState(640);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(T__12);
				setState(643);
				block();
				setState(644);
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatContext> blockStat() {
			return getRuleContexts(BlockStatContext.class);
		}
		public BlockStatContext blockStat(int i) {
			return getRuleContext(BlockStatContext.class,i);
		}
		public ResultExprContext resultExpr() {
			return getRuleContext(ResultExprContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(648);
					blockStat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(651); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__12) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << Id) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Varid - 64)) | (1L << (BoundVarid - 64)))) != 0)) {
				{
				setState(653);
				resultExpr();
				}
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

	public static class BlockStatContext extends ParserRuleContext {
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TmplDefContext tmplDef() {
			return getRuleContext(TmplDefContext.class,0);
		}
		public List<LocalModifierContext> localModifier() {
			return getRuleContexts(LocalModifierContext.class);
		}
		public LocalModifierContext localModifier(int i) {
			return getRuleContext(LocalModifierContext.class,i);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public BlockStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitBlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatContext blockStat() throws RecognitionException {
		BlockStatContext _localctx = new BlockStatContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_blockStat);
		int _la;
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				import_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(657);
					annotation();
					}
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__39) {
					{
					setState(663);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__39) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(666);
				def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(667);
					annotation();
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) {
					{
					{
					setState(673);
					localModifier();
					}
					}
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(679);
				tmplDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(680);
				expr1();
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

	public static class ResultExprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BindingsContext bindings() {
			return getRuleContext(BindingsContext.class,0);
		}
		public CompoundTypeContext compoundType() {
			return getRuleContext(CompoundTypeContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ResultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterResultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitResultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitResultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultExprContext resultExpr() throws RecognitionException {
		ResultExprContext _localctx = new ResultExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_resultExpr);
		int _la;
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(684);
					bindings();
					}
					break;
				case T__19:
				case T__21:
				case Id:
					{
					setState(690);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__21:
					case Id:
						{
						setState(686);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__21) {
							{
							setState(685);
							match(T__21);
							}
						}

						setState(688);
						match(Id);
						}
						break;
					case T__19:
						{
						setState(689);
						match(T__19);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(692);
					match(T__18);
					setState(693);
					compoundType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(696);
				match(T__8);
				setState(697);
				block();
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

	public static class EnumeratorsContext extends ParserRuleContext {
		public List<GeneratorContext> generator() {
			return getRuleContexts(GeneratorContext.class);
		}
		public GeneratorContext generator(int i) {
			return getRuleContext(GeneratorContext.class,i);
		}
		public EnumeratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterEnumerators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitEnumerators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitEnumerators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorsContext enumerators() throws RecognitionException {
		EnumeratorsContext _localctx = new EnumeratorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_enumerators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(701);
				generator();
				}
				}
				setState(704); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__19) | (1L << Id) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Varid - 64)) | (1L << (BoundVarid - 64)))) != 0) );
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

	public static class GeneratorContext extends ParserRuleContext {
		public List<Pattern1Context> pattern1() {
			return getRuleContexts(Pattern1Context.class);
		}
		public Pattern1Context pattern1(int i) {
			return getRuleContext(Pattern1Context.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<GuardContext> guard() {
			return getRuleContexts(GuardContext.class);
		}
		public GuardContext guard(int i) {
			return getRuleContext(GuardContext.class,i);
		}
		public GeneratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterGenerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitGenerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitGenerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratorContext generator() throws RecognitionException {
		GeneratorContext _localctx = new GeneratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_generator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			pattern1();
			setState(707);
			match(T__40);
			setState(708);
			expr();
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(714);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__22:
						{
						setState(709);
						guard();
						}
						break;
					case T__0:
					case T__1:
					case T__4:
					case T__5:
					case T__9:
					case T__19:
					case Id:
					case BooleanLiteral:
					case CharacterLiteral:
					case SymbolLiteral:
					case IntegerLiteral:
					case StringLiteral:
					case FloatingPointLiteral:
					case Varid:
					case BoundVarid:
						{
						setState(710);
						pattern1();
						setState(711);
						match(T__33);
						setState(712);
						expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitCaseClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitCaseClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(719);
				caseClause();
				}
				}
				setState(722); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__41 );
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

	public static class CaseClauseContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(T__41);
			setState(725);
			pattern();
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(726);
				guard();
				}
			}

			setState(729);
			match(T__8);
			setState(730);
			block();
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

	public static class GuardContext extends ParserRuleContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__22);
			setState(733);
			postfixExpr();
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

	public static class PatternContext extends ParserRuleContext {
		public List<Pattern1Context> pattern1() {
			return getRuleContexts(Pattern1Context.class);
		}
		public Pattern1Context pattern1(int i) {
			return getRuleContext(Pattern1Context.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			pattern1();
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(736);
				match(T__42);
				setState(737);
				pattern1();
				}
				}
				setState(742);
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

	public static class Pattern1Context extends ParserRuleContext {
		public TypePatContext typePat() {
			return getRuleContext(TypePatContext.class,0);
		}
		public TerminalNode BoundVarid() { return getToken(ScalaParser.BoundVarid, 0); }
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public Pattern2Context pattern2() {
			return getRuleContext(Pattern2Context.class,0);
		}
		public Pattern1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPattern1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPattern1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPattern1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern1Context pattern1() throws RecognitionException {
		Pattern1Context _localctx = new Pattern1Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_pattern1);
		int _la;
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				_la = _input.LA(1);
				if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (Id - 20)) | (1L << (BoundVarid - 20)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(744);
				match(T__18);
				setState(745);
				typePat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				pattern2();
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

	public static class Pattern2Context extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public Pattern3Context pattern3() {
			return getRuleContext(Pattern3Context.class,0);
		}
		public Pattern2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPattern2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPattern2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPattern2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern2Context pattern2() throws RecognitionException {
		Pattern2Context _localctx = new Pattern2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_pattern2);
		int _la;
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				match(Id);
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__43) {
					{
					setState(750);
					match(T__43);
					setState(751);
					pattern3();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				pattern3();
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

	public static class Pattern3Context extends ParserRuleContext {
		public List<SimplePatternContext> simplePattern() {
			return getRuleContexts(SimplePatternContext.class);
		}
		public SimplePatternContext simplePattern(int i) {
			return getRuleContext(SimplePatternContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public List<TerminalNode> NL() { return getTokens(ScalaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ScalaParser.NL, i);
		}
		public Pattern3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPattern3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPattern3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPattern3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern3Context pattern3() throws RecognitionException {
		Pattern3Context _localctx = new Pattern3Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_pattern3);
		int _la;
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				simplePattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				simplePattern();
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Id) {
					{
					{
					setState(759);
					match(Id);
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NL) {
						{
						setState(760);
						match(NL);
						}
					}

					setState(763);
					simplePattern();
					}
					}
					setState(768);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class SimplePatternContext extends ParserRuleContext {
		public TerminalNode Varid() { return getToken(ScalaParser.Varid, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public SimplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSimplePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSimplePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitSimplePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePatternContext simplePattern() throws RecognitionException {
		SimplePatternContext _localctx = new SimplePatternContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_simplePattern);
		int _la;
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				match(T__19);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				match(Varid);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(774);
				stableId(0);
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(775);
					match(T__9);
					setState(777);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__19) | (1L << Id) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Varid - 64)) | (1L << (BoundVarid - 64)))) != 0)) {
						{
						setState(776);
						patterns();
						}
					}

					setState(779);
					match(T__10);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(782);
				stableId(0);
				setState(783);
				match(T__9);
				setState(787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(784);
					patterns();
					setState(785);
					match(T__3);
					}
					break;
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(789);
					match(Id);
					setState(790);
					match(T__43);
					}
				}

				setState(793);
				match(T__19);
				setState(794);
				match(T__20);
				setState(795);
				match(T__10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(797);
				match(T__9);
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__19) | (1L << Id) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Varid - 64)) | (1L << (BoundVarid - 64)))) != 0)) {
					{
					setState(798);
					patterns();
					}
				}

				setState(801);
				match(T__10);
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

	public static class PatternsContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public PatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPatterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPatterns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPatterns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternsContext patterns() throws RecognitionException {
		PatternsContext _localctx = new PatternsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_patterns);
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				pattern();
				setState(807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(805);
					match(T__3);
					setState(806);
					patterns();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				match(T__19);
				setState(810);
				match(T__20);
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

	public static class TypeParamClauseContext extends ParserRuleContext {
		public List<VariantTypeParamContext> variantTypeParam() {
			return getRuleContexts(VariantTypeParamContext.class);
		}
		public VariantTypeParamContext variantTypeParam(int i) {
			return getRuleContext(VariantTypeParamContext.class,i);
		}
		public TypeParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypeParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypeParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTypeParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamClauseContext typeParamClause() throws RecognitionException {
		TypeParamClauseContext _localctx = new TypeParamClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(T__6);
			setState(814);
			variantTypeParam();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(815);
				match(T__3);
				setState(816);
				variantTypeParam();
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
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

	public static class FunTypeParamClauseContext extends ParserRuleContext {
		public List<TypeParamContext> typeParam() {
			return getRuleContexts(TypeParamContext.class);
		}
		public TypeParamContext typeParam(int i) {
			return getRuleContext(TypeParamContext.class,i);
		}
		public FunTypeParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funTypeParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterFunTypeParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitFunTypeParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitFunTypeParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunTypeParamClauseContext funTypeParamClause() throws RecognitionException {
		FunTypeParamClauseContext _localctx = new FunTypeParamClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_funTypeParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(T__6);
			setState(825);
			typeParam();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(826);
				match(T__3);
				setState(827);
				typeParam();
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(833);
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

	public static class VariantTypeParamContext extends ParserRuleContext {
		public TypeParamContext typeParam() {
			return getRuleContext(TypeParamContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public VariantTypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantTypeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterVariantTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitVariantTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitVariantTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantTypeParamContext variantTypeParam() throws RecognitionException {
		VariantTypeParamContext _localctx = new VariantTypeParamContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variantTypeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(835);
				annotation();
				}
				}
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__35) {
				{
				setState(841);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__35) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(844);
			typeParam();
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

	public static class TypeParamContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public TypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==Id) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(847);
				typeParamClause();
				}
			}

			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(850);
				match(T__44);
				setState(851);
				type_();
				}
			}

			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(854);
				match(T__45);
				setState(855);
				type_();
				}
			}

			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(858);
				match(T__46);
				setState(859);
				type_();
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(865);
				match(T__18);
				setState(866);
				type_();
				}
				}
				setState(871);
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

	public static class ParamClausesContext extends ParserRuleContext {
		public List<ParamClauseContext> paramClause() {
			return getRuleContexts(ParamClauseContext.class);
		}
		public ParamClauseContext paramClause(int i) {
			return getRuleContext(ParamClauseContext.class,i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public ParamClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterParamClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitParamClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitParamClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamClausesContext paramClauses() throws RecognitionException {
		ParamClausesContext _localctx = new ParamClausesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_paramClauses);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(872);
					paramClause();
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(878);
					match(NL);
					}
				}

				setState(881);
				match(T__9);
				setState(882);
				match(T__21);
				setState(883);
				params();
				setState(884);
				match(T__10);
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

	public static class ParamClauseContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamClauseContext paramClause() throws RecognitionException {
		ParamClauseContext _localctx = new ParamClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_paramClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(888);
				match(NL);
				}
			}

			setState(891);
			match(T__9);
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43 || _la==Id) {
				{
				setState(892);
				params();
				}
			}

			setState(895);
			match(T__10);
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
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			param();
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(898);
				match(T__3);
				setState(899);
				param();
				}
				}
				setState(904);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(905);
				annotation();
				}
				}
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(911);
			match(Id);
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(912);
				match(T__18);
				setState(913);
				paramType();
				}
			}

			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(916);
				match(T__33);
				setState(917);
				expr();
				}
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

	public static class ParamTypeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitParamType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitParamType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_paramType);
		try {
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				type_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(T__8);
				setState(922);
				type_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(923);
				type_();
				setState(924);
				match(T__20);
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

	public static class ClassParamClausesContext extends ParserRuleContext {
		public List<ClassParamClauseContext> classParamClause() {
			return getRuleContexts(ClassParamClauseContext.class);
		}
		public ClassParamClauseContext classParamClause(int i) {
			return getRuleContext(ClassParamClauseContext.class,i);
		}
		public ClassParamsContext classParams() {
			return getRuleContext(ClassParamsContext.class,0);
		}
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public ClassParamClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParamClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassParamClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassParamClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitClassParamClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassParamClausesContext classParamClauses() throws RecognitionException {
		ClassParamClausesContext _localctx = new ClassParamClausesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_classParamClauses);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(928);
					classParamClause();
					}
					} 
				}
				setState(933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(934);
					match(NL);
					}
				}

				setState(937);
				match(T__9);
				setState(938);
				match(T__21);
				setState(939);
				classParams();
				setState(940);
				match(T__10);
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

	public static class ClassParamClauseContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public ClassParamsContext classParams() {
			return getRuleContext(ClassParamsContext.class,0);
		}
		public ClassParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitClassParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassParamClauseContext classParamClause() throws RecognitionException {
		ClassParamClauseContext _localctx = new ClassParamClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_classParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(944);
				match(NL);
				}
			}

			setState(947);
			match(T__9);
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__21) | (1L << T__39) | (1L << T__43) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << Id))) != 0)) {
				{
				setState(948);
				classParams();
				}
			}

			setState(951);
			match(T__10);
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

	public static class ClassParamsContext extends ParserRuleContext {
		public List<ClassParamContext> classParam() {
			return getRuleContexts(ClassParamContext.class);
		}
		public ClassParamContext classParam(int i) {
			return getRuleContext(ClassParamContext.class,i);
		}
		public ClassParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitClassParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassParamsContext classParams() throws RecognitionException {
		ClassParamsContext _localctx = new ClassParamsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_classParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			classParam();
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(954);
				match(T__3);
				setState(955);
				classParam();
				}
				}
				setState(960);
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

	public static class ClassParamContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClassParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitClassParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassParamContext classParam() throws RecognitionException {
		ClassParamContext _localctx = new ClassParamContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_classParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(961);
				annotation();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
				{
				{
				setState(967);
				modifier();
				}
				}
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15 || _la==T__47) {
				{
				setState(973);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__47) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(976);
			match(Id);
			setState(977);
			match(T__18);
			setState(978);
			paramType();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(979);
				match(T__33);
				setState(980);
				expr();
				}
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

	public static class BindingsContext extends ParserRuleContext {
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public BindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterBindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitBindings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitBindings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingsContext bindings() throws RecognitionException {
		BindingsContext _localctx = new BindingsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(T__9);
			setState(984);
			binding();
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(985);
				match(T__3);
				setState(986);
				binding();
				}
				}
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(992);
			match(T__10);
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

	public static class BindingContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==Id) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(995);
				match(T__18);
				setState(996);
				type_();
				}
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

	public static class ModifierContext extends ParserRuleContext {
		public LocalModifierContext localModifier() {
			return getRuleContext(LocalModifierContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_modifier);
		try {
			setState(1002);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__39:
			case T__49:
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				localModifier();
				}
				break;
			case T__52:
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				accessModifier();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001);
				match(T__48);
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

	public static class LocalModifierContext extends ParserRuleContext {
		public LocalModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterLocalModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitLocalModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitLocalModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalModifierContext localModifier() throws RecognitionException {
		LocalModifierContext _localctx = new LocalModifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_localModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
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

	public static class AccessModifierContext extends ParserRuleContext {
		public AccessQualifierContext accessQualifier() {
			return getRuleContext(AccessQualifierContext.class,0);
		}
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==T__53) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1007);
				accessQualifier();
				}
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

	public static class AccessQualifierContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public AccessQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterAccessQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitAccessQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitAccessQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessQualifierContext accessQualifier() throws RecognitionException {
		AccessQualifierContext _localctx = new AccessQualifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_accessQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(T__6);
			setState(1011);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==Id) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1012);
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

	public static class AnnotationContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public List<ArgumentExprsContext> argumentExprs() {
			return getRuleContexts(ArgumentExprsContext.class);
		}
		public ArgumentExprsContext argumentExprs(int i) {
			return getRuleContext(ArgumentExprsContext.class,i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(T__43);
			setState(1015);
			simpleType(0);
			setState(1019);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1016);
					argumentExprs();
					}
					} 
				}
				setState(1021);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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

	public static class ConstrAnnotationContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public ConstrAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterConstrAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitConstrAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitConstrAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrAnnotationContext constrAnnotation() throws RecognitionException {
		ConstrAnnotationContext _localctx = new ConstrAnnotationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constrAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(T__43);
			setState(1023);
			simpleType(0);
			setState(1024);
			argumentExprs();
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

	public static class TemplateBodyContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public SelfTypeContext selfType() {
			return getRuleContext(SelfTypeContext.class,0);
		}
		public List<TemplateStatContext> templateStat() {
			return getRuleContexts(TemplateStatContext.class);
		}
		public TemplateStatContext templateStat(int i) {
			return getRuleContext(TemplateStatContext.class,i);
		}
		public TemplateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTemplateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTemplateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTemplateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBodyContext templateBody() throws RecognitionException {
		TemplateBodyContext _localctx = new TemplateBodyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_templateBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(1026);
				match(NL);
				}
			}

			setState(1029);
			match(T__12);
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1030);
				selfType();
				}
				break;
			}
			setState(1034); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1033);
				templateStat();
				}
				}
				setState(1036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__43) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << Id) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Varid - 64)) | (1L << (BoundVarid - 64)))) != 0) );
			setState(1038);
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

	public static class TemplateStatContext extends ParserRuleContext {
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ScalaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ScalaParser.NL, i);
		}
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TemplateStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTemplateStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTemplateStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTemplateStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStatContext templateStat() throws RecognitionException {
		TemplateStatContext _localctx = new TemplateStatContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_templateStat);
		int _la;
		try {
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				import_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(1041);
					annotation();
					setState(1043);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NL) {
						{
						setState(1042);
						match(NL);
						}
					}

					}
					}
					setState(1049);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
					{
					{
					setState(1050);
					modifier();
					}
					}
					setState(1055);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1056);
				def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(1057);
					annotation();
					setState(1059);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NL) {
						{
						setState(1058);
						match(NL);
						}
					}

					}
					}
					setState(1065);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
					{
					{
					setState(1066);
					modifier();
					}
					}
					setState(1071);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1072);
				dcl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1073);
				expr();
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

	public static class SelfTypeContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public SelfTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSelfType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSelfType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitSelfType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfTypeContext selfType() throws RecognitionException {
		SelfTypeContext _localctx = new SelfTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_selfType);
		int _la;
		try {
			setState(1087);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				match(Id);
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(1077);
					match(T__18);
					setState(1078);
					type_();
					}
				}

				setState(1081);
				match(T__8);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				match(T__4);
				setState(1083);
				match(T__18);
				setState(1084);
				type_();
				setState(1085);
				match(T__8);
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

	public static class Import_Context extends ParserRuleContext {
		public List<ImportExprContext> importExpr() {
			return getRuleContexts(ImportExprContext.class);
		}
		public ImportExprContext importExpr(int i) {
			return getRuleContext(ImportExprContext.class,i);
		}
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterImport_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitImport_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitImport_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(T__54);
			setState(1090);
			importExpr();
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1091);
				match(T__3);
				setState(1092);
				importExpr();
				}
				}
				setState(1097);
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

	public static class ImportExprContext extends ParserRuleContext {
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ImportSelectorsContext importSelectors() {
			return getRuleContext(ImportSelectorsContext.class,0);
		}
		public ImportExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterImportExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitImportExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitImportExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportExprContext importExpr() throws RecognitionException {
		ImportExprContext _localctx = new ImportExprContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_importExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			stableId(0);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(1099);
				match(T__2);
				setState(1103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Id:
					{
					setState(1100);
					match(Id);
					}
					break;
				case T__19:
					{
					setState(1101);
					match(T__19);
					}
					break;
				case T__12:
					{
					setState(1102);
					importSelectors();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	public static class ImportSelectorsContext extends ParserRuleContext {
		public List<ImportSelectorContext> importSelector() {
			return getRuleContexts(ImportSelectorContext.class);
		}
		public ImportSelectorContext importSelector(int i) {
			return getRuleContext(ImportSelectorContext.class,i);
		}
		public ImportSelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSelectors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterImportSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitImportSelectors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitImportSelectors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSelectorsContext importSelectors() throws RecognitionException {
		ImportSelectorsContext _localctx = new ImportSelectorsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_importSelectors);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(T__12);
			setState(1113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1108);
					importSelector();
					setState(1109);
					match(T__3);
					}
					} 
				}
				setState(1115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(1116);
				importSelector();
				}
				break;
			case T__19:
				{
				setState(1117);
				match(T__19);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1120);
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

	public static class ImportSelectorContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public ImportSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterImportSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitImportSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitImportSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSelectorContext importSelector() throws RecognitionException {
		ImportSelectorContext _localctx = new ImportSelectorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_importSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(Id);
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(1123);
				match(T__8);
				setState(1124);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==Id) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class DclContext extends ParserRuleContext {
		public ValDclContext valDcl() {
			return getRuleContext(ValDclContext.class,0);
		}
		public VarDclContext varDcl() {
			return getRuleContext(VarDclContext.class,0);
		}
		public FunDclContext funDcl() {
			return getRuleContext(FunDclContext.class,0);
		}
		public TypeDclContext typeDcl() {
			return getRuleContext(TypeDclContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ScalaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ScalaParser.NL, i);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dcl);
		int _la;
		try {
			setState(1141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				match(T__15);
				setState(1128);
				valDcl();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129);
				match(T__47);
				setState(1130);
				varDcl();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(1131);
				match(T__55);
				setState(1132);
				funDcl();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(1133);
				match(T__14);
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1134);
					match(NL);
					}
					}
					setState(1139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1140);
				typeDcl();
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

	public static class ValDclContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ValDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterValDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitValDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitValDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValDclContext valDcl() throws RecognitionException {
		ValDclContext _localctx = new ValDclContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_valDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			ids();
			setState(1144);
			match(T__18);
			setState(1145);
			type_();
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

	public static class VarDclContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VarDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterVarDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitVarDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitVarDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDclContext varDcl() throws RecognitionException {
		VarDclContext _localctx = new VarDclContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_varDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			ids();
			setState(1148);
			match(T__18);
			setState(1149);
			type_();
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

	public static class FunDclContext extends ParserRuleContext {
		public FunSigContext funSig() {
			return getRuleContext(FunSigContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FunDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterFunDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitFunDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitFunDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDclContext funDcl() throws RecognitionException {
		FunDclContext _localctx = new FunDclContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_funDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			funSig();
			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(1152);
				match(T__18);
				setState(1153);
				type_();
				}
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

	public static class FunSigContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ParamClausesContext paramClauses() {
			return getRuleContext(ParamClausesContext.class,0);
		}
		public FunTypeParamClauseContext funTypeParamClause() {
			return getRuleContext(FunTypeParamClauseContext.class,0);
		}
		public FunSigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funSig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterFunSig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitFunSig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitFunSig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunSigContext funSig() throws RecognitionException {
		FunSigContext _localctx = new FunSigContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_funSig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(Id);
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1157);
				funTypeParamClause();
				}
			}

			setState(1160);
			paramClauses();
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

	public static class TypeDclContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public TypeDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypeDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypeDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTypeDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDclContext typeDcl() throws RecognitionException {
		TypeDclContext _localctx = new TypeDclContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_typeDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(Id);
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1163);
				typeParamClause();
				}
			}

			setState(1168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(1166);
				match(T__44);
				setState(1167);
				type_();
				}
			}

			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(1170);
				match(T__45);
				setState(1171);
				type_();
				}
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

	public static class PatVarDefContext extends ParserRuleContext {
		public PatDefContext patDef() {
			return getRuleContext(PatDefContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public PatVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patVarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPatVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPatVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPatVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatVarDefContext patVarDef() throws RecognitionException {
		PatVarDefContext _localctx = new PatVarDefContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_patVarDef);
		try {
			setState(1178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				match(T__15);
				setState(1175);
				patDef();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(1176);
				match(T__47);
				setState(1177);
				varDef();
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

	public static class DefContext extends ParserRuleContext {
		public PatVarDefContext patVarDef() {
			return getRuleContext(PatVarDefContext.class,0);
		}
		public FunDefContext funDef() {
			return getRuleContext(FunDefContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ScalaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ScalaParser.NL, i);
		}
		public TmplDefContext tmplDef() {
			return getRuleContext(TmplDefContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_def);
		int _la;
		try {
			setState(1192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				patVarDef();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				match(T__55);
				setState(1182);
				funDef();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(1183);
				match(T__14);
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1184);
					match(NL);
					}
					}
					setState(1189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1190);
				typeDef();
				}
				break;
			case T__41:
			case T__56:
			case T__57:
			case T__58:
				enterOuterAlt(_localctx, 4);
				{
				setState(1191);
				tmplDef();
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

	public static class PatDefContext extends ParserRuleContext {
		public List<Pattern2Context> pattern2() {
			return getRuleContexts(Pattern2Context.class);
		}
		public Pattern2Context pattern2(int i) {
			return getRuleContext(Pattern2Context.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public PatDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPatDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPatDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPatDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatDefContext patDef() throws RecognitionException {
		PatDefContext _localctx = new PatDefContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_patDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			pattern2();
			setState(1199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1195);
				match(T__3);
				setState(1196);
				pattern2();
				}
				}
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(1202);
				match(T__18);
				setState(1203);
				type_();
				}
			}

			setState(1206);
			match(T__33);
			setState(1207);
			expr();
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

	public static class VarDefContext extends ParserRuleContext {
		public PatDefContext patDef() {
			return getRuleContext(PatDefContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_varDef);
		try {
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209);
				patDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				ids();
				setState(1211);
				match(T__18);
				setState(1212);
				type_();
				setState(1213);
				match(T__33);
				setState(1214);
				match(T__19);
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

	public static class FunDefContext extends ParserRuleContext {
		public FunSigContext funSig() {
			return getRuleContext(FunSigContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public ParamClauseContext paramClause() {
			return getRuleContext(ParamClauseContext.class,0);
		}
		public ParamClausesContext paramClauses() {
			return getRuleContext(ParamClausesContext.class,0);
		}
		public ConstrExprContext constrExpr() {
			return getRuleContext(ConstrExprContext.class,0);
		}
		public ConstrBlockContext constrBlock() {
			return getRuleContext(ConstrBlockContext.class,0);
		}
		public FunDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterFunDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitFunDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitFunDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefContext funDef() throws RecognitionException {
		FunDefContext _localctx = new FunDefContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_funDef);
		int _la;
		try {
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				funSig();
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(1219);
					match(T__18);
					setState(1220);
					type_();
					}
				}

				setState(1223);
				match(T__33);
				setState(1224);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				funSig();
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(1227);
					match(NL);
					}
				}

				setState(1230);
				match(T__12);
				setState(1231);
				block();
				setState(1232);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1234);
				match(T__4);
				setState(1235);
				paramClause();
				setState(1236);
				paramClauses();
				setState(1243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__33:
					{
					setState(1237);
					match(T__33);
					setState(1238);
					constrExpr();
					}
					break;
				case T__12:
				case NL:
					{
					setState(1240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NL) {
						{
						setState(1239);
						match(NL);
						}
					}

					setState(1242);
					constrBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class TypeDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_typeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(Id);
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1248);
				typeParamClause();
				}
			}

			setState(1251);
			match(T__33);
			setState(1252);
			type_();
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

	public static class TmplDefContext extends ParserRuleContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public ObjectDefContext objectDef() {
			return getRuleContext(ObjectDefContext.class,0);
		}
		public TraitDefContext traitDef() {
			return getRuleContext(TraitDefContext.class,0);
		}
		public TmplDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTmplDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTmplDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTmplDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplDefContext tmplDef() throws RecognitionException {
		TmplDefContext _localctx = new TmplDefContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_tmplDef);
		int _la;
		try {
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(1254);
					match(T__41);
					}
				}

				setState(1257);
				match(T__56);
				setState(1258);
				classDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(1259);
					match(T__41);
					}
				}

				setState(1262);
				match(T__57);
				setState(1263);
				objectDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1264);
				match(T__58);
				setState(1265);
				traitDef();
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

	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ClassParamClausesContext classParamClauses() {
			return getRuleContext(ClassParamClausesContext.class,0);
		}
		public ClassTemplateOptContext classTemplateOpt() {
			return getRuleContext(ClassTemplateOptContext.class,0);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public List<ConstrAnnotationContext> constrAnnotation() {
			return getRuleContexts(ConstrAnnotationContext.class);
		}
		public ConstrAnnotationContext constrAnnotation(int i) {
			return getRuleContext(ConstrAnnotationContext.class,i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_classDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(Id);
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1269);
				typeParamClause();
				}
			}

			setState(1275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1272);
					constrAnnotation();
					}
					} 
				}
				setState(1277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1278);
				accessModifier();
				}
				break;
			}
			setState(1281);
			classParamClauses();
			setState(1282);
			classTemplateOpt();
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

	public static class TraitDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TraitTemplateOptContext traitTemplateOpt() {
			return getRuleContext(TraitTemplateOptContext.class,0);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public TraitDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTraitDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTraitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTraitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitDefContext traitDef() throws RecognitionException {
		TraitDefContext _localctx = new TraitDefContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_traitDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(Id);
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1285);
				typeParamClause();
				}
			}

			setState(1288);
			traitTemplateOpt();
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

	public static class ObjectDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ClassTemplateOptContext classTemplateOpt() {
			return getRuleContext(ClassTemplateOptContext.class,0);
		}
		public ObjectDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterObjectDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitObjectDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitObjectDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDefContext objectDef() throws RecognitionException {
		ObjectDefContext _localctx = new ObjectDefContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_objectDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(Id);
			setState(1291);
			classTemplateOpt();
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

	public static class ClassTemplateOptContext extends ParserRuleContext {
		public ClassTemplateContext classTemplate() {
			return getRuleContext(ClassTemplateContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public ClassTemplateOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTemplateOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassTemplateOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassTemplateOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitClassTemplateOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTemplateOptContext classTemplateOpt() throws RecognitionException {
		ClassTemplateOptContext _localctx = new ClassTemplateOptContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_classTemplateOpt);
		int _la;
		try {
			setState(1301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				match(T__59);
				setState(1294);
				classTemplate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__59) {
						{
						setState(1295);
						match(T__59);
						}
					}

					setState(1298);
					templateBody();
					}
					break;
				}
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

	public static class TraitTemplateOptContext extends ParserRuleContext {
		public TraitTemplateContext traitTemplate() {
			return getRuleContext(TraitTemplateContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TraitTemplateOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitTemplateOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTraitTemplateOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTraitTemplateOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTraitTemplateOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitTemplateOptContext traitTemplateOpt() throws RecognitionException {
		TraitTemplateOptContext _localctx = new TraitTemplateOptContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_traitTemplateOpt);
		int _la;
		try {
			setState(1311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1303);
				match(T__59);
				setState(1304);
				traitTemplate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__59) {
						{
						setState(1305);
						match(T__59);
						}
					}

					setState(1308);
					templateBody();
					}
					break;
				}
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

	public static class ClassTemplateContext extends ParserRuleContext {
		public ClassParentsContext classParents() {
			return getRuleContext(ClassParentsContext.class,0);
		}
		public EarlyDefsContext earlyDefs() {
			return getRuleContext(EarlyDefsContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public ClassTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitClassTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTemplateContext classTemplate() throws RecognitionException {
		ClassTemplateContext _localctx = new ClassTemplateContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_classTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1313);
				earlyDefs();
				}
			}

			setState(1316);
			classParents();
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1317);
				templateBody();
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

	public static class TraitTemplateContext extends ParserRuleContext {
		public TraitParentsContext traitParents() {
			return getRuleContext(TraitParentsContext.class,0);
		}
		public EarlyDefsContext earlyDefs() {
			return getRuleContext(EarlyDefsContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TraitTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTraitTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTraitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTraitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitTemplateContext traitTemplate() throws RecognitionException {
		TraitTemplateContext _localctx = new TraitTemplateContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_traitTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1320);
				earlyDefs();
				}
			}

			setState(1323);
			traitParents();
			setState(1325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1324);
				templateBody();
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

	public static class ClassParentsContext extends ParserRuleContext {
		public ConstrContext constr() {
			return getRuleContext(ConstrContext.class,0);
		}
		public List<AnnotTypeContext> annotType() {
			return getRuleContexts(AnnotTypeContext.class);
		}
		public AnnotTypeContext annotType(int i) {
			return getRuleContext(AnnotTypeContext.class,i);
		}
		public ClassParentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassParents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassParents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitClassParents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassParentsContext classParents() throws RecognitionException {
		ClassParentsContext _localctx = new ClassParentsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_classParents);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			constr();
			setState(1332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1328);
					match(T__16);
					setState(1329);
					annotType();
					}
					} 
				}
				setState(1334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
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

	public static class TraitParentsContext extends ParserRuleContext {
		public List<AnnotTypeContext> annotType() {
			return getRuleContexts(AnnotTypeContext.class);
		}
		public AnnotTypeContext annotType(int i) {
			return getRuleContext(AnnotTypeContext.class,i);
		}
		public TraitParentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitParents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTraitParents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTraitParents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTraitParents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitParentsContext traitParents() throws RecognitionException {
		TraitParentsContext _localctx = new TraitParentsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_traitParents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			annotType();
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(1336);
				match(T__16);
				setState(1337);
				annotType();
				}
				}
				setState(1342);
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

	public static class ConstrContext extends ParserRuleContext {
		public AnnotTypeContext annotType() {
			return getRuleContext(AnnotTypeContext.class,0);
		}
		public List<ArgumentExprsContext> argumentExprs() {
			return getRuleContexts(ArgumentExprsContext.class);
		}
		public ArgumentExprsContext argumentExprs(int i) {
			return getRuleContext(ArgumentExprsContext.class,i);
		}
		public ConstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterConstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitConstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitConstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrContext constr() throws RecognitionException {
		ConstrContext _localctx = new ConstrContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_constr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			annotType();
			setState(1347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1344);
					argumentExprs();
					}
					} 
				}
				setState(1349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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

	public static class EarlyDefsContext extends ParserRuleContext {
		public List<EarlyDefContext> earlyDef() {
			return getRuleContexts(EarlyDefContext.class);
		}
		public EarlyDefContext earlyDef(int i) {
			return getRuleContext(EarlyDefContext.class,i);
		}
		public EarlyDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_earlyDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterEarlyDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitEarlyDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitEarlyDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EarlyDefsContext earlyDefs() throws RecognitionException {
		EarlyDefsContext _localctx = new EarlyDefsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_earlyDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(T__12);
			setState(1352); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1351);
				earlyDef();
				}
				}
				setState(1354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__21) | (1L << T__39) | (1L << T__43) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0) );
			setState(1356);
			match(T__13);
			setState(1357);
			match(T__16);
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

	public static class EarlyDefContext extends ParserRuleContext {
		public PatVarDefContext patVarDef() {
			return getRuleContext(PatVarDefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ScalaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ScalaParser.NL, i);
		}
		public EarlyDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_earlyDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterEarlyDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitEarlyDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitEarlyDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EarlyDefContext earlyDef() throws RecognitionException {
		EarlyDefContext _localctx = new EarlyDefContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_earlyDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(1359);
				annotation();
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(1360);
					match(NL);
					}
				}

				}
				}
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
				{
				{
				setState(1368);
				modifier();
				}
				}
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1374);
			patVarDef();
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

	public static class ConstrExprContext extends ParserRuleContext {
		public SelfInvocationContext selfInvocation() {
			return getRuleContext(SelfInvocationContext.class,0);
		}
		public ConstrBlockContext constrBlock() {
			return getRuleContext(ConstrBlockContext.class,0);
		}
		public ConstrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterConstrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitConstrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitConstrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrExprContext constrExpr() throws RecognitionException {
		ConstrExprContext _localctx = new ConstrExprContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_constrExpr);
		try {
			setState(1378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				selfInvocation();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				constrBlock();
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

	public static class ConstrBlockContext extends ParserRuleContext {
		public SelfInvocationContext selfInvocation() {
			return getRuleContext(SelfInvocationContext.class,0);
		}
		public List<BlockStatContext> blockStat() {
			return getRuleContexts(BlockStatContext.class);
		}
		public BlockStatContext blockStat(int i) {
			return getRuleContext(BlockStatContext.class,i);
		}
		public ConstrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterConstrBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitConstrBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitConstrBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrBlockContext constrBlock() throws RecognitionException {
		ConstrBlockContext _localctx = new ConstrBlockContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_constrBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(T__12);
			setState(1381);
			selfInvocation();
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__43) | (1L << T__47) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << Id) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Varid - 64)) | (1L << (BoundVarid - 64)))) != 0)) {
				{
				{
				setState(1382);
				blockStat();
				}
				}
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1388);
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

	public static class SelfInvocationContext extends ParserRuleContext {
		public List<ArgumentExprsContext> argumentExprs() {
			return getRuleContexts(ArgumentExprsContext.class);
		}
		public ArgumentExprsContext argumentExprs(int i) {
			return getRuleContext(ArgumentExprsContext.class,i);
		}
		public SelfInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSelfInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSelfInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitSelfInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfInvocationContext selfInvocation() throws RecognitionException {
		SelfInvocationContext _localctx = new SelfInvocationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_selfInvocation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(T__4);
			setState(1392); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1391);
					argumentExprs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1394); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TopStatSeqContext extends ParserRuleContext {
		public List<TopStatContext> topStat() {
			return getRuleContexts(TopStatContext.class);
		}
		public TopStatContext topStat(int i) {
			return getRuleContext(TopStatContext.class,i);
		}
		public TopStatSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTopStatSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTopStatSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTopStatSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopStatSeqContext topStatSeq() throws RecognitionException {
		TopStatSeqContext _localctx = new TopStatSeqContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_topStatSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1396);
				topStat();
				}
				}
				setState(1399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__41) | (1L << T__43) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__60))) != 0) );
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

	public static class TopStatContext extends ParserRuleContext {
		public TmplDefContext tmplDef() {
			return getRuleContext(TmplDefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ScalaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ScalaParser.NL, i);
		}
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public PackagingContext packaging() {
			return getRuleContext(PackagingContext.class,0);
		}
		public PackageObjectContext packageObject() {
			return getRuleContext(PackageObjectContext.class,0);
		}
		public TopStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTopStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTopStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTopStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopStatContext topStat() throws RecognitionException {
		TopStatContext _localctx = new TopStatContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_topStat);
		int _la;
		try {
			setState(1420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(1401);
					annotation();
					setState(1403);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NL) {
						{
						setState(1402);
						match(NL);
						}
					}

					}
					}
					setState(1409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
					{
					{
					setState(1410);
					modifier();
					}
					}
					setState(1415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1416);
				tmplDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1417);
				import_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1418);
				packaging();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1419);
				packageObject();
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

	public static class PackagingContext extends ParserRuleContext {
		public QualIdContext qualId() {
			return getRuleContext(QualIdContext.class,0);
		}
		public TopStatSeqContext topStatSeq() {
			return getRuleContext(TopStatSeqContext.class,0);
		}
		public TerminalNode NL() { return getToken(ScalaParser.NL, 0); }
		public PackagingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packaging; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPackaging(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPackaging(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPackaging(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackagingContext packaging() throws RecognitionException {
		PackagingContext _localctx = new PackagingContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_packaging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			match(T__60);
			setState(1423);
			qualId();
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(1424);
				match(NL);
				}
			}

			setState(1427);
			match(T__12);
			setState(1428);
			topStatSeq();
			setState(1429);
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

	public static class PackageObjectContext extends ParserRuleContext {
		public ObjectDefContext objectDef() {
			return getRuleContext(ObjectDefContext.class,0);
		}
		public PackageObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPackageObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPackageObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitPackageObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageObjectContext packageObject() throws RecognitionException {
		PackageObjectContext _localctx = new PackageObjectContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_packageObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			match(T__60);
			setState(1432);
			match(T__57);
			setState(1433);
			objectDef();
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TopStatSeqContext topStatSeq() {
			return getRuleContext(TopStatSeqContext.class,0);
		}
		public List<QualIdContext> qualId() {
			return getRuleContexts(QualIdContext.class);
		}
		public QualIdContext qualId(int i) {
			return getRuleContext(QualIdContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_compilationUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1435);
					match(T__60);
					setState(1436);
					qualId();
					}
					} 
				}
				setState(1441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			setState(1442);
			topStatSeq();
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
		case 3:
			return stableId_sempred((StableIdContext)_localctx, predIndex);
		case 12:
			return simpleType_sempred((SimpleTypeContext)_localctx, predIndex);
		case 23:
			return infixExpr_sempred((InfixExprContext)_localctx, predIndex);
		case 26:
			return simpleExpr1_sempred((SimpleExpr1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean stableId_sempred(StableIdContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleType_sempred(SimpleTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean infixExpr_sempred(InfixExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean simpleExpr1_sempred(SimpleExpr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u05a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\3\2\5\2\u00d8\n\2\3\2\3\2\5\2\u00dc\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"\u00e4\n\2\3\3\3\3\3\3\7\3\u00e9\n\3\f\3\16\3\u00ec\13\3\3\4\3\4\3\4\7"+
		"\4\u00f1\n\4\f\4\16\4\u00f4\13\4\3\5\3\5\3\5\3\5\5\5\u00fa\n\5\3\5\3\5"+
		"\3\5\5\5\u00ff\n\5\3\5\3\5\5\5\u0103\n\5\5\5\u0105\n\5\3\5\3\5\3\5\7\5"+
		"\u010a\n\5\f\5\16\5\u010d\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0119\n\7\5\7\u011b\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u0122\n\b\f\b\16"+
		"\b\u0125\13\b\5\b\u0127\n\b\3\b\5\b\u012a\n\b\3\t\3\t\3\t\6\t\u012f\n"+
		"\t\r\t\16\t\u0130\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0139\n\n\3\13\3\13\3\13"+
		"\7\13\u013e\n\13\f\13\16\13\u0141\13\13\3\f\3\f\3\f\7\f\u0146\n\f\f\f"+
		"\16\f\u0149\13\f\3\f\5\f\u014c\n\f\3\f\5\f\u014f\n\f\3\r\3\r\7\r\u0153"+
		"\n\r\f\r\16\r\u0156\13\r\3\16\3\16\3\16\3\16\5\16\u015c\n\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0162\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u0169\n\16\f"+
		"\16\16\16\u016c\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u0175\n"+
		"\20\f\20\16\20\u0178\13\20\3\21\5\21\u017b\n\21\3\21\3\21\6\21\u017f\n"+
		"\21\r\21\16\21\u0180\3\21\3\21\3\22\3\22\3\22\5\22\u0188\n\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\6\24\u0190\n\24\r\24\16\24\u0191\3\24\3\24\3\24\5"+
		"\24\u0197\n\24\3\25\3\25\5\25\u019b\n\25\3\25\3\25\5\25\u019f\n\25\3\25"+
		"\3\25\3\25\5\25\u01a4\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u01ab\n\26\f"+
		"\26\16\26\u01ae\13\26\3\26\3\26\3\26\5\26\u01b3\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\7\26\u01ba\n\26\f\26\16\26\u01bd\13\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u01c5\n\26\3\26\3\26\5\26\u01c9\n\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01db"+
		"\n\26\3\26\5\26\u01de\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01e6\n"+
		"\26\3\26\3\26\3\26\5\26\u01eb\n\26\5\26\u01ed\n\26\3\26\3\26\5\26\u01f1"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01fd\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0206\n\26\3\27\3\27\3\30\3\30"+
		"\5\30\u020c\n\30\3\30\3\30\3\30\7\30\u0211\n\30\f\30\16\30\u0214\13\30"+
		"\3\30\5\30\u0217\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u021f\n\31\3"+
		"\31\7\31\u0222\n\31\f\31\16\31\u0225\13\31\3\32\5\32\u0228\n\32\3\32\3"+
		"\32\3\32\5\32\u022d\n\32\5\32\u022f\n\32\3\33\3\33\3\33\5\33\u0234\n\33"+
		"\3\33\5\33\u0237\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u023f\n\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0249\n\34\3\34\3\34\5\34"+
		"\u024d\n\34\3\34\3\34\3\34\3\34\5\34\u0253\n\34\3\34\3\34\3\34\7\34\u0258"+
		"\n\34\f\34\16\34\u025b\13\34\3\35\3\35\3\35\7\35\u0260\n\35\f\35\16\35"+
		"\u0263\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u026e\n"+
		"\36\3\36\5\36\u0271\n\36\3\37\5\37\u0274\n\37\3\37\3\37\3\37\5\37\u0279"+
		"\n\37\3\37\3\37\5\37\u027d\n\37\5\37\u027f\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \5 \u0289\n \3!\6!\u028c\n!\r!\16!\u028d\3!\5!\u0291\n!\3\"\3\"\7\"\u0295"+
		"\n\"\f\"\16\"\u0298\13\"\3\"\5\"\u029b\n\"\3\"\3\"\7\"\u029f\n\"\f\"\16"+
		"\"\u02a2\13\"\3\"\7\"\u02a5\n\"\f\"\16\"\u02a8\13\"\3\"\3\"\5\"\u02ac"+
		"\n\"\3#\3#\3#\5#\u02b1\n#\3#\3#\5#\u02b5\n#\3#\3#\5#\u02b9\n#\3#\3#\3"+
		"#\5#\u02be\n#\3$\6$\u02c1\n$\r$\16$\u02c2\3%\3%\3%\3%\3%\3%\3%\3%\7%\u02cd"+
		"\n%\f%\16%\u02d0\13%\3&\6&\u02d3\n&\r&\16&\u02d4\3\'\3\'\3\'\5\'\u02da"+
		"\n\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\7)\u02e5\n)\f)\16)\u02e8\13)\3*\3*"+
		"\3*\3*\5*\u02ee\n*\3+\3+\3+\5+\u02f3\n+\3+\5+\u02f6\n+\3,\3,\3,\3,\5,"+
		"\u02fc\n,\3,\7,\u02ff\n,\f,\16,\u0302\13,\5,\u0304\n,\3-\3-\3-\3-\3-\3"+
		"-\5-\u030c\n-\3-\5-\u030f\n-\3-\3-\3-\3-\3-\5-\u0316\n-\3-\3-\5-\u031a"+
		"\n-\3-\3-\3-\3-\3-\3-\5-\u0322\n-\3-\5-\u0325\n-\3.\3.\3.\5.\u032a\n."+
		"\3.\3.\5.\u032e\n.\3/\3/\3/\3/\7/\u0334\n/\f/\16/\u0337\13/\3/\3/\3\60"+
		"\3\60\3\60\3\60\7\60\u033f\n\60\f\60\16\60\u0342\13\60\3\60\3\60\3\61"+
		"\7\61\u0347\n\61\f\61\16\61\u034a\13\61\3\61\5\61\u034d\n\61\3\61\3\61"+
		"\3\62\3\62\5\62\u0353\n\62\3\62\3\62\5\62\u0357\n\62\3\62\3\62\5\62\u035b"+
		"\n\62\3\62\3\62\7\62\u035f\n\62\f\62\16\62\u0362\13\62\3\62\3\62\7\62"+
		"\u0366\n\62\f\62\16\62\u0369\13\62\3\63\7\63\u036c\n\63\f\63\16\63\u036f"+
		"\13\63\3\63\5\63\u0372\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u0379\n\63\3"+
		"\64\5\64\u037c\n\64\3\64\3\64\5\64\u0380\n\64\3\64\3\64\3\65\3\65\3\65"+
		"\7\65\u0387\n\65\f\65\16\65\u038a\13\65\3\66\7\66\u038d\n\66\f\66\16\66"+
		"\u0390\13\66\3\66\3\66\3\66\5\66\u0395\n\66\3\66\3\66\5\66\u0399\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u03a1\n\67\38\78\u03a4\n8\f8\168\u03a7"+
		"\138\38\58\u03aa\n8\38\38\38\38\38\58\u03b1\n8\39\59\u03b4\n9\39\39\5"+
		"9\u03b8\n9\39\39\3:\3:\3:\7:\u03bf\n:\f:\16:\u03c2\13:\3;\7;\u03c5\n;"+
		"\f;\16;\u03c8\13;\3;\7;\u03cb\n;\f;\16;\u03ce\13;\3;\5;\u03d1\n;\3;\3"+
		";\3;\3;\3;\5;\u03d8\n;\3<\3<\3<\3<\7<\u03de\n<\f<\16<\u03e1\13<\3<\3<"+
		"\3=\3=\3=\5=\u03e8\n=\3>\3>\3>\5>\u03ed\n>\3?\3?\3@\3@\5@\u03f3\n@\3A"+
		"\3A\3A\3A\3B\3B\3B\7B\u03fc\nB\fB\16B\u03ff\13B\3C\3C\3C\3C\3D\5D\u0406"+
		"\nD\3D\3D\5D\u040a\nD\3D\6D\u040d\nD\rD\16D\u040e\3D\3D\3E\3E\3E\5E\u0416"+
		"\nE\7E\u0418\nE\fE\16E\u041b\13E\3E\7E\u041e\nE\fE\16E\u0421\13E\3E\3"+
		"E\3E\5E\u0426\nE\7E\u0428\nE\fE\16E\u042b\13E\3E\7E\u042e\nE\fE\16E\u0431"+
		"\13E\3E\3E\5E\u0435\nE\3F\3F\3F\5F\u043a\nF\3F\3F\3F\3F\3F\3F\5F\u0442"+
		"\nF\3G\3G\3G\3G\7G\u0448\nG\fG\16G\u044b\13G\3H\3H\3H\3H\3H\5H\u0452\n"+
		"H\5H\u0454\nH\3I\3I\3I\3I\7I\u045a\nI\fI\16I\u045d\13I\3I\3I\5I\u0461"+
		"\nI\3I\3I\3J\3J\3J\5J\u0468\nJ\3K\3K\3K\3K\3K\3K\3K\3K\7K\u0472\nK\fK"+
		"\16K\u0475\13K\3K\5K\u0478\nK\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\5N\u0485"+
		"\nN\3O\3O\5O\u0489\nO\3O\3O\3P\3P\5P\u048f\nP\3P\3P\5P\u0493\nP\3P\3P"+
		"\5P\u0497\nP\3Q\3Q\3Q\3Q\5Q\u049d\nQ\3R\3R\3R\3R\3R\7R\u04a4\nR\fR\16"+
		"R\u04a7\13R\3R\3R\5R\u04ab\nR\3S\3S\3S\7S\u04b0\nS\fS\16S\u04b3\13S\3"+
		"S\3S\5S\u04b7\nS\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\5T\u04c3\nT\3U\3U\3U\5"+
		"U\u04c8\nU\3U\3U\3U\3U\3U\5U\u04cf\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5"+
		"U\u04db\nU\3U\5U\u04de\nU\5U\u04e0\nU\3V\3V\5V\u04e4\nV\3V\3V\3V\3W\5"+
		"W\u04ea\nW\3W\3W\3W\5W\u04ef\nW\3W\3W\3W\3W\5W\u04f5\nW\3X\3X\5X\u04f9"+
		"\nX\3X\7X\u04fc\nX\fX\16X\u04ff\13X\3X\5X\u0502\nX\3X\3X\3X\3Y\3Y\5Y\u0509"+
		"\nY\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\5[\u0513\n[\3[\5[\u0516\n[\5[\u0518\n[\3\\"+
		"\3\\\3\\\5\\\u051d\n\\\3\\\5\\\u0520\n\\\5\\\u0522\n\\\3]\5]\u0525\n]"+
		"\3]\3]\5]\u0529\n]\3^\5^\u052c\n^\3^\3^\5^\u0530\n^\3_\3_\3_\7_\u0535"+
		"\n_\f_\16_\u0538\13_\3`\3`\3`\7`\u053d\n`\f`\16`\u0540\13`\3a\3a\7a\u0544"+
		"\na\fa\16a\u0547\13a\3b\3b\6b\u054b\nb\rb\16b\u054c\3b\3b\3b\3c\3c\5c"+
		"\u0554\nc\7c\u0556\nc\fc\16c\u0559\13c\3c\7c\u055c\nc\fc\16c\u055f\13"+
		"c\3c\3c\3d\3d\5d\u0565\nd\3e\3e\3e\7e\u056a\ne\fe\16e\u056d\13e\3e\3e"+
		"\3f\3f\6f\u0573\nf\rf\16f\u0574\3g\6g\u0578\ng\rg\16g\u0579\3h\3h\5h\u057e"+
		"\nh\7h\u0580\nh\fh\16h\u0583\13h\3h\7h\u0586\nh\fh\16h\u0589\13h\3h\3"+
		"h\3h\3h\5h\u058f\nh\3i\3i\3i\5i\u0594\ni\3i\3i\3i\3i\3j\3j\3j\3j\3k\3"+
		"k\7k\u05a0\nk\fk\16k\u05a3\13k\3k\3k\3k\2\6\b\32\60\66l\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\2\f\4\2\3\3&(\3"+
		"\2\25\27\4\2\30\30**\5\2\26\26@@HH\4\2\3\3&&\4\2\26\26@@\4\2\22\22\62"+
		"\62\5\2\30\30**\64\66\3\2\678\4\2\7\7@@\2\u0636\2\u00e3\3\2\2\2\4\u00e5"+
		"\3\2\2\2\6\u00ed\3\2\2\2\b\u0104\3\2\2\2\n\u010e\3\2\2\2\f\u011a\3\2\2"+
		"\2\16\u0129\3\2\2\2\20\u012b\3\2\2\2\22\u0138\3\2\2\2\24\u013a\3\2\2\2"+
		"\26\u014e\3\2\2\2\30\u0150\3\2\2\2\32\u0161\3\2\2\2\34\u016d\3\2\2\2\36"+
		"\u0171\3\2\2\2 \u017a\3\2\2\2\"\u0187\3\2\2\2$\u0189\3\2\2\2&\u0196\3"+
		"\2\2\2(\u01a3\3\2\2\2*\u0205\3\2\2\2,\u0207\3\2\2\2.\u0209\3\2\2\2\60"+
		"\u0218\3\2\2\2\62\u0227\3\2\2\2\64\u0236\3\2\2\2\66\u0248\3\2\2\28\u025c"+
		"\3\2\2\2:\u0270\3\2\2\2<\u027e\3\2\2\2>\u0288\3\2\2\2@\u028b\3\2\2\2B"+
		"\u02ab\3\2\2\2D\u02bd\3\2\2\2F\u02c0\3\2\2\2H\u02c4\3\2\2\2J\u02d2\3\2"+
		"\2\2L\u02d6\3\2\2\2N\u02de\3\2\2\2P\u02e1\3\2\2\2R\u02ed\3\2\2\2T\u02f5"+
		"\3\2\2\2V\u0303\3\2\2\2X\u0324\3\2\2\2Z\u032d\3\2\2\2\\\u032f\3\2\2\2"+
		"^\u033a\3\2\2\2`\u0348\3\2\2\2b\u0350\3\2\2\2d\u036d\3\2\2\2f\u037b\3"+
		"\2\2\2h\u0383\3\2\2\2j\u038e\3\2\2\2l\u03a0\3\2\2\2n\u03a5\3\2\2\2p\u03b3"+
		"\3\2\2\2r\u03bb\3\2\2\2t\u03c6\3\2\2\2v\u03d9\3\2\2\2x\u03e4\3\2\2\2z"+
		"\u03ec\3\2\2\2|\u03ee\3\2\2\2~\u03f0\3\2\2\2\u0080\u03f4\3\2\2\2\u0082"+
		"\u03f8\3\2\2\2\u0084\u0400\3\2\2\2\u0086\u0405\3\2\2\2\u0088\u0434\3\2"+
		"\2\2\u008a\u0441\3\2\2\2\u008c\u0443\3\2\2\2\u008e\u044c\3\2\2\2\u0090"+
		"\u0455\3\2\2\2\u0092\u0464\3\2\2\2\u0094\u0477\3\2\2\2\u0096\u0479\3\2"+
		"\2\2\u0098\u047d\3\2\2\2\u009a\u0481\3\2\2\2\u009c\u0486\3\2\2\2\u009e"+
		"\u048c\3\2\2\2\u00a0\u049c\3\2\2\2\u00a2\u04aa\3\2\2\2\u00a4\u04ac\3\2"+
		"\2\2\u00a6\u04c2\3\2\2\2\u00a8\u04df\3\2\2\2\u00aa\u04e1\3\2\2\2\u00ac"+
		"\u04f4\3\2\2\2\u00ae\u04f6\3\2\2\2\u00b0\u0506\3\2\2\2\u00b2\u050c\3\2"+
		"\2\2\u00b4\u0517\3\2\2\2\u00b6\u0521\3\2\2\2\u00b8\u0524\3\2\2\2\u00ba"+
		"\u052b\3\2\2\2\u00bc\u0531\3\2\2\2\u00be\u0539\3\2\2\2\u00c0\u0541\3\2"+
		"\2\2\u00c2\u0548\3\2\2\2\u00c4\u0557\3\2\2\2\u00c6\u0564\3\2\2\2\u00c8"+
		"\u0566\3\2\2\2\u00ca\u0570\3\2\2\2\u00cc\u0577\3\2\2\2\u00ce\u058e\3\2"+
		"\2\2\u00d0\u0590\3\2\2\2\u00d2\u0599\3\2\2\2\u00d4\u05a1\3\2\2\2\u00d6"+
		"\u00d8\7\3\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00e4\7D\2\2\u00da\u00dc\7\3\2\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e4\7F\2\2\u00de\u00e4\7A\2"+
		"\2\u00df\u00e4\7B\2\2\u00e0\u00e4\7E\2\2\u00e1\u00e4\7C\2\2\u00e2\u00e4"+
		"\7\4\2\2\u00e3\u00d7\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3"+
		"\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e4\3\3\2\2\2\u00e5\u00ea\7@\2\2\u00e6\u00e7\7\5\2\2\u00e7\u00e9"+
		"\7@\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\5\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f2\7@\2\2"+
		"\u00ee\u00ef\7\6\2\2\u00ef\u00f1\7@\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\7\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f6\b\5\1\2\u00f6\u0105\7@\2\2\u00f7\u00f8\7@\2"+
		"\2\u00f8\u00fa\7\5\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0102"+
		"\3\2\2\2\u00fb\u0103\7\7\2\2\u00fc\u00fe\7\b\2\2\u00fd\u00ff\5\n\6\2\u00fe"+
		"\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\5"+
		"\2\2\u0101\u0103\7@\2\2\u0102\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u00f5\3\2\2\2\u0104\u00f9\3\2\2\2\u0105\u010b\3\2"+
		"\2\2\u0106\u0107\f\4\2\2\u0107\u0108\7\5\2\2\u0108\u010a\7@\2\2\u0109"+
		"\u0106\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\t\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\t\2\2\u010f\u0110"+
		"\7@\2\2\u0110\u0111\7\n\2\2\u0111\13\3\2\2\2\u0112\u0113\5\16\b\2\u0113"+
		"\u0114\7\13\2\2\u0114\u0115\5\f\7\2\u0115\u011b\3\2\2\2\u0116\u0118\5"+
		"\24\13\2\u0117\u0119\5\20\t\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u011b\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u0116\3\2\2\2\u011b\r\3"+
		"\2\2\2\u011c\u012a\5\24\13\2\u011d\u0126\7\f\2\2\u011e\u0123\5l\67\2\u011f"+
		"\u0120\7\6\2\2\u0120\u0122\5l\67\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\7\r\2\2\u0129\u011c\3\2\2\2\u0129\u011d\3\2\2\2\u012a"+
		"\17\3\2\2\2\u012b\u012c\7\16\2\2\u012c\u012e\7\17\2\2\u012d\u012f\5\22"+
		"\n\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\20\2\2\u0133\21\3\2\2"+
		"\2\u0134\u0135\7\21\2\2\u0135\u0139\5\u009eP\2\u0136\u0137\7\22\2\2\u0137"+
		"\u0139\5\u0096L\2\u0138\u0134\3\2\2\2\u0138\u0136\3\2\2\2\u0139\23\3\2"+
		"\2\2\u013a\u013f\5\26\f\2\u013b\u013c\7@\2\2\u013c\u013e\5\26\f\2\u013d"+
		"\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\25\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0147\5\30\r\2\u0143\u0144"+
		"\7\23\2\2\u0144\u0146\5\30\r\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2"+
		"\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u014a\u014c\5 \21\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014f\5 \21\2\u014e\u0142\3\2\2\2\u014e\u014d\3\2"+
		"\2\2\u014f\27\3\2\2\2\u0150\u0154\5\32\16\2\u0151\u0153\5\u0082B\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\31\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\b\16\1\2\u0158\u015b"+
		"\5\b\5\2\u0159\u015a\7\5\2\2\u015a\u015c\7\21\2\2\u015b\u0159\3\2\2\2"+
		"\u015b\u015c\3\2\2\2\u015c\u0162\3\2\2\2\u015d\u015e\7\f\2\2\u015e\u015f"+
		"\5\36\20\2\u015f\u0160\7\r\2\2\u0160\u0162\3\2\2\2\u0161\u0157\3\2\2\2"+
		"\u0161\u015d\3\2\2\2\u0162\u016a\3\2\2\2\u0163\u0164\f\6\2\2\u0164\u0169"+
		"\5\34\17\2\u0165\u0166\f\5\2\2\u0166\u0167\7\24\2\2\u0167\u0169\7@\2\2"+
		"\u0168\u0163\3\2\2\2\u0168\u0165\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\33\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u016e\7\t\2\2\u016e\u016f\5\36\20\2\u016f\u0170\7\n\2\2\u0170\35\3\2"+
		"\2\2\u0171\u0176\5\f\7\2\u0172\u0173\7\6\2\2\u0173\u0175\5\f\7\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\37\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\7L\2\2\u017a\u0179"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\7\17\2\2"+
		"\u017d\u017f\5\"\22\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7\20\2\2"+
		"\u0183!\3\2\2\2\u0184\u0188\5\u0094K\2\u0185\u0186\7\21\2\2\u0186\u0188"+
		"\5\u00aaV\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0188#\3\2\2\2\u0189"+
		"\u018a\5\f\7\2\u018a%\3\2\2\2\u018b\u018c\7\25\2\2\u018c\u0197\5\24\13"+
		"\2\u018d\u018f\7\25\2\2\u018e\u0190\5\u0082B\2\u018f\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0197\3\2"+
		"\2\2\u0193\u0194\7\25\2\2\u0194\u0195\7\26\2\2\u0195\u0197\7\27\2\2\u0196"+
		"\u018b\3\2\2\2\u0196\u018d\3\2\2\2\u0196\u0193\3\2\2\2\u0197\'\3\2\2\2"+
		"\u0198\u019f\5v<\2\u0199\u019b\7\30\2\2\u019a\u0199\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019f\7@\2\2\u019d\u019f\7\26\2\2\u019e"+
		"\u0198\3\2\2\2\u019e\u019a\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a1\7\13\2\2\u01a1\u01a4\5(\25\2\u01a2\u01a4\5*\26\2\u01a3"+
		"\u019e\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4)\3\2\2\2\u01a5\u01a6\7\31\2\2"+
		"\u01a6\u01a7\7\f\2\2\u01a7\u01a8\5(\25\2\u01a8\u01ac\7\r\2\2\u01a9\u01ab"+
		"\7L\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\5("+
		"\25\2\u01b0\u01b1\7\32\2\2\u01b1\u01b3\5(\25\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u0206\3\2\2\2\u01b4\u01b5\7\33\2\2\u01b5\u01b6\7"+
		"\f\2\2\u01b6\u01b7\5(\25\2\u01b7\u01bb\7\r\2\2\u01b8\u01ba\7L\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\5(\25\2\u01bf"+
		"\u0206\3\2\2\2\u01c0\u01c1\7\34\2\2\u01c1\u01c4\5(\25\2\u01c2\u01c3\7"+
		"\35\2\2\u01c3\u01c5\5(\25\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c7\7\36\2\2\u01c7\u01c9\5(\25\2\u01c8\u01c6\3"+
		"\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u0206\3\2\2\2\u01ca\u01cb\7\37\2\2\u01cb"+
		"\u01cc\5(\25\2\u01cc\u01cd\7\33\2\2\u01cd\u01ce\7\f\2\2\u01ce\u01cf\5"+
		"(\25\2\u01cf\u01d0\7\r\2\2\u01d0\u0206\3\2\2\2\u01d1\u01da\7 \2\2\u01d2"+
		"\u01d3\7\f\2\2\u01d3\u01d4\5F$\2\u01d4\u01d5\7\r\2\2\u01d5\u01db\3\2\2"+
		"\2\u01d6\u01d7\7\17\2\2\u01d7\u01d8\5F$\2\u01d8\u01d9\7\20\2\2\u01d9\u01db"+
		"\3\2\2\2\u01da\u01d2\3\2\2\2\u01da\u01d6\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01de\7!\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e0\5(\25\2\u01e0\u0206\3\2\2\2\u01e1\u01e2\7\"\2\2\u01e2"+
		"\u0206\5(\25\2\u01e3\u01e5\7#\2\2\u01e4\u01e6\5(\25\2\u01e5\u01e4\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u0206\3\2\2\2\u01e7\u01ed\5\64\33\2\u01e8"+
		"\u01ea\5\66\34\2\u01e9\u01eb\7\26\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01e7\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\7\5\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ec\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7@\2\2\u01f3"+
		"\u01f4\7$\2\2\u01f4\u0206\5(\25\2\u01f5\u01f6\5\66\34\2\u01f6\u01f7\5"+
		":\36\2\u01f7\u01f8\7$\2\2\u01f8\u01f9\5(\25\2\u01f9\u0206\3\2\2\2\u01fa"+
		"\u01fc\5.\30\2\u01fb\u01fd\5&\24\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2"+
		"\2\2\u01fd\u0206\3\2\2\2\u01fe\u01ff\5.\30\2\u01ff\u0200\7%\2\2\u0200"+
		"\u0201\7\17\2\2\u0201\u0202\5J&\2\u0202\u0203\7\20\2\2\u0203\u0206\3\2"+
		"\2\2\u0204\u0206\5H%\2\u0205\u01a5\3\2\2\2\u0205\u01b4\3\2\2\2\u0205\u01c0"+
		"\3\2\2\2\u0205\u01ca\3\2\2\2\u0205\u01d1\3\2\2\2\u0205\u01e1\3\2\2\2\u0205"+
		"\u01e3\3\2\2\2\u0205\u01f0\3\2\2\2\u0205\u01f5\3\2\2\2\u0205\u01fa\3\2"+
		"\2\2\u0205\u01fe\3\2\2\2\u0205\u0204\3\2\2\2\u0206+\3\2\2\2\u0207\u0208"+
		"\t\2\2\2\u0208-\3\2\2\2\u0209\u020b\5\60\31\2\u020a\u020c\7@\2\2\u020b"+
		"\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u0212\3\2\2\2\u020d\u020e\5,"+
		"\27\2\u020e\u020f\5\66\34\2\u020f\u0211\3\2\2\2\u0210\u020d\3\2\2\2\u0211"+
		"\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0216\3\2"+
		"\2\2\u0214\u0212\3\2\2\2\u0215\u0217\7L\2\2\u0216\u0215\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217/\3\2\2\2\u0218\u0219\b\31\1\2\u0219\u021a\5\62\32"+
		"\2\u021a\u0223\3\2\2\2\u021b\u021c\f\3\2\2\u021c\u021e\7@\2\2\u021d\u021f"+
		"\7L\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0222\5\60\31\4\u0221\u021b\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3"+
		"\2\2\2\u0223\u0224\3\2\2\2\u0224\61\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0228\5,\27\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022e\3\2"+
		"\2\2\u0229\u022f\5\64\33\2\u022a\u022c\5\66\34\2\u022b\u022d\7\26\2\2"+
		"\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u0229"+
		"\3\2\2\2\u022e\u022a\3\2\2\2\u022f\63\3\2\2\2\u0230\u0233\7)\2\2\u0231"+
		"\u0234\5\u00b8]\2\u0232\u0234\5\u0086D\2\u0233\u0231\3\2\2\2\u0233\u0232"+
		"\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0237\5> \2\u0236\u0230\3\2\2\2\u0236"+
		"\u0235\3\2\2\2\u0237\65\3\2\2\2\u0238\u0239\b\34\1\2\u0239\u0249\5\2\2"+
		"\2\u023a\u0249\5\b\5\2\u023b\u0249\7\26\2\2\u023c\u023e\7\f\2\2\u023d"+
		"\u023f\58\35\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0249\7\r\2\2\u0241\u0242\5\64\33\2\u0242\u0243\7\5\2\2\u0243"+
		"\u0244\7@\2\2\u0244\u0249\3\2\2\2\u0245\u0246\5\64\33\2\u0246\u0247\5"+
		"\34\17\2\u0247\u0249\3\2\2\2\u0248\u0238\3\2\2\2\u0248\u023a\3\2\2\2\u0248"+
		"\u023b\3\2\2\2\u0248\u023c\3\2\2\2\u0248\u0241\3\2\2\2\u0248\u0245\3\2"+
		"\2\2\u0249\u0259\3\2\2\2\u024a\u024c\f\6\2\2\u024b\u024d\7\26\2\2\u024c"+
		"\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7\5"+
		"\2\2\u024f\u0258\7@\2\2\u0250\u0252\f\4\2\2\u0251\u0253\7\26\2\2\u0252"+
		"\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0258\5\34"+
		"\17\2\u0255\u0256\f\3\2\2\u0256\u0258\5:\36\2\u0257\u024a\3\2\2\2\u0257"+
		"\u0250\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u0259\u025a\3\2\2\2\u025a\67\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u0261"+
		"\5(\25\2\u025d\u025e\7\6\2\2\u025e\u0260\5(\25\2\u025f\u025d\3\2\2\2\u0260"+
		"\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u02629\3\2\2\2"+
		"\u0263\u0261\3\2\2\2\u0264\u0265\7\f\2\2\u0265\u0266\5<\37\2\u0266\u0267"+
		"\7\r\2\2\u0267\u0271\3\2\2\2\u0268\u0269\7\17\2\2\u0269\u026a\5<\37\2"+
		"\u026a\u026b\7\20\2\2\u026b\u0271\3\2\2\2\u026c\u026e\7L\2\2\u026d\u026c"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271\5> \2\u0270"+
		"\u0264\3\2\2\2\u0270\u0268\3\2\2\2\u0270\u026d\3\2\2\2\u0271;\3\2\2\2"+
		"\u0272\u0274\58\35\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u027f"+
		"\3\2\2\2\u0275\u0276\58\35\2\u0276\u0277\7\6\2\2\u0277\u0279\3\2\2\2\u0278"+
		"\u0275\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\5."+
		"\30\2\u027b\u027d\t\3\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027f\3\2\2\2\u027e\u0273\3\2\2\2\u027e\u0278\3\2\2\2\u027f=\3\2\2\2"+
		"\u0280\u0281\7\17\2\2\u0281\u0282\5J&\2\u0282\u0283\7\20\2\2\u0283\u0289"+
		"\3\2\2\2\u0284\u0285\7\17\2\2\u0285\u0286\5@!\2\u0286\u0287\7\20\2\2\u0287"+
		"\u0289\3\2\2\2\u0288\u0280\3\2\2\2\u0288\u0284\3\2\2\2\u0289?\3\2\2\2"+
		"\u028a\u028c\5B\"\2\u028b\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028b"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u0291\5D#\2\u0290"+
		"\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291A\3\2\2\2\u0292\u02ac\5\u008c"+
		"G\2\u0293\u0295\5\u0082B\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2\u0296"+
		"\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2"+
		"\2\2\u0299\u029b\t\4\2\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u02ac\5\u00a2R\2\u029d\u029f\5\u0082B\2\u029e\u029d"+
		"\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a6\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a5\5|?\2\u02a4\u02a3\3\2\2"+
		"\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9"+
		"\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ac\5\u00acW\2\u02aa\u02ac\5*\26"+
		"\2\u02ab\u0292\3\2\2\2\u02ab\u0296\3\2\2\2\u02ab\u02a0\3\2\2\2\u02ab\u02aa"+
		"\3\2\2\2\u02acC\3\2\2\2\u02ad\u02be\5*\26\2\u02ae\u02b9\5v<\2\u02af\u02b1"+
		"\7\30\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2"+
		"\u02b2\u02b5\7@\2\2\u02b3\u02b5\7\26\2\2\u02b4\u02b0\3\2\2\2\u02b4\u02b3"+
		"\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\7\25\2\2\u02b7\u02b9\5\26\f\2"+
		"\u02b8\u02ae\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb"+
		"\7\13\2\2\u02bb\u02bc\5@!\2\u02bc\u02be\3\2\2\2\u02bd\u02ad\3\2\2\2\u02bd"+
		"\u02b8\3\2\2\2\u02beE\3\2\2\2\u02bf\u02c1\5H%\2\u02c0\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3G\3\2\2\2"+
		"\u02c4\u02c5\5R*\2\u02c5\u02c6\7+\2\2\u02c6\u02ce\5(\25\2\u02c7\u02cd"+
		"\5N(\2\u02c8\u02c9\5R*\2\u02c9\u02ca\7$\2\2\u02ca\u02cb\5(\25\2\u02cb"+
		"\u02cd\3\2\2\2\u02cc\u02c7\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cd\u02d0\3\2"+
		"\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cfI\3\2\2\2\u02d0\u02ce"+
		"\3\2\2\2\u02d1\u02d3\5L\'\2\u02d2\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5K\3\2\2\2\u02d6\u02d7\7,\2\2\u02d7"+
		"\u02d9\5P)\2\u02d8\u02da\5N(\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2"+
		"\u02da\u02db\3\2\2\2\u02db\u02dc\7\13\2\2\u02dc\u02dd\5@!\2\u02ddM\3\2"+
		"\2\2\u02de\u02df\7\31\2\2\u02df\u02e0\5.\30\2\u02e0O\3\2\2\2\u02e1\u02e6"+
		"\5R*\2\u02e2\u02e3\7-\2\2\u02e3\u02e5\5R*\2\u02e4\u02e2\3\2\2\2\u02e5"+
		"\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7Q\3\2\2\2"+
		"\u02e8\u02e6\3\2\2\2\u02e9\u02ea\t\5\2\2\u02ea\u02eb\7\25\2\2\u02eb\u02ee"+
		"\5$\23\2\u02ec\u02ee\5T+\2\u02ed\u02e9\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ee"+
		"S\3\2\2\2\u02ef\u02f2\7@\2\2\u02f0\u02f1\7.\2\2\u02f1\u02f3\5V,\2\u02f2"+
		"\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f6\5V"+
		",\2\u02f5\u02ef\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6U\3\2\2\2\u02f7\u0304"+
		"\5X-\2\u02f8\u0300\5X-\2\u02f9\u02fb\7@\2\2\u02fa\u02fc\7L\2\2\u02fb\u02fa"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\5X-\2\u02fe"+
		"\u02f9\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u02f7\3\2\2\2\u0303"+
		"\u02f8\3\2\2\2\u0304W\3\2\2\2\u0305\u0325\7\26\2\2\u0306\u0325\7G\2\2"+
		"\u0307\u0325\5\2\2\2\u0308\u030e\5\b\5\2\u0309\u030b\7\f\2\2\u030a\u030c"+
		"\5Z.\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u030f\7\r\2\2\u030e\u0309\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0325\3\2"+
		"\2\2\u0310\u0311\5\b\5\2\u0311\u0315\7\f\2\2\u0312\u0313\5Z.\2\u0313\u0314"+
		"\7\6\2\2\u0314\u0316\3\2\2\2\u0315\u0312\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0319\3\2\2\2\u0317\u0318\7@\2\2\u0318\u031a\7.\2\2\u0319\u0317\3\2\2"+
		"\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\7\26\2\2\u031c"+
		"\u031d\7\27\2\2\u031d\u031e\7\r\2\2\u031e\u0325\3\2\2\2\u031f\u0321\7"+
		"\f\2\2\u0320\u0322\5Z.\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0325\7\r\2\2\u0324\u0305\3\2\2\2\u0324\u0306\3\2"+
		"\2\2\u0324\u0307\3\2\2\2\u0324\u0308\3\2\2\2\u0324\u0310\3\2\2\2\u0324"+
		"\u031f\3\2\2\2\u0325Y\3\2\2\2\u0326\u0329\5P)\2\u0327\u0328\7\6\2\2\u0328"+
		"\u032a\5Z.\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032e\3\2\2"+
		"\2\u032b\u032c\7\26\2\2\u032c\u032e\7\27\2\2\u032d\u0326\3\2\2\2\u032d"+
		"\u032b\3\2\2\2\u032e[\3\2\2\2\u032f\u0330\7\t\2\2\u0330\u0335\5`\61\2"+
		"\u0331\u0332\7\6\2\2\u0332\u0334\5`\61\2\u0333\u0331\3\2\2\2\u0334\u0337"+
		"\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2\2\2\u0337"+
		"\u0335\3\2\2\2\u0338\u0339\7\n\2\2\u0339]\3\2\2\2\u033a\u033b\7\t\2\2"+
		"\u033b\u0340\5b\62\2\u033c\u033d\7\6\2\2\u033d\u033f\5b\62\2\u033e\u033c"+
		"\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0343\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0344\7\n\2\2\u0344_\3\2\2\2"+
		"\u0345\u0347\5\u0082B\2\u0346\u0345\3\2\2\2\u0347\u034a\3\2\2\2\u0348"+
		"\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2"+
		"\2\2\u034b\u034d\t\6\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\5b\62\2\u034fa\3\2\2\2\u0350\u0352\t\7\2\2"+
		"\u0351\u0353\5\\/\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0356"+
		"\3\2\2\2\u0354\u0355\7/\2\2\u0355\u0357\5\f\7\2\u0356\u0354\3\2\2\2\u0356"+
		"\u0357\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0359\7\60\2\2\u0359\u035b\5"+
		"\f\7\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u0360\3\2\2\2\u035c"+
		"\u035d\7\61\2\2\u035d\u035f\5\f\7\2\u035e\u035c\3\2\2\2\u035f\u0362\3"+
		"\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0367\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0363\u0364\7\25\2\2\u0364\u0366\5\f\7\2\u0365\u0363\3"+
		"\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"c\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036c\5f\64\2\u036b\u036a\3\2\2\2"+
		"\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0378"+
		"\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0372\7L\2\2\u0371\u0370\3\2\2\2\u0371"+
		"\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\7\f\2\2\u0374\u0375\7\30"+
		"\2\2\u0375\u0376\5h\65\2\u0376\u0377\7\r\2\2\u0377\u0379\3\2\2\2\u0378"+
		"\u0371\3\2\2\2\u0378\u0379\3\2\2\2\u0379e\3\2\2\2\u037a\u037c\7L\2\2\u037b"+
		"\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f\7\f"+
		"\2\2\u037e\u0380\5h\65\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0382\7\r\2\2\u0382g\3\2\2\2\u0383\u0388\5j\66\2"+
		"\u0384\u0385\7\6\2\2\u0385\u0387\5j\66\2\u0386\u0384\3\2\2\2\u0387\u038a"+
		"\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389i\3\2\2\2\u038a"+
		"\u0388\3\2\2\2\u038b\u038d\5\u0082B\2\u038c\u038b\3\2\2\2\u038d\u0390"+
		"\3\2\2\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\3\2\2\2\u0390"+
		"\u038e\3\2\2\2\u0391\u0394\7@\2\2\u0392\u0393\7\25\2\2\u0393\u0395\5l"+
		"\67\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0398\3\2\2\2\u0396"+
		"\u0397\7$\2\2\u0397\u0399\5(\25\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2"+
		"\2\2\u0399k\3\2\2\2\u039a\u03a1\5\f\7\2\u039b\u039c\7\13\2\2\u039c\u03a1"+
		"\5\f\7\2\u039d\u039e\5\f\7\2\u039e\u039f\7\27\2\2\u039f\u03a1\3\2\2\2"+
		"\u03a0\u039a\3\2\2\2\u03a0\u039b\3\2\2\2\u03a0\u039d\3\2\2\2\u03a1m\3"+
		"\2\2\2\u03a2\u03a4\5p9\2\u03a3\u03a2\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5"+
		"\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03b0\3\2\2\2\u03a7\u03a5\3\2"+
		"\2\2\u03a8\u03aa\7L\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03ac\7\f\2\2\u03ac\u03ad\7\30\2\2\u03ad\u03ae\5"+
		"r:\2\u03ae\u03af\7\r\2\2\u03af\u03b1\3\2\2\2\u03b0\u03a9\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1o\3\2\2\2\u03b2\u03b4\7L\2\2\u03b3\u03b2\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\7\f\2\2\u03b6\u03b8\5r"+
		":\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03ba\7\r\2\2\u03baq\3\2\2\2\u03bb\u03c0\5t;\2\u03bc\u03bd\7\6\2\2\u03bd"+
		"\u03bf\5t;\2\u03be\u03bc\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2"+
		"\2\u03c0\u03c1\3\2\2\2\u03c1s\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u03c5"+
		"\5\u0082B\2\u03c4\u03c3\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2"+
		"\2\u03c6\u03c7\3\2\2\2\u03c7\u03cc\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03cb"+
		"\5z>\2\u03ca\u03c9\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf\u03d1\t\b"+
		"\2\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2"+
		"\u03d3\7@\2\2\u03d3\u03d4\7\25\2\2\u03d4\u03d7\5l\67\2\u03d5\u03d6\7$"+
		"\2\2\u03d6\u03d8\5(\25\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"u\3\2\2\2\u03d9\u03da\7\f\2\2\u03da\u03df\5x=\2\u03db\u03dc\7\6\2\2\u03dc"+
		"\u03de\5x=\2\u03dd\u03db\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2\2"+
		"\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03e3"+
		"\7\r\2\2\u03e3w\3\2\2\2\u03e4\u03e7\t\7\2\2\u03e5\u03e6\7\25\2\2\u03e6"+
		"\u03e8\5\f\7\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8y\3\2\2\2"+
		"\u03e9\u03ed\5|?\2\u03ea\u03ed\5~@\2\u03eb\u03ed\7\63\2\2\u03ec\u03e9"+
		"\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03eb\3\2\2\2\u03ed{\3\2\2\2\u03ee"+
		"\u03ef\t\t\2\2\u03ef}\3\2\2\2\u03f0\u03f2\t\n\2\2\u03f1\u03f3\5\u0080"+
		"A\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\177\3\2\2\2\u03f4\u03f5"+
		"\7\t\2\2\u03f5\u03f6\t\13\2\2\u03f6\u03f7\7\n\2\2\u03f7\u0081\3\2\2\2"+
		"\u03f8\u03f9\7.\2\2\u03f9\u03fd\5\32\16\2\u03fa\u03fc\5:\36\2\u03fb\u03fa"+
		"\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u0083\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400\u0401\7.\2\2\u0401\u0402\5\32"+
		"\16\2\u0402\u0403\5:\36\2\u0403\u0085\3\2\2\2\u0404\u0406\7L\2\2\u0405"+
		"\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\7\17"+
		"\2\2\u0408\u040a\5\u008aF\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u040c\3\2\2\2\u040b\u040d\5\u0088E\2\u040c\u040b\3\2\2\2\u040d\u040e"+
		"\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"\u0411\7\20\2\2\u0411\u0087\3\2\2\2\u0412\u0435\5\u008cG\2\u0413\u0415"+
		"\5\u0082B\2\u0414\u0416\7L\2\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2"+
		"\u0416\u0418\3\2\2\2\u0417\u0413\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417"+
		"\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041f\3\2\2\2\u041b\u0419\3\2\2\2\u041c"+
		"\u041e\5z>\2\u041d\u041c\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2"+
		"\2\u041f\u0420\3\2\2\2\u0420\u0422\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0435"+
		"\5\u00a2R\2\u0423\u0425\5\u0082B\2\u0424\u0426\7L\2\2\u0425\u0424\3\2"+
		"\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427\u0423\3\2\2\2\u0428"+
		"\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042f\3\2"+
		"\2\2\u042b\u0429\3\2\2\2\u042c\u042e\5z>\2\u042d\u042c\3\2\2\2\u042e\u0431"+
		"\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\3\2\2\2\u0431"+
		"\u042f\3\2\2\2\u0432\u0435\5\u0094K\2\u0433\u0435\5(\25\2\u0434\u0412"+
		"\3\2\2\2\u0434\u0419\3\2\2\2\u0434\u0429\3\2\2\2\u0434\u0433\3\2\2\2\u0435"+
		"\u0089\3\2\2\2\u0436\u0439\7@\2\2\u0437\u0438\7\25\2\2\u0438\u043a\5\f"+
		"\7\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u0442\7\13\2\2\u043c\u043d\7\7\2\2\u043d\u043e\7\25\2\2\u043e\u043f\5"+
		"\f\7\2\u043f\u0440\7\13\2\2\u0440\u0442\3\2\2\2\u0441\u0436\3\2\2\2\u0441"+
		"\u043c\3\2\2\2\u0442\u008b\3\2\2\2\u0443\u0444\79\2\2\u0444\u0449\5\u008e"+
		"H\2\u0445\u0446\7\6\2\2\u0446\u0448\5\u008eH\2\u0447\u0445\3\2\2\2\u0448"+
		"\u044b\3\2\2\2\u0449\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u008d\3\2"+
		"\2\2\u044b\u0449\3\2\2\2\u044c\u0453\5\b\5\2\u044d\u0451\7\5\2\2\u044e"+
		"\u0452\7@\2\2\u044f\u0452\7\26\2\2\u0450\u0452\5\u0090I\2\u0451\u044e"+
		"\3\2\2\2\u0451\u044f\3\2\2\2\u0451\u0450\3\2\2\2\u0452\u0454\3\2\2\2\u0453"+
		"\u044d\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u008f\3\2\2\2\u0455\u045b\7\17"+
		"\2\2\u0456\u0457\5\u0092J\2\u0457\u0458\7\6\2\2\u0458\u045a\3\2\2\2\u0459"+
		"\u0456\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2"+
		"\2\2\u045c\u0460\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u0461\5\u0092J\2\u045f"+
		"\u0461\7\26\2\2\u0460\u045e\3\2\2\2\u0460\u045f\3\2\2\2\u0461\u0462\3"+
		"\2\2\2\u0462\u0463\7\20\2\2\u0463\u0091\3\2\2\2\u0464\u0467\7@\2\2\u0465"+
		"\u0466\7\13\2\2\u0466\u0468\t\7\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3"+
		"\2\2\2\u0468\u0093\3\2\2\2\u0469\u046a\7\22\2\2\u046a\u0478\5\u0096L\2"+
		"\u046b\u046c\7\62\2\2\u046c\u0478\5\u0098M\2\u046d\u046e\7:\2\2\u046e"+
		"\u0478\5\u009aN\2\u046f\u0473\7\21\2\2\u0470\u0472\7L\2\2\u0471\u0470"+
		"\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u0476\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0478\5\u009eP\2\u0477\u0469"+
		"\3\2\2\2\u0477\u046b\3\2\2\2\u0477\u046d\3\2\2\2\u0477\u046f\3\2\2\2\u0478"+
		"\u0095\3\2\2\2\u0479\u047a\5\6\4\2\u047a\u047b\7\25\2\2\u047b\u047c\5"+
		"\f\7\2\u047c\u0097\3\2\2\2\u047d\u047e\5\6\4\2\u047e\u047f\7\25\2\2\u047f"+
		"\u0480\5\f\7\2\u0480\u0099\3\2\2\2\u0481\u0484\5\u009cO\2\u0482\u0483"+
		"\7\25\2\2\u0483\u0485\5\f\7\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2"+
		"\u0485\u009b\3\2\2\2\u0486\u0488\7@\2\2\u0487\u0489\5^\60\2\u0488\u0487"+
		"\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\5d\63\2\u048b"+
		"\u009d\3\2\2\2\u048c\u048e\7@\2\2\u048d\u048f\5\\/\2\u048e\u048d\3\2\2"+
		"\2\u048e\u048f\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u0491\7/\2\2\u0491\u0493"+
		"\5\f\7\2\u0492\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0496\3\2\2\2\u0494"+
		"\u0495\7\60\2\2\u0495\u0497\5\f\7\2\u0496\u0494\3\2\2\2\u0496\u0497\3"+
		"\2\2\2\u0497\u009f\3\2\2\2\u0498\u0499\7\22\2\2\u0499\u049d\5\u00a4S\2"+
		"\u049a\u049b\7\62\2\2\u049b\u049d\5\u00a6T\2\u049c\u0498\3\2\2\2\u049c"+
		"\u049a\3\2\2\2\u049d\u00a1\3\2\2\2\u049e\u04ab\5\u00a0Q\2\u049f\u04a0"+
		"\7:\2\2\u04a0\u04ab\5\u00a8U\2\u04a1\u04a5\7\21\2\2\u04a2\u04a4\7L\2\2"+
		"\u04a3\u04a2\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6"+
		"\3\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04ab\5\u00aaV"+
		"\2\u04a9\u04ab\5\u00acW\2\u04aa\u049e\3\2\2\2\u04aa\u049f\3\2\2\2\u04aa"+
		"\u04a1\3\2\2\2\u04aa\u04a9\3\2\2\2\u04ab\u00a3\3\2\2\2\u04ac\u04b1\5T"+
		"+\2\u04ad\u04ae\7\6\2\2\u04ae\u04b0\5T+\2\u04af\u04ad\3\2\2\2\u04b0\u04b3"+
		"\3\2\2\2\u04b1\u04af\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b6\3\2\2\2\u04b3"+
		"\u04b1\3\2\2\2\u04b4\u04b5\7\25\2\2\u04b5\u04b7\5\f\7\2\u04b6\u04b4\3"+
		"\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\7$\2\2\u04b9"+
		"\u04ba\5(\25\2\u04ba\u00a5\3\2\2\2\u04bb\u04c3\5\u00a4S\2\u04bc\u04bd"+
		"\5\6\4\2\u04bd\u04be\7\25\2\2\u04be\u04bf\5\f\7\2\u04bf\u04c0\7$\2\2\u04c0"+
		"\u04c1\7\26\2\2\u04c1\u04c3\3\2\2\2\u04c2\u04bb\3\2\2\2\u04c2\u04bc\3"+
		"\2\2\2\u04c3\u00a7\3\2\2\2\u04c4\u04c7\5\u009cO\2\u04c5\u04c6\7\25\2\2"+
		"\u04c6\u04c8\5\f\7\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9"+
		"\3\2\2\2\u04c9\u04ca\7$\2\2\u04ca\u04cb\5(\25\2\u04cb\u04e0\3\2\2\2\u04cc"+
		"\u04ce\5\u009cO\2\u04cd\u04cf\7L\2\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf\3"+
		"\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\7\17\2\2\u04d1\u04d2\5@!\2\u04d2"+
		"\u04d3\7\20\2\2\u04d3\u04e0\3\2\2\2\u04d4\u04d5\7\7\2\2\u04d5\u04d6\5"+
		"f\64\2\u04d6\u04dd\5d\63\2\u04d7\u04d8\7$\2\2\u04d8\u04de\5\u00c6d\2\u04d9"+
		"\u04db\7L\2\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2"+
		"\2\2\u04dc\u04de\5\u00c8e\2\u04dd\u04d7\3\2\2\2\u04dd\u04da\3\2\2\2\u04de"+
		"\u04e0\3\2\2\2\u04df\u04c4\3\2\2\2\u04df\u04cc\3\2\2\2\u04df\u04d4\3\2"+
		"\2\2\u04e0\u00a9\3\2\2\2\u04e1\u04e3\7@\2\2\u04e2\u04e4\5\\/\2\u04e3\u04e2"+
		"\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\7$\2\2\u04e6"+
		"\u04e7\5\f\7\2\u04e7\u00ab\3\2\2\2\u04e8\u04ea\7,\2\2\u04e9\u04e8\3\2"+
		"\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\7;\2\2\u04ec"+
		"\u04f5\5\u00aeX\2\u04ed\u04ef\7,\2\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3"+
		"\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\7<\2\2\u04f1\u04f5\5\u00b2Z\2\u04f2"+
		"\u04f3\7=\2\2\u04f3\u04f5\5\u00b0Y\2\u04f4\u04e9\3\2\2\2\u04f4\u04ee\3"+
		"\2\2\2\u04f4\u04f2\3\2\2\2\u04f5\u00ad\3\2\2\2\u04f6\u04f8\7@\2\2\u04f7"+
		"\u04f9\5\\/\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fd\3\2"+
		"\2\2\u04fa\u04fc\5\u0084C\2\u04fb\u04fa\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd"+
		"\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff\u04fd\3\2"+
		"\2\2\u0500\u0502\5~@\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503"+
		"\3\2\2\2\u0503\u0504\5n8\2\u0504\u0505\5\u00b4[\2\u0505\u00af\3\2\2\2"+
		"\u0506\u0508\7@\2\2\u0507\u0509\5\\/\2\u0508\u0507\3\2\2\2\u0508\u0509"+
		"\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\5\u00b6\\\2\u050b\u00b1\3\2\2"+
		"\2\u050c\u050d\7@\2\2\u050d\u050e\5\u00b4[\2\u050e\u00b3\3\2\2\2\u050f"+
		"\u0510\7>\2\2\u0510\u0518\5\u00b8]\2\u0511\u0513\7>\2\2\u0512\u0511\3"+
		"\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0516\5\u0086D\2"+
		"\u0515\u0512\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517\u050f"+
		"\3\2\2\2\u0517\u0515\3\2\2\2\u0518\u00b5\3\2\2\2\u0519\u051a\7>\2\2\u051a"+
		"\u0522\5\u00ba^\2\u051b\u051d\7>\2\2\u051c\u051b\3\2\2\2\u051c\u051d\3"+
		"\2\2\2\u051d\u051e\3\2\2\2\u051e\u0520\5\u0086D\2\u051f\u051c\3\2\2\2"+
		"\u051f\u0520\3\2\2\2\u0520\u0522\3\2\2\2\u0521\u0519\3\2\2\2\u0521\u051f"+
		"\3\2\2\2\u0522\u00b7\3\2\2\2\u0523\u0525\5\u00c2b\2\u0524\u0523\3\2\2"+
		"\2\u0524\u0525\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0528\5\u00bc_\2\u0527"+
		"\u0529\5\u0086D\2\u0528\u0527\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u00b9"+
		"\3\2\2\2\u052a\u052c\5\u00c2b\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2"+
		"\2\u052c\u052d\3\2\2\2\u052d\u052f\5\u00be`\2\u052e\u0530\5\u0086D\2\u052f"+
		"\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u00bb\3\2\2\2\u0531\u0536\5\u00c0"+
		"a\2\u0532\u0533\7\23\2\2\u0533\u0535\5\30\r\2\u0534\u0532\3\2\2\2\u0535"+
		"\u0538\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u00bd\3\2"+
		"\2\2\u0538\u0536\3\2\2\2\u0539\u053e\5\30\r\2\u053a\u053b\7\23\2\2\u053b"+
		"\u053d\5\30\r\2\u053c\u053a\3\2\2\2\u053d\u0540\3\2\2\2\u053e\u053c\3"+
		"\2\2\2\u053e\u053f\3\2\2\2\u053f\u00bf\3\2\2\2\u0540\u053e\3\2\2\2\u0541"+
		"\u0545\5\30\r\2\u0542\u0544\5:\36\2\u0543\u0542\3\2\2\2\u0544\u0547\3"+
		"\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u00c1\3\2\2\2\u0547"+
		"\u0545\3\2\2\2\u0548\u054a\7\17\2\2\u0549\u054b\5\u00c4c\2\u054a\u0549"+
		"\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u054f\7\20\2\2\u054f\u0550\7\23\2\2\u0550\u00c3\3"+
		"\2\2\2\u0551\u0553\5\u0082B\2\u0552\u0554\7L\2\2\u0553\u0552\3\2\2\2\u0553"+
		"\u0554\3\2\2\2\u0554\u0556\3\2\2\2\u0555\u0551\3\2\2\2\u0556\u0559\3\2"+
		"\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055d\3\2\2\2\u0559"+
		"\u0557\3\2\2\2\u055a\u055c\5z>\2\u055b\u055a\3\2\2\2\u055c\u055f\3\2\2"+
		"\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0560\3\2\2\2\u055f\u055d"+
		"\3\2\2\2\u0560\u0561\5\u00a0Q\2\u0561\u00c5\3\2\2\2\u0562\u0565\5\u00ca"+
		"f\2\u0563\u0565\5\u00c8e\2\u0564\u0562\3\2\2\2\u0564\u0563\3\2\2\2\u0565"+
		"\u00c7\3\2\2\2\u0566\u0567\7\17\2\2\u0567\u056b\5\u00caf\2\u0568\u056a"+
		"\5B\"\2\u0569\u0568\3\2\2\2\u056a\u056d\3\2\2\2\u056b\u0569\3\2\2\2\u056b"+
		"\u056c\3\2\2\2\u056c\u056e\3\2\2\2\u056d\u056b\3\2\2\2\u056e\u056f\7\20"+
		"\2\2\u056f\u00c9\3\2\2\2\u0570\u0572\7\7\2\2\u0571\u0573\5:\36\2\u0572"+
		"\u0571\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2"+
		"\2\2\u0575\u00cb\3\2\2\2\u0576\u0578\5\u00ceh\2\u0577\u0576\3\2\2\2\u0578"+
		"\u0579\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u00cd\3\2"+
		"\2\2\u057b\u057d\5\u0082B\2\u057c\u057e\7L\2\2\u057d\u057c\3\2\2\2\u057d"+
		"\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u057b\3\2\2\2\u0580\u0583\3\2"+
		"\2\2\u0581\u057f\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0587\3\2\2\2\u0583"+
		"\u0581\3\2\2\2\u0584\u0586\5z>\2\u0585\u0584\3\2\2\2\u0586\u0589\3\2\2"+
		"\2\u0587\u0585\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058a\3\2\2\2\u0589\u0587"+
		"\3\2\2\2\u058a\u058f\5\u00acW\2\u058b\u058f\5\u008cG\2\u058c\u058f\5\u00d0"+
		"i\2\u058d\u058f\5\u00d2j\2\u058e\u0581\3\2\2\2\u058e\u058b\3\2\2\2\u058e"+
		"\u058c\3\2\2\2\u058e\u058d\3\2\2\2\u058f\u00cf\3\2\2\2\u0590\u0591\7?"+
		"\2\2\u0591\u0593\5\4\3\2\u0592\u0594\7L\2\2\u0593\u0592\3\2\2\2\u0593"+
		"\u0594\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\7\17\2\2\u0596\u0597\5"+
		"\u00ccg\2\u0597\u0598\7\20\2\2\u0598\u00d1\3\2\2\2\u0599\u059a\7?\2\2"+
		"\u059a\u059b\7<\2\2\u059b\u059c\5\u00b2Z\2\u059c\u00d3\3\2\2\2\u059d\u059e"+
		"\7?\2\2\u059e\u05a0\5\4\3\2\u059f\u059d\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1"+
		"\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a1\3\2"+
		"\2\2\u05a4\u05a5\5\u00ccg\2\u05a5\u00d5\3\2\2\2\u00d2\u00d7\u00db\u00e3"+
		"\u00ea\u00f2\u00f9\u00fe\u0102\u0104\u010b\u0118\u011a\u0123\u0126\u0129"+
		"\u0130\u0138\u013f\u0147\u014b\u014e\u0154\u015b\u0161\u0168\u016a\u0176"+
		"\u017a\u0180\u0187\u0191\u0196\u019a\u019e\u01a3\u01ac\u01b2\u01bb\u01c4"+
		"\u01c8\u01da\u01dd\u01e5\u01ea\u01ec\u01f0\u01fc\u0205\u020b\u0212\u0216"+
		"\u021e\u0223\u0227\u022c\u022e\u0233\u0236\u023e\u0248\u024c\u0252\u0257"+
		"\u0259\u0261\u026d\u0270\u0273\u0278\u027c\u027e\u0288\u028d\u0290\u0296"+
		"\u029a\u02a0\u02a6\u02ab\u02b0\u02b4\u02b8\u02bd\u02c2\u02cc\u02ce\u02d4"+
		"\u02d9\u02e6\u02ed\u02f2\u02f5\u02fb\u0300\u0303\u030b\u030e\u0315\u0319"+
		"\u0321\u0324\u0329\u032d\u0335\u0340\u0348\u034c\u0352\u0356\u035a\u0360"+
		"\u0367\u036d\u0371\u0378\u037b\u037f\u0388\u038e\u0394\u0398\u03a0\u03a5"+
		"\u03a9\u03b0\u03b3\u03b7\u03c0\u03c6\u03cc\u03d0\u03d7\u03df\u03e7\u03ec"+
		"\u03f2\u03fd\u0405\u0409\u040e\u0415\u0419\u041f\u0425\u0429\u042f\u0434"+
		"\u0439\u0441\u0449\u0451\u0453\u045b\u0460\u0467\u0473\u0477\u0484\u0488"+
		"\u048e\u0492\u0496\u049c\u04a5\u04aa\u04b1\u04b6\u04c2\u04c7\u04ce\u04da"+
		"\u04dd\u04df\u04e3\u04e9\u04ee\u04f4\u04f8\u04fd\u0501\u0508\u0512\u0515"+
		"\u0517\u051c\u051f\u0521\u0524\u0528\u052b\u052f\u0536\u053e\u0545\u054c"+
		"\u0553\u0557\u055d\u0564\u056b\u0574\u0579\u057d\u0581\u0587\u058e\u0593"+
		"\u05a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}