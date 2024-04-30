#include <iostream>
#include <string>

#include "ZFraction.h"

using namespace std;

int main()
{
    cout << "Hello world!" << endl;
    // I hope this will work
    ZFraction fraction1(2, 7), fraction2(3, 8);
    ZFraction somme = fraction1 + fraction2;

    cout << fraction1.toString() << " + " << fraction2.toString() << " = " << somme.toString() << endl;
    return 0;
}
