import 'package:flutter/material.dart';
import 'package:yousfi/ui/pages/homegal/counter.file.dart';
import 'package:yousfi/ui/pages/homegal/gallery/gallery.file.dart';
import 'package:yousfi/ui/pages/homegal/home/home.file.dart';
import 'package:yousfi/ui/pages/homegal/meteo/meteo.file.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      routes: {
        "/home": (context) => HomePage(),
        "meteo": (context) => MeteoPage(),
        "gallery": (context) => GalleryPage(),
        "counter": (context)=>CounterPage(),
      },
      theme: ThemeData(
        primarySwatch: Colors.deepOrange,
        canvasColor: Colors.orange.shade300,
      ),
      /// The home pagge
      home: const HomePage(),
    );
  }
}


