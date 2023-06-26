#include <iostream>
#include <vector>

#define log(a) std::cout << a << std::endl;

using namespace std;

int increment(int& value) {
   return value++;
}

int secondSmalestValue() {
    int const N = 10;
    vector<int> vectorOfNumbers(N);

    for (int i = 0; i < N; i++) {
        // The user fills the vector

    }
    return 0;
}

int main()
{
    int a = 5;
    int& ref = a;

    // We modify ref's value
    ref = 19;
    increment(a);
    log(a);
    cout << "Hello world!" << endl;
    return 0;
}
