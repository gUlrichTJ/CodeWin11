import 'package:flutter/material.dart';

class MyTextField extends StatelessWidget {
  const MyTextField({Key? key}) : super(key: key);

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
