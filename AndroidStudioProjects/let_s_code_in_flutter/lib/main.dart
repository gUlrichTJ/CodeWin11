import 'package:flutter/material.dart';
import './quiz.dart';
import './camera.dart';
import './gallery.dart';
import './weather.dart';

void main() {
  runApp(
    MaterialApp(
      debugShowCheckedModeBanner: false,
      home: MyApp(),
    ),
  );
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      drawer: Drawer(
        child: ListView(
          children: <Widget>[
            DrawerHeader(
                decoration: BoxDecoration(
                  gradient: LinearGradient(
                    colors: [
                      Colors.deepOrange,
                      Colors.white38,
                    ],
                  ),
                ),
                child: Center(
                  child: CircleAvatar(
                    radius: 50,
                    backgroundImage: AssetImage(''),
                  ),
                )),
            ListTile(
              title: Text(
                'Quiz',
                style: TextStyle(fontSize: 20),
              ),
              onTap: () {
                Navigator.of(context).pop();
                Navigator.push(
                    (context), MaterialPageRoute(builder: (context) => Quiz()));
              },
            ),
            Divider(
              height: 2,
              color: Colors.deepOrange,
            ),
            ListTile(
              title: Text(
                'Weather',
                style: TextStyle(fontSize: 20),
              ),
              onTap: () {
                Navigator.of(context).pop();
                Navigator.push((context),
                    MaterialPageRoute(builder: (context) => Weather()));
              },
            ),
            Divider(
              height: 2,
              color: Colors.deepOrange,
            ),
            ListTile(
              title: Text(
                'Gallery',
                style: TextStyle(fontSize: 20),
              ),
              onTap: () {
                Navigator.of(context).pop();
                Navigator.push((context),
                    MaterialPageRoute(builder: (context) => Gallery()));
              },
            ),
            Divider(
              height: 2,
              color: Colors.deepOrange,
            ),
            ListTile(
              title: Text(
                'Camera',
                style: TextStyle(fontSize: 20),
              ),
              onTap: () {
                Navigator.of(context).pop();
                Navigator.push((context),
                    MaterialPageRoute(builder: (context) => CameraPage()));
              },
            ),
          ],
        ),
      ),
      appBar: AppBar(

        title: Text("My App"),
        backgroundColor: Colors.deepOrange,
      ),
      body: Center(
        child: Text(
          'Hello IIBDCC',
          style: TextStyle(fontSize: 22, color: Colors.deepOrange),
        ),
      ),
    );
  }
}
