lexer grammar Keywords;

TYPE_ID   : BOOL_ID | INT_ID | STR_ID ;
fragment BOOL_ID   : 'bool'    ;
fragment INT_ID    : 'int'     ;
fragment STR_ID    : 'string'  ;
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
