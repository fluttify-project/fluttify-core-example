import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IArc on com.autonavi.amap.mapcore.interfaces.IOverlay {
  Future<String> setStrokeWidth(double var1) {}
  
  Future<double> getStrokeWidth() {}
  
  Future<String> setStrokeColor(int var1) {}
  
  Future<int> getStrokeColor() {}
  
}