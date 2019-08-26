import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_LinkInfo {
  com_autonavi_amap_mapcore_LinkInfo.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<int> getState() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.LinkInfo@$refId::getState([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.LinkInfo::getState', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setState(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.LinkInfo@$refId::setState([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.LinkInfo::setState', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getTime() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.LinkInfo@$refId::getTime([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.LinkInfo::getTime', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setTime(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.LinkInfo@$refId::setTime([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.LinkInfo::setTime', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getLength() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.LinkInfo@$refId::getLength([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.LinkInfo::getLength', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setLength(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.LinkInfo@$refId::setLength([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.LinkInfo::setLength', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}