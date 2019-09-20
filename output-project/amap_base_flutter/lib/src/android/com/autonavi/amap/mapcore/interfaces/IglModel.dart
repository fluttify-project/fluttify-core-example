import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IglModel on Object {
  Future<String> getTitle() {}
  
  Future<String> getSnippet() {}
  
  Future<String> getId() {}
  
  Future<String> setPosition(com_amap_api_maps_model_LatLng var1) {}
  
  Future<String> setRotateAngle(double var1) {}
  
  Future<double> getRotateAngle() {}
  
  Future<com_amap_api_maps_model_LatLng> getPosition() {}
  
  Future<String> setAnimation(com_amap_api_maps_model_animation_Animation var1) {}
  
  Future<bool> startAnimation() {}
  
  Future<bool> remove() {}
  
  Future<String> setVisible(bool var1) {}
  
  Future<bool> isVisible() {}
  
  Future<String> setObject(com_autonavi_amap_mapcore_interfaces_Object var1) {}
  
  Future<com_autonavi_amap_mapcore_interfaces_Object> getObject() {}
  
  Future<String> setZoomLimit(double var1) {}
  
  Future<String> destroy() {}
  
  Future<String> setGeoPoint(com_autonavi_amap_mapcore_IPoint var1) {}
  
  Future<String> showInfoWindow() {}
  
  Future<String> setTitle(String var1) {}
  
  Future<String> setSnippet(String var1) {}
  
  Future<String> setModelFixedLength(int var1) {}
  
}