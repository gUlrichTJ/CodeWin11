import 'package:flutter/material.dart';

class MyButton extends StatelessWidget {

  final Function()? onTap;
  const MyButton({Key? key}) : super(key: key, required this.onTap);

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: ,
      child: Container(
        padding: const EdgeInsets.all(15.0),
        margin: const EdgeInsets.symmetric(horizontal: 25.0),
        decoration: BoxDecoration(
          color: Colors.black,
          borderRadius: BorderRadius.circular(18),
        ),
        child: const Center(
          child: Text(
              "Sign in",
            style: TextStyle(
              color: Colors.white,
              fontWeight: FontWeight.bold,
              fontSize: 16,
            ),
          ),
        ),
      ),
    );
  }
}
