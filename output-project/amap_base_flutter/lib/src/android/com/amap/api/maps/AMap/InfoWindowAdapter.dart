import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_amap_api_maps_AMap_InfoWindowAdapter on Object {
  Future<android_view_View> getInfoWindow(com_amap_api_maps_model_Marker var1) {}
  
  Future<android_view_View> getInfoContents(com_amap_api_maps_model_Marker var1) {}
  
}