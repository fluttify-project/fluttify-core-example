import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_PolygonOptions extends Ref_Android {
  com_amap_api_maps_model_PolygonOptions.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<com_amap_api_maps_model_PolygonOptions> add(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::add([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::add', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_PolygonOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_PolygonOptions> addAll(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::addAll([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::addAll', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_PolygonOptions.withRefId(result);
  }
  
   Future<String> setPoints(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::setPoints([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::setPoints', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setHoleOptions(com_amap_api_maps_model_BaseHoleOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::setHoleOptions([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::setHoleOptions', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_PolygonOptions> addHoles(com_amap_api_maps_model_BaseHoleOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::addHoles([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::addHoles', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_PolygonOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_PolygonOptions> strokeWidth(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::strokeWidth([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::strokeWidth', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_PolygonOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_PolygonOptions> strokeColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::strokeColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::strokeColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_PolygonOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_PolygonOptions> fillColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::fillColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::fillColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_PolygonOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_PolygonOptions> zIndex(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::zIndex([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::zIndex', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_PolygonOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_PolygonOptions> visible(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::visible([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::visible', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_PolygonOptions.withRefId(result);
  }
  
   Future<double> getStrokeWidth() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::getStrokeWidth([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::getStrokeWidth', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getStrokeColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::getStrokeColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::getStrokeColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getFillColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::getFillColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::getFillColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getZIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::getZIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::getZIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isVisible() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.PolygonOptions@$refId::isVisible([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.PolygonOptions::isVisible', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}