import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_MultiPointOverlayOptions {
  com_amap_api_maps_model_MultiPointOverlayOptions.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<com_amap_api_maps_model_MultiPointOverlayOptions> anchor(double var1, double var2) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MultiPointOverlayOptions@$refId::anchor([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MultiPointOverlayOptions::anchor', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_MultiPointOverlayOptions.withRefId(result);
  }
  
   Future<double> getAnchorU() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MultiPointOverlayOptions@$refId::getAnchorU([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MultiPointOverlayOptions::getAnchorU', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getAnchorV() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MultiPointOverlayOptions@$refId::getAnchorV([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MultiPointOverlayOptions::getAnchorV', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_MultiPointOverlayOptions> icon(com_amap_api_maps_model_BitmapDescriptor var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MultiPointOverlayOptions@$refId::icon([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MultiPointOverlayOptions::icon', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_MultiPointOverlayOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_BitmapDescriptor> getIcon() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MultiPointOverlayOptions@$refId::getIcon([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MultiPointOverlayOptions::getIcon', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BitmapDescriptor.withRefId(result);
  }
  
}