import 'package:code_book_reading/login/login.file.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
   const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      /* theme: ThemeData(
        primarySwatch: Colors.grey,
        canvasColor: Colors.white,
      ),
       */
      debugShowCheckedModeBanner: false,
      // The home
      // home: const OurHomePage(),
      home: LoginPage(),
    );
  }
}

class OurHomePage extends StatefulWidget {
   OurHomePage({Key? key}) : super(key: key);

  @override
  State<OurHomePage> createState() => _OurHomePageState();
}

class _OurHomePageState extends State<OurHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Application"),
        actions: [
          IconButton(onPressed: () {},
              icon: const Icon(Icons.more_vert),
          ),
          IconButton(
              onPressed: () {},
              icon: const Icon(Icons.menu)
          ),
        ],
      ),

      body:  SafeArea(
        child: SingleChildScrollView(
          child: Padding(
            padding: EdgeInsets.all(16.0),
            child: Column(
              children: <Widget>[
                ImageAndIconWidget(),
              ],
            ),
          ),
        ),
      ),
    );
  }
}

class ImageAndIconWidget extends StatelessWidget {
   ImageAndIconWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    double sizeOfImg1 = MediaQuery.of(context).size.width / 3;
    return Column(
      children: [
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: <Widget>[
            Image(
                image: const AssetImage("assets/images/build.png"),
              fit: BoxFit.cover,
              width: sizeOfImg1,
            ),
            Image(
              image: const AssetImage("assets/images/close.png"),
              fit: BoxFit.cover,
              width: sizeOfImg1,
            ),
            const Icon(
              Icons.brush,
              color: Colors.lightBlue,
              size: 100,
            ),
          ],
        ),
        const Divider(),
        Row(
          children: [
            Container(
              height: 100,
              width: 100,
              decoration: const BoxDecoration(
                borderRadius: BorderRadius.all(Radius.circular(20.0)),
                color: Colors.green,
                boxShadow: [
                  BoxShadow(
                    color: Colors.black38,
                    blurRadius: 14.0,
                    offset: Offset(5.0, 5.0,),
                  ),
                ],
              ),
            ),
          ],
        ),
        const Divider(),

        // Inputting a text form
        const TextField(
          keyboardType: TextInputType.text,
          style: TextStyle(
            color: Colors.black,
            fontSize: 16.0,
          ),
          decoration: InputDecoration(
            labelText: "Notes",
            labelStyle: TextStyle(color: Colors.deepPurple),
            border: UnderlineInputBorder(),
          ),
        ),
        const Divider(),
        TextFormField(
          decoration: const InputDecoration(
            labelText: "Input your notes",
          ),
        ),
      ],
    );
  }
}

