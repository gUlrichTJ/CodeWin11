#include <stdio.h> /// standart input output header file
#include <stdlib.h>

int main()
{
    /// Variables
    /// type nom valeur point virgule
    int nombre_eleves = 30;     /// Nous avons déclaré une variable à qui nous avons donné la valeur 30

    /// Affichons la valeur de la variable

    printf("Le nombre d'élèves est : %i\n", nombre_eleves);

    /// Nous allons prendre deux nombres et les aditionner
    int nombre1 = 15, nombre2 = 21;

    /// Somme
    int somme = nombre1 + nombre2;

    /// Différence
    int difference = nombre1 - nombre2;

    /// Produit
    int produit = nombre1 * nombre2;

    /// Rapport
    double rapport = (double)nombre1 / nombre2;

    printf("\nLa somme de %i et de %i est %i\n", nombre1, nombre2, somme);

    printf("\nLa différence entre %i et %i est %i\n\n", nombre1, nombre2, difference);

    printf("\nLe produit entre %i et %i est %i\n\n", nombre1, nombre2, produit);

    printf("\nLe rapport entre %i et %i est %lf\n\n", nombre1, nombre2, rapport);

    printf("\n\nEntrez un entier : ");

    printf("\nHello Ornella!\n\n\n\n");

    printf("Hello Principal !\n\n\n");    /// Le point virgule marque la fin d'une instruction

    /// \n permet de faire un retour à la ligne.
    return 0;
}
