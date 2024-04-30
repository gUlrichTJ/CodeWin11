#include <stdio.h>
#include <stdlib.h>

/// Fonction pour tester si l'entier est pair ou impair
char* parite(int valeur) {
    char *pair = "pair", *impair = "impair";
    return (valeur % 2 == 0 ) ? pair : impair;
}

int main()
{
    int valeur = 0;
    /// Savoir si un entier est pair ou impair

    // Nous entrons la valeur
    printf("Entrez un entier : ");
    scanf("%i", &valeur);

    /// Affichons si l'entier est pair ou impair
    printf("%d est %s", valeur, parite(valeur));

    return 0;
}
