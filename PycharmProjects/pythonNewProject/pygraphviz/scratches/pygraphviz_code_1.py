import pygraphviz

G = pygraphviz.AGraph()

# We add a node
G.add_node("A", color="red")
G.add_node("B", color="blue")
G.add_node("C", color="red")
G.add_node("D", color="blue")
G.add_node("E", color="blue")
G.add_node("F", color="red")
G.add_node("G", color="darkgreen")
G.add_node("H", color="blue")
G.add_node("I", color="darkgreen")
G.add_node("J", color="red")

"""
# Node colors
nodes_labels = ["A", "C", "F", "J",]
# We are going to set them to red color
G.add_nodes_from((node, {"color": "red"}) for node in nodes_labels)
"""
G.add_edge("A", "B")
G.add_edge("A", "H")
G.add_edge("H", "I", color="blue")
G.add_edge("I", "J")
G.add_edge("J", "H")
G.add_edge("B", "C")
G.add_edge("C", "D")
G.add_edge("C", "E")
G.add_edge("E", "G")
G.add_edge("G", "F")
G.add_edge("F", "E")
G.add_edge("b", "c")

# We can add node from a nodelist


node_list = ["f", "g", "h"]
G.add_node(node_list)

G.layout()
G.draw("images/pygraphvis.png")
