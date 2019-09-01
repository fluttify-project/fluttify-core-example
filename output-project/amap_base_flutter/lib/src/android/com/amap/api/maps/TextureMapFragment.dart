import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_TextureMapFragment extends Ref_Android {
  com_amap_api_maps_TextureMapFragment.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<com_amap_api_maps_TextureMapFragment> newInstance() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment::newInstance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::newInstance', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_TextureMapFragment.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMap> getMap() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::getMap([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::getMap', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMap.withRefId(result);
  }
  
   Future<String> onAttach(android_app_Activity var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::onAttach([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::onAttach', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onCreate(android_os_Bundle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::onCreate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::onCreate', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onResume() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::onResume([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::onResume', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onPause() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::onPause([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::onPause', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onDestroyView() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::onDestroyView([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::onDestroyView', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onDestroy() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::onDestroy([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::onDestroy', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onLowMemory() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::onLowMemory([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::onLowMemory', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onSaveInstanceState(android_os_Bundle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::onSaveInstanceState([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::onSaveInstanceState', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setArguments(android_os_Bundle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::setArguments([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::setArguments', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setUserVisibleHint(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.TextureMapFragment@$refId::setUserVisibleHint([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.TextureMapFragment::setUserVisibleHint', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}