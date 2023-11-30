from antlr4 import *
from gen.JavaParser import JavaParser
from gen.JavaLexer import JavaLexer
from Listener import VariableListener
def main():
    java_file = "TestFile.java"

    input_stream = FileStream(java_file)
    lexer = JavaLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = JavaParser(token_stream)

    tree = parser.compilationUnit()

    listener = VariableListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

if __name__ == '__main__':
    main()