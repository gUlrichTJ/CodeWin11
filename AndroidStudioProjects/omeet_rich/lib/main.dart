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
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or simply save your changes to "hot reload" in a Flutter IDE).
        // Notice that the counter didn't reset back to zero; the application
        // is not restarted.
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
