import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:github_mobile_app/pages/repositories/home.page.dart';
import 'package:http/http.dart' as http;

class UsersPage extends StatefulWidget {

  UsersPage({super.key});

  @override
  State<UsersPage> createState() => _UsersPageState();
}

class _UsersPageState extends State<UsersPage> {
  /// Le queryTextEditingController permet de recueillir tout ce que nous allons
  /// stocker dans la zone de texte. Je dois aller vite et finir cette playlist
  /// aujourd'hui.

  TextEditingController queryTextEditingController = TextEditingController();

  /// Il va falloir stocker les données dans un objet de type dart
  dynamic data = null;

  /// La variable qui va permettre de rendre le texte visible ou non
  bool notVisible = false;

  /// La variable qui va recevoir le texte
  String query = "";

  /// La page actuelle
  int currentPage = 0;

  /// Le nombre total de pages
  int totalPages = 0;

  /// La taille de la page
  int pageSize = 20;

  /// Pour controller le scrolling de la liste
  ScrollController scrollController = ScrollController();

  /// Nous perdons les anciennes données parce qu'elles sont stockées dans data
  /// Nous voulons retrouver nos anciennes données
  List<dynamic> items = [];

  /// La méthode qui va permettre de faire la recherche
  void search(String query) {
    String url = "https://api.github.com/search/users?q=$query&per_page=$pageSize&page=$currentPage";

    Uri uriUrl = Uri.parse(url);
    debugPrint(url);

    /// Nous recueillons l'url
    http.get(uriUrl)
        .then((response)  {
          /// Nous allons décoder les données json
      /// Nous prenons les données qui sont au format texte et nous les stockons
      /// dans un objet de type dart
      /// Nous devons faire ceci dans le méthode setstate pour pouvoir voir
      /// les modifications dans la page
        setState(() {
          data = json.decode(response.body);
          items.addAll(data['items']);
          if (data['total_count'] % pageSize == 0) {
            totalPages = data['total_count'] ~/ pageSize;
          } else {
            totalPages = (data['total_count'] / pageSize).floor() + 1;
          }
        });
    })
    .catchError((err) {
      debugPrint(err);
    });
  }

  /// Pour initialiser les données, nous allons utiliser initstate
  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    scrollController.addListener(() {
      if (scrollController.position.pixels == scrollController.position.maxScrollExtent) {
        setState(() {
          if (currentPage < totalPages - 1) {
            ++currentPage;
            /// je recharge les données
            search(query);
          }
        });
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Users => $query => $currentPage / $totalPages"),
        /// The icon that will permit us to return to the home page
        leading: IconButton(
          onPressed: () {
            Navigator.of(context).pop();
          },
          icon: const Icon(Icons.arrow_back),
        ),
        elevation: 0,
        /// The background color of the appbar of the users page
        backgroundColor: Colors.grey.shade500,
      ),
      /// The background of all the app

      backgroundColor: Colors.grey.shade400,
      body: Center(
        child: Column(
          children: [
            /// Nous mettons un textformfield...
            Row(
              children: [
                Expanded(
                  child: Container(
                    padding: const EdgeInsets.all(10),
                    /// Le textformfield où on va écrire du texte
                    child: TextFormField(
                      /// obscure text permet de masquer tout le texte disponible
                      /// dans le textformfield
                      obscureText: notVisible,
                      /// Le controller permet de récupérer le texte saisi.
                      controller: queryTextEditingController,
                      /// Pour pouvoir avoir des modifications au fur et à mesure
                      /// qu'on saisit, on peut utiliser onchanged
                      onChanged: (value) {  /// value, c'est la valeur de la zone de texte
                        setState(() {
                          query = value;
                        });
                      },
                      decoration: const InputDecoration(
                        /// On peut mettre une icone dans l'input decoration à gauche
                        // icon: Icon(Icons.logout),
                        /// Suffix icon reste dans le zone de saisie
                          suffixIcon: Icon(
                              Icons.visibility,
                          ),
                          /// Here, we put the border
                          border: OutlineInputBorder(
                              borderRadius: BorderRadius.all(Radius.circular(40)),
                              borderSide: BorderSide(
                                width: 1,
                                color: Colors.deepOrange,
                              ),
                          ),
                      ),
                    ),
                  ),
                ),
                IconButton(
                  onPressed: () {
                    setState(() {
                      items = [];
                      currentPage = 0;
                      query = queryTextEditingController.text;
                      search(query);
                      debugPrint(query);
                    });
                  },
                  icon: const Icon(
                    Icons.search,
                    color: Colors.black,
                  ),
                )
              ],
            ),
            /// Pour pouvoir les afficher dans un column, il faut les envelopper
            /// dans un element expanded
            Expanded(
              child: ListView.separated(
                /// Pour separer
                separatorBuilder: (context, index) => Padding(
                  padding: const EdgeInsets.all(10.0),
                  child: Divider(
                    height: 2,
                    thickness: 2,
                    color: Colors.grey.shade700,
                  ),
                ),
                /// Le controller du scrolling
                controller: scrollController,
                /// Le nombre d'éléments de la liste
                itemCount: items.length,
                itemBuilder: (context, index) {
                  return ListTile(
                    onTap: () {
                      Navigator.push(context,
                        MaterialPageRoute(
                          builder: (context) =>
                            GitRepositoriesPage(
                                items[index]['login'],
                              items[index]['login'],
                            ),
                        ),
                      );
                    },
                    title: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        Row(
                          children: [
                            CircleAvatar(
                              backgroundImage: NetworkImage(
                                items[index]['avatar_url'],
                              ),
                              radius: 40,
                            ),
                            const SizedBox(width: 20,),
                            Text("${items[index]['login']}"),
                          ],
                        ),
                        CircleAvatar(
                          child: Text("${items[index]['score']}"),
                        ),
                      ],
                    ),
                  );
                },
              ),
            )
          ],
        ),
      ),
    );
  }
}
