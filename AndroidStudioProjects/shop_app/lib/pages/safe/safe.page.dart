import 'package:flutter/material.dart';

class SafeAr extends StatefulWidget {
  const SafeAr({Key? key}) : super(key: key);

  @override
  State<SafeAr> createState() => _SafeArState();
}

class _SafeArState extends State<SafeAr> {
  @override
  Widget build(BuildContext context) {
    return SafeArea(child: child);
  }
}

