import networkx as nx
import matplotlib.pyplot as plt
from networkx.drawing.nx_agraph import graphviz_layout
from antlr4 import *

from Gen.AssignmentStatementLexer import AssignmentStatementLexer
from Gen.AssignmentStatementParser import AssignmentStatementParser
from Code.CustomASTListener import ASTListener

import argparse


def main(args):
    # Step 1: Load input source into stream
    stream = FileStream(args.file, encoding='utf8')
    print('Input language_apps:\n{0}'.format(stream))
    print('Result:')

    # Step 2: Create an instance of AssignmentStLexer
    lexer = AssignmentStatementLexer(stream)

    # Step 3: Convert the input source into a list of tokens
    token_stream = CommonTokenStream(lexer)

    # Step 4: Create an instance of the AssignmentStParser
    parser = AssignmentStatementParser(token_stream)

    # Step 5: Create parse tree
    parse_tree = parser.start()

    # Step 6: Create an instance of AssignmentStListener
    ast_generator = ASTListener()

    # Step 7(a): Walk parse tree with a customized listener (Automatically)
    walker = ParseTreeWalker()

    walker.walk(t=parse_tree, listener=ast_generator)


    draw(g=ast_generator.g)
    print("Finished")


# function to show If statement:


def draw(g: nx.DiGraph = None):
    pos = graphviz_layout(g, prog='dot')
    custom_pos = {}

    def get_tree_depth(node, current_depth=1):
        children = [v for u, v, d in g.out_edges(node, data=True) if d['edge_type'] == 'C']
        if not children:
            return current_depth
        return max(get_tree_depth(child, current_depth + 1) for child in children)

    tree_depth = get_tree_depth(next(iter(nx.topological_sort(g))))

    def place_nodes(node, x=0, y=0, x_offset=2.0, y_offset=2.0, level=0):
        if node not in custom_pos:
            custom_pos[node] = (x, -level * y_offset)

            # Get children and siblings
            children = [v for u, v, d in g.out_edges(node, data=True) if d['edge_type'] == 'C']
            siblings = [v for u, v, d in g.out_edges(node, data=True) if d['edge_type'] == 'B']


            # Calculate sibling offset based on tree depth


            # Place children directly below the node
            for child in children:
                place_nodes(child, x, y, x_offset, y_offset, level + 1)

            # Place siblings to the right of the node


            for i, sibling in enumerate(siblings):
                tree_depth = get_tree_depth(sibling, 1)
                sibling_x_offset = x_offset * tree_depth
                sibling_x = x + sibling_x_offset

                place_nodes(sibling, sibling_x + i * sibling_x_offset, y, x_offset, y_offset, level)

    start_node = next(iter(nx.topological_sort(g)))
    place_nodes(start_node)

    # Draw nodes using custom positions
    nx.draw_networkx_nodes(g, custom_pos, node_size=150, node_color='blue', node_shape="s")

    # Draw edges with custom positions
    for u, v, data in g.edges(data=True):
        edge_type = data.get('edge_type')
        arrowprops = dict(arrowstyle="->", color='red' if edge_type == 'C' else 'green')
        plt.annotate("", xy=custom_pos[v], xytext=custom_pos[u], arrowprops=arrowprops)

    # Draw labels
    labels = {node: node.value for node in g.nodes()}
    nx.draw_networkx_labels(g, custom_pos, labels, font_color='white')

    plt.axis('off')
    plt.show()
"""
"""

# function to show Assignment Statement:


def draw(g: nx.DiGraph = None):

    # Initial positions with graphviz 'dot'
    pos = graphviz_layout(g, prog='dot')

    # Custom positions for nodes
    custom_pos = {}
    import math
    def place_nodes(node, x=0, y=0, x_offset=2.0, y_offset=2.0, level=0):
        if node not in custom_pos:
            custom_pos[node] = (x, -level * y_offset)

            # Get children and siblings
            children = [v for u, v, d in g.out_edges(node, data=True) if d['edge_type'] == 'C']
            siblings = [v for u, v, d in g.out_edges(node, data=True) if d['edge_type'] == 'B']

            width = len(g.out_edges.data())
            # for i in range(level):
            #     width = width * ((level+1)/4)
            #     width = width


            # Place children directly below the node
            # I must think
            first_sibling_offset = x_offset / (width/(level+1)) if level > 1 else x_offset




            # Place children directly below the node

            for i, child in enumerate(children):
                if child.value == '▓':
                    place_nodes(child, x, y, x_offset, y_offset, level + 1)
                    # continue
                else:
                    place_nodes(child, x, y, x_offset, y_offset, level + 1)


            # Place the first sibling with a special offset
            sibling_x = x + first_sibling_offset

            # Place siblings to the right of the node or its children
            # sibling_x = x + x_offset if not children else custom_pos[children[-1]][0] + x_offset

            for i, sibling in enumerate(siblings):
                if sibling.value == '▓':
                    place_nodes(sibling, sibling_x + i * x_offset, y, x_offset, y_offset, level)

                else:
                    place_nodes(sibling, sibling_x + i * x_offset, y, x_offset, y_offset, level)

    # Assuming 'start_node' is your root node
    start_node = next(iter(nx.topological_sort(g)))  # or specify the root node if known
    place_nodes(start_node)

    # Draw nodes using custom positions
    nx.draw_networkx_nodes(g, custom_pos, node_size=150, node_color='blue',node_shape="s")

    # Draw edges with custom positions
    for u, v, data in g.edges(data=True):

        edge_type = data.get('edge_type')
        print(edge_type)

        if edge_type == 'C':
            # Child edge, draw with arrow pointing down
            arrowprops = dict(arrowstyle="->", color='red')
            plt.annotate("", xy=custom_pos[v], xytext=custom_pos[u], arrowprops=arrowprops)
        elif edge_type == 'B':
            # Sibling edge, draw with arrow pointing right
            arrowprops = dict(arrowstyle="->", color='green')
            plt.annotate("", xy=custom_pos[v], xytext=custom_pos[u], arrowprops=arrowprops)

    # Draw labels
    labels = {node: node.value for node in g.nodes()}  # Replace str(node) with the appropriate label if needed
    nx.draw_networkx_labels(g, custom_pos, labels=labels, font_color='white')

    plt.axis('off')

    plt.show()



if __name__ == '__main__':
    argparser = argparse.ArgumentParser()
    argparser.add_argument(
        '-n', '--file',
        help='Input source', default=r'input.txt')
    args = argparser.parse_args()
    main(args)
