library dashboard;

import 'package:file_manager/app/features/cloud/views/screens/cloud_screen.dart';
import 'package:file_manager/app/features/home/views/screens/home_screen.dart';
import 'package:flutter/material.dart';
import 'package:get/get.dart';

// binding
part '../../bindings/dashboard_binding.dart';
// controllers
part '../../controllers/dashboard_controllers.dart';
// component
part '../components/bottom_navbar.dart';

class DashboardScreen extends GetView<DashboardController> {
  const DashboardScreen() : super();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: PageView(
        controller: controller.page,
        onPageChanged: (index) => controller.onChangedPage(index),
        children: [
          HomeScreen(),
          CloudSreen(),
        ],
      ),
      bottomNavigationBar: Obx(
        () =>  BottomNavbar(
          currentIndex: controller.currentIndex.value,
          onSelected: (index) {
            controller.changePage(index);
          },
        ),
      ),
    );
  }
}
