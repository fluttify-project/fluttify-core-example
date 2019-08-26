import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MACustomBuildingOverlayOption {
  MACustomBuildingOverlayOption.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_visibile() async {
    final result = await _channel.invokeMethod("MACustomBuildingOverlayOption::get_visibile", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_visibile(bool visibile) async {
    await _channel.invokeMethod('MACustomBuildingOverlayOption::set_visibile', {'refId': refId, "visibile": visibile});
  }
  

  // 生成方法们
  
}