import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_trace_TraceOverlay extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<void> add(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.TraceOverlay@$refId::add([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.TraceOverlay::add', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> remove() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.TraceOverlay@$refId::remove([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.TraceOverlay::remove', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> setProperCamera(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.TraceOverlay@$refId::setProperCamera([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.TraceOverlay::setProperCamera', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> zoopToSpan() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.TraceOverlay@$refId::zoopToSpan([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.TraceOverlay::zoopToSpan', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getTraceStatus() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.TraceOverlay@$refId::getTraceStatus([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.TraceOverlay::getTraceStatus', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> setTraceStatus(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.TraceOverlay@$refId::setTraceStatus([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.TraceOverlay::setTraceStatus', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getDistance() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.TraceOverlay@$refId::getDistance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.TraceOverlay::getDistance', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> setDistance(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.TraceOverlay@$refId::setDistance([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.TraceOverlay::setDistance', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getWaitTime() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.TraceOverlay@$refId::getWaitTime([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.TraceOverlay::getWaitTime', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> setWaitTime(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.TraceOverlay@$refId::setWaitTime([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.TraceOverlay::setWaitTime', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}