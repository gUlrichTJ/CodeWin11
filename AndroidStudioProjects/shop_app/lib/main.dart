import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      home: OurHomePage(),
      home: 
    );
  }
}

class OurHomePage extends StatefulWidget {
  const OurHomePage({Key? key}) : super(key: key);

  @override
  State<OurHomePage> createState() => _OurHomePageState();
}

class _OurHomePageState extends State<OurHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.white,
        elevation: 0.0,
        actions: [
          IconButton(onPressed: () {},
              icon: const Icon(
                  Icons.help_outline,
                color: Colors.black,
                fill: 1,
              ),
          ),
        ],
      ),
      body: SingleChildScrollView(
        child: SafeArea(
          child: Padding(
            padding: const EdgeInsets.all(15.0),
            child: Column(
              children: <Widget>[
                Container(height: 20,),
                const Center(
                  child: Text(
                      "Welcome back",
                    style: TextStyle(
                      color: Colors.black,
                      fontSize: 30,
                      fontWeight: FontWeight.bold,

                    ),
                  ),
                ),
                Container(height: 20,),
                TextFormField(
                  decoration: const InputDecoration(
                    labelText: "Username",
                    hintText: "Username",
                    border: OutlineInputBorder(),
                  ),
                ),
                Container(height: 20,),
                TextFormField(
                  decoration: const InputDecoration(
                    labelText: "Password",
                    hintText: "Password",
                    border: OutlineInputBorder(),
                  ),
                ),
                Container(height: 20,),
                Container(
                  height: 40,
                  width: MediaQuery.of(context).size.width * 0.9,
                  decoration: BoxDecoration(
                    borderRadius: BorderRadius.circular(5.0),
                    color: Colors.blueAccent,
                  ),
                  child: TextButton(
                      onPressed: () {},
                    child: const Text(
                      "Log in",
                      style: TextStyle(color: Colors.white),
                    ),
                  ),
                ),
                Container(height: 20,),
                const Center(
                  child: Text(
                      "New user? Sign Up",
                    style: TextStyle(
                      decoration: TextDecoration.underline,
                    ),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}

