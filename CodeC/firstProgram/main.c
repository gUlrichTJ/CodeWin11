#include <stdio.h>
#include <stdlib.h>
#include "plusGrand.h"
#include "zesteFile.h"

int main()
{
    //Ordre Grand
    //Menu
    int choice;
    printf("Enter your choice : ");
    scanf("%i", &choice);
    switch(choice){
        case 1:
            plusGrand();
            break;
        case 2:
            callingSommeN();
            rectangle();
            numberOfe();
            callPgcd2();
            pgcd();
            rabbits();
            break;
        case 3:
            calculatorCalling();
            break;
    }
    return 0;
}
