import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_gloverlay_BaseRouteOverlay {
  com_autonavi_ae_gmap_gloverlay_BaseRouteOverlay.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> removeRouteName() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.BaseRouteOverlay@$refId::removeRouteName([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.BaseRouteOverlay::removeRouteName', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> remove() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.BaseRouteOverlay@$refId::remove([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.BaseRouteOverlay::remove', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}