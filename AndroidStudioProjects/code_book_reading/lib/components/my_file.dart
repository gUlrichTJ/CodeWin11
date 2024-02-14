import 'package:flutter/material.dart';

class MyTextField extends StatelessWidget {

  final controller = 0;
  final String hintText = "";
  final bool obscureText = true;

  const MyTextField(
      {
        super.key,
        required this.controller,
        required this.hintText,
      });

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: 25.0),
      child: TextField(
        cursorColor: Colors.black,
        decoration: InputDecoration(
          enabledBorder: const OutlineInputBorder(
            borderSide: BorderSide(color: Colors.white),
          ),
          focusedBorder: OutlineInputBorder(
            borderSide: BorderSide(color: Colors.grey.shade500),
          ),
          fillColor: Colors.grey.shade200,
          filled: true,
        ),
      ),
    );
  }
}
