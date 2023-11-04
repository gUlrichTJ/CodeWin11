import 'package:flutter_tts/flutter_tts.dart';

class TextToSpeechManager {
  /// We create an instance of FlutterTts
  FlutterTts flutterTts = FlutterTts();

  /// Méthode pour lire le texte à haute voix
  Future<void> speak(String text) async {
    await flutterTts.speak(text);
  }

  /// Methode pour arreter la lecture du texte
  Future<void> stop() async {
    await flutterTts.stop();
  }
}