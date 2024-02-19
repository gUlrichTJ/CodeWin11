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
        actions: <Widget>[
          IconButton(
              onPressed: () {},
              icon: const Icon(
                  Icons.more_vert,
              ),
          ),
        ],
      ),
      drawer: const Drawer(),
      body:  SingleChildScrollView(
        padding: const EdgeInsets.all(2.0),
        child: Column(
          children: <Widget>[
            Container(
              decoration: BoxDecoration(
                borderRadius: const BorderRadius.all(Radius.circular(10)),
                color: Colors.black,
                gradient: LinearGradient(
                  colors: [
                    Colors.orange,
                    Colors.yellow.shade100,
                  ],
                ),
                boxShadow: const  [
                  BoxShadow(
                    color: Colors.black,
                    blurRadius: 2.0
                  ),
                ],
              ),
                child: const Expanded(
                  child: Center(
                    child: SizedBox(
                      width: 100,
                      height: 100,
                    ),
                  ),
                ),

            ),
          ],
        ),
      ),
    );
  }
}

