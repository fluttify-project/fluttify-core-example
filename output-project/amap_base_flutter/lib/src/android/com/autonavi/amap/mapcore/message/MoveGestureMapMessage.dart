import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_message_MoveGestureMapMessage {
  com_autonavi_amap_mapcore_message_MoveGestureMapMessage.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<double> get_touchDeltaX() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.message.MoveGestureMapMessage::get_touchDeltaX", {'refId': refId});
    return result;
  }
  
  Future<double> get_touchDeltaY() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.message.MoveGestureMapMessage::get_touchDeltaY", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_touchDeltaX(double touchDeltaX) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.message.MoveGestureMapMessage::set_touchDeltaX', {'refId': refId, "touchDeltaX": touchDeltaX});
  }
  
  Future<void> set_touchDeltaY(double touchDeltaY) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.message.MoveGestureMapMessage::set_touchDeltaY', {'refId': refId, "touchDeltaY": touchDeltaY});
  }
  

  // 生成方法们
  static Future<com_autonavi_amap_mapcore_message_MoveGestureMapMessage> obtain(double var1, double var2, int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.message.MoveGestureMapMessage::obtain([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.message.MoveGestureMapMessage::obtain', {"var0": var0, "var1": var1, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_autonavi_amap_mapcore_message_MoveGestureMapMessage.withRefId(result);
  }
  
  static Future<String> destory() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.message.MoveGestureMapMessage::destory([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.message.MoveGestureMapMessage::destory', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getType() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.message.MoveGestureMapMessage@$refId::getType([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.message.MoveGestureMapMessage::getType', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> runCameraUpdate(com_autonavi_ae_gmap_GLMapState var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.message.MoveGestureMapMessage@$refId::runCameraUpdate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.message.MoveGestureMapMessage::runCameraUpdate', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}