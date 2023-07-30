import 'package:flutter/material.dart';
import 'package:let_s_code_in_flutter/ui/pages/hello.page.dart';
/// Nous créons cette classe comme étant un drawer

class OurDrawer extends StatefulWidget {
  const OurDrawer({super.key});

  @override
  State<OurDrawer> createState() => _OurDrawerState();
}

class _OurDrawerState extends State<OurDrawer> {
  @override
  Widget build(BuildContext context) {
    return Drawer(
      child: ListView(
        children: [
          DrawerHeader(
              decoration: BoxDecoration(
                gradient: LinearGradient(
                  colors: [
                    Colors.lightBlue.shade200,
                    Colors.blue.shade900,
                  ],
                ),
              ),

            // The child of the drawer header
            child: Center(
              child: CircleAvatar(
                backgroundColor: Colors.white38,
              ),
            ),
          ),
          ListTile(
            title: Text("Hello"),
            trailing: Icon(
                Icons.car_crash,
              color: Colors.lightBlue.shade900,
            ),
          ),
        ],
      ),
    );
  }
}