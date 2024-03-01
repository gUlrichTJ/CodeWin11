import 'package:flutter/material.dart';

class CustomBodyForPresence {
  CircleAvatar circleAvatar;
  String nomEleve;
  Checkbox checkBox;
  Container container;

  CustomBodyForPresence(
      this.circleAvatar, this.nomEleve, this.checkBox, this.container
      ) {}
}

class CustomBodyPresence extends StatefulWidget implements PreferredSizeWidget {
  String imageEleve;
  String nomEleve;
  CustomBodyPresence({
    super.key,
    required this.imageEleve,
    required this.nomEleve,
  });

  @override
  State<CustomBodyPresence> createState() => _CustomBodyPresenceState();

  @override
  // TODO: implement preferredSize
  Size get preferredSize => const Size.fromHeight(kToolbarHeight);
}

class _CustomBodyPresenceState extends State<CustomBodyPresence> {
  bool _estPresent = false;
  @override
  Widget build(BuildContext context) {
    return SafeArea(
        child: ListView(
          padding: const EdgeInsets.all(2.0),
        children: [
          Row(
            children: [
              CircleAvatar(
                backgroundImage: AssetImage(widget.imageEleve),
              ),
              Text("${widget.nomEleve}"),
              const Spacer(),
              Checkbox(
                  value: _estPresent,
                  onChanged: (value) {
                    setState(() {
                      _estPresent = value!;
                    });
                  },
              ),

              AnimatedContainer(
                duration: const Duration(milliseconds: 200),
                width: _estPresent ? 80 : 60,
                height: 30,
                decoration: BoxDecoration(
                  borderRadius: BorderRadius.circular(10),
                  color: _estPresent ? Colors.green : Colors.red,
                ),
                child: Center(
                  child: Text(_estPresent ? "Présent" : "Absent"),
                ),
              ),
            ],
          )
        ],
      )
    );
  }
}
