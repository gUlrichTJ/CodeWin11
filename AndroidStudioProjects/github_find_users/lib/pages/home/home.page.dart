import 'package:flutter/material.dart';

// Hard working
class HomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Home'),
        elevation: 0,
      ),
      drawer: Drawer(),
      body: Center(
        child: Text('Home'),
      ),
    );
  }
}
