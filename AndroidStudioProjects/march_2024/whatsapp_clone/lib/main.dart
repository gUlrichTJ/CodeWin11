import 'package:flutter/material.dart';
import 'package:whatsapp_clone/whatsapp/home/home_whatsapp.dart';
import 'package:whatsapp_clone/whatsapp/home/home_whatsapp2.dart';

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
        primarySwatch: Colors.cyan,
        canvasColor: Colors.lightGreen.shade200,
      ),
      title: "Read your books quickly",
      debugShowCheckedModeBanner: false,
      home: WhatsappHome2(),
    );
  }
}
