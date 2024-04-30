import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:whatsapp_clone/whatsapp/parts/calls/calls.page.dart';
import 'package:whatsapp_clone/whatsapp/parts/chats/chats.page.dart';
import 'package:whatsapp_clone/whatsapp/parts/community/community.page.dart';
import 'package:whatsapp_clone/whatsapp/parts/updates/updates.page.dart';

void main() {
  runApp(WhatsappHome2());
}

class WhatsappHome2 extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: DefaultTabController(
        length: 4,
        child: Scaffold(
          appBar: AppBar(
          ),
          body: TabBarView(
            children: [
              WhatsappChats(),
              WhatsappUpdates(),
              WhatsappCommunity(),
              WhatsappCalls(),
            ],
          ),
          bottomNavigationBar: const TabBar(
            tabs: [
              Tab(
                icon: Icon(Icons.chat_outlined,),
                child: Text.rich(
                  TextSpan(
                    text: "Chats",
                    style: TextStyle(
                      fontWeight: FontWeight.w700,
                      fontSize: 13,
                    ),
                  ),
                ),
              ),
              Tab(
                icon: Icon(Icons.update,),
                child: Text.rich(
                  TextSpan(
                    text: "Updates",
                    style: TextStyle(
                      fontWeight: FontWeight.w700,
                      //fontSize: 13,
                    ),
                  ),
                ),
              ),
              Tab(
                icon: Icon(Icons.people_alt_outlined),
                child: Text.rich(
                  TextSpan(
                    text: "Communities",
                    style: TextStyle(
                      fontWeight: FontWeight.w700,
                      fontSize: 13,
                    ),
                  ),
                ),
              ),
              Tab(
                icon: Icon(Icons.call,),
                child: Text.rich(
                  TextSpan(
                    text: "Calls",
                    style: TextStyle(
                      fontWeight: FontWeight.w700,
                      fontSize: 13,
                    ),
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}