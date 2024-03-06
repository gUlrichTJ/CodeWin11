import 'package:flutter/material.dart';
import 'package:github_mobile_app/pages/home.page.dart';
import 'package:github_mobile_app/pages/users.page.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      routes: {
        "/":(context)=>HomePage(),
        "/users":(context)=>UsersPage(),
      },
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.green),
            useMaterial3: true,
      ),
      debugShowCheckedModeBanner: false,
    );
  }
}
