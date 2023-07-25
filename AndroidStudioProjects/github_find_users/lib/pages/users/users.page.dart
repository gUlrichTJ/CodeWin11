import 'package:flutter/material.dart';

class UsersPage extends StatefulWidget {

  @override
  State<UsersPage> createState() => _UsersPageState();
}

class _UsersPageState extends State<UsersPage> {

  // Pour récupérer ce que l'user a saisi
  TextEditingController queryTextEditingController = new TextEditingController();

  String query = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Users => ${query}'),),
      body: Center(
        child: Column(
          children: [
            Row(
              children: [
                Expanded(
                  child: Container(
                    padding: EdgeInsets.all(10),
                    child: TextFormField(
                      controller: queryTextEditingController,
                      decoration: InputDecoration(
                        //icon: Icon(Icons.logout), // Icone de gauche
                        suffixIcon: Icon(Icons.visibility, color: Colors.black87,), // Icone dans le champ de texte
                        contentPadding: EdgeInsets.only(left: 20),
                        border: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(50),
                          borderSide: BorderSide(
                            width: 2,
                            color: Colors.deepOrange,
                          ),
                        ),
                      ),
                    ),
                  ),
                ),
                IconButton(
                  icon: Icon(Icons.search, color: Colors.grey),
                    onPressed: () {
                      setState(() {
                        this.query = queryTextEditingController.text;
                      });
                    }
                ),
              ],
            )
          ],
        ),
      ),
    );
  }
}