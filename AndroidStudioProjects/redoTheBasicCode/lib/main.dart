import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(primarySwatch: Colors.blue),
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
  int counter = 0;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'Flutter Demo',
          style: TextStyle(fontSize: 20, fontFamily: "Arial"),
        ),
        elevation: 0,
        backgroundColor: Colors.blue.shade400,
      ),

      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: <Widget>[
          Center(
            child: Text(
                'You\'ve pressed the button this many times ',
              style: TextStyle(fontSize: 18),
            ),
          ),
          Center(
            child: Text(
                '$counter',
              style: TextStyle(fontSize: 28),
            ),
          )
        ],
      ),

      floatingActionButton: FloatingActionButton(
        onPressed: buttonPressed,
        tooltip: 'Increment',
        child: Icon(Icons.add),
      ),
    );
  }

  void buttonPressed() {
    setState(() {
      counter++;
    });
  }
}
