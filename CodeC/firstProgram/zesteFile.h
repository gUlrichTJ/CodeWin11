#ifndef ZESTEFILE_H_INCLUDED
#define ZESTEFILE_H_INCLUDED

int32_t i;
//Creation of functions: addition, soustraction, division, multiplication, modulo,
//power,
double addition(double a, double b){
    return a+b;
}
double soustraction(double a, double b){
    return a-b;
}
double division(double a, double b){
    return a/b;
}
double multiplication(double a, double b){
    return a*b;
}
int32_t modulo(int32_t a, int32_t b){
    return a%b;
}
double factorielle(int a){
    double product = 1;
    for(i = 1; i<=a; i++)
        product*=i;
    return product;
}
long puissance(double a, double b){
    double product = 1;
    for(i = 1; i<=b; i++)
        product*=a;
    return product;
}
int ppcd(int a, int b){
    if(a == 0 || b == 0)
        return 0;
    double maxi = (a>b) ? a : b;
    int ii = maxi;
    while(ii%a != 0 || ii%b != 0)
        ++ii;
    return ii;
}
int pgcd2(int a, int b);
//Calculator calling
double calculatorCalling(){
    //Variables
    char choice;
    double A, B, result = 0;
    int nn;
    printf("\t\tMenu\n");
    puts("Addition(+)\nSoustraction(-)");
    puts("Multiplication(*)\nDivision(/)");
    puts("Modulo(%)\nFactorielle(!)");
    puts("Puissance(^)\nPGCD(g)");
    puts("PPCD(p)");
    printf("\nEntrez votre choix selon la notation polonaise inverse : ");

       //if(choice == 'q')
           // break;
    do{
       nn = scanf("%lf %lf %c", &A, &B, &choice);
       if (nn <= 1)
        {
            scanf("%c", &choice);
            B = A;
            A = result;
        }
        switch(choice){
        case '+':
            result = addition(A, B);
            break;
        case '-':
            result = soustraction(A, B);
            break;
        case '*':
            return multiplication(A, B);
            break;
        case '/':
            result = division(A, B);
            break;
        case '%':
            result = modulo(A, B);
            break;
        case '!':
            result = factorielle((nn == 0) ? A : B);
            break;
        case '^':
            result = puissance(A, B);
            break;
        case 'g':
            result = pgcd2(A, B);
            break;
        case 'p':
            result = ppcd(A, B);
            break;
        }
        printf("%lf", result);
    }
    while(choice!='q');

    return 0;
}
int sommeN(int N){
    int somme=0;
    for(i=0; i<N; i++){
        somme+=i;
        if(somme >= 32767){
            printf("N = %i", i);
            break;
        }
    }
    return somme;
}
void callingSommeN(){
    int N;
    printf("Ce programme donne la somme des entiers variants de 1 à N");
    do{
        printf("\nEntrez N (N>0) : ");
        scanf("%i", &N);
    }
    while(N<0);
    printf("\nThe sum of integers from 1 to %i is %i", N, sommeN(N));
}
void rectangle(){
    int longueur, largeur, nombre;
    printf("\nCe programme affiche un rectangle\n");
    printf("Entrez la longueur du rectangle : ");
    scanf("%i", &longueur);
    printf("Entrez la largeur du rectangle : ");
    scanf("%i", &largeur);
    for(i = 0; i<longueur; i++){
        for(int j = 0; j<largeur; j++)
            printf("*");
        putchar('\n');
    }
    printf("\nAffichage d'un triangle");
    i = 0;
    do{
        printf("\nEntrez un nombre > 0 : ");
        scanf("%i", &nombre);
    }
    while(nombre < 0);
    for(i=0; i<nombre; i++){
        for(int j = 0; j <= i; j++)
            printf("*");
        putchar('\n');
    }
}
void numberOfe(){
    char sentence;
    int e=0;
    printf("\nThis program counts the number of 'e' you have in your sentence.\n");
    printf("Enter a sentence : ");
    do{
        scanf("%c", &sentence);
        if(sentence=='e')
            e++;
    }
    while(sentence!='.' && sentence!='?' && sentence!='!');
    printf("\nWe have %i 'e' in the sentence. Bye\n", e);
}
//Seconde fonction pour calculer le pgcd
int pgcd2(int a, int b){
    int min = (a<b) ? a : b;
    for(i=2; i<=min; i++)
        if(a % i == 0 && b % i == 0)
            return i;
    return 0;
}
//Appel de la fonction pgcd2
void callPgcd2(){
    int a, b;
    int result = 0;
    printf("\nCe programme calcule le pgcd de deux nombres entiers");
    printf("\nEntrez un nombre : ");
    scanf("%i", &a);
    printf("Entrez un autre nombre : ");
    scanf("%i", &b);
    result = pgcd2(a, b);
    if(result != 0)
        printf("Le PGCD de %i et %i est %i\n", a, b, result);
}
void pgcd(){
    int a, b, rest=0;
    do{
        printf("Enter the first number : ");
        scanf("%i", &a);
        printf("Enter the second number : ");
        scanf("%i", &b);
    }
    while(b>a);
    rest=a%b;
    while(rest!=0){
        a=b;
        b=rest;
        rest=a%b;
    }
    printf("%i", b);
    printf("\n");
}
//Suite de Fibonnaci
void rabbits(){
    int U1=1, U2=1, Un, n;
    do{
        printf("Enter the month n : ");
        scanf("%i", &n);
    }
    while(n<1);
    for(i=1; i<n; i++){
        if(n==1)
            Un=U1;
        else if(n==2)
            Un=U2;
        else{
                Un=U1+U2;
                U1=U2;
                U2=Un;
            }
    }
    printf("\nWe have %i rabbits in month %i", Un, n);
    printf("\nMiles\tKm\n");
    for(i=5; i<=30; i+=5){
        printf("%i \t%f\n", i, (8.0/5)*i);
    }
}

#endif // ZESTEFILE_H_INCLUDED
