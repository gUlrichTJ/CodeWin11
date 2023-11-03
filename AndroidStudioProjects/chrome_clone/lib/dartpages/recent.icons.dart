import 'package:flutter/material.dart';

class RecentIcons extends StatelessWidget {
  const RecentIcons({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      /// The width of the container
      width: MediaQuery.of(context).size.width * 0.8,
      child: Table(
      ),
    );
  }
}
