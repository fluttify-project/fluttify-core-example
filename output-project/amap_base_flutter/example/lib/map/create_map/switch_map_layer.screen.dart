import 'package:flutter/material.dart';

class SwitchMapLayerScreen extends StatefulWidget {
  SwitchMapLayerScreen();

  factory SwitchMapLayerScreen.forDesignTime() => SwitchMapLayerScreen();

  @override
  _SwitchMapLayerScreenState createState() => _SwitchMapLayerScreenState();
}

class _SwitchMapLayerScreenState extends State<SwitchMapLayerScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('显示地图'),
        backgroundColor: Colors.black,
        centerTitle: true,
      ),
    );
  }
}
