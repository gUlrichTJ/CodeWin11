import 'package:flutter/material.dart';

class CameraPage extends StatelessWidget {
  const CameraPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.deepOrange,
      ),
      body: Center(
        child: Text(
          "Camera",
          style: TextStyle(fontSize: 22),
        ),
      ),
    );
  }
}
