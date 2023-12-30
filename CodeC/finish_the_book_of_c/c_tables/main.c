#include <stdio.h>
#include <stdlib.h>

/// Function that calculates the sum, product and average of numbers
void sum_product_average(int N) {
    if (N < 2 || N > 100) {
        printf("The number you put in the function is not correct !");
    }

    /// Let's calculate the product
    for (int i = 1; i < N + 1; i++) {
        sum += i;
        product *= i;
    }

    printf("Sum : %lf\n", sum);
    printf("Product : %lf\n", product);
    printf("Average : %lf\n", sum / N);

    do {
        printf()
    } while(N < 2 || N > 100);
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
