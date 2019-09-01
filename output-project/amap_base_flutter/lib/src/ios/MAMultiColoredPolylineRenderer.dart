import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMultiColoredPolylineRenderer extends Ref_Android {
  MAMultiColoredPolylineRenderer.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_gradient() async {
    final result = await _channel.invokeMethod("MAMultiColoredPolylineRenderer::get_isGradient", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_gradient(bool gradient) async {
    await _channel.invokeMethod('MAMultiColoredPolylineRenderer::set_gradient', {'refId': refId, "gradient": gradient});
  }
  

  // 生成方法们
  
}