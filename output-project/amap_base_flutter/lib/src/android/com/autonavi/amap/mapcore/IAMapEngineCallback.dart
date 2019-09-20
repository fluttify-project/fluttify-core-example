import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_IAMapEngineCallback on Object {
  Future<List<byte[]>> requireMapResource(int var1, String var2) {}
  
  Future<String> reloadMapResource(int var1, String var2, int var3) {}
  
  Future<String> requireMapData(int var1, List<int> var2) {}
  
  Future<List<byte[]>> requireCharBitmap(int var1, int var2, int var3) {}
  
  Future<List<byte[]>> requireCharsWidths(int var1, List<int> var2, int var3, int var4) {}
  
  Future<String> requireMapRender(int var1, int var2, int var3) {}
  
  Future<String> onMapRender(int var1, int var2) {}
  
  Future<String> cancelRequireMapData(com_autonavi_amap_mapcore_Object var1) {}
  
  Future<String> OnIndoorBuildingActivity(int var1, List<int> var2) {}
  
  Future<int> generateRequestId() {}
  
  Future<int> requireMapDataAsyn(int var1, List<int> var2) {}
  
}