from antlr4 import *
from Gen.ArithmeticLexer import ArithmeticLexer
from Gen.ArithmeticParser import ArithmeticParser
from Code.CalculatorListener_v2 import CalculatorListener
from io import StringIO

def main():
    # Example input: "3 + 4"
    input_expression = input("Enter an arithmetic expression: ")

    # Create a lexer that feeds off the input expression
    lexer = ArithmeticLexer(InputStream(input_expression))

    # Create a stream of tokens using the lexer
    token_stream = CommonTokenStream(lexer)

    # Create a parser that feeds off the token stream
    parser = ArithmeticParser(token_stream)

    # Obtain the parse tree by invoking the parser's entry point
    parse_tree = parser.start()#expression()

    # Create a custom listener object
    listener = CalculatorListener ()

    # Walk the parse tree with the custom listener
    walker = ParseTreeWalker()
    walker.walk(listener, parse_tree)

    # Get the result from the Listener
    result = listener.result

    # Output the result
    print("Result:", result)

# Call the main function
if __name__ == '__main__':
    main()