from gen.JavaParser import JavaParser
from gen.JavaParserListener import JavaParserListener
from collections import defaultdict

class CycleDetectorListener(JavaParserListener):
    def __init__(self):
        self.classGraph = defaultdict(set)
        self.currentClass = None
        self.cycles = []
    def enterClassDeclaration(self, ctx: JavaParser.ClassDeclarationContext):
        # Extract the class name from the normalClassDeclaration context
        classDeclContext = self._findNormalClassDeclarationContext(ctx)
        if classDeclContext:
            # Assuming the class name is the first child of typeIdentifier
            currentClass = classDeclContext.typeIdentifier().getChild(0).getText()
            self.currentClass = currentClass

            # Check for extends and implements
            if classDeclContext.classExtends():
                extendedClass = classDeclContext.classExtends().classType().getText()
                self.classGraph[currentClass].add(extendedClass)

            if classDeclContext.classImplements():
                for interfaceType in classDeclContext.classImplements().interfaceTypeList().interfaceType():
                    interfaceName = interfaceType.getText()
                    self.classGraph[currentClass].add(interfaceName)


    def _depth_first_search(self, current_node, visited_nodes, path):
        if current_node in path:
            cycle_start_index = path.index(current_node)
            self.cycles.append(path[cycle_start_index:])
            return
        elif current_node in visited_nodes:
            return
        path.append(current_node)
        visited_nodes.add(current_node)
        for neighbor in self.classGraph[current_node]:
            self._depth_first_search(neighbor, visited_nodes, path)
        path.pop()

    def enterFieldDeclaration(self, ctx:JavaParser.FieldDeclarationContext):
        if self.currentClass and ctx.unannType():
            fieldType = ctx.unannType().getText()
            if self._isUserDefinedClass(fieldType):
                self.classGraph[self.currentClass].add(fieldType)

    def _isUserDefinedClass(self, typeName):
        known_non_user_defined = {'String', 'int', 'boolean', 'double', 'float', 'long', 'short', 'byte', 'char'}
        return typeName[0].isupper() and typeName not in known_non_user_defined

    def _findNormalClassDeclarationContext(self, ctx):
        child_index = 0
        while child_index < len(ctx.children):
            child = ctx.children[child_index]
            if isinstance(child, JavaParser.NormalClassDeclarationContext):
                return child
            child_index += 1
        return None

    def findCycles(self):
        visited = set()
        stack = []
        index = 0  # Added for while loop

        while index < len(self.classGraph.keys()):  # Replaced for loop with while loop
            node = list(self.classGraph.keys())[index]  # Accessing node using index
            if node not in visited:
                self._depth_first_search(node, visited, stack)
            index += 1  # Incrementing index

        return self.cycles