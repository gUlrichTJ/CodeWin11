
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

// TODO: Home page
class MyHomePage extends StatefulWidget {
  MyHomePage({Key? key}) : super(key: key);

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      drawer: Drawer(),
      appBar: AppBar(
        // The icon of home
        leading: IconButton(
          onPressed: () {

          },
          icon: Icon(Icons.home_outlined),
        ),
        actions: [
          IconButton(
              onPressed: () {

              },
              icon: CircleAvatar(
                //backgroundImage: NetworkImage('https://media.licdn.com/media/AAYQAQSOAAgAAQAAAAAAAB-zrMZEDXI2T62PSuT6kpB6qg.png'),
                backgroundImage: NetworkImage("http://cdn.primedia.co.za/primedia-broadcasting/image/upload/c_fill,w_847/fvzlw5w65lxgv9zlussq"),
              ),
          ),
          IconButton(
          onPressed: () {

          },
          icon: const Icon(
              Icons.square,
            size: 20,
            fill: 0.0,
            weight: 0.1,
          )
          ),
          PopupMenuButton(
            elevation: 2,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(10.10),
            ),
            padding: const EdgeInsets.all(1),
            icon: const Icon(Icons.more_vert),
              itemBuilder: (BuildContext context) => <PopupMenuEntry>[
                PopupMenuItem(
                  padding: EdgeInsets.all(1),
                  child: ListTile(
                    onTap: () {

                    },
                    leading: Icon(Icons.add_box_outlined),
                    title: Text("New tab"),
                  ),
                ),
                PopupMenuItem(
                  padding: EdgeInsets.all(1),
                  child: ListTile(
                    onTap: () {

                    },
                    leading: Icon(Icons.lock_outline),
                    title: Text("New Incognito tab"),
                  ),
                ),
                PopupMenuDivider(),
                PopupMenuItem(
                  padding: EdgeInsets.all(1),
                  child: ListTile(
                    onTap: () {

                    },
                    leading: Icon(Icons.history),
                    title: Text("History"),
                  ),
                ),
                PopupMenuItem(
                  padding: EdgeInsets.all(1),
                  child: ListTile(
                    onTap: () {

                    },
                    leading: Icon(Icons.download),
                    title: Text("Downloads"),
                  ),
                ),
                PopupMenuItem(
                  padding: EdgeInsets.all(1),
                  child: ListTile(
                    onTap: () {

                    },
                    leading: Icon(Icons.bookmark),
                    title: Text("Bookmarks"),
                  ),
                ),

                PopupMenuItem(
                  padding: EdgeInsets.all(1),
                  child: ListTile(
                    onTap: () {

                    },
                    leading: Icon(Icons.tab),
                    title: Text("Recent tabs"),
                  ),
                ),
                PopupMenuDivider(),
                createCustomPopupMenuItem(
                    leadingIcon: Icon(Icons.desktop_windows),
                    title: "Desktop site",
                    onTap: () {

                    },
                ),
                PopupMenuDivider(),
                createCustomPopupMenuItem(
                    leadingIcon: Icon(Icons.settings),
                    title: "Settings",
                    onTap: () => {

                    },
                ),
                createCustomPopupMenuItem(
                    leadingIcon: Icon(Icons.help),
                    title: "Help & feedback",
                    onTap: () {

                    }
                ),
                createCustomPopupMenuItem(
                    leadingIcon: Icon(Icons.add_box_outlined),
                    title: "We try sth",
                    onTap: () => {

                    },
                ),
              ],
          ),
        ],
      ),

      // TODO: Le code du body
      body: SingleChildScrollView(
        child: Stack(
          children: [
            LayoutBuilder( // TODO : Un layout builder pour ocuuper
              // toute la taille réservée
              builder: (context, constraints) {
                return SizedBox(
                  width: MediaQuery.of(context).size.width,
                    child: const Image(
                        image:AssetImage("assets/google_image.jpeg")
                    ),
                );
              },
            ),
          ],
        ),
      ),

    );
  }
}

// TODO : the class that will return the popupmenuitem
PopupMenuItem createCustomPopupMenuItem({
  required Icon leadingIcon,
  required String title,
  required VoidCallback onTap,
}) {
  return PopupMenuItem(
    padding: EdgeInsets.all(1),
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
