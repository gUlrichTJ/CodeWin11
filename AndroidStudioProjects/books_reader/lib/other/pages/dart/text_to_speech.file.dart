import 'package:flutter_tts/flutter_tts.dart';

import 'package:flutter/services.dart';

class TextToSpeechManager {
  /// We create an instance of FlutterTts
  FlutterTts flutterTts = FlutterTts();
  TextToSpeechManager() {
    flutterTts.setLanguage("en-US");
    flutterTts.setSpeechRate(0.40);
    flutterTts.setPitch(0.70);
  }
  /// Method to read the text loudly
  Future<void> speak(String text) async {
    await flutterTts.speak(text);
  }

  /// Method to stop the reading
  Future<void> stop() async {
    await flutterTts.stop();
  }

  /// Method to have the text from the text file
  Future<String> loadPoem() async {
    return await rootBundle.loadString("assets/text_to_speech.file.txt");
  }
}