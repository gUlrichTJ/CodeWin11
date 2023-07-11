#include <iostream>
#include <string>

#include "Personnage.h"
#include "Arme.h"

using namespace std;

// Constructeur
Personnage::Personnage()
{
    m_vie = 100;
    m_mana = 100;
}

// Constructeur de copie
Personnage::Personnage(Personnage const& autre) : m_vie(autre.m_vie), m_mana(autre.m_mana),
    m_nomArme(autre.m_nomArme), m_degatArme(autre.m_degatArme)
    {

    }

// Surcharge du constructeur
Personnage::Personnage(std;;string nomArme, int degatsArme) :
    m_vie(100), m_mana(100), m_arme(nomArme, degatsArme)
    {

    }

// Destructeur
Personnage::~Personnage()
{

}

// Mettre les methodes
void Personnage::recevoirDegats(int nbDegats)
{
    m_vie -= nbDegats;
    if (m_vie < 0)
    {
        m_vie = 0;
    }
}

void Personnage::attaquer(Personnage &cible)
{
    cible.recevoirDegats(m_arme.getDegats());
}

void Personnage::boirePotionDeVie(int quantitePotion)
{
    m_vie += quantitePotion;

    if (m_vie > 100)
    {
        m_vie = 100;
    }
}

void Personnage::changerArme(std::string nomNouvelleArme, int degatNouvelleArme)
{
    m_arme.changer(nomNouvelleArme, degatNouvelleArme);
}

void afficherEtat() const
{
    cout << "Vie : " << m_vie << " Mana : " << m_mana << endl;
    m_arme.afficher();
}

bool Personnage::estVivant()
{
        return m_vie > 0;
}
