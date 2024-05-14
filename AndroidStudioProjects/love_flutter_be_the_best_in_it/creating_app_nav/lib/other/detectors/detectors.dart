import 'package:flutter/material.dart';

GestureDetector buildGestureDetectorSlack(BuildContext context) {
  return GestureDetector(
    onTap: () {
      Navigator.of(context).pop();
    },
    child: Padding(
      padding: const EdgeInsets.all(15.0),
      child: Text(
        "slack",
        style: TextStyle(
          color: Colors.blue.shade800,
          fontSize: 17,
        ),
      ),
    ),
  );
}

GestureDetector buildGestureDetectorWhy() {
  return GestureDetector(
    onTap: () {},

    child: const Text(
      "Why slack",
      style: TextStyle(
        color: Colors.black,
        // fontSize: 17,
      ),
    ),
  );
}

GestureDetector buildGestureDetectorSolutions() {
  return GestureDetector(
    onTap: () {},

    child: const Text(
      "Solutions",
      style: TextStyle(
        color: Colors.black,
        // fontSize: 17,
      ),
    ),
  );
}

GestureDetector buildGestureDetectorResources() {
  return GestureDetector(
    onTap: () {},

    child: const Text(
      "Resources",
      style: TextStyle(
        color: Colors.black,
        // fontSize: 17,
      ),
    ),
  );
}

GestureDetector buildGestureDetectorPricing() {
  return GestureDetector(
    onTap: () {},

    child: const Text(
      "Pricing",
      style: TextStyle(
        color: Colors.black,
        // fontSize: 17,
      ),
    ),
  );
}

GestureDetector buildGestureDetectorSignIn() {
  return GestureDetector(
    onTap: () {},

    child: const Text(
      "Sign in",
      style: TextStyle(
        color: Colors.blue,
        // fontSize: 17,
      ),
    ),
  );
}

GestureDetector buildGestureDetectorGetStarted() {
  return GestureDetector(
    onTap: () {},

    child: Container(
      height: 40,
      width: 135,
      decoration: BoxDecoration(
        color: Colors.purple.shade800,
        borderRadius: BorderRadius.circular(5.0),
      ),
      child: const Center(
        child: Text(
          "GET STARTED",
          style: TextStyle(
            color: Colors.white,
            fontWeight: FontWeight.w600,
          ),
        ),
      ),
    )
  );
}
