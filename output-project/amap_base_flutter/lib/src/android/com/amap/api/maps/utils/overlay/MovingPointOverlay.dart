import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_utils_overlay_MovingPointOverlay extends Ref_Android {
  com_amap_api_maps_utils_overlay_MovingPointOverlay.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setPoints(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::setPoints([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::setPoints', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> resetIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::resetIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::resetIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setTotalDuration(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::setTotalDuration([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::setTotalDuration', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> startSmoothMove() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::startSmoothMove([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::startSmoothMove', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> stopMove() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::stopMove([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::stopMove', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_BasePointOverlay> getObject() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::getObject([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::getObject', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BasePointOverlay.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_LatLng> getPosition() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::getPosition([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::getPosition', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_LatLng.withRefId(result);
  }
  
   Future<int> getIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::getIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::getIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> destroy() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::destroy([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::destroy', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> removeMarker() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::removeMarker([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::removeMarker', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setPosition(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::setPosition([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::setPosition', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRotate(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::setRotate([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::setRotate', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setVisible(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::setVisible([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::setVisible', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMoveListener({void move(double var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.utils.overlay.MovingPointOverlay@$refId::setMoveListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.utils.overlay.MovingPointOverlay::setMoveListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.utils.overlay.MovingPointOverlay::setMoveListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.utils.overlay.MovingPointOverlay::setMoveListener_Callback::move':
              if (move != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.utils.overlay.MovingPointOverlay::setMoveListener_move([\'var1\':$args[var1]])');
        
                // 调用回调方法
                move(args['var1']);
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
}