import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class GlobalParams {
  static List<Map<String, dynamic>> menus = [
    {
      "title":"Counter", "icon":Icon(Icons.home),"route":"/counter"
    },
    {
      "title":"Meteo", "icon":Icon(Icons.camera),"route":"/meteo"
    },
    {
      "title":"Gallery", "icon":Icon(Icons.map),"route":"/gallery"
    }
  ];
}