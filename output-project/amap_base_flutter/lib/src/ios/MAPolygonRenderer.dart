import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAPolygonRenderer extends MAOverlayPathRenderer {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAPolygon> get_polygon() async {
    final result = await _channel
        .invokeMethod("MAPolygonRenderer::get_polygon", {'refId': refId});
    return result;
  }

  // 生成setters

  // 生成方法们
  Future<MAPolygonRenderer> initWithPolygon(MAPolygon polygon) async {
    // 日志打印
    print('fluttify-dart: MAPolygonRenderer@$refId::initWithPolygon([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAPolygonRenderer::initWithPolygon',
        {"polygon": polygon.refId, "refId": refId});

    // 接受原生回调

    // 返回值
    return MAPolygonRenderer()..refId = result;
  }
}
