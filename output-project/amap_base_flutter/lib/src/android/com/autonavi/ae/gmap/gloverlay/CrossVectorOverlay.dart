import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_gloverlay_CrossVectorOverlay extends Ref_Android {
  com_autonavi_ae_gmap_gloverlay_CrossVectorOverlay.withRefId(int refId): super.withRefId(refId);

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
  
   Future<String> setGenerateCrossImageListener(com_amap_api_maps_model_CrossOverlay_GenerateCrossImageListener var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay@$refId::setGenerateCrossImageListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::setGenerateCrossImageListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::setGenerateCrossImageListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            [case 'com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::setGenerateCrossImageListener_Callback::onGenerateComplete':
              if (var1.onGenerateComplete != null) {
                // 日志打印
                print('fluttify-dart-callback: com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay::setGenerateCrossImageListener_onGenerateComplete([\'var2\':$args[var2]])');
        
                // 调用回调方法
                var1.onGenerateComplete(android_graphics_Bitmap.withRefId(args['var1']), args['var2']);
              }
              break;]
            default:
              break;
          }
        });
  
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