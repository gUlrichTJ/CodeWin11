import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:github_find_users/pages/repositories/git.repositories.page.dart';
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

  List<dynamic> items = [];

  ScrollController scrollController = new ScrollController();

  // Ici, nous enverrons la requette http
  void _search(String query) {
    String url = "https://api.github.com/search/users?q=${query}&per_page=$pageSize&page=$currentPage";
    print(url);
    http.get(Uri.parse(url))
    .then((response) {
      setState(() {
        data = json.decode(response.body);
        this.items.addAll(data['items']);
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

  // On utilise initstate pour initialiser les données
  @override
  void initState() {
    // TODO: implement initState
    super.initState();

    scrollController.addListener(() {
      if (scrollController.position.pixels == scrollController.position.maxScrollExtent) {
        setState(() {
          if (currentPage < totalPages - 1) {
            ++currentPage;
            _search(query);
          }
        });
      }
    });
  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        elevation: 0,
        title: Text('${query} ($currentPage / $totalPages)',
          style: TextStyle(fontWeight: FontWeight.w400, fontSize: 18),
        ),
      ),
      body: Center(
        child: Column(
          children: [
            Row(
              children: [
                Expanded(
                  child: Container(
                    padding: EdgeInsets.all(10),
                    child: TextFormField(
                      cursorColor: Colors.green[300],
                      obscureText: notVisible,
                      onChanged: (value) {
                        setState(() {
                          this.query=value;
                        });
                      },
                      controller: queryTextEditingController,
                      decoration: InputDecoration(
                        suffixIcon: IconButton(
                            icon: Icon(Icons.search, color: Colors.green[300]),
                            onPressed: () {
                              setState(() {
                                items = [];
                                currentPage = 0;
                                this.query = queryTextEditingController.text;
                                _search(query);
                              });
                            }
                        ),
                        //icon: Icon(Icons.logout), // Icone de gauche
                        /*suffixIcon: IconButton(
                          onPressed: () {
                            setState(() {
                              notVisible = !notVisible;
                            });
                          },
                          icon: Icon(
                            notVisible == true ? Icons.visibility_off: Icons.visibility,
                            color: Colors.green[300],
                          ),
                        ),*/ // Icone dans le champ de texte
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

              ],
            ),
            Expanded(
              child: ListView.separated(
                separatorBuilder: (context, index) => Divider(height: 2, color: Colors.green,),
                controller: scrollController,
                itemCount: items.length,
                  itemBuilder: (context, index) {
                    return ListTile(
                      onTap: () {
                        Navigator.push(
                          context, MaterialPageRoute(
                          builder: (context)=>GitRepositoriesPage(
                            login: items[index]['login'],
                            avatarUrl: items[index]['avatar_url'],
                          )
                        )
                       );
                      },
                      title: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                        children: [
                          Row(
                            children: [
                              CircleAvatar(
                                backgroundImage: NetworkImage(items[index]['avatar_url']),
                                radius: 30,
                              ),
                              SizedBox(width: 18,),
                              Text("${items[index]['login']}"),
                            ],
                          ),
                          CircleAvatar(
                            child: Text("${items[index]['score']}"),
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