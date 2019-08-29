import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAPointAnnotation {
  MAPointAnnotation.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_lockedToScreen() async {
    final result = await _channel.invokeMethod("MAPointAnnotation::get_isLockedToScreen", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_lockedToScreen(bool lockedToScreen) async {
    await _channel.invokeMethod('MAPointAnnotation::set_lockedToScreen', {'refId': refId, "lockedToScreen": lockedToScreen});
  }
  

  // 生成方法们
  
}