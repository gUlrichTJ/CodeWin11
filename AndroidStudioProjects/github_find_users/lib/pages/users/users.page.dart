import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

class UsersPage extends StatefulWidget {

  @override
  State<UsersPage> createState() => _UsersPageState();
}

class _UsersPageState extends State<UsersPage> {

  // Pour récupérer ce que l'user a saisi
  TextEditingController queryTextEditingController = new TextEditingController();

  String query = "";
  bool notVisible = true;

  dynamic data = null;

  int currentPage = 0;
  int totalPages = 0;
  int pageSize = 20;

  // Ici, nous enverrons la requette http
  void _search(String query) {
    String url = "https://api.github.com/search/users?q=${query}&per_page=$pageSize&page=$currentPage";
    print(url);
    http.get(Uri.parse(url))
    .then((response) {
      setState(() {
        data = json.decode(response.body);
        if (data['total_count'] % pageSize == 0) {
          totalPages = data['total_count'] ~/ pageSize;
        } else {
          totalPages = (data['total_count'] ~/ pageSize).floor() + 1;
        }
      });
    })
        .catchError((err) {
          print(err);
      });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Users => ${query} => $currentPage / $totalPages'),),
      body: Center(
        child: Column(
          children: [
            Row(
              children: [
                Expanded(
                  child: Container(
                    padding: EdgeInsets.all(10),
                    child: TextFormField(
                      obscureText: notVisible,
                      onChanged: (value) {
                        setState(() {
                          this.query=value;
                        });
                      },
                      controller: queryTextEditingController,
                      decoration: InputDecoration(
                        //icon: Icon(Icons.logout), // Icone de gauche
                        suffixIcon: IconButton(
                          onPressed: () {
                            setState(() {
                              notVisible = !notVisible;
                            });
                          },
                          icon: Icon(
                            notVisible == true ? Icons.visibility_off: Icons.visibility,
                          ),
                        ), // Icone dans le champ de texte
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
                        _search(query);
                      });
                    }
                ),
              ],
            ),
            Expanded(
              child: ListView.builder(
                itemCount: (data==null)?0:data['items'].length,
                  itemBuilder: (context, index) {
                    return ListTile(
                      title: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                        children: [
                          Row(
                            children: [
                              CircleAvatar(
                                backgroundImage: NetworkImage(data['items'][index]['avatar_url']),
                                radius: 40,
                              ),
                              SizedBox(width: 20,),
                              Text("${data['items'][index]['login']}"),
                            ],
                          ),
                          CircleAvatar(
                            child: Text("${data['items'][index]['score']}"),
                          ),
                        ],
                      ),
                    );
                  }
              ),
            ),
          ],
        ),
      ),
    );
  }
}