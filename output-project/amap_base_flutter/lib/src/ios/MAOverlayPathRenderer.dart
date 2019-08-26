import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAOverlayPathRenderer {
  MAOverlayPathRenderer.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_lineDash() async {
    final result = await _channel.invokeMethod("MAOverlayPathRenderer::get_lineDash", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_lineDash(bool lineDash) async {
    await _channel.invokeMethod('MAOverlayPathRenderer::set_lineDash', {'refId': refId, "lineDash": lineDash});
  }
  

  // 生成方法们
  
}