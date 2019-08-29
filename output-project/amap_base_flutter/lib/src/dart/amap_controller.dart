import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:amap_base_flutter/src/android/com/amap/api/maps/MapView.dart';
import 'package:amap_base_flutter/src/android/object_factory.dart';
import 'package:amap_base_flutter/src/ios/MAMapView.dart';

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
}
