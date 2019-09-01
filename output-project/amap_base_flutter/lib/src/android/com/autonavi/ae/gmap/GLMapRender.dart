import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_GLMapRender extends Ref_Android {
  com_autonavi_ae_gmap_GLMapRender.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_mSurfacedestoryed() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_mSurfacedestoryed", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_mSurfacedestoryed(bool mSurfacedestoryed) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::set_mSurfacedestoryed', {'refId': refId, "mSurfacedestoryed": mSurfacedestoryed});
  }
  

  // 生成方法们
   Future<String> setTrafficMode(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::setTrafficMode([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::setTrafficMode', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> resetTickCount(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::resetTickCount([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::resetTickCount', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isRenderPause() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::isRenderPause([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::isRenderPause', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRenderFps(double var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::setRenderFps([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::setRenderFps', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> renderPause() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::renderPause([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::renderPause', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> renderResume() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::renderResume([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::renderResume', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onAttachedToWindow() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::onAttachedToWindow([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::onAttachedToWindow', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onDetachedFromWindow() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::onDetachedFromWindow([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::onDetachedFromWindow', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onSurfaceDestory() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::onSurfaceDestory([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::onSurfaceDestory', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}