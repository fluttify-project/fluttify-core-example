import 'package:flutter/material.dart';

class ShowsIndoorMapScreen extends StatefulWidget {
  ShowsIndoorMapScreen();

  factory ShowsIndoorMapScreen.forDesignTime() => ShowsIndoorMapScreen();

  @override
  ShowsIndoorMapScreenState createState() => ShowsIndoorMapScreenState();
}

class ShowsIndoorMapScreenState extends State<ShowsIndoorMapScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('显示室内地图'),
        backgroundColor: Colors.black,
        centerTitle: true,
      ),
    );
  }
}
