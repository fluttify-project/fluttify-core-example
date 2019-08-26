import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V {
  com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> reset() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V@$refId::reset([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V::reset', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setFromValue(double var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V@$refId::setFromValue([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V::setFromValue', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setToValue(double var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V@$refId::setToValue([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V::setToValue', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getFromValue() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V@$refId::getFromValue([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V::getFromValue', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getToValue() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V@$refId::getToValue([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V::getToValue', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getCurValue() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V@$refId::getCurValue([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V::getCurValue', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> checkParam() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V@$refId::checkParam([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AbstractAdglAnimationParam1V::checkParam', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}