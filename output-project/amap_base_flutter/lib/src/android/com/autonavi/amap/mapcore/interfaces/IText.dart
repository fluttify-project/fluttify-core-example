import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IText on com_autonavi_amap_mapcore_interfaces_IOverlayImage {
  Future<String> setText(String var1) {}
  
  Future<String> getText() {}
  
  Future<String> setBackgroundColor(int var1) {}
  
  Future<int> getBackgroundColor() {}
  
  Future<String> setFontColor(int var1) {}
  
  Future<int> getFontColor() {}
  
  Future<String> setFontSize(int var1) {}
  
  Future<int> getFontSize() {}
  
  Future<String> setAlign(int var1, int var2) {}
  
  Future<int> getAlignX() {}
  
  Future<int> getAlignY() {}
  
}