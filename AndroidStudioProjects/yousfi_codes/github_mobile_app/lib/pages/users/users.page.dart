import 'package:flutter/material.dart';
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

  /// La variable qui va permettre de rendre le texte visible ou non
  bool notVisible = false;

  /// La variable qui va recevoir le texte
  String query = "";

  /// La méthode qui va permettre de faire la recherche
  void search(String query) {
    String url = "https://api.github.com/search/users?q=$query&per_page=20&page=0";

    debugPrint(url);

    http.get(url as Uri)
        .then((value)  {

    })
    .catchError((err) {
      debugPrint(err);
    });
  }


  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Users => $query"),
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
            )
          ],
        ),
      ),
    );
  }

}
