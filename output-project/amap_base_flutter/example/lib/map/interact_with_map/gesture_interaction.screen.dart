import 'package:flutter/material.dart';

class GestureInteractionScreen extends StatefulWidget {
  GestureInteractionScreen();

  factory GestureInteractionScreen.forDesignTime() =>
      GestureInteractionScreen();

  @override
  _GestureInteractionScreenState createState() =>
      _GestureInteractionScreenState();
}

class _GestureInteractionScreenState extends State<GestureInteractionScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('手势交互'),
        backgroundColor: Colors.black,
        centerTitle: true,
      ),
      body: Column(
        children: <Widget>[],
      ),
    );
  }

  @override
  void dispose() {
    super.dispose();
  }
}
