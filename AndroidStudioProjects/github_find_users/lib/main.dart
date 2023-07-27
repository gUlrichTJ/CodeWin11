import 'package:flutter/material.dart';
import 'package:github_find_users/pages/home/home.page.dart';
import 'package:github_find_users/pages/users/users.page.dart';

void main() {
  runApp(new MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.green,
      ),
      routes: {
        "/": (context)=>HomePage(),
        "/users": (context)=>UsersPage()
      },
      // Route initiale
      initialRoute: "/users",
      //home: HomePage(),
    );
  }
}


