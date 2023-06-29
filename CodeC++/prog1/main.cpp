#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <ctime>
#include <cstdlib>

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

// Function that chooses a random word
string chooseRandomWord(vector<string> words) {
    srand(time(0));

    // The integer that will have the index of the word
    int index = rand() % words.size();

    return words[index];
}

// Function that jumbles the word
void jumbleTheWord() {
    srand(time(0));
    vector<string> words = {
    // Fruits
    "apple", "banana", "cherry", "dragonfruit", "elderberry",
    "fig", "grape", "honeydew", "indigo", "jackfruit",
    "kiwi", "lemon", "mango", "nectarine", "orange",
    "pineapple", "quince", "raspberry", "strawberry", "tangerine",
    "ugli", "vanilla", "watermelon", "xigua", "yellow",
    "zucchini", "almond", "blueberry", "coconut", "date",
    "eggplant", "flamingo", "guava", "huckleberry", "iceberg",
    "jicama", "kale", "lychee", "mulberry", "nutmeg",
    "olive", "papaya", "quinoa", "rhubarb", "saffron",
    "tomato", "ugli", "violet", "waffle", "xylophone",
    "yam", "zesty", "apricot", "blackberry", "cantaloupe",
    "durian", "elderflower", "fig", "grapefruit", "honeycrisp",
    "indigo", "jujube", "kiwifruit", "lime", "mandarin",
    "nectar", "olallieberry", "passionfruit", "quince", "rhubarb",
    "strawberry", "tangelo", "ugli", "vanilla", "watercress",
    "ximenia", "yuzu", "zinfandel",

    // Colors
    "amber", "blue", "coral", "dandelion", "emerald",
    "fuchsia", "gold", "hazel", "indigo", "jade",
    "kelly", "lilac", "maroon", "navy", "olive",
    "plum", "quartz", "ruby", "sapphire", "tawny",
    "ultramarine", "violet", "wine", "xanadu", "yellow",

    // Animals
    "alligator", "bear", "cat", "dog", "elephant",
    "flamingo", "giraffe", "hippopotamus", "iguana", "jaguar",
    "kangaroo", "lion", "monkey", "narwhal", "octopus",
    "panda", "quokka", "rhinoceros", "sloth", "tiger",
    "unicorn", "vulture", "whale", "x-ray fish", "yak",
    "zebra",

    // Random Words
    "accordion", "balloon", "cucumber", "donut", "egg",
    "feather", "guitar", "hamburger", "ice cream", "jigsaw",
    "kite", "lollipop", "mushroom", "notebook", "ocean",
    "pencil", "quilt", "rainbow", "sandwich", "teddy bear",
    "umbrella", "violin", "waterfall", "xylophone", "yoyo",
    "zeppelin",
    // Continue adding more words...
    };

    string choosedWord = chooseRandomWord(words);

    int j = 0, sizeW = 0, sizeW2 = 0;
    int randomIndex = 0;
    string newWord = "";

    cout << choosedWord << endl;
    sizeW2 = choosedWord.size();

    do {
        // We take the size of the random word
        sizeW = choosedWord.size();

        // we choose a random index
        randomIndex = rand() % sizeW;

        // We give the random letter to the newWord
        newWord += choosedWord[randomIndex];

        // We delete the letter used
        choosedWord.erase(randomIndex, 1);

        j++;

    } while (j <= sizeW2);

    cout << newWord << "H" << endl;
}

void jumbleWords() {
    // We ask the user a word
    string word;

    cout << "Enter a word : ";
    cin >> word;

    jumbleTheWord();

    // We are gonna jumble the words
    /// Je cree un string qui a plein de mots, une methode qui choisit au hasard un mot et une autre fonction
    /// qui melange le mot. Bonne idee
}

int main()
{
    // We use the file
    filesLearningInCpp();

    jumbleWords();

    cout << "Hello world!" << endl;
    return 0;
}
