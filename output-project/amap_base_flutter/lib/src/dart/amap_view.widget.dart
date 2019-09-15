import 'dart:io';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:amap_base_flutter/src/dart/amap_controller.dart';
import 'package:flutter/material.dart';

typedef void OnMapCreated(AmapController controller);

class AmapView extends StatelessWidget {
  const AmapView({
    Key key,
    this.onMapCreated,
  }) : super(key: key);

  final OnMapCreated onMapCreated;

  @override
  Widget build(BuildContext context) {
    if (Platform.isAndroid) {
      return Container();
    } else if (Platform.isIOS) {
      return MAMapView_iOS(
        onViewCreated: (controller) {
          if (onMapCreated != null) {
            onMapCreated(AmapController.ios(controller));
          }
        },
      );
    } else {
      return Center(child: Text('未实现的平台'));
    }
  }
}
