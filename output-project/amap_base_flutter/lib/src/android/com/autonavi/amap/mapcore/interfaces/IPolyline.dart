import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IPolyline on com.autonavi.amap.mapcore.interfaces.IOverlay {
  Future<String> setWidth(double var1) {}
  
  Future<double> getWidth() {}
  
  Future<String> setColor(int var1) {}
  
  Future<int> getColor() {}
  
  Future<String> setPoints(com_amap_api_maps_model_LatLng var1) {}
  
  Future<List<com_amap_api_maps_model_LatLng>> getPoints() {}
  
  Future<bool> isGeodesic() {}
  
  Future<String> setGeodesic(bool var1) {}
  
  Future<String> setDottedLine(bool var1) {}
  
  Future<bool> isDottedLine() {}
  
  Future<com_amap_api_maps_model_LatLng> getNearestLatLng(com_amap_api_maps_model_LatLng var1) {}
  
  Future<String> setTransparency(double var1) {}
  
  Future<String> setCustomTexture(com_amap_api_maps_model_BitmapDescriptor var1) {}
  
  Future<String> setOptions(com_amap_api_maps_model_PolylineOptions var1) {}
  
  Future<com_amap_api_maps_model_PolylineOptions> getOptions() {}
  
  Future<String> setCustemTextureIndex(int var1) {}
  
  Future<String> setShownRatio(double var1) {}
  
  Future<String> setShowRange(double var1, double var2) {}
  
  Future<double> getShownRatio() {}
  
  Future<String> setCustomTextureList(com_amap_api_maps_model_BitmapDescriptor var1) {}
  
}