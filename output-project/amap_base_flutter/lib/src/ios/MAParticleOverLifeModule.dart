import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAParticleOverLifeModule extends NSObject  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setVelocityOverLife(MAParticleVelocityGenerate velocity) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverLifeModule@$refId::setVelocityOverLife([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAParticleOverLifeModule::setVelocityOverLife', {"velocity": velocity.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRotationOverLife(MAParticleRotationGenerate rotation) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverLifeModule@$refId::setRotationOverLife([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAParticleOverLifeModule::setRotationOverLife', {"rotation": rotation.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setSizeOverLife(MAParticleSizeGenerate size) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverLifeModule@$refId::setSizeOverLife([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAParticleOverLifeModule::setSizeOverLife', {"size": size.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setColorOverLife(MAParticleColorGenerate color) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverLifeModule@$refId::setColorOverLife([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAParticleOverLifeModule::setColorOverLife', {"color": color.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}