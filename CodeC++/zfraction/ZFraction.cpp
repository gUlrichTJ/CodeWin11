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

    m_a = a;
    m_b = b;
}
