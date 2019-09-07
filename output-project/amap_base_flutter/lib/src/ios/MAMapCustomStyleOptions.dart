import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMapCustomStyleOptions extends NSObject {
  MAMapCustomStyleOptions.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<String> get_styleId() async {
    final result = await _channel.invokeMethod("MAMapCustomStyleOptions::get_styleId", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_styleId(String styleId) async {
    await _channel.invokeMethod('MAMapCustomStyleOptions::set_styleId', {'refId': refId, "styleId": styleId});
  }
  

  // 生成方法们
  
}