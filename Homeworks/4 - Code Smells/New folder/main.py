from antlr4 import *
from gen.JavaParser import JavaParser
from gen.JavaLexer import JavaLexer
from Code.MyListener import CycleDetectorListener

def main():
    while True:
        try:
            filePath = input("Please enter a valid path to the file: ")  # Get input repeatedly until valid
            inputCode = FileStream(filePath)
            break
        except FileNotFoundError:
            print("File not found. Please try again.")

    lexer = JavaLexer(inputCode)
    tokenStream = CommonTokenStream(lexer)
    parser = JavaParser(tokenStream)
    treeParsed = parser.compilationUnit()
    javaListener = CycleDetectorListener()

    walker = ParseTreeWalker()
    walker.walk(javaListener, treeParsed)
    cycles = javaListener.findCycles()

    print(f"Number of cycles found: {len(cycles)}")
    i = 1
    while i <= len(cycles):  # Use while for printing cycles
        print(f"Cycle {i}: {' -> '.join(cycles[i - 1])}")
        i += 1

if __name__ == '__main__':
    main()
