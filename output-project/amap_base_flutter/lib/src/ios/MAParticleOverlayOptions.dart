import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAParticleOverlayOptions {
  MAParticleOverlayOptions.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_visibile() async {
    final result = await _channel.invokeMethod("MAParticleOverlayOptions::get_visibile", {'refId': refId});
    return result;
  }
  
  Future<bool> get_loop() async {
    final result = await _channel.invokeMethod("MAParticleOverlayOptions::get_loop", {'refId': refId});
    return result;
  }
  
  Future<int> get_maxParticles() async {
    final result = await _channel.invokeMethod("MAParticleOverlayOptions::get_maxParticles", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_visibile(bool visibile) async {
    await _channel.invokeMethod('MAParticleOverlayOptions::set_visibile', {'refId': refId, "visibile": visibile});
  }
  
  Future<void> set_loop(bool loop) async {
    await _channel.invokeMethod('MAParticleOverlayOptions::set_loop', {'refId': refId, "loop": loop});
  }
  
  Future<void> set_maxParticles(int maxParticles) async {
    await _channel.invokeMethod('MAParticleOverlayOptions::set_maxParticles', {'refId': refId, "maxParticles": maxParticles});
  }
  

  // 生成方法们
  
}