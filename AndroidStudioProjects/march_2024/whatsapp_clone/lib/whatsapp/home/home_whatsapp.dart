import 'package:flutter/material.dart';
import 'package:whatsapp_clone/whatsapp/parts/calls/calls.page.dart';
import 'package:whatsapp_clone/whatsapp/parts/chats/chats.page.dart';
import 'package:whatsapp_clone/whatsapp/parts/community/community.page.dart';
import 'package:whatsapp_clone/whatsapp/parts/updates/updates.page.dart';

class WhatsappHome extends StatefulWidget {
  const WhatsappHome({Key? key}) : super(key: key);

  @override
  State<WhatsappHome> createState() => _WhatsappHomeState();
}

class _WhatsappHomeState extends State<WhatsappHome> with SingleTickerProviderStateMixin {

  late TabController tabController;

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    tabController = TabController(length: 4, vsync: this);
    tabController.addListener(tabChanged);
  }

  @override
  void dispose() {
    super.dispose();
    @override
    void dispose() {
      tabController.dispose();
      super.dispose();
    }
    tabController.dispose();
  }

  void tabChanged() {
    /// Check if tab Controller index is changing, otherwise,
    /// we get the notice twice.
    if (tabController.indexIsChanging) {
      print("tabChanged: ${tabController.index}");
    }
  }
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
                fontWeight: FontWeight.w600,
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
                icon: Icon(Icons.chat),
              ),
              Tab(
                icon: Icon(Icons.update),
              ),
              Tab(
                icon: Icon(Icons.people_alt_outlined),
              ),
              Tab(
                icon: Icon(Icons.call),
              ),
            ],
          ),
        ),
        body: const TabBarView(
          children: [
            WhatsappChats(),
            WhatsappUpdates(),
            WhatsappCommunity(),
            WhatsappCalls(),
          ],
        )
      ),
    );
  }
}
