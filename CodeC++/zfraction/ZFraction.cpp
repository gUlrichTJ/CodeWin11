#include <iostream>
#include "ZFraction.h"

using namespace std;

// Implementations
// Constructeur par defaut
ZFraction::ZFraction() : m_a(0), m_b(1)
{

}
// Avec un argument
ZFraction::ZFraction(int a) : m_a(a), m_b(1)
{

}

ZFraction::ZFraction(int a, int b)
{
    if (b == 0)
    {
        cout << "Division by zero" << endl;
    }
    else
    {
        // Nous allons reduire la fraction
        int petitCommunDiviseur = findGCD(a, b);

        // Pour aller plus rapidement, on peut ecrire
        /*
            a /= petitCommunDiviseur;
            b /= petitCommunDiviseur;
        */
        // Mais nous allons faire de telle sorte que tout le monde comprenne.
        int numerateurReduit = a / petitCommunDiviseur;
        int denominateurReduit = b / petitCommunDiviseur;
        m_a = numerateurReduit;
        m_b = denominateurReduit;

    }
}

// Constructeur de copie
ZFraction::ZFraction(ZFraction &autre) : m_a(autre.m_a), m_b(autre.m_b)
{

}

// Destructeur
ZFraction::~ZFraction()
{

}

// Methode pour trouver le plus petit commun diviseur
ZFraction::findGCD(int a, int b)
{
    if (b == 0)
    {
        return a;
    }
    return findGCD(a, a%b);
}

// La conversion en chaîne de caractère
std::string ZFraction::toString() const
{

}
