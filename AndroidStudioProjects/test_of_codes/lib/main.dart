import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        canvasColor: Colors.lightGreen.shade100,
        platform: TargetPlatform.android
      ),
      home: const HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  String note = "Tip A";

  int _selectedIndex = 0;

  /// The things that will appear in the code
  static const List<Widget> _widgetOption = <Widget>[
    Text("God is great"),
    Text("We'll stay with Him forever"),
    Text("We're His family"),
    Text("We're for Him forever"),
    Text("We're His offsprings"),
    Text("God do we love"),
  ];

  ///
  void _onItemTaped(int index) {
    setState(() {
      _selectedIndex = index;
    });
  }

  /// On pressed method
  void _onPressed() {
    setState(() {
      note = "Tip B";
      debugPrint(note);
    });
  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(

      ),
      body: Column(
        children: <Widget>[
          _widgetOption.elementAt(_selectedIndex)
        ],
      ),
      bottomNavigationBar: BottomNavigationBar(
        items: const <BottomNavigationBarItem>[
          BottomNavigationBarItem(
              icon: Icon(Icons.height),
            label: "Hello",
          ),
          BottomNavigationBarItem(
              icon: Icon(Icons.line_weight),
              label: "Hello",
          ),
          BottomNavigationBarItem(
              icon: Icon(Icons.format_size_outlined),
              label: "Hello",
          ),
          BottomNavigationBarItem(
              icon: Icon(Icons.format_align_left),
              label: "Hello",
          ),
        ],
        currentIndex: _selectedIndex,
        showUnselectedLabels: true,
        showSelectedLabels: true,
        // backgroundColor: Colors.cyan,
        selectedItemColor: Colors.deepOrange,
        onTap: _onItemTaped,
      ),
    );
  }
}


