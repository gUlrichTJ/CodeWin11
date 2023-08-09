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
class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Flutter Demo',
        theme: new ThemeData(
            primarySwatch: Colors.blue,
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
}


