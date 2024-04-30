import 'package:flutter/material.dart';

class WhatsappUpdates extends StatelessWidget {
  const WhatsappUpdates({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: RichText(
          text: const TextSpan(
            text: "Updates",
            style: TextStyle(
              fontWeight: FontWeight.w500
            ),
          ),
        ),
        actions: const [
          Icon(Icons.camera_alt_outlined),
          Icon(Icons.search),
          Icon(Icons.more_vert),
        ],
      ),
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
