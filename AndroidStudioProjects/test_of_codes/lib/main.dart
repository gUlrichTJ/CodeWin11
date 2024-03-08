import 'package:flutter/material.dart';
<<<<<<< HEAD
import 'package:test_of_codes/tuto_tts/tuto1/pages/home.page.dart';
=======
import 'package:test_of_codes/other/pages/dart/home/home.dart';
>>>>>>> refs/remotes/origin/main

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
<<<<<<< HEAD
      title: "Text To Speech",
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      routes: {
        "/":(context)=>HomePage2(),
      },
=======
      home: const OurHomePage(),
>>>>>>> refs/remotes/origin/main
    );
  }
}
