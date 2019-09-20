import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_CustomMapStyleOptions extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> getStyleDataPath() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CustomMapStyleOptions@$refId::getStyleDataPath([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CustomMapStyleOptions::getStyleDataPath', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_CustomMapStyleOptions> setStyleDataPath(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CustomMapStyleOptions@$refId::setStyleDataPath([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CustomMapStyleOptions::setStyleDataPath', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CustomMapStyleOptions()..refId = result;
  }
  
   Future<String> getStyleTexturePath() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CustomMapStyleOptions@$refId::getStyleTexturePath([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CustomMapStyleOptions::getStyleTexturePath', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_CustomMapStyleOptions> setStyleTexturePath(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CustomMapStyleOptions@$refId::setStyleTexturePath([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CustomMapStyleOptions::setStyleTexturePath', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CustomMapStyleOptions()..refId = result;
  }
  
   Future<String> getStyleId() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CustomMapStyleOptions@$refId::getStyleId([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CustomMapStyleOptions::getStyleId', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_CustomMapStyleOptions> setStyleId(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CustomMapStyleOptions@$refId::setStyleId([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CustomMapStyleOptions::setStyleId', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CustomMapStyleOptions()..refId = result;
  }
  
   Future<bool> isEnable() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CustomMapStyleOptions@$refId::isEnable([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CustomMapStyleOptions::isEnable', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_CustomMapStyleOptions> setEnable(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CustomMapStyleOptions@$refId::setEnable([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CustomMapStyleOptions::setEnable', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CustomMapStyleOptions()..refId = result;
  }
  
   Future<String> getStyleExtraPath() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CustomMapStyleOptions@$refId::getStyleExtraPath([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CustomMapStyleOptions::getStyleExtraPath', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_CustomMapStyleOptions> setStyleExtraPath(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CustomMapStyleOptions@$refId::setStyleExtraPath([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CustomMapStyleOptions::setStyleExtraPath', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CustomMapStyleOptions()..refId = result;
  }
  
}