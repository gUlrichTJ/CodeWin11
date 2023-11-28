import 'package:flutter/material.dart';

class MyHomePage extends StatelessWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text(
            "BOOTS",
          style: TextStyle(color: Colors.black),
        ),
        actions: [
          IconButton(
              onPressed: () {},
              icon: const Icon(
                  Icons.search,
                color: Colors.black,
                weight: 0.1,
                fill: 0.1,
                size: 26,
              ),
          ),
          IconButton(
              onPressed: () {},
              icon: Image.asset("assets/images/shopping-bag.png"),
          ),
        ],
      ),
    );
  }
}
