import 'package:flutter/material.dart';
import 'package:test_of_codes/widgets/animated_container.dart';

// import 'package:permission_handler/permission_handler.dart';
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
/* void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // Quand on tourne vers Lui les regards, on est rayonnant de
  // joie et le visage ne se couvre pas de honte.

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
      floatingActionButtonLocation: FloatingActionButtonLocation.endDocked,
      floatingActionButton: getFloatingActionButton(),

      // TODO: We use a bottomNavigationBar
      bottomNavigationBar: const BottomAppBarWidget(),
    );
  }

  FloatingActionButton getFloatingActionButton() {
    return FloatingActionButton.extended(
      onPressed: () {},
      icon: const Icon(Icons.play_arrow),
      label: const Text("Play"),
    );
  }
}

class BottomAppBarWidget extends StatelessWidget {
  const BottomAppBarWidget({
    super.key,
  });

  @override
  Widget build(BuildContext context) {
    return const BottomAppBar(
      color: Colors.lightGreen,
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        children: <Widget>[
          Icon(Icons.pause),
          Icon(Icons.stop),
          Icon(Icons.access_time),
          Padding(
              padding: EdgeInsets.all(30.0),
          ),
        ],
      ),
    );
  }
}

// A new class
class ContainerWithBoxDecorationWidget extends StatelessWidget {
  const ContainerWithBoxDecorationWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.center,
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        mainAxisSize: MainAxisSize.max,
        children: <Widget>[
          Container(
            height: 175.0,
            decoration: const BoxDecoration(
              borderRadius: BorderRadius.only(
                bottomLeft: Radius.circular(100.0),
                topRight: Radius.circular(100.0),
              ),
              gradient: LinearGradient(
                  colors: [
                    Colors.lightBlue,
                    Colors.green,
                  ],
              ),
              boxShadow: [
                BoxShadow(
                  color: Colors.black,
                  blurRadius: 10.0,
                  offset: Offset(0.0, 1.0),
                ),
              ],
            ),
            child: const Center(
            child: Center(
              child: Text(
                  "Container",
                style: TextStyle(
                  color: Colors.white,
                  decoration: TextDecoration.underline,
                  decorationColor: Colors.deepPurpleAccent,
                  decorationStyle: TextDecorationStyle.dashed,
                  decorationThickness: 1,
                  fontFamily: "arial",
                  fontStyle: FontStyle.normal,
                  fontWeight: FontWeight.bold,
                  fontSize: 30.0,
                ),
                maxLines: 4,
                overflow: TextOverflow.ellipsis,
              ),
            ),
            ),
          ),
          const Padding(padding: EdgeInsets.all(10)),
          const Divider(),
          const Text("Column 1"),
          const Divider(),
          const Text("Column 1"),
          const Divider(),
          const Text("Column 1"),
          const Divider(),
          const Text("Column 1"),
          const Divider(),

          /// We add a row
          const Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            mainAxisSize: MainAxisSize.max,
            crossAxisAlignment: CrossAxisAlignment.end,
            children: <Widget>[
              Text("Row 1"),
              Text("Row 2"),
              Text("Row 3"),
            ],
          ),
          const Divider(),

          // TODO: Let's put the flatButton
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: <Widget>[
                TextButton(
                    onPressed: () {},
                    child: const Text("Text button"),
                ),
              TextButton(
                  onPressed: () {},
                style: ButtonStyle(
                  foregroundColor: MaterialStateProperty.resolveWith((states) {
                      if (states.contains(MaterialState.dragged)) {
                        return Colors.white;
                      } if (states.contains(MaterialState.selected)) {
                        return Colors.green.shade900;
                      } if (states.contains(MaterialState.pressed)) {
                        return Colors.deepPurple.shade900;
                      } if (states.contains(MaterialState.hovered)) {
                        return Colors.black;
                      }
                      return Colors.black;
                    },
                  ),
                  backgroundColor: MaterialStateProperty.resolveWith((states) {
                    if (states.contains(MaterialState.selected)) {
                      return Colors.white12;
                    } if (states.contains(MaterialState.pressed)) {
                      return Colors.lightGreen.shade700;
                    }
                    return Colors.lightGreen.shade100;
                  }),
                ),
                  child: const Text("Hello you !"),
              ),
            ],
          ),
          TextButton(
              onPressed: () {},
            child: const Text("Flag"),
          ),
        ],
      ),
    );
  }
}

class BodyWidget extends StatefulWidget {
  const BodyWidget({
    super.key,
  });

  @override
  State<BodyWidget> createState() => _BodyWidgetState();
}

class _BodyWidgetState extends State<BodyWidget> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(

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

 */

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.cyan,
        canvasColor: Colors.cyan.shade400,
      ),
      home: OurBottomNavBar(),
    );
  }
}

class OurBottomNavBar extends StatefulWidget {
  const OurBottomNavBar({Key? key}) : super(key: key);

  @override
  State<OurBottomNavBar> createState() => _OurBottomNavBarState();
}

class _OurBottomNavBarState extends State<OurBottomNavBar> {

  int selectedIndex = 0;
  static const TextStyle textStyle = TextStyle(fontSize: 20, fontWeight: FontWeight.bold);
  List<Widget> widgetOption = <Widget> [
    Text("1", style: textStyle,),
    AnimatedContainerWidget(),
    Text("2", style: textStyle,),
    Text("3", style: textStyle,),
    Text("4", style: textStyle,),
    Text("5", style: textStyle,),
    Text("6", style: textStyle,),
  ];
  
  void onItemTap(int index) {
    setState(() {
      selectedIndex = index;
    });
  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        elevation: 2,
      ),
      body: Center(
        child: widgetOption.elementAt(selectedIndex),
      ),
      bottomNavigationBar: BottomNavigationBar(
        items: const <BottomNavigationBarItem>[
          BottomNavigationBarItem(
            icon: Icon(Icons.home),
            label: "Home",
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.radar),
            label: "Home",
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.school),
            label: "Home",
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.receipt_long),
            label: "Home",
          ),
        ],
        onTap: onItemTap,
        unselectedItemColor: Colors.blue,
        currentIndex: selectedIndex,
        selectedItemColor: Colors.deepPurpleAccent,
        backgroundColor: Colors.black12,
      ),
    );
  }
  SafeArea customColumnAnimatedWidget() {
    return SafeArea(
      child: Column(
        children: <Widget>[
          AnimatedContainerWidget(),
        ],
      ),

    );
  }
}


