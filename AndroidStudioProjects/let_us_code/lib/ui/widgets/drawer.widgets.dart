import 'package:flutter/material.dart';
import 'package:let_us_code/config/global.params.dart';

/// Nous créons un stateless widget que nous appelons drawer
class MyDrawer extends StatelessWidget {
  const MyDrawer({super.key});

  @override
  Widget build(BuildContext context) {
    return Drawer(
      child: ListView(
        children: [
          const DrawerHeader(
            decoration: BoxDecoration(
                gradient: LinearGradient(
                    colors: [
                      Colors.white,
                      Colors.deepOrange
                    ]
                )
            ),
            child: Center(
              child: Row(
                // Pour les séparer
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  CircleAvatar(
                    backgroundImage: AssetImage("images/images/about.png"),
                    radius: 30,
                  ),
                  CircleAvatar(
                    backgroundImage: AssetImage("images/images/users2.png"),
                    radius: 40,
                  ),
                ]
              ),
            ),
          ),

    ...(GlobalParams.menus as List).map((item) {
            return Column(
              children: [
                ListTile(
                title: Text('${item['title']}', style: TextStyle(fontSize: 22),),
                leading: item['icon'],
                trailing: Icon(Icons.arrow_right, color: Colors.black,),
                onTap: () {
                  Navigator.of(context).pop();
                  Navigator.pushNamed(context, "${item['route']}");
                },
              ),
                Divider(
                  color: Colors.deepOrange.shade300,
                    height: 2,
                )
              ]
            );
          })

        ],
      ),
    );
  }
}