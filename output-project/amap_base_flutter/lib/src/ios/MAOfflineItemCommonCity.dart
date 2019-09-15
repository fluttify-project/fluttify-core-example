import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAOfflineItemCommonCity extends MAOfflineCity  {
  MAOfflineItemCommonCity.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAOfflineItem> get_province() async {
    final result = await _channel.invokeMethod("MAOfflineItemCommonCity::get_province", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_province(MAOfflineItem province) async {
    await _channel.invokeMethod('MAOfflineItemCommonCity::set_province', {'refId': refId, "province": province.refId});
  }
  

  // 生成方法们
  
}