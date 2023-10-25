
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

  bool checked = false;
  late Function() onChanged;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
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
          icon: Icon(
              Icons.square,
            size: 20,
            fill: 0.0,
            weight: 0.1,
          )
          ),
          PopupMenuButton(
            elevation: 2,
            padding: EdgeInsets.all(1),
            icon: Icon(Icons.more_vert),
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
                PopupMenuItem(
                  padding: EdgeInsets.all(1),
                  child: ListTile(
                    onTap: () {

                    },
                    leading: Icon(Icons.desktop_windows),
                    title: Text("Desktop site"),
                    /*trailing: Checkbox(

                      onChanged: (bool? value) {
                        setState(() {
                          widget.checked = true;
                        });
                        widget.onChanged;
                      },
                      value: widget.checked,
                    ),

                     */
                    /*leading: CheckboxListTile(
                      title: Text("Desktop site"),
                      secondary: Icon(Icons.desktop_windows),
                      value: checkBoxValueDesktop,
                      onChanged: (ne) {
                        setState(() {
                          checkBoxValueDesktop = newValue;
                        });
                      },
                    ),*/
                  ),
                ),
                PopupMenuDivider(),
                PopupMenuItem(
                  padding: EdgeInsets.all(1),
                  child: ListTile(
                    onTap: () {

                    },
                    leading: Icon(Icons.settings),
                    title: Text("Settings"),
                  ),
                ),
                PopupMenuItem(
                  padding: EdgeInsets.all(1),
                  child: ListTile(
                    onTap: () {

                    },
                    leading: Icon(Icons.help),
                    title: Text("Help & feedback"),
                  ),
                ),
              ],
          ),
        ],
      ),

      // TODO: Le code du body
      body: CustomScrollView(
        slivers: [
          SliverAppBar(
            expandedHeight: 200,
            flexibleSpace: FlexibleSpaceBar(
              background: Image.network("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Google_2015_logo.svg/2560px-Google_2015_logo.svg.png"),
            ),
          ),
          // Research bar with voice and camera icons
          SliverAppBar(
            pinned: true,
            title: Text("Google search"),
            actions: <Widget>[
              IconButton(
                  onPressed: () {

                  },
                  icon: Icon(Icons.mic)
              ),
            ],
          ),
        ],
      ),
    );
  }
}

// We will try to create our icon
class HistoryIcon extends Icon {
  HistoryIcon(super.key);

  @override
  Widget build(BuildContext context) {
    return Container(
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
