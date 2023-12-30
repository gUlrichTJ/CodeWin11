#include <stdio.h>
#include <stdlib.h>

/// Function that calculates the sum, product and average of numbers
void sum_product_average(int N) {

    double sum = 0, product = 1;

    if (N < 2 || N > 1000) {
        printf("The number you put in the function is not correct !");
    } else {

        /// Let's calculate the product
        for (int i = 1; i < N + 1; i++) {
            sum += i;
            product *= i;
        }

        putchar('\n');
        printf("Sum : %lf\n", sum);
        printf("Product : %lf\n", product);
        printf("Average : %lf\n", sum / N);
    }

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
    sum_product_average(170);
    putchar('\a');
    return 0;
}
