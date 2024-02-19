import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      actions: [
        IconButton(
          onPressed: () {},
            icon: Icon(Icons.mark_as_unread),
        ),

      ],
    );
  }
}
