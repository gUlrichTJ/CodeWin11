import 'package:flutter/material.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        // backgroundColor: Colors.pink.shade100,
        elevation: 8,
        title: const Text("Home Page"),
      ),
      drawer: const Drawer(),
      // backgroundColor: Colors.pink.shade50,
      body: const SafeArea(
        child: Padding(
          padding: EdgeInsets.all(8.0),
          child: Column(
            children: [
              Text("data"),
            ],
          ),
        ),
      ),
    );
  }
}
