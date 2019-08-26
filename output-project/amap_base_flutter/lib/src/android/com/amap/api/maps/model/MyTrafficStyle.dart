import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_MyTrafficStyle {
  com_amap_api_maps_model_MyTrafficStyle.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<int> getSmoothColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::getSmoothColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::getSmoothColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setSmoothColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::setSmoothColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::setSmoothColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getSlowColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::getSlowColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::getSlowColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setSlowColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::setSlowColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::setSlowColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getCongestedColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::getCongestedColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::getCongestedColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCongestedColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::setCongestedColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::setCongestedColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getSeriousCongestedColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::getSeriousCongestedColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::getSeriousCongestedColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setSeriousCongestedColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::setSeriousCongestedColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::setSeriousCongestedColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getRatio() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::getRatio([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::getRatio', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRatio(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::setRatio([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::setRatio', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getTrafficRoadBackgroundColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::getTrafficRoadBackgroundColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::getTrafficRoadBackgroundColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setTrafficRoadBackgroundColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MyTrafficStyle@$refId::setTrafficRoadBackgroundColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MyTrafficStyle::setTrafficRoadBackgroundColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}