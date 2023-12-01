# Generated from E:/MyWorks/Class Projects/Compiler/Compiler_1402/Resources/13. AST-builder\AssignmentStatement.g4 by ANTLR 4.11.1
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
        4,1,30,189,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,1,0,1,0,5,0,33,8,0,10,0,12,0,36,9,0,1,0,1,0,1,1,1,1,1,
        1,5,1,43,8,1,10,1,12,1,46,9,1,1,1,3,1,49,8,1,1,1,4,1,52,8,1,11,1,
        12,1,53,1,1,1,1,1,2,1,2,5,2,60,8,2,10,2,12,2,63,9,2,1,2,1,2,5,2,
        67,8,2,10,2,12,2,70,9,2,4,2,72,8,2,11,2,12,2,73,1,3,1,3,1,3,1,3,
        1,4,1,4,1,5,1,5,5,5,84,8,5,10,5,12,5,87,9,5,1,5,1,5,4,5,91,8,5,11,
        5,12,5,92,4,5,95,8,5,11,5,12,5,96,1,5,1,5,1,6,1,6,1,6,3,6,104,8,
        6,1,7,1,7,1,7,1,7,5,7,110,8,7,10,7,12,7,113,9,7,1,7,1,7,5,7,117,
        8,7,10,7,12,7,120,9,7,1,7,1,7,5,7,124,8,7,10,7,12,7,127,9,7,1,7,
        3,7,130,8,7,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,10,
        1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,5,10,152,8,10,10,10,12,10,
        155,9,10,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,5,11,166,8,
        11,10,11,12,11,169,9,11,1,12,1,12,1,12,1,12,1,12,1,12,1,12,3,12,
        178,8,12,1,13,1,13,3,13,182,8,13,1,14,1,14,1,14,3,14,187,8,14,1,
        14,0,2,20,22,15,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,0,1,1,0,
        4,6,200,0,30,1,0,0,0,2,39,1,0,0,0,4,57,1,0,0,0,6,75,1,0,0,0,8,79,
        1,0,0,0,10,81,1,0,0,0,12,103,1,0,0,0,14,105,1,0,0,0,16,131,1,0,0,
        0,18,135,1,0,0,0,20,139,1,0,0,0,22,156,1,0,0,0,24,177,1,0,0,0,26,
        181,1,0,0,0,28,186,1,0,0,0,30,34,3,2,1,0,31,33,5,29,0,0,32,31,1,
        0,0,0,33,36,1,0,0,0,34,32,1,0,0,0,34,35,1,0,0,0,35,37,1,0,0,0,36,
        34,1,0,0,0,37,38,5,0,0,1,38,1,1,0,0,0,39,40,5,1,0,0,40,44,5,23,0,
        0,41,43,5,29,0,0,42,41,1,0,0,0,43,46,1,0,0,0,44,42,1,0,0,0,44,45,
        1,0,0,0,45,48,1,0,0,0,46,44,1,0,0,0,47,49,3,4,2,0,48,47,1,0,0,0,
        48,49,1,0,0,0,49,51,1,0,0,0,50,52,5,29,0,0,51,50,1,0,0,0,52,53,1,
        0,0,0,53,51,1,0,0,0,53,54,1,0,0,0,54,55,1,0,0,0,55,56,3,10,5,0,56,
        3,1,0,0,0,57,61,5,2,0,0,58,60,5,29,0,0,59,58,1,0,0,0,60,63,1,0,0,
        0,61,59,1,0,0,0,61,62,1,0,0,0,62,71,1,0,0,0,63,61,1,0,0,0,64,68,
        3,6,3,0,65,67,5,29,0,0,66,65,1,0,0,0,67,70,1,0,0,0,68,66,1,0,0,0,
        68,69,1,0,0,0,69,72,1,0,0,0,70,68,1,0,0,0,71,64,1,0,0,0,72,73,1,
        0,0,0,73,71,1,0,0,0,73,74,1,0,0,0,74,5,1,0,0,0,75,76,5,23,0,0,76,
        77,5,3,0,0,77,78,3,8,4,0,78,7,1,0,0,0,79,80,7,0,0,0,80,9,1,0,0,0,
        81,85,5,7,0,0,82,84,5,29,0,0,83,82,1,0,0,0,84,87,1,0,0,0,85,83,1,
        0,0,0,85,86,1,0,0,0,86,94,1,0,0,0,87,85,1,0,0,0,88,90,3,12,6,0,89,
        91,5,29,0,0,90,89,1,0,0,0,91,92,1,0,0,0,92,90,1,0,0,0,92,93,1,0,
        0,0,93,95,1,0,0,0,94,88,1,0,0,0,95,96,1,0,0,0,96,94,1,0,0,0,96,97,
        1,0,0,0,97,98,1,0,0,0,98,99,5,8,0,0,99,11,1,0,0,0,100,104,3,14,7,
        0,101,104,3,18,9,0,102,104,3,10,5,0,103,100,1,0,0,0,103,101,1,0,
        0,0,103,102,1,0,0,0,104,13,1,0,0,0,105,106,5,9,0,0,106,107,3,16,
        8,0,107,111,5,10,0,0,108,110,5,29,0,0,109,108,1,0,0,0,110,113,1,
        0,0,0,111,109,1,0,0,0,111,112,1,0,0,0,112,114,1,0,0,0,113,111,1,
        0,0,0,114,118,3,12,6,0,115,117,5,29,0,0,116,115,1,0,0,0,117,120,
        1,0,0,0,118,116,1,0,0,0,118,119,1,0,0,0,119,129,1,0,0,0,120,118,
        1,0,0,0,121,125,5,11,0,0,122,124,5,29,0,0,123,122,1,0,0,0,124,127,
        1,0,0,0,125,123,1,0,0,0,125,126,1,0,0,0,126,128,1,0,0,0,127,125,
        1,0,0,0,128,130,3,12,6,0,129,121,1,0,0,0,129,130,1,0,0,0,130,15,
        1,0,0,0,131,132,3,20,10,0,132,133,5,12,0,0,133,134,3,20,10,0,134,
        17,1,0,0,0,135,136,5,23,0,0,136,137,5,13,0,0,137,138,3,20,10,0,138,
        19,1,0,0,0,139,140,6,10,-1,0,140,141,3,22,11,0,141,153,1,0,0,0,142,
        143,10,4,0,0,143,144,5,14,0,0,144,152,3,22,11,0,145,146,10,3,0,0,
        146,147,5,15,0,0,147,152,3,22,11,0,148,149,10,2,0,0,149,150,5,30,
        0,0,150,152,3,22,11,0,151,142,1,0,0,0,151,145,1,0,0,0,151,148,1,
        0,0,0,152,155,1,0,0,0,153,151,1,0,0,0,153,154,1,0,0,0,154,21,1,0,
        0,0,155,153,1,0,0,0,156,157,6,11,-1,0,157,158,3,24,12,0,158,167,
        1,0,0,0,159,160,10,3,0,0,160,161,5,16,0,0,161,166,3,24,12,0,162,
        163,10,2,0,0,163,164,5,17,0,0,164,166,3,24,12,0,165,159,1,0,0,0,
        165,162,1,0,0,0,166,169,1,0,0,0,167,165,1,0,0,0,167,168,1,0,0,0,
        168,23,1,0,0,0,169,167,1,0,0,0,170,171,5,18,0,0,171,172,3,20,10,
        0,172,173,5,19,0,0,173,178,1,0,0,0,174,178,5,23,0,0,175,178,3,26,
        13,0,176,178,3,28,14,0,177,170,1,0,0,0,177,174,1,0,0,0,177,175,1,
        0,0,0,177,176,1,0,0,0,178,25,1,0,0,0,179,182,5,21,0,0,180,182,5,
        20,0,0,181,179,1,0,0,0,181,180,1,0,0,0,182,27,1,0,0,0,183,187,5,
        25,0,0,184,187,5,26,0,0,185,187,5,27,0,0,186,183,1,0,0,0,186,184,
        1,0,0,0,186,185,1,0,0,0,187,29,1,0,0,0,22,34,44,48,53,61,68,73,85,
        92,96,103,111,118,125,129,151,153,165,167,177,181,186
    ]

class AssignmentStatementParser ( Parser ):

    grammarFileName = "AssignmentStatement.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'program'", "'var'", "':'", "'float'", 
                     "'int'", "'string'", "'begin'", "'end'", "'if'", "'then'", 
                     "'else'", "'>'", "':='", "'+'", "'-'", "'*'", "'/'", 
                     "'('", "')'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "INT", "FLOAT", "String", "ID", "ARRAY_TYPE", "INT_ARRAY", 
                      "FLOAT_ARRAY", "STRING_ARRAY", "WS", "NEWLINE", "RELOP" ]

    RULE_start = 0
    RULE_prog = 1
    RULE_declaration = 2
    RULE_variable_declaration = 3
    RULE_type = 4
    RULE_compoundst = 5
    RULE_statement = 6
    RULE_ifst = 7
    RULE_cond = 8
    RULE_assign = 9
    RULE_expr = 10
    RULE_term = 11
    RULE_factor = 12
    RULE_number = 13
    RULE_array = 14

    ruleNames =  [ "start", "prog", "declaration", "variable_declaration", 
                   "type", "compoundst", "statement", "ifst", "cond", "assign", 
                   "expr", "term", "factor", "number", "array" ]

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
    INT=20
    FLOAT=21
    String=22
    ID=23
    ARRAY_TYPE=24
    INT_ARRAY=25
    FLOAT_ARRAY=26
    STRING_ARRAY=27
    WS=28
    NEWLINE=29
    RELOP=30

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.11.1")
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
            self.state = 30
            self.prog()
            self.state = 34
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==29:
                self.state = 31
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 36
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 37
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
            self.state = 39
            self.match(AssignmentStatementParser.T__0)
            self.state = 40
            self.match(AssignmentStatementParser.ID)
            self.state = 44
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,1,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 41
                    self.match(AssignmentStatementParser.NEWLINE) 
                self.state = 46
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,1,self._ctx)

            self.state = 48
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==2:
                self.state = 47
                self.declaration()


            self.state = 51 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 50
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 53 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==29):
                    break

            self.state = 55
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
            self.state = 57
            self.match(AssignmentStatementParser.T__1)
            self.state = 61
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==29:
                self.state = 58
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 63
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 71 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 64
                self.variable_declaration()
                self.state = 68
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,5,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 65
                        self.match(AssignmentStatementParser.NEWLINE) 
                    self.state = 70
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,5,self._ctx)

                self.state = 73 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==23):
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
            self.state = 75
            self.match(AssignmentStatementParser.ID)
            self.state = 76
            self.match(AssignmentStatementParser.T__2)
            self.state = 77
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
            self.state = 79
            _la = self._input.LA(1)
            if not(((_la) & ~0x3f) == 0 and ((1 << _la) & 112) != 0):
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
            self.state = 81
            self.match(AssignmentStatementParser.T__6)
            self.state = 85
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==29:
                self.state = 82
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 87
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 94 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 88
                self.statement()
                self.state = 90 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 89
                    self.match(AssignmentStatementParser.NEWLINE)
                    self.state = 92 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==29):
                        break

                self.state = 96 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (((_la) & ~0x3f) == 0 and ((1 << _la) & 8389248) != 0):
                    break

            self.state = 98
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
            self.state = 103
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [9]:
                self.enterOuterAlt(localctx, 1)
                self.state = 100
                self.ifst()
                pass
            elif token in [23]:
                self.enterOuterAlt(localctx, 2)
                self.state = 101
                self.assign()
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 3)
                self.state = 102
                self.compoundst()
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
            self.state = 105
            self.match(AssignmentStatementParser.T__8)
            self.state = 106
            self.cond()
            self.state = 107
            self.match(AssignmentStatementParser.T__9)
            self.state = 111
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==29:
                self.state = 108
                self.match(AssignmentStatementParser.NEWLINE)
                self.state = 113
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 114
            self.statement()
            self.state = 118
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,12,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 115
                    self.match(AssignmentStatementParser.NEWLINE) 
                self.state = 120
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,12,self._ctx)

            self.state = 129
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
            if la_ == 1:
                self.state = 121
                self.match(AssignmentStatementParser.T__10)
                self.state = 125
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==29:
                    self.state = 122
                    self.match(AssignmentStatementParser.NEWLINE)
                    self.state = 127
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 128
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
        self.enterRule(localctx, 16, self.RULE_cond)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 131
            self.expr(0)
            self.state = 132
            self.match(AssignmentStatementParser.T__11)
            self.state = 133
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
        self.enterRule(localctx, 18, self.RULE_assign)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 135
            self.match(AssignmentStatementParser.ID)
            self.state = 136
            self.match(AssignmentStatementParser.T__12)
            self.state = 137
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
        _startState = 20
        self.enterRecursionRule(localctx, 20, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            localctx = AssignmentStatementParser.Term4Context(self, localctx)
            self._ctx = localctx
            _prevctx = localctx

            self.state = 140
            self.term(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 153
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,16,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 151
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,15,self._ctx)
                    if la_ == 1:
                        localctx = AssignmentStatementParser.Expr_term_plusContext(self, AssignmentStatementParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 142
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 143
                        self.match(AssignmentStatementParser.T__13)
                        self.state = 144
                        self.term(0)
                        pass

                    elif la_ == 2:
                        localctx = AssignmentStatementParser.Expr_term_minusContext(self, AssignmentStatementParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 145
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 146
                        self.match(AssignmentStatementParser.T__14)
                        self.state = 147
                        self.term(0)
                        pass

                    elif la_ == 3:
                        localctx = AssignmentStatementParser.Expr_term_relopContext(self, AssignmentStatementParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 148
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 149
                        self.match(AssignmentStatementParser.RELOP)
                        self.state = 150
                        self.term(0)
                        pass

             
                self.state = 155
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,16,self._ctx)

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
        _startState = 22
        self.enterRecursionRule(localctx, 22, self.RULE_term, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            localctx = AssignmentStatementParser.Factor3Context(self, localctx)
            self._ctx = localctx
            _prevctx = localctx

            self.state = 157
            self.factor()
            self._ctx.stop = self._input.LT(-1)
            self.state = 167
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,18,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 165
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
                    if la_ == 1:
                        localctx = AssignmentStatementParser.Term_fact_mutiplyContext(self, AssignmentStatementParser.TermContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_term)
                        self.state = 159
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 160
                        self.match(AssignmentStatementParser.T__15)
                        self.state = 161
                        self.factor()
                        pass

                    elif la_ == 2:
                        localctx = AssignmentStatementParser.Term_fact_divideContext(self, AssignmentStatementParser.TermContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_term)
                        self.state = 162
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 163
                        self.match(AssignmentStatementParser.T__16)
                        self.state = 164
                        self.factor()
                        pass

             
                self.state = 169
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,18,self._ctx)

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
        self.enterRule(localctx, 24, self.RULE_factor)
        try:
            self.state = 177
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [18]:
                localctx = AssignmentStatementParser.Fact_exprContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 170
                self.match(AssignmentStatementParser.T__17)
                self.state = 171
                self.expr(0)
                self.state = 172
                self.match(AssignmentStatementParser.T__18)
                pass
            elif token in [23]:
                localctx = AssignmentStatementParser.Fact_idContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 174
                self.match(AssignmentStatementParser.ID)
                pass
            elif token in [20, 21]:
                localctx = AssignmentStatementParser.Fact_numberContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 175
                self.number()
                pass
            elif token in [25, 26, 27]:
                localctx = AssignmentStatementParser.Fact_arrayContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 176
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
        self.enterRule(localctx, 26, self.RULE_number)
        try:
            self.state = 181
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [21]:
                localctx = AssignmentStatementParser.Number_floatContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 179
                self.match(AssignmentStatementParser.FLOAT)
                pass
            elif token in [20]:
                localctx = AssignmentStatementParser.Number_intContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 180
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
        self.enterRule(localctx, 28, self.RULE_array)
        try:
            self.state = 186
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [25]:
                localctx = AssignmentStatementParser.Array_intContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 183
                self.match(AssignmentStatementParser.INT_ARRAY)
                pass
            elif token in [26]:
                localctx = AssignmentStatementParser.Array_floatContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 184
                self.match(AssignmentStatementParser.FLOAT_ARRAY)
                pass
            elif token in [27]:
                localctx = AssignmentStatementParser.Array_stringContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 185
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
        self._predicates[10] = self.expr_sempred
        self._predicates[11] = self.term_sempred
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
         




