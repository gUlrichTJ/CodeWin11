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
      height = height >=320 ? 100 : height += 50;
    });
  }

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Column(
        children: [
          Row(
            children: <Widget>[
              AnimatedContainer(
                duration: Duration(
                  milliseconds: 500,
                ),
                curve: Curves.elasticOut,
                color: Colors.cyan.shade500,
                height: height,
                width: width,
                child: TextButton(
                  onPressed: increaseWidth,
                  child: Text(
                      "Tap\nto grow\nwith\n$height",
                      style: const TextStyle(
                        color: Colors.black,
                      ),
                      textAlign: TextAlign.center,
                    ),
                ),
              ),
            ],
          ),
        ],
      ),
    );
  }
}
