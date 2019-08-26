import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_trace_LBSTraceClient {
  com_amap_api_trace_LBSTraceClient.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<com_amap_api_trace_LBSTraceClient> getInstance(android_content_Context var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.LBSTraceClient::getInstance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.LBSTraceClient::getInstance', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_trace_LBSTraceClient.withRefId(result);
  }
  
   Future<String> queryProcessedTrace(com_amap_api_trace_TraceLocation var2, int var1, int var3) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.LBSTraceClient@$refId::queryProcessedTrace([\'var1\':$var1, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.LBSTraceClient::queryProcessedTrace', {"var1": var1, "var2": var2.refId, "var3": var3, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> startTrace() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.LBSTraceClient@$refId::startTrace([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.LBSTraceClient::startTrace', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> stopTrace() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.LBSTraceClient@$refId::stopTrace([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.LBSTraceClient::stopTrace', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> destroy() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.LBSTraceClient@$refId::destroy([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.LBSTraceClient::destroy', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}