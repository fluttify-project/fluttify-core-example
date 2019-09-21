import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAUserLocation extends MAAnimatedAnnotation  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_updating() async {
    final result = await _channel.invokeMethod("MAUserLocation::get_isUpdating", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}