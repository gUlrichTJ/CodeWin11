import 'package:flutter/material.dart';

class RecentIcons extends StatelessWidget {
  const RecentIcons({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      /// The width of the container
      width: MediaQuery.of(context).size.width * 0.8,
      child: Row(
        children: [
          IconButton(
            onPressed: () {

            },
            icon: const Icon(
                Icons.youtube_searched_for,
              color: Colors.red,
            ),
          ),
          const ImageIcon(AssetImage("assets/images/users2.png")),
          IconButton(
              onPressed: () {

              },
              icon: const Icon(Icons.youtube_searched_for)
          ),
          const ImageIcon(AssetImage("assets/images/users2.png")),
          IconButton(
            onPressed: () {

            },
            icon: const Icon(Icons.backup_outlined)
          ),
        ],
      ),
    );
  }
}
