import 'package:flutter/material.dart';
/// Nous créons cette classe comme étant un drawer

class OurDrawer extends StatelessWidget {
  const OurDrawer({super.key});

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
            trailing: Icon(Icons.car_crash),

            onTap: () {
              Navigator.of(context).pop();
            },
          )
        ],
      ),
    );
  }
}