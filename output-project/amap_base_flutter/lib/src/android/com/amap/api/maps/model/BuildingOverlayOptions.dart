import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_BuildingOverlayOptions {
  com_amap_api_maps_model_BuildingOverlayOptions.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<double> getZIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::getZIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::getZIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setZIndex(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::setZIndex([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::setZIndex', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setVisible(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::setVisible([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::setVisible', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isVisible() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::isVisible([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::isVisible', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_BuildingOverlayOptions> setBuildingHeightScale(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::setBuildingHeightScale([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::setBuildingHeightScale', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BuildingOverlayOptions.withRefId(result);
  }
  
   Future<int> getBuildingHeightScale() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::getBuildingHeightScale([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::getBuildingHeightScale', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_BuildingOverlayOptions> setBuildingTopColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::setBuildingTopColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::setBuildingTopColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BuildingOverlayOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_BuildingOverlayOptions> setBuildingSideColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::setBuildingSideColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::setBuildingSideColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BuildingOverlayOptions.withRefId(result);
  }
  
   Future<int> getBuildingSideColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::getBuildingSideColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::getBuildingSideColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getBuildingTopColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::getBuildingTopColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::getBuildingTopColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_BuildingOverlayOptions> setBuildingHeight(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::setBuildingHeight([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::setBuildingHeight', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BuildingOverlayOptions.withRefId(result);
  }
  
   Future<int> getBuildingHeight() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::getBuildingHeight([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::getBuildingHeight', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_BuildingOverlayOptions> setBuildingLatlngs(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BuildingOverlayOptions@$refId::setBuildingLatlngs([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlayOptions::setBuildingLatlngs', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BuildingOverlayOptions.withRefId(result);
  }
  
}