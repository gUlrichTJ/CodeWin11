import 'package:bottom_nav_drawer/dartfiles/another.page.dart';
import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "Flutter page",
      theme: ThemeData(
        primarySwatch: Colors.cyan
      ),
      home: MyHomePage(),
    );
  }
}

// Stateful widget
class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Electrocution"),
        elevation: 0,
        actions: [
          IconButton(
            onPressed: () {

            },
            icon: Icon(Icons.search),
          ),
        ],
      ),
      drawer: Drawer(
        elevation: 0,
        child: ListView(
          children: [
            DrawerHeader(
                child: CircleAvatar(),
              decoration: BoxDecoration(
                border: Border.all(),
              ),
            ),
            ListTile(
              leading: Icon(Icons.business),
              title: Text("Business"),
              onTap: () {

              },
              // selected: ,
            ),
            ListTile(
              leading: Icon(Icons.school),
              title: Text("School"),
              onTap: () {

              },
              // selected: ,
            ),
            ListTile(
              leading: Icon(Icons.travel_explore),
              title: Text("Travel"),
              onTap: () {

              },
              // selected: ,
            ),
            ListTile(
              leading: Icon(Icons.table_bar),
              title: Text("Table"),
              onTap: () {

              },
              // selected: ,
            ),
            ListTile(
              leading: Icon(Icons.motorcycle),
              title: Text("motorcycle"),
              onTap: () {

              },
              // selected: ,
            ),
            ListTile(
              leading: Icon(Icons.laptop),
              title: Text("Laptop"),
              onTap: () {

              },
              // selected: ,
            ),
          ],
        ),
      ),
      body: Container(),
      bottomNavigationBar: BottomNavigationBar(
          items: [
            BottomNavigationBarItem(
                icon: Icon(Icons.home),
              label: "home",
            ),
            BottomNavigationBarItem(
                icon: Icon(Icons.sms),
              label: "sms",
            ),
            BottomNavigationBarItem(
                icon: Icon(Icons.book),
              label: "books",
            ),
            BottomNavigationBarItem(
                icon: Icon(Icons.timer),
                label: "timer"
            ),
            BottomNavigationBarItem(
                icon: Icon(Icons.camera),
                label: "camera"
            ),
          ],
        backgroundColor: Colors.cyan,
        unselectedItemColor: Colors.grey,
        selectedItemColor: Colors.black,
      ),
    );
  }
}

