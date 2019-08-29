import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/material.dart';

class ShowMapScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('显示地图')),
      body: Center(child: AmapView()),
    );
  }
}
