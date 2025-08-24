// Generated from C:/Users/pc/IdeaProjects/AngularCompiler/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FROM=2, NEW=3, COMPONENT=4, SELECTOR=5, STANDALONE=6, TRUE=7, 
		FALSE=8, IMPORTS=9, STYLES=10, TEMPLATE=11, EXPORT=12, CLASS=13, THIS=14, 
		ANY=15, RETURN=16, BREAK=17, IF=18, ELSE=19, FOR=20, WHILE=21, LET=22, 
		INTERFACE=23, LBRACE=24, RBRACE=25, LBRACKET=26, RBRACKET=27, LPAREN=28, 
		RPAREN=29, COLON=30, COMMA=31, SEMI=32, DOT=33, HASH=34, DQUOTE=35, SQUOTE=36, 
		EQUALS=37, INCREMENT=38, ARROW=39, QUESTION=40, PLUS=41, MINUS=42, MULT=43, 
		DIV=44, MOD=45, LT=46, GT=47, LE=48, GE=49, EQ=50, NEQ=51, AND=52, OR=53, 
		NOT=54, NUMBER=55, STRING_LITERAL=56, BACKTICK_OPEN=57, WS=58, COMMENT=59, 
		MULTILINE_COMMENT=60, IDENTIFIER=61, BACKTICK_CLOSE=62, HTML_END_LT=63, 
		HTML_LT=64, HTML_GT=65, HTML_SLASH_GT=66, HTML_SLASH=67, HTML_EQ=68, ATTR_LBRACK=69, 
		ATTR_RBRACK=70, ATTR_LPAREN=71, ATTR_RPAREN=72, ATTR_STAR=73, INTERPOLATION=74, 
		TPL_STRING=75, HTML_NAME=76, HTML_TEXT=77, CSS_LBRACE=78, CSS_RBRACE=79, 
		CSS_COLON=80, CSS_SEMI=81, CSS_COMMA=82, CSS_IDENT=83, CSS_TEXT=84, TPL_OTHER=85;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_importItems = 2, RULE_importItem = 3, 
		RULE_modulePath = 4, RULE_interfaceDeclaration = 5, RULE_interfaceMember = 6, 
		RULE_componentDefinition = 7, RULE_componentConfig = 8, RULE_componentProperty = 9, 
		RULE_arrayLiteral = 10, RULE_arrayItem = 11, RULE_classDeclaration = 12, 
		RULE_classBody = 13, RULE_classMember = 14, RULE_fieldDeclaration = 15, 
		RULE_methodDeclaration = 16, RULE_parameterList = 17, RULE_parameter = 18, 
		RULE_typeAnnotation = 19, RULE_typePrimary = 20, RULE_inlineObjectType = 21, 
		RULE_objectTypeMember = 22, RULE_block = 23, RULE_statement = 24, RULE_variableDeclaration = 25, 
		RULE_expressionStatement = 26, RULE_returnStatement = 27, RULE_ifStatement = 28, 
		RULE_forStatement = 29, RULE_breakStatement = 30, RULE_forInit = 31, RULE_whileStatement = 32, 
		RULE_expression = 33, RULE_assignmentExpression = 34, RULE_conditionalExpression = 35, 
		RULE_logicalOrExpression = 36, RULE_logicalAndExpression = 37, RULE_equalityExpression = 38, 
		RULE_relationalExpression = 39, RULE_additiveExpression = 40, RULE_multiplicativeExpression = 41, 
		RULE_unaryExpression = 42, RULE_postfixExpression = 43, RULE_postfixPart = 44, 
		RULE_functionCall = 45, RULE_propertyAccess = 46, RULE_postfixIncrement = 47, 
		RULE_primaryExpression = 48, RULE_newExpression = 49, RULE_arrowFunction = 50, 
		RULE_arrowParams = 51, RULE_objectLiteral = 52, RULE_keyValue = 53, RULE_literal = 54, 
		RULE_booleanLiteral = 55, RULE_qualifiedName = 56, RULE_templateHtml = 57, 
		RULE_templateNode = 58, RULE_element = 59, RULE_attribute = 60, RULE_plainAttribute = 61, 
		RULE_boundProperty = 62, RULE_boundEvent = 63, RULE_twoWayBinding = 64, 
		RULE_structuralDirective = 65, RULE_interpolation = 66, RULE_htmlText = 67, 
		RULE_cssOrTemplateItem = 68, RULE_cssRules = 69, RULE_cssRule = 70, RULE_cssDeclaration = 71, 
		RULE_cssText = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "importItems", "importItem", "modulePath", 
			"interfaceDeclaration", "interfaceMember", "componentDefinition", "componentConfig", 
			"componentProperty", "arrayLiteral", "arrayItem", "classDeclaration", 
			"classBody", "classMember", "fieldDeclaration", "methodDeclaration", 
			"parameterList", "parameter", "typeAnnotation", "typePrimary", "inlineObjectType", 
			"objectTypeMember", "block", "statement", "variableDeclaration", "expressionStatement", 
			"returnStatement", "ifStatement", "forStatement", "breakStatement", "forInit", 
			"whileStatement", "expression", "assignmentExpression", "conditionalExpression", 
			"logicalOrExpression", "logicalAndExpression", "equalityExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "postfixExpression", "postfixPart", "functionCall", 
			"propertyAccess", "postfixIncrement", "primaryExpression", "newExpression", 
			"arrowFunction", "arrowParams", "objectLiteral", "keyValue", "literal", 
			"booleanLiteral", "qualifiedName", "templateHtml", "templateNode", "element", 
			"attribute", "plainAttribute", "boundProperty", "boundEvent", "twoWayBinding", 
			"structuralDirective", "interpolation", "htmlText", "cssOrTemplateItem", 
			"cssRules", "cssRule", "cssDeclaration", "cssText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'new'", "'@Component'", "'selector'", "'standalone'", 
			"'true'", "'false'", "'imports'", "'styles'", "'template'", "'export'", 
			"'class'", "'this'", "'any'", "'return'", "'break'", "'if'", "'else'", 
			"'for'", "'while'", "'let'", "'interface'", null, null, null, null, null, 
			null, null, null, null, "'.'", "'#'", "'\"'", "'''", null, "'++'", "'=>'", 
			"'?'", "'+'", "'-'", null, null, "'%'", null, null, "'<='", "'>='", "'=='", 
			"'!='", "'&&'", "'||'", "'!'", null, null, null, null, null, null, null, 
			null, "'</'", null, null, "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "NEW", "COMPONENT", "SELECTOR", "STANDALONE", 
			"TRUE", "FALSE", "IMPORTS", "STYLES", "TEMPLATE", "EXPORT", "CLASS", 
			"THIS", "ANY", "RETURN", "BREAK", "IF", "ELSE", "FOR", "WHILE", "LET", 
			"INTERFACE", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", 
			"COLON", "COMMA", "SEMI", "DOT", "HASH", "DQUOTE", "SQUOTE", "EQUALS", 
			"INCREMENT", "ARROW", "QUESTION", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
			"LT", "GT", "LE", "GE", "EQ", "NEQ", "AND", "OR", "NOT", "NUMBER", "STRING_LITERAL", 
			"BACKTICK_OPEN", "WS", "COMMENT", "MULTILINE_COMMENT", "IDENTIFIER", 
			"BACKTICK_CLOSE", "HTML_END_LT", "HTML_LT", "HTML_GT", "HTML_SLASH_GT", 
			"HTML_SLASH", "HTML_EQ", "ATTR_LBRACK", "ATTR_RBRACK", "ATTR_LPAREN", 
			"ATTR_RPAREN", "ATTR_STAR", "INTERPOLATION", "TPL_STRING", "HTML_NAME", 
			"HTML_TEXT", "CSS_LBRACE", "CSS_RBRACE", "CSS_COLON", "CSS_SEMI", "CSS_COMMA", 
			"CSS_IDENT", "CSS_TEXT", "TPL_OTHER"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public List<ComponentDefinitionContext> componentDefinition() {
			return getRuleContexts(ComponentDefinitionContext.class);
		}
		public ComponentDefinitionContext componentDefinition(int i) {
			return getRuleContext(ComponentDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(146);
				importStatement();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTERFACE:
					{
					setState(152);
					interfaceDeclaration();
					}
					break;
				case COMPONENT:
					{
					setState(153);
					componentDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMPONENT || _la==INTERFACE );
			setState(158);
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
	public static class ImportStatementContext extends ParserRuleContext {
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	 
		public ImportStatementContext() { }
		public void copyFrom(ImportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtContext extends ImportStatementContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public ImportItemsContext importItems() {
			return getRuleContext(ImportItemsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public ModulePathContext modulePath() {
			return getRuleContext(ModulePathContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ImportStmtContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		int _la;
		try {
			_localctx = new ImportStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IMPORT);
			setState(161);
			importItems();
			setState(162);
			match(FROM);
			setState(163);
			modulePath();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(164);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemsContext extends ParserRuleContext {
		public ImportItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItems; }
	 
		public ImportItemsContext() { }
		public void copyFrom(ImportItemsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemListContext extends ImportItemsContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportItemListContext(ImportItemsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemsContext importItems() throws RecognitionException {
		ImportItemsContext _localctx = new ImportItemsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importItems);
		int _la;
		try {
			_localctx = new ImportItemListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(LBRACE);
			setState(168);
			importItem();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				importItem();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(RBRACE);
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
	public static class ImportItemContext extends ParserRuleContext {
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
	 
		public ImportItemContext() { }
		public void copyFrom(ImportItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportNameContext extends ImportItemContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ImportNameContext(ImportItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importItem);
		try {
			_localctx = new ImportNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IDENTIFIER);
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
	public static class ModulePathContext extends ParserRuleContext {
		public ModulePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulePath; }
	 
		public ModulePathContext() { }
		public void copyFrom(ModulePathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulePathStringContext extends ModulePathContext {
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public ModulePathStringContext(ModulePathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModulePathString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModulePathString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModulePathString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModulePathContext modulePath() throws RecognitionException {
		ModulePathContext _localctx = new ModulePathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modulePath);
		try {
			_localctx = new ModulePathStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(STRING_LITERAL);
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
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	 
		public InterfaceDeclarationContext() { }
		public void copyFrom(InterfaceDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclContext extends InterfaceDeclarationContext {
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<InterfaceMemberContext> interfaceMember() {
			return getRuleContexts(InterfaceMemberContext.class);
		}
		public InterfaceMemberContext interfaceMember(int i) {
			return getRuleContext(InterfaceMemberContext.class,i);
		}
		public InterfaceDeclContext(InterfaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceDeclaration);
		int _la;
		try {
			_localctx = new InterfaceDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(INTERFACE);
			setState(183);
			match(IDENTIFIER);
			setState(184);
			match(LBRACE);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(185);
				interfaceMember();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(RBRACE);
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
	public static class InterfaceMemberContext extends ParserRuleContext {
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
	 
		public InterfaceMemberContext() { }
		public void copyFrom(InterfaceMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclContext extends InterfaceMemberContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public InterfaceMemberDeclContext(InterfaceMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceMemberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceMember);
		int _la;
		try {
			_localctx = new InterfaceMemberDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(IDENTIFIER);
			setState(194);
			match(COLON);
			setState(195);
			typeAnnotation();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(196);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefinitionContext extends ParserRuleContext {
		public ComponentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDefinition; }
	 
		public ComponentDefinitionContext() { }
		public void copyFrom(ComponentDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefContext extends ComponentDefinitionContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ComponentConfigContext componentConfig() {
			return getRuleContext(ComponentConfigContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ComponentDefContext(ComponentDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDefinitionContext componentDefinition() throws RecognitionException {
		ComponentDefinitionContext _localctx = new ComponentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_componentDefinition);
		try {
			_localctx = new ComponentDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(COMPONENT);
			setState(200);
			match(LPAREN);
			setState(201);
			componentConfig();
			setState(202);
			match(RPAREN);
			setState(203);
			classDeclaration();
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
	public static class ComponentConfigContext extends ParserRuleContext {
		public ComponentConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentConfig; }
	 
		public ComponentConfigContext() { }
		public void copyFrom(ComponentConfigContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentConfigObjContext extends ComponentConfigContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public List<ComponentPropertyContext> componentProperty() {
			return getRuleContexts(ComponentPropertyContext.class);
		}
		public ComponentPropertyContext componentProperty(int i) {
			return getRuleContext(ComponentPropertyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentConfigObjContext(ComponentConfigContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentConfigObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentConfigObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentConfigObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentConfigContext componentConfig() throws RecognitionException {
		ComponentConfigContext _localctx = new ComponentConfigContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_componentConfig);
		int _la;
		try {
			_localctx = new ComponentConfigObjContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(LBRACE);
			setState(206);
			componentProperty();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(207);
				match(COMMA);
				setState(208);
				componentProperty();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(RBRACE);
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
	public static class ComponentPropertyContext extends ParserRuleContext {
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
	 
		public ComponentPropertyContext() { }
		public void copyFrom(ComponentPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropContext extends ComponentPropertyContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public SelectorPropContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesPropContext extends ComponentPropertyContext {
		public TerminalNode STYLES() { return getToken(AngularParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public StylesPropContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandalonePropContext extends ComponentPropertyContext {
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public StandalonePropContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandaloneProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandaloneProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandaloneProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropContext extends ComponentPropertyContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ImportsPropContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropContext extends ComponentPropertyContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode BACKTICK_OPEN() { return getToken(AngularParser.BACKTICK_OPEN, 0); }
		public TemplateHtmlContext templateHtml() {
			return getRuleContext(TemplateHtmlContext.class,0);
		}
		public TerminalNode BACKTICK_CLOSE() { return getToken(AngularParser.BACKTICK_CLOSE, 0); }
		public TemplatePropContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_componentProperty);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorPropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(SELECTOR);
				setState(217);
				match(COLON);
				setState(218);
				match(STRING_LITERAL);
				}
				break;
			case STANDALONE:
				_localctx = new StandalonePropContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(STANDALONE);
				setState(220);
				match(COLON);
				setState(221);
				booleanLiteral();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsPropContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(IMPORTS);
				setState(223);
				match(COLON);
				setState(224);
				arrayLiteral();
				}
				break;
			case TEMPLATE:
				_localctx = new TemplatePropContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(TEMPLATE);
				setState(226);
				match(COLON);
				setState(227);
				match(BACKTICK_OPEN);
				setState(228);
				templateHtml();
				setState(229);
				match(BACKTICK_CLOSE);
				}
				break;
			case STYLES:
				_localctx = new StylesPropContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(STYLES);
				setState(232);
				match(COLON);
				setState(233);
				arrayLiteral();
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	 
		public ArrayLiteralContext() { }
		public void copyFrom(ArrayLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralExprContext extends ArrayLiteralContext {
		public TerminalNode LBRACKET() { return getToken(AngularParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(AngularParser.RBRACKET, 0); }
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayLiteralExprContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayLiteral);
		int _la;
		try {
			_localctx = new ArrayLiteralExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LBRACKET);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2522015791344254976L) != 0)) {
				{
				setState(237);
				arrayItem();
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(238);
					match(COMMA);
					setState(239);
					arrayItem();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(247);
			match(RBRACKET);
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
	public static class ArrayItemContext extends ParserRuleContext {
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
	 
		public ArrayItemContext() { }
		public void copyFrom(ArrayItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateItemContext extends ArrayItemContext {
		public TerminalNode BACKTICK_OPEN() { return getToken(AngularParser.BACKTICK_OPEN, 0); }
		public CssOrTemplateItemContext cssOrTemplateItem() {
			return getRuleContext(CssOrTemplateItemContext.class,0);
		}
		public TerminalNode BACKTICK_CLOSE() { return getToken(AngularParser.BACKTICK_CLOSE, 0); }
		public TemplateItemContext(ArrayItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringItemContext extends ArrayItemContext {
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public StringItemContext(ArrayItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectItemContext extends ArrayItemContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectItemContext(ArrayItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierItemContext extends ArrayItemContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierItemContext(ArrayItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayItem);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK_OPEN:
				_localctx = new TemplateItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(BACKTICK_OPEN);
				setState(250);
				cssOrTemplateItem();
				setState(251);
				match(BACKTICK_CLOSE);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(STRING_LITERAL);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierItemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(IDENTIFIER);
				}
				break;
			case LBRACE:
				_localctx = new ObjectItemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				objectLiteral();
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclContext extends ClassDeclarationContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public ClassDeclContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classDeclaration);
		int _la;
		try {
			_localctx = new ClassDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(258);
				match(EXPORT);
				}
			}

			setState(261);
			match(CLASS);
			setState(262);
			match(IDENTIFIER);
			setState(263);
			match(LBRACE);
			setState(264);
			classBody();
			setState(265);
			match(RBRACE);
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
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyMembersContext extends ClassBodyContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassBodyMembersContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBodyMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBodyMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBodyMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classBody);
		int _la;
		try {
			_localctx = new ClassBodyMembersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(267);
				classMember();
				}
				}
				setState(272);
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
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	 
		public ClassMemberContext() { }
		public void copyFrom(ClassMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodMemberContext extends ClassMemberContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodMember(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldMemberContext extends ClassMemberContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public FieldMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFieldMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFieldMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFieldMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classMember);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new FieldMemberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				fieldDeclaration();
				}
				break;
			case 2:
				_localctx = new MethodMemberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				methodDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	 
		public FieldDeclarationContext() { }
		public void copyFrom(FieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclContext extends FieldDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public FieldDeclContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fieldDeclaration);
		int _la;
		try {
			_localctx = new FieldDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(IDENTIFIER);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(278);
				match(COLON);
				setState(279);
				typeAnnotation();
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(282);
				match(EQUALS);
				setState(283);
				expression();
				}
			}

			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(286);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclContext extends MethodDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public MethodDeclContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodDeclaration);
		int _la;
		try {
			_localctx = new MethodDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IDENTIFIER);
			setState(290);
			match(LPAREN);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(291);
				parameterList();
				}
			}

			setState(294);
			match(RPAREN);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(295);
				match(COLON);
				setState(296);
				typeAnnotation();
				}
			}

			setState(299);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	 
		public ParameterListContext() { }
		public void copyFrom(ParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParameterListContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParamListContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterList);
		int _la;
		try {
			_localctx = new ParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			parameter();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(302);
				match(COMMA);
				setState(303);
				parameter();
				}
				}
				setState(308);
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
	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParameterContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ParamContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameter);
		try {
			_localctx = new ParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IDENTIFIER);
			setState(310);
			match(COLON);
			setState(311);
			typeAnnotation();
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
	public static class TypeAnnotationContext extends ParserRuleContext {
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
	 
		public TypeAnnotationContext() { }
		public void copyFrom(TypeAnnotationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotatedContext extends TypeAnnotationContext {
		public TypePrimaryContext typePrimary() {
			return getRuleContext(TypePrimaryContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(AngularParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(AngularParser.RBRACKET, 0); }
		public TypeAnnotatedContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeAnnotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeAnnotated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeAnnotated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeAnnotation);
		int _la;
		try {
			_localctx = new TypeAnnotatedContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			typePrimary();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(314);
				match(LBRACKET);
				setState(315);
				match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypePrimaryContext extends ParserRuleContext {
		public TypePrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePrimary; }
	 
		public TypePrimaryContext() { }
		public void copyFrom(TypePrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdentContext extends TypePrimaryContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TypeIdentContext(TypePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnyContext extends TypePrimaryContext {
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TypeAnyContext(TypePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeAny(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineObjTypeContext extends TypePrimaryContext {
		public InlineObjectTypeContext inlineObjectType() {
			return getRuleContext(InlineObjectTypeContext.class,0);
		}
		public InlineObjTypeContext(TypePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInlineObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInlineObjType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInlineObjType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePrimaryContext typePrimary() throws RecognitionException {
		TypePrimaryContext _localctx = new TypePrimaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typePrimary);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new TypeIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(IDENTIFIER);
				}
				break;
			case ANY:
				_localctx = new TypeAnyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(ANY);
				}
				break;
			case LBRACE:
				_localctx = new InlineObjTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				inlineObjectType();
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
	public static class InlineObjectTypeContext extends ParserRuleContext {
		public InlineObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineObjectType; }
	 
		public InlineObjectTypeContext() { }
		public void copyFrom(InlineObjectTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineObjContext extends InlineObjectTypeContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<ObjectTypeMemberContext> objectTypeMember() {
			return getRuleContexts(ObjectTypeMemberContext.class);
		}
		public ObjectTypeMemberContext objectTypeMember(int i) {
			return getRuleContext(ObjectTypeMemberContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public InlineObjContext(InlineObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInlineObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInlineObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInlineObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineObjectTypeContext inlineObjectType() throws RecognitionException {
		InlineObjectTypeContext _localctx = new InlineObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inlineObjectType);
		int _la;
		try {
			int _alt;
			_localctx = new InlineObjContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(LBRACE);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(324);
				objectTypeMember();
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						match(SEMI);
						setState(326);
						objectTypeMember();
						}
						} 
					}
					setState(331);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
			}

			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(334);
				match(SEMI);
				}
			}

			setState(337);
			match(RBRACE);
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
	public static class ObjectTypeMemberContext extends ParserRuleContext {
		public ObjectTypeMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeMember; }
	 
		public ObjectTypeMemberContext() { }
		public void copyFrom(ObjectTypeMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeMemberRuleContext extends ObjectTypeMemberContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ObjectTypeMemberRuleContext(ObjectTypeMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectTypeMemberRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectTypeMemberRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectTypeMemberRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeMemberContext objectTypeMember() throws RecognitionException {
		ObjectTypeMemberContext _localctx = new ObjectTypeMemberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_objectTypeMember);
		try {
			_localctx = new ObjectTypeMemberRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(IDENTIFIER);
			setState(340);
			match(COLON);
			setState(341);
			typeAnnotation();
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
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeBlockContext extends BlockContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CodeBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			_localctx = new CodeBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(LBRACE);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2431948201481683336L) != 0)) {
				{
				{
				setState(344);
				statement();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(RBRACE);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStmtContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public EmptyStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclStmtContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VarDeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				expressionStatement();
				}
				break;
			case 3:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				returnStatement();
				}
				break;
			case 4:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				ifStatement();
				}
				break;
			case 5:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				forStatement();
				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(357);
				whileStatement();
				}
				break;
			case 7:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(358);
				breakStatement();
				}
				break;
			case 8:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(359);
				block();
				}
				break;
			case 9:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(360);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends VariableDeclarationContext {
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(LET);
			setState(364);
			match(IDENTIFIER);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(365);
				match(COLON);
				setState(366);
				typeAnnotation();
				}
			}

			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(369);
				match(EQUALS);
				setState(370);
				expression();
				}
			}

			setState(373);
			match(SEMI);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	 
		public ExpressionStatementContext() { }
		public void copyFrom(ExpressionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatementContext extends ExpressionStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ExprStatementContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionStatement);
		try {
			_localctx = new ExprStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			expression();
			setState(376);
			match(SEMI);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementExprContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementExprContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnStatementExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(RETURN);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2431948197178917256L) != 0)) {
				{
				setState(379);
				expression();
				}
			}

			setState(382);
			match(SEMI);
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
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStmtContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public IfElseStmtContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifStatement);
		try {
			_localctx = new IfElseStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(IF);
			setState(385);
			match(LPAREN);
			setState(386);
			expression();
			setState(387);
			match(RPAREN);
			setState(388);
			statement();
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(389);
				match(ELSE);
				setState(390);
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
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForLoopContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forStatement);
		int _la;
		try {
			_localctx = new ForLoopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(FOR);
			setState(394);
			match(LPAREN);
			setState(395);
			forInit();
			setState(396);
			match(SEMI);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2431948197178917256L) != 0)) {
				{
				setState(397);
				expression();
				}
			}

			setState(400);
			match(SEMI);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2431948197178917256L) != 0)) {
				{
				setState(401);
				expression();
				}
			}

			setState(404);
			match(RPAREN);
			setState(405);
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AngularParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(BREAK);
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(408);
				match(SEMI);
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
	public static class ForInitContext extends ParserRuleContext {
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	 
		public ForInitContext() { }
		public void copyFrom(ForInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForVarInitContext extends ForInitContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ForVarInitContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForVarInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForVarInit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyForInitContext extends ForInitContext {
		public EmptyForInitContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEmptyForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEmptyForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEmptyForInit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForExprInitContext extends ForInitContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForExprInitContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForExprInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForExprInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForExprInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forInit);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				_localctx = new ForVarInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				variableDeclaration();
				}
				break;
			case NEW:
			case TRUE:
			case FALSE:
			case THIS:
			case LBRACE:
			case LBRACKET:
			case LPAREN:
			case MINUS:
			case NOT:
			case NUMBER:
			case STRING_LITERAL:
			case IDENTIFIER:
				_localctx = new ForExprInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				expression();
				}
				break;
			case SEMI:
				_localctx = new EmptyForInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whileStatement);
		try {
			_localctx = new WhileLoopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(WHILE);
			setState(417);
			match(LPAREN);
			setState(418);
			expression();
			setState(419);
			match(RPAREN);
			setState(420);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAssignmentContext extends ExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExprAssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExprAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExprAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExprAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression);
		try {
			_localctx = new ExprAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			assignmentExpression();
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
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends AssignmentExpressionContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignExprContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignmentExpression);
		try {
			_localctx = new AssignExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			conditionalExpression();
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(425);
				match(EQUALS);
				setState(426);
				assignmentExpression();
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
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	 
		public ConditionalExpressionContext() { }
		public void copyFrom(ConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondExprContext extends ConditionalExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public CondExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCondExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conditionalExpression);
		try {
			_localctx = new CondExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			logicalOrExpression();
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(430);
				match(QUESTION);
				setState(431);
				expression();
				setState(432);
				match(COLON);
				setState(433);
				expression();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExprContext extends LogicalOrExpressionContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AngularParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AngularParser.OR, i);
		}
		public LogicalOrExprContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logicalOrExpression);
		try {
			int _alt;
			_localctx = new LogicalOrExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			logicalAndExpression();
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(438);
					match(OR);
					setState(439);
					logicalAndExpression();
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExprContext extends LogicalAndExpressionContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AngularParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AngularParser.AND, i);
		}
		public LogicalAndExprContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_logicalAndExpression);
		try {
			int _alt;
			_localctx = new LogicalAndExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			equalityExpression();
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(446);
					match(AND);
					setState(447);
					equalityExpression();
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends EqualityExpressionContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(AngularParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(AngularParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(AngularParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(AngularParser.NEQ, i);
		}
		public EqualityExprContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_equalityExpression);
		int _la;
		try {
			int _alt;
			_localctx = new EqualityExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			relationalExpression();
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(454);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NEQ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(455);
					relationalExpression();
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends RelationalExpressionContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(AngularParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(AngularParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(AngularParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(AngularParser.LE, i);
		}
		public List<TerminalNode> GT() { return getTokens(AngularParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(AngularParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(AngularParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(AngularParser.GE, i);
		}
		public RelationalExprContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			_localctx = new RelationalExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			additiveExpression();
			setState(466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(463);
					additiveExpression();
					}
					} 
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends AdditiveExpressionContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(AngularParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public AddExprContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			_localctx = new AddExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			multiplicativeExpression();
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(470);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(471);
					multiplicativeExpression();
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultExprContext extends MultiplicativeExpressionContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(AngularParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(AngularParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(AngularParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(AngularParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(AngularParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(AngularParser.MOD, i);
		}
		public MultExprContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiplicativeExpression);
		int _la;
		try {
			int _alt;
			_localctx = new MultExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			unaryExpression();
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(479);
					unaryExpression();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends UnaryExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(AngularParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public UnaryExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unaryExpression);
		int _la;
		try {
			_localctx = new UnaryExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==NOT) {
				{
				setState(485);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(488);
			postfixExpression();
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
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExprContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<PostfixPartContext> postfixPart() {
			return getRuleContexts(PostfixPartContext.class);
		}
		public PostfixPartContext postfixPart(int i) {
			return getRuleContext(PostfixPartContext.class,i);
		}
		public PostfixExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_postfixExpression);
		try {
			int _alt;
			_localctx = new PostfixExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			primaryExpression();
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(491);
					postfixPart();
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
	public static class PostfixPartContext extends ParserRuleContext {
		public PostfixPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixPart; }
	 
		public PostfixPartContext() { }
		public void copyFrom(PostfixPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostFixIncrContext extends PostfixPartContext {
		public PostfixIncrementContext postfixIncrement() {
			return getRuleContext(PostfixIncrementContext.class,0);
		}
		public PostFixIncrContext(PostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostFixIncr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostFixIncr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostFixIncr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccContext extends PostfixPartContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public PropertyAccContext(PostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAcc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAcc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends PostfixPartContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallContext(PostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixPartContext postfixPart() throws RecognitionException {
		PostfixPartContext _localctx = new PostfixPartContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_postfixPart);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				functionCall();
				}
				break;
			case DOT:
				_localctx = new PropertyAccContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				propertyAccess();
				}
				break;
			case INCREMENT:
				_localctx = new PostFixIncrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				postfixIncrement();
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
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctCallContext extends FunctionCallContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public FunctCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(LPAREN);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2431948197178917256L) != 0)) {
				{
				setState(503);
				expression();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(504);
					match(COMMA);
					setState(505);
					expression();
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(513);
			match(RPAREN);
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
	public static class PropertyAccessContext extends ParserRuleContext {
		public PropertyAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccess; }
	 
		public PropertyAccessContext() { }
		public void copyFrom(PropertyAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessingContext extends PropertyAccessContext {
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public PropertyAccessingContext(PropertyAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAccessing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAccessing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAccessing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessContext propertyAccess() throws RecognitionException {
		PropertyAccessContext _localctx = new PropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_propertyAccess);
		try {
			_localctx = new PropertyAccessingContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(DOT);
			setState(516);
			match(IDENTIFIER);
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
	public static class PostfixIncrementContext extends ParserRuleContext {
		public PostfixIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixIncrement; }
	 
		public PostfixIncrementContext() { }
		public void copyFrom(PostfixIncrementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixIncContext extends PostfixIncrementContext {
		public TerminalNode INCREMENT() { return getToken(AngularParser.INCREMENT, 0); }
		public PostfixIncContext(PostfixIncrementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostfixInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostfixInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostfixInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixIncrementContext postfixIncrement() throws RecognitionException {
		PostfixIncrementContext _localctx = new PostfixIncrementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_postfixIncrement);
		try {
			_localctx = new PostfixIncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(INCREMENT);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupedExprContext extends PrimaryExpressionContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public GroupedExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGroupedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGroupedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGroupedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExprContext extends PrimaryExpressionContext {
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public NewExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExprContext extends PrimaryExpressionContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ThisExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExprContext extends PrimaryExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends PrimaryExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends PrimaryExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFuncExprContext extends PrimaryExpressionContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArrowFuncExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends PrimaryExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primaryExpression);
		try {
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				literal();
				}
				break;
			case 2:
				_localctx = new ThisExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(THIS);
				}
				break;
			case 3:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new GroupedExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(523);
				match(LPAREN);
				setState(524);
				expression();
				setState(525);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new NewExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(527);
				newExpression();
				}
				break;
			case 6:
				_localctx = new ArrowFuncExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(528);
				arrowFunction();
				}
				break;
			case 7:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(529);
				objectLiteral();
				}
				break;
			case 8:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(530);
				arrayLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends ParserRuleContext {
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
	 
		public NewExpressionContext() { }
		public void copyFrom(NewExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewCallExprContext extends NewExpressionContext {
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public NewCallExprContext(NewExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNewCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNewCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNewCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_newExpression);
		int _la;
		try {
			_localctx = new NewCallExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(NEW);
			setState(534);
			qualifiedName();
			setState(535);
			match(LPAREN);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2431948197178917256L) != 0)) {
				{
				setState(536);
				expression();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(537);
					match(COMMA);
					setState(538);
					expression();
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(546);
			match(RPAREN);
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
	 
		public ArrowFunctionContext() { }
		public void copyFrom(ArrowFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionExprContext extends ArrowFunctionContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowParamsContext arrowParams() {
			return getRuleContext(ArrowParamsContext.class,0);
		}
		public ArrowFunctionExprContext(ArrowFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arrowFunction);
		int _la;
		try {
			_localctx = new ArrowFunctionExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(LPAREN);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(549);
				arrowParams();
				}
			}

			setState(552);
			match(RPAREN);
			setState(553);
			match(ARROW);
			setState(554);
			expression();
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
	public static class ArrowParamsContext extends ParserRuleContext {
		public ArrowParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowParams; }
	 
		public ArrowParamsContext() { }
		public void copyFrom(ArrowParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowParamsListContext extends ArrowParamsContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrowParamsListContext(ArrowParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowParamsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowParamsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowParamsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowParamsContext arrowParams() throws RecognitionException {
		ArrowParamsContext _localctx = new ArrowParamsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrowParams);
		int _la;
		try {
			_localctx = new ArrowParamsListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(IDENTIFIER);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(557);
				match(COMMA);
				setState(558);
				match(IDENTIFIER);
				}
				}
				setState(563);
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
	public static class ObjectLiteralContext extends ParserRuleContext {
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	 
		public ObjectLiteralContext() { }
		public void copyFrom(ObjectLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjLiteralContext extends ObjectLiteralContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjLiteralContext(ObjectLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_objectLiteral);
		int _la;
		try {
			_localctx = new ObjLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(LBRACE);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(565);
				keyValue();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(566);
					match(COMMA);
					setState(567);
					keyValue();
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(575);
			match(RBRACE);
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
	public static class KeyValueContext extends ParserRuleContext {
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
	 
		public KeyValueContext() { }
		public void copyFrom(KeyValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyValuePairContext extends KeyValueContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeyValuePairContext(KeyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKeyValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKeyValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_keyValue);
		try {
			_localctx = new KeyValuePairContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(IDENTIFIER);
			setState(578);
			match(COLON);
			setState(579);
			expression();
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
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(AngularParser.STRING_LITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLiteralContext extends LiteralContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BoolLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends LiteralContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public NumberLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_literal);
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(STRING_LITERAL);
				}
				break;
			case NUMBER:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(NUMBER);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				booleanLiteral();
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
	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	 
		public BooleanLiteralContext() { }
		public void copyFrom(BooleanLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends BooleanLiteralContext {
		public TerminalNode FALSE() { return getToken(AngularParser.FALSE, 0); }
		public FalseLiteralContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends BooleanLiteralContext {
		public TerminalNode TRUE() { return getToken(AngularParser.TRUE, 0); }
		public TrueLiteralContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_booleanLiteral);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(FALSE);
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
	public static class QualifiedNameContext extends ParserRuleContext {
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	 
		public QualifiedNameContext() { }
		public void copyFrom(QualifiedNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameExprContext extends QualifiedNameContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public QualifiedNameExprContext(QualifiedNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterQualifiedNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitQualifiedNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitQualifiedNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_qualifiedName);
		int _la;
		try {
			_localctx = new QualifiedNameExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(IDENTIFIER);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(591);
				match(DOT);
				setState(592);
				match(IDENTIFIER);
				}
				}
				setState(597);
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
	public static class TemplateHtmlContext extends ParserRuleContext {
		public List<TemplateNodeContext> templateNode() {
			return getRuleContexts(TemplateNodeContext.class);
		}
		public TemplateNodeContext templateNode(int i) {
			return getRuleContext(TemplateNodeContext.class,i);
		}
		public TemplateHtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateHtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateHtmlContext templateHtml() throws RecognitionException {
		TemplateHtmlContext _localctx = new TemplateHtmlContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_templateHtml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9217L) != 0)) {
				{
				{
				setState(598);
				templateNode();
				}
				}
				setState(603);
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
	public static class TemplateNodeContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public HtmlTextContext htmlText() {
			return getRuleContext(HtmlTextContext.class,0);
		}
		public TemplateNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateNodeContext templateNode() throws RecognitionException {
		TemplateNodeContext _localctx = new TemplateNodeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_templateNode);
		try {
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				element();
				}
				break;
			case INTERPOLATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				interpolation();
				}
				break;
			case HTML_TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				htmlText();
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
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode HTML_LT() { return getToken(AngularParser.HTML_LT, 0); }
		public List<TerminalNode> HTML_NAME() { return getTokens(AngularParser.HTML_NAME); }
		public TerminalNode HTML_NAME(int i) {
			return getToken(AngularParser.HTML_NAME, i);
		}
		public List<TerminalNode> HTML_GT() { return getTokens(AngularParser.HTML_GT); }
		public TerminalNode HTML_GT(int i) {
			return getToken(AngularParser.HTML_GT, i);
		}
		public TerminalNode HTML_END_LT() { return getToken(AngularParser.HTML_END_LT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TemplateNodeContext> templateNode() {
			return getRuleContexts(TemplateNodeContext.class);
		}
		public TemplateNodeContext templateNode(int i) {
			return getRuleContext(TemplateNodeContext.class,i);
		}
		public TerminalNode HTML_SLASH_GT() { return getToken(AngularParser.HTML_SLASH_GT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_element);
		int _la;
		try {
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				match(HTML_LT);
				setState(610);
				match(HTML_NAME);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 149L) != 0)) {
					{
					{
					setState(611);
					attribute();
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(617);
				match(HTML_GT);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9217L) != 0)) {
					{
					{
					setState(618);
					templateNode();
					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(624);
				match(HTML_END_LT);
				setState(625);
				match(HTML_NAME);
				setState(626);
				match(HTML_GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				match(HTML_LT);
				setState(628);
				match(HTML_NAME);
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 149L) != 0)) {
					{
					{
					setState(629);
					attribute();
					}
					}
					setState(634);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(635);
				match(HTML_SLASH_GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public PlainAttributeContext plainAttribute() {
			return getRuleContext(PlainAttributeContext.class,0);
		}
		public BoundPropertyContext boundProperty() {
			return getRuleContext(BoundPropertyContext.class,0);
		}
		public BoundEventContext boundEvent() {
			return getRuleContext(BoundEventContext.class,0);
		}
		public TwoWayBindingContext twoWayBinding() {
			return getRuleContext(TwoWayBindingContext.class,0);
		}
		public StructuralDirectiveContext structuralDirective() {
			return getRuleContext(StructuralDirectiveContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_attribute);
		try {
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				plainAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				boundProperty();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				boundEvent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(641);
				twoWayBinding();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(642);
				structuralDirective();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PlainAttributeContext extends ParserRuleContext {
		public TerminalNode HTML_NAME() { return getToken(AngularParser.HTML_NAME, 0); }
		public TerminalNode HTML_EQ() { return getToken(AngularParser.HTML_EQ, 0); }
		public TerminalNode TPL_STRING() { return getToken(AngularParser.TPL_STRING, 0); }
		public PlainAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plainAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPlainAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPlainAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPlainAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlainAttributeContext plainAttribute() throws RecognitionException {
		PlainAttributeContext _localctx = new PlainAttributeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_plainAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(HTML_NAME);
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_EQ) {
				{
				setState(646);
				match(HTML_EQ);
				setState(647);
				match(TPL_STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoundPropertyContext extends ParserRuleContext {
		public TerminalNode ATTR_LBRACK() { return getToken(AngularParser.ATTR_LBRACK, 0); }
		public TerminalNode HTML_NAME() { return getToken(AngularParser.HTML_NAME, 0); }
		public TerminalNode ATTR_RBRACK() { return getToken(AngularParser.ATTR_RBRACK, 0); }
		public TerminalNode HTML_EQ() { return getToken(AngularParser.HTML_EQ, 0); }
		public TerminalNode TPL_STRING() { return getToken(AngularParser.TPL_STRING, 0); }
		public BoundPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBoundProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBoundProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBoundProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundPropertyContext boundProperty() throws RecognitionException {
		BoundPropertyContext _localctx = new BoundPropertyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_boundProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(ATTR_LBRACK);
			setState(651);
			match(HTML_NAME);
			setState(652);
			match(ATTR_RBRACK);
			setState(653);
			match(HTML_EQ);
			setState(654);
			match(TPL_STRING);
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
	public static class BoundEventContext extends ParserRuleContext {
		public TerminalNode ATTR_LPAREN() { return getToken(AngularParser.ATTR_LPAREN, 0); }
		public TerminalNode HTML_NAME() { return getToken(AngularParser.HTML_NAME, 0); }
		public TerminalNode ATTR_RPAREN() { return getToken(AngularParser.ATTR_RPAREN, 0); }
		public TerminalNode HTML_EQ() { return getToken(AngularParser.HTML_EQ, 0); }
		public TerminalNode TPL_STRING() { return getToken(AngularParser.TPL_STRING, 0); }
		public BoundEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBoundEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBoundEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBoundEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundEventContext boundEvent() throws RecognitionException {
		BoundEventContext _localctx = new BoundEventContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_boundEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(ATTR_LPAREN);
			setState(657);
			match(HTML_NAME);
			setState(658);
			match(ATTR_RPAREN);
			setState(659);
			match(HTML_EQ);
			setState(660);
			match(TPL_STRING);
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
	public static class TwoWayBindingContext extends ParserRuleContext {
		public TerminalNode ATTR_LBRACK() { return getToken(AngularParser.ATTR_LBRACK, 0); }
		public TerminalNode ATTR_LPAREN() { return getToken(AngularParser.ATTR_LPAREN, 0); }
		public TerminalNode HTML_NAME() { return getToken(AngularParser.HTML_NAME, 0); }
		public TerminalNode ATTR_RPAREN() { return getToken(AngularParser.ATTR_RPAREN, 0); }
		public TerminalNode ATTR_RBRACK() { return getToken(AngularParser.ATTR_RBRACK, 0); }
		public TerminalNode HTML_EQ() { return getToken(AngularParser.HTML_EQ, 0); }
		public TerminalNode TPL_STRING() { return getToken(AngularParser.TPL_STRING, 0); }
		public TwoWayBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWayBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTwoWayBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTwoWayBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTwoWayBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWayBindingContext twoWayBinding() throws RecognitionException {
		TwoWayBindingContext _localctx = new TwoWayBindingContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_twoWayBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(ATTR_LBRACK);
			setState(663);
			match(ATTR_LPAREN);
			setState(664);
			match(HTML_NAME);
			setState(665);
			match(ATTR_RPAREN);
			setState(666);
			match(ATTR_RBRACK);
			setState(667);
			match(HTML_EQ);
			setState(668);
			match(TPL_STRING);
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
	public static class StructuralDirectiveContext extends ParserRuleContext {
		public TerminalNode ATTR_STAR() { return getToken(AngularParser.ATTR_STAR, 0); }
		public TerminalNode HTML_NAME() { return getToken(AngularParser.HTML_NAME, 0); }
		public TerminalNode HTML_EQ() { return getToken(AngularParser.HTML_EQ, 0); }
		public TerminalNode TPL_STRING() { return getToken(AngularParser.TPL_STRING, 0); }
		public StructuralDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuralDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStructuralDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStructuralDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStructuralDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuralDirectiveContext structuralDirective() throws RecognitionException {
		StructuralDirectiveContext _localctx = new StructuralDirectiveContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_structuralDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(ATTR_STAR);
			setState(671);
			match(HTML_NAME);
			setState(672);
			match(HTML_EQ);
			setState(673);
			match(TPL_STRING);
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
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION() { return getToken(AngularParser.INTERPOLATION, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(INTERPOLATION);
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
	public static class HtmlTextContext extends ParserRuleContext {
		public List<TerminalNode> HTML_TEXT() { return getTokens(AngularParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(AngularParser.HTML_TEXT, i);
		}
		public HtmlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTextContext htmlText() throws RecognitionException {
		HtmlTextContext _localctx = new HtmlTextContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_htmlText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(678); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(677);
					match(HTML_TEXT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(680); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssOrTemplateItemContext extends ParserRuleContext {
		public CssRulesContext cssRules() {
			return getRuleContext(CssRulesContext.class,0);
		}
		public TemplateHtmlContext templateHtml() {
			return getRuleContext(TemplateHtmlContext.class,0);
		}
		public CssOrTemplateItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssOrTemplateItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssOrTemplateItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssOrTemplateItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssOrTemplateItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssOrTemplateItemContext cssOrTemplateItem() throws RecognitionException {
		CssOrTemplateItemContext _localctx = new CssOrTemplateItemContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cssOrTemplateItem);
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				cssRules();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				templateHtml();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssRulesContext extends ParserRuleContext {
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public List<CssTextContext> cssText() {
			return getRuleContexts(CssTextContext.class);
		}
		public CssTextContext cssText(int i) {
			return getRuleContext(CssTextContext.class,i);
		}
		public CssRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRulesContext cssRules() throws RecognitionException {
		CssRulesContext _localctx = new CssRulesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cssRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_IDENT || _la==CSS_TEXT) {
				{
				setState(688);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_IDENT:
					{
					setState(686);
					cssRule();
					}
					break;
				case CSS_TEXT:
					{
					setState(687);
					cssText();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(692);
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
	public static class CssRuleContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(AngularParser.CSS_IDENT, 0); }
		public TerminalNode CSS_LBRACE() { return getToken(AngularParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(AngularParser.CSS_RBRACE, 0); }
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(CSS_IDENT);
			setState(694);
			match(CSS_LBRACE);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_IDENT) {
				{
				{
				setState(695);
				cssDeclaration();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			match(CSS_RBRACE);
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
	public static class CssDeclarationContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(AngularParser.CSS_IDENT, 0); }
		public TerminalNode CSS_COLON() { return getToken(AngularParser.CSS_COLON, 0); }
		public TerminalNode CSS_TEXT() { return getToken(AngularParser.CSS_TEXT, 0); }
		public TerminalNode CSS_SEMI() { return getToken(AngularParser.CSS_SEMI, 0); }
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_cssDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(CSS_IDENT);
			setState(704);
			match(CSS_COLON);
			setState(705);
			match(CSS_TEXT);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(706);
				match(CSS_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssTextContext extends ParserRuleContext {
		public TerminalNode CSS_TEXT() { return getToken(AngularParser.CSS_TEXT, 0); }
		public CssTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssTextContext cssText() throws RecognitionException {
		CssTextContext _localctx = new CssTextContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_cssText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(CSS_TEXT);
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
		"\u0004\u0001U\u02c8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0005\u0000\u0094\b\u0000"+
		"\n\u0000\f\u0000\u0097\t\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u009b"+
		"\b\u0000\u000b\u0000\f\u0000\u009c\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a6\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00ac\b\u0002"+
		"\n\u0002\f\u0002\u00af\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00bb\b\u0005\n\u0005\f\u0005\u00be\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00c6\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d2\b\b\n\b\f\b"+
		"\u00d5\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00eb\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00f1\b\n\n\n\f\n\u00f4\t\n\u0003\n\u00f6\b\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0101\b\u000b\u0001\f\u0003\f\u0104\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0005\r\u010d\b\r\n"+
		"\r\f\r\u0110\t\r\u0001\u000e\u0001\u000e\u0003\u000e\u0114\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0119\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u011d\b\u000f\u0001\u000f\u0003\u000f\u0120\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0125\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u012a\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0131\b\u0011\n\u0011"+
		"\f\u0011\u0134\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u013d\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0142\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0148\b\u0015\n\u0015\f\u0015\u014b"+
		"\t\u0015\u0003\u0015\u014d\b\u0015\u0001\u0015\u0003\u0015\u0150\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u015a\b\u0017\n\u0017\f\u0017\u015d"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u016a\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0170\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0174\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u017d\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0188\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u018f\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0193\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u019a\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u019f\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0003\"\u01ac\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u01b4\b#\u0001$\u0001$\u0001$\u0005$\u01b9\b$\n"+
		"$\f$\u01bc\t$\u0001%\u0001%\u0001%\u0005%\u01c1\b%\n%\f%\u01c4\t%\u0001"+
		"&\u0001&\u0001&\u0005&\u01c9\b&\n&\f&\u01cc\t&\u0001\'\u0001\'\u0001\'"+
		"\u0005\'\u01d1\b\'\n\'\f\'\u01d4\t\'\u0001(\u0001(\u0001(\u0005(\u01d9"+
		"\b(\n(\f(\u01dc\t(\u0001)\u0001)\u0001)\u0005)\u01e1\b)\n)\f)\u01e4\t"+
		")\u0001*\u0003*\u01e7\b*\u0001*\u0001*\u0001+\u0001+\u0005+\u01ed\b+\n"+
		"+\f+\u01f0\t+\u0001,\u0001,\u0001,\u0003,\u01f5\b,\u0001-\u0001-\u0001"+
		"-\u0001-\u0005-\u01fb\b-\n-\f-\u01fe\t-\u0003-\u0200\b-\u0001-\u0001-"+
		"\u0001.\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u0214\b0\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00051\u021c\b1\n1\f1\u021f\t1\u00031\u0221"+
		"\b1\u00011\u00011\u00012\u00012\u00032\u0227\b2\u00012\u00012\u00012\u0001"+
		"2\u00013\u00013\u00013\u00053\u0230\b3\n3\f3\u0233\t3\u00014\u00014\u0001"+
		"4\u00014\u00054\u0239\b4\n4\f4\u023c\t4\u00034\u023e\b4\u00014\u00014"+
		"\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00036\u0249\b6\u0001"+
		"7\u00017\u00037\u024d\b7\u00018\u00018\u00018\u00058\u0252\b8\n8\f8\u0255"+
		"\t8\u00019\u00059\u0258\b9\n9\f9\u025b\t9\u0001:\u0001:\u0001:\u0003:"+
		"\u0260\b:\u0001;\u0001;\u0001;\u0005;\u0265\b;\n;\f;\u0268\t;\u0001;\u0001"+
		";\u0005;\u026c\b;\n;\f;\u026f\t;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0005;\u0277\b;\n;\f;\u027a\t;\u0001;\u0003;\u027d\b;\u0001<\u0001<"+
		"\u0001<\u0001<\u0001<\u0003<\u0284\b<\u0001=\u0001=\u0001=\u0003=\u0289"+
		"\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001C\u0004C\u02a7"+
		"\bC\u000bC\fC\u02a8\u0001D\u0001D\u0003D\u02ad\bD\u0001E\u0001E\u0005"+
		"E\u02b1\bE\nE\fE\u02b4\tE\u0001F\u0001F\u0001F\u0005F\u02b9\bF\nF\fF\u02bc"+
		"\tF\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0003G\u02c4\bG\u0001H\u0001"+
		"H\u0001H\u0000\u0000I\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0000\u0005\u0001\u000023\u0001\u0000.1\u0001\u0000)*\u0001\u0000+-\u0002"+
		"\u0000**66\u02e1\u0000\u0095\u0001\u0000\u0000\u0000\u0002\u00a0\u0001"+
		"\u0000\u0000\u0000\u0004\u00a7\u0001\u0000\u0000\u0000\u0006\u00b2\u0001"+
		"\u0000\u0000\u0000\b\u00b4\u0001\u0000\u0000\u0000\n\u00b6\u0001\u0000"+
		"\u0000\u0000\f\u00c1\u0001\u0000\u0000\u0000\u000e\u00c7\u0001\u0000\u0000"+
		"\u0000\u0010\u00cd\u0001\u0000\u0000\u0000\u0012\u00ea\u0001\u0000\u0000"+
		"\u0000\u0014\u00ec\u0001\u0000\u0000\u0000\u0016\u0100\u0001\u0000\u0000"+
		"\u0000\u0018\u0103\u0001\u0000\u0000\u0000\u001a\u010e\u0001\u0000\u0000"+
		"\u0000\u001c\u0113\u0001\u0000\u0000\u0000\u001e\u0115\u0001\u0000\u0000"+
		"\u0000 \u0121\u0001\u0000\u0000\u0000\"\u012d\u0001\u0000\u0000\u0000"+
		"$\u0135\u0001\u0000\u0000\u0000&\u0139\u0001\u0000\u0000\u0000(\u0141"+
		"\u0001\u0000\u0000\u0000*\u0143\u0001\u0000\u0000\u0000,\u0153\u0001\u0000"+
		"\u0000\u0000.\u0157\u0001\u0000\u0000\u00000\u0169\u0001\u0000\u0000\u0000"+
		"2\u016b\u0001\u0000\u0000\u00004\u0177\u0001\u0000\u0000\u00006\u017a"+
		"\u0001\u0000\u0000\u00008\u0180\u0001\u0000\u0000\u0000:\u0189\u0001\u0000"+
		"\u0000\u0000<\u0197\u0001\u0000\u0000\u0000>\u019e\u0001\u0000\u0000\u0000"+
		"@\u01a0\u0001\u0000\u0000\u0000B\u01a6\u0001\u0000\u0000\u0000D\u01a8"+
		"\u0001\u0000\u0000\u0000F\u01ad\u0001\u0000\u0000\u0000H\u01b5\u0001\u0000"+
		"\u0000\u0000J\u01bd\u0001\u0000\u0000\u0000L\u01c5\u0001\u0000\u0000\u0000"+
		"N\u01cd\u0001\u0000\u0000\u0000P\u01d5\u0001\u0000\u0000\u0000R\u01dd"+
		"\u0001\u0000\u0000\u0000T\u01e6\u0001\u0000\u0000\u0000V\u01ea\u0001\u0000"+
		"\u0000\u0000X\u01f4\u0001\u0000\u0000\u0000Z\u01f6\u0001\u0000\u0000\u0000"+
		"\\\u0203\u0001\u0000\u0000\u0000^\u0206\u0001\u0000\u0000\u0000`\u0213"+
		"\u0001\u0000\u0000\u0000b\u0215\u0001\u0000\u0000\u0000d\u0224\u0001\u0000"+
		"\u0000\u0000f\u022c\u0001\u0000\u0000\u0000h\u0234\u0001\u0000\u0000\u0000"+
		"j\u0241\u0001\u0000\u0000\u0000l\u0248\u0001\u0000\u0000\u0000n\u024c"+
		"\u0001\u0000\u0000\u0000p\u024e\u0001\u0000\u0000\u0000r\u0259\u0001\u0000"+
		"\u0000\u0000t\u025f\u0001\u0000\u0000\u0000v\u027c\u0001\u0000\u0000\u0000"+
		"x\u0283\u0001\u0000\u0000\u0000z\u0285\u0001\u0000\u0000\u0000|\u028a"+
		"\u0001\u0000\u0000\u0000~\u0290\u0001\u0000\u0000\u0000\u0080\u0296\u0001"+
		"\u0000\u0000\u0000\u0082\u029e\u0001\u0000\u0000\u0000\u0084\u02a3\u0001"+
		"\u0000\u0000\u0000\u0086\u02a6\u0001\u0000\u0000\u0000\u0088\u02ac\u0001"+
		"\u0000\u0000\u0000\u008a\u02b2\u0001\u0000\u0000\u0000\u008c\u02b5\u0001"+
		"\u0000\u0000\u0000\u008e\u02bf\u0001\u0000\u0000\u0000\u0090\u02c5\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0003\u0002\u0001\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u009a\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009b\u0003"+
		"\n\u0005\u0000\u0099\u009b\u0003\u000e\u0007\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0000"+
		"\u0000\u0001\u009f\u0001\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0001"+
		"\u0000\u0000\u00a1\u00a2\u0003\u0004\u0002\u0000\u00a2\u00a3\u0005\u0002"+
		"\u0000\u0000\u00a3\u00a5\u0003\b\u0004\u0000\u00a4\u00a6\u0005 \u0000"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u0003\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0018\u0000"+
		"\u0000\u00a8\u00ad\u0003\u0006\u0003\u0000\u00a9\u00aa\u0005\u001f\u0000"+
		"\u0000\u00aa\u00ac\u0003\u0006\u0003\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0019\u0000"+
		"\u0000\u00b1\u0005\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005=\u0000\u0000"+
		"\u00b3\u0007\u0001\u0000\u0000\u0000\u00b4\u00b5\u00058\u0000\u0000\u00b5"+
		"\t\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0017\u0000\u0000\u00b7\u00b8"+
		"\u0005=\u0000\u0000\u00b8\u00bc\u0005\u0018\u0000\u0000\u00b9\u00bb\u0003"+
		"\f\u0006\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\u0019\u0000\u0000\u00c0\u000b\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005=\u0000\u0000\u00c2\u00c3\u0005\u001e\u0000"+
		"\u0000\u00c3\u00c5\u0003&\u0013\u0000\u00c4\u00c6\u0005 \u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\r\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0004\u0000\u0000\u00c8\u00c9"+
		"\u0005\u001c\u0000\u0000\u00c9\u00ca\u0003\u0010\b\u0000\u00ca\u00cb\u0005"+
		"\u001d\u0000\u0000\u00cb\u00cc\u0003\u0018\f\u0000\u00cc\u000f\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005\u0018\u0000\u0000\u00ce\u00d3\u0003\u0012"+
		"\t\u0000\u00cf\u00d0\u0005\u001f\u0000\u0000\u00d0\u00d2\u0003\u0012\t"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0005\u0019\u0000\u0000\u00d7\u0011\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\u0005\u0000\u0000\u00d9\u00da\u0005\u001e\u0000"+
		"\u0000\u00da\u00eb\u00058\u0000\u0000\u00db\u00dc\u0005\u0006\u0000\u0000"+
		"\u00dc\u00dd\u0005\u001e\u0000\u0000\u00dd\u00eb\u0003n7\u0000\u00de\u00df"+
		"\u0005\t\u0000\u0000\u00df\u00e0\u0005\u001e\u0000\u0000\u00e0\u00eb\u0003"+
		"\u0014\n\u0000\u00e1\u00e2\u0005\u000b\u0000\u0000\u00e2\u00e3\u0005\u001e"+
		"\u0000\u0000\u00e3\u00e4\u00059\u0000\u0000\u00e4\u00e5\u0003r9\u0000"+
		"\u00e5\u00e6\u0005>\u0000\u0000\u00e6\u00eb\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005\n\u0000\u0000\u00e8\u00e9\u0005\u001e\u0000\u0000\u00e9\u00eb"+
		"\u0003\u0014\n\u0000\u00ea\u00d8\u0001\u0000\u0000\u0000\u00ea\u00db\u0001"+
		"\u0000\u0000\u0000\u00ea\u00de\u0001\u0000\u0000\u0000\u00ea\u00e1\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00eb\u0013\u0001"+
		"\u0000\u0000\u0000\u00ec\u00f5\u0005\u001a\u0000\u0000\u00ed\u00f2\u0003"+
		"\u0016\u000b\u0000\u00ee\u00ef\u0005\u001f\u0000\u0000\u00ef\u00f1\u0003"+
		"\u0016\u000b\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f5\u00ed\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"\u001b\u0000\u0000\u00f8\u0015\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"9\u0000\u0000\u00fa\u00fb\u0003\u0088D\u0000\u00fb\u00fc\u0005>\u0000"+
		"\u0000\u00fc\u0101\u0001\u0000\u0000\u0000\u00fd\u0101\u00058\u0000\u0000"+
		"\u00fe\u0101\u0005=\u0000\u0000\u00ff\u0101\u0003h4\u0000\u0100\u00f9"+
		"\u0001\u0000\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0017"+
		"\u0001\u0000\u0000\u0000\u0102\u0104\u0005\f\u0000\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005\r\u0000\u0000\u0106\u0107\u0005="+
		"\u0000\u0000\u0107\u0108\u0005\u0018\u0000\u0000\u0108\u0109\u0003\u001a"+
		"\r\u0000\u0109\u010a\u0005\u0019\u0000\u0000\u010a\u0019\u0001\u0000\u0000"+
		"\u0000\u010b\u010d\u0003\u001c\u000e\u0000\u010c\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u001b\u0001\u0000\u0000"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0114\u0003\u001e\u000f"+
		"\u0000\u0112\u0114\u0003 \u0010\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u001d\u0001\u0000\u0000\u0000"+
		"\u0115\u0118\u0005=\u0000\u0000\u0116\u0117\u0005\u001e\u0000\u0000\u0117"+
		"\u0119\u0003&\u0013\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005%\u0000\u0000\u011b\u011d\u0003B!\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0001\u0000"+
		"\u0000\u0000\u011e\u0120\u0005 \u0000\u0000\u011f\u011e\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u001f\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0005=\u0000\u0000\u0122\u0124\u0005\u001c\u0000\u0000"+
		"\u0123\u0125\u0003\"\u0011\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u0129\u0005\u001d\u0000\u0000\u0127\u0128\u0005\u001e\u0000\u0000\u0128"+
		"\u012a\u0003&\u0013\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0003.\u0017\u0000\u012c!\u0001\u0000\u0000\u0000\u012d\u0132\u0003$"+
		"\u0012\u0000\u012e\u012f\u0005\u001f\u0000\u0000\u012f\u0131\u0003$\u0012"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0133#\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0005=\u0000\u0000\u0136\u0137\u0005\u001e\u0000\u0000\u0137"+
		"\u0138\u0003&\u0013\u0000\u0138%\u0001\u0000\u0000\u0000\u0139\u013c\u0003"+
		"(\u0014\u0000\u013a\u013b\u0005\u001a\u0000\u0000\u013b\u013d\u0005\u001b"+
		"\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000"+
		"\u0000\u0000\u013d\'\u0001\u0000\u0000\u0000\u013e\u0142\u0005=\u0000"+
		"\u0000\u013f\u0142\u0005\u000f\u0000\u0000\u0140\u0142\u0003*\u0015\u0000"+
		"\u0141\u013e\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0142)\u0001\u0000\u0000\u0000\u0143"+
		"\u014c\u0005\u0018\u0000\u0000\u0144\u0149\u0003,\u0016\u0000\u0145\u0146"+
		"\u0005 \u0000\u0000\u0146\u0148\u0003,\u0016\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u0144\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000"+
		"\u0000\u0000\u014e\u0150\u0005 \u0000\u0000\u014f\u014e\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0005\u0019\u0000\u0000\u0152+\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0005=\u0000\u0000\u0154\u0155\u0005\u001e\u0000\u0000\u0155"+
		"\u0156\u0003&\u0013\u0000\u0156-\u0001\u0000\u0000\u0000\u0157\u015b\u0005"+
		"\u0018\u0000\u0000\u0158\u015a\u00030\u0018\u0000\u0159\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0019"+
		"\u0000\u0000\u015f/\u0001\u0000\u0000\u0000\u0160\u016a\u00032\u0019\u0000"+
		"\u0161\u016a\u00034\u001a\u0000\u0162\u016a\u00036\u001b\u0000\u0163\u016a"+
		"\u00038\u001c\u0000\u0164\u016a\u0003:\u001d\u0000\u0165\u016a\u0003@"+
		" \u0000\u0166\u016a\u0003<\u001e\u0000\u0167\u016a\u0003.\u0017\u0000"+
		"\u0168\u016a\u0005 \u0000\u0000\u0169\u0160\u0001\u0000\u0000\u0000\u0169"+
		"\u0161\u0001\u0000\u0000\u0000\u0169\u0162\u0001\u0000\u0000\u0000\u0169"+
		"\u0163\u0001\u0000\u0000\u0000\u0169\u0164\u0001\u0000\u0000\u0000\u0169"+
		"\u0165\u0001\u0000\u0000\u0000\u0169\u0166\u0001\u0000\u0000\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a"+
		"1\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u0016\u0000\u0000\u016c\u016f"+
		"\u0005=\u0000\u0000\u016d\u016e\u0005\u001e\u0000\u0000\u016e\u0170\u0003"+
		"&\u0013\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u0172\u0005%\u0000"+
		"\u0000\u0172\u0174\u0003B!\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0005 \u0000\u0000\u01763\u0001\u0000\u0000\u0000\u0177\u0178\u0003"+
		"B!\u0000\u0178\u0179\u0005 \u0000\u0000\u01795\u0001\u0000\u0000\u0000"+
		"\u017a\u017c\u0005\u0010\u0000\u0000\u017b\u017d\u0003B!\u0000\u017c\u017b"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0005 \u0000\u0000\u017f7\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0005\u0012\u0000\u0000\u0181\u0182\u0005\u001c"+
		"\u0000\u0000\u0182\u0183\u0003B!\u0000\u0183\u0184\u0005\u001d\u0000\u0000"+
		"\u0184\u0187\u00030\u0018\u0000\u0185\u0186\u0005\u0013\u0000\u0000\u0186"+
		"\u0188\u00030\u0018\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0001\u0000\u0000\u0000\u01889\u0001\u0000\u0000\u0000\u0189\u018a\u0005"+
		"\u0014\u0000\u0000\u018a\u018b\u0005\u001c\u0000\u0000\u018b\u018c\u0003"+
		">\u001f\u0000\u018c\u018e\u0005 \u0000\u0000\u018d\u018f\u0003B!\u0000"+
		"\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0005 \u0000\u0000\u0191"+
		"\u0193\u0003B!\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0005"+
		"\u001d\u0000\u0000\u0195\u0196\u00030\u0018\u0000\u0196;\u0001\u0000\u0000"+
		"\u0000\u0197\u0199\u0005\u0011\u0000\u0000\u0198\u019a\u0005 \u0000\u0000"+
		"\u0199\u0198\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000"+
		"\u019a=\u0001\u0000\u0000\u0000\u019b\u019f\u00032\u0019\u0000\u019c\u019f"+
		"\u0003B!\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019b\u0001\u0000"+
		"\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019d\u0001\u0000"+
		"\u0000\u0000\u019f?\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u0015\u0000"+
		"\u0000\u01a1\u01a2\u0005\u001c\u0000\u0000\u01a2\u01a3\u0003B!\u0000\u01a3"+
		"\u01a4\u0005\u001d\u0000\u0000\u01a4\u01a5\u00030\u0018\u0000\u01a5A\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0003D\"\u0000\u01a7C\u0001\u0000\u0000"+
		"\u0000\u01a8\u01ab\u0003F#\u0000\u01a9\u01aa\u0005%\u0000\u0000\u01aa"+
		"\u01ac\u0003D\"\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01acE\u0001\u0000\u0000\u0000\u01ad\u01b3\u0003"+
		"H$\u0000\u01ae\u01af\u0005(\u0000\u0000\u01af\u01b0\u0003B!\u0000\u01b0"+
		"\u01b1\u0005\u001e\u0000\u0000\u01b1\u01b2\u0003B!\u0000\u01b2\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b3\u01ae\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b4G\u0001\u0000\u0000\u0000\u01b5\u01ba\u0003J%"+
		"\u0000\u01b6\u01b7\u00055\u0000\u0000\u01b7\u01b9\u0003J%\u0000\u01b8"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb"+
		"I\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01c2"+
		"\u0003L&\u0000\u01be\u01bf\u00054\u0000\u0000\u01bf\u01c1\u0003L&\u0000"+
		"\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c3K\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5"+
		"\u01ca\u0003N\'\u0000\u01c6\u01c7\u0007\u0000\u0000\u0000\u01c7\u01c9"+
		"\u0003N\'\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cbM\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cd\u01d2\u0003P(\u0000\u01ce\u01cf\u0007\u0001\u0000\u0000"+
		"\u01cf\u01d1\u0003P(\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3O\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d5\u01da\u0003R)\u0000\u01d6\u01d7\u0007\u0002\u0000"+
		"\u0000\u01d7\u01d9\u0003R)\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9"+
		"\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0001\u0000\u0000\u0000\u01dbQ\u0001\u0000\u0000\u0000\u01dc\u01da"+
		"\u0001\u0000\u0000\u0000\u01dd\u01e2\u0003T*\u0000\u01de\u01df\u0007\u0003"+
		"\u0000\u0000\u01df\u01e1\u0003T*\u0000\u01e0\u01de\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3S\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e7\u0007\u0004\u0000\u0000\u01e6"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003V+\u0000\u01e9U\u0001"+
		"\u0000\u0000\u0000\u01ea\u01ee\u0003`0\u0000\u01eb\u01ed\u0003X,\u0000"+
		"\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01efW\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f5\u0003Z-\u0000\u01f2\u01f5\u0003\\.\u0000\u01f3\u01f5\u0003^/\u0000"+
		"\u01f4\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5Y\u0001\u0000\u0000\u0000\u01f6"+
		"\u01ff\u0005\u001c\u0000\u0000\u01f7\u01fc\u0003B!\u0000\u01f8\u01f9\u0005"+
		"\u001f\u0000\u0000\u01f9\u01fb\u0003B!\u0000\u01fa\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000"+
		"\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u01f7\u0001\u0000\u0000"+
		"\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000"+
		"\u0000\u0201\u0202\u0005\u001d\u0000\u0000\u0202[\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\u0005!\u0000\u0000\u0204\u0205\u0005=\u0000\u0000\u0205]"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0005&\u0000\u0000\u0207_\u0001\u0000"+
		"\u0000\u0000\u0208\u0214\u0003l6\u0000\u0209\u0214\u0005\u000e\u0000\u0000"+
		"\u020a\u0214\u0005=\u0000\u0000\u020b\u020c\u0005\u001c\u0000\u0000\u020c"+
		"\u020d\u0003B!\u0000\u020d\u020e\u0005\u001d\u0000\u0000\u020e\u0214\u0001"+
		"\u0000\u0000\u0000\u020f\u0214\u0003b1\u0000\u0210\u0214\u0003d2\u0000"+
		"\u0211\u0214\u0003h4\u0000\u0212\u0214\u0003\u0014\n\u0000\u0213\u0208"+
		"\u0001\u0000\u0000\u0000\u0213\u0209\u0001\u0000\u0000\u0000\u0213\u020a"+
		"\u0001\u0000\u0000\u0000\u0213\u020b\u0001\u0000\u0000\u0000\u0213\u020f"+
		"\u0001\u0000\u0000\u0000\u0213\u0210\u0001\u0000\u0000\u0000\u0213\u0211"+
		"\u0001\u0000\u0000\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0214a\u0001"+
		"\u0000\u0000\u0000\u0215\u0216\u0005\u0003\u0000\u0000\u0216\u0217\u0003"+
		"p8\u0000\u0217\u0220\u0005\u001c\u0000\u0000\u0218\u021d\u0003B!\u0000"+
		"\u0219\u021a\u0005\u001f\u0000\u0000\u021a\u021c\u0003B!\u0000\u021b\u0219"+
		"\u0001\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b"+
		"\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0221"+
		"\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0218"+
		"\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0005\u001d\u0000\u0000\u0223c\u0001"+
		"\u0000\u0000\u0000\u0224\u0226\u0005\u001c\u0000\u0000\u0225\u0227\u0003"+
		"f3\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000"+
		"\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0005\u001d\u0000"+
		"\u0000\u0229\u022a\u0005\'\u0000\u0000\u022a\u022b\u0003B!\u0000\u022b"+
		"e\u0001\u0000\u0000\u0000\u022c\u0231\u0005=\u0000\u0000\u022d\u022e\u0005"+
		"\u001f\u0000\u0000\u022e\u0230\u0005=\u0000\u0000\u022f\u022d\u0001\u0000"+
		"\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000"+
		"\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232g\u0001\u0000\u0000"+
		"\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u023d\u0005\u0018\u0000"+
		"\u0000\u0235\u023a\u0003j5\u0000\u0236\u0237\u0005\u001f\u0000\u0000\u0237"+
		"\u0239\u0003j5\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023c\u0001"+
		"\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001"+
		"\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c\u023a\u0001"+
		"\u0000\u0000\u0000\u023d\u0235\u0001\u0000\u0000\u0000\u023d\u023e\u0001"+
		"\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0005"+
		"\u0019\u0000\u0000\u0240i\u0001\u0000\u0000\u0000\u0241\u0242\u0005=\u0000"+
		"\u0000\u0242\u0243\u0005\u001e\u0000\u0000\u0243\u0244\u0003B!\u0000\u0244"+
		"k\u0001\u0000\u0000\u0000\u0245\u0249\u00058\u0000\u0000\u0246\u0249\u0005"+
		"7\u0000\u0000\u0247\u0249\u0003n7\u0000\u0248\u0245\u0001\u0000\u0000"+
		"\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000"+
		"\u0000\u0249m\u0001\u0000\u0000\u0000\u024a\u024d\u0005\u0007\u0000\u0000"+
		"\u024b\u024d\u0005\b\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c"+
		"\u024b\u0001\u0000\u0000\u0000\u024do\u0001\u0000\u0000\u0000\u024e\u0253"+
		"\u0005=\u0000\u0000\u024f\u0250\u0005!\u0000\u0000\u0250\u0252\u0005="+
		"\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0255\u0001\u0000"+
		"\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000"+
		"\u0000\u0000\u0254q\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000"+
		"\u0000\u0256\u0258\u0003t:\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0258"+
		"\u025b\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u0259"+
		"\u025a\u0001\u0000\u0000\u0000\u025as\u0001\u0000\u0000\u0000\u025b\u0259"+
		"\u0001\u0000\u0000\u0000\u025c\u0260\u0003v;\u0000\u025d\u0260\u0003\u0084"+
		"B\u0000\u025e\u0260\u0003\u0086C\u0000\u025f\u025c\u0001\u0000\u0000\u0000"+
		"\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000"+
		"\u0260u\u0001\u0000\u0000\u0000\u0261\u0262\u0005@\u0000\u0000\u0262\u0266"+
		"\u0005L\u0000\u0000\u0263\u0265\u0003x<\u0000\u0264\u0263\u0001\u0000"+
		"\u0000\u0000\u0265\u0268\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000"+
		"\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0269\u0001\u0000"+
		"\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0269\u026d\u0005A\u0000"+
		"\u0000\u026a\u026c\u0003t:\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026c"+
		"\u026f\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d"+
		"\u026e\u0001\u0000\u0000\u0000\u026e\u0270\u0001\u0000\u0000\u0000\u026f"+
		"\u026d\u0001\u0000\u0000\u0000\u0270\u0271\u0005?\u0000\u0000\u0271\u0272"+
		"\u0005L\u0000\u0000\u0272\u027d\u0005A\u0000\u0000\u0273\u0274\u0005@"+
		"\u0000\u0000\u0274\u0278\u0005L\u0000\u0000\u0275\u0277\u0003x<\u0000"+
		"\u0276\u0275\u0001\u0000\u0000\u0000\u0277\u027a\u0001\u0000\u0000\u0000"+
		"\u0278\u0276\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000"+
		"\u0279\u027b\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000"+
		"\u027b\u027d\u0005B\u0000\u0000\u027c\u0261\u0001\u0000\u0000\u0000\u027c"+
		"\u0273\u0001\u0000\u0000\u0000\u027dw\u0001\u0000\u0000\u0000\u027e\u0284"+
		"\u0003z=\u0000\u027f\u0284\u0003|>\u0000\u0280\u0284\u0003~?\u0000\u0281"+
		"\u0284\u0003\u0080@\u0000\u0282\u0284\u0003\u0082A\u0000\u0283\u027e\u0001"+
		"\u0000\u0000\u0000\u0283\u027f\u0001\u0000\u0000\u0000\u0283\u0280\u0001"+
		"\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0283\u0282\u0001"+
		"\u0000\u0000\u0000\u0284y\u0001\u0000\u0000\u0000\u0285\u0288\u0005L\u0000"+
		"\u0000\u0286\u0287\u0005D\u0000\u0000\u0287\u0289\u0005K\u0000\u0000\u0288"+
		"\u0286\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289"+
		"{\u0001\u0000\u0000\u0000\u028a\u028b\u0005E\u0000\u0000\u028b\u028c\u0005"+
		"L\u0000\u0000\u028c\u028d\u0005F\u0000\u0000\u028d\u028e\u0005D\u0000"+
		"\u0000\u028e\u028f\u0005K\u0000\u0000\u028f}\u0001\u0000\u0000\u0000\u0290"+
		"\u0291\u0005G\u0000\u0000\u0291\u0292\u0005L\u0000\u0000\u0292\u0293\u0005"+
		"H\u0000\u0000\u0293\u0294\u0005D\u0000\u0000\u0294\u0295\u0005K\u0000"+
		"\u0000\u0295\u007f\u0001\u0000\u0000\u0000\u0296\u0297\u0005E\u0000\u0000"+
		"\u0297\u0298\u0005G\u0000\u0000\u0298\u0299\u0005L\u0000\u0000\u0299\u029a"+
		"\u0005H\u0000\u0000\u029a\u029b\u0005F\u0000\u0000\u029b\u029c\u0005D"+
		"\u0000\u0000\u029c\u029d\u0005K\u0000\u0000\u029d\u0081\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u0005I\u0000\u0000\u029f\u02a0\u0005L\u0000\u0000\u02a0"+
		"\u02a1\u0005D\u0000\u0000\u02a1\u02a2\u0005K\u0000\u0000\u02a2\u0083\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a4\u0005J\u0000\u0000\u02a4\u0085\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a7\u0005M\u0000\u0000\u02a6\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u0087\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ad\u0003\u008aE\u0000\u02ab\u02ad\u0003r9\u0000\u02ac"+
		"\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ad"+
		"\u0089\u0001\u0000\u0000\u0000\u02ae\u02b1\u0003\u008cF\u0000\u02af\u02b1"+
		"\u0003\u0090H\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02af\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u008b\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005"+
		"S\u0000\u0000\u02b6\u02ba\u0005N\u0000\u0000\u02b7\u02b9\u0003\u008eG"+
		"\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000"+
		"\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000"+
		"\u0000\u02bb\u02bd\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u0005O\u0000\u0000\u02be\u008d\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c0\u0005S\u0000\u0000\u02c0\u02c1\u0005P\u0000\u0000\u02c1\u02c3"+
		"\u0005T\u0000\u0000\u02c2\u02c4\u0005Q\u0000\u0000\u02c3\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u008f\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c6\u0005T\u0000\u0000\u02c6\u0091\u0001\u0000\u0000"+
		"\u0000I\u0095\u009a\u009c\u00a5\u00ad\u00bc\u00c5\u00d3\u00ea\u00f2\u00f5"+
		"\u0100\u0103\u010e\u0113\u0118\u011c\u011f\u0124\u0129\u0132\u013c\u0141"+
		"\u0149\u014c\u014f\u015b\u0169\u016f\u0173\u017c\u0187\u018e\u0192\u0199"+
		"\u019e\u01ab\u01b3\u01ba\u01c2\u01ca\u01d2\u01da\u01e2\u01e6\u01ee\u01f4"+
		"\u01fc\u01ff\u0213\u021d\u0220\u0226\u0231\u023a\u023d\u0248\u024c\u0253"+
		"\u0259\u025f\u0266\u026d\u0278\u027c\u0283\u0288\u02a8\u02ac\u02b0\u02b2"+
		"\u02ba\u02c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}