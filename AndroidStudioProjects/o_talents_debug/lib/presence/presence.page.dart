import 'package:flutter/material.dart';
import 'package:o_talents_debug/presence/info_eleve/info_eleve.file.dart';

class PresenceWidget extends StatefulWidget {
  const PresenceWidget({super.key});

  @override
  State<PresenceWidget> createState() => _PresenceWidgetState();
}

class _PresenceWidgetState extends State<PresenceWidget> {

  /// Nous créons une liste de personnages
  List<PersonnageEleve> personnageEleve = [
    // TODO: Nous sommes en train de mettre la liste des eleves
    PersonnageEleve(
        "Sophie",
        "Martin",
        "https://randomuser.me/api/portraits/women/72.jpg",
        true,
    ),
    PersonnageEleve(
      "Maxime",
      "Dupont",
      "https://randomuser.me/api/portraits/women/76.jpg",
      true,
    ),
    PersonnageEleve(
      "Sophie",
      "Martinez",
      "https://randomuser.me/api/portraits/women/75.jpg",
      true,
    ),
    PersonnageEleve(
      "James",
      "Martin",
      "https://randomuser.me/api/portraits/women/85.jpg",
      true,
    ),
    PersonnageEleve(
      "Sophie",
      "Martin",
      "https://randomuser.me/api/portraits/women/5.jpg",
      true,
    ),
    PersonnageEleve(
      "Sophie",
      "Martin",
      "https://randomuser.me/api/portraits/women/63.jpg",
      true,
    ),
    PersonnageEleve(
      "Sophie",
      "Martin",
      "https://randomuser.me/api/portraits/women/77.jpg",
      true,
    ),
  ];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        elevation: 1.0,
        leading: IconButton(
          onPressed: () {
            Navigator.of(context).pushNamed("/");
          },
          icon: const Icon(Icons.arrow_back_ios),
        ),
        // TODO: prendre le nom de la matiere quelque part d'autre.
        title: const ListTile(
          title: Text("Présence"),
          subtitle: Text("Mathématiques - 3ème"),
        ),
        actions: [
          // TODO: Cet icon button doit servir d'appel a haute voix des eleves
          IconButton(
            onPressed: () {},
              icon: const Icon(Icons.volume_off,
              ),
          ),
        ],
      ),

      /// Le body de l'application
      body: ListView.builder(
        itemCount: personnageEleve.length,
        itemBuilder: (context, index) {
          return Row(
            mainAxisSize: MainAxisSize.max,
            crossAxisAlignment: CrossAxisAlignment.center,
            children: [
              Padding(
                padding: const EdgeInsets.all(8.0),
                child: SizedBox(
                  height: 60,
                  /// Les images des personnes
                  child: CircleAvatar(
                    radius: 40,
                    backgroundImage: NetworkImage(personnageEleve[index].image),
                  ),
                ),
              ),
              Padding(
                padding: const EdgeInsets.all(8.0),
                child: Center(
                  child: Text(
                    /// Le nom et le prénom de l'élève.
                    "${personnageEleve[index].nom} ${personnageEleve[index].prenom}",
                  ),
                ),
              ),
              /// Nous mettons un espace
              const Spacer(),
              Padding(
                padding: const EdgeInsets.all(8.0),
                /// Lorsqu'on coche cette case, le container change.
                child: Checkbox(
                  value: personnageEleve[index].estPresent,
                  onChanged: (value) {
                    setState(() {
                      personnageEleve[index].estPresent = value!;
                    });
                  },
                ),
              ),
              /// Le container qui permettra de savoir si l'eleve est absent ou
              /// present
              Padding(
                padding: const EdgeInsets.all(8.0),
                child: AnimatedContainer(
                  curve: Curves.bounceOut,
                  duration: const Duration(milliseconds: 200),
                  width: 75,
                  height: 50,
                  /*color: personnageEleve[index].estPresent ?
                    Colors.green :
                  Colors.red,*/
                  decoration: BoxDecoration(
                    borderRadius: BorderRadius.circular(10.0),
                    /// La couleur change en fonction de la présence ou de
                    /// l'absence de l'élève.
                    color: personnageEleve[index].estPresent ?
                    Colors.green :
                    Colors.red,
                  ),
                  child: personnageEleve[index].estPresent ?
                      /// Le texte change en fonction de la présence ou de
                  /// l'absence de l'élève.
                      const Center(child: Text("Pésent")) :
                      const Center(child: Text("Absent")),
                ),
              ),
            ],
          );
        },
        /// Nous mettons un espace ici pour la marge dans toute l'appli
        padding: const EdgeInsets.all(3.0),
      ),
    );
  }
}
