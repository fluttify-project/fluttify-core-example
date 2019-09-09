import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr extends Ref_Android {
  com_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setMapCoreListener() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr@$refId::setMapCoreListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::setMapCoreListener', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> clearAnimations() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr@$refId::clearAnimations([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::clearAnimations', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getAnimationsCount() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr@$refId::getAnimationsCount([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::getAnimationsCount', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> doAnimations(com_autonavi_ae_gmap_GLMapState var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr@$refId::doAnimations([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::doAnimations', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> addAnimation(com_amap_api_maps_AMap_CancelableCallback var2, com_autonavi_ae_gmap_glanimation_AbstractAdglAnimation var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr@$refId::addAnimation([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::addAnimation', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::addAnimation_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::addAnimation_Callback::onFinish':
              if (onFinish != null) {
                // 日志打印
                print('fluttify-dart-callback: com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::addAnimation_onFinish([])');
        
                // 调用回调方法
                onFinish();
              }
              break;
            case 'com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::addAnimation_Callback::onCancel':
              if (onCancel != null) {
                // 日志打印
                print('fluttify-dart-callback: com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::addAnimation_onCancel([])');
        
                // 调用回调方法
                onCancel();
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_AMap_CancelableCallback> getCancelCallback() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr@$refId::getCancelCallback([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::getCancelCallback', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMap_CancelableCallback.withRefId(result);
  }
  
   Future<String> setMapAnimationListener(com_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr_MapAnimationListener var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr@$refId::setMapAnimationListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::setMapAnimationListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::setMapAnimationListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::setMapAnimationListener_Callback::onMapAnimationFinish':
              if (onMapAnimationFinish != null) {
                // 日志打印
                print('fluttify-dart-callback: com.autonavi.ae.gmap.glanimation.AdglMapAnimationMgr::setMapAnimationListener_onMapAnimationFinish([])');
        
                // 调用回调方法
                onMapAnimationFinish(com_amap_api_maps_AMap_CancelableCallback.withRefId(args['var1']));
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