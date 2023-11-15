import 'package:file_manager/app/features/home/models/user.dart';
import 'package:flutter/material.dart';

// part of home;

class Header extends StatelessWidget {
  Header({Key? key}) : super(key: key);

  // final User user;
  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        Column(
          children: [
            title(),
          ],
        ),
      ],
    );
  }

  // Function that will return a widget
  Widget title() {
    return Text(
        "Good morning",
      style: TextStyle(fontSize: 20),
    );
  }
}
