import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_InfoWindowParams extends Ref_Android {
  com_amap_api_maps_InfoWindowParams.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_INFOWINDOW_TYPE_IMAGE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.InfoWindowParams::get_INFOWINDOW_TYPE_IMAGE", {'refId': refId});
    return result;
  }
  
  Future<int> get_INFOWINDOW_TYPE_VIEW() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.InfoWindowParams::get_INFOWINDOW_TYPE_VIEW", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
   Future<String> setInfoWindowUpdateTime(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.InfoWindowParams@$refId::setInfoWindowUpdateTime([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.InfoWindowParams::setInfoWindowUpdateTime', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getInfoWindowUpdateTime() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.InfoWindowParams@$refId::getInfoWindowUpdateTime([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.InfoWindowParams::getInfoWindowUpdateTime', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setInfoWindowType(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.InfoWindowParams@$refId::setInfoWindowType([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.InfoWindowParams::setInfoWindowType', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getInfoWindowType() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.InfoWindowParams@$refId::getInfoWindowType([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.InfoWindowParams::getInfoWindowType', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<android_view_View> getInfoWindow() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.InfoWindowParams@$refId::getInfoWindow([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.InfoWindowParams::getInfoWindow', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return android_view_View.withRefId(result);
  }
  
   Future<String> setInfoContent(android_view_View var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.InfoWindowParams@$refId::setInfoContent([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.InfoWindowParams::setInfoContent', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setInfoWindow(android_view_View var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.InfoWindowParams@$refId::setInfoWindow([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.InfoWindowParams::setInfoWindow', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<android_view_View> getInfoContents() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.InfoWindowParams@$refId::getInfoContents([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.InfoWindowParams::getInfoContents', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return android_view_View.withRefId(result);
  }
  
}