grammar CANN;
//All my homies hate semester 4.
//They say you can't polish a turd, but check out this grammar:
prog: stmts EOF;

 stmts: (stmt ';')*;

 identifier:  ID # identifierProduction;

 stmt : declaration        #dclStmt
      | assignment         #assStmt
      | expression         #exprStmt
      | control_structure  #ctrlStmt
      | functionCall       #functionCallStmt;

 declaration : variabledeclaration  # varialbeDecl
             | nndeclaration        # nnDecl
             | datadeclaration      # dataDecl
             | vectordeclaration    # vecDecl
             | matrixdeclaration    # mtrxDecl;

//TODO ID
variabledeclaration : declType=SIMPLE_TYPE vardclid=identifier EQUALS vardclval=value #varDclValue // makes node OK
                     |declType=SIMPLE_TYPE vardclid=identifier                        #varDcl;     // makes node OK

 assignment : ident=identifier EQUALS assvalue=value   #assValue; // makes node OK
//TODO ID

 expression : boolean_expr    #boolExpr
            | arithmetic_expr #arithmExpr
            | vector_expr     #vecExpr
            | matrx_val       #matrxExpr
                    ;
boolean_expr : bvalue=BOOL_VALUE                              #boolValue       // makes node OK
             | LEFTPAREN bexpr=boolean_expr RIGHTPAREN        #boolParenExpr
             | NOT LEFTPAREN bexpr=boolean_expr RIGHTPAREN    #boolNegation    // makes node OK
             | arithmetic_expr COMPAREOP arithmetic_expr      #boolComparison  // makes node OK
             | arithmetic_expr '>' arithmetic_expr            #greaterThanComparison
             | expr1=boolean_expr LOGIC_OP expr2=boolean_expr #boolLogic      // makes node OK
             | booleanidenfifier=identifier                   #boolIdentifier;

 arithmetic_expr : numeralvalue=num                         #number                // makes node OK
                 | LEFTPAREN arithmetic_expr RIGHTPAREN     #arithmeticParenExpr   // makes node OK
                 | '-' arithmetic_expr                      #arithmeticUnaryExpr   // makes node OK
                 | arithmetic_expr '*' arithmetic_expr      #arithmeticTimesOpExpr // makes node OK
                 | arithmetic_expr '/' arithmetic_expr      #arithmeticDivOpExpr   // makes node OK
                 | arithmetic_expr '+' arithmetic_expr      #arithmeticPlusOpExpr  // makes node OK
                 | arithmetic_expr '-' arithmetic_expr      #arithmeticMinusOpExpr // makes node OK
                 | arithmeticidentifiervalue=identifier     #arithmeticIdentifier; // makes node OK


 vector_expr : LEFTPAREN vector_expr RIGHTPAREN    #vectorParenExpression          // makes node DONE
             | vector_expr 'hada' vector_expr      #vectorHadaExpression           // makes node DONE
             | vector_expr '+' vector_expr         #vectorPlusExpression           // makes node DONE
             | vector_expr '-' vector_expr         #vectorMinusExpression          // makes node DONE
             | arithex=arithmetic_expr '*' vecex=vector_expr     #vectorMultiplicationExpression // makes node DONE
             | vecex=vector_expr '*' arithex=arithmetic_expr     #vectorMultiplicationExpression // makes node DONE
             | vectorvaluevalue=vector_val         #vectorVal;                     // makes node DONE


vector_val : LEFTBRACKET vecval=arithmetic_expr (COMMA vecval1=arithmetic_expr)* RIGHTBRACKET #vectorValueNumeral// makes node DONE
                 | vectoridentifiervalue=identifier  #vecId ;

nnDimensions : LEFTCURLY dimval=INTEGER_NUMERAL (COMMA dimval1=INTEGER_NUMERAL)* RIGHTCURLY #nnDims; // makes node OK

nndeclaration   : 'neunet' ident=identifier EQUALS nnDim=nnDimensions #nnDcl    // makes node OK
                | 'neunet' ident=identifier EQUALS importFunction #nnDclImport; // makes node OK

                    // makes node CHANGED
datadeclaration : ('loadTrainData'|'loadTestData') LEFTPAREN id1=identifier COMMA id2=identifier RIGHTPAREN  #dataDcl;

                    // both make nodes - DONE
 vectordeclaration   : VEC LEFTBRACKET vecdcltype=type COMMA vecdcldim=arithmetic_expr RIGHTBRACKET vecdclid=identifier EQUALS vecdclval=vector_expr  #vecDclVal
                     | VEC LEFTBRACKET vecdcltype=type COMMA vecdcldim=arithmetic_expr RIGHTBRACKET vecdclid=identifier  #vecDcl;

 matrixdeclaration :MTRX LEFTBRACKET matrixdcltype=type COMMA matrxdcldim1=arithmetic_expr COMMA matrxdcldim2=arithmetic_expr RIGHTBRACKET matrixdclid=identifier EQUALS  matrixdclval=matrx_val #matrixDclVal
                   |MTRX LEFTBRACKET matrixdcltype=type COMMA matrxdcldim1=arithmetic_expr COMMA matrxdcldim2=arithmetic_expr RIGHTBRACKET matrixdclid=identifier #matrixDcl;

matrx_val : LEFTBRACKET firstvec=vector_val (COMMA subseqvec=vector_val)* RIGHTBRACKET #matrixValue; //node done

functionCall  : trainFunction #trainfun
                | testFunction #testfun
                | exportFunction #exfun
                | mathFunctions #mathfun
                ;

trainFunction : 'train' LEFTPAREN nn COMMA epoch COMMA learning_rate  COMMA input COMMA output RIGHTPAREN # trainParams; // makes node DONE

testFunction : 'test' LEFTPAREN nn COMMA input COMMA output RIGHTPAREN #testParams; //makes node DONE

importFunction : 'import' LEFTPAREN RIGHTPAREN #impParams; //makes not DONE

exportFunction : 'export' LEFTPAREN  identifier RIGHTPAREN #exParams; //makes not DONE


nn : identifier;
epoch:  INTEGER_NUMERAL #intepoch
        | identifier    #idepoch
        ;
learning_rate : realnumeral #reallr
                | identifier #idlr
                ;
input : identifier;
output: identifier;

mathFunctions : matrix_function #mathFunctionsMatrix
            | vector_function #mathFunctionsVector;

//TODO REMOVE
matrix_function : 'Dimensions' LEFTPAREN identifier RIGHTPAREN #dimensionFunction //done
                | 'Transpose'   LEFTPAREN identifier RIGHTPAREN #transposeFunction; //done
//TODO REMOVE
vector_function : 'Size' LEFTPAREN  identifier RIGHTPAREN #vecFunction; //done

num : intval=INTEGER_NUMERAL #integerNumber // Makes node OK
    | realval=realnumeral   #realNumber;   // Makes node OK

value //:funccall               #valFuncCall
      :valid=identifier       #valueI       // Makes node... or no?
      |expression             #valueExpr    // Makes node... or no?
      |vecval=vectornumeral   #valueVec     // Makes node... or no?
      |numval=num             #valNum       // Makes node... or no?
      |stringval=STRING_VALUE #valString    // Makes node... or no?
      |boolval=BOOL_VALUE     #valBool      // Makes node... or no?
      |valmeth=mathFunctions  #valMathMeth; // Makes node... or no?
                    // all 3 make nodes OK

control_structure : 'if' LEFTPAREN cond=boolean_expr RIGHTPAREN LEFTCURLY body=stmts RIGHTCURLY #ifCtrl
                  | 'while' LEFTPAREN cond=boolean_expr RIGHTPAREN LEFTCURLY  body=stmts  RIGHTCURLY #whileCtrl
                  | 'loop' LEFTPAREN 'from' from=arithmetic_expr 'to' to=arithmetic_expr RIGHTPAREN LEFTCURLY  body=stmts  RIGHTCURLY #loopCtrl;
type   :  typeval=SIMPLE_TYPE;

// TRY NOT HAVING THIS BE A TOKEN! I suspect this can undo the spooky redundant space error!
vectornumeral: LEFTBRACKET vecval=arithmetic_expr ( COMMA vecval1=arithmetic_expr)* RIGHTBRACKET #vectnum;

IMPORT: 'import';

//Initial implementation
//INTEGER_NUMERAL: [0-9]+;
// [2.3 ]
//Proposed alternative

REAL_NUMERAL: INTEGER_NUMERAL '.' [0-9]+;
realnumeral: REAL_NUMERAL #realnum;

INTEGER_NUMERAL: '0' | [1-9] [0-9]*;


SIMPLE_TYPE:R | N | Z | BOOL;
R: 'real';
Z: 'int';
N: 'nat';
BOOL:'bool';
MTRX   : 'mtrx'; VEC: 'vec';
STRING : 'string';
BOOL_VALUE: 'true' | 'false';
STRING_VALUE: '"' ~( '\n' | '"' )* '"' ;
ID : [a-zA-Z_]+;
LINE_COMMENT: '/ /' ~[ \r\n]* -> skip ;
COMPAREOP: '=='; EQUALS: ':=';
LOGIC_OP: '&&' | '||' ; NOT: '!'; DOT: '.' ;
LEFTBRACKET: '[';       RIGHTBRACKET: ']';
LEFTCURLY: '{';         RIGHTCURLY: '}';
LEFTPAREN: '(';         RIGHTPAREN: ')';
COMMA: ',';
WHITESPACE : [ \t\r\n]+ -> skip ;
//========================UNUSED TOKENS=============================//
LESS_THAN: '<'; LESS_THAN_OR_EQUALS: '<='; GREATER_THAN: '>'; GREATER_THAN_OR_EQUALS: '>='; NOT_EQUALS: '!=';
COLON: ':'; DOUBLECOLON: '::';
ACTIVATION_FUNC: 'relu'   | 'sigmoid' | 'tanh'; // entirely unused
//=========================UNUSED RULES=================================//
/*
//| NEUNET ID EQUALS IMPORT LEFTPAREN STRING_VALUE RIGHTPAREN #nnDclImport;  // makes node
| funccall           #funcCallStmt

| funcdeclaration      # funcDecl

funcdeclaration :'function' funcdclid=ID LEFTPAREN params RIGHTPAREN DOUBLECOLON LEFTPAREN funcdcltype=type RIGHTPAREN LEFTCURLY stmts 'return' funcdclval=value ';' RIGHTCURLY #funcDclReturn
                |'function' funcdclid=ID LEFTPAREN params RIGHTPAREN DOUBLECOLON LEFTCURLY  stmts  RIGHTCURLY #funcDclVoid
                ;

funccall    : ID LEFTPAREN  actualparam actualparams RIGHTPAREN #functionCallParameters
            | ID LEFTPAREN  RIGHTPAREN #functionCallParametereless
            ;

params : type COLON param (COMMA params)* #formalParams
       ;

param : parametervalue=ID #formalParam
       ;
| NEUNET_FUNCTION LEFTPAREN RIGHTPAREN                          #methodCallParameterless

coordinates : COMMA num coordinates #coordinateNumbers;

//old datadcl
//MTRX LEFTBRACKET datadcltype=type COMMA INTEGER_NUMERAL COMMA INTEGER_NUMERAL RIGHTBRACKET datadclid=ID EQUALS 'loadData' LEFTPAREN STRING_VALUE RIGHTPAREN #dataDcl;
// actualparams : (COMMA actualparam actualparams)* #aParams;
// actualparam : actualparamvalue=value #aParam;
*/