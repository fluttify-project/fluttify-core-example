import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAOfflineMap {
  MAOfflineMap.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<String> get_version() async {
    final result = await _channel.invokeMethod("MAOfflineMap::get_version", {'refId': refId});
    return result;
  }
  
  Future<List> get_() async {
    final result = await _channel.invokeMethod("MAOfflineMap::get_", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  static Future<MAOfflineMap> sharedOfflineMap() async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap::sharedOfflineMap([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAOfflineMap::sharedOfflineMap', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAOfflineMap.withRefId(result);
  }
  
   Future<String> setupWithCompletionBlock() async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::setupWithCompletionBlock([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAOfflineMap::setupWithCompletionBlock', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAOfflineMap::setupWithCompletionBlock_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
        
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> cancelAll() async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::cancelAll([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAOfflineMap::cancelAll', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> clearDisk() async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::clearDisk([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAOfflineMap::clearDisk', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}