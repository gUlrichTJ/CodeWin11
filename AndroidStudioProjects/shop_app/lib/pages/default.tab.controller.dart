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
            preferredSize: const Size.fromHeight(40),
            child: AppBar(
              backgroundColor: Colors.white,
              elevation: 0,
              bottom: const TabBar(
                  tabs: <Widget>[
                    Text(
                        "ALL",
                      style: TextStyle(
                        color: Colors.black,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    Text(
                        "WOMEN",
                      style: TextStyle(
                        color: Colors.black,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    Text(
                        "MEN",
                      style: TextStyle(
                        color: Colors.black,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    Text(
                        "KIDS",
                      style: TextStyle(
                        color: Colors.black,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
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
