#include <iostream>
#include <cmath>
#include <ctime>
#include <vector>

using namespace std;

/// We create the function quickly
    void return_n_numbers(int n, int max_terms) {

        /// We will know the time the program took to be executed
        /// We start the clock at the begining of the program
        clock_t start_program = clock();

        int total_number = 0, x = 0, y = 0, z = 0;
        double time_took = 0;
        /// We are strong by God's grace
        /// We create a vector of integers to contain the values of x that
        /// are not needed to be printed for y
        vector<int> x_values = x_values<int>;

        /// loop
        for (x = 1; x < max_terms; x++) {
            for (y = 1; y < max_terms; y++) {
                        if (y in x_values) {
                                continue;
                        }
                for (z = 1; z < max_terms; z++) {
                    /// Condition
                    if (pow(x, n) + pow(y, n) == pow(z, n)) {
                        total_number++;
                        cout << x << ", " << y << ", " << z << endl;
                        x_values.push_back(x);
                    }
                }
            }
        }
        /// We print the total numbers
        cout << total_number << endl;

        /// We end the clock at the end of the program
        clock_t end_program = clock();

        /// We calculate the time made by the program
        time_took = (end_program - start_program) / (double)CLOCKS_PER_SEC;

        cout << time_took << endl;
    }

int main()
{
    /// We call the function
    return_n_numbers(2, 1000);
    return 0;
}
