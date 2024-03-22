import 'package:flutter/material.dart';
import 'package:o_talents_debug/home/containers/rediriger_vers_presence_file.dart';
import 'package:o_talents_debug/presence/lecture_audible/text_to_speech_file.dart';
import 'package:o_talents_debug/presence/presence_page.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      routes: {
        "/": (context)=>HomePage(),
        "presence":(context)=>PresenceWidget(),
        "test_lecture":(context)=>TextToSpeechManager(),
      },
      theme: ThemeData(
        primarySwatch: Colors.orange,
        canvasColor: Colors.orange.shade400,
      ),
      // home: const HomePage(),
    );
  }
}

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child: Padding(
            padding: EdgeInsets.all(8.0),
          child: Column(
            children: [
              GestureDetector(
                onTap: () {
                  Navigator.of(context).pushNamed("presence");
                },
                child: const RedirigerVersPresence(),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

