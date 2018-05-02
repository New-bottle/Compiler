grammar grammars;
//import Keywords;

BOOL_ID   : 'bool'    ;
INT_ID    : 'int'     ;
STR_ID    : 'string'  ;
VOID_ID   : 'void'    ;
NULL_ID   : 'null'    ;
fragment TRUE_VAL  : 'true'    ;
fragment FALSE_VAL : 'false'   ;
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
comp       : funcDecl                                 # globalFuncDecl
           | varDecl                                  # globalVarDecl
           | classDecl                                # globalClassDecl
           ;
funcDecl   : typeSpecifier ID '(' parameterList? ')' blockStatement;

parameterList : parameter (',' parameter)* ;
parameter : typeSpecifier ID ;

varDecl    : typeSpecifier ID ('=' expr)? ';' ;

classDecl  : CLASS_DEC ID '{' (classStat)* '}' ;
classStat  : varDecl                                  # membervar
           | funcDecl                                 # memberfunc
           | ID '(' parameterList? ')' blockStatement # constructor// constructor
           ;

blockStatement
           : '{' stat* '}';
stat       : blockStatement  # block
           | varDecl         # varstmt
           | ifStat          # if
           | jumpStatement   # jump
           | forStat         # for
           | whileStat       # while
           | expr? ';'       # singleexpr
           ;
// . () []

jumpStatement
           : CONT_ID ';'      # continue
           | BREAK_ID';'      # break
           | RET_ID expr? ';' # return
           ;

nonArrayTypeSpecifier
           : type = INT_ID
           | type = BOOL_ID
           | type = STR_ID
           | type = VOID_ID
           | type = ID
           ;

typeSpecifier
           : typeSpecifier '['']'  # arrayType
           | nonArrayTypeSpecifier # nonArrayType
           ;
/*
symbol       : builtInType | arrayType | userType;
builtInType: BOOL_ID | INT_ID | STR_ID | VOID_ID ;
userType   : ID                                  ;
arrayType  : (builtInType|userType) ('['']')+    ;
*/
ifStat     : IF_ID '('expr')' stat ('else' stat)? ;
forStat    : FOR_ID '(' declinit=varDecl
                        cond=expr? ';'
                        iter=expr? ')'
                        stat
           | FOR_ID '(' init=expr? ';'
                        cond=expr? ';'
                        iter=expr? ')'
                        stat
           ;

// forStat    : FOR_ID '('expr ';' (expr)? ';' expr ')' (stat | block) ;
whileStat  : WHILE_ID '(' expr ')' stat ;

exprList   : expr (',' expr)*?      ;

expr       : expr op=('++'|'--')               # PostfixIncDec
           | ID '(' exprList? ')'              # Call
           | expr '[' expr ']'                 # Index
           | expr '.' ID                       # MemberAccess
           | expr '.' ID'('exprList?')'        # MemberFuncAccess

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
           | constant                          # Literal
           | '(' expr ')'                      # Parens
           ;

creator    : nonArrayTypeSpecifier ('[' expr ']')+ ('['']')+ ('['expr']')+  # creatorError
           | nonArrayTypeSpecifier ('[' expr ']')+ ('['']')*  # creatorArray
           | nonArrayTypeSpecifier                            # creatorNonArray
           ;

constant   : type=IntLiteral
           | type=STRING
           | type=NULL_ID
           | type=BoolLiteral
           ;

BoolLiteral : TRUE_VAL
            | FALSE_VAL
            ;

ID         : ID_LETTER ( ID_LETTER | DIGIT | UDL)* ; // From C language

fragment ID_LETTER : 'a'..'z' | 'A'..'Z';
fragment UDL : '_';

fragment NonZeroDigit: [1-9] ;

IntLiteral  : NonZeroDigit DIGIT*
            | '0'
            ;
fragment DIGIT :  [0-9];          // match single digit

STRING: '"' (ESC|.)*? '"' ;
fragment ESC   : '\\"' | '\\\\' ; // 2-char sequences \" and \\

LINE_COMMENT : '//' .*? '\n' -> skip ;
BlockComment : '/*' .*? '*/' -> skip ;
WS : [ \t\n\r]+ -> skip;
NEWLINE    :  '\r' ? '\n';

MUL    : '*'  ;
DIV    : '/'  ;
ADD    : '+'  ;
SUB    : '-'  ;
MOD    : '%'  ;
XOR    : '^'  ;
AND    : '&'  ;
OR     : '|'  ;
LAND   : '&&' ;
LOR    : '||' ;
NOT    : '!'  ;
BNOT   : '~'  ;
ASSIGN : '='  ;
EQ     : '==' ;
NE     : '!=' ;
LT     : '<'  ;
GT     : '>'  ;
LE     : '<=' ;
GE     : '>=' ;
SHL    : '<<' ;
SHR    : '>>' ;
DADD   : '++' ;
DSUB   : '--' ;


LBracket: '[' ;
RBracket: ']' ;

