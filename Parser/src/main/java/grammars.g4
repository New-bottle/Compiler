grammar grammars;
//import Keywords;

BOOL_ID   : 'bool'    ;
INT_ID    : 'int'     ;
STR_ID    : 'string'  ;
VOID_ID   : 'void'    ;
NULL_ID   : 'null'    ;
TRUE_VAL  : 'true'    ;
FALSE_VAL : 'false'   ;
IF_ID     : 'if'      ;
FOR_ID    : 'for'     ;
WHILE_ID  : 'while'   ;
BREAK_ID  : 'break'   ;
CONT_ID   : 'continue';
RET_ID    : 'return'  ;
NEW_ID    : 'new'     ;
CLASS_DEC : 'class'   ;
THIS_ID   : 'this'    ;

prog       : (comp)+  ;
comp       : funcDecl
           | varDecl
           | classDecl
           ;
funcDecl   : type ID parameterList? block;

parameterList : '(' parameter + ')' ;
parameter : type ID ;

varDecl    : type ID ('=' expr)? ';' ;

classDecl  : CLASS_DEC ID '{' (classStat)* '}';
classStat  : varDecl
           | funcDecl
           | ID '(' parameterList? ')' block // constructor
           ;

block      : '{' stat* '}';
stat       : block
           | varDecl
           | ifStat
           | returnStat
           | forStat
           | whileStat
           | expr ';'
           | NEWLINE
           ;
// . () []

type       : (builtInType | arrayType | userType);
builtInType: BOOL_ID | INT_ID | STR_ID | VOID_ID ;
userType   : ID                                  ;
arrayType  : (builtInType|userType) ('['']')+    ;
ifStat     : IF_ID expr 'then' stat ('else' stat)? ;
returnStat : RET_ID expr ';'       ;
forStat    : FOR_ID '('expr ';' (expr)? ';' expr ')' (stat | block) ;
whileStat  : WHILE_ID '(' expr ')' (stat | block) ;

exprList   : expr (',' expr)*?      ;

expr       : expr op=('++'|'--')               # PostfixIncDec
           | op=('++'|'--') expr               # PrevfixIncDec
           | ID '(' exprList*? ')'             # Call
           | expr '[' expr ']'                 # Index
           | expr '.' ID                       # MemberAccess
           | expr '.' ID'('exprList*?')'       # MemberAccess

           | <assoc=right> op=('++'|'--') expr # UnaryExpr
           | <assoc=right> op=('+' | '-') expr # UnaryExpr
           | <assoc=right> op=('!' | '~') expr # UnaryExpr
           | <assoc=right> 'new' creator       # New

           | expr op=('*'|'/'|'%') expr        # BinaryExpr
           | expr op=('+' | '-') expr          # BinaryExpr
           | expr op=('<<'|'>>') expr          # BinaryExpr
           | expr op=('<' | '>') expr          # BinaryExpr
           | expr op=('<='|'>=') expr          # BinaryExpr
           | expr op=('=='|'!=') expr          # BinaryExpr
           | expr op='&' expr                  # BinaryExpr
           | expr op='^' expr                  # BinaryExpr
           | expr op='|' expr                  # BinaryExpr
           | expr op='&&' expr                 # BinaryExpr
           | expr op='||' expr                 # BinaryExpr

           | <assoc=right> expr op='=' expr    # BinaryExpr

           | ID                                # Var
           | THIS_ID                           # this
           | INT                               # CONST
           | STRING                            # STR
           | '(' expr ')'                      # Parens
           ;

creator    : ID
           | ID '[' expr ']'   // TODO
           | ID ('[' expr ']')+ // TODO Jagged Array
           | ID ('[' expr ']')+ ('['']')* // TODO Jagged Array
           ;

ID         : ID_LETTER ( ID_LETTER | DIGIT | UDL)* ; // From C language

fragment ID_LETTER : 'a'..'z' | 'A'..'Z';
fragment UDL : '_';

INT   : [0-9]+ ;         // match 1 or more digits
fragment DIGIT :  [0-9];          // match single digit

STRING: '"' (ESC|.)*? '"' ;
fragment ESC   : '\\"' | '\\\\' ; // 2-char sequences \" and \\

LINE_COMMENT : '//' .*? '\n' -> skip ;
WS : [ \t\n\r]+ -> skip;
NEWLINE    :  '\r' ? '\n';

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
POW : '^' ;
AND : '&' ;
OR  : '|' ;
LAND: '&&';
LOR : '||';
NOT : '!' ;
LNOT: '~' ;

