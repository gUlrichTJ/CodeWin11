import 'package:flutter/material.dart';
import 'package:flutter_tts/flutter_tts.dart';

class TextToSpeechManager extends StatefulWidget {
  const TextToSpeechManager({super.key});

  @override
  State<TextToSpeechManager> createState() => _TextToSpeechManagerState();
}

class _TextToSpeechManagerState extends State<TextToSpeechManager> {
  FlutterTts flutterTts = FlutterTts();
  TextEditingController textEditingController = TextEditingController();

  @override
  void initState() {
    super.initState();
    flutterTts.setLanguage("fr-FR");  /// On pourra changer la langue quand on veut
  }
  @override
  Widget build(BuildContext context) {
    return const Placeholder();
  }

  /// Les méthodes pour pouvoir lire.
  Future speak() async {
    await flutterTts.setVolume(1.0);
    await flutterTts.setSpeechRate(0.5);
    await flutterTts.setPitch(1.0);

    await flutterTts.speak(textEditingController.text);
  }
}
