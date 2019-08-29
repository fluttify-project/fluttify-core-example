import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:amap_base_flutter/src/android/com/amap/api/maps/MapView.dart';
import 'package:amap_base_flutter/src/android/object_factory.dart';
import 'package:amap_base_flutter/src/ios/MAMapView.dart';

import 'enums.dart';

class AmapController {
  AmapController.android(this.androidController);
  AmapController.ios(this.iosController);

  com_amap_api_maps_MapView androidController;
  MAMapView iosController;

  /// 是否显示我的位置
  Future showMyLocation(bool show) async {
    return platform(
      android: () async {
        final map = await androidController?.getMap();
        final locationStyle = await ObjectFactory_Android
            .createcom_amap_api_maps_model_MyLocationStyle();
        await locationStyle?.showMyLocation(show);
        await map?.setMyLocationStyle(locationStyle);
        await map?.setMyLocationEnabled(show);
      },
      ios: () async {
        await iosController?.set_showsUserLocation(show);

        if (show) {
          await iosController?.setUserTrackingMode(
              MAUserTrackingMode.MAUserTrackingModeFollow, true);
        }
      },
    );
  }

  /// 是否显示室内地图
  Future showIndoorMap(bool show) {
    return platform(
      android: () async {
        final map = await androidController?.getMap();
        await map?.showIndoorMap(show);
      },
      ios: () async {
        await iosController?.set_showsIndoorMap(show);
      },
    );
  }

  Future setMapType(MapType mapType) async {
    return platform(
      android: () async {
        final map = await androidController?.getMap();
        switch (mapType) {
          case MapType.Standard:
            await map?.setMapType(1);
            break;
          case MapType.Satellite:
            await map?.setMapType(2);
            break;
          case MapType.Night:
            await map?.setMapType(3);
            break;
          case MapType.Navi:
            await map?.setMapType(4);
            break;
          case MapType.Bus:
            await map?.setMapType(5);
            break;
        }
      },
      ios: () async {
        switch (mapType) {
          case MapType.Standard:
            await iosController?.set_mapType(MAMapType.MAMapTypeStandard);
            break;
          case MapType.Satellite:
            await iosController?.set_mapType(MAMapType.MAMapTypeSatellite);
            break;
          case MapType.Night:
            await iosController?.set_mapType(MAMapType.MAMapTypeStandardNight);
            break;
          case MapType.Navi:
            await iosController?.set_mapType(MAMapType.MAMapTypeNavi);
            break;
          case MapType.Bus:
            await iosController?.set_mapType(MAMapType.MAMapTypeBus);
            break;
        }
      },
    );
  }
}
