import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_SwipeDismissView {
  com_amap_api_maps_SwipeDismissView.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setCallback({void onDismiss(), void onNotifySwipe()}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.SwipeDismissView@$refId::setCallback([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.SwipeDismissView::setCallback', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.SwipeDismissView::setCallback_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.SwipeDismissView::setCallback_Callback::onDismiss':
              if (onDismiss != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.SwipeDismissView::setCallback_onDismiss([])');
        
                // 调用回调方法
                onDismiss();
              }
              break;
            case 'com.amap.api.maps.SwipeDismissView::setCallback_Callback::onNotifySwipe':
              if (onNotifySwipe != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.SwipeDismissView::setCallback_onNotifySwipe([])');
        
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
  
}