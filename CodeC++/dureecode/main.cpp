#include <iostream>
#include "Duree.h"

using namespace std;

int main()
{
   Duree duree1(2, 4, 30), duree2(8, 7, 20);
   duree1.afficherDuree();

   if (duree1 == duree2){
        cout << "Hello !" << endl;
   } else {
        cout << "Hi" << endl;
   }

    return 0;
}
