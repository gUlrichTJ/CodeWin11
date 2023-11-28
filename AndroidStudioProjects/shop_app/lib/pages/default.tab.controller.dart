import 'package:flutter/material.dart';

class CustomTabController extends StatelessWidget {
  const CustomTabController({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const DefaultTabController(
      initialIndex: 1,
        length: 5,
        child: Scaffold(
          appBar: AppBar(
            bottom: TabBar(
                tabs: <Widgets>[
                  Tab(
                    icon: Icon(Icons.outbond),
                  )
                ],
            ),
          ),
      ),
    );
  }
}
