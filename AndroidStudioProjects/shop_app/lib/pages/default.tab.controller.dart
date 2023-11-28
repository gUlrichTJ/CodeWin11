import 'package:flutter/material.dart';

class CustomTabController extends StatelessWidget {
  const CustomTabController({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      initialIndex: 0,
        length: 5,
        child: Scaffold(
          appBar: AppBar(
            elevation: 0,
            bottom: const TabBar(
                tabs: <Widget>[
                  Text("ALL"),
                  Text("WOMEN"),
                  Text("MEN"),
                  Text("KIDS"),
                ],
            ),
          ),
          body: TabBarView(
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
