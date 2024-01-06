#include <stdio.h>
#include <stdlib.h>

#define __new_line putchar('\n');

/// A function to return the size of the array
int array_size() {
    int array_size = 0;

    /// We shall prevent the size to be less than 2 or to exceed 50
    do {
        printf("Size of the array (2 <= size <= 50) : ");
        scanf("%i", &array_size);
    } while (array_size < 2 || array_size > 50);

    return array_size;
}

/// Function to display the elements of a table
void display_table_elements(int *tab, int N) {
    /// We display the elements of the table
    for (int i = 0; i < N; i++) {
        printf("%d ", tab[i]);
    }
}
/// We shall remove all the zeros and tasser the rest of the elements
void remove_zero_and_tasser(int *tab) {
    int N = 0, N_C = 0, zero_counter = 0;
    int i = 0, j = 0;
    __new_line

    /*
    printf("Size of the table : ");
    scanf("%i", &N);
    */
    /// The size of the array
    N_C = N = array_size();
    /// We fill the table
    for (int i = 0; i < N; i++) {
        printf("Enter element %i : ", i);
        scanf("%i", &tab[i]);
    }

    /// If there isn't 0 in the table, we print a message
    /// We display the table after going to a new line
    __new_line
    for (int i = 0; i < N; i++) {
        if (tab[i] == 0) {
            /// We count the number of 0 in the table
            zero_counter++;
            /// We tasser the elements
            for (int j = i; j < N; j++) {
                tab[j] = tab[j+1];
            }
            /// We diminish the size of the table
            --N;
        }
        /// printf("%i ", tab[i]);
    }

    /// From the correction
    for (i = 0, j = 0; i < N ; i++) {
        tab[j] = tab[i];
        if (tab[i])   j++;
    }
    /// New dimension of the array;
    N_C = j;
    __new_line

    /// If there was no 0 in the table, we print a message
    if (zero_counter == 0) {
        printf("There was no 0 in the table");
    } else {
        __new_line
        for (int i = 0; i < N; i++) {
            printf("%i ", tab[i]);
        }
    }
    __new_line
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
    int N = 50;
    int tab[N];

    // sum_product_average(170);

    remove_zero_and_tasser(tab);

    return 0;
}
