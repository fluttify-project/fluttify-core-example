import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IPolygon on com.autonavi.amap.mapcore.interfaces.IOverlay {
  Future<String> setStrokeWidth(double var1) {}
  
  Future<double> getStrokeWidth() {}
  
  Future<String> setFillColor(int var1) {}
  
  Future<int> getFillColor() {}
  
  Future<String> setStrokeColor(int var1) {}
  
  Future<String> setPoints(com_amap_api_maps_model_LatLng var1) {}
  
  Future<List<com_amap_api_maps_model_LatLng>> getPoints() {}
  
  Future<int> getStrokeColor() {}
  
  Future<bool> contains(com_amap_api_maps_model_LatLng var1) {}
  
  Future<String> setHoleOptions(com_amap_api_maps_model_BaseHoleOptions var1) {}
  
  Future<List<com_amap_api_maps_model_BaseHoleOptions>> getHoleOptions() {}
  
}