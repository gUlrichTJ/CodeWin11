#include <stdio.h>
#include <stdlib.h>

/// Function that calculates the sum, product and average of numbers
void sum_product_average(int N) {

}
int main()
{
    int C, I;
    C = getchar();
    I = 128;

    while (I >= 1) {
        printf("%i", C/I);
        C %= I;
        I /= 2;
    }
    return 0;
}
