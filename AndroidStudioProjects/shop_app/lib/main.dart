import 'package:flutter/material.dart';
import 'package:shop_app/pages/home.page.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: const MyHomePage(),
      theme: ThemeData(
        brightness: Brightness.light,
      primarySwatch: ,
        appBarTheme: const AppBarTheme(
          centerTitle: true,
        )
      ),
    );
  }
}
