import 'package:flutter/material.dart';
import 'package:whatsapp_clone/whatsapp/lists/list_of_contacts.dart';
import 'package:whatsapp_clone/whatsapp/parts/appbar/custom_app_bar.dart';

class WhatsappChats extends StatelessWidget {
  WhatsappChats({super.key});

  /// Creation of a list of contacts
  final listOfContacts = [
    ListOfContacts(
        "Graciano",
        "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "I miss you a lot.",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "If only, I could see you again !",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "Reacted to message",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "Last time, I reached the 50 wpm, how do you find it ?",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),
    ListOfContacts(
      "Graciano",
      "Ulrich",
      "https://media.licdn.com/dms/image/D4E03AQHOSnUhnriGpg/profile-displayphoto-shrink_800_800/0/1699737016080?e=1720051200&v=beta&t=OBwPH-n2OOb8rufcNpKXl24HSUem5lbE2imtnsL_sWo",
      "",
    ),

  ];

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Whatsapp",
      debugShowCheckedModeBanner: false,

      home: Scaffold(
        appBar: customAppBar(
            "Whatsapp",
            const Icon(Icons.camera_alt_outlined),
            const Icon(Icons.search),
            const Icon(Icons.more_vert),
        ),
        body: ListView.builder(
          itemCount: listOfContacts.length,
            itemBuilder: (context, index) {
              return Padding(
                padding: const EdgeInsets.all(14.0),
                child: Row(
                  children: [
                    CircleAvatar(
                      radius: 24,
                      backgroundImage: NetworkImage(listOfContacts[index].image),
                    ),
                    Expanded(
                      child: ListTile(
                        title: Text("${listOfContacts[index].firstname} ${listOfContacts[index].surname}"),
                        /// The message that is seen
                        subtitle: Text(listOfContacts[index].message),
                        // the following button or time
                        trailing: const Text("Yesterday"),
                      ),
                    ),
                  ],
                ),
              );
            }
        ),
      ),
    );
  }
}
