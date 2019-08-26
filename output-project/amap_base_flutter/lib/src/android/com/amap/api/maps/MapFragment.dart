import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_MapFragment {
  com_amap_api_maps_MapFragment.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<com_amap_api_maps_MapFragment> newInstance() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment::newInstance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::newInstance', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_MapFragment.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMap> getMap() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::getMap([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::getMap', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMap.withRefId(result);
  }
  
   Future<String> onAttach(android_app_Activity var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::onAttach([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::onAttach', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onCreate(android_os_Bundle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::onCreate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::onCreate', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onResume() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::onResume([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::onResume', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onPause() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::onPause([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::onPause', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onDestroyView() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::onDestroyView([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::onDestroyView', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onDestroy() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::onDestroy([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::onDestroy', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onLowMemory() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::onLowMemory([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::onLowMemory', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onSaveInstanceState(android_os_Bundle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::onSaveInstanceState([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::onSaveInstanceState', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setArguments(android_os_Bundle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::setArguments([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::setArguments', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setUserVisibleHint(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.MapFragment@$refId::setUserVisibleHint([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.MapFragment::setUserVisibleHint', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}