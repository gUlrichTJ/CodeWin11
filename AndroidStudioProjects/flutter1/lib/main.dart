import 'package:flutter/material.dart';
import 'package:flutter1/another.page.dart';
/*
void main() {
  dynamic x = 1;
  var x1 = 1;
  var y = "";
  var clapping = '\u{1f45f}';

  // We try try, catch, finally
  print('Ex');

  try {
    misbehave();
  } catch (e) {
    print('main() finished handling ${e.runtimeType}');
  }

  try {
    int.parse("hellosource");
  } on FormatException {
    print("Invalid expression");
  } catch (ex, stacktrace) {
    print("{\n\t${stacktrace}\n}");
  }
  finally {
    print ("I love you");
  }

  print(DateTime.now().toString());

  // We create a list of persons
  List<Person> persons = [
    Person("Majoie", "Akouvi'\u{1f39f}'", 3),
    Person("Magloire", "Mama'\u{1f45f}'", 9),
    Person("Gloria", "Glory'\u{1f58f}'", 7),
    Person("Nullable", "Henovi'\u{1f55f}'", 1),
    Person("Ohhh Why ?", "Gblenkome'\u{1f50f}'", 4),
    Person("If i were", "Ok'\u{1f34f}'", 5),
    Person("Houlo", "Break", 4),
  ];

  // Let's print persons and see
  print("${persons}");

  // Let's sort the list
  persons.sort((a, b) => a.name.compareTo(b.name));
  print("Now sorted by name : ${persons}");

  Car car1 = new Car("BMW", "M1");
  Car car2 = new Car("Range rover", "M2");

  print(car1.getCarBadge());
  print(car2.getCarBadge());

  print(car2);

  // We create the person
  Person p = new Person("name", "xing", 20);

  // the clapping
  print(clapping);

  // We print the datas about the person
  print("The person's name is ${p.name}, his firstname is "
      "${p.xing} and his age is ${p.age}.");

  print(x1.runtimeType);
  print(y.runtimeType);

  if (x is int) {
    print("${x},  is integer");
  }
  print("App started");
  new App();
  print("App finished");

  // We test the two methods
  print(multiplyMethod(2, 4));
  print(multiplyMethod2(2, 4));
}

String countUp(int count) {
  print('Start counting up');
  StringBuffer sb = new StringBuffer();

  for (int i = 0; i < count; i++) {
    sb.write("${i}");
  }

  print("Finish count up");
  return sb.toString();
}

// Future method
Future<String> createFutureCounter(int counter) {
  return new Future(() {
    return countUp(counter);
  });
}

void misbehave() {
  try {
    dynamic foo = true;
    print(foo++); // Runtime error
  } catch (e) {
    print('misbehave() partially handled ${e.runtimeType}.');
  }
}

// Let's try a to String
class Car {
  String _name, _mark;

  // Constructor
  Car(this._name, this._mark);

  String getCarBadge() {
    return _name + "-" + _mark;
  }

  @override
  String toString() {
    // TODO: implement toString
    return "I love you guys. Thou art so amazing";
  }
}

multiplyMethod(int a, int b) {
  return a * b;
}

dynamic multiplyMethod2(int a, int b) {
  return a * b;
}

// We create the class

class Person {

  String name = "", xing = "";
  int age = 0;

  // Constructor
  Person(this.name, this.xing, this.age);

  @override
  String toString() {
    // TODO: implement toString
    return name + "-" + xing + "-" + "${age}";
  }
}

class App {
  App () {
    print("Constructing the class");
  }
}*/

/*
import 'package:flutter/material.dart';

import 'package:flutter1/another.page.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(
          primarySwatch: Colors.cyan,
        useMaterial3: true,
      ),
      home: HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {

  int _counter = 0;

  int incrementCounter() {
    return _counter++;
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'Hello',
          style: TextStyle(
              fontSize: 20,
            fontFamily: 'Arial'
          ),
        ),
      ),
      body: Center(
        child: Text(
            'You have pushed the button ${incrementCounter()}'
                ' times'
        ),
      ),
    );
  }
}
*/

/* "package:flutter/material.dart";
import "package:flutter1/another.page.dart";

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This project is the root of all our projects
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Flutter Home Page",
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {
  MyHomePage();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Flutter Page"),
      ),
      body: Center(
        child: Text("Hello people !"),
      ),
    );
  }
}

 */

/*void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "Flutter Home Page",
      theme: ThemeData(
        primarySwatch: Colors.blue
      ),
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: const BoxDecoration(
        border: Border(
            top: BorderSide(width: 1.0, color: Colors.black12),
            left: BorderSide(width: 1.0, color: Colors.black26),
            right: BorderSide(width: 1.0, color: Colors.blue),
          bottom: BorderSide(width: 1.0, color: Colors.pinkAccent)
        ),
      ),
      child: Container(
        padding: const EdgeInsets.symmetric(horizontal: 20.0, vertical: 2.0),
        decoration: const BoxDecoration(
          border: Border(
              top: BorderSide(width: 1.0, color: Colors.blueGrey),
              left: BorderSide(width: 1.0, color: Colors.white),
            right: BorderSide(width: 1.0, color: Colors.red),
            bottom: BorderSide(width: 1.0, color: Colors.yellowAccent),
          ),
          color: Colors.black12,
        ),
        child: const Text('OK',
          textAlign: TextAlign.center,
          style: TextStyle(color: Colors.black),
        ),
      ),
    );
    /*
    return Scaffold(
      appBar: AppBar(
          elevation: 0,
        title: Text("Flutter Home Page"),
        centerTitle: true,
      ),
      body: Center(
        child: Image.asset("lib/images/busAuth.jpg"),
      ),
    );
    */
  }
}

 */

/* void main() => runApp(MyApp());

class MyApp extends StatelessWidget {

  MyApp();

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "Flutter Demo Page",
      theme: ThemeData(
        primarySwatch: Colors.brown
      ),
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {

  MyHomePage();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        elevation: 0,
        actions: [
            IconButton(onPressed: () {
              showSearch(
                  context: context,
                  delegate: Research()
              );
            },
            icon: Icon(Icons.search),
            ),

          IconButton(
              onPressed: () {

              },
              icon: Icon(Icons.person)
          ),
        ],
      ),
      drawer: Drawer(

      ),
      body: Container(
        decoration: BoxDecoration(
          color: Colors.white
        ),
        padding: EdgeInsets.all(25),
        child: Center(
          child: Text(
            "Hello Population",
            style: TextStyle(
              color: Colors.black,
              fontFamily: "Arial, Comic Sans MS",
              letterSpacing: 0.5,
            ),
          ),
        ),
      ),
    );
  }
}

class Research extends SearchDelegate {
  @override
  List<Widget>? buildActions(BuildContext context) {
    // TODO: implement buildActions
    throw UnimplementedError();
  }

  @override
  Widget? buildLeading(BuildContext context) {
    // TODO: implement buildLeading
    throw UnimplementedError();
  }

  @override
  Widget buildResults(BuildContext context) {
    // TODO: implement buildResults
    throw UnimplementedError();
  }

  @override
  Widget buildSuggestions(BuildContext context) {
    // TODO: implement buildSuggestions
    throw UnimplementedError();
  }

}

 */

/*
void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  MyApp();

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Home Page",
      theme: ThemeData(
        primarySwatch: Colors.brown,
      ),
      home: MyHomePage(),
      debugShowCheckedModeBanner: false,
    );
  }
}

class MyHomePage extends StatelessWidget {
  MyHomePage();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        elevation: 0,
        title: Text("My Name is Lion's lord."),
        centerTitle: null,
        actions: [
          IconButton(
            onPressed: () {
              Navigator.push(
                  context,
                MaterialPageRoute(builder: (context) =>
                    ProductBox("Caleb", "Guy", 1000, "about.png"),
                ),
              );
            },
            icon: Icon(Icons.search),
          )
        ],
      ),
      drawer: Drawer(
        child: Container(
          padding: EdgeInsets.all(9),
          child: CircleAvatar(),
        ),
      ),
      body: Container(
        child: Center(
          child: Text("My name is lord lion"),
        ),
      ),
    );
  }
}
*/

class ProductBox extends StatefulWidget {

  ProductBox(this.name, this.description, this.price, this.image);

  final String name;
  final String description;
  final int price;
  final String image;

  @override
  State<ProductBox> createState() => _ProductBoxState();
}

class _ProductBoxState extends State<ProductBox> {
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(

      ),
      body: Center(
        child: Container(
            padding: EdgeInsets.all(2),
            height: 120,
            child: Card(
              elevation: 0,
                child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                    children: <Widget>[
                  Image.asset("lib/images/" + widget.image),
                  Expanded(
                      child: Container(
                          padding: EdgeInsets.all(5),
                          child: Column(
                            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                            children: <Widget>[
                              Text(this.widget.name,
                                  style: TextStyle(fontWeight: FontWeight.bold)),
                              Text(this.widget.description),
                              Text("Price: " + this.widget.price.toString()),
                            ],
                          ),
                      ),
                  ),
                ],
                ),
            ),
        ),
      ),
    );
  }
}

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  MyApp();

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Flutter Demo Page",
      theme: ThemeData(
        primarySwatch: Colors.brown,
      ),
      home: MyHomePage(),
      debugShowCheckedModeBanner: false,
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage();

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {

  int selectedIndex = 0;

  // TODO: Change the stage
  void _onItemTaped(int index) {
    setState(() {
      selectedIndex = index;
    });
  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Try and try"),
        elevation: 0,
        centerTitle: null,
        actions: [
          IconButton(
            onPressed: () {
              // TODO: Nous mettons le Navigator.push
              Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => ClickSearchButton()),
              );
            },
            icon: Icon(Icons.search),
          ),
          IconButton(
              onPressed: () {
                Navigator.push(
                    context,
                    MaterialPageRoute(
                        builder: (context) => ProductBox("About", "A picture for about", 100, "about.png"),
                    )
                );
              },
              icon: Icon(Icons.car_repair)
          )
        ],
      ),
      // TODO: Nous mettons le Drawer
      drawer: Drawer(

      ),
      body: ListView(
        padding: EdgeInsets.fromLTRB(2, 10, 2, 10),
          shrinkWrap: true,
          children: <Widget>[
            ReturnRow("iPhone", "iPhone", "The most styled phone", 1000, Colors.amber),
            ReturnRow("Pixel", "Pixel 1", "The phone that has many features.", 800, Colors.blueAccent),
            ReturnRow("Huawei", "Huawei 1", "The phone that has many features.", 800, Colors.blueAccent),
            ReturnRow("Samsung", "Pixel 1", "The phone that has many features.", 800, Colors.blueAccent),
            ReturnRow("Techno", "Pixel 1", "The phone that has many features.", 800, Colors.blueAccent),
            ReturnRow("Itel", "Pixel 1", "The phone that has many features.", 800, Colors.indigoAccent),
            ReturnRow("Nokia", "Pixel 1", "The phone that has many features.", 800, Colors.lime),
            ReturnRow("Wiko", "Pixel 1", "The phone that has many features.", 800, Colors.greenAccent),
            ReturnRow("Windows\nPhone", "Pixel 1", "The phone that has many features.", 800, Colors.pinkAccent),
          ],
      ),
      // TODO: The bottom navigation bar
      bottomNavigationBar: BottomNavigationBar(
        items: [
          BottomNavigationBarItem(
              icon: Icon(Icons.home),
            label: 'Home Page',
          ),
          BottomNavigationBarItem(
              icon: Icon(Icons.sunny),
            label: 'It\'s sunny',
          ),
          BottomNavigationBarItem(
              icon: Icon(Icons.access_alarm),
            label: 'Alarm'
          ),
        ],
        currentIndex: selectedIndex,
        onTap: _onItemTaped,
      ),
    );
  }
}

// TODO: La classe qui sera appellee lorsqu'on clique sur le bouton search
class ClickSearchButton extends StatelessWidget {
  ClickSearchButton();
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        
      ),
      body: Container(
        child: ListView(
          padding: EdgeInsets.all(20.0),
          children: <Widget>[
            Container(
              height: 50,
              color: Colors.amber[600],
              child: const Center(child: Text("Entry A",
                style: TextStyle(
                  fontWeight: FontWeight.bold,
                ),
              ),
              ),
            ),
            Container(
              height: 50,
                color: Colors.amber[400],
              child: const Center(child: Text("Entry B",
                style: TextStyle(
                  fontWeight: FontWeight.bold,
                ),
              ),
              ),
            ),
            Container(
              height: 50,
              color: Colors.amber[100],
              child: const Center(child: Text(
                  "Entry C",
                style: TextStyle(
                  fontWeight: FontWeight.bold,
                ),
              ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}

// TODO: class that return the element of the row
class ReturnRow extends StatelessWidget {
  String name = "", name2 = "", descripton = "";
  final Color color;
  int price = 10;

  ReturnRow(this.name, this.name2, this.descripton, this.price, this.color);

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceBetween,
      children: <Widget>[
        Container(
          width: 150,
          decoration: BoxDecoration(
            color: color,
            border: Border.all(
              color: Colors.black38,
              width: 1.0,
            )
          ),
          child: Text(name,
            style: TextStyle(
              fontSize: 35,
              backgroundColor: color,
            ),
          ),
        ),
        Container(
          child: Text(
              "$name2\n$descripton\n$price",
            textAlign: TextAlign.center,
          ),
        ),
      ],
    );
  }
}
