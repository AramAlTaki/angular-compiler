lexer grammar AngularLexer;

IMPORT      : 'import';
FROM        : 'from';
NEW         : 'new';
COMPONENT   : '@Component';
SELECTOR    : 'selector';
STANDALONE  : 'standalone';
INTERFACE   : 'interface';
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

NUMBER            : [0-9]+ ('.' [0-9]+)? ;
STRING_LITERAL    : '\'' ( ~'\'' | '\\\'' )* '\'' | '"' ( ~'"' | '\\"' )* '"' ;

BACKTICK_OPEN     : '`' -> pushMode(TEMPLATE_MODE) ;
WS                : [ \t\r\n]+ -> skip ;
COMMENT           : '//' ~[\r\n]* -> skip ;
MULTILINE_COMMENT : '/*' .*? '*/' -> skip ;

IDENTIFIER        : [a-zA-Z_][a-zA-Z0-9_]* ;

mode TEMPLATE_MODE;

TEMPLATE_BACKTICK_CLOSE : '`' -> popMode ;

HTML_LT            : '<' ;
HTML_END_LT        : '</' ;
HTML_GT            : '>' ;
HTML_SLASH_GT      : '/>' ;
HTML_SLASH         : '/' ;
HTML_EQ            : '=' ;

ATTR_LBRACK        : '[' ;
ATTR_RBRACK        : ']' ;
ATTR_LPAREN        : '(' ;
ATTR_RPAREN        : ')' ;
ATTR_STAR          : '*' ;

INTERPOLATION
    :  '{{' ( options {greedy=false;} : . )*? '}}'
    ;

TPL_STRING
    : '"' ( options {greedy=false;} : . )*? '"'
    | '\'' ( options {greedy=false;} : . )*? '\''
    ;

HTML_NAME
    : [a-zA-Z_:][a-zA-Z0-9_:\-]*
    ;

HTML_TEXT
    : ( ~[<`{}] )+
    ;

CSS_LBRACE   : '{' ;
CSS_RBRACE   : '}' ;
CSS_COLON    : ':' ;
CSS_SEMI     : ';' ;
CSS_COMMA    : ',' ;

CSS_IDENT
    : [a-zA-Z_][a-zA-Z0-9_\-]*
    ;

CSS_TEXT
    : ( ~[`{}:;] )+
    ;

TPL_OTHER
    : .
    ;
