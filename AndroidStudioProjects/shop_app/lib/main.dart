import 'package:flutter/material.dart';
import 'package:shop_app/pages/home.page.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: const MyHomePage(),
      theme: ThemeData(
        appBarTheme: const AppBarTheme(
          centerTitle: true,
        )
      ),
    );
  }
}
