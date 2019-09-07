import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAParticleOverlay extends MAShape {
  MAParticleOverlay.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAParticleOverlayOptions> get_overlayOption() async {
    final result = await _channel.invokeMethod("MAParticleOverlay::get_overlayOption", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}