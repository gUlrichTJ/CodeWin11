import 'dart:io';

import 'package:books_reader/other/pages/dart/our_home_page.dart';
import 'package:flutter/material.dart';

void main () {
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      title: "Read your books quickly",
      debugShowCheckedModeBanner: false,
      home: OurHomePage(),
    );
  }
}

