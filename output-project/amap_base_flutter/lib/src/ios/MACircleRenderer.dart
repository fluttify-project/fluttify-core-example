import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MACircleRenderer extends MAOverlayPathRenderer {
  MACircleRenderer.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MACircle> get_circle() async {
    final result = await _channel.invokeMethod("MACircleRenderer::get_circle", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}