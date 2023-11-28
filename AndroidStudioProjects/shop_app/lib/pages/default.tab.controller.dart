import 'package:flutter/material.dart';

class CustomTabController extends StatelessWidget {
  const CustomTabController({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      initialIndex: 0,
        length: 5,
        child: Scaffold(
          appBar: PreferredSize(
            preferredSize: const Size.fromHeight(50),
            child: AppBar(
              backgroundColor: Colors.white,
              elevation: 0,
              bottom: TabBar(
                  tabs: <Widget>[
                    const Text(
                        "ALL",
                      style: TextStyle(
                        color: Colors.black,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    const Text(
                        "WOMEN",
                      style: TextStyle(
                        color: Colors.black,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    const Text(
                        "MEN",
                      style: TextStyle(
                        color: Colors.black,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    const Text(
                        "KIDS",
                      style: TextStyle(
                        color: Colors.black,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    IconButton(
                        onPressed: () {},
                        icon: const Icon(
                            Icons.table_bar,
                          size: 20,
                        ),
                    )
                  ],
              ),
            ),
          ),
          body: const TabBarView(
              children: <Widget>[
                Center(
                  child: Text("It is cloudy here"),
                ),
                Center(
                  child: Text("It is cloudy here"),
                ),
                Center(
                  child: Text("It is cloudy here"),
                ),
                Center(
                  child: Text("It is cloudy here"),
                )
              ],
          ),
      ),
    );
  }
}
