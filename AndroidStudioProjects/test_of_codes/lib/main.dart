import 'package:flutter/material.dart';
import 'package:test_of_codes/other/pages/dart/home/home.dart';

void main () {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.lightGreen,
        canvasColor: Colors.lightGreen.shade200,
      ),
      title: "Read your books quickly",
      debugShowCheckedModeBanner: false,
      home: const OurHomePage(),
    );
  }
}
