import 'package:flutter/material.dart';
import 'package:shop_app/pages/default.tab.controller.dart';

class MyHomePage extends StatelessWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.white,
        title: const Text(
            "BOOTS",
          style: TextStyle(color: Colors.black),
        ),
        leading: IconButton(
          onPressed: () {},
          icon: Image.asset("assets/images/left-arrow1.png",
            width: 25,
          ),
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

      // TODO: The body of the app
      body: const CustomTabController(),
    );
  }
}
