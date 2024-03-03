import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:yousfi/ui/pages/homegal/home/home.file.dart';

class MyDrawer extends StatefulWidget {
  const MyDrawer({super.key});

  @override
  State<MyDrawer> createState() => _MyDrawerState();
}

class _MyDrawerState extends State<MyDrawer> {
  _close () {
    setState(() {
      Navigator.pop(context);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Drawer(
      backgroundColor: Colors.lightGreen.shade300,
      child: ListView(
        children: <Widget>[
          const DrawerHeader(
            decoration: BoxDecoration(
                gradient: LinearGradient(
                    colors: [
                      Colors.white12,
                      Colors.lightBlue,
                    ]
                )
            ),
            child: Center(
              child: CircleAvatar(
                radius: 50,
                backgroundImage: AssetImage(
                  "assets/images/about.png",
                ),
              ),
            ),
          ),
          /// After the drawerheader
          ListTile(
            title: const Text(
              "Home",
              style: TextStyle(fontSize: 22),
            ),
            leading: const Icon(
              Icons.home, color: Colors.green,
            ),
            trailing: const Icon(
              Icons.arrow_right, color: Colors.green,
            ),
            onTap: _close,
          ),
          ListTile(
            title: Text(
              "Meteo",
              style: TextStyle(fontSize: 22),
            ),
            leading: Icon(Icons.cloud, color: Colors.green,),
            trailing: Icon(Icons.arrow_right, color: Colors.green,),
            onTap: () {
              Navigator.of(context).pop();
              Navigator.of(context).pushNamed('meteo');
            }
          ),
          ListTile(
            title: Text(
              "Gallery",
              style: TextStyle(fontSize: 22),
            ),
            leading: Icon(Icons.browse_gallery, color: Colors.green,),
            trailing: Icon(Icons.arrow_right, color: Colors.green,),
            onTap: () {
              Navigator.of(context).pop();
              Navigator.of(context).pushNamed('gallery');
            }
          ),
        ],
      ),
    );
  }
}
