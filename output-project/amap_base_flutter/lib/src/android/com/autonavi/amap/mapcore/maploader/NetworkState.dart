import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_maploader_NetworkState {
  com_autonavi_amap_mapcore_maploader_NetworkState.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setNetworkListener() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.NetworkState@$refId::setNetworkListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.NetworkState::setNetworkListener', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> registerNetChangeReceiver(android_content_Context var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.NetworkState@$refId::registerNetChangeReceiver([\'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.NetworkState::registerNetChangeReceiver', {"var1": var1.refId, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<bool> isNetworkConnected(android_content_Context var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.NetworkState::isNetworkConnected([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.NetworkState::isNetworkConnected', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}