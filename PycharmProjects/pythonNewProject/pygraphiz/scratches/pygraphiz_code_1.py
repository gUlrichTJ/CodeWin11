import pygraphviz

G = pygraphviz.AGraph()

# We add a node
G.add_node("A", color="red")
G.add_edge("A", "B")
G.add_edge("A", "H")
G.add_edge("H", "I")
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
G.draw("pygraphvis.png")
