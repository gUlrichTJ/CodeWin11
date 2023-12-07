import 'package:flutter/material.dart';
/*
void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.lightGreen,
        canvasColor: Colors.lightGreen.shade200,
        platform: TargetPlatform.android
      ),
      home: const HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  String note = "Tip A";

  int _selectedIndex = 0;

  double price = 0.0;

  /// The things that will appear in the code
  static const List<Widget> _widgetOption = <Widget>[
    Text("God is great"),
    Text("We'll stay with Him forever"),
    Text("We're His family"),
    Text("We're for Him forever"),
    Text("We're His offsprings"),
    Text("God do we love"),
  ];

  /// We will create a method that will increase the price of the object
  void _increasePrice() {
    setState(() {
     price += 50.0;
    });
  }

  ///
  void _onItemTaped(int index) {
    setState(() {
      _selectedIndex = index;
    });
  }

  /// On pressed method
  void _onPressed() {
    setState(() {
      note = "Tip B";
      debugPrint(note);
    });
  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(

      ),
      body: Column(
        children: <Widget>[
          _widgetOption.elementAt(_selectedIndex),
          Theme(
              data: Theme.of(context).copyWith(cardColor: Colors.deepOrange),
              child: const Card(
                child: Text("Unique theme price"),
              ),
          ),
          Text("$price"),
        ],
      ),
      bottomNavigationBar: BottomNavigationBar(
        items: const <BottomNavigationBarItem>[
          BottomNavigationBarItem(
              icon: Icon(Icons.height),
            label: "Hello",
          ),
          BottomNavigationBarItem(
              icon: Icon(Icons.line_weight),
              label: "Hello",
          ),
          BottomNavigationBarItem(
              icon: Icon(Icons.format_size_outlined),
              label: "Hello",
          ),
          BottomNavigationBarItem(
              icon: Icon(Icons.format_align_left),
              label: "Hello",
          ),
        ],
        currentIndex: _selectedIndex,
        showUnselectedLabels: true,
        showSelectedLabels: true,
        // backgroundColor: Colors.cyan,
        selectedItemColor: Colors.deepOrange,
        onTap: _onItemTaped,
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: _increasePrice,
        child: const Icon(Icons.speaker_rounded),
      ),
    );
  }
}

 */
void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.lightGreen,
        canvasColor: Colors.lightGreen.shade200,
      ),
      home: const HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        leading: IconButton(
          onPressed: () {},
          icon: const Icon(Icons.menu),
        ),
        title: const Text("Title"),
        actions: <Widget>[
          IconButton(
              onPressed: () {},
              icon: const Icon(Icons.search),
          ),
          // More vert
          IconButton(
            onPressed: () {},
            icon: const Icon(Icons.more_vert),
          )
        ],
        /// A flexible space in the appBar
        flexibleSpace: const SafeArea(
          child: Icon(
            Icons.photo_camera,
            size: 55.0,
            color: Colors.white38,
          ),
        ),
        /// Bottom in the appBar
        bottom: PreferredSize(
          preferredSize: const Size.fromHeight(55.0),
          child: Container(
            color: Colors.lightGreen.shade100,
            height: 75.0,
            width: double.infinity,
            child: const Center(
              child: Text("Bottom"),
            ),
          ),
        ),
      ),
      body: const Padding(
        padding: EdgeInsets.all(16.0),
        child: SafeArea(
          child: SingleChildScrollView(
            child: Column(
              children: <Widget>[
                /// We will create the class ContainerWithBoxDecoration
                ContainerWithBoxDecorationWidget(),
              ],
            ),
          ),
        ),
      ),
    );
  }
}

// A new class
class ContainerWithBoxDecorationWidget extends StatelessWidget {
  const ContainerWithBoxDecorationWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      children: <Widget>[
        Container(
          height: 175.0,
          decoration: const BoxDecoration(
            borderRadius: BorderRadius.only(
              bottomLeft: Radius.circular(100.0),
              bottomRight: Radius.circular(10.0),
            ),
            gradient: LinearGradient(
                colors: [
                  Colors.white38,
                  Colors.lightGreen,
                ],
            ),
            boxShadow: [
              BoxShadow(
                color: Colors.black,
                blurRadius: 10.0,
                offset: Offset(0.0, 1.0),
              ),
            ]
          ),
        ),
      ],
    );
  }
}


class BodyWidget extends StatelessWidget {
  const BodyWidget({
    super.key,
  });

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.all(16.0),
          child: Column(
            children: <Widget>[
              Row(
                children: <Widget>[
                  _container(Colors.yellow.shade900, 40.0, 40.0),
                  const Padding(padding: EdgeInsets.all(16.0)),
                  Expanded(
                    child: _container(Colors.yellow.shade700, 40.0, 40.0),
                  ),
                  const Padding(padding: EdgeInsets.all(16.0),),
                  _container(Colors.brown, 40.0, 40.0),
                  const Padding(padding: EdgeInsets.all(16.0)),
                  _container(Colors.deepOrange, 40.0, 40.0),
                ],
              ),
              /// We add a space before adding the next row
              const Padding(padding: EdgeInsets.all(16.0)),
              Row(
                children: <Widget>[
                  Column(
                    children: <Widget>[
                      _container(Colors.lime.shade200, 60.0, 60.0),
                      const Padding(padding: EdgeInsets.all(16.0)),
                      // We add another container
                      _container(Colors.lime.shade900, 40.0, 40.0),
                      const Padding(padding: EdgeInsets.all(16.0)),
                      _container(Colors.amber.shade700, 30.0, 30.0),
                      const Padding(padding: EdgeInsets.all(16.0)),
                    ],
                  ),
                ],
              ),
              const Divider(
                height: 4.0,
                color: Colors.white,
                thickness: 5.0,
              ),
              const Padding(padding: EdgeInsets.all(16.0)),
              Row(
                children: <Widget>[
                  CircleAvatar(
                    backgroundColor: Colors.blue.shade700,
                    radius: 100.0,
                    child: Stack(
                      children: <Widget>[
                        _container(Colors.cyan.shade50, 100.0, 100.0),
                        _container(Colors.cyan.shade100, 80.0, 80.0),
                        _container(Colors.cyan.shade300, 70.0, 70.0),
                        _container(Colors.cyan.shade500, 60.0, 60.0),
                        _container(Colors.cyan.shade700, 50.0, 50.0),
                        _container(Colors.cyan.shade800, 40.0, 40.0),
                        _container(Colors.cyan.shade900, 30.0, 30.0),
                      ],
                    ),
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}

Container _container(Color color_, double width_, double height_) {
  return Container(
    color: color_,
    width: width_,
    height: height_,
  );
}