import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      color: Colors.blue.shade300,

      home: HomePage(),
    );
  }
}

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'Cars',
          style: TextStyle(fontWeight: FontWeight.bold, fontFamily: "Arial"),
        ),
        elevation: 0,
      ),
      body: ListView(
        children: <Widget>[
          Cars(
              "BMW",
              "R2",
              "https://www.topgear.com/sites/default/files/news-listicle"
                  "/image/2023/01/1.jpeg?w=827&h=465"
          ),
          Cars(
              "BMW",
              "R2",
              "https://www.topgear.com/sites/default/files/news-listicle"
                  "/image/2023/01/1.jpeg?w=827&h=465"
          ),
          Cars(
              "BMW",
              "R2",
              "https://www.topgear.com/sites/default/files/news-listicle"
                  "/image/2023/01/1.jpeg?w=827&h=465"
          ),
          Cars(
              "BMW",
              "R2",
              "https://www.topgear.com/sites/default/files/news-listicle"
                  "/image/2023/01/1.jpeg?w=827&h=465"
          ),
          Cars(
              "BMW",
              "R2",
              "https://www.topgear.com/sites/default/files/news-listicle"
                  "/image/2023/01/1.jpeg?w=827&h=465"
          ),
        ],
      )
    );
  }
}

class Cars extends StatelessWidget {

  String name = "", model = "", image = "";

  // Constructor
  Cars(this.name, this.model, this.image);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.all(20.0),
      child: Center(
        child: Column(
          children: [
            Text(name),
            Text(model),
            Container(
              height: 200,
              width: 200,
              child: Image.network(image, fit: BoxFit.cover,),
            ),
          ],
        ),
      ),
    );
  }
}
