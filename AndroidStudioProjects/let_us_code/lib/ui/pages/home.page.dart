import 'package:flutter/material.dart';

import '../widgets/drawer.widgets.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold (
      drawer: MyDrawer(),
      appBar: AppBar(title: const Text("Home"),),
      body: Center(
        child: Text("Home Page",
          style: Theme.of(context).textTheme.headline3,
        ),
      ),
    );
  }
}