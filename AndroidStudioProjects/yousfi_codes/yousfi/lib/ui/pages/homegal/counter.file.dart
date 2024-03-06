import 'package:flutter/material.dart';

class CounterPage extends StatefulWidget {
  const CounterPage({super.key});

  @override
  State<CounterPage> createState() => _CounterPageState();
}

class _CounterPageState extends State<CounterPage> {

  int counter = 0;

  void incrementCounter() {
    setState(() {
      ++counter;
    });
  }

  // To decrement counter
  void decrementCounter() {
    setState(() {
      --counter;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Counter"),
      ),
      body: Center(
        child: Text(
            "Counter value => ${counter}",
        style: const TextStyle(
          fontSize: 28,
          color: Colors.black,
        ),),
      ),
      floatingActionButton: Row(
        mainAxisAlignment: MainAxisAlignment.end,
        children: [
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: FloatingActionButton(
              onPressed: decrementCounter,
              shape: const CircleBorder(),
              backgroundColor: Colors.red,
              child: const Center(
                child: Icon(
                    Icons.minimize,
                  size: 30,
                ),
              ),
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: FloatingActionButton(
              onPressed: incrementCounter,
              shape: const CircleBorder(),
              backgroundColor: Colors.blue.shade400,
              child: const Center(
                child: Icon(
                    Icons.add,
                  size: 40,
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
