#include <iostream>
#include <string>
#include <vector>
#include <fstream>

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

/// We learn files in C++
void filesLearningInCpp() {
    // ofstream monFlux("C:\NetbeansProjectsWin\CodeC++\files\index.py");
    // We declare the name in a string
    // string const nameFile("CodeC++\\files\\index.txt");
    string const nameFile("C:\\NetbeansProjectsWin\\CodeC++\\files\\index.py");
    ofstream monFlux(nameFile.c_str());

    // We shall try to write in the file
    if (monFlux) {
        monFlux << "print(\"I'm a sentence written in a file\")" << endl;
        monFlux << "a = " << 1643.808 << endl;
        monFlux << "print(\"We shall work and glorify the Name of God\")" << endl;
        monFlux << "for i in range(10):\n\tprint(i, end=' ')" << endl;
    } else {
        cout << "Error while writing in the file." << endl;
    }

    // Now we are gonna open the file
    ifstream openFile("C:\\NetbeansProjectsWin\\CodeC++\\files\\index.py");

    // if
    if (openFile) {
        string line;

        while (getline(openFile, line)) {
            cout << line << endl;
        }
    } else {
        cout << "Error while opening the file." << endl;
    }
}

int main()
{
    int a = 5;
    int& ref = a;

    // We use the file
    filesLearningInCpp();

    // We modify ref's value
    ref = 19;
    increment(a);
    log(a);
    cout << "Hello world!" << endl;
    return 0;
}
