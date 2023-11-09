library dashboard;

import 'package:flutter/material.dart';
import 'package:get/get.dart';

// Controllers
part '../../controllers/dashboard_controllers.dart';
// Component
part '../components/bottom_navbar.dart';

class DashboardScreen extends GetView<DashboardController> {
  const DashboardScreen() : super();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Text("dashboard"),
      ),
      bottomNavigationBar: BottomNavbar(
        currentIndex: controller.currentIndex.value,
        onSelected: (index) {
          controller.onChangedPage(index);
        },
      ),
    );
  }
}
