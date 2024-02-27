import 'package:flutter/material.dart';

class AnimatedCrossFadeWidget extends StatefulWidget {
  const AnimatedCrossFadeWidget({Key? key}) : super(key: key);

  @override
  State<AnimatedCrossFadeWidget> createState() => _AnimatedCrossFadeWidgetState();
}

class _AnimatedCrossFadeWidgetState extends State<AnimatedCrossFadeWidget> {
  bool crossFadeStateShowFirst = true;

  void crossFade() {
    setState(() {
      crossFadeStateShowFirst = crossFadeStateShowFirst ? false : true;
    });
  }
  @override
  Widget build(BuildContext context) {
    return const Placeholder();
  }
}
