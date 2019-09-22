import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_IPoint extends android_graphics_Point  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<com_autonavi_amap_mapcore_IPoint> obtain() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.IPoint::obtain([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.IPoint::obtain', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_autonavi_amap_mapcore_IPoint()..refId = result;
  }
  
}