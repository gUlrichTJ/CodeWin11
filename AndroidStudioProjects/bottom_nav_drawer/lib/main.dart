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

  List<Widget> _widgetOption = [
    ListTileExample(),
    
  ];
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
      body: ListTileExample(),
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

class ListTileExample extends StatelessWidget {
  const ListTileExample({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('ListTile Sample')),
      body: ListView(
        children: const <Widget>[
          Card(child: ListTile(title: Text('One-line ListTile'))),
          Card(
            child: ListTile(
              leading: FlutterLogo(),
              title: Text('One-line with leading widget'),
            ),
          ),
          Card(
            child: ListTile(
              title: Text('One-line with trailing widget'),
              trailing: Icon(Icons.more_vert),
            ),
          ),
          Card(
            child: ListTile(
              leading: FlutterLogo(),
              title: Text('One-line with both widgets'),
              trailing: Icon(Icons.more_vert),
            ),
          ),
          Card(
            child: ListTile(
              title: Text('One-line dense ListTile'),
              dense: true,
            ),
          ),
          Card(
            child: ListTile(
              leading: FlutterLogo(size: 56.0),
              title: Text('Two-line ListTile'),
              subtitle: Text('Here is a second line'),
              trailing: Icon(Icons.more_vert),
            ),
          ),
          Card(
            child: ListTile(
              leading: FlutterLogo(size: 72.0),
              title: Text('Three-line ListTile'),
              subtitle:
              Text('A sufficiently long subtitle warrants three lines.'),
              trailing: Icon(Icons.more_vert),
              isThreeLine: true,
            ),
          ),
        ],
      ),
    );
  }
}

// TODO: A class for the second page
class ListViewClass extends StatefulWidget {
  const ListViewClass({Key? key}) : super(key: key);

  @override
  State<ListViewClass> createState() => _ListViewClassState();
}

class _ListViewClassState extends State<ListViewClass> {
  @override
  Widget build(BuildContext context) {
    return const Placeholder();
  }
}

