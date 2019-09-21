import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IMarkerAction on java_lang_Object {
  Future<double> getAlpha() {}
  
  Future<String> setAlpha(double var1) {}
  
  Future<int> getDisplayLevel() {}
  
  Future<com_amap_api_maps_model_MarkerOptions> getOptions() {}
  
  Future<bool> isClickable() {}
  
  Future<bool> isInfoWindowAutoOverturn() {}
  
  Future<bool> isInfoWindowEnable() {}
  
  Future<String> setInfoWindowEnable(bool var1) {}
  
  Future<String> setMarkerOptions(com_amap_api_maps_model_MarkerOptions var1) {}
  
  Future<String> setAutoOverturnInfoWindow(bool var1) {}
  
  Future<String> setClickable(bool var1) {}
  
  Future<String> setDisplayLevel(int var1) {}
  
  Future<String> setFixingPointEnable(bool var1) {}
  
  Future<String> setPositionNotUpdate(com_amap_api_maps_model_LatLng var1) {}
  
  Future<String> setRotateAngleNotUpdate(double var1) {}
  
  Future<String> setSnippet(String var1) {}
  
  Future<String> setTitle(String var1) {}
  
}