import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_ICircle on com.autonavi.amap.mapcore.interfaces.IOverlay {
  Future<String> setCenter(com_amap_api_maps_model_LatLng var1) {}
  
  Future<com_amap_api_maps_model_LatLng> getCenter() {}
  
  Future<String> setRadius(double var1) {}
  
  Future<double> getRadius() {}
  
  Future<String> setStrokeWidth(double var1) {}
  
  Future<double> getStrokeWidth() {}
  
  Future<String> setStrokeColor(int var1) {}
  
  Future<int> getStrokeColor() {}
  
  Future<String> setFillColor(int var1) {}
  
  Future<int> getFillColor() {}
  
  Future<bool> contains(com_amap_api_maps_model_LatLng var1) {}
  
  Future<String> setHoleOptions(com_amap_api_maps_model_BaseHoleOptions var1) {}
  
  Future<List<com_amap_api_maps_model_BaseHoleOptions>> getHoleOptions() {}
  
  Future<int> getDottedLineType() {}
  
  Future<String> setDottedLineType(int var1) {}
  
}