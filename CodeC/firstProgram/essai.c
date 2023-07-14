#include <stdio.h>

int main() 
{
    int taille;
    double somme, valeur;
    double tab[100];

    printf("Entrez la taille du tableau (<100) : ");
    scanf("%i", &taille);

    for (int i = 0; i < taille; i++)
    {
        printf("Entrez une valeur : ");
        scanf("%lf", &tab[i]);
        somme = somme + tab[i];
    }
    
    printf("La somme est %lf et la moyenne est %lf\n", somme, somme/taille);
}