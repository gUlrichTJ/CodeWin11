import 'package:books_reader/other/pages/dart/load_file.dart';
import 'package:books_reader/other/pages/dart/text_to_speech.file.dart';
import 'package:flutter/material.dart';

class OurHomePage extends StatefulWidget {
  const OurHomePage({Key? key}) : super(key: key);

  @override
  State<OurHomePage> createState() => _OurHomePageState();
}

class _OurHomePageState extends State<OurHomePage> {
  String? texte;
  TextToSpeechManager toSpeechManager = TextToSpeechManager();
  // TODO : We have to change this later
  // TODO : We create an instance of LoadFile
  FileLoad load = FileLoad();

  /// Function that helps us to load the text of the file
  loadString() async {
    final test = await load.file;
    setState(() {
      texte = test;
    });
  }

  /// We initialize the state
  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    loadString();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: SingleChildScrollView(
        child: Text(
            texte.toString(),
          textAlign: TextAlign.justify,
          style: const TextStyle(
            fontFamily: "Comic Sans MS",
          ),
        ),
      ),
      floatingActionButton: IconButton(
        /// When we press the button for the fist time, it starts reading
        onPressed: () {
          toSpeechManager.speak(texte!);  /// It reads the text.
          /// We change the state, we change the icon to another
          setState(() {
            IconButton(
              /// When we press the second button, we stop the reading.
              onPressed: () {
                toSpeechManager.stop();
              },
                icon : const Icon(Icons.speaker_notes_off_outlined),
            );
          });
          // toSpeechManager.stop();
        },
        icon: const Icon(Icons.speaker_phone_rounded),
      ),
    );
  }
}

