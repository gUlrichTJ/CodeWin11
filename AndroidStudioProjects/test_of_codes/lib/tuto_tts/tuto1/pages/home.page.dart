import 'package:flutter/material.dart';
import 'package:flutter_tts/flutter_tts.dart';
import 'package:test_of_codes/tuto_tts/tuto1/const.dart';

class HomePage2 extends StatefulWidget {
  const HomePage2({super.key});

  @override
  State<HomePage2> createState() => _HomePage2State();
}

class _HomePage2State extends State<HomePage2> {

  FlutterTts flutterTts = FlutterTts();

  List<Map> voices = [];

  Map? currentVoice;

  int? currentWordStart, currentWordEnd;

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    initTTs();
  }

  void initTTs() {
    flutterTts.setProgressHandler((text, start, end, word) {
      setState(() {
        currentWordStart = start;
        currentWordEnd = end;
      });
    });
    flutterTts.getVoices.then((data) {
      try {
        voices = List<Map>.from(data);

        print(voices);
        setState(() {
          voices = voices.where(
                  (voice) => voice["name"]
                  .contains("en")
          ).toList();
          currentVoice = voices.first;
          setVoice(currentVoice!);
        });
      } catch (e) {
        print(e);
      }
    });
  }

  void setVoice(Map voice) {
    flutterTts.setVoice({"name": voice["name"], "locale": voice["locale"]});
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: buildUI(),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          flutterTts.speak(tts_text);
        },
        child: const Icon(
            Icons.speaker_phone,
        ),
      ),
    );
  }

  Widget buildUI() {
    return SafeArea(
      child: Column(
        mainAxisSize: MainAxisSize.max,
        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        crossAxisAlignment: CrossAxisAlignment.center,
        children: [
          Center(
              child: speakerSelector(),
          ),
          RichText(
            textAlign: TextAlign.center,
            text: TextSpan(
              style: const TextStyle(
                fontWeight: FontWeight.w600,
                fontSize: 20,
                color: Colors.black,
              ),
              children: <TextSpan>[
                TextSpan(text: tts_text.substring(0, currentWordStart),
                ),
                if (currentWordStart != null)
                  TextSpan(
                    text: tts_text.substring(currentWordStart!, currentWordEnd),
                    style: const TextStyle(
                      color: Colors.white,
                      backgroundColor: Colors.purpleAccent,
                    )
                  ),
                if (currentWordEnd != null)
                  TextSpan(
                    text: tts_text.substring(currentWordEnd!),
                  ),
              ],
            ),
          ),
        ],
      ),
    );
  }

  /// The speaker selector
  Widget speakerSelector() {
    return DropdownButton<Map>(
      value: currentVoice,
      items: voices.map(
              (voice) => DropdownMenuItem(
                value: voice,
                  child: Text(
                      voice["name"],
                    style: const TextStyle(
                      fontSize: 40,
                    ),
                  ),
              ),
      ).toList(),
      onChanged: (value) {},
    );
  }
}
