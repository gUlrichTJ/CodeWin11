
import 'package:chrome_clone/dartpages/home.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

// TODO: MyApp class
class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Let's clone chrome",
      debugShowCheckedModeBanner: false,
      /**
       * theme: ThemeData(
        primarySwatch: Colors.cyan,
      ),
       */
      home: MyHomePage(),
    );
  }
}


// TODO : the class that will return the popupmenu item
PopupMenuItem createCustomPopupMenuItem({
  required Icon leadingIcon,
  required String title,
  required VoidCallback onTap,
}) {
  return PopupMenuItem(
    padding: const EdgeInsets.all(1),
    child: ListTile(
      onTap: onTap,
      leading: leadingIcon,
      title: Text(title),
    ),
  );
}

// We will try to create our icon
class HistoryIcon extends Icon {
  HistoryIcon(super.key);

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      height: 3,
      width: 3,
      child: Text("${nombre_donglet_ouvert()}"),
    );
  }
}

// Methode pour connaître le nombre d'onglets ouverts
int nombre_donglet_ouvert() {
  int i = 3;
  return i;
}
class Our extends StatefulWidget {
  const Our({Key? key}) : super(key: key);

  @override
  State<Our> createState() => _OurState();
}

class _OurState extends State<Our> {
  @override
  Widget build(BuildContext context) {
    return const Placeholder();
  }
}

// TODO : la classe qui retourne l'image cliquable

// TODO : Fonction qui va retourner l'image cliquable dans le container
Widget retourneImageCliquable(
    BuildContext context,
    String lienImage,
    String description,
    String descriptionListTile,
    ) {
  return Column(
    children: [
      // TODO : The image's box
      SizedBox(
        height: MediaQuery.of(context).size.width * 0.4,
        child: ClipRRect(
          borderRadius: BorderRadius.circular(20),
          child: Image.network(
            fit: BoxFit.cover,
            lienImage,
            width: MediaQuery.of(context).size.width * 0.84,
          ),
        ),
      ),
      // TODO : The description of the image
      SizedBox(
        width: MediaQuery.of(context).size.width * 0.83,
          child: Text(
              description,
            // TODO : The style of the description
            style: const TextStyle(
            ),
            textAlign: TextAlign.justify,
          ),
      ),
      // TODO : The widget to have the icon, the title, the share icon and the more_vert's icon
      // TODO : God is beside us. He gives us strength and we just thank Him
      SizedBox(
        width: MediaQuery.of(context).size.width * 0.9,
        child: ListTile(
          contentPadding: const EdgeInsets.all(4),
          leading: const Icon(Icons.square_outlined),
          trailing: SizedBox(
            width: MediaQuery.of(context).size.width * 0.3,
            child: Row(
              mainAxisAlignment: MainAxisAlignment.end,
              children: [IconButton(
                  onPressed: () {
                  },
                  icon: const Icon(Icons.share),
              ),
              // Thank You Jesus
              IconButton(
                onPressed: () {
              },
                  icon: const Icon(Icons.more_vert),
              ),
            ],
          ),
          ),
          title: Text(descriptionListTile),
        ),
      ),
      // TODO : The divider
      const Divider(
        height: 5,
        color: Colors.grey,
      ),
    ],
  );
}
