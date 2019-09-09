import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_maps_AMap_MultiPositionInfoWindowAdapter extends com_amap_api_maps_AMap_InfoWindowAdapter {
  com_amap_api_maps_AMap_MultiPositionInfoWindowAdapter.withRefId(int refId): super.withRefId(refId);

  android_view_View getInfoWindowClick(com_amap_api_maps_model_Marker var1);
  
  android_view_View getOverturnInfoWindow(com_amap_api_maps_model_Marker var1);
  
  android_view_View getOverturnInfoWindowClick(com_amap_api_maps_model_Marker var1);
  
}