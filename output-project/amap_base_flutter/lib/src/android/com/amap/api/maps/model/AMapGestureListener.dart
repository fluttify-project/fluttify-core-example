import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_amap_api_maps_model_AMapGestureListener on Object {
  Future<String> onDoubleTap(double var1, double var2) {}
  
  Future<String> onSingleTap(double var1, double var2) {}
  
  Future<String> onFling(double var1, double var2) {}
  
  Future<String> onScroll(double var1, double var2) {}
  
  Future<String> onLongPress(double var1, double var2) {}
  
  Future<String> onDown(double var1, double var2) {}
  
  Future<String> onUp(double var1, double var2) {}
  
  Future<String> onMapStable() {}
  
}