import 'package:flutter/material.dart';
import 'package:shop_app/pages/safe/safe.page.dart';

class Overview extends StatefulWidget {
  const Overview({Key? key}) : super(key: key);

  @override
  State<Overview> createState() => _OverviewState();
}

class _OverviewState extends State<Overview> {

  int selectedIndex = 0;

  List<Widget> widgetOptions = <Widget>[
    SafeAr(),
    const Text("one"),
    const Text("two"),
    const Text("three"),
    const Text("four"),
    const Text("five"),
    const Text("six"),
    const Text("seven"),
  ];

  void onItemTap(int index) {
    setState(() {
      selectedIndex = index;
    });
  }

  @override
  Widget build(context) {
    return Scaffold(
      appBar: AppBar(
        elevation: 0,
        actions: [
          IconButton(
            onPressed: () {},
            icon: const Icon(
                Icons.settings_outlined,
              color: Colors.black54,
            ),
          ),
        ],
        backgroundColor: Colors.white,
      ),
      // body: firstPage(context),
      body: Center(
        child: widgetOptions.elementAt(selectedIndex),
      ),
      bottomNavigationBar: BottomNavigationBar(
        selectedItemColor: Colors.black,
        unselectedItemColor: Colors.blueAccent,
        selectedLabelStyle: const TextStyle(
          color: Colors.black,
        ),
        unselectedLabelStyle: const TextStyle(
          color: Colors.black45,
        ),
        items: const <BottomNavigationBarItem>[
          BottomNavigationBarItem(
            icon: Icon(
                Icons.home_filled,
              color: Colors.black38,
            ),
            label: "Home",
            backgroundColor: Colors.white,
          ),
          BottomNavigationBarItem(
            icon: Icon(
                Icons.book,
              color: Colors.black54,
            ),
            label: "Orders",
            backgroundColor: Colors.white,
          ),
          BottomNavigationBarItem(
            icon: Icon(
                Icons.keyboard_option_key ,
              color: Colors.black54,
            ),
            label: "Items",
          ),
          BottomNavigationBarItem(
            icon: Icon(
                Icons.stairs_outlined,
              color: Colors.black54,
            ),
            label: "Reports",
          ),
          BottomNavigationBarItem(
            icon: Icon(
                Icons.more_horiz_outlined,
              color: Colors.black54,
            ),
            label: "More",
          ),
        ],
        currentIndex: selectedIndex,
        onTap: onItemTap,
      ),
    );
  }
}
