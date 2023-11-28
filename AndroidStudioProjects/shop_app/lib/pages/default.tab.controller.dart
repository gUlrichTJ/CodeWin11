import 'package:flutter/material.dart';

class TabController extends StatelessWidget {
  const TabController({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      initialIndex: 1,
        length: 5,
        child: Scaffold(

      ),
    );
  }
}
