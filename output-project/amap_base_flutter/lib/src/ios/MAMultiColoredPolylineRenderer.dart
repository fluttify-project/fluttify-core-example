import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMultiColoredPolylineRenderer extends MAPolylineRenderer  {
  MAMultiColoredPolylineRenderer.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAMultiPolyline> get_multiPolyline() async {
    final result = await _channel.invokeMethod("MAMultiColoredPolylineRenderer::get_multiPolyline", {'refId': refId});
    return result;
  }
  
  Future<bool> get_gradient() async {
    final result = await _channel.invokeMethod("MAMultiColoredPolylineRenderer::get_isGradient", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_gradient(bool gradient) async {
    await _channel.invokeMethod('MAMultiColoredPolylineRenderer::set_gradient', {'refId': refId, "gradient": gradient});
  }
  

  // 生成方法们
   Future<MAMultiColoredPolylineRenderer> initWithMultiPolyline(MAMultiPolyline multiPolyline) async {
    // 日志打印
    print('fluttify-dart: MAMultiColoredPolylineRenderer@$refId::initWithMultiPolyline([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMultiColoredPolylineRenderer::initWithMultiPolyline', {"multiPolyline": multiPolyline.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAMultiColoredPolylineRenderer.withRefId(result);
  }
  
}