part of dashboard;

class DashboardController extends GetxController {
  final currentIndex = 0.obs;
  final page = PageController();

  void changePage(int index) {
    page.animateToPage(
        index,
        duration: Duration(milliseconds: 300),
        curve: Curves.ease,
    );
  }

  void onChangedPage(int index) {
    currentIndex.value = index;

  }
}