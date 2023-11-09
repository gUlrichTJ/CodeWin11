import 'package:file_manager/app/config/routes/app_routes.dart';
import 'package:file_manager/app/features/index/views/screens/dashboard_screens.dart';
import 'package:get/get.dart';

/// Contains all configuration pages
class AppPages {
  /// When the app is opened, this page should be the first
  /// to be shown
  static var initial = Routes.dashboard;

  static final routes = [
    GetPage(
      name: Paths.dashboard,
      page: () => DashboardScreen(),
      binding: DashboardBinding(),
    ),
  ];
}
