import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
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
      ),
    );
  }
}

