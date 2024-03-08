import 'package:flutter/material.dart';
import 'package:test_of_codes/whatsapp/home/home_whatsapp.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.cyan,
        canvasColor: Colors.lightGreen.shade200,
      ),
      title: "Read your books quickly",
      debugShowCheckedModeBanner: false,
      home: const WhatsappHome(),
    );
  }
}

