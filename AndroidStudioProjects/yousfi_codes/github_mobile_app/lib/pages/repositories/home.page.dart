import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

class GitRepositoriesPage extends StatefulWidget {

  String login;

  /// L'image de la personne
  String avatarUrl;
  GitRepositoriesPage(this.login, this.avatarUrl, {super.key});

  @override
  State<GitRepositoriesPage> createState() => _GitRepositoriesPageState();
}

class _GitRepositoriesPageState extends State<GitRepositoriesPage> {

  /// Récupérons les données
  dynamic dataRepositories;

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    loadRepositories();
  }

  /// J'appelle cette méthode jusuqu'à ce que j'aie la réponse.
  void loadRepositories() async {
    String url = "https://api.github.com/users/${widget.login}/repos";
    Uri urlUri = Uri.parse(url);
    http.Response response = await http.get(urlUri);
    if (response.statusCode == 200) {
      setState(() {
        dataRepositories = json.decode(response.body);
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      /// Le appbar
      appBar: AppBar(
        title: Text("Repositories ${widget.login}"),
        /// The button of returning to the other page
        leading: IconButton(
          onPressed: () {
            Navigator.of(context).pop();
          },
          icon: const Icon(Icons.arrow_back_outlined),
        ),
        /// Nous allons mettre l'image de l'user here
        actions: [
          CircleAvatar(
            backgroundImage: NetworkImage(widget.avatarUrl),
          )
        ],
        /// The background color of the appbar
        backgroundColor: Colors.grey.shade500,
      ),
      /// The background color of the whole app
      backgroundColor: Colors.grey.shade400,
      body: Center(
        child: ListView.separated(
            itemBuilder: (context, index) => ListTile(
              /// Le nom du repo
              title: Text("${dataRepositories[index]['name']}"),
            ),
            separatorBuilder: (context, index) => Padding(
              padding: const EdgeInsets.all(10.0),
              child: Divider(height: 2,
                color: Colors.grey.shade600,
              ),
            ),
            itemCount: dataRepositories == null ? 0 : dataRepositories.length,
        ),
      ),
    );
  }
}
