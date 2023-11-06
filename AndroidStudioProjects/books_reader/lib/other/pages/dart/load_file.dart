import 'package:flutter/material.dart';
import 'package:flutter/services.dart' show rootBundle;

class FileLoad {
  /// We declare a private variable to store the content of the file
  String _text = "";

  /// We declare a getter method named file that return a Future String
  /// and loads the content of the text file using rootBundle object
  /// if _text is null
  Future<String> get file async {
    /// If the text is null, we wait
    if (_text == null) {
      _text = await rootBundle.loadString("assets/job23.txt");
    }
    return _text;
  }
}

/// We create a class that will have a gloabal variable
class GlobalString {
  static String? text;
}
