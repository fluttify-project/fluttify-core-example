import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_Inner_3dMap_locationManagerBase on Object {
  Future<String> setLocationOption(com_autonavi_amap_mapcore_Inner_3dMap_locationOption var1) {}
  
  Future<String> setLocationListener(com_autonavi_amap_mapcore_Inner_3dMap_locationListener var1) {}
  
  Future<String> startLocation() {}
  
  Future<String> stopLocation() {}
  
  Future<String> unRegisterLocationListener(com_autonavi_amap_mapcore_Inner_3dMap_locationListener var1) {}
  
  Future<com_autonavi_amap_mapcore_Inner_3dMap_location> getLastKnownLocation() {}
  
  Future<String> destroy() {}
  
}