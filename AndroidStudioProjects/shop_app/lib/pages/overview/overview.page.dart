import 'package:flutter/material.dart';

class Overview extends StatefulWidget {
  const Overview({Key? key}) : super(key: key);

  @override
  State<Overview> createState() => _OverviewState();
}

class _OverviewState extends State<Overview> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        elevation: 0,
        actions: [
          IconButton(
            onPressed: () {},
            icon: const Icon(
                Icons.settings_outlined,
              color: Colors.black54,
            ),
          ),
        ],
        backgroundColor: Colors.white,
      ),
      body: SafeArea(
        child: SingleChildScrollView(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            crossAxisAlignment: CrossAxisAlignment.end,
            children: <Widget>[
              const Text(
                  "Overview",
                style: TextStyle(
                  fontSize: 35,
                  fontWeight: FontWeight.bold,
                ),
              ),
              Container(height: 20,),
              Padding(
                padding: const EdgeInsets.all(15.0),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Container(
                      height: 101/*MediaQuery.of(context).size.width * 0.25*/,
                      width: MediaQuery.of(context).size.width * 0.4,
                      decoration: BoxDecoration(
                        borderRadius: BorderRadius.circular(10),
                        color: Colors.grey.shade300,
                      ),
                      child: childPadding("Total sales", "\$12,345"),
                    ),
                    Container(
                      height: 101,
                      width: MediaQuery.of(context).size.width * 0.38,
                      decoration: BoxDecoration(
                        borderRadius: BorderRadius.circular(10),
                        color: Colors.grey.shade300,
                      ),
                      child: childPadding("Total orders", "1,234"),
                    ),
                  ],
                ),
              ),
              Container(height: 20,),
              Container(
                height: 101,
                width: MediaQuery.of(context).size.width * 0.92,

                decoration: BoxDecoration(
                  color: Colors.grey.shade300,
                  borderRadius: BorderRadius.circular(10.0),
                ),
                child: childPadding("Total items", "123"),
              ),
              Container(height: 10,),
              Text("data", textAlign: TextAlign.left,),
            ],
          ),
        ),
      ),
    );
  }

  Padding childPadding(String string1, String string2) {
    return  Padding(
        padding: const EdgeInsets.all(18.0),
          child: Column(
                // Before I finish my formation at CIC, I'm already
              // asked work
              children: [
                Center(
                  child: Text(
                    string1,
                    textAlign: TextAlign.left,
                    style: const TextStyle(
                      fontSize: 18,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),
                Container(height: 10,),
                Center(
                  child: Text(
                    string2,
                    textAlign: TextAlign.left,
                    style: const TextStyle(
                  fontSize: 25,
                fontWeight: FontWeight.bold,
              ),
            ),
          ),
        ],
      ),
    );
  }
}