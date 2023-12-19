#include <iostream>
#include <cmath>

using namespace std;

/// We create the function quickly
    void return_n_numbers(int n, int max_terms) {
        int total_number = 0, x = 0, y = 0, z = 0;

        /// loop
        for (x = 0, x < max_terms; x++) {
            for (y = 0, y < max_terms; y++) {
                for (z = 0, z < max_terms; z++) {
                    /// Condition
                    if (pow(x, n) + pow(y, n) == pow(z, n)) {
                        total_number++;
                        cout << x << ", " << y << ", " << z << endl;
                    }
                }
            }
        }
        /// We print the total numbers
        cout << total_number << endl;
    }

int main()
{

    cout << "Hello world!" << endl;

    /// We call the function
    return_n_numbers(2, 100);
    return 0;
}
