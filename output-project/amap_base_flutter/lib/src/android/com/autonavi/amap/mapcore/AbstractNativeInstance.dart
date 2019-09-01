import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_AbstractNativeInstance extends Ref_Android {
  com_autonavi_amap_mapcore_AbstractNativeInstance.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<int> getNativeInstance() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AbstractNativeInstance@$refId::getNativeInstance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AbstractNativeInstance::getNativeInstance', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> createNativeInstace() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AbstractNativeInstance@$refId::createNativeInstace([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AbstractNativeInstance::createNativeInstace', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}