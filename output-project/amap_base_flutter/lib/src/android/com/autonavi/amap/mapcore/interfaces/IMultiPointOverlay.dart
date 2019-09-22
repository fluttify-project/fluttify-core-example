import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IMultiPointOverlay on java_lang_Object {
  Future<void> addItems(List<com_amap_api_maps_model_MultiPointItem> var1) {}
  
  Future<void> addItem(com_amap_api_maps_model_MultiPointItem var1) {}
  
  Future<void> destroy(bool var1) {}
  
  Future<void> setVisible(bool var1) {}
  
  Future<com_amap_api_maps_model_MultiPointItem> onClick(com_autonavi_amap_mapcore_IPoint var1) {}
  
  Future<void> setAnchor(double var1, double var2) {}
  
  Future<String> getId() {}
  
  Future<void> remove(bool var1) {}
  
}