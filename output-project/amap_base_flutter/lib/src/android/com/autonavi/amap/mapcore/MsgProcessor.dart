import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_MsgProcessor extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<void> nativeInitMsg() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.MsgProcessor@$refId::nativeInitMsg([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.MsgProcessor::nativeInitMsg', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> nativeInit(int var1, String var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.MsgProcessor@$refId::nativeInit([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.MsgProcessor::nativeInit', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> nativeMsgProcessor(String var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.MsgProcessor@$refId::nativeMsgProcessor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.MsgProcessor::nativeMsgProcessor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> nativeCall() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.MsgProcessor@$refId::nativeCall([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.MsgProcessor::nativeCall', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}