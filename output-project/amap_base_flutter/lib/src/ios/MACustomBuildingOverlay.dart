import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MACustomBuildingOverlay extends MAShape {
  MACustomBuildingOverlay.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MACustomBuildingOverlayOption> get_defaultOption() async {
    final result = await _channel.invokeMethod("MACustomBuildingOverlay::get_defaultOption", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}