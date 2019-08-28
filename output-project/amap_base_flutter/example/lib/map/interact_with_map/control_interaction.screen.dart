import 'package:flutter/material.dart';

class ControlInteractionScreen extends StatefulWidget {
  ControlInteractionScreen();

  factory ControlInteractionScreen.forDesignTime() =>
      ControlInteractionScreen();

  @override
  _ControlInteractionScreenState createState() =>
      _ControlInteractionScreenState();
}

class _ControlInteractionScreenState extends State<ControlInteractionScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('控件交互'),
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
