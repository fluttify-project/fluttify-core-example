import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_GL3DModelOptions extends Ref_Android {
  com_amap_api_maps_model_GL3DModelOptions.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<com_amap_api_maps_model_GL3DModelOptions> textureDrawable(com_amap_api_maps_model_BitmapDescriptor var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.GL3DModelOptions@$refId::textureDrawable([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.GL3DModelOptions::textureDrawable', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_GL3DModelOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_GL3DModelOptions> vertexData(double var1, double var2) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.GL3DModelOptions@$refId::vertexData([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.GL3DModelOptions::vertexData', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_GL3DModelOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_GL3DModelOptions> position(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.GL3DModelOptions@$refId::position([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.GL3DModelOptions::position', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_GL3DModelOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_GL3DModelOptions> angle(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.GL3DModelOptions@$refId::angle([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.GL3DModelOptions::angle', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_GL3DModelOptions.withRefId(result);
  }
  
   Future<double> getAngle() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.GL3DModelOptions@$refId::getAngle([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.GL3DModelOptions::getAngle', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_LatLng> getLatLng() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.GL3DModelOptions@$refId::getLatLng([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.GL3DModelOptions::getLatLng', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_LatLng.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_BitmapDescriptor> getBitmapDescriptor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.GL3DModelOptions@$refId::getBitmapDescriptor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.GL3DModelOptions::getBitmapDescriptor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BitmapDescriptor.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_GL3DModelOptions> setModelFixedLength(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.GL3DModelOptions@$refId::setModelFixedLength([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.GL3DModelOptions::setModelFixedLength', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_GL3DModelOptions.withRefId(result);
  }
  
   Future<int> getModelFixedLength() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.GL3DModelOptions@$refId::getModelFixedLength([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.GL3DModelOptions::getModelFixedLength', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}