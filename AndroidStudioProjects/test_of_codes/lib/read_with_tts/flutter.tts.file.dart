import 'package:flutter/material.dart';
import 'package:flutter_tts/flutter_tts.dart';

class FlutterTTsU extends StatefulWidget {
  const FlutterTTsU({super.key});

  @override
  State<FlutterTTsU> createState() => _FlutterTTsUState();
}

class _FlutterTTsUState extends State<FlutterTTsU> {

  FlutterTts flutterTts = FlutterTts();

  String textToSpeak = "Ceci est l'exemple de texte à lire";

  @override
  void initState() {
    super.initState();
    initTts();
  }

  Future<void> initTts() async {
    await flutterTts.setLanguage("fr-FR");
    await flutterTts.setSpeechRate(0.8);
    await flutterTts.setVolume(1.0);
    await flutterTts.setPitch(1.0);
  }
  void speack(String text) async {
    await flutterTts.speak(text);
  }

  void stop() async {
    await flutterTts.stop();
  }

  /*
    /// Pour lire un audio mp3
    void speackFromFile() async {
      await flutterTts.speakFromAsset("path/to/the/audio.mp3");
    }
   */

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.lightGreen,
      ),
      drawer: const Drawer(),
      body: Column(
        mainAxisAlignment: MainAxisAlignment.end,
        children: [
        ],
      ),
      backgroundColor: Colors.lightGreen.shade500,
    );
  }
}
