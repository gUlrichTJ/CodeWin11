import turtle

# Paramètres pour la carte
largeur_fenetre = 800
hauteur_fenetre = 600

# Paramètres pour la carte du Togo
togo_largeur = 480
togo_hauteur = 200

def dessiner_rectangle(largeur, hauteur):
    for _ in range(2):
        turtle.forward(largeur)
        turtle.left(90)
        turtle.forward(hauteur)
        turtle.left(90)

def dessiner_togo():
    # Centrer la carte du Togo dans la fenêtre
    turtle.penup()
    turtle.goto(-togo_largeur / 2, -togo_hauteur / 2)
    turtle.pendown()

    # Dessiner la carte du Togo
    dessiner_rectangle(togo_largeur, togo_hauteur)

# Paramètres de la fenêtre
turtle.setup(largeur_fenetre, hauteur_fenetre)
turtle.title("Carte du Togo")

# Vitesse du dessin (optionnel)
turtle.speed(2)

# Dessiner la carte du Togo
dessiner_togo()

# Fermer la fenêtre en cliquant dessus
turtle.exitonclick()
