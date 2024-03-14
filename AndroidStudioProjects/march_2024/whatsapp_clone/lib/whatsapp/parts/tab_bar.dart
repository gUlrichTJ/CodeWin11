import 'package:flutter/material.dart';
import 'package:whatsapp_clone/whatsapp/parts/calls/calls.page.dart';
import 'package:whatsapp_clone/whatsapp/parts/chats/chats.page.dart';
import 'package:whatsapp_clone/whatsapp/parts/community/community.page.dart';
import 'package:whatsapp_clone/whatsapp/parts/updates/updates.page.dart';

class WhatsappTabBar extends StatefulWidget {
  const WhatsappTabBar({Key? key}) : super(key: key);

  @override
  State<WhatsappTabBar> createState() => _WhatsappTabBarState();
}

class _WhatsappTabBarState extends State<WhatsappTabBar> with SingleTickerProviderStateMixin {

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
    return TabBarView(
        controller: tabController,
        children: [
          WhatsappCommunity(),
          WhatsappChats(),
          WhatsappUpdates(),
          WhatsappCalls(),
        ],
    );
  }
}

