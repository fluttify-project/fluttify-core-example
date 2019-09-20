import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_AMapNativeRenderer extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<String> nativeDrawLineInit() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawLineInit([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawLineInit', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}