import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
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
  String note = "Tip A";

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
      appBar: AppBar(),
      body: Column(
        children: <Widget>[
          IconButton(onPressed: _onPressed,
              icon: const Icon(Icons.height))
        ],
      ),
      bottomNavigationBar: BottomNavigationBar(
        items: const <BottomNavigationBarItem>[
          BottomNavigationBarItem(icon: Icon(Icons.height)),
          BottomNavigationBarItem(icon: Icon(Icons.line_weight)),
          BottomNavigationBarItem(icon: Icon(Icons.format_size_outlined)),
          BottomNavigationBarItem(icon: Icon(Icons.format_align_left)),
        ],
        currentIndex: _selectedIndex,
        onTap: _onItemTaped,
      ),
    );
  }
}


