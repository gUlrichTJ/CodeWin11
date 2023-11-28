/*
import 'package:flutter/material.dart';

// The german Johannes Gutenberg has created the printing press

void main() => runApp(const MyApp());

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return const  MaterialApp(
      debugShowCheckedModeBanner: false,
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      drawer: Drawer(
        child: ListView(
          children: <Widget>[
            const DrawerHeader(
                decoration: BoxDecoration(
                  gradient: LinearGradient(
                    colors: [
                      Colors.red,
                      Colors.white38,
                    ],
                  ),
                ),
                child:  Center(
                  child: CircleAvatar(
                    radius: 50,
                    backgroundImage: AssetImage(''),
                  ),
                )
          ),
            ListTile(
              title: const Text(
                'Quiz',
                style: TextStyle(fontSize: 20),
              ),
              onTap: () {
                Navigator.of(context).pop();
              }
            ),
            const Divider(
              height: 2,
              color: Colors.deepOrange,
            ),
            ListTile(
              trailing: IconButton(
                icon: const Icon(Icons.more_vert),
                onPressed: () {},
              ),
              leading: const Icon(Icons.message),
              title: const Text(
                'Weather',
                style: TextStyle(fontSize: 20),
              ),
              onTap: () {
                Navigator.of(context).pop();
              }
            ),
            const Divider(
              height: 2,
              color: Colors.deepOrange,
            ),
            ListTile(
              title: const Text(
                'Gallery',
                style: TextStyle(fontSize: 20),
              ),
              onTap: () {
                Navigator.of(context).pop();
              }
            ),
            const Divider(
              height: 2,
              color: Colors.deepOrange,
            ),
            ListTile(
              title: const Text(
                'Camera',
                style: TextStyle(fontSize: 20),
              ),
              onTap: () {
                Navigator.of(context).pop();
              }
            ),
          ],
        ),
      ),
      bottomNavigationBar: BottomNavigationBar(
        items: const [
           BottomNavigationBarItem(
            icon: Icon(Icons.person),
              label: "person"
          ),
           BottomNavigationBarItem(
            icon: Icon(Icons.person),
              label: "person"
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.person),
            label: "person"
          ),
        ],

      ),
    );
  }
}
*/

import 'package:flutter/material.dart';

/// Flutter code sample for [TabBar].

void main() => runApp(const TabBarApp());

class TabBarApp extends StatelessWidget {
  const TabBarApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(useMaterial3: true),
      home: const TabBarExample(),
    );
  }
}

class TabBarExample extends StatelessWidget {
  const TabBarExample({super.key});

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      initialIndex: 1,
      length: 3,
      child: Scaffold(
        appBar: AppBar(
          title: const Text('TabBar Sample'),
          bottom: const TabBar(
            tabs: <Widget>[
              Tab(
                icon: Icon(Icons.cloud_outlined),
              ),
              Tab(
                icon: Icon(Icons.beach_access_sharp),
              ),
              Tab(
                icon: Icon(Icons.brightness_5_sharp),
              ),
            ],
          ),
        ),
        body: const TabBarView(
          children: <Widget>[
            Center(
              child: Text("It's cloudy here"),
            ),
            Center(
              child: Text("It's rainy here"),
            ),
            Center(
              child: Text("It's sunny here"),
            ),
          ],
        ),
      ),
    );
  }
}

