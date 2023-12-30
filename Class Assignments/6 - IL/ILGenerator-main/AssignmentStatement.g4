grammar AssignmentStatement;

start
	returns[value_attr = str(), type_attr = str()]:
	prog NEWLINE* EOF;

prog
	returns[value_attr = str(), type_attr = str()]:
	'program' ID NEWLINE* declaration? NEWLINE+ compoundst;

declaration
	returns[value_attr = str(), type_attr = str()]:
	'var' NEWLINE* (variable_declaration NEWLINE*)+;

variable_declaration
	returns[value_attr = str(), type_attr = str()]: ID ':' type;

type
	returns[value_attr = str(), type_attr = str()]:
	'float'
	| 'int'
	| 'string';

compoundst
	returns[value_attr = str(), type_attr = str()]:
	'begin' NEWLINE* (statement NEWLINE+)+ 'end';

statement
	returns[value_attr = str(), type_attr = str()]:
	ifst
	| assign
	| compoundst
	| whilest
	| switchst
	| forst;

ifst
	returns[value_attr = str(), type_attr = str()]:
	'if' cond 'then' NEWLINE* statement NEWLINE* (
		'else' NEWLINE* statement
	)?;

whilest
	returns[value_attr = str(), type_attr = str()]:
	'while' cond 'do' NEWLINE* statement;

switchst
	returns[value_attr = str(), type_attr = str()]:
	'switch' '(' ID ')' NEWLINE* '{' NEWLINE* case+ '}';

case
	returns[value_attr = str(), type_attr = str()]:
	'case' INT ':' statement NEWLINE*;

forst
	returns[value_attr = str(), type_attr = str()]:
	'for' ID ':=' expr 'to' expr 'do' NEWLINE* statement;

cond
	returns[value_attr = str(), type_attr = str()]:
	expr ('>' | '<' | '==' | '!=' | '<=' | '>=' | '&&' | '||' ) expr;

assign
	returns[value_attr = str(), type_attr = str()]: ID ':=' (expr | ternary);

ternary
    returns[value_attr = str(), type_attr = str()]:
    cond '?' (expr | ternary) ':' (expr | ternary) ;

expr
	returns[value_attr = str(), type_attr = str()]:
	expr '+' term		# expr_term_plus
	| expr '-' term		# expr_term_minus
	| expr RELOP term	# expr_term_relop
	| term				# term4;

term
	returns[value_attr = str(), type_attr = str()]:
	term '*' factor		# term_fact_mutiply
	| term '/' factor	# term_fact_divide
	| factor			# factor3;

factor
	returns[value_attr = str(), type_attr = str()]:
	'(' expr ')'	# fact_expr
	| ID			# fact_id
	| number		# fact_number
	| array			# fact_array;

number
	returns[value_attr = str(), type_attr = str()]:
	FLOAT	# number_float
	| INT	# number_int;

array
	returns[value_attr = str(), type_attr = str()]:
	INT_ARRAY		# array_int
	| FLOAT_ARRAY	# array_float
	| STRING_ARRAY	# array_string;

/* Lexical Rules */
INT: DIGIT+;

FLOAT: DIGIT+ '.' DIGIT* | '.' DIGIT+;

String: '"' (ESC | .)*? '"';

ID: LETTER (LETTER | DIGIT)*;

ARRAY_TYPE: ID '[' INT ']';

INT_ARRAY: '[' INT (',' INT)* ']';

FLOAT_ARRAY: '[' FLOAT (',' FLOAT)* ']';

STRING_ARRAY: '[' String (',' String)* ']';

fragment DIGIT: [0-9];

fragment LETTER: [a-zA-Z];

fragment ESC: '\\"' | '\\\\';

WS: [ \t\r]+ -> skip;

COMMENT: ('//'.*?'\n' | '/*'.*?'*/');

NEWLINE: '\n' | '\r\n' | '\r';

RELOP: '<=' | '<';