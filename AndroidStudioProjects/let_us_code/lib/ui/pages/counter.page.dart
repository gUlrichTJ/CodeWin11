import 'package:flutter/material.dart';

class CounterPage extends StatefulWidget {

  @override
  State<CounterPage> createState() => _CounterPageState();
}

class _CounterPageState extends State<CounterPage> {
  int counter = 0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Counter'),),
        body: Center(
          child: Text('Counter Value => ${counter}',
          style: TextStyle(fontSize: 23, color: Colors.purple),
        ),
      ),
      // Pour créer les boutons qui
      floatingActionButton: Row(
        mainAxisAlignment: MainAxisAlignment.end,
        children: [
          FloatingActionButton(
            child: Icon(Icons.add),
            onPressed: () {
              setState(() {
                counter += 2;
              });
              print(counter);
            },
          ),

          // Pour décrémenter
          FloatingActionButton(
            child: Icon(Icons.remove),
            onPressed: () {
              setState(() {
                --counter;
              });
              print(counter);
            },
          ),

          /*
          // Pour multiplier
          FloatingActionButton(
            child: Icon(Icons.multiple_stop),
            onPressed: () {
              setState(() {
                counter %= 3;
              });
              print(counter);
            },
          ),
        */
          SizedBox(width: 8,),
        ],
      )
    );
  }
}