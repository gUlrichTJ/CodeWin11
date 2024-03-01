import 'package:flutter/material.dart';

class CustomAppBarPresence extends StatefulWidget implements PreferredSizeWidget{
  String nomDuCours;
  String nomDeLaClasse;
  CustomAppBarPresence({
    super.key,
    required this.nomDuCours,
    required this.nomDeLaClasse,
  });

  @override
  State<CustomAppBarPresence> createState() => _CustomAppBarPresenceState(
      nomDuCours,nomDeLaClasse
  );

  @override
  // TODO: implement preferredSize
  Size get preferredSize => Size.fromHeight(kToolbarHeight);
}

class _CustomAppBarPresenceState extends State<CustomAppBarPresence> {

  _CustomAppBarPresenceState(String nomDuCours, String nomDeLaClasse);
  @override
  Widget build(BuildContext context) {
    return AppBar(
      leading: IconButton(
        onPressed: () {},
        icon: const Icon(Icons.arrow_back_ios),
      ),
      title: ListTile(
        title: const Text("Présence"),
        subtitle: Text("${widget.nomDuCours} - ${widget.nomDeLaClasse}"),
      ),
      actions: <Widget>[
        IconButton(
          onPressed: () {},
          icon: const Icon(Icons.volume_off),
        )
      ],
    );
  }
}
