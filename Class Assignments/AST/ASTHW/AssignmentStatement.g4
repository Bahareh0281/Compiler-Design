grammar AssignmentStatement;

start returns [value_attr = str(), type_attr = str()]: prog EOF ;

prog returns [value_attr = str(), type_attr = str()]:  compoundst (NEWLINE | EOF)| statement (NEWLINE | EOF) ;

statement  returns [value_attr = str(), type_attr = str()]: ifst | assign | compoundst ;

ifst  returns [value_attr = str(), type_attr = str()]: 'if' cond 'then' statement ('else' statement)? ;

cond  returns [value_attr = str(), type_attr = str()]: expr '>' expr ;

assign returns [value_attr = str(), type_attr = str()]: ID ':=' expr ;

compoundst  returns [value_attr = str(), type_attr = str()]: 'begin' NEWLINE (statement NEWLINE)+ 'end' ;

expr returns [value_attr = str(), type_attr = str()]:
    expr '+' term        #expr_term_plus
    | expr '-' term      #expr_term_minus
    | expr RELOP term    #expr_term_relop
    | term               #term4
    ;

term returns [value_attr = str(), type_attr = str()]:
    term '*' factor      #term_fact_mutiply
    | term '/' factor    #term_fact_divide
    | factor             #factor3
    ;

factor returns [value_attr = str(), type_attr = str()]:
    '(' expr ')'      #fact_expr
    | ID              #fact_id
    | number          #fact_number
    | array           #fact_array
    ;

number returns [value_attr = str(), type_attr = str()]:
    FLOAT             #number_float
    | INT             #number_int
    ;

array returns [value_attr = str(), type_attr = str()]:
    INT_ARRAY        #array_int
    | FLOAT_ARRAY    #array_float
    | STRING_ARRAY   #array_string
    ;


/* Lexical Rules */
INT     : DIGIT+ ;

FLOAT:
    DIGIT+ '.' DIGIT*
    | '.' DIGIT+ ;

String:
        '"' (ESC|.)*? '"' ;
ID:
    LETTER(LETTER|DIGIT)* ;

ARRAY_TYPE:
    ID '[' INT ']';

INT_ARRAY:
    '[' INT (',' INT)* ']';

FLOAT_ARRAY:
    '[' FLOAT (',' FLOAT)* ']';

STRING_ARRAY:
    '[' String (',' String)* ']';


fragment
        DIGIT: [0-9] ;
fragment
        LETTER: [a-zA-Z] ;
fragment
        ESC: '\\"' | '\\\\' ;


WS: [ \t\r]+ -> skip ;
NEWLINE: '\n';
RELOP: '<=' | '<' ;