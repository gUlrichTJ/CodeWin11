import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.lightGreen,
        canvasColor: Colors.lightGreen.shade400,
      ),
      // The home
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
        title: const Text("Application"),
        actions: [
          IconButton(onPressed: () {},
              icon: const Icon(Icons.more_vert),
          ),
          IconButton(
              onPressed: () {},
              icon: const Icon(Icons.menu)
          ),
        ],
      ),

      body: const SafeArea(
        child: SingleChildScrollView(
          child: Padding(
            padding: EdgeInsets.all(16.0),
            child: Column(
              children: <Widget>[
                const ImageAndIconWidget(),
              ],
            ),
          ),
        ),
      ),
    );
  }
}

class ImageAndIconWidget extends StatelessWidget {
  const ImageAndIconWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
      children: <Widget>[
        Image(
            image: const AssetImage("assets/images/build.png"),
          fit: BoxFit.cover,
          width: MediaQuery.of(context).size.width / 3,
        ),
        Image.network("src"),
      ],
    );
  }
}

