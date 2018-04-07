grammar grammars;

prog       : (stat)+                  ;
stat       : varDecl | forStat | whileStat | funcDecl | expr ';' | returnStat | NEWLINE        ;
stats      : '{' (stat)* '}';
// . () []

ifStat     : IF_ID                 ;
returnStat : RET_ID expr ';'       ;
forStat    : FOR_ID '('expr ';' expr ';' expr')' (stat | stats) ;
whileStat  : WHILE_ID '(' expr ')' (stat | stats) ;

varDecl    : TYPE_ID ID+ ';'       ;
funcDecl   : (TYPE_ID|VOID_ID) ID '('(TYPE_ID ID)*?')' stats ;
exprList   : expr (',' expr)+      ;

expr       : expr op=('++'|'--')   # PostfixIncDec
           | ID '(' exprList*? ')' # Call
           | expr '[' expr ']'     # Index
           | expr '.' ID           # MemberAccess

           | <assoc=right> op=('++'|'--') expr # UnaryExpr
           | <assoc=right> op=('+' | '-') expr # UnaryExpr
           | <assoc=right> op=('!' | '~') expr # UnaryExpr
//         | <assoc=right> 'new' creator       # New

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
           | CONST                             # CONST
           | '(' expr ')'                      # Parens
           ;

TYPE_ID   : BOOL_ID | INT_ID | STR_ID ;
BOOL_ID   : 'bool'    ;
INT_ID    : 'int'     ;
STR_ID    : 'string'  ;
NULL_ID   : 'null'    ;
VOID_ID   : 'void'    ;
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

ID    : ID_LETTER ( ID_LETTER | DIGIT | UDL)* ; // From C language
CONST : INT | FLOAT;

fragment ID_LETTER : 'a'..'z' | 'A'..'Z';
fragment UDL : '_';

INT   : [0-9]+ ;         // match 1 or more digits
FLOAT : DIGIT+'.' DIGIT* // match 1.  39.  3.14159 etc...
      |       '.' DIGIT+ // match .1  .14159
      ;
fragment DIGIT :  [0-9];          // match single digit

STRING: '"' (ESC|.)*? '"' ;
fragment ESC   : '\\"' | '\\\\' ; // 2-char sequences \" and \\

LINE_COMMENT : '//' .*? '\n' -> skip ;
WS : [ \t\n\r]+ -> skip;
NEWLINE    :  '\r' ? '\n';

