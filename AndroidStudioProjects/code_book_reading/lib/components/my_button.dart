import 'package:flutter/material.dart';

class MyButton extends StatelessWidget {
  const MyButton({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.all(25.0),
      decoration: const BoxDecoration(
        color: Colors.black,
      ),
      child: const Center(
        child: Text(
            "Sign in",
          style: TextStyle(
            color: Colors.white,
          ),
        ),
      ),
    );
  }
}
