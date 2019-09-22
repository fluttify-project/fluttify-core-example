import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_IAMapEngineCallback on java_lang_Object {
  Future<void> reloadMapResource(int var1, String var2, int var3) {}
  
  Future<void> requireMapRender(int var1, int var2, int var3) {}
  
  Future<void> onMapRender(int var1, int var2) {}
  
  Future<int> generateRequestId() {}
  
}