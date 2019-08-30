import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_gloverlay_GLCrossVector {
  com_autonavi_ae_gmap_gloverlay_GLCrossVector.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> addVectorRemainDis(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.GLCrossVector@$refId::addVectorRemainDis([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLCrossVector::addVectorRemainDis', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> addVectorCar(int var1, int var2, int var3) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.GLCrossVector@$refId::addVectorCar([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLCrossVector::addVectorCar', {"var1": var1, "var2": var2, "var3": var3, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRoadResId(bool var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.GLCrossVector@$refId::setRoadResId([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLCrossVector::setRoadResId', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setArrowResId(bool var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.GLCrossVector@$refId::setArrowResId([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLCrossVector::setArrowResId', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCarResId(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.GLCrossVector@$refId::setCarResId([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLCrossVector::setCarResId', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setBackgroundResId(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.GLCrossVector@$refId::setBackgroundResId([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLCrossVector::setBackgroundResId', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setSkyResId(bool var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.GLCrossVector@$refId::setSkyResId([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLCrossVector::setSkyResId', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getFBOTextureId() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.GLCrossVector@$refId::getFBOTextureId([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLCrossVector::getFBOTextureId', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> initFBOTexture(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.gloverlay.GLCrossVector@$refId::initFBOTexture([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLCrossVector::initFBOTexture', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}