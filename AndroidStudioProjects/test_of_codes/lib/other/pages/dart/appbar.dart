import 'package:flutter/material.dart';

class CustomAppBar extends AppBar {
  CustomAppBar({super.key});

  // TODO : Function that return our appBar
  AppBar returnCustomAppBar() {
    return AppBar(
      leading: IconButton(
        onPressed: () {
          // TODO : We return to the home page that shows the pdfs
        },
        icon: const Icon(Icons.home_outlined),
      ),
      // TODO : The icons of action
      actions: [
        IconButton(
          onPressed: () {},
          icon: const Icon(Icons.search),
        ),
        IconButton(
          onPressed: (){},
          icon: const Icon(Icons.more_vert),
        ),
      ],
    );
  }
}