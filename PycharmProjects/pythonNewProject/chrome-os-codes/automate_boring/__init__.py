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
