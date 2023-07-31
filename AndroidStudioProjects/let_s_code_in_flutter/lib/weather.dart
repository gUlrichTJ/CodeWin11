import 'package:flutter/material.dart';

class Weather extends StatelessWidget {
  const Weather({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.deepOrange,
      ),
      body: Center(
        child: Text(
          "Weather",
          style: TextStyle(fontSize: 22),
        ),
      ),
    );
  }
}
