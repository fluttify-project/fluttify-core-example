import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IOverlayImage on Object {
  Future<bool> remove() {}
  
  Future<String> destroy(bool var1) {}
  
  Future<String> setRotateAngle(double var1) {}
  
  Future<double> getRotateAngle() {}
  
  Future<String> setZIndex(double var1) {}
  
  Future<double> getZIndex() {}
  
  Future<String> getId() {}
  
  Future<com_amap_api_maps_model_LatLng> getPosition() {}
  
  Future<String> setPosition(com_amap_api_maps_model_LatLng var1) {}
  
  Future<String> setVisible(bool var1) {}
  
  Future<bool> isVisible() {}
  
  Future<bool> equalsRemote(com_autonavi_amap_mapcore_interfaces_IOverlayImage var1) {}
  
  Future<int> hashCodeRemote() {}
  
  Future<String> setObject(com_autonavi_amap_mapcore_interfaces_Object var1) {}
  
  Future<com_autonavi_amap_mapcore_interfaces_Object> getObject() {}
  
  Future<String> setAnchor(double var1, double var2) {}
  
  Future<double> getAnchorU() {}
  
  Future<double> getAnchorV() {}
  
}