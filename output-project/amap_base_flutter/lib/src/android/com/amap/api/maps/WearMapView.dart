import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_WearMapView extends Ref_Android {
  com_amap_api_maps_WearMapView.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<com_amap_api_maps_AMap> getMap() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::getMap([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::getMap', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMap.withRefId(result);
  }
  
   Future<String> onCreate(android_os_Bundle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::onCreate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::onCreate', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onResume() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::onResume([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::onResume', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onPause() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::onPause([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::onPause', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onDestroy() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::onDestroy([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::onDestroy', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onLowMemory() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::onLowMemory([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::onLowMemory', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onSaveInstanceState(android_os_Bundle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::onSaveInstanceState([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::onSaveInstanceState', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setVisibility(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::setVisibility([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::setVisibility', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setOnDismissCallbackListener({void onDismiss(), void onNotifySwipe()}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::setOnDismissCallbackListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::setOnDismissCallbackListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.WearMapView::setOnDismissCallbackListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.WearMapView::setOnDismissCallbackListener_Callback::onDismiss':
              if (onDismiss != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.WearMapView::setOnDismissCallbackListener_onDismiss([])');
        
                // 调用回调方法
                onDismiss();
              }
              break;
            case 'com.amap.api.maps.WearMapView::setOnDismissCallbackListener_Callback::onNotifySwipe':
              if (onNotifySwipe != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.WearMapView::setOnDismissCallbackListener_onNotifySwipe([])');
        
                // 调用回调方法
                onNotifySwipe();
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> onDismiss() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::onDismiss([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::onDismiss', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onEnterAmbient(android_os_Bundle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::onEnterAmbient([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::onEnterAmbient', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onExitAmbient() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.WearMapView@$refId::onExitAmbient([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.WearMapView::onExitAmbient', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}