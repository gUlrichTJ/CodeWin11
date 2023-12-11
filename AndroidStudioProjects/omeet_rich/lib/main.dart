import 'package:flutter/material.dart';
import 'package:omeet_rich/Pages/FirstPage.dart';
import 'package:omeet_rich/Utils/GeneralUtils.dart';

import 'Pages/HomePage.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {

  Orientation? orientation;

  MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {

    if(MediaQuery.orientationOf(context)!=orientation) {
      ScreenSize.width = MediaQuery.of(context).size.width;
      ScreenSize.height = MediaQuery.of(context).size.height;
      orientation = MediaQuery.orientationOf(context);
    }

    return MaterialApp(
      title: 'Flutter Demo',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      routes: {
        "/firstPage" : (BuildContext context ) => FirstPage(),
        "/home" : (BuildContext context ) => HomePage(),
      },
      home: FirstPage(),
    );
  }
}
