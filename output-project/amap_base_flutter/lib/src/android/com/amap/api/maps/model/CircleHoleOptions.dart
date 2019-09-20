import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_CircleHoleOptions extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<com_amap_api_maps_model_CircleHoleOptions> center(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CircleHoleOptions@$refId::center([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CircleHoleOptions::center', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CircleHoleOptions()..refId = result;
  }
  
   Future<com_amap_api_maps_model_CircleHoleOptions> radius(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CircleHoleOptions@$refId::radius([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CircleHoleOptions::radius', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CircleHoleOptions()..refId = result;
  }
  
   Future<com_amap_api_maps_model_LatLng> getCenter() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CircleHoleOptions@$refId::getCenter([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CircleHoleOptions::getCenter', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_LatLng()..refId = result;
  }
  
   Future<double> getRadius() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CircleHoleOptions@$refId::getRadius([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CircleHoleOptions::getRadius', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}