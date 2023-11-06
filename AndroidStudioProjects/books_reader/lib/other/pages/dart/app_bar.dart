import 'package:flutter/material.dart';

class CustomAppBar extends StatefulWidget {
  const CustomAppBar();

  @override
  State<CustomAppBar> createState() => _CustomAppBarState();
}

class _CustomAppBarState extends State<CustomAppBar> {
  @override
  Widget build(BuildContext context) {
    return AppBar(
      leading: IconButton(
        onPressed: () {},
        icon: const Icon(Icons.home_outlined),
      ),
      actions: [
        // TODO : Mettre l'icone de recherche et l'icone de morevert
      ],
    );
  }
}
