import 'package:flutter/material.dart';
import 'dart:ui' show lerpDouble;

/*void main() {
  */
/*try {
    print(int.parse("source"));
  } catch (ex) {}
  try {
    int.parse("mark");
  } catch (ex) {
    print(ex);
  } finally {
    print("I love you too much");
  }*/ /*
  print("Start main");
  Future<String> future = createFutureCounter(1000);
  print("Adding Future API callbacks");
  future.then((value) => handleCompletion(value)).catchError((err) =>
  handleError(err));
  print("Finish main");
}

Future<String> createFutureCounter(int count) {
  return new Future(() {
    return countUp(count);
  });
}

String countUp(int count) {
  print("Start count up");
  StringBuffer sb = new StringBuffer();
  for (int i = 0; i< count; i++) {
    if (i > 500) {
      throw new Exception("Over 500 not allowed.");
    }
    sb.write("${i} ");
  }
  print("Finish count up");
  return sb.toString();
}

void handleError(err) {
  print("Async operation errored : ${err}");
}

void handleCompletion(value) {
  print("Async opration succeeded ${value}");
}*/
/*
String countUp(int count) {
  print("Print count up");
  StringBuffer sb = new StringBuffer();
  for (int i = 0; i < count; i++) {
    sb.write("${i} ");
  }
  print("Finish count up");
  return sb.toString();
}

Future<String> createFutureCounter(int count) {
  return new Future(() {
    return countUp(count);
  });
}

void countUpAsynchronously(int count) async {
  print("Async operation start");
  String value = await createFutureCounter(count);
  print("Async operation succeede: ${value}");
}

void main() {
  print('start main');
  countUpAsynchronously(100);
  print("finish main");
}*/
/*void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
        title: 'Flutter Demo',
        theme: new ThemeData(
            primarySwatch: Colors.lightBlue,
        ),
        home: MyHomePage(title: 'Flutter Demo Home Page', ),);
  }
}

class MyHomePage extends StatefulWidget {

  final String title;
  const MyHomePage({required this.title});
  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }

  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      appBar: new AppBar(
        title: new Text(widget.title),
      ),
      body: new Center(
        child: new Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            new Text(
              'You have pushed the button this many times:',
            ),
            new Text(
              '$_counter',
              style: Theme
                  .of(context)
                  .textTheme
                  .displayLarge,
            ),
          ],
        ),
      ),
      floatingActionButton: new FloatingActionButton(
        onPressed: _incrementCounter,
        tooltip: 'Increment',
        child: new Icon(Icons.add),
      ),
    );
  }
}*/
/*

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blueGrey,
      ),
      home: new MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key});

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: new Text('Flutter Demo Page ${_counter}'),
      ),
      body: new Center(
        child: new Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            new Text(
              'You have pushed the button this many times: ',
            ),
            new Text(
              '${_counter}',
              style: Theme.of(context).textTheme.displayMedium,
            ),
          ],
        ),
      ),
      floatingActionButton: new FloatingActionButton(
        onPressed: _incrementCounter,
        tooltip: 'Increment',
        child: new Icon(Icons.add),
      ),
    );
  }
}
*/

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "Flutter Demo",
      theme: new ThemeData(
        primarySwatch: Colors.cyan,
      ),
      home: new MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({super.key});

  @override
  _MyHomePageState createState() => new _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'Flutter Foundation Page ${_counter}',
          style: const TextStyle(
            fontSize: 21,
            fontWeight: FontWeight.bold,
            fontStyle: FontStyle.normal,
            fontFamily: "Serif",
            color: Colors.black,
          ),
        ),
      ),
      body: Center(
        child: new Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            new Text(
                'You have pushed the button this many times',
              style: TextStyle(
                  fontSize: 20
              ),
            ),
            new Text(
              '${_counter++}',
              style: TextStyle(
                fontFamily: "Comic Sans MS",
                fontStyle: FontStyle.normal,
                fontWeight: FontWeight.bold,
                fontSize: 40,
              ),
            )
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: _incrementCounter,
        tooltip: 'Increment',
        child: Icon(Icons.add),
      ),
    );
  }
}
