import 'package:flutter/material.dart';

class CustomTabController extends StatelessWidget {
  const CustomTabController({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      initialIndex: 1,
        length: 5,
        child: Scaffold(
          appBar: AppBar(
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
                
              ],
          ),
      ),
    );
  }
}
