library dashboard;

import 'package:flutter/material.dart';

part '../components/bottom_navbar.dart';

class DashboardScreen extends StatelessWidget {
  const DashboardScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Text("dashboard"),
      ),
      bottomNavigationBar: _BottomNavbar(),
    );
  }
}
