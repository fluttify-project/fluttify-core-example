import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_CrossOverlayOptions extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<com_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr> getAttribute() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CrossOverlayOptions@$refId::getAttribute([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CrossOverlayOptions::getAttribute', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr()..refId = result;
  }
  
   Future<com_amap_api_maps_model_CrossOverlayOptions> setAttribute(com_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.CrossOverlayOptions@$refId::setAttribute([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.CrossOverlayOptions::setAttribute', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CrossOverlayOptions()..refId = result;
  }
  
}