#include <stdio.h>
#include <stdlib.h>

#define __new_line putchar('\n');

/// We shall remove all the zeros and tasser the rest of the elements
void remove_zero_and_tasser(int *tab, int N) {
    __new_line

    /// We fill the table
    for (int i = 0; i < N; i++) {
        printf("Enter element %i : ", i);
        scanf("%i", &tab[i]);
    }

    /// We display the table after going to a new line
    new_line
    for (int i = 0; i < N; i++)
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
    int N = 50, n = 4;
    int tab[N];

    // sum_product_average(170);

    remove_zero_and_tasser(tab, n);

    return 0;
}
