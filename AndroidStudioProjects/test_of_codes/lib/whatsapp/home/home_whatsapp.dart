import 'package:flutter/material.dart';
import 'package:test_of_codes/whatsapp/parts/calls/calls.page.dart';
import 'package:test_of_codes/whatsapp/parts/chats/chats.page.dart';
import 'package:test_of_codes/whatsapp/parts/community/community.page.dart';
import 'package:test_of_codes/whatsapp/parts/updates/updates.page.dart';

class WhatsappHome extends StatefulWidget {
  const WhatsappHome({Key? key}) : super(key: key);

  @override
  State<WhatsappHome> createState() => _WhatsappHomeState();
}

class _WhatsappHomeState extends State<WhatsappHome> with SingleTickerProviderStateMixin {

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 4,
      child: Scaffold(
        appBar: AppBar(
          title: RichText(
            text: const TextSpan(
              text: "Whatsapp",
              style: TextStyle(
                color: Colors.black,
                fontSize: 22,
                fontWeight: FontWeight.w400,
                fontFamily: "Comic Sans MS",
              ),
            ),
            strutStyle: const StrutStyle(
              fontWeight: FontWeight.w500,
              fontFamily: "Comic Sans MS",
              fontSize: 40,
            ),
          ),
          actions: [
            IconButton(
              onPressed: () {},
              icon: const Icon(
                  Icons.camera_alt_outlined,
                color: Colors.black,
              ),
            ),
            IconButton(
              onPressed: () {},
              icon: const Icon(
                  Icons.search,
                color: Colors.black,
              ),
            ),
            IconButton(
              onPressed: () {},
              icon: const Icon(
                  Icons.more_vert,
                color: Colors.black,
              ),
            ),
          ],
          bottom: const TabBar(
            tabs: [
              Tab(
                icon: Icon(Icons.people_outline_rounded),
              ),
              Tab(
                icon: Icon(Icons.chat),
              ),
              Tab(
                icon: Icon(Icons.update),
              ),
              Tab(
                icon: Icon(Icons.call),
              ),
            ],
          ),
        ),
        body: const TabBarView(
          children: [
            WhatsappCommunity(),
            WhatsappChats(),
            WhatsappUpdates(),
            WhatsappCalls(),
          ],
        )
      ),
    );
  }
}
