grammar TypeChecker;
start:
    expr EOF
    ;

expr returns [type=str()]:
    expr '+' term
    | expr '-' term
    | term
    ;

term returns [type=str()]:
    term '*' fact
    | term '/' fact
    | fact
    ;

fact returns [type=str()]:
     STRING #factString
    |INTEGER #factInteger
    |FLOAT #factFloat
    |'('expr')' #factExpr;

/* Lexical rules*/
Plus: '+';
MINUS: '-';
MUL: '*';
DIVIDE: '/';
ASSIGN: '=';

STRING:'"' .*? '"';
INTEGER: [0-9]+;
FLOAT:[0-9]*'.'[0-9]+;

Whitespace: [ \t]+ -> channel(HIDDEN);
Newline: '\n' -> skip;



