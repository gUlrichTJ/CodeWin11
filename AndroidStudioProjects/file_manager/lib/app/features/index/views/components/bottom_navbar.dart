part of dashboard;

class BottomNavbar extends StatelessWidget {
  const BottomNavbar({
    required this.onSelected,
    required this.currentIndex,
    Key? key}) : super(key: key);

  final Function(int index) onSelected;
  final int currentIndex;
  @override
  Widget build(BuildContext context) {
    return BottomNavigationBar(
      showSelectedLabels: false,
        showUnselectedLabels: false,
        items: [
          BottomNavigationBarItem(
              icon: Icon(Icons.home_outlined),
            activeIcon: Icon(Icons.home_filled),
            label: "home",
            tooltip: "home",
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.cloud_outlined),
            activeIcon: Icon(Icons.cloud),
            label: "cloud",
            tooltip: "cloud",
          ),
        ],
    );
  }
}
