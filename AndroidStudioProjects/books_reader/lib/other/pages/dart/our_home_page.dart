import 'package:books_reader/other/pages/dart/texttospeech.file.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

class OurHomePage extends StatefulWidget {
  const OurHomePage({Key? key}) : super(key: key);

  @override
  State<OurHomePage> createState() => _OurHomePageState();
}

class _OurHomePageState extends State<OurHomePage> {
  TextToSpeechManager toSpeechManager = TextToSpeechManager();
  // TODO : A changer plus tard
  String texte2 =  loadPoem().toString();
  String texte = "Hello, how're you doing my dear ?"
      "I think we will have to work hard and praise The Lord"
      " Then Job replied:  Even today my complaint is bitter;"
  "his hand is heavy in spite of my groaning."

  " If only I knew where to find him;"
      "if only I could go to his dwelling!"
  " I would state my case before him"
  "and fill my mouth with arguments."
  " I would find out what he would answer me,"
  "and consider what he would say to me."
  " Would he vigorously oppose me?"
  "No, he would not press charges against me."
  " There the upright can establish their innocence before him,"
  "and there I would be delivered forever from my judge."

  " “But if I go to the east, he is not there;"
  "if I go to the west, I do not find him."
  " When he is at work in the north, I do not see him;"
  "when he turns to the south, I catch no glimpse of him."
  " But he knows the way that I take;"
  "when he has tested me, I will come forth as gold."
  " My feet have closely followed his steps;"
  "I have kept to his way without turning aside."
  " I have not departed from the commands of his lips;"
  "I have treasured the words of his mouth more than my daily bread."

  " “But he stands alone, and who can oppose him?"
  "He does whatever he pleases."
  " He carries out his decree against me,"
  "and many such plans he still has in store."
  " That is why I am terrified before him;"
  "when I think of all this, I fear him."
  " God has made my heart faint;"
  "the Almighty has terrified me."
  " Yet I am not silenced by the darkness,"
  " by the thick darkness that covers my face.";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: SingleChildScrollView(
        child: Text(
            "Hello, how're you doing my dear ?"
                "I think we will have to work hard and praise The Lord"
                " Then Job replied:  Even today my complaint is bitter;"
                "his hand[a] is heavy in spite of[b] my groaning."

                " If only I knew where to find him;"
                "if only I could go to his dwelling!"
                " I would state my case before him"
                "and fill my mouth with arguments."
                " I would find out what he would answer me,"
                "and consider what he would say to me."
                " Would he vigorously oppose me?"
                "No, he would not press charges against me."
                " There the upright can establish their innocence before him,"
                "and there I would be delivered forever from my judge."

                " “But if I go to the east, he is not there;"
                "if I go to the west, I do not find him."
                "When he is at work in the north, I do not see him;"
                "when he turns to the south, I catch no glimpse of him."
                " But he knows the way that I take;"
                "when he has tested me, I will come forth as gold."
                " My feet have closely followed his steps;"
                "I have kept to his way without turning aside."
                " I have not departed from the commands of his lips;"
                "I have treasured the words of his mouth more than my daily bread."

                " “But he stands alone, and who can oppose him?"
                "He does whatever he pleases."
                " He carries out his decree against me,"
                "and many such plans he still has in store."
                " That is why I am terrified before him;"
                "when I think of all this, I fear him."
                " God has made my heart faint;"
                "the Almighty has terrified me."
                " Yet I am not silenced by the darkness,"
                " by the thick darkness that covers my face.",
          textAlign: TextAlign.justify,
          style: TextStyle(
            fontFamily: "Comic Sans MS",
          ),
        ),
      ),
      floatingActionButton: IconButton(
        onPressed: () {
          toSpeechManager.speak(texte);
          // toSpeechManager.stop();
        },
        icon: const Icon(Icons.speaker_phone_rounded),
      ),
    );
  }
}

// TODO : A changer plus tard
/// Methode pour recuperer le poeme depuis un fichier text
Future<String> loadPoem() async {
  return await rootBundle.loadString("assets/texttospeech.file.txt");
}
