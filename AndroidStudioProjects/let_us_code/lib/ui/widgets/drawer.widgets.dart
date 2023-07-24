import 'package:flutter/material.dart';
import 'package:let_us_code/config/global.params.dart';

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

    ...(GlobalParams.menus as List).map((item) {
            return ListTile(
              title: Text('${item['title']}', style: TextStyle(fontSize: 22),),
              leading: Icon(Icons.home, color: Colors.grey,),
              trailing: Icon(Icons.arrow_right, color: Colors.black,),
              onTap: () {
                Navigator.of(context).pop();
                Navigator.pushNamed(context, "${item['route']}");
              },
            );
          })

        ],
      ),
    );
  }
}