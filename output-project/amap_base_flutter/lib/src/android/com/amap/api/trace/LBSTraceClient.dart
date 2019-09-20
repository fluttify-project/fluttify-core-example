import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_trace_LBSTraceClient extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_TYPE_AMAP() async {
    final result = await _channel.invokeMethod("com.amap.api.trace.LBSTraceClient::get_TYPE_AMAP", {'refId': refId});
    return result;
  }
  
  Future<int> get_TYPE_GPS() async {
    final result = await _channel.invokeMethod("com.amap.api.trace.LBSTraceClient::get_TYPE_GPS", {'refId': refId});
    return result;
  }
  
  Future<int> get_TYPE_BAIDU() async {
    final result = await _channel.invokeMethod("com.amap.api.trace.LBSTraceClient::get_TYPE_BAIDU", {'refId': refId});
    return result;
  }
  
  Future<String> get_MIN_GRASP_POINT_ERROR() async {
    final result = await _channel.invokeMethod("com.amap.api.trace.LBSTraceClient::get_MIN_GRASP_POINT_ERROR", {'refId': refId});
    return result;
  }
  
  Future<String> get_LOCATE_TIMEOUT_ERROR() async {
    final result = await _channel.invokeMethod("com.amap.api.trace.LBSTraceClient::get_LOCATE_TIMEOUT_ERROR", {'refId': refId});
    return result;
  }
  
  Future<String> get_TRACE_SUCCESS() async {
    final result = await _channel.invokeMethod("com.amap.api.trace.LBSTraceClient::get_TRACE_SUCCESS", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  static Future<com_amap_api_trace_LBSTraceClient> getInstance(android_content_Context var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.LBSTraceClient::getInstance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.LBSTraceClient::getInstance', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_trace_LBSTraceClient()..refId = result;
  }
  
   Future<String> queryProcessedTrace(int var1, com_amap_api_trace_TraceLocation var2, int var3, com_amap_api_trace_TraceListener var4) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.LBSTraceClient@$refId::queryProcessedTrace([\'var1\':$var1, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.LBSTraceClient::queryProcessedTrace', {"var1": var1, "var2": var2.refId, "var3": var3, "refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.trace.LBSTraceClient::Callback')
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          // final refId = args['callerRefId'] as int;
          // if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'Callback::com.amap.api.trace.TraceListener::onRequestFailed':
              // 日志打印
              print('fluttify-dart-callback: onRequestFailed([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
                // 调用回调方法
              var4?.onRequestFailed(args['var1'], args['var2']);
              break;
            case 'Callback::com.amap.api.trace.TraceListener::onTraceProcessing':
              // 日志打印
              print('fluttify-dart-callback: onTraceProcessing([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
                // 调用回调方法
              var4?.onTraceProcessing(args['var1'], args['var2'], com_amap_api_maps_model_LatLng()..refId = (args['var3']));
              break;
            case 'Callback::com.amap.api.trace.TraceListener::onFinished':
              // 日志打印
              print('fluttify-dart-callback: onFinished([\'var1\':$args[var1], \'var3\':$args[var3], \'var4\':$args[var4]])');
        
                // 调用回调方法
              var4?.onFinished(args['var1'], com_amap_api_maps_model_LatLng()..refId = (args['var2']), args['var3'], args['var4']);
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> startTrace(com_amap_api_trace_TraceStatusListener var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.trace.LBSTraceClient@$refId::startTrace([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.trace.LBSTraceClient::startTrace', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.trace.LBSTraceClient::Callback')
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          // final refId = args['callerRefId'] as int;
          // if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'Callback::com.amap.api.trace.TraceStatusListener::onTraceStatus':
              // 日志打印
              print('fluttify-dart-callback: onTraceStatus([\'var3\':$args[var3]])');
        
                // 调用回调方法
              var1?.onTraceStatus(com_amap_api_trace_TraceLocation()..refId = (args['var1']), com_amap_api_maps_model_LatLng()..refId = (args['var2']), args['var3']);
              break;
            default:
              break;
          }
        });
  
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