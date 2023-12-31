#include <stdio.h>
#include <stdlib.h>

/// We shall remove all the zeros and tasser the rest of the elements
void remove_zero_and_tasser(int *tab, int N) {
    putchar('\n');
    /// We fill the table
    for (int i = 0; i < N; i++) {
        printf("Enter element %i : ", i);
        scanf("%i", tab);
    }
}
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

    return 0;
}
