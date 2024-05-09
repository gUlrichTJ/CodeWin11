import 'package:flutter/material.dart';

class WhatsappUpdates extends StatelessWidget {
  const WhatsappUpdates({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: RichText(
          text: const TextSpan(
            text: "Updates",
            style: TextStyle(
              color: Colors.black,
            ),
          ),
        ),
      ),
    );
  }
}