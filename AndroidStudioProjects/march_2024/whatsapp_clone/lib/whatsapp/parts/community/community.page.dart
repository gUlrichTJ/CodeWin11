import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class WhatsappCommunity extends StatelessWidget {
  const WhatsappCommunity({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body:  Center(
        child: Center(
          child: RichText(
            selectionColor: Colors.deepPurpleAccent,
            strutStyle: const StrutStyle(
              fontWeight: FontWeight.w500,
            ),
            text: const TextSpan(
              children: [
                TextSpan(
                  text: "Hello to you",
                  style: TextStyle(
                    color: Colors.black,
                    fontWeight: FontWeight.w500,
                    fontFamily: "Roboto"
                  ),
                )
              ]
            ),
          ),
        ),
      ),
    );
  }
}
