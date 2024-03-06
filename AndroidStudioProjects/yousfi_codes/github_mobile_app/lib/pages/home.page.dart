import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("HomePage"),
        backgroundColor: Colors.blue.shade300,
      ),
      drawer: const Drawer(),
      body: const Center(
        child: Text("Hello"),
      ),
    );
  }
}
