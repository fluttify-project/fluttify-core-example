import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:amap_base_flutter/src/android/com/amap/api/maps/MapView.dart';
import 'package:amap_base_flutter/src/android/object_factory.dart';
import 'package:amap_base_flutter/src/ios/MAMapView.dart';

class AmapController {
  AmapController.android(this.androidMap);
  AmapController.ios(this.iosMap);

  com_amap_api_maps_MapView androidMap;
  MAMapView iosMap;

  Future showMyLocation(bool showOrNot) async {
    return platform(
      android: () async {
        final map = await androidMap?.getMap();
        final locationStyle =
            await ObjectFactory.createcom_amap_api_maps_model_MyLocationStyle();
        await locationStyle?.showMyLocation(showOrNot);
        await map?.setMyLocationStyle(locationStyle);
        await map?.setMyLocationEnabled(true);
      },
      ios: () async {},
    );
  }
}
