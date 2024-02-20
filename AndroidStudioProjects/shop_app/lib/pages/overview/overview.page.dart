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
            children: <Widget>[
              const Text(
                  "Overview",
                style: TextStyle(
                  fontSize: 35,
                  fontWeight: FontWeight.bold,
                ),
              ),
              Container(height: 20,),
              Row(
                children: [
                  Container(
                    height: MediaQuery.of(context).size.width * 0.4,
                    width: MediaQuery.of(context).size.width * 0.4,
                    child: const Text(
                      ""
                    ),
                  )
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}
