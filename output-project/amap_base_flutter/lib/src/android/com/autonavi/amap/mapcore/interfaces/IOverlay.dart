import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IOverlay on Object {
  Future<String> remove() {}
  
  Future<String> getId() {}
  
  Future<String> setZIndex(double var1) {}
  
  Future<double> getZIndex() {}
  
  Future<String> setVisible(bool var1) {}
  
  Future<bool> isVisible() {}
  
  Future<bool> equalsRemote(com_autonavi_amap_mapcore_interfaces_IOverlay var1) {}
  
  Future<int> hashCodeRemote() {}
  
  Future<String> destroy() {}
  
  Future<bool> isAboveMaskLayer() {}
  
  Future<String> setAboveMaskLayer(bool var1) {}
  
}