import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAParticleOverlayOptions extends NSObject  {
  MAParticleOverlayOptions.withRefId(int refId) : super.withRefId(refId);

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
  
  Future<MAParticleColorGenerate> get_particleStartColor() async {
    final result = await _channel.invokeMethod("MAParticleOverlayOptions::get_particleStartColor", {'refId': refId});
    return result;
  }
  
  Future<MAParticleVelocityGenerate> get_particleStartSpeed() async {
    final result = await _channel.invokeMethod("MAParticleOverlayOptions::get_particleStartSpeed", {'refId': refId});
    return result;
  }
  
  Future<MAParticleEmissionModule> get_particleEmissionModule() async {
    final result = await _channel.invokeMethod("MAParticleOverlayOptions::get_particleEmissionModule", {'refId': refId});
    return result;
  }
  
  Future<MAParticleShapeModule> get_particleShapeModule() async {
    final result = await _channel.invokeMethod("MAParticleOverlayOptions::get_particleShapeModule", {'refId': refId});
    return result;
  }
  
  Future<MAParticleOverLifeModule> get_particleOverLifeModule() async {
    final result = await _channel.invokeMethod("MAParticleOverlayOptions::get_particleOverLifeModule", {'refId': refId});
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
  
  Future<void> set_particleStartColor(MAParticleColorGenerate particleStartColor) async {
    await _channel.invokeMethod('MAParticleOverlayOptions::set_particleStartColor', {'refId': refId, "particleStartColor": ""});
  }
  
  Future<void> set_particleStartSpeed(MAParticleVelocityGenerate particleStartSpeed) async {
    await _channel.invokeMethod('MAParticleOverlayOptions::set_particleStartSpeed', {'refId': refId, "particleStartSpeed": ""});
  }
  
  Future<void> set_particleEmissionModule(MAParticleEmissionModule particleEmissionModule) async {
    await _channel.invokeMethod('MAParticleOverlayOptions::set_particleEmissionModule', {'refId': refId, "particleEmissionModule": particleEmissionModule.refId});
  }
  
  Future<void> set_particleShapeModule(MAParticleShapeModule particleShapeModule) async {
    await _channel.invokeMethod('MAParticleOverlayOptions::set_particleShapeModule', {'refId': refId, "particleShapeModule": ""});
  }
  
  Future<void> set_particleOverLifeModule(MAParticleOverLifeModule particleOverLifeModule) async {
    await _channel.invokeMethod('MAParticleOverlayOptions::set_particleOverLifeModule', {'refId': refId, "particleOverLifeModule": particleOverLifeModule.refId});
  }
  

  // 生成方法们
  
}