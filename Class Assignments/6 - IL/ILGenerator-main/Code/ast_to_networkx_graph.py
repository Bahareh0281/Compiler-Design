import networkx


# Function to add nodes and edges to the NetworkX graph
def add_to_graph(graph, node, parent=None):
    if node is not None:
        # Add the current node to the graph
        graph.add_node(node.number, label=node.value)
        # If there's a parent, add an edge from the parent to the current node
        if parent is not None:
            graph.add_edge(parent.number, node.number)
        # add the child nodes to the graph
        for child in node.children:
            add_to_graph(graph, child, node)


def transform_ast_to_networkx(ast_root_node):
    graph = networkx.DiGraph()
    add_to_graph(graph,ast_root_node)
    return graph
