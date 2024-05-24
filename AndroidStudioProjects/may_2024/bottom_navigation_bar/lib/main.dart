import 'package:flutter/material.dart';

void main() => runApp(new MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      // The name of the home page
      home: HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {

  /// The list that will conatain the things that will be displayed on the pages
  List<Widget> listPages = [
    /// The first tabbar
    Text("Hello to you"),
    Text("I'm the second page"),
    Text("I'm the third page"),
    Text("Me, I'm the fourth page"),
  ];

  // The widget option
  int selectedIndex = 0;

  void onItemTapped(int index) {
    setState(() {
      selectedIndex = index;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(

      body: Center(
        child: listPages.elementAt(selectedIndex),
      ),
      /// The bottomNavBar
      bottomNavigationBar: BottomNavigationBar(
        items: const <BottomNavigationBarItem>[
          BottomNavigationBarItem(
            label: "Home",
            icon: Icon(Icons.home,),
          ),
          BottomNavigationBarItem(
            label: "Electric",
            icon: Icon(Icons.electric_meter),
            ),
          BottomNavigationBarItem(
            label: "Engin",
            icon: Icon(Icons.engineering),
          ),
        ],
        currentIndex: selectedIndex,
        onTap: onItemTapped,
      ),
    );
  }
}

