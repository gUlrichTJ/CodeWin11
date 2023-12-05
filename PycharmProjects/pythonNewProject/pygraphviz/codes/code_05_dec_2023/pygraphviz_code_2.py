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
G.add_edge("X", "A1")
G.add_edge("X", "A2")
G.add_edge("X", "A3")
G.add_edge("X", "A4")
G.add_edge("X", "A5")
G.add_edge("X", "A6")
G.add_edge("X", "A7")
G.add_edge("X", "A8")
G.add_edge("X", "A9")
G.add_edge("X", "A10")
G.add_edge("X", "A11")
G.add_edge("X", "A13")
G.add_edge("X", "A14")
G.add_edge("X", "A15")
G.add_edge("X", "A16")
G.add_edge("X", "A17")
G.add_edge("X", "A18")
G.add_edge("X", "A19")
G.add_edge("X", "A20")
G.add_edge("X", "A21")
G.add_edge("X", "A")
G.add_edge("X", "A1")
G.add_edge("X", "A2")
G.add_edge("X", "A3")
G.add_edge("X", "A1")
G.add_edge("X", "A2")
G.add_edge("X", "A3")
G.add_edge("X", "A1")
G.add_edge("X", "A2")
G.add_edge("X", "A3")
G.add_edge("X", "A1")
G.add_edge("X", "A2")
G.add_edge("X", "A3")
# Let's draw the graph
G.layout()
G.draw("../../images/dix_villes.jpeg")
