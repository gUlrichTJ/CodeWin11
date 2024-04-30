#include <iostream>
#include "Personnage.h"

using namespace std;

int main()
{
    Personnage david, goliath;

    goliath.attaquer(david);
    david.boirePotionDeVie(20);
    david.attaquer(goliath);
    david.changerArme("Double hache tranchante veneneuse de la mort", 40);
    goliath.attaquer(david);
    david.attaquer(goliath);

    // Affichons les etats
    cout << "David : " << endl;
    david.afficherEtat();

    cout << "Goliath : " << endl;
    goliath.afficherEtat();
    return 0;
}
