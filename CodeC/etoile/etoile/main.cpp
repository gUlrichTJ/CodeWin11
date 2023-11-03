#include <iostream>

using namespace std;

int main()
{
    int nombreDeLignes = 0;1
    char espace = ' ';
    char etoile = '*';
    int i = 0, j = 0, k = 0;

    do {
         cout << "Nombre de lignes : ";
        cin >> nombreDeLignes;
    } while (nombreDeLignes < 1 || nombreDeLignes > 50);

    // Nous parcourons le nombre de lignes
    for (i = 0; i < nombreDeLignes; i++) {
        /// Nous affichons les espaces
        for (j = nombreDeLignes - 1; j > i; j--) {
            cout << espace;
        }
        /// Nous affichons l'etoile
        for (k = 0; k < i+1+j; k++) {
            cout << etoile;
        }
        /// Nous allons a la ligne
        cout << endl;
    }
    return 0;
}
