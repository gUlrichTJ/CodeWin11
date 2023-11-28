import 'package:flutter/material.dart';

class MyHomePage extends StatelessWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("BOOTS"),
        actions: [
          IconButton(
              onPressed: () {},
              icon: const Icon(Icons.search),
          ),

        ],
      ),
    );
  }
}
