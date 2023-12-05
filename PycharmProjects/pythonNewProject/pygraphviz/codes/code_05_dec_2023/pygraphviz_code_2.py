import pygraphviz as pgv

G = pgv.AGraph()

G.add_node("A", color="red")
G.add_node("B", color="blue")
G.add_node("D", color="yellow")
G.add_node("E")

# TODO: The edges
G.add_edge("A", "B")
G.add_edge("A", "D")
G.add_edge("A", "E")

G.add_node("C")
G.add_node("F", color="red")
G.add_node("G", color="blue")

G.add_edge("C", "F")
G.add_edge("C", "G")

# TODO: The rest of the nodes
G.add_node("H")
G.add_node("I")
G.add_node("J")

# Let's draw the graph
G.layout()
G.draw("../../images/dix_villes.jpeg")
