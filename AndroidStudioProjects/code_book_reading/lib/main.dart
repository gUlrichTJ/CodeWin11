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
            color: Colors.lightGreen.shade200,
            icon: const Icon(Icons.view_list),
            onSelected: ((valueSelected) {
              debugPrint('valueSelected: ${valueSelected.title}');
            }),
            itemBuilder: (BuildContext context) {
              return TodoMenuItem.foodMenuList.map((TodoMenuItem todoMenuItem) {
                return PopupMenuItem<TodoMenuItem>(
                  value: todoMenuItem,
                    child: Row(
                      children: <Widget>[
                        Icon(todoMenuItem.icon.icon),
                        Padding(padding: EdgeInsets.all(8.0)),
                        Text(todoMenuItem.title),
                      ],
                    ),
                );
              }).toList();
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

  static List<TodoMenuItem> foodMenuList = [
    TodoMenuItem(title: 'Fast Food', icon: const Icon(Icons.fastfood)),
    TodoMenuItem(title: 'Remind Me', icon: const Icon(Icons.add_alarm)),
    TodoMenuItem(title: 'Flight', icon: const Icon(Icons.flight)),
    TodoMenuItem(title: 'Music', icon: const Icon(Icons.audiotrack)),
  ];

}
