import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAParticleOverlayRenderer extends MAOverlayRenderer {
  MAParticleOverlayRenderer.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAParticleOverlay> get_particleOverlay() async {
    final result = await _channel.invokeMethod("MAParticleOverlayRenderer::get_particleOverlay", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}