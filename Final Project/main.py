from antlr4 import *
from antlr4.ParserRuleContext import ParserRuleContext
from gen.JavaParser import JavaParser
from gen.JavaLexer import JavaLexer
from Code.MyListener import CustomListener2

def main():
    while True:
        try:
            java_code = input("Please enter a valid path to the file: ")  # Get input repeatedly until valid
            # java_code = FileStream(filePath)
            break
        except FileNotFoundError:
            print("File not found. Please try again.")

    input_stream = InputStream(java_code)
    lexer = JavaLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = JavaParser(token_stream)

    tree = parser.compilationUnit()

    listener = CustomListener2()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

    # structural_complexity = listener.calculate_structural_complexity()
    # software_size = listener.calculate_software_size()
    # ifc = listener.calculate_ifc(len(java_code.splitlines()))

    # print("Structural Complexity: ", structural_complexity)
    # print("Software Size: ", software_size)
    # print("Information Flow Complexity (IFC): ", ifc)

if __name__ == '__main__':
    main()
