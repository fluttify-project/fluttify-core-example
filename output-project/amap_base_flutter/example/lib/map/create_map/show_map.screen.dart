import 'dart:async';

import 'package:flutter/material.dart';

class ShowMapScreen extends StatefulWidget {
  ShowMapScreen();

  factory ShowMapScreen.forDesignTime() => ShowMapScreen();

  @override
  _ShowMapScreenState createState() => _ShowMapScreenState();
}

class _ShowMapScreenState extends State<ShowMapScreen> {
  StreamSubscription _subscription;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('显示地图')),
    );
  }
}
