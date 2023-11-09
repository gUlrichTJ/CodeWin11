part of dashboard;

class DashboardController extends GetxController {
  final currentIndex = 0.obs;

  void onChangedPage(int index) {
    currentIndex.value = index;

  }
}