import turtle

def dessiner_region(couleur, points):
    turtle.fillcolor(couleur)
    turtle.penup()
    turtle.goto(points[0][0], points[0][1])
    turtle.pendown()
    turtle.begin_fill()
    for point in points:
        turtle.goto(point[0], point[1])
    turtle.end_fill()

def dessiner_france():
    turtle.speed(2)

    # Coordonnées approximatives des régions
    regions = {
        "Hauts-de-France": [(-200, 200), (-50, 200), (-50, 100), (-200, 100)],
        "Île-de-France": [(-50, 200), (100, 200), (100, 100), (-50, 100)],
        "Grand Est": [(-200, 100), (-50, 100), (-50, 0), (-200, 0)],
        "Normandie": [(-50, 100), (100, 100), (100, 0), (-50, 0)],
        "Bretagne": [(-200, 0), (-50, 0), (-50, -100), (-200, -100)],
        "Pays de la Loire": [(-50, 0), (100, 0), (100, -100), (-50, -100)],
        "Nouvelle-Aquitaine": [(-200, -100), (-50, -100), (-50, -200), (-200, -200)],
        "Occitanie": [(-50, -100), (100, -100), (100, -200), (-50, -200)],
        "Auvergne-Rhône-Alpes": [(-200, -200), (-50, -200), (-50, -300), (-200, -300)],
        "Provence-Alpes-Côte d'Azur": [(-50, -200), (100, -200), (100, -300), (-50, -300)]
    }

    for region, points in regions.items():
        if "Nouvelle-Aquitaine" in region or "Occitanie" in region or "Auvergne-Rhône-Alpes" in region:
            dessiner_region("green", points)
        elif "Hauts-de-France" in region or "Bretagne" in region:
            dessiner_region("red", points)
        elif "Île-de-France" in region or "Normandie" in region or "Pays de la Loire" in region:
            dessiner_region("yellow", points)
        else:
            dessiner_region("white", points)

    turtle.hideturtle()
    turtle.done()

# Appeler la fonction pour dessiner la carte de la France
dessiner_france()