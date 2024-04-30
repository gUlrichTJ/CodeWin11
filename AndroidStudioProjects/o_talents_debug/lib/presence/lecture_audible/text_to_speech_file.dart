import 'package:flutter/material.dart';
import 'package:flutter_tts/flutter_tts.dart';

void main() {
  runApp(const MyApp());
}

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
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Expanded(
              child: Center(
                child: TextField(
                    controller: textEditingController,
                      decoration: const InputDecoration(
                        labelText: 'Entrez le texte à lire'
                      ),
                ),
              ),
            ),
            const SizedBox(height: 20,),
            ElevatedButton(
              onPressed: () {
                speak();
              },
              child: const Text("Lire le texte à haute voix."),
            )
          ],
        ),
      ),
    );
  }

  /// Les méthodes pour pouvoir lire.
  Future speak() async {
    await flutterTts.setVolume(1.0);
    await flutterTts.setSpeechRate(1.0);
    await flutterTts.setPitch(1.0);

    await flutterTts.speak(textEditingController.text);
  }
}
