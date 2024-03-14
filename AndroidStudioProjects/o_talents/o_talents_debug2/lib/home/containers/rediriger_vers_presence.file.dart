import 'package:flutter/material.dart';

class RedirigerVersPresence extends StatelessWidget {
  const RedirigerVersPresence({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Container(
        width: MediaQuery.of(context).size.width * 0.8,
        height: MediaQuery.of(context).size.height * 0.5,
        color: Colors.yellow,
      ),
    );
  }
}
