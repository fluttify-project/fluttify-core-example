import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_BitmapDescriptorFactory extends Ref_Android {
  com_amap_api_maps_model_BitmapDescriptorFactory.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<double> get_HUE_RED() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BitmapDescriptorFactory::get_HUE_RED", {'refId': refId});
    return result;
  }
  
  Future<double> get_HUE_ORANGE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BitmapDescriptorFactory::get_HUE_ORANGE", {'refId': refId});
    return result;
  }
  
  Future<double> get_HUE_YELLOW() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BitmapDescriptorFactory::get_HUE_YELLOW", {'refId': refId});
    return result;
  }
  
  Future<double> get_HUE_GREEN() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BitmapDescriptorFactory::get_HUE_GREEN", {'refId': refId});
    return result;
  }
  
  Future<double> get_HUE_CYAN() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BitmapDescriptorFactory::get_HUE_CYAN", {'refId': refId});
    return result;
  }
  
  Future<double> get_HUE_AZURE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BitmapDescriptorFactory::get_HUE_AZURE", {'refId': refId});
    return result;
  }
  
  Future<double> get_HUE_BLUE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BitmapDescriptorFactory::get_HUE_BLUE", {'refId': refId});
    return result;
  }
  
  Future<double> get_HUE_VIOLET() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BitmapDescriptorFactory::get_HUE_VIOLET", {'refId': refId});
    return result;
  }
  
  Future<double> get_HUE_MAGENTA() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BitmapDescriptorFactory::get_HUE_MAGENTA", {'refId': refId});
    return result;
  }
  
  Future<double> get_HUE_ROSE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BitmapDescriptorFactory::get_HUE_ROSE", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  static Future<com_amap_api_maps_model_BitmapDescriptor> fromResource(int var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BitmapDescriptorFactory::fromResource([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BitmapDescriptorFactory::fromResource', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BitmapDescriptor.withRefId(result);
  }
  
  static Future<com_amap_api_maps_model_BitmapDescriptor> fromView(android_view_View var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BitmapDescriptorFactory::fromView([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BitmapDescriptorFactory::fromView', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BitmapDescriptor.withRefId(result);
  }
  
  static Future<com_amap_api_maps_model_BitmapDescriptor> fromPath(String var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BitmapDescriptorFactory::fromPath([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BitmapDescriptorFactory::fromPath', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BitmapDescriptor.withRefId(result);
  }
  
  static Future<com_amap_api_maps_model_BitmapDescriptor> fromAsset(String var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BitmapDescriptorFactory::fromAsset([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BitmapDescriptorFactory::fromAsset', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BitmapDescriptor.withRefId(result);
  }
  
  static Future<com_amap_api_maps_model_BitmapDescriptor> fromFile(String var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BitmapDescriptorFactory::fromFile([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BitmapDescriptorFactory::fromFile', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BitmapDescriptor.withRefId(result);
  }
  
  static Future<com_amap_api_maps_model_BitmapDescriptor> defaultMarker() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BitmapDescriptorFactory::defaultMarker([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BitmapDescriptorFactory::defaultMarker', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BitmapDescriptor.withRefId(result);
  }
  
  static Future<android_content_Context> getContext() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.BitmapDescriptorFactory::getContext([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.BitmapDescriptorFactory::getContext', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return android_content_Context.withRefId(result);
  }
  
}