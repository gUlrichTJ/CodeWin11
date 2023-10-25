import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

// TODO: MyApp class
class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Let's clone chrome",
      debugShowCheckedModeBanner: false,
      /**
       * theme: ThemeData(
        primarySwatch: Colors.cyan,
      ),
       */
      home: MyHomePage(),
    );
  }
}

// TODO: Home page
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
        // The icon of home
        leading: IconButton(
          onPressed: () {

          },
          icon: Icon(Icons.home_outlined),
        ),
        actions: [
          IconButton(
              onPressed: () {

              },
              icon: CircleAvatar(
                //backgroundImage: NetworkImage('https://media.licdn.com/media/AAYQAQSOAAgAAQAAAAAAAB-zrMZEDXI2T62PSuT6kpB6qg.png'),
                backgroundImage: NetworkImage("http://cdn.primedia.co.za/primedia-broadcasting/image/upload/c_fill,w_847/fvzlw5w65lxgv9zlussq"),
              ),
          ),
          IconButton(
          onPressed: () {

    },
          icon: Icon(
              Icons.square,
            size: 20,
            fill: 0.0,
            weight: 0.1,
          )
          ),
          PopupMenuButton(
            icon: Icon(Icons.more_vert),
            itemBuilder: (context) =>
          ),
        ],
      ),
    );
  }
}

// We will try to create our icon
class HistoryIcon extends Icon {
  HistoryIcon(super.key);

  @override
  Widget build(BuildContext context) {
    return Container(
      height: 3,
      width: 3,
      child: Text("${nombre_donglet_ouvert()}"),
    );
  }
}

// Methode pour connaître le nombre d'onglets ouverts
int nombre_donglet_ouvert() {
  int i = 3;
  return i;
}
