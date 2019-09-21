import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IGroundOverlay on com_autonavi_amap_mapcore_interfaces_IOverlay {
  Future<String> setPosition(com_amap_api_maps_model_LatLng var1) {}
  
  Future<com_amap_api_maps_model_LatLng> getPosition() {}
  
  Future<String> setDimensions(double var1) {}
  
  Future<double> getWidth() {}
  
  Future<double> getHeight() {}
  
  Future<String> setPositionFromBounds(com_amap_api_maps_model_LatLngBounds var1) {}
  
  Future<com_amap_api_maps_model_LatLngBounds> getBounds() {}
  
  Future<String> setBearing(double var1) {}
  
  Future<double> getBearing() {}
  
  Future<String> setTransparency(double var1) {}
  
  Future<double> getTransparency() {}
  
  Future<String> setImage(com_amap_api_maps_model_BitmapDescriptor var1) {}
  
}