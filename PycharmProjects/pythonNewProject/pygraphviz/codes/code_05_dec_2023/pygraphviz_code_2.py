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

# TODO: Other graph
# TODO: The edges
G.add_edge("X", "A1", len="5")
G.add_edge("X", "A2", len="5")
G.add_edge("X", "A3", len="5")
G.add_edge("X", "A4", len="5")
G.add_edge("X", "A5", len="5")
G.add_edge("X", "A6", len="5")
G.add_edge("X", "A7", len="5")
G.add_edge("X", "A8", len="5")
G.add_edge("X", "A9", len="5")
G.add_edge("X", "A10", len="6")
G.add_edge("X", "A11", len="6")
G.add_edge("X", "A13", len="6")
G.add_edge("X", "A14", len="6")
G.add_edge("X", "A15", len="6")
G.add_edge("X", "A16", len="6")
G.add_edge("X", "A17", len="5")
G.add_edge("X", "A18", len="5")
G.add_edge("X", "A19", len="5")
G.add_edge("X", "A20", len="5")
G.add_edge("X", "A21", len="4")
G.add_edge("X", "A22", len="4")
G.add_edge("X", "A23", len="4")
G.add_edge("X", "A24", len="4")
G.add_edge("X", "A25", len="7")
G.add_edge("X", "A26", len="7")
G.add_edge("X", "A27", len="7")
G.add_edge("X", "A28", len="7")
G.add_edge("X", "A29", len="7")
G.add_edge("X", "A30", len="7")
G.add_edge("X", "A31", len="7")
G.add_edge("X", "A32", len="7")
G.add_edge("X", "A33", len="7")
G.add_edge("X", "A34", len="7")
# Let's draw the graph
G.layout()
G.draw("../../images/dix_villes.jpeg")
