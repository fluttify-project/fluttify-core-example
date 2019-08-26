import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_gloverlay_CrossVectorOverlay {
  com_autonavi_ae_gmap_gloverlay_CrossVectorOverlay.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<int> dipToPixel(android_content_Context var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay@$refId::dipToPixel([\'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::dipToPixel', {"var1": var1.refId, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setAttribute(com_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay@$refId::setAttribute([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::setAttribute', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> setData(List<int> var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay@$refId::setData([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::setData', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> remove() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay@$refId::remove([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::remove', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setImageMode(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay@$refId::setImageMode([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::setImageMode', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setGenerateCrossImageListener() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay@$refId::setGenerateCrossImageListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::setGenerateCrossImageListener', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getTextureID() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay@$refId::getTextureID([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::getTextureID', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}