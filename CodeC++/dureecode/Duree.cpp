#include <iostream>
#include <string>
#include "Duree.h"

using namespace std;

// Implementations
Duree::Duree() : m_heures(0), m_minutes(0), m_secondes(0)
{

}

// Constructeur de copie
Duree::Duree(Duree const& autre) : m_heures(autre.m_heures), m_minutes(autre.m_minutes),
    m_secondes(autre.m_secondes)
    {

    }

Duree::Duree(int heures, int minutes, int secondes) : m_heures(heures), m_minutes(minutes),
    m_secondes(secondes)
    {

    }

    void Duree::afficherDuree() const
    {
        cout << m_heures << "h " << m_minutes << " min " << m_secondes << " secondes." << endl;
    }

    bool operator==(Duree const&a, Duree const& b)
        {
           // return (a.getHeures() == b.getHeures() && a.getMinutes() == b.getMinutes()
           //          && a.getSecondes() == b.getSecondes());
           return a == b;
        }

    int Duree::getHeures()
    {
        return m_heures;
    }

    int Duree::getMinutes()
    {
        return m_minutes;
    }

    int Duree::getSecondes()
    {
        return m_secondes;
    }
