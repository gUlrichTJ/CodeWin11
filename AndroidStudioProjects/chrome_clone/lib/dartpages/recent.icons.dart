import 'package:flutter/material.dart';

class RecentIcons extends StatelessWidget {
  const RecentIcons({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      /// The width of the container
      width: MediaQuery.of(context).size.width * 0.8,
      child: Column(
        children: [
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              IconButton(
                onPressed: () {

                },
                icon: const Icon(
                    Icons.history_sharp,
                  color: Colors.grey,
                ),
              ),
              IconButton(
                onPressed: () {},
                icon: const Icon(
                    Icons.location_on_outlined,
                  color: Colors.blueAccent,
                ),
              ),
              IconButton(
                  onPressed: () {},
                  icon: const Icon(Icons.youtube_searched_for)
              ),
              IconButton(
                onPressed: () {},
                icon: const Icon(Icons.group_add),
              ),
              IconButton(
                onPressed: () {},
                icon: const Icon(Icons.backup_outlined)
              ),
            ],
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              IconButton(
                onPressed: () {},
                icon: const Icon(
                  Icons.snapchat,
                  color: Colors.red,
                ),
              ),
              IconButton(
                onPressed: () {},
                icon: const Icon(Icons.download_rounded),
              ),
              IconButton(
                  onPressed: () {

                  },
                  icon: const Icon(
                      Icons.sunny,
                    color: Colors.amber,
                  ),
              ),
              IconButton(
                  onPressed: () {
                },
                icon: const Icon(Icons.lock_outline),
              ),
              IconButton(
                  onPressed: () {

                  },
                  icon: const Icon(Icons.receipt_long)
              ),
            ],
          ),
        ],
      ),
    );
  }
}
