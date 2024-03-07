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
      debugShowCheckedModeBanner: false,
      color: Colors.lightGreen,
      title: "Text To Speech",
      routes: {
        "/":(context)=>HomePage(),
      },
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {

  FlutterTts flutterTts = FlutterTts();

  String texte = "Nous allons lire ce texte "
      "à haute voix";

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    initTts();
  }

  Future<void> initTts() async {
    await flutterTts.setLanguage("fr-FR");
    await flutterTts.setSpeechRate(0.8);
    await flutterTts.setVolume(5.0);
    await flutterTts.setPitch(1.0);
  }

  void speak(String text) async {
    flutterTts.speak(text);
  }

  /// Pour arreter la lecture
  void stop() async {
    flutterTts.stop();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      drawer: const Drawer(),
        appBar: AppBar(
          title: const Text("Text to speech"),
        ),
      body: const Column(
        children: [
        ],
      ),
      /// Le floating action button
      floatingActionButton: IconButton(
        onPressed: () {
          setState(() {
            flutterTts.speak(texte);
          });
        },
        icon: Icon(Icons.volume_up),
      ),
    );
  }
}
