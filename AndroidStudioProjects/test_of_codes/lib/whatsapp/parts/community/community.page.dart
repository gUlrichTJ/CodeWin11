import 'package:flutter/material.dart';

class WhatsappCommunity extends StatelessWidget {
  const WhatsappCommunity({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const Scaffold(
      body:  Center(
        child: Center(
          child: Text(
            "Community",
            selectionColor: Colors.lightBlue,
          ),
        ),
      ),
    );
  }
}
