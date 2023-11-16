import 'package:file_manager/app/features/home/views/components/header.dart';
import 'package:flutter/material.dart';

// part '../../models/usage.dart';
// part '../../models/user.dart';

// components
// part '../components/header.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child: CustomScrollView(
          slivers: [
            SliverFillRemaining(
              child: Column(
                children: [
                  Header(),
                  // Automate the boring stuff
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
