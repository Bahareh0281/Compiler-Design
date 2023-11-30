grammar Arithmetic;

start: expr EOF;
//expr: term ((ADD | SUB) term)*;
//term: factor ((MUL | DIV) factor)*;
//factor: NUMBER | LPAREN expr RPAREN;
expr returns[value=float()]: term ((ADD | SUB) term)*;
term returns[value=float()]: factor ((MUL | DIV) factor)*;
factor returns[value=float()]: NUMBER | LPAREN expr RPAREN;

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
LPAREN: '(';
RPAREN: ')';
NUMBER: [0-9]+ | [0-9]*'.'[0-9]+ ;
WS: [ \t\r\n]+ -> skip;