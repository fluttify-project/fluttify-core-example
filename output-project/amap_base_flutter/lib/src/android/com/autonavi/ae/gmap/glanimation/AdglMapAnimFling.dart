import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_glanimation_AdglMapAnimFling extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<void> reset() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AdglMapAnimFling@$refId::reset([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AdglMapAnimFling::reset', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> setPositionAndVelocity(double var1, double var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.glanimation.AdglMapAnimFling@$refId::setPositionAndVelocity([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.glanimation.AdglMapAnimFling::setPositionAndVelocity', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}