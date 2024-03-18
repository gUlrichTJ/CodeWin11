import 'package:flutter/material.dart';
import 'package:o_talents_debug2/presence/info_eleve/info_eleve.file.dart';
import 'package:o_talents_debug2/presence/lecture_audible/text_to_speech.file.dart';

class PresenceWidget extends StatefulWidget {
  const PresenceWidget({super.key});

  @override
  State<PresenceWidget> createState() => _PresenceWidgetState();
}

class _PresenceWidgetState extends State<PresenceWidget> {

  TextToSpeechManager textToSpeechManager = const TextToSpeechManager();
  // TODO: Mettre cette variable à 4  plus tard.
  static const int nombreDAppelsEleve = 1;

  int compteurDAppels = 0;

  /// Variable qui permet de connaître le bouton qui est sélectionné
  bool selection = true;

  ///
  int onIconButtonTaped = 0;

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
      "Kilyan",
      "Martin",
      "https://randomuser.me/api/portraits/women/5.jpg",
      true,
    ),
    PersonnageEleve(
      "Saboutey",
      "Tétey",
      "https://randomuser.me/api/portraits/women/63.jpg",
      true,
    ),
    PersonnageEleve(
      "Loly",
      "Martinez",
      "https://randomuser.me/api/portraits/women/77.jpg",
      true,
    ),
  ];
  @override
  Widget build(BuildContext context) {
    TextToSpeechManager textToSpeechManager = const TextToSpeechManager();
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
          GestureDetector(
            onTap: () {
              setState(() {
                ++onIconButtonTaped;
                debugPrint("$onIconButtonTaped");
              });
            },
            child: IconButton(
              tooltip: "Lire les noms. ",
              onPressed: () async {
                if (selection == true) {
                   for (var person in personnageEleve) {
                     if (selection == true) {
                         /// Maintenant, il me faut l'appeler 4 fois.
                         for (int i = 0; i < nombreDAppelsEleve; i++) {
                           if (selection == true) {
                             /// TODO: Je dois ici appeler la fonction speak de la classe TextToSpeecManager
                             textToSpeechManager.speak(
                                 '${person.nom} ${person.prenom}'
                             );
                             await Future.delayed(const Duration(seconds: 2));

                             /// Nous incrémentons la varialble qui compte le nombre de fois que
                             /// le nom de l'élève a été appelé.
                             ++compteurDAppels;
                           } else {
                             textToSpeechManager.stop();
                           }
                         }
                        } else {
                          textToSpeechManager.stop();
                        }
                      }
                    } else {
                    textToSpeechManager.stop();
                 }

                /// Nous changeons d'état pour changer l'icône
                 setState(() {
                    selection = !selection;
                  });
                  // Navigator.of(context).pushNamed("test_lecture");
                },
                icon: selection ?
                const Icon(Icons.volume_up) :
                const Icon(
                  Icons.volume_off,
                  color: Colors.grey,
                ),
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

  bool isPlaying = false;

  void startPlayback() async {
    isPlaying = true;
    // Lire le texte à voix haute depuis votre liste
    for (var person in personnageEleve) {
      if (!isPlaying) break; // Vérifier si la lecture doit être arrêtée
      // Lire le texte à voix haute
      textToSpeechManager.speak(
          '${person.nom} ${person.prenom}'
      );
      await Future.delayed(const Duration(seconds: 2));

    }
    isPlaying = false;
  }

  void stopPlayback() {
    isPlaying = false;
    // Arrêter la lecture en cours
    textToSpeechManager.stop();
  }
}
