import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IAMapListener on java_lang_Object {
  Future<String> afterDrawFrame(int var1, com_autonavi_ae_gmap_GLMapState var2) {}
  
  Future<String> afterDrawLabel(int var1, com_autonavi_ae_gmap_GLMapState var2) {}
  
  Future<String> beforeDrawLabel(int var1, com_autonavi_ae_gmap_GLMapState var2) {}
  
  Future<String> afterRendererOver(int var1, com_autonavi_ae_gmap_GLMapState var2) {}
  
  Future<String> afterAnimation() {}
  
}