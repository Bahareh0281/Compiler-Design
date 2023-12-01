# Generated from D:/Bahareh/7/Files/Compiler/Git/Compiler-Design/Class Assignments/5 - AST/ASTListener/ASTListener/AssignmentStatement.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,35,237,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,1,0,1,0,5,0,39,8,0,10,0,
        12,0,42,9,0,1,0,1,0,1,1,1,1,1,1,5,1,49,8,1,10,1,12,1,52,9,1,1,1,
        3,1,55,8,1,1,1,4,1,58,8,1,11,1,12,1,59,1,1,1,1,1,2,1,2,5,2,66,8,
        2,10,2,12,2,69,9,2,1,2,1,2,5,2,73,8,2,10,2,12,2,76,9,2,4,2,78,8,
        2,11,2,12,2,79,1,3,1,3,1,3,1,3,1,4,1,4,1,5,1,5,5,5,90,8,5,10,5,12,
        5,93,9,5,1,5,1,5,4,5,97,8,5,11,5,12,5,98,4,5,101,8,5,11,5,12,5,102,
        1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,3,6,113,8,6,1,7,1,7,1,7,1,7,5,7,
        119,8,7,10,7,12,7,122,9,7,1,7,1,7,5,7,126,8,7,10,7,12,7,129,9,7,
        1,7,1,7,5,7,133,8,7,10,7,12,7,136,9,7,1,7,3,7,139,8,7,1,8,1,8,1,
        8,1,8,1,8,1,8,1,8,1,8,1,8,5,8,150,8,8,10,8,12,8,153,9,8,1,8,1,8,
        1,9,1,9,1,9,5,9,160,8,9,10,9,12,9,163,9,9,1,9,1,9,1,10,1,10,1,10,
        1,10,1,10,1,10,5,10,173,8,10,10,10,12,10,176,9,10,1,10,1,10,1,11,
        1,11,1,11,1,11,1,12,1,12,1,12,1,12,1,13,1,13,1,13,1,13,1,13,1,13,
        1,13,1,13,1,13,1,13,1,13,1,13,5,13,200,8,13,10,13,12,13,203,9,13,
        1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,5,14,214,8,14,10,14,
        12,14,217,9,14,1,15,1,15,1,15,1,15,1,15,1,15,1,15,3,15,226,8,15,
        1,16,1,16,3,16,230,8,16,1,17,1,17,1,17,3,17,235,8,17,1,17,0,2,26,
        28,18,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,0,2,1,0,4,
        6,2,0,24,25,35,35,251,0,36,1,0,0,0,2,45,1,0,0,0,4,63,1,0,0,0,6,81,
        1,0,0,0,8,85,1,0,0,0,10,87,1,0,0,0,12,112,1,0,0,0,14,114,1,0,0,0,
        16,140,1,0,0,0,18,156,1,0,0,0,20,166,1,0,0,0,22,179,1,0,0,0,24,183,
        1,0,0,0,26,187,1,0,0,0,28,204,1,0,0,0,30,225,1,0,0,0,32,229,1,0,
        0,0,34,234,1,0,0,0,36,40,3,2,1,0,37,39,5,33,0,0,38,37,1,0,0,0,39,
        42,1,0,0,0,40,38,1,0,0,0,40,41,1,0,0,0,41,43,1,0,0,0,42,40,1,0,0,
        0,43,44,5,0,0,1,44,1,1,0,0,0,45,46,5,1,0,0,46,50,5,27,0,0,47,49,
        5,33,0,0,48,47,1,0,0,0,49,52,1,0,0,0,50,48,1,0,0,0,50,51,1,0,0,0,
        51,54,1,0,0,0,52,50,1,0,0,0,53,55,3,4,2,0,54,53,1,0,0,0,54,55,1,
        0,0,0,55,57,1,0,0,0,56,58,5,33,0,0,57,56,1,0,0,0,58,59,1,0,0,0,59,
        57,1,0,0,0,59,60,1,0,0,0,60,61,1,0,0,0,61,62,3,10,5,0,62,3,1,0,0,
        0,63,67,5,2,0,0,64,66,5,33,0,0,65,64,1,0,0,0,66,69,1,0,0,0,67,65,
        1,0,0,0,67,68,1,0,0,0,68,77,1,0,0,0,69,67,1,0,0,0,70,74,3,6,3,0,
        71,73,5,33,0,0,72,71,1,0,0,0,73,76,1,0,0,0,74,72,1,0,0,0,74,75,1,
        0,0,0,75,78,1,0,0,0,76,74,1,0,0,0,77,70,1,0,0,0,78,79,1,0,0,0,79,
        77,1,0,0,0,79,80,1,0,0,0,80,5,1,0,0,0,81,82,5,27,0,0,82,83,5,3,0,
        0,83,84,3,8,4,0,84,7,1,0,0,0,85,86,7,0,0,0,86,9,1,0,0,0,87,91,5,
        7,0,0,88,90,5,33,0,0,89,88,1,0,0,0,90,93,1,0,0,0,91,89,1,0,0,0,91,
        92,1,0,0,0,92,100,1,0,0,0,93,91,1,0,0,0,94,96,3,12,6,0,95,97,5,33,
        0,0,96,95,1,0,0,0,97,98,1,0,0,0,98,96,1,0,0,0,98,99,1,0,0,0,99,101,
        1,0,0,0,100,94,1,0,0,0,101,102,1,0,0,0,102,100,1,0,0,0,102,103,1,
        0,0,0,103,104,1,0,0,0,104,105,5,8,0,0,105,11,1,0,0,0,106,113,3,14,
        7,0,107,113,3,24,12,0,108,113,3,10,5,0,109,113,3,16,8,0,110,113,
        3,18,9,0,111,113,3,20,10,0,112,106,1,0,0,0,112,107,1,0,0,0,112,108,
        1,0,0,0,112,109,1,0,0,0,112,110,1,0,0,0,112,111,1,0,0,0,113,13,1,
        0,0,0,114,115,5,9,0,0,115,116,3,22,11,0,116,120,5,10,0,0,117,119,
        5,33,0,0,118,117,1,0,0,0,119,122,1,0,0,0,120,118,1,0,0,0,120,121,
        1,0,0,0,121,123,1,0,0,0,122,120,1,0,0,0,123,127,3,12,6,0,124,126,
        5,33,0,0,125,124,1,0,0,0,126,129,1,0,0,0,127,125,1,0,0,0,127,128,
        1,0,0,0,128,138,1,0,0,0,129,127,1,0,0,0,130,134,5,11,0,0,131,133,
        5,33,0,0,132,131,1,0,0,0,133,136,1,0,0,0,134,132,1,0,0,0,134,135,
        1,0,0,0,135,137,1,0,0,0,136,134,1,0,0,0,137,139,3,12,6,0,138,130,
        1,0,0,0,138,139,1,0,0,0,139,15,1,0,0,0,140,141,5,12,0,0,141,142,
        5,13,0,0,142,143,3,24,12,0,143,144,5,14,0,0,144,145,3,22,11,0,145,
        146,5,14,0,0,146,147,3,24,12,0,147,151,5,15,0,0,148,150,5,33,0,0,
        149,148,1,0,0,0,150,153,1,0,0,0,151,149,1,0,0,0,151,152,1,0,0,0,
        152,154,1,0,0,0,153,151,1,0,0,0,154,155,3,12,6,0,155,17,1,0,0,0,
        156,157,5,16,0,0,157,161,3,22,11,0,158,160,5,33,0,0,159,158,1,0,
        0,0,160,163,1,0,0,0,161,159,1,0,0,0,161,162,1,0,0,0,162,164,1,0,
        0,0,163,161,1,0,0,0,164,165,3,12,6,0,165,19,1,0,0,0,166,167,5,17,
        0,0,167,168,5,27,0,0,168,169,5,18,0,0,169,170,7,1,0,0,170,174,5,
        3,0,0,171,173,5,33,0,0,172,171,1,0,0,0,173,176,1,0,0,0,174,172,1,
        0,0,0,174,175,1,0,0,0,175,177,1,0,0,0,176,174,1,0,0,0,177,178,3,
        12,6,0,178,21,1,0,0,0,179,180,3,26,13,0,180,181,5,34,0,0,181,182,
        3,26,13,0,182,23,1,0,0,0,183,184,5,27,0,0,184,185,5,19,0,0,185,186,
        3,26,13,0,186,25,1,0,0,0,187,188,6,13,-1,0,188,189,3,28,14,0,189,
        201,1,0,0,0,190,191,10,4,0,0,191,192,5,20,0,0,192,200,3,28,14,0,
        193,194,10,3,0,0,194,195,5,21,0,0,195,200,3,28,14,0,196,197,10,2,
        0,0,197,198,5,34,0,0,198,200,3,28,14,0,199,190,1,0,0,0,199,193,1,
        0,0,0,199,196,1,0,0,0,200,203,1,0,0,0,201,199,1,0,0,0,201,202,1,
        0,0,0,202,27,1,0,0,0,203,201,1,0,0,0,204,205,6,14,-1,0,205,206,3,
        30,15,0,206,215,1,0,0,0,207,208,10,3,0,0,208,209,5,22,0,0,209,214,
        3,30,15,0,210,211,10,2,0,0,211,212,5,23,0,0,212,214,3,30,15,0,213,
        207,1,0,0,0,213,210,1,0,0,0,214,217,1,0,0,0,215,213,1,0,0,0,215,
        216,1,0,0,0,216,29,1,0,0,0,217,215,1,0,0,0,218,219,5,13,0,0,219,
        220,3,26,13,0,220,221,5,15,0,0,221,226,1,0,0,0,222,226,5,27,0,0,
        223,226,3,32,16,0,224,226,3,34,17,0,225,218,1,0,0,0,225,222,1,0,
        0,0,225,223,1,0,0,0,225,224,1,0,0,0,226,31,1,0,0,0,227,230,5,25,
        0,0,228,230,5,24,0,0,229,227,1,0,0,0,229,228,1,0,0,0,230,33,1,0,
        0,0,231,235,5,29,0,0,232,235,5,30,0,0,233,235,5,31,0,0,234,231,1,
        0,0,0,234,232,1,0,0,0,234,233,1,0,0,0,235,35,1,0,0,0,25,40,50,54,
        59,67,74,79,91,98,102,112,120,127,134,138,151,161,174,199,201,213,
        215,225,229,234
    ]

class AssignmentStatementParser ( Parser ):

    grammarFileName = "AssignmentStatement.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'program'", "'var'", "':'", "'float'", 
                     "'int'", "'string'", "'begin'", "'end'", "'if'", "'then'", 
                     "'else'", "'for'", "'('", "';'", "')'", "'while'", 
                     "'switch'", "'case'", "':='", "'+'", "'-'", "'*'", 
                     "'/'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "INT", "FLOAT", "String", "ID", "ARRAY_TYPE", "INT_ARRAY", 
                      "FLOAT_ARRAY", "STRING_ARRAY", "WS", "NEWLINE", "RELOP", 
                      "STRING" ]

    RULE_start = 0
    RULE_prog = 1
    RULE_declaration = 2
    RULE_variable_declaration = 3
    RULE_type = 4
    RULE_compoundst = 5
    RULE_statement = 6
    RULE_ifst = 7
    RULE_forst = 8
    RULE_whilest = 9
    RULE_switchcase = 10
    RULE_cond = 11
    RULE_assign = 12
    RULE_expr = 13
    RULE_term = 14
    RULE_factor = 15
    RULE_number = 16
    RULE_array = 17

    ruleNames =  [ "start", "prog", "declaration", "variable_declaration", 
                   "type", "compoundst", "statement", "ifst", "forst", "whilest", 
                   "switchcase", "cond", "assign", "expr", "term", "factor", 
                   "number", "array" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    INT=24
    FLOAT=25
    String=26
    ID=27
    ARRAY_TYPE=28
    INT_ARRAY=29
    FLOAT_ARRAY=30
    STRING_ARRAY=31
    WS=32
    NEWLINE=33
    RELOP=34
    STRING=35

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def prog(self):
            return self.getTypedRuleContext(AssignmentStatementParser.ProgContext,0)


        def EOF(self):
            return self.getToken(AssignmentStatementParser.EOF, 0)

        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(AssignmentStatementParser.NEWLINE)
            else:
                return self.getToken(AssignmentStatementParser.NEWLINE, i)

        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStart" ):
                return visitor.visitStart(self)
            else:
                return visitor.visitChildren(self)




    def start(self):

        localctx = AssignmentStatementParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self.prog()
            self.state = 40
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 37
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 42
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 43
            self.match(AssignmentStatementParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def ID(self):
            return self.getToken(AssignmentStatementParser.ID, 0)

        def compoundst(self):
            return self.getTypedRuleContext(AssignmentStatementParser.CompoundstContext,0)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(AssignmentStatementParser.NEWLINE)
            else:
                return self.getToken(AssignmentStatementParser.NEWLINE, i)

        def declaration(self):
            return self.getTypedRuleContext(AssignmentStatementParser.DeclarationContext,0)


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProg" ):
                return visitor.visitProg(self)
            else:
                return visitor.visitChildren(self)




    def prog(self):

        localctx = AssignmentStatementParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 45
            self.match(AssignmentStatementParser.T__0)
            self.state = 46
            self.match(AssignmentStatementParser.ID)
            self.state = 50
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,1,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 47
                    self.match(AssignmentStatementParser.NEWLINE) 
                self.state = 52
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,1,self._ctx)

            self.state = 54
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==2:
                self.state = 53
                self.declaration()


            self.state = 57 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 56
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 59 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==33):
                    break

            self.state = 61
            self.compoundst()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(AssignmentStatementParser.NEWLINE)
            else:
                return self.getToken(AssignmentStatementParser.NEWLINE, i)

        def variable_declaration(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AssignmentStatementParser.Variable_declarationContext)
            else:
                return self.getTypedRuleContext(AssignmentStatementParser.Variable_declarationContext,i)


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_declaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeclaration" ):
                listener.enterDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeclaration" ):
                listener.exitDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaration" ):
                return visitor.visitDeclaration(self)
            else:
                return visitor.visitChildren(self)




    def declaration(self):

        localctx = AssignmentStatementParser.DeclarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_declaration)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(AssignmentStatementParser.T__1)
            self.state = 67
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 64
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 69
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 77 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 70
                self.variable_declaration()
                self.state = 74
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,5,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 71
                        self.match(AssignmentStatementParser.NEWLINE) 
                    self.state = 76
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,5,self._ctx)

                self.state = 79 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==27):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Variable_declarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def ID(self):
            return self.getToken(AssignmentStatementParser.ID, 0)

        def type_(self):
            return self.getTypedRuleContext(AssignmentStatementParser.TypeContext,0)


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_variable_declaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable_declaration" ):
                listener.enterVariable_declaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable_declaration" ):
                listener.exitVariable_declaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariable_declaration" ):
                return visitor.visitVariable_declaration(self)
            else:
                return visitor.visitChildren(self)




    def variable_declaration(self):

        localctx = AssignmentStatementParser.Variable_declarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_variable_declaration)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            self.match(AssignmentStatementParser.ID)
            self.state = 82
            self.match(AssignmentStatementParser.T__2)
            self.state = 83
            self.type_()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType" ):
                listener.enterType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType" ):
                listener.exitType(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitType" ):
                return visitor.visitType(self)
            else:
                return visitor.visitChildren(self)




    def type_(self):

        localctx = AssignmentStatementParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 85
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 112) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CompoundstContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(AssignmentStatementParser.NEWLINE)
            else:
                return self.getToken(AssignmentStatementParser.NEWLINE, i)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AssignmentStatementParser.StatementContext)
            else:
                return self.getTypedRuleContext(AssignmentStatementParser.StatementContext,i)


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_compoundst

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCompoundst" ):
                listener.enterCompoundst(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCompoundst" ):
                listener.exitCompoundst(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCompoundst" ):
                return visitor.visitCompoundst(self)
            else:
                return visitor.visitChildren(self)




    def compoundst(self):

        localctx = AssignmentStatementParser.CompoundstContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_compoundst)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 87
            self.match(AssignmentStatementParser.T__6)
            self.state = 91
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 88
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 93
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 100 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 94
                self.statement()
                self.state = 96 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 95
                    self.match(AssignmentStatementParser.NEWLINE)
                    self.state = 98 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==33):
                        break

                self.state = 102 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 134419072) != 0)):
                    break

            self.state = 104
            self.match(AssignmentStatementParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def ifst(self):
            return self.getTypedRuleContext(AssignmentStatementParser.IfstContext,0)


        def assign(self):
            return self.getTypedRuleContext(AssignmentStatementParser.AssignContext,0)


        def compoundst(self):
            return self.getTypedRuleContext(AssignmentStatementParser.CompoundstContext,0)


        def forst(self):
            return self.getTypedRuleContext(AssignmentStatementParser.ForstContext,0)


        def whilest(self):
            return self.getTypedRuleContext(AssignmentStatementParser.WhilestContext,0)


        def switchcase(self):
            return self.getTypedRuleContext(AssignmentStatementParser.SwitchcaseContext,0)


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = AssignmentStatementParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_statement)
        try:
            self.state = 112
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [9]:
                self.enterOuterAlt(localctx, 1)
                self.state = 106
                self.ifst()
                pass
            elif token in [27]:
                self.enterOuterAlt(localctx, 2)
                self.state = 107
                self.assign()
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 3)
                self.state = 108
                self.compoundst()
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 4)
                self.state = 109
                self.forst()
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 5)
                self.state = 110
                self.whilest()
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 6)
                self.state = 111
                self.switchcase()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfstContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def cond(self):
            return self.getTypedRuleContext(AssignmentStatementParser.CondContext,0)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AssignmentStatementParser.StatementContext)
            else:
                return self.getTypedRuleContext(AssignmentStatementParser.StatementContext,i)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(AssignmentStatementParser.NEWLINE)
            else:
                return self.getToken(AssignmentStatementParser.NEWLINE, i)

        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_ifst

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfst" ):
                listener.enterIfst(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfst" ):
                listener.exitIfst(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfst" ):
                return visitor.visitIfst(self)
            else:
                return visitor.visitChildren(self)




    def ifst(self):

        localctx = AssignmentStatementParser.IfstContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_ifst)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 114
            self.match(AssignmentStatementParser.T__8)
            self.state = 115
            self.cond()
            self.state = 116
            self.match(AssignmentStatementParser.T__9)
            self.state = 120
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 117
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 122
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 123
            self.statement()
            self.state = 127
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,12,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 124
                    self.match(AssignmentStatementParser.NEWLINE) 
                self.state = 129
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,12,self._ctx)

            self.state = 138
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
            if la_ == 1:
                self.state = 130
                self.match(AssignmentStatementParser.T__10)
                self.state = 134
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==33:
                    self.state = 131
                    self.match(AssignmentStatementParser.NEWLINE)
                    self.state = 136
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 137
                self.statement()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForstContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def assign(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AssignmentStatementParser.AssignContext)
            else:
                return self.getTypedRuleContext(AssignmentStatementParser.AssignContext,i)


        def cond(self):
            return self.getTypedRuleContext(AssignmentStatementParser.CondContext,0)


        def statement(self):
            return self.getTypedRuleContext(AssignmentStatementParser.StatementContext,0)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(AssignmentStatementParser.NEWLINE)
            else:
                return self.getToken(AssignmentStatementParser.NEWLINE, i)

        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_forst

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterForst" ):
                listener.enterForst(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitForst" ):
                listener.exitForst(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForst" ):
                return visitor.visitForst(self)
            else:
                return visitor.visitChildren(self)




    def forst(self):

        localctx = AssignmentStatementParser.ForstContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_forst)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 140
            self.match(AssignmentStatementParser.T__11)
            self.state = 141
            self.match(AssignmentStatementParser.T__12)
            self.state = 142
            self.assign()
            self.state = 143
            self.match(AssignmentStatementParser.T__13)
            self.state = 144
            self.cond()
            self.state = 145
            self.match(AssignmentStatementParser.T__13)
            self.state = 146
            self.assign()
            self.state = 147
            self.match(AssignmentStatementParser.T__14)
            self.state = 151
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 148
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 153
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 154
            self.statement()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WhilestContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def cond(self):
            return self.getTypedRuleContext(AssignmentStatementParser.CondContext,0)


        def statement(self):
            return self.getTypedRuleContext(AssignmentStatementParser.StatementContext,0)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(AssignmentStatementParser.NEWLINE)
            else:
                return self.getToken(AssignmentStatementParser.NEWLINE, i)

        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_whilest

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhilest" ):
                listener.enterWhilest(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhilest" ):
                listener.exitWhilest(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhilest" ):
                return visitor.visitWhilest(self)
            else:
                return visitor.visitChildren(self)




    def whilest(self):

        localctx = AssignmentStatementParser.WhilestContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_whilest)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 156
            self.match(AssignmentStatementParser.T__15)
            self.state = 157
            self.cond()
            self.state = 161
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 158
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 163
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 164
            self.statement()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SwitchcaseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def ID(self):
            return self.getToken(AssignmentStatementParser.ID, 0)

        def statement(self):
            return self.getTypedRuleContext(AssignmentStatementParser.StatementContext,0)


        def INT(self):
            return self.getToken(AssignmentStatementParser.INT, 0)

        def FLOAT(self):
            return self.getToken(AssignmentStatementParser.FLOAT, 0)

        def STRING(self):
            return self.getToken(AssignmentStatementParser.STRING, 0)

        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(AssignmentStatementParser.NEWLINE)
            else:
                return self.getToken(AssignmentStatementParser.NEWLINE, i)

        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_switchcase

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSwitchcase" ):
                listener.enterSwitchcase(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSwitchcase" ):
                listener.exitSwitchcase(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSwitchcase" ):
                return visitor.visitSwitchcase(self)
            else:
                return visitor.visitChildren(self)




    def switchcase(self):

        localctx = AssignmentStatementParser.SwitchcaseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_switchcase)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 166
            self.match(AssignmentStatementParser.T__16)
            self.state = 167
            self.match(AssignmentStatementParser.ID)
            self.state = 168
            self.match(AssignmentStatementParser.T__17)
            self.state = 169
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 34410070016) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 170
            self.match(AssignmentStatementParser.T__2)
            self.state = 174
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==33:
                self.state = 171
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 176
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 177
            self.statement()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(AssignmentStatementParser.ExprContext)
            else:
                return self.getTypedRuleContext(AssignmentStatementParser.ExprContext,i)


        def RELOP(self):
            return self.getToken(AssignmentStatementParser.RELOP, 0)

        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_cond

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCond" ):
                listener.enterCond(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCond" ):
                listener.exitCond(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCond" ):
                return visitor.visitCond(self)
            else:
                return visitor.visitChildren(self)




    def cond(self):

        localctx = AssignmentStatementParser.CondContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_cond)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 179
            self.expr(0)
            self.state = 180
            self.match(AssignmentStatementParser.RELOP)
            self.state = 181
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()

        def ID(self):
            return self.getToken(AssignmentStatementParser.ID, 0)

        def expr(self):
            return self.getTypedRuleContext(AssignmentStatementParser.ExprContext,0)


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_assign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssign" ):
                listener.enterAssign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssign" ):
                listener.exitAssign(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssign" ):
                return visitor.visitAssign(self)
            else:
                return visitor.visitChildren(self)




    def assign(self):

        localctx = AssignmentStatementParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_assign)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 183
            self.match(AssignmentStatementParser.ID)
            self.state = 184
            self.match(AssignmentStatementParser.T__18)
            self.state = 185
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)
            self.value_attr = ctx.value_attr
            self.type_attr = ctx.type_attr


    class Expr_term_minusContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(AssignmentStatementParser.ExprContext,0)

        def term(self):
            return self.getTypedRuleContext(AssignmentStatementParser.TermContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr_term_minus" ):
                listener.enterExpr_term_minus(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr_term_minus" ):
                listener.exitExpr_term_minus(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr_term_minus" ):
                return visitor.visitExpr_term_minus(self)
            else:
                return visitor.visitChildren(self)


    class Expr_term_plusContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(AssignmentStatementParser.ExprContext,0)

        def term(self):
            return self.getTypedRuleContext(AssignmentStatementParser.TermContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr_term_plus" ):
                listener.enterExpr_term_plus(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr_term_plus" ):
                listener.exitExpr_term_plus(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr_term_plus" ):
                return visitor.visitExpr_term_plus(self)
            else:
                return visitor.visitChildren(self)


    class Term4Context(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def term(self):
            return self.getTypedRuleContext(AssignmentStatementParser.TermContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm4" ):
                listener.enterTerm4(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm4" ):
                listener.exitTerm4(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTerm4" ):
                return visitor.visitTerm4(self)
            else:
                return visitor.visitChildren(self)


    class Expr_term_relopContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(AssignmentStatementParser.ExprContext,0)

        def RELOP(self):
            return self.getToken(AssignmentStatementParser.RELOP, 0)
        def term(self):
            return self.getTypedRuleContext(AssignmentStatementParser.TermContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr_term_relop" ):
                listener.enterExpr_term_relop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr_term_relop" ):
                listener.exitExpr_term_relop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr_term_relop" ):
                return visitor.visitExpr_term_relop(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = AssignmentStatementParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 26
        self.enterRecursionRule(localctx, 26, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            localctx = AssignmentStatementParser.Term4Context(self, localctx)
            self._ctx = localctx
            _prevctx = localctx

            self.state = 188
            self.term(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 201
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,19,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 199
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
                    if la_ == 1:
                        localctx = AssignmentStatementParser.Expr_term_plusContext(self, AssignmentStatementParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 190
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 191
                        self.match(AssignmentStatementParser.T__19)
                        self.state = 192
                        self.term(0)
                        pass

                    elif la_ == 2:
                        localctx = AssignmentStatementParser.Expr_term_minusContext(self, AssignmentStatementParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 193
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 194
                        self.match(AssignmentStatementParser.T__20)
                        self.state = 195
                        self.term(0)
                        pass

                    elif la_ == 3:
                        localctx = AssignmentStatementParser.Expr_term_relopContext(self, AssignmentStatementParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 196
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 197
                        self.match(AssignmentStatementParser.RELOP)
                        self.state = 198
                        self.term(0)
                        pass

             
                self.state = 203
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,19,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class TermContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_term

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)
            self.value_attr = ctx.value_attr
            self.type_attr = ctx.type_attr


    class Term_fact_divideContext(TermContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.TermContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def term(self):
            return self.getTypedRuleContext(AssignmentStatementParser.TermContext,0)

        def factor(self):
            return self.getTypedRuleContext(AssignmentStatementParser.FactorContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm_fact_divide" ):
                listener.enterTerm_fact_divide(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm_fact_divide" ):
                listener.exitTerm_fact_divide(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTerm_fact_divide" ):
                return visitor.visitTerm_fact_divide(self)
            else:
                return visitor.visitChildren(self)


    class Term_fact_mutiplyContext(TermContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.TermContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def term(self):
            return self.getTypedRuleContext(AssignmentStatementParser.TermContext,0)

        def factor(self):
            return self.getTypedRuleContext(AssignmentStatementParser.FactorContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm_fact_mutiply" ):
                listener.enterTerm_fact_mutiply(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm_fact_mutiply" ):
                listener.exitTerm_fact_mutiply(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTerm_fact_mutiply" ):
                return visitor.visitTerm_fact_mutiply(self)
            else:
                return visitor.visitChildren(self)


    class Factor3Context(TermContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.TermContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def factor(self):
            return self.getTypedRuleContext(AssignmentStatementParser.FactorContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor3" ):
                listener.enterFactor3(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor3" ):
                listener.exitFactor3(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFactor3" ):
                return visitor.visitFactor3(self)
            else:
                return visitor.visitChildren(self)



    def term(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = AssignmentStatementParser.TermContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 28
        self.enterRecursionRule(localctx, 28, self.RULE_term, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            localctx = AssignmentStatementParser.Factor3Context(self, localctx)
            self._ctx = localctx
            _prevctx = localctx

            self.state = 205
            self.factor()
            self._ctx.stop = self._input.LT(-1)
            self.state = 215
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,21,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 213
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,20,self._ctx)
                    if la_ == 1:
                        localctx = AssignmentStatementParser.Term_fact_mutiplyContext(self, AssignmentStatementParser.TermContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_term)
                        self.state = 207
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 208
                        self.match(AssignmentStatementParser.T__21)
                        self.state = 209
                        self.factor()
                        pass

                    elif la_ == 2:
                        localctx = AssignmentStatementParser.Term_fact_divideContext(self, AssignmentStatementParser.TermContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_term)
                        self.state = 210
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 211
                        self.match(AssignmentStatementParser.T__22)
                        self.state = 212
                        self.factor()
                        pass

             
                self.state = 217
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,21,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class FactorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_factor

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)
            self.value_attr = ctx.value_attr
            self.type_attr = ctx.type_attr



    class Fact_exprContext(FactorContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.FactorContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(AssignmentStatementParser.ExprContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFact_expr" ):
                listener.enterFact_expr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFact_expr" ):
                listener.exitFact_expr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFact_expr" ):
                return visitor.visitFact_expr(self)
            else:
                return visitor.visitChildren(self)


    class Fact_idContext(FactorContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.FactorContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(AssignmentStatementParser.ID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFact_id" ):
                listener.enterFact_id(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFact_id" ):
                listener.exitFact_id(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFact_id" ):
                return visitor.visitFact_id(self)
            else:
                return visitor.visitChildren(self)


    class Fact_numberContext(FactorContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.FactorContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def number(self):
            return self.getTypedRuleContext(AssignmentStatementParser.NumberContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFact_number" ):
                listener.enterFact_number(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFact_number" ):
                listener.exitFact_number(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFact_number" ):
                return visitor.visitFact_number(self)
            else:
                return visitor.visitChildren(self)


    class Fact_arrayContext(FactorContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.FactorContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def array(self):
            return self.getTypedRuleContext(AssignmentStatementParser.ArrayContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFact_array" ):
                listener.enterFact_array(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFact_array" ):
                listener.exitFact_array(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFact_array" ):
                return visitor.visitFact_array(self)
            else:
                return visitor.visitChildren(self)



    def factor(self):

        localctx = AssignmentStatementParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_factor)
        try:
            self.state = 225
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13]:
                localctx = AssignmentStatementParser.Fact_exprContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 218
                self.match(AssignmentStatementParser.T__12)
                self.state = 219
                self.expr(0)
                self.state = 220
                self.match(AssignmentStatementParser.T__14)
                pass
            elif token in [27]:
                localctx = AssignmentStatementParser.Fact_idContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 222
                self.match(AssignmentStatementParser.ID)
                pass
            elif token in [24, 25]:
                localctx = AssignmentStatementParser.Fact_numberContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 223
                self.number()
                pass
            elif token in [29, 30, 31]:
                localctx = AssignmentStatementParser.Fact_arrayContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 224
                self.array()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NumberContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_number

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)
            self.value_attr = ctx.value_attr
            self.type_attr = ctx.type_attr



    class Number_floatContext(NumberContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.NumberContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def FLOAT(self):
            return self.getToken(AssignmentStatementParser.FLOAT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumber_float" ):
                listener.enterNumber_float(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumber_float" ):
                listener.exitNumber_float(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNumber_float" ):
                return visitor.visitNumber_float(self)
            else:
                return visitor.visitChildren(self)


    class Number_intContext(NumberContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.NumberContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT(self):
            return self.getToken(AssignmentStatementParser.INT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumber_int" ):
                listener.enterNumber_int(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumber_int" ):
                listener.exitNumber_int(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNumber_int" ):
                return visitor.visitNumber_int(self)
            else:
                return visitor.visitChildren(self)



    def number(self):

        localctx = AssignmentStatementParser.NumberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_number)
        try:
            self.state = 229
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [25]:
                localctx = AssignmentStatementParser.Number_floatContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 227
                self.match(AssignmentStatementParser.FLOAT)
                pass
            elif token in [24]:
                localctx = AssignmentStatementParser.Number_intContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 228
                self.match(AssignmentStatementParser.INT)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value_attr = str()
            self.type_attr = str()


        def getRuleIndex(self):
            return AssignmentStatementParser.RULE_array

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)
            self.value_attr = ctx.value_attr
            self.type_attr = ctx.type_attr



    class Array_floatContext(ArrayContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.ArrayContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def FLOAT_ARRAY(self):
            return self.getToken(AssignmentStatementParser.FLOAT_ARRAY, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArray_float" ):
                listener.enterArray_float(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArray_float" ):
                listener.exitArray_float(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray_float" ):
                return visitor.visitArray_float(self)
            else:
                return visitor.visitChildren(self)


    class Array_stringContext(ArrayContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.ArrayContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING_ARRAY(self):
            return self.getToken(AssignmentStatementParser.STRING_ARRAY, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArray_string" ):
                listener.enterArray_string(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArray_string" ):
                listener.exitArray_string(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray_string" ):
                return visitor.visitArray_string(self)
            else:
                return visitor.visitChildren(self)


    class Array_intContext(ArrayContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a AssignmentStatementParser.ArrayContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT_ARRAY(self):
            return self.getToken(AssignmentStatementParser.INT_ARRAY, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArray_int" ):
                listener.enterArray_int(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArray_int" ):
                listener.exitArray_int(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray_int" ):
                return visitor.visitArray_int(self)
            else:
                return visitor.visitChildren(self)



    def array(self):

        localctx = AssignmentStatementParser.ArrayContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_array)
        try:
            self.state = 234
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [29]:
                localctx = AssignmentStatementParser.Array_intContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 231
                self.match(AssignmentStatementParser.INT_ARRAY)
                pass
            elif token in [30]:
                localctx = AssignmentStatementParser.Array_floatContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 232
                self.match(AssignmentStatementParser.FLOAT_ARRAY)
                pass
            elif token in [31]:
                localctx = AssignmentStatementParser.Array_stringContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 233
                self.match(AssignmentStatementParser.STRING_ARRAY)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[13] = self.expr_sempred
        self._predicates[14] = self.term_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 2)
         

    def term_sempred(self, localctx:TermContext, predIndex:int):
            if predIndex == 3:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 2)
         




