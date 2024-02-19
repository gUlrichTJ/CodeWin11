import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "read book",
      theme: ThemeData(
        primarySwatch: Colors.grey,
        canvasColor: Colors.grey.shade400,
      ),
      home: const OurHomePage(),
    );
  }
}

class OurHomePage extends StatefulWidget {
  const OurHomePage({Key? key}) : super(key: key);

  @override
  State<OurHomePage> createState() => _OurHomePageState();
}

class _OurHomePageState extends State<OurHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(

      ),
      drawer: const Drawer(),
      body: const SingleChildScrollView(
        padding: EdgeInsets.all(2.0),
        child: Column(
          children: <Widget>[],
        ),
      ),
    );
  }
}

