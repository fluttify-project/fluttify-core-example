import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:decorated_flutter/decorated_flutter.dart';
import 'package:flutter/material.dart';
import 'package:permission_handler/permission_handler.dart';

class ShowLocationScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('自定义地图')),
      body: AmapView(
        onMapCreated: (controller) async {
          final permissions = await PermissionHandler()
              .requestPermissions([PermissionGroup.location]);

          if (permissions[PermissionGroup.location] ==
              PermissionStatus.granted) {
            await controller.showMyLocation(true);
          } else {
            toast('需要定位权限!');
          }
        },
      ),
    );
  }
}
