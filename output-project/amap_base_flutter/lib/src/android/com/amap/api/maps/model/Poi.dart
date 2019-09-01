import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_Poi extends Ref_Android {
  com_amap_api_maps_model_Poi.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> getName() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Poi@$refId::getName([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Poi::getName', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_LatLng> getCoordinate() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Poi@$refId::getCoordinate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Poi::getCoordinate', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_LatLng.withRefId(result);
  }
  
   Future<String> getPoiId() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Poi@$refId::getPoiId([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Poi::getPoiId', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}