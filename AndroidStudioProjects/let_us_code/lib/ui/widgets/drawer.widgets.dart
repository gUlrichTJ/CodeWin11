import 'package:flutter/material.dart';

/**Nous créons un stateless widget que nous appelons drawer*/
class MyDrawer extends StatelessWidget {
  const MyDrawer({super.key});

  @override
  Widget build(BuildContext context) {
    return Drawer(
      child: ListView(
        children: [
          DrawerHeader(
            decoration: BoxDecoration(
                gradient: LinearGradient(
                    colors: [
                      Colors.white,
                      Colors.deepOrange
                    ]
                )
            ),
            child: Center(
              child: CircleAvatar(
                backgroundImage: AssetImage("images/images/about.png"),
                radius: 80,
              ),
            ),
          ),
          ListTile(
            title: Text("Counter", style: TextStyle(fontSize: 22),),
            leading: Icon(Icons.home, color: Colors.grey,),
            trailing: Icon(Icons.arrow_right, color: Colors.black,),
            onTap: () {
              Navigator.of(context).pop();
              Navigator.pushNamed(context, "/counter");
            },
          ),

          // Nous séparons les éléments
          Divider(height: 2, color: Colors.deepOrange,),

          ListTile(
            title: Text("Meteo", style: TextStyle(fontSize: 22),),
            leading: Icon(Icons.cloud, color: Colors.black38,),
            trailing: Icon(Icons.arrow_right, color: Colors.yellow,),
            onTap: () {
              // Pour fermer le menu
              Navigator.of(context).pop();
              Navigator.pushNamed(context, "/meteo");
            },
          ),

          Divider(height: 3, color: Colors.deepOrangeAccent,),

          ListTile(
            title: Text("Gallery", style: TextStyle(fontSize: 22),),
            leading: Icon(Icons.browse_gallery, color: Colors.blueGrey,),
            trailing: Icon(Icons.arrow_right, color: Colors.deepPurple,),
            onTap: () {
              Navigator.of(context).pop();  // Pour fermer le menu après clic
              Navigator.pushNamed(context, "/gallery");
            },
          ),

          Divider(height: 2, color: Colors.deepPurple,),
        ],
      ),
    );
  }
}