import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_message_HoverGestureMapMessage extends Ref_Android {
  com_autonavi_amap_mapcore_message_HoverGestureMapMessage.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<double> get_angleDelta() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.message.HoverGestureMapMessage::get_angleDelta", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_angleDelta(double angleDelta) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.message.HoverGestureMapMessage::set_angleDelta', {'refId': refId, "angleDelta": angleDelta});
  }
  

  // 生成方法们
  static Future<com_autonavi_amap_mapcore_message_HoverGestureMapMessage> obtain(double var1, int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.message.HoverGestureMapMessage::obtain([\'var0\':$var0, \'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.message.HoverGestureMapMessage::obtain', {"var0": var0, "var1": var1});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_autonavi_amap_mapcore_message_HoverGestureMapMessage.withRefId(result);
  }
  
  static Future<String> destory() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.message.HoverGestureMapMessage::destory([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.message.HoverGestureMapMessage::destory', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getType() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.message.HoverGestureMapMessage@$refId::getType([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.message.HoverGestureMapMessage::getType', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> runCameraUpdate(com_autonavi_ae_gmap_GLMapState var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.message.HoverGestureMapMessage@$refId::runCameraUpdate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.message.HoverGestureMapMessage::runCameraUpdate', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}