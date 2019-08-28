import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/material.dart';

void main() async {
  await AmapService.init('7c9daac55e90a439f7b4304b465297fa');

  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Center(
          child: AmapView(),
        ),
      ),
    );
  }
}
