#include <stdio.h>
#include <stdlib.h>

#define __new_line putchar('\n');

int N = 0;
int L = 0, C = 0;

/// A function to return the size of the array
int array_size() {
    int array_size = 0;

    /// We shall prevent the size to be less than 2 or to exceed 50
    do {
        printf("Size of the array (2 <= size <= 50) : ");
        scanf("%i", &array_size);
    } while (array_size < 2 || array_size > 50);

    __new_line

    return array_size;
}

/// Function to fill the table
void fill_table(int *tab, int N) {
    for (int i = 0; i < N; i++) {
        printf("Enter element %d : ", i+1);
        scanf("%i", &tab[i]);
    }

    __new_line

}

/// Function to display the elements of a table
void display_table_elements(int *tab, int N) {
    /// We display the elements of the table
    __new_line

    for (int i = 0; i < N; i++)
        printf("%d ", tab[i]);

    __new_line
}

/// Function to take the number of lines of an array of two dimensions
int number_of_lines(int *tab[][]) {
    L = 0;

    __new_line

    do {
        printf("Enter the number of lines of the array : ");
        scanf("%i", &L);
    } while(L < 2 || L > 50);

    __new_line

    return L;
}

/// Function to take the number of columns of an array of two dimensions
int number_of_columns(int tab[][]) {
    C = 0;

    __new_line

    do {
        printf("Enter the number of columns of the array : ");
        scanf("%i", &C);
    } while(C < 2 || C > 50);

    __new_line

    return C;
}

/// Fill the array of two dimensions
void fill_array_of_two_dim(int tab[][]) {
    L = number_of_lines(tab);
    C = number_of_columns(tab);

    __new_line

    /// Let's fill the array
    for (int i = 0; i < L; i++) {
        for (int j = 0; j < C; j++) {
            printf("Enter element [%d][%d] : ", i, j);
            scanf("%i", &tab[i][j]);
        }
    }
}

/// 7.2 We shall remove all the zeros and tasser the rest of the elements
void remove_zero_and_tasser(int *tab) {
    int N = 0, N_C = 0, zero_counter = 0;
    int i = 0, j = 0;
    __new_line

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
        /// We go to a new line
        __new_line
        /// We display the elements of the table
        display_table_elements(tab, N);
    }
    __new_line
}

/// 7.3 We shall write a function that iverses the elements of a table
/// without using another table for help
void inverse_table_without_help(int *tab) {
    // Variables
    int N = 0, i = 0, j = 0, help = 0; // This is the size of the array
    // We recieve the size of the table
    N = array_size();

    // We have to fill the table
    puts("Fill please");

    __new_line

    fill_table(tab, N);

    puts("Table entered : ");

    display_table_elements(tab, N);

    // We inverse the table
    for (i = 0, j = N-1; i < j; i++, j--) {
        help = tab[i];
        tab[i] = tab[j];
        tab[j] = help;
    }

    // We display the inverse table
    puts("Table inversed");
    display_table_elements(tab, N);
}

/// Exercice 7.4
/// Put positive values int TPOS and negative values in TNEG
void positives_vs_negatives(int *tab) {
    int TPOS[50], TNEG[50];
    int i = 0, i_pos = 0, i_neg = 0;

    N = array_size();

    // We have to fill the table
    fill_table(tab, N);

    // We display the table filled
    puts("Table entered");
    display_table_elements(tab, N);

    // Now, we start verifying if there are positives or negatives values in the
    // We put every element to its place
    for (i = 0; i < N; i++) {
        if (tab[i] >= 0) {
            TPOS[i_pos] = tab[i];
            i_pos++;
        } else {
            TNEG[i_neg] = tab[i];
            i_neg++;
        }
    }

    // We display the both tables
    if (i_pos) {    // if i_pos is not null
        puts("Positive values");
        display_table_elements(TPOS, i_pos);
    }

    if (i_neg) {
        puts("Negative values");
        display_table_elements(TNEG, i_neg);
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

        __new_line

        printf("Sum : %lf\n", sum);
        printf("Product : %lf\n", product);
        printf("Average : %lf\n", sum / N);
    }
}

int main()
{
    int N = 50;
    int L = 20, C = 20;
    int tab[N];
    int tab2[L][C];

    // remove_zero_and_tasser(tab);
    // inverse_table_without_help(tab);
    // positives_vs_negatives(tab);

    fill_array_of_two_dim(tab2);
    return 0;
}
