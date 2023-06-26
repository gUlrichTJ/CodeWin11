#include <iostream>
#define log(a) std::cout << a << std::endl;

using namespace std;

int increment(int& value) {
   return value++;
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
