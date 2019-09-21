import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMultiTexturePolylineRenderer extends MAPolylineRenderer {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAMultiPolyline> get_multiPolyline() async {
    final result = await _channel.invokeMethod(
        "MAMultiTexturePolylineRenderer::get_multiPolyline", {'refId': refId});
    return result;
  }

  // 生成setters

  // 生成方法们
  Future<MAMultiTexturePolylineRenderer> initWithMultiPolyline(
      MAMultiPolyline multiPolyline) async {
    // 日志打印
    print(
        'fluttify-dart: MAMultiTexturePolylineRenderer@$refId::initWithMultiPolyline([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAMultiTexturePolylineRenderer::initWithMultiPolyline',
        {"multiPolyline": multiPolyline.refId, "refId": refId});

    // 接受原生回调

    // 返回值
    return MAMultiTexturePolylineRenderer()..refId = result;
  }
}
