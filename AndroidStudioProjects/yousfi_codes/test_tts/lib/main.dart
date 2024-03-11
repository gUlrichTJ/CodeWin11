import 'package:flutter/material.dart';
import 'package:flutter_tts/flutter_tts.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Text-to-Speech Example'),
        ),
        body: const Center(
          child: TextToSpeech(),
        ),
      ),
    );
  }
}

class TextToSpeech extends StatefulWidget {
  const TextToSpeech({super.key});

  @override
  _TextToSpeechState createState() => _TextToSpeechState();
}

class _TextToSpeechState extends State<TextToSpeech> {
  FlutterTts flutterTts = FlutterTts();
  TextEditingController textEditingController = TextEditingController();

  @override
  void initState() {
    super.initState();
    flutterTts.setLanguage("fr-FR"); // Changer la langue au besoin
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        TextField(
          controller: textEditingController,
          decoration: InputDecoration(
            labelText: 'Entrez le texte à lire',
          ),
        ),
        SizedBox(height: 20),
        ElevatedButton(
          onPressed: () {
            _speak();
          },
          child: Text('Lire le texte'),
        ),
      ],
    );
  }

  Future _speak() async {
    await flutterTts.setVolume(1.0);
    await flutterTts.setSpeechRate(0.5);
    await flutterTts.setPitch(1.0);

    await flutterTts.speak(textEditingController.text);
  }
}
