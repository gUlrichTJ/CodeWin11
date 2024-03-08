import 'package:flutter/material.dart';
<<<<<<< HEAD
import 'package:test_of_codes/whatsapp/home/home_whatsapp.dart';
=======
import 'package:test_of_codes/tuto_tts/tuto1/pages/home.page.dart';
>>>>>>> 07249d0ccf8444de77f39f57d8785aa3764ea0da

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
<<<<<<< HEAD
      theme: ThemeData(
        primarySwatch: Colors.cyan,
        canvasColor: Colors.lightGreen.shade200,
      ),
      title: "Read your books quickly",
      debugShowCheckedModeBanner: false,
      home: const WhatsappHome(),
=======
      home: HomePage2(),
>>>>>>> 07249d0ccf8444de77f39f57d8785aa3764ea0da
    );
  }
}

