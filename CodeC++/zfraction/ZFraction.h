#ifndef ZFRACTION_H_INCLUDED
#define ZFRACTION_H_INCLUDED
#include <iostream>
#include <string>

class ZFraction
{
    public :
        ZFraction();
        ZFraction(int a);
        ZFraction(int a, int b);
        ZFraction(ZFraction& autre);
        ZFraction(ZFraction const& autre);
        // Destructeur
        ~ZFraction();
        // Fonction pour trouver les plus petit commun diviseur
        int findGCD(int a, int b) const;
        std::string toString() const;
        ZFraction operator+(const ZFraction& autre) const;

    private :
        int m_a;
        int m_b;
};

#endif // ZFRACTION_H_INCLUDED
