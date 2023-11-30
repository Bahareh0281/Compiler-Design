from antlr4 import *
from grammars.JavaLexer import JavaLexer
import os


def add_student_id_to_comments(input_address, student_id):
    file_stream = FileStream(input_address)
    lexer = JavaLexer(file_stream)
    token = lexer.nextToken()
    refactoredSTR = ''

    while token.type != Token.EOF:
        token_text = token.text
        # print("Token text is: ", token_text)
        if token.type == JavaLexer.COMMENT:
            if token_text.startswith("//"):
                # Single-line comment
                # print("Single-line comment")
                refactoredSTR += '// ' + student_id + ' ' + token_text[2:]
            elif token_text.startswith("/*"):
                # Multi-line comment start
                refactoredSTR += '/* ' + student_id + '\n' + token_text[2:]
        else:
            refactoredSTR += token_text

        token = lexer.nextToken()

    return refactoredSTR


input_address = 'input.java'
student_id = '99431217'
refactored_code = add_student_id_to_comments(input_address, student_id)
print(refactored_code)