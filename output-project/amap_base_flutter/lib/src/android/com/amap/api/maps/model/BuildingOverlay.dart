import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_BuildingOverlay extends Ref_Android {
  com_amap_api_maps_model_BuildingOverlay.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setDefaultOptions(com_amap_api_maps_model_BuildingOverlayOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlay@$refId::setDefaultOptions([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlay::setDefaultOptions', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_BuildingOverlayOptions> getDefaultOptions() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlay@$refId::getDefaultOptions([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlay::getDefaultOptions', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BuildingOverlayOptions.withRefId(result);
  }
  
   Future<String> setCustomOptions(com_amap_api_maps_model_BuildingOverlayOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlay@$refId::setCustomOptions([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlay::setCustomOptions', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> destroy() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlay@$refId::destroy([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlay::destroy', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getId() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlay@$refId::getId([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlay::getId', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setZIndex(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlay@$refId::setZIndex([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlay::setZIndex', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getZIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlay@$refId::getZIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlay::getZIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setVisible(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlay@$refId::setVisible([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlay::setVisible', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isVisible() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlay@$refId::isVisible([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlay::isVisible', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}