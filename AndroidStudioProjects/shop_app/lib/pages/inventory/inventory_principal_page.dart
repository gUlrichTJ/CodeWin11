/// This is the inventory principal page.
/// This page will contain the appbar that will possess all, in stock, low stock, out of stock

import 'package:flutter/material.dart';

class Inventory extends StatelessWidget {
  const Inventory({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Inventory"),
        
      ),
    );
  }
}
