import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_LatLng extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<double> get_latitude() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.LatLng::get_latitude", {'refId': refId});
    return result;
  }
  
  Future<double> get_longitude() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.LatLng::get_longitude", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
   Future<com_amap_api_maps_model_LatLng> clone() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.LatLng@$refId::clone([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.LatLng::clone', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_LatLng()..refId = result;
  }
  
}