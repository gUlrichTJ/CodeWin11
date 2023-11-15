import 'package:file_manager/app/features/home/models/user.dart';
import 'package:flutter/material.dart';

// part of home;

class Header extends StatelessWidget {
  const Header({Key? key}) : super(key: key);

  final User user;
  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        Column(
          children: [

          ],
        ),
      ],
    );
  }

  // Function that will return a widget
  Widget title() {
    return Text(
        "data",
      style: TextStyle(fontSize: 20),
    );
  }
}
