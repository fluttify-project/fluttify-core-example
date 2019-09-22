import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IPolyline on com_autonavi_amap_mapcore_interfaces_IOverlay {
  Future<void> setWidth(double var1) {}
  
  Future<double> getWidth() {}
  
  Future<void> setColor(int var1) {}
  
  Future<int> getColor() {}
  
  Future<void> setPoints(com_amap_api_maps_model_LatLng var1) {}
  
  Future<bool> isGeodesic() {}
  
  Future<void> setGeodesic(bool var1) {}
  
  Future<void> setDottedLine(bool var1) {}
  
  Future<bool> isDottedLine() {}
  
  Future<com_amap_api_maps_model_LatLng> getNearestLatLng(com_amap_api_maps_model_LatLng var1) {}
  
  Future<void> setTransparency(double var1) {}
  
  Future<void> setCustomTexture(com_amap_api_maps_model_BitmapDescriptor var1) {}
  
  Future<void> setOptions(com_amap_api_maps_model_PolylineOptions var1) {}
  
  Future<com_amap_api_maps_model_PolylineOptions> getOptions() {}
  
  Future<void> setCustemTextureIndex(int var1) {}
  
  Future<void> setShownRatio(double var1) {}
  
  Future<void> setShowRange(double var1, double var2) {}
  
  Future<double> getShownRatio() {}
  
  Future<void> setCustomTextureList(com_amap_api_maps_model_BitmapDescriptor var1) {}
  
}