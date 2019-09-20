import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_AMapException extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<String> get_ERROR_IO() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_IO", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_SOCKET() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_SOCKET", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_SOCKE_TIME_OUT() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_SOCKE_TIME_OUT", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_INVALID_PARAMETER() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_INVALID_PARAMETER", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_NULL_PARAMETER() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_NULL_PARAMETER", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_URL() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_URL", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_UNKNOW_HOST() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_UNKNOW_HOST", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_UNKNOW_SERVICE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_UNKNOW_SERVICE", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_PROTOCOL() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_PROTOCOL", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_CONNECTION() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_CONNECTION", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_UNKNOWN() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_UNKNOWN", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_FAILURE_AUTH() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_FAILURE_AUTH", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_NOT_ENOUGH_SPACE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_NOT_ENOUGH_SPACE", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_NOT_AVAILABLE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_NOT_AVAILABLE", {'refId': refId});
    return result;
  }
  
  Future<String> get_ERROR_ILLEGAL_VALUE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ERROR_ILLEGAL_VALUE", {'refId': refId});
    return result;
  }
  
  Future<String> get_AMAP_NOT_SUPPORT() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_AMAP_NOT_SUPPORT", {'refId': refId});
    return result;
  }
  
  Future<String> get_ILLEGAL_AMAP_ARGUMENT() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapException::get_ILLEGAL_AMAP_ARGUMENT", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
   Future<String> getErrorMessage() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapException@$refId::getErrorMessage([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapException::getErrorMessage', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}