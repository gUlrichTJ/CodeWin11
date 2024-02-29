import 'package:flutter/material.dart';
import 'package:o_talents_debug/dart/pages/home.file.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.orange,
        canvasColor: Colors.orange.shade400,
      ),
      home: const HomePage(),
    );
  }
}
