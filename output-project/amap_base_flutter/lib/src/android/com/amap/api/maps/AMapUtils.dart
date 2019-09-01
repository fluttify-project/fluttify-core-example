import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_AMapUtils extends Ref_Android {
  com_amap_api_maps_AMapUtils.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<double> calculateLineDistance(com_amap_api_maps_model_LatLng var0, com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapUtils::calculateLineDistance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapUtils::calculateLineDistance', {"var0": var0.refId, "var1": var1.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<double> calculateArea(com_amap_api_maps_model_LatLng var0, com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapUtils::calculateArea([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapUtils::calculateArea', {"var0": var0.refId, "var1": var1.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> getLatestAMapApp(android_content_Context var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapUtils::getLatestAMapApp([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapUtils::getLatestAMapApp', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> openAMapNavi(android_content_Context var1, com_amap_api_maps_model_NaviPara var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapUtils::openAMapNavi([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapUtils::openAMapNavi', {"var0": var0.refId, "var1": var1.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> openAMapPoiNearbySearch(android_content_Context var1, com_amap_api_maps_model_PoiPara var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapUtils::openAMapPoiNearbySearch([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapUtils::openAMapPoiNearbySearch', {"var0": var0.refId, "var1": var1.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> openAMapDrivingRoute(android_content_Context var1, com_amap_api_maps_model_RoutePara var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapUtils::openAMapDrivingRoute([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapUtils::openAMapDrivingRoute', {"var0": var0.refId, "var1": var1.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> openAMapTransitRoute(android_content_Context var1, com_amap_api_maps_model_RoutePara var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapUtils::openAMapTransitRoute([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapUtils::openAMapTransitRoute', {"var0": var0.refId, "var1": var1.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> openAMapWalkingRoute(android_content_Context var1, com_amap_api_maps_model_RoutePara var0) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapUtils::openAMapWalkingRoute([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapUtils::openAMapWalkingRoute', {"var0": var0.refId, "var1": var1.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}