from antlr4 import *
from grammars.JavaLexer import JavaLexer
import os

input_address=input('Enter the f..... address : ')
file_stream=FileStream(input_address)

lexer=JavaLexer(file_stream)
token=lexer.nextToken()
refactoredSTR=''


while token.type!=Token.EOF:
    if(token.type==lexer.LINE_COMMENT):
        refactoredSTR+='/*'+token.text[2:]+'*/'
    else:
        refactoredSTR+=token.text
    token=lexer.nextToken()


print(refactoredSTR+'\n')