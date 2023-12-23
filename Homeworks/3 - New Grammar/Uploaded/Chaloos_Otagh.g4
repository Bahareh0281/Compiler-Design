grammar Chaloos_Otagh;

// Parser rules
program: statement+;

statement: variableDeclaration
         | assignment
         | ifStatement
         | whileStatement
         | compoundStatement;

assignment: variableDeclaration '=' expression ';'
          | variableName '=' expression ';';

variableDeclaration: variableType variableName;

variableType: 'int' | 'boolean';

variableName: (Letter | Digit | '_') (Letter | Digit | '_')*;

expression: additionExpression | comparisonExpression | booleanValue;

additionExpression: primaryExpression (ADD primaryExpression)*;

comparisonExpression: primaryExpression comparisonOperator primaryExpression;

primaryExpression: '(' expression ')' | variableName | INT;

comparisonOperator: '>' | '==' | '<';

booleanValue: 'true' | 'false';

ifStatement: 'if' '(' booleanCondition ')' compoundStatement;

whileStatement: 'while' '(' booleanCondition ')' compoundStatement;

compoundStatement: '{' statement+ '}';

booleanCondition: '(' expression ')';

// Lexer rules
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';

EQ: '==';
GT: '>';
LT: '<';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMI: ';';
ASSIGN: '=';
BOOL: 'boolean';
INT_TYPE: 'int';
TRUE: 'true';
FALSE: 'false';

INT: [+-]? [0-9]+;

Letter: [a-zA-Z];
Digit: [0-9];

WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;