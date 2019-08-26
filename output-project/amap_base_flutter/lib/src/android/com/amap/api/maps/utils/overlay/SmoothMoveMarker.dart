import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_utils_overlay_SmoothMoveMarker {
  com_amap_api_maps_utils_overlay_SmoothMoveMarker.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setPoints(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::setPoints([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::setPoints', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setTotalDuration(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::setTotalDuration([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::setTotalDuration', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> startSmoothMove() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::startSmoothMove([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::startSmoothMove', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> stopMove() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::stopMove([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::stopMove', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_Marker> getMarker() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::getMarker([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::getMarker', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_Marker.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_LatLng> getPosition() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::getPosition([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::getPosition', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_LatLng.withRefId(result);
  }
  
   Future<int> getIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::getIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::getIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> resetIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::resetIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::resetIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> destroy() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::destroy([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::destroy', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> removeMarker() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::removeMarker([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::removeMarker', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setPosition(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::setPosition([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::setPosition', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setDescriptor(com_amap_api_maps_model_BitmapDescriptor var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::setDescriptor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::setDescriptor', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRotate(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::setRotate([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::setRotate', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setVisible(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::setVisible([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::setVisible', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMoveListener() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.SmoothMoveMarker@$refId::setMoveListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.SmoothMoveMarker::setMoveListener', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}