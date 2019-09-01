import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_MultiPointOverlay extends Ref_Android {
  com_amap_api_maps_model_MultiPointOverlay.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setItems(com_amap_api_maps_model_MultiPointItem var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MultiPointOverlay@$refId::setItems([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MultiPointOverlay::setItems', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setAnchor(double var1, double var2) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MultiPointOverlay@$refId::setAnchor([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MultiPointOverlay::setAnchor', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setEnable(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MultiPointOverlay@$refId::setEnable([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MultiPointOverlay::setEnable', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> remove() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MultiPointOverlay@$refId::remove([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MultiPointOverlay::remove', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> destroy() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.MultiPointOverlay@$refId::destroy([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.MultiPointOverlay::destroy', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}