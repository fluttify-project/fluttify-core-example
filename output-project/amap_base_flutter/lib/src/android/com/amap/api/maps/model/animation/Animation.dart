import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_animation_Animation extends Ref_Android {
  com_amap_api_maps_model_animation_Animation.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_FILL_MODE_FORWARDS() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.animation.Animation::get_FILL_MODE_FORWARDS", {'refId': refId});
    return result;
  }
  
  Future<int> get_FILL_MODE_BACKWARDS() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.animation.Animation::get_FILL_MODE_BACKWARDS", {'refId': refId});
    return result;
  }
  
  Future<int> get_INFINITE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.animation.Animation::get_INFINITE", {'refId': refId});
    return result;
  }
  
  Future<int> get_RESTART() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.animation.Animation::get_RESTART", {'refId': refId});
    return result;
  }
  
  Future<int> get_REVERSE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.animation.Animation::get_REVERSE", {'refId': refId});
    return result;
  }
  
  Future<com_autonavi_amap_mapcore_animation_GLAnimation> get_glAnimation() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.animation.Animation::get_glAnimation", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_glAnimation(com_autonavi_amap_mapcore_animation_GLAnimation glAnimation) async {
    await _channel.invokeMethod('com.amap.api.maps.model.animation.Animation::set_glAnimation', {'refId': refId, "glAnimation": glAnimation});
  }
  

  // 生成方法们
   Future<String> setAnimationListener(com_amap_api_maps_model_animation_Animation_AnimationListener var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.animation.Animation@$refId::setAnimationListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.animation.Animation::setAnimationListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.model.animation.Animation::setAnimationListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.model.animation.Animation::setAnimationListener_Callback::onAnimationStart':
              if (onAnimationStart != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.model.animation.Animation::setAnimationListener_onAnimationStart([])');
        
                // 调用回调方法
                onAnimationStart();
              }
              break;
            case 'com.amap.api.maps.model.animation.Animation::setAnimationListener_Callback::onAnimationEnd':
              if (onAnimationEnd != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.model.animation.Animation::setAnimationListener_onAnimationEnd([])');
        
                // 调用回调方法
                onAnimationEnd();
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setDuration(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.animation.Animation@$refId::setDuration([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.animation.Animation::setDuration', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setFillMode(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.animation.Animation@$refId::setFillMode([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.animation.Animation::setFillMode', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getFillMode() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.animation.Animation@$refId::getFillMode([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.animation.Animation::getFillMode', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRepeatCount(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.animation.Animation@$refId::setRepeatCount([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.animation.Animation::setRepeatCount', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRepeatMode(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.animation.Animation@$refId::setRepeatMode([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.animation.Animation::setRepeatMode', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getRepeatMode() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.animation.Animation@$refId::getRepeatMode([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.animation.Animation::getRepeatMode', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getRepeatCount() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.animation.Animation@$refId::getRepeatCount([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.animation.Animation::getRepeatCount', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}