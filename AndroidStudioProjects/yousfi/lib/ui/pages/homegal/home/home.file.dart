import 'package:flutter/material.dart';
import 'package:yousfi/ui/widgets/mydrawer.file.dart';


class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      /// The drawer
      drawer: const MyDrawer(

      ),
      /// The appbar
      appBar: AppBar(
        backgroundColor: Colors.lightGreen,
        title: const Text("Home"),
      ),
      backgroundColor: Colors.lightGreen.shade400,
      body: Center(
        child: Text(
          "Home Page",
          style: Theme.of(context).textTheme.displayMedium,
        ),
      ),
    );

  }
}
