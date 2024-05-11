import 'package:creating_app_nav/other/pages/slack_page.dart';
import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        centerTitle: true,
        backgroundColor: Colors.white,
        leading: Expanded(
          child: Row(
            children: [
              Expanded(
                child: Container(
                  decoration: BoxDecoration(
                    color: Colors.white,
                    border: Border.all(
                      width: 1,
                    ),
                    borderRadius: BorderRadius.circular(13),
                  ),
                  child: const Text("Get Dropbox Basic"),
                ),
              ),
            ],
          ),
        ),
        title: const Center(
            child: ListTile(
              // leading: Icon(Icons.arrow_drop_down_circle),
              title: Text(
                  "Dropbox",
                style: TextStyle(fontWeight: FontWeight.w600),
                textAlign: TextAlign.center,
              ),
            ),
        ),
        actions: const [
          Text(
              "Compare plans - Sign in",
            style: TextStyle(
              color: Colors.blue,
            ),
          ),
        ],
      ),
      // the body of the app
      body: Expanded(
        child: Container(
          decoration: const BoxDecoration(
            image: DecorationImage(
              image: AssetImage("assets/images/pink_mac_book.jpeg"),
              fit: BoxFit.cover,
            )
          ),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.start,
            children: [
              const SizedBox(
                width: 300,
                height: 200,
              ),
              Padding(
                padding: const EdgeInsets.fromLTRB(10.0, 5.0, 10.0, 8.0),
                child: Text(
                  "Boost productivity ",
                  style: TextStyle(
                    color: Colors.blue.shade800,
                    fontSize: 30,
                  ),
                  textAlign: TextAlign.left,
                ),
              ),
              Padding(
                padding: const EdgeInsets.all(0.0),
                child: Text(
                  "with Dropbox Business",
                  style: TextStyle(
                    color: Colors.blue.shade800,
                    fontSize: 30,
                  ),
                  textAlign: TextAlign.left,
                ),
              ),
              const Text(
                "The secure file sharing and storage solution that employees and IT admins trust."
              ),
              Row(
                children: [
                  Container(
                    child: Text("Hello"),
                  ),
                  Container(
                    child: Text("You're fine."),
                  ),
                ],
              )
            ],
          ),
        ),
      ),
      bottomNavigationBar: Expanded(
        child: Row(
          // mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: [
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Container(
                height: 40,
                decoration: BoxDecoration(
                  color: Colors.blue.shade900,
                  borderRadius: BorderRadius.circular(5),
                ),
                child: const Center(
                  child: Padding(
                    padding: EdgeInsets.all(8.0),
                    child: Text(
                        "Try Dropbox Business free",
                      style: TextStyle(
                        fontSize: 16,
                        color: Colors.white,
                      ),
                    ),
                  ),
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.fromLTRB(10.0, 5.0, 10.0, 8.0),
              child: GestureDetector(
                onTap: () {
                  Navigator.of(context).push(
                    MaterialPageRoute(
                      builder: (context) => const SlackPage(),
                    ),
                  );
                },
                child: Container(
                  height: 40,
                  decoration: BoxDecoration(
                    color: Colors.white,
                    borderRadius: BorderRadius.circular(5),
                    border: Border.all(
                      width: 1,
                      color: Colors.blue.shade800,
                    )
                  ),
                  child: Center(
                    child: Padding(
                      padding: const EdgeInsets.fromLTRB(10.0, 5.0, 10.0, 8.0),
                      child: Text(
                        "Get Dropbox Basic",
                        style: TextStyle(
                          fontSize: 16,
                          color: Colors.blue.shade900,
                        ),
                      ),
                    ),
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
