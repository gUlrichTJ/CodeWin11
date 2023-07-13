#ifndef PERSONNAGE_H_INCLUDED
#define PERSONNAGE_H_INCLUDED

#include <iostream>
#include <string>

#include "Arme.h"

class Personnage
{
    public:
        Personnage();
        // Constructeur de copie
        ~Personnage();
        Personnage(Personnage const& autre);
        Personnage(std::string nomArme, int nbDegats);
        void recevoirDegats(int nbDegats);
        void attaquer(Personnage &cible);
        void boirePotionDeVie(int quantitePotion);
        void changerArme(std::string nomNouvelleArme, int degatNouvelleArme);
        void afficherEtat() const;
        bool estVivant();

    private:
        int m_vie;
        int m_mana;

    Arme m_arme;
};

#endif // PERSONNAGE_H_INCLUDED
