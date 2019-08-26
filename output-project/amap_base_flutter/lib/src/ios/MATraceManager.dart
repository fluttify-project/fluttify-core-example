import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MATraceManager {
  MATraceManager.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> stopTrace() async {
    // 日志打印
    print('fluttify-dart: MATraceManager@$refId::stopTrace([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MATraceManager::stopTrace', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> start() async {
    // 日志打印
    print('fluttify-dart: MATraceManager@$refId::start([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MATraceManager::start', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> stop() async {
    // 日志打印
    print('fluttify-dart: MATraceManager@$refId::stop([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MATraceManager::stop', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}