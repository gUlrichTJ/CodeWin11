import 'package:flutter/material.dart';

// TODO: The things that will stay in the bottom of the tabbars

class CustomBodyTabBar extends StatelessWidget {
  const CustomBodyTabBar({
    super.key,
  });

  @override
  Widget build(BuildContext context) {
    return const TabBarView(
        children: <Widget>[
          Center(
            child: Text("It is cloudy here"),
          ),
          Center(
            child: Text("It is cloudy here"),
          ),
          Center(
            child: Text("It is cloudy here"),
          ),
          Center(
            child: Text("It is cloudy here"),
          )
        ],
    );
  }
}

// TODO: The tabbar where we will write all, men, child...
TabBar buildTabBar() {
  return TabBar(
    tabs: <Widget>[
      const Text(
        "ALL",
        style: TextStyle(
          color: Colors.black,
          fontWeight: FontWeight.bold,
        ),
      ),
      const Text(
        "WOMEN",
        style: TextStyle(
          color: Colors.black,
          fontWeight: FontWeight.bold,
        ),
      ),
      const Text(
        "MEN",
        style: TextStyle(
          color: Colors.black,
          fontWeight: FontWeight.bold,
        ),
      ),
      const Text(
        "KIDS",
        style: TextStyle(
          color: Colors.black,
          fontWeight: FontWeight.bold,
        ),
      ),
      IconButton(
        onPressed: () {},
        icon: const Icon(
          Icons.table_bar,
          size: 20,
          color: Colors.black,
        ),
      )
    ],
  );
}
