part of dashboard;

class _BottomNavbar extends StatelessWidget {
  const _BottomNavbar({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return BottomNavigationBar(
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
