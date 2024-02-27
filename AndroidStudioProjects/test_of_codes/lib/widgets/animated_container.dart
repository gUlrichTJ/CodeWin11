import 'package:flutter/material.dart';

class AnimatedContainerWidget extends StatefulWidget {
  const AnimatedContainerWidget({Key? key}) : super(key: key);

  @override
  State<AnimatedContainerWidget> createState() => _AnimatedContainerWidgetState();
}

class _AnimatedContainerWidgetState extends State<AnimatedContainerWidget> {
  double height = 100.0, width = 100.0;

  void increaseWidth() {
    setState(() {
      width = width >=320 ? 100 : width += 50;
    });
  }
  @override
  Widget build(BuildContext context) {
    return Row(
      children: <Widget>[
        AnimatedContainer(
          duration: Duration(
            milliseconds: 500,
          ),
          curve: Curves.elasticOut,
          color: Colors.amber,
          height: height,
          width: width,
          child: TextButton(
            child: Text("Tap\nto grow\nwith\n$width"),
            onPressed: increaseWidth,
          ),
        ),
      ],
    );
  }
}
