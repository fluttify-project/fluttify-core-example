import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_NavigateArrowOptions extends Ref_Android {
  com_amap_api_maps_model_NavigateArrowOptions.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<com_amap_api_maps_model_NavigateArrowOptions> add(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::add([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::add', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_NavigateArrowOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_NavigateArrowOptions> addAll(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::addAll([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::addAll', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_NavigateArrowOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_NavigateArrowOptions> width(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::width([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::width', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_NavigateArrowOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_NavigateArrowOptions> topColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::topColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::topColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_NavigateArrowOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_NavigateArrowOptions> sideColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::sideColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::sideColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_NavigateArrowOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_NavigateArrowOptions> zIndex(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::zIndex([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::zIndex', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_NavigateArrowOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_NavigateArrowOptions> visible(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::visible([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::visible', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_NavigateArrowOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_NavigateArrowOptions> set3DModel(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::set3DModel([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::set3DModel', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_NavigateArrowOptions.withRefId(result);
  }
  
   Future<double> getWidth() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::getWidth([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::getWidth', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getTopColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::getTopColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::getTopColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getSideColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::getSideColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::getSideColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getZIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::getZIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::getZIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isVisible() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::isVisible([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::isVisible', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> is3DModel() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::is3DModel([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::is3DModel', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setPoints(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.NavigateArrowOptions@$refId::setPoints([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.NavigateArrowOptions::setPoints', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}