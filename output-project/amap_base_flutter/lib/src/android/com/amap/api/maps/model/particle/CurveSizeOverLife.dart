import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_particle_CurveSizeOverLife {
  com_amap_api_maps_model_particle_CurveSizeOverLife.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> createNativeInstace() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.CurveSizeOverLife@$refId::createNativeInstace([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.CurveSizeOverLife::createNativeInstace', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getSizeX(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.CurveSizeOverLife@$refId::getSizeX([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.CurveSizeOverLife::getSizeX', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getSizeY(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.CurveSizeOverLife@$refId::getSizeY([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.CurveSizeOverLife::getSizeY', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getSizeZ(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.CurveSizeOverLife@$refId::getSizeZ([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.CurveSizeOverLife::getSizeZ', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}