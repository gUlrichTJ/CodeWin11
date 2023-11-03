import 'package:flutter/material.dart';

import '../main.dart';

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
                  leading: const Icon(Icons.lock_outline),
                  title: const Text("New Incognito tab"),
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
                  leading: const Icon(Icons.tab),
                  title: Text("Recent tabs"),
                ),
              ),
              const PopupMenuDivider(),
              createCustomPopupMenuItem(
                leadingIcon: const Icon(Icons.desktop_windows),
                title: "Desktop site",
                onTap: () {

                },
              ),
              const PopupMenuDivider(),
              createCustomPopupMenuItem(
                leadingIcon: const Icon(Icons.settings),
                title: "Settings",
                onTap: () => {

                },
              ),
              createCustomPopupMenuItem(
                  leadingIcon: const Icon(Icons.help),
                  title: "Help & feedback",
                  onTap: () {

                  }
              ),
              createCustomPopupMenuItem(
                leadingIcon: const Icon(Icons.add_box_outlined),
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
        child: Column(
          children: [
            Stack(
              children: [
                LayoutBuilder( // TODO : Un layout builder pour occupy
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
            Stack(
              children: [
                Container(
                  child: Padding(
                    padding: const EdgeInsets.all(2),
                    child: SearchAnchor(
                      builder: (context, controller) {
                        return SizedBox(
                          width: MediaQuery.of(context).size.width * 0.9,
                          // TODO : La barre de recherche
                          child: SearchBar(
                            padding: const MaterialStatePropertyAll<EdgeInsets>(
                              EdgeInsets.symmetric(horizontal: 20.0),
                            ),
                            leading: const Icon(Icons.search),
                            trailing: <Widget>[
                              IconButton(onPressed: () {

                              },
                                  icon: const Icon(Icons.mic_rounded)
                              ),
                              IconButton(onPressed: () {

                              },
                                  icon: const Icon(Icons.photo_camera_outlined)
                              ),
                            ],
                          ),
                        );
                      }, suggestionsBuilder: (BuildContext context, SearchController controller) {
                      return List.empty();
                    },
                    ),
                  ),
                ),
              ],
            ),
            // TODO : Nous allons mettre les icones récentes

            const Divider(),
            // TODO : Créer le container qui va recevoir les images avec les liens.
            retourneImageCliquable(
                context,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/1600px-Flag_of_New_Zealand.svg.png",
                "New Zealand is a beautiful island country located"
                    " in the southwestern Pacific Ocean.",
                "just"
            ),
            // TODO : Retourner l'image de R cliquable
            retourneImageCliquable(
                context,
                "https://microbenotes.com/wp-content/uploads/2023/04/Bioinformatics-Python-and-R-Programming-Language.jpg",
                "Learn the R Programming language for data science like the Python Language.",
                "Description"
            ),
            retourneImageCliquable(
              context,
              "https://images.shiksha.com/mediadata/images/articles/1600012449phpmcJG1Q.jpeg",
              "Mit Students are among the best of the world. I really appreciate them.",
              "MIT Students.",
            ),
            retourneImageCliquable(
              context,
              "https://chinesepod.com/blog/wp-content/uploads/2018/11/read-pinyin.jpg",
              "Learn chinesse and speak it fluently like natives. It's not difficult. Just enroll !",
              "Chinesse learning",
            ),
            retourneImageCliquable(
              context,
              "https://southernstudies.olemiss.edu/media/new-encyclopedia-southern-culture-940x348.jpeg",
              "Read encyclopedia of southern culture of 1989",
              "Southern encyclopedia",
            ),
            retourneImageCliquable(
              context,
              "https://i.pcmag.com/imagery/reviews/05cItXL96l4LE9n02WfDR0h-5.fit_scale.size_1028x578.v1582751026.png",
              "When you're tired, watch films on netflix for fun and for free. Secured films.",
              "Netflix",
            ),
            retourneImageCliquable(
              context,
              "https://media.cnn.com/api/v1/images/stellar/prod/200126214640-27-kobe-bryant-gallery-restricted.jpg?q=w_2500,h_2500,x_0,y_0,c_fill",
              "Kobe Bryant, one of the bests basketball players finished his life in an Airplane's crash but his works stay to testify",
              "Kobe Bryant",
            ),
            retourneImageCliquable(
              context,
              "https://media.licdn.com/dms/image/D4E03AQHLIIxLO3LnLA/profile-displayphoto-shrink_800_800/0/1679348450752?e=1704326400&v=beta&t=igRAI0P4SUyMh4s6EnWK34aNYd6c8XeG4g-qGn_rLKs",
              "KELE Bernadin, one of the best flutter developers in Togo has got his bachelor degree after three years of study at EPL",
              "KELE Bernadin",
            ),
            retourneImageCliquable(
              context,
              "https://yop.l-frii.com/wp-content/uploads/2023/03/Pasteur-Marcelo-Tunasi-met-en-garde-les-couples-maries-Vous-allez-tous-divorcer-si.jpg",
              "Pastor Marcello TUNASI is a pastor COMPASSION churches. He's also the author of some christians books and he works in many domains",
              "Marcello Tunasi",
            ),
            retourneImageCliquable(
              context,
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJLgYh0m-MfcABUv8-ZADCB7c4UwsjfwDiG3BuYBW6cg&s",
              "Melé Urielle G. the Africa Beauty Miss",
              "Urielle Graciela",
            ),
            retourneImageCliquable(
              context,
              "https://media.wired.com/photos/5fd2c29c2a4ddaf3b6389694/16:9/w_2240%2Cc_limit/Gear-Books-Roundup-671406905.jpg",
              "Books reading is necessary for humans",
              "Library",
            ),
            retourneImageCliquable(
              context,
              "https://i.guim.co.uk/img/media/ced917f337eab6470263656836d2cfdea8640a7d/232_152_5212_3128/master/5212.jpg?width=700&dpr=2&s=none",
              "Lionel Messi and Cristiano Ronaldo in action during the Riyadh All-Star XI vs Paris Saint-Germain match.",
              "Messi and CR7",
            ),
            retourneImageCliquable(
              context,
              "https://physics.aps.org/assets/8e52db55-73fc-43b7-a90b-a45e6d01fff9/es111_medium_1.png",
              "Solar system",
              "Solar system",
            ),
            retourneImageCliquable(
              context,
              "https://static.independent.co.uk/2023/11/01/04/Trump_Fraud_Lawsuit_50285.jpg?quality=75&width=640&auto=webp",
              "Donald Trump’s sons Don Jr. and Eric set to testify at fraud trial that threatens family’s empire",
              "Donald Trump",
            ),
            retourneImageCliquable(
              context,
              "https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Photo_Faure_Gnassingbe_2023.jpg/440px-Photo_Faure_Gnassingbe_2023.jpg",
              "The president of Togo has done more than 16 years on the head of the country.",
              "M. Faure Essossimna G.",
            ),
            retourneImageCliquable(
              context,
              "https://media.licdn.com/dms/image/D5603AQEI4UU6lhir8w/profile-displayphoto-shrink_800_800/0/1668182393725?e=1704326400&v=beta&t=Uwbsf7eKruMC0BSYO5_KMkqQDzedG7JdM9tFZCH--rQ",
              "The winner of the Ambassadrice de l'environnement constest. She is the best of all speakers and competitors.",
              "Alassani Karima",
            ),
            retourneImageCliquable(
              context,
              "https://www.cut-the-knot.org/m/Algebra/InequalitiesWithDoubleAndTripleIntegrals.jpg", "Mathematics, especially triple integrals are very important.",
              "Triple integrals",
            ),
            retourneImageCliquable(
                context,
                "https://ambatogochine.com/wp-content/uploads/2020/08/PIA-Togo-1.jpg", "Plateforme industrielle d'Adetikope au Togo. Grande industrie du Togo.",
                "PIA-TOGO",
            ),
          ],
        ),
      ),
    );
  }
}