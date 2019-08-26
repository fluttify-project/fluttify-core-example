import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_particle_ParticleOverlay {
  com_amap_api_maps_model_particle_ParticleOverlay.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setVisible(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setVisible([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setVisible', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> destroy() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::destroy([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::destroy', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setStartParticleSize(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setStartParticleSize([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setStartParticleSize', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMaxParticles(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setMaxParticles([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setMaxParticles', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setDuration(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setDuration([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setDuration', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setParticleLifeTime(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setParticleLifeTime([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setParticleLifeTime', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setParticleStartSpeed(com_amap_api_maps_model_particle_VelocityGenerate var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setParticleStartSpeed([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setParticleStartSpeed', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setLoop(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setLoop([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setLoop', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setParticleShapeModule(com_amap_api_maps_model_particle_ParticleShapeModule var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setParticleShapeModule([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setParticleShapeModule', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setParticleEmission(com_amap_api_maps_model_particle_ParticleEmissionModule var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setParticleEmission([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setParticleEmission', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getCurrentParticleNum() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::getCurrentParticleNum([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::getCurrentParticleNum', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setParticleOverLifeModule(com_amap_api_maps_model_particle_ParticleOverLifeModule var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setParticleOverLifeModule([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setParticleOverLifeModule', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setStartColor(com_amap_api_maps_model_particle_ColorGenerate var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.particle.ParticleOverlay@$refId::setStartColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.particle.ParticleOverlay::setStartColor', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}