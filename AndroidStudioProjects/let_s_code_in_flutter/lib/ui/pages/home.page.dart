import "package:flutter/material.dart";
import "package:let_s_code_in_flutter/ui/drawer.page.dart";

class HomePage extends StatelessWidget {
  // Constructor
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      drawer: OurDrawer(),
      appBar: AppBar(
        title: Text("Graciano's Page",
        ),
      ),

      // Le body
      body: Center(
        child: Text("Welcome to our youtube channel",
          style: TextStyle(fontSize: 40,
              backgroundColor: Colors.lightBlueAccent,
              fontFamily: "sans serif",
            fontStyle: FontStyle.normal,
            fontWeight: FontWeight.bold,
            color: Colors.black45
          ),
        ),
      ),
    );
  }
}