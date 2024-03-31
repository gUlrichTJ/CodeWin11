import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      /// Le appbar
      appBar: AppBar(
        title: const Text("HomePage"),
        /// The background color of the appbar
        backgroundColor: Colors.grey.shade500,
      ),
      drawer: Drawer(
        backgroundColor: Colors.grey.shade400,
        child: Column(
          children: [
            const DrawerHeader(
              child: CircleAvatar(
                radius: 40,
              ),
            ),
            const Divider(),
            const SizedBox(height: 20,),
            ListTile(
              title: const Text("Users"),
              leading: const Icon(Icons.people),
              trailing: const Icon(Icons.arrow_right_alt_outlined),
              onTap: () {
                Navigator.of(context).pop();
                Navigator.of(context).pushNamed("users");
              },
            ),
          ],
        ),
      ),
      /// The background color of the whole app
      backgroundColor: Colors.grey.shade400,
      body: const Center(
        child: Text("Hello"),
      ),
    );
  }
}
