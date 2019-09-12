import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMultiPointOverlayRenderer extends MAOverlayRenderer {
  MAMultiPointOverlayRenderer.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAMultiPointOverlayRendererDelegate> get_delegate() async {
    final result = await _channel.invokeMethod("MAMultiPointOverlayRenderer::get_delegate", {'refId': refId});
    return result;
  }
  
  Future<MAMultiPointOverlay> get_multiPointOverlay() async {
    final result = await _channel.invokeMethod("MAMultiPointOverlayRenderer::get_multiPointOverlay", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_delegate(MAMultiPointOverlayRendererDelegate delegate) async {
    await _channel.invokeMethod('MAMultiPointOverlayRenderer::set_delegate', {'refId': refId, "delegate": delegate.refId});
  }
  

  // 生成方法们
  
}