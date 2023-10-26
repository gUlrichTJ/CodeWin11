// TODO: Comment utiliser sizedBox et Stack. Stack permet d'avoir une pile
/*import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.cyan,
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
      debugShowCheckedModeBanner: false,
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        title: Text(widget.title),
      ),
      body: Center(
        child: Stack(
          children: [
            SizedBox( // TODO: Boite ayant une taille fixe
              width: 250,
              height: 250,
              child: Stack(
                children: <Widget>[
                  Container(
                    width: 250,
                    height: 250,
                    color: Colors.white,
                  ),
                  Container(
                    padding: const EdgeInsets.all(5.0),
                    alignment: Alignment.bottomCenter,
                    decoration: const BoxDecoration(
                      gradient: LinearGradient(
                        begin: Alignment.topCenter,
                        end: Alignment.bottomCenter,
                        colors: <Color>[
                          Colors.yellow,
                          Colors.red,
                        ],
                      ),
                    ),
                    child: const Text(
                      'Foreground Text',
                      style: TextStyle(color: Colors.white, fontSize: 20.0),
                    ),
                  ),
                ],
              ),
            ),
            Container(
              height: 20,
              width: 60,
              color: Colors.cyan,
            ),
            Container(
              height: 50,
              width: 40,
              color: Colors.deepOrange,
            ),
            Container(
              height: 100,
              width: 20,
              color: Colors.pink,
            ),
          ],
        ),
      ),
    );
  }
}

 */

import 'package:flutter/material.dart';

/// Flutter code sample for [SingleChildScrollView].

void main() => runApp(const SingleChildScrollViewExampleApp());

class SingleChildScrollViewExampleApp extends StatelessWidget {
  const SingleChildScrollViewExampleApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: SingleChildScrollViewExample(),
    );
  }
}

class SingleChildScrollViewExample extends StatelessWidget {
  const SingleChildScrollViewExample({super.key});

  @override
  Widget build(BuildContext context) {
    return DefaultTextStyle(
      style: Theme.of(context).textTheme.bodyMedium!,
      child: LayoutBuilder(
        builder: (BuildContext context, BoxConstraints viewportConstraints) {
          return SingleChildScrollView(
            child: ConstrainedBox(
              constraints: BoxConstraints(
                minHeight: viewportConstraints.maxHeight,
              ),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                mainAxisAlignment: MainAxisAlignment.spaceAround,
                children: <Widget>[
                  Container(
                    // A fixed-height child.
                    color: const Color(0xffeeee00), // Yellow
                    height: 120.0,
                    alignment: Alignment.center,
                    child: const Text('Fixed Height Content'),
                  ),
                  Container(
                    // Another fixed-height child.
                    color: const Color(0xff008000), // Green
                    height: 120.0,
                    alignment: Alignment.center,
                    child: const Text('Fixed Height Content'),
                  ),
                ],
              ),
            ),
          );
        },
      ),
    );
  }
}
