import 'package:flutter/material.dart';
import 'package:test_of_codes/tuto_tts/tuto1/pages/home.page.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: HomePage2(),
    );
  }
}

