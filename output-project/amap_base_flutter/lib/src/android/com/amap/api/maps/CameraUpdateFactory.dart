import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_CameraUpdateFactory extends Ref_Android {
  com_amap_api_maps_CameraUpdateFactory.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<com_amap_api_maps_CameraUpdate> zoomIn() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::zoomIn([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::zoomIn', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> zoomOut() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::zoomOut([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::zoomOut', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> scrollBy(double var0, double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::scrollBy([\'var0\':$var0, \'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::scrollBy', {"var0": var0, "var1": var1});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> zoomTo(double var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::zoomTo([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::zoomTo', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> zoomBy(double var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::zoomBy([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::zoomBy', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> newCameraPosition(com_amap_api_maps_model_CameraPosition var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::newCameraPosition([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::newCameraPosition', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> newLatLng(com_amap_api_maps_model_LatLng var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::newLatLng([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::newLatLng', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> newLatLngZoom(com_amap_api_maps_model_LatLng var0, double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::newLatLngZoom([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::newLatLngZoom', {"var0": var0.refId, "var1": var1});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> newLatLngBounds(com_amap_api_maps_model_LatLngBounds var0, int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::newLatLngBounds([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::newLatLngBounds', {"var0": var0.refId, "var1": var1});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> changeLatLng(com_amap_api_maps_model_LatLng var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::changeLatLng([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::changeLatLng', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> changeBearing(double var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::changeBearing([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::changeBearing', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> changeTilt(double var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::changeTilt([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::changeTilt', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  static Future<com_amap_api_maps_CameraUpdate> newLatLngBoundsRect(com_amap_api_maps_model_LatLngBounds var0, int var1, int var2, int var3, int var4) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.CameraUpdateFactory::newLatLngBoundsRect([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.CameraUpdateFactory::newLatLngBoundsRect', {"var0": var0.refId, "var1": var1, "var2": var2, "var3": var3, "var4": var4});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
}