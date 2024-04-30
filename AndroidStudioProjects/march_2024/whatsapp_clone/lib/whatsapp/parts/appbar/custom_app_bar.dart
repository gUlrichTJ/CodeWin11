import 'package:flutter/material.dart';

/// Method for chats, updates and calls
AppBar customAppBar(String name, Icon icon1, Icon icon2, Icon icon3) {
  return AppBar(
    title: Text(name),
    actions: [
      icon1,
      icon2,
      icon3,
    ],
  );
}

/// Method for communities
AppBar customAppBar2(String name, Icon icon1, Icon icon2) {
  return AppBar(
    title: Text(name),
    actions: [
      icon1,
      icon2,
    ],
  );
}
