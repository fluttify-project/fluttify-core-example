import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_CrossOverlay extends Ref_Android {
  com_amap_api_maps_model_CrossOverlay.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setAttribute(com_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CrossOverlay@$refId::setAttribute([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CrossOverlay::setAttribute', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setVisible(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CrossOverlay@$refId::setVisible([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CrossOverlay::setVisible', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> remove() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CrossOverlay@$refId::remove([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CrossOverlay::remove', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setImageMode(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CrossOverlay@$refId::setImageMode([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CrossOverlay::setImageMode', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setGenerateCrossImageListener() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CrossOverlay@$refId::setGenerateCrossImageListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CrossOverlay::setGenerateCrossImageListener', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}