import 'package:flutter/material.dart';

class WhatsappCalls extends StatelessWidget {
  const WhatsappCalls({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: RichText(
          text: const TextSpan(
            text: "Calls",
            style: TextStyle(
              color: Colors.black,
            ),
          ),
        ),
      ),
    );
  }
}
