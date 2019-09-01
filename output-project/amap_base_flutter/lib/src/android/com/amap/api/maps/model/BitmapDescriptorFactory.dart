import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_BitmapDescriptorFactory extends Ref_Android {
  com_amap_api_maps_model_BitmapDescriptorFactory.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

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