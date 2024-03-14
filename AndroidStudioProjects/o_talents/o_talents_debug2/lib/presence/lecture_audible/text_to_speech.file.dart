import 'package:flutter/material.dart';
import 'package:flutter_tts/flutter_tts.dart';

void main() {
  runApp(const MyApp());
}

FlutterTts flutterTts = FlutterTts();

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      title: "Hello",
      debugShowCheckedModeBanner: false,

      home: HPage(),
    );
  }
}

class HPage extends StatefulWidget {
  const HPage({super.key});

  @override
  State<HPage> createState() => _HPageState();
}

class _HPageState extends State<HPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Text to speech"),
      ),
      body: const Center(
        child: TextToSpeechManager(),
      ),
    );
  }
}



class TextToSpeechManager extends StatefulWidget {
  const TextToSpeechManager({super.key});

  /// Les méthodes pour pouvoir lire.

  Future<void> speak(String s) async {
    await flutterTts.setLanguage("fr-FR");
    await flutterTts.setVolume(1.0);
    /// Ici, c'est la vitesse de lecture.
    /// Après, nous allons changer les valeurs réelles et mettre une
    /// variable que l'utilisateur va modifier à sa guise.
    await flutterTts.setSpeechRate(0.5);
    await flutterTts.setPitch(1.0);

    await flutterTts.speak(s);
  }

  /// La méthode qui permet que le texte soit arrêté d'être lu
  Future stop() async {
    flutterTts.stop();
  }

  /// La méthode pour mettre le texte en pause
  Future pause() async {
    flutterTts.pause();
  }

  /// La méthode pour continuer la lecture
  Future play(String text) async {
    flutterTts.speak(text);
  }

  @override
  State<TextToSpeechManager> createState() => _TextToSpeechManagerState();

}

class _TextToSpeechManagerState extends State<TextToSpeechManager> {

  TextEditingController textEditingController = TextEditingController();

  @override
  void initState() {
    super.initState();
    flutterTts.setLanguage("fr-FR");  /// On pourra changer la langue quand on veut
  }



  @override
  Widget build(BuildContext context) {
    return const Scaffold();
  }

  // TODO: Icone button de la classe presence
  /*
  *
  *       IconButton(
            tooltip: "Lire les noms.",
            onPressed: () async {
              if (selection == true) {
                isPlaying = false;
                for (var person in personnageEleve) {
                  /// Maintenant, il me faut l'appeler 4 fois.
                  for (int i = 0; i < nombreDAppelsEleve; i++) {
                    if (isPlaying) {
                      textToSpeechManager.stop();
                    }
                    /// TODO: Je dois ici appeler la fonction speak de la classe TextToSpeecManager
                    textToSpeechManager.speak(
                        '${person.nom} ${person.prenom}'
                    );
                    await Future.delayed(const Duration(seconds: 2));

                    /// Nous incrémentons la varialble qui compte le nombre de fois que
                    /// le nom de l'élève a été appelé.
                    ++compteurDAppels;
                  }
                }
              } else {
                textToSpeechManager.stop();
              }

              /// Nous changeons d'état pour changer l'icône
              setState(() {
                selection = !selection;
                isPlaying = !isPlaying;
              });
              // Navigator.of(context).pushNamed("test_lecture");
            },
              icon: selection ?
              const Icon(Icons.volume_up) :
              const Icon(
                Icons.volume_off,
                color: Colors.grey,
              ),
          )

    */

}
