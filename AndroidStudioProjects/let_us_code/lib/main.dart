import 'package:flutter/material.dart';
import 'package:let_us_code/ui/pages/counter.page.dart';
import 'package:let_us_code/ui/pages/gallery.page.dart';
import 'package:let_us_code/ui/pages/home.page.dart';
import 'package:let_us_code/ui/pages/meteo.page.dart';

void main() => runApp(MyApp());


class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      routes: {
        "/home": (context)=>HomePage(),
        "/meteo": (context)=>MeteoPage(),
        "/gallery": (context)=>GalleryPage(),
        "/counter": (context)=>CounterPage()
      },
      theme: ThemeData(
        primarySwatch: Colors.deepOrange,
      ),
      initialRoute: "/",
      home: HomePage(),
    );
  }
}




