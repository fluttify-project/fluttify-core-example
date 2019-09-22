import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_INavigateArrow on com_autonavi_amap_mapcore_interfaces_IOverlay {
  Future<void> setTopColor(int var1) {}
  
  Future<void> setSideColor(int var1) {}
  
  Future<int> getTopColor() {}
  
  Future<int> getSideColor() {}
  
  Future<void> setPoints(List<com_amap_api_maps_model_LatLng> var1) {}
  
  Future<void> setWidth(double var1) {}
  
  Future<double> getWidth() {}
  
  Future<void> set3DModel(bool var1) {}
  
  Future<bool> is3DModel() {}
  
}