import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_AbstractMapMessage extends Ref_Android {
  com_autonavi_ae_gmap_AbstractMapMessage.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_GESTURE_STATE_BEGIN() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.AbstractMapMessage::get_GESTURE_STATE_BEGIN", {'refId': refId});
    return result;
  }
  
  Future<int> get_GESTURE_STATE_CHANGE() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.AbstractMapMessage::get_GESTURE_STATE_CHANGE", {'refId': refId});
    return result;
  }
  
  Future<int> get_GESTURE_STATE_END() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.AbstractMapMessage::get_GESTURE_STATE_END", {'refId': refId});
    return result;
  }
  
  Future<int> get_MSGTYPE_NAVIOVERLAY_STATE() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.AbstractMapMessage::get_MSGTYPE_NAVIOVERLAY_STATE", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
   Future<int> getType() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.AbstractMapMessage@$refId::getType([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.AbstractMapMessage::getType', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}