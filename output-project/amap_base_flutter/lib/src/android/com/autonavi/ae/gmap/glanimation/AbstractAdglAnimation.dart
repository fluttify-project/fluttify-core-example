import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_glanimation_AbstractAdglAnimation extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_INVALIDE_VALUE() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::get_INVALIDE_VALUE", {'refId': refId});
    return result;
  }
  
  Future<int> get_INTERPOLATOR_LINEAR() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::get_INTERPOLATOR_LINEAR", {'refId': refId});
    return result;
  }
  
  Future<int> get_INTERPOLATOR_ACCELERATE() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::get_INTERPOLATOR_ACCELERATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_INTERPOLATOR_DECELERATE() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::get_INTERPOLATOR_DECELERATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_INTERPOLATOR_ACCELERATE_DECELERATE() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::get_INTERPOLATOR_ACCELERATE_DECELERATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_INTERPOLATOR_BOUNCE() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::get_INTERPOLATOR_BOUNCE", {'refId': refId});
    return result;
  }
  
  Future<int> get_INTERPOLATOR_OVERSHOOT() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::get_INTERPOLATOR_OVERSHOOT", {'refId': refId});
    return result;
  }
  
  Future<int> get_INTERPOLATOR_DOUBLE_RAISE() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::get_INTERPOLATOR_DOUBLE_RAISE", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEFAULT_DURATION() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::get_DEFAULT_DURATION", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
   Future<bool> isOver() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation@$refId::isOver([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::isOver', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isValid() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation@$refId::isValid([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AbstractAdglAnimation::isValid', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}