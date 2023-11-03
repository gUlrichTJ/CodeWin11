# Nous allons afficher les etoiles
from builtins import print

etoile = "*"
espace = " "
nombreNeLignes = 0

# L'utilisateur entre le nombre de lignes
# Tu pourras aussi verifier qu'il entre un nombre de
# lignes superieur a 2 par exemple et qu'il entre obligatoirement
# un entier.

nombreDeLignes = int(input("Nombre de lignes : "))
i = j = k = 0

# Nous parcourons la premiere boucle, prenant en compte le
# nombre de lignes
for i in range(nombreDeLignes):
    # Nous parcourons la deuxième boucle pour afficher les espaces
    for j in range(nombreDeLignes - 1, i, -1):
        # Nous affichons l'espace
        print(espace, end="")

    # Maintenant, nous affichons l'étoile
    for k in range(i*2 +1):
        print(etoile, end="")

    # Nous allons à la ligne
    print()

# Nous allons afficher un losange d'étoiles

etoile = "*"
espace = ' '

# L'utilisateur entre la hauteur du losange
hauteur = int(input("Hauteur du losange : "))

# Vérification que la hauteur est un nombre impair
if hauteur % 2 == 0:
    print("La hauteur doit être un nombre impair.")
else:
    for i in range(1, hauteur * 2):
        # Calcul du nombre d'espaces avant les étoiles
        espaces = abs((hauteur // 2) - (i - (hauteur // 2)))

        # Nous parcourons la boucle pour afficher les espaces
        for j in range(espaces):
            print(espace, end="")

        # Maintenant, nous affichons les étoiles
        for k in range(hauteur - 2 * espaces):
            print(etoile, end="")

        # Nous allons à la ligne
        print()

