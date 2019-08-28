import 'package:amap_base_flutter/src/android/com/amap/api/maps/MapView.dart';
import 'package:amap_base_flutter/src/ios/MAMapView.dart';

class AmapController {
  AmapController.android(this.androidMap);
  AmapController.ios(this.iosMap);

  com_amap_api_maps_MapView androidMap;
  MAMapView iosMap;
}
