import 'package:flutter/material.dart';

class Overview extends StatefulWidget {
  const Overview({Key? key}) : super(key: key);

  @override
  State<Overview> createState() => _OverviewState();
}

class _OverviewState extends State<Overview> {

  int selectedIndex = 0;
  List<Widget> widgetOptions = <Widget>[
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
  Widget build(BuildContext context) {
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
      body: firstPage(context),
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
                Icons.add_box_outlined,
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
      ),
    );
  }

  SafeArea firstPage(BuildContext context) {
    return SafeArea(
      child: SingleChildScrollView(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: <Widget>[
            const Padding(
              padding: EdgeInsets.all(14.0),
              child: Text(
                  "Overview",
                style: TextStyle(
                  fontSize: 35,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
            Container(height: 10,),
            Padding(
              padding: const EdgeInsets.all(15.0),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Container(
                    height: 101/*MediaQuery.of(context).size.width * 0.25*/,
                    width: MediaQuery.of(context).size.width * 0.4,
                    decoration: BoxDecoration(
                      borderRadius: BorderRadius.circular(10),
                      color: Colors.grey.shade300,
                    ),
                    child: childPadding("Total sales", "\$12,345"),
                  ),
                  Container(
                    height: 101,
                    width: MediaQuery.of(context).size.width * 0.38,
                    decoration: BoxDecoration(
                      borderRadius: BorderRadius.circular(10),
                      color: Colors.grey.shade300,
                    ),
                    child: childPadding("Total orders", "1,234"),
                  ),
                ],
              ),
            ),
            Container(height: 20,),
            Center(
              child: Container(
                height: 101,
                width: MediaQuery.of(context).size.width * 0.92,

                decoration: BoxDecoration(
                  color: Colors.grey.shade300,
                  borderRadius: BorderRadius.circular(10.0),
                ),
                child: childPadding("Total items", "123"),
              ),
            ),
            Container(height: 10,),
            const Padding(
              padding: EdgeInsets.all(17.0),
              child: Text(
                  "Recent activity",
                style: TextStyle(
                  fontSize: 20,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(17.0),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                mainAxisSize: MainAxisSize.max,
                children: [
                  const Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      Text(
                          "New order",
                        style: TextStyle(
                          fontSize: 16,
                        ),
                      ),
                      Text(
                          "2:34 PM",
                        style: TextStyle(
                          fontSize: 16.0,
                        ),
                      ),
                    ],
                  ),
                  Container(height: 20,),
                  const Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      Text(
                        "New sale",
                        style: TextStyle(
                          fontSize: 16,
                        ),
                      ),
                      Text(
                        "2:34 PM",
                        style: TextStyle(
                          fontSize: 20,
                        ),
                      ),
                    ],
                  ),
                  Container(height: 20,),
                  const Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      Text(
                        "Inventory law",
                        style: TextStyle(
                          fontSize: 16,
                        ),
                      ),
                      Text(
                        "2:34 PM",
                        style: TextStyle(
                          fontSize: 16,
                        ),
                      ),
                    ],
                  ),
                ],
              ),
              
            ),
            // Another container
            const Padding(
              padding: EdgeInsets.all(17.0),
              child: Text(
                "Navigation",
                style: TextStyle(
                  fontSize: 20,
                  fontWeight: FontWeight.bold,
                ),
                textAlign: TextAlign.left,
              ),
            ),
            Column(
              children: [
                ListTile(
                  trailing: IconButton(
                    onPressed: () {},
                    icon: const Icon(Icons.arrow_right_alt),
                  ),
                  title: const Text("Inventory"),
                  subtitle: const Text("Manage your inventory"),
                ),
                ListTile(
                  trailing: IconButton(
                    onPressed: () {},
                    icon: const Icon(Icons.arrow_right_alt),
                  ),
                  title: const Text("Sales"),
                  subtitle: const Text("View your sales report"),
                ),
                ListTile(
                  trailing: IconButton(
                    onPressed: () {},
                    icon: const Icon(Icons.arrow_right_alt),
                  ),
                  title: const Text("Employees"),
                  subtitle: const Text("Manage your team"),
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }

  Padding childPadding(String string1, String string2) {
    return  Padding(
        padding: const EdgeInsets.all(18.0),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
                // Before I finish my formation at CIC, I'm already
              // asked work
            children: [
              Text(
                  string1,
                  textAlign: TextAlign.left,
                  style: const TextStyle(
                    fontSize: 18,
                    fontWeight: FontWeight.bold,
                  ),
                ),
            Container(height: 10,),
            Text(
                string2,
                textAlign: TextAlign.left,
                style: const TextStyle(
                fontSize: 25,
                fontWeight: FontWeight.bold,
              ),
           ),
        ],
      ),
    );
  }
}
