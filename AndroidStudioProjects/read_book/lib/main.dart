import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "read book",
      theme: ThemeData(
        primarySwatch: Colors.grey,
        canvasColor: Colors.grey.shade400,
      ),
      home: const OurHomePage(),
    );
  }
}

class OurHomePage extends StatefulWidget {
  const OurHomePage({Key? key}) : super(key: key);

  @override
  State<OurHomePage> createState() => _OurHomePageState();
}

class _OurHomePageState extends State<OurHomePage> {

  double height = 100.0, width = 100.0;

  increasedWidth() {
    setState(() {
      width = width > 320.0 ? 100 : width += 50;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        actions: <Widget>[
          IconButton(
              onPressed: () {},
              icon: const Icon(
                  Icons.more_vert,
              ),
          ),
        ],
      ),
      drawer: const Drawer(),
      body:  SafeArea(
        child: SingleChildScrollView(
          padding: const EdgeInsets.all(12.0),
          child: Padding(
            padding: const EdgeInsets.all(8.0),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: <Widget>[
                Container(
                  decoration: BoxDecoration(
                    borderRadius: const BorderRadius.all(Radius.circular(10)),
                    color: Colors.black,
                    gradient: LinearGradient(
                      colors: [
                        Colors.orange,
                        Colors.yellow.shade100,
                      ],
                    ),
                    boxShadow: const  [
                      BoxShadow(
                        color: Colors.black,
                        blurRadius: 2.0,
                        offset: Offset(1, 1,),
                      ),
                    ],
                  ),
                    child: const Expanded(
                      child: Center(
                        child: SizedBox(
                          width: 100,
                          height: 100,
                        ),
                      ),
                    ),
                ),

                const Divider(),

                TextField(
                  keyboardType: TextInputType.text,
                  style: const TextStyle(
                    color: Colors.black,
                    fontSize: 16,
                    fontFamily: "`Roboto, Serif",
                  ),
                  decoration: InputDecoration(
                    labelText: "Notes",
                    labelStyle: TextStyle(color: Colors.grey.shade900),
                    border: const OutlineInputBorder(),
                  ),
                ),
                const Divider(
                  height: 30,
                  color: Colors.grey,
                ),
                // A form-field
                TextFormField(
                  decoration: const InputDecoration(
                    labelText: "Enter you notes",
                    border: OutlineInputBorder(),
                  ),
                ),

                const Divider(height: 20,),

                SafeArea(
                  child: Column(
                    children: <Widget>[
                      const Icon(
                          Icons.school,
                        color: Colors.black,
                        size: 80,
                      ),
                      const Divider(height: 30,),
                      Center(
                        child: Container(
                          height: 100,
                          width: 100,
                          color: Colors.yellow.shade400,
                          child: const Center(child: Text("Portrait")),
                        ),
                      ),

                      const Divider(height: 30,),

                      // We put the gridview
                      SafeArea(
                        child: GridView.count(
                          primary: false,
                          padding: const EdgeInsets.all(5),
                          crossAxisCount: 4,
                          crossAxisSpacing: 25,
                          mainAxisSpacing: 0,
                          shrinkWrap: true,
                          children: const <Widget>[
                            Text("Grid 0"),
                            Text("Grid 1"),
                            Text("Grid 2"),
                            Text("Grid 3"),
                            Text("Grid 4"),
                            Text("Grid 5"),
                            Text("Grid 6"),
                            Text("Grid 7"),
                          ],
                        ),
                      ),

                      const Divider(height: 20,),

                      Center(
                        child: Container(
                          height: 100,
                          width: 100,
                          color: Colors.yellow.shade400,
                          child: const Center(
                              child: Text("Portrait"),
                          ),
                        ),
                      ),

                      const Divider(height: 20,),
                      Row(
                        children: <Widget>[
                          AnimatedContainer(
                              duration: const Duration(milliseconds: 500),
                            curve: Curves.elasticOut,
                            color: Colors.amber,
                            height: height,
                            width: width,
                            child: IconButton(
                              onPressed: increasedWidth,
                              icon: Icon(Icons.add,
                                size: 40,
                              ),
                            ),
                          ),
                        ],
                      ),
                    ],
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

