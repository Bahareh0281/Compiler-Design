# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

from antlr4 import *
from Compiler_hw2.TypeCheckerLexer import TypeCheckerLexer
from Compiler_hw2.TypeCheckerParser import TypeCheckerParser
from Compiler_hw2.TypeCheckerListener_v2 import TypeCheckerListener_v2
from io import StringIO

def print_hi(name):
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}')  # Press Ctrl+F8 to toggle the breakpoint.


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    # Example input: "3 + 4"
    input_expression = input("Enter an arithmetic expression: ")

    # Create a lexer that feeds off the input expression
    lexer = TypeCheckerLexer(InputStream(input_expression))

    # Create a stream of tokens using the lexer
    token_stream = CommonTokenStream(lexer)

    # Create a parser that feeds off the token stream
    parser = TypeCheckerParser(token_stream)

    # Obtain the parse tree by invoking the parser's entry point
    parse_tree = parser.start()  # expression()

    # Create a custom listener object
    listener = TypeCheckerListener_v2()

    # Walk the parse tree with the custom listener
    walker = ParseTreeWalker()
    walker.walk(listener, parse_tree)

    # Get the result from the Listener
    result = listener.exitStart

    # Output the result
    # print("Result:",  result)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
