import turtle

def dessiner_rectangle(couleur, x, y, largeur, hauteur):
    turtle.fillcolor(couleur)
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    turtle.begin_fill()
    for _ in range(4):
        turtle.forward(largeur)
        turtle.right(90)
    turtle.end_fill()

def dessiner_france():
    turtle.speed(2)

    # Région 1 : Hauts-de-France (rouge)
    dessiner_rectangle("red", -200, 200, 150, 100)

    # Région 2 : Île-de-France (jaune)
    dessiner_rectangle("yellow", 0, 200, 150, 100)

    # Région 3 : Grand Est (vert)
    dessiner_rectangle("green", -200, 100, 150, 100)

    # Région 4 : Normandie (blanc)
    dessiner_rectangle("white", 0, 100, 150, 100)

    # Région 5 : Bretagne (rouge)
    dessiner_rectangle("red", -200, 0, 150, 100)

    # Région 6 : Pays de la Loire (jaune)
    dessiner_rectangle("yellow", 0, 0, 150, 100)

    # Région 7 : Nouvelle-Aquitaine (vert)
    dessiner_rectangle("green", -200, -100, 150, 100)

    # Région 8 : Occitanie (blanc)
    dessiner_rectangle("white", 0, -100, 150, 100)

    # Région 9 : Auvergne-Rhône-Alpes (rouge)
    dessiner_rectangle("red", -200, -200, 150, 100)

    # Région 10 : Provence-Alpes-Côte d'Azur (jaune)
    dessiner_rectangle("yellow", 0, -200, 150, 100)

    turtle.hideturtle()
    turtle.done()

# Appeler la fonction pour dessiner la carte de la France
dessiner_france()