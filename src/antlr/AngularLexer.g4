lexer grammar AngularLexer;

IMPORT      : 'import';
FROM        : 'from';
NEW         : 'new';
COMPONENT   : '@Component';
SELECTOR    : 'selector';
STANDALONE  : 'standalone';
TRUE        : 'true';
FALSE       : 'false';
IMPORTS     : 'imports';
STYLES      : 'styles';
TEMPLATE    : 'template';
EXPORT      : 'export';
CLASS       : 'class';
THIS        : 'this';
ANY         : 'any';
RETURN      : 'return';
BREAK       : 'break';
IF          : 'if';
ELSE        : 'else';
FOR         : 'for';
WHILE       : 'while';
LET         : 'let';
INTERFACE   : 'interface';

LBRACE      : '{';
RBRACE      : '}';
LBRACKET    : '[';
RBRACKET    : ']';
LPAREN      : '(';
RPAREN      : ')';
COLON       : ':';
COMMA       : ',';
SEMI        : ';';
DOT         : '.';
HASH        : '#';
DQUOTE      : '"';
SQUOTE      : '\'';
EQUALS      : '=';
INCREMENT   : '++';
ARROW       : '=>';
QUESTION    : '?';
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';
MOD         : '%';
LT          : '<';
GT          : '>';
LE          : '<=';
GE          : '>=';
EQ          : '==';
NEQ         : '!=';
AND         : '&&';
OR          : '||';
NOT         : '!';

NUMBER         : [0-9]+ ('.' [0-9]+)? ;
STRING_LITERAL : '\'' ( ~'\'' | '\\\'' )* '\'' | '"' ( ~'"' | '\\"' )* '"' ;

BACKTICK_OPEN  : '`' -> pushMode(TEMPLATE_MODE) ;
WS             : [ \t\r\n]+ -> skip ;
COMMENT        : '//' ~[\r\n]* -> skip ;
MULTILINE_COMMENT : '/*' .*? '*/' -> skip ;

IDENTIFIER     : [a-zA-Z_][a-zA-Z0-9_]* ;

// TEMPLATE_MODE: HTML + CSS-like inside backticks
mode TEMPLATE_MODE;

BACKTICK_CLOSE
    : '`' -> popMode
    ;

// HTML tokens
HTML_END_LT   : '</' ;
HTML_LT       : '<' ;
HTML_GT       : '>' ;
HTML_SLASH_GT : '/>' ;
HTML_SLASH    : '/' ;
HTML_EQ       : '=' ;

// attribute/binding delimiters
ATTR_LBRACK   : '[' ;
ATTR_RBRACK   : ']' ;
ATTR_LPAREN   : '(' ;
ATTR_RPAREN   : ')' ;
ATTR_STAR     : '*' ;

// interpolation token contains entire {{ ... }} (parser treats as token)
INTERPOLATION
    : '{{' ( options {greedy=false;} : . )*? '}}'
    ;

// quoted attribute value fragments inside template
TPL_STRING
    : '"' ( options {greedy=false;} : . )*? '"'
    | '\'' ( options {greedy=false;} : . )*? '\''
    ;

// HTML names and text
HTML_NAME
    : [a-zA-Z_:][a-zA-Z0-9_:\-]*
    ;

HTML_TEXT
    : ( ~[<`{] )+
    ;

// CSS-like tokens (for styles/backtick items). CSS_TEXT excludes '<' and '>' to avoid swallowing HTML.
CSS_LBRACE   : '{' ;
CSS_RBRACE   : '}' ;
CSS_COLON    : ':' ;
CSS_SEMI     : ';' ;
CSS_COMMA    : ',' ;
CSS_IDENT    : [a-zA-Z_][a-zA-Z0-9_\-]* ;
CSS_TEXT     : ( ~[`{}:;<>] )+ ;

// fallback
TPL_OTHER
    : .
    ;
