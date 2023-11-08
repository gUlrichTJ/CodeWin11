
/// Contains all configuration pages
class AppPages {
  /// When the app is opened, this page should be the first
  /// to be shown
  static const initial = Routes.dashboard;

  static final routes [
    GetPage(
      name: _Paths.dashboard,
      page: () => DashboardScreen(),
    ),
  ];
}