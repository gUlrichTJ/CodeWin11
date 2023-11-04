import 'package:books_reader/other/pages/dart/texttospeech.file.dart';
import 'package:flutter/material.dart';

class OurHomePage extends StatefulWidget {
  const OurHomePage({Key? key}) : super(key: key);

  @override
  State<OurHomePage> createState() => _OurHomePageState();
}

class _OurHomePageState extends State<OurHomePage> {
  TextToSpeechManager toSpeechManager = TextToSpeechManager();
  String texte = "Bonjour, comment ca va";
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      floatingActionButton: IconButton(
        onPressed: () {
          toSpeechManager.speak(texte);
          toSpeechManager.stop();
        },
        icon: Icon(Icons.speaker_phone_rounded),
      ),
    );
  }
}
