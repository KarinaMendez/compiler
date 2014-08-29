lexer grammar DecafScanner;

@lexer::header{
	package compiler.scanner;
}



WHITESPACE 	: 	( '\t' | ' ' | '\r' | '\n')+ -> skip ;
STRING: '"'~('"')*'"';

//OPERATIONS 
PLUS : '+';
MULT : '*';
DIV:   '/';
SUB:   '-';
AND:   '&';
OR:	   '|';
EQ:    '=';
PER:   '%';
MAY:   '>';
MEN:   '<';
MAEQ:  '>=';
MEEQ:  '<=';
EQQ:   '==';
NOEQ:  '!=';
ANDD:   '&&';
ORR:	   '||';
EXP:   '^';

//PALABRAS RESERVADAS
INT: 'int';
BOO: 'boolean';
FLOAT: 'float';
IF: 'if';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';


COMA: ',';
PUNTOYCOMA: ';';
PARENTESIS: '(';
PARENTESIS2: ')';
ENTEROS: ('0'..'9')+;
FLOTANTES: ('0'..'9')+'.'('0'..'9')+;
HEX: '0x'([0-9a-fA-F]+);
CHAR:  '\''.'\'';
BOOLEANS: ('true'|'false');
VARIABLES: [a-zA-Z]([a-zA-Z] | [0-9])*;

