import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.lightGreen,
        canvasColor: Colors.lightGreen.shade200,
      ),

      home: const HomePage(),
    );
  }
}

class HomePage extends StatelessWidget {

  final List<TodoMenuItem> food
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("New Project"),
        actions: [
          IconButton(
            onPressed: () {},
              icon: const Icon(Icons.more_vert),
          ),
          PopupMenuButton<TodoMenuItem>(
            icon: const Icon(Icons.view_list),
            onSelected: ((valueSelected) {
              print('valueSelected: ${valueSelected.title}');
            }),
            itemBuilder: (BuildContext context) {
              return ;
            },
          ),
        ],
      ),
    );
  }
}

class TodoMenuItem {
  String title = "";
  Icon icon;

  // Constructor
  TodoMenuItem({required this.title, required this.icon});
}
