import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAParticleOverLifeModule extends NSObject {
  MAParticleOverLifeModule.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setVelocityOverLife(MAParticleVelocityGenerate velocity) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverLifeModule@$refId::setVelocityOverLife([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAParticleOverLifeModule::setVelocityOverLife', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAParticleOverLifeModule::setVelocityOverLife_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'MAParticleOverLifeModule::setVelocityOverLife_Callback::getX':
              if (velocity.getX != null) {
                // 日志打印
                print('fluttify-dart-callback: MAParticleOverLifeModule::setVelocityOverLife_getX([])');
        
                // 调用回调方法
                velocity.getX();
              }
              break;
            case 'MAParticleOverLifeModule::setVelocityOverLife_Callback::getY':
              if (velocity.getY != null) {
                // 日志打印
                print('fluttify-dart-callback: MAParticleOverLifeModule::setVelocityOverLife_getY([])');
        
                // 调用回调方法
                velocity.getY();
              }
              break;
            case 'MAParticleOverLifeModule::setVelocityOverLife_Callback::getZ':
              if (velocity.getZ != null) {
                // 日志打印
                print('fluttify-dart-callback: MAParticleOverLifeModule::setVelocityOverLife_getZ([])');
        
                // 调用回调方法
                velocity.getZ();
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setRotationOverLife(MAParticleRotationGenerate rotation) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverLifeModule@$refId::setRotationOverLife([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAParticleOverLifeModule::setRotationOverLife', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAParticleOverLifeModule::setRotationOverLife_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'MAParticleOverLifeModule::setRotationOverLife_Callback::getRotate':
              if (rotation.getRotate != null) {
                // 日志打印
                print('fluttify-dart-callback: MAParticleOverLifeModule::setRotationOverLife_getRotate([])');
        
                // 调用回调方法
                rotation.getRotate();
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setSizeOverLife(MAParticleSizeGenerate size) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverLifeModule@$refId::setSizeOverLife([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAParticleOverLifeModule::setSizeOverLife', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAParticleOverLifeModule::setSizeOverLife_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'MAParticleOverLifeModule::setSizeOverLife_Callback::getSizeX':
              if (size.getSizeX != null) {
                // 日志打印
                print('fluttify-dart-callback: MAParticleOverLifeModule::setSizeOverLife_getSizeX([\'timeFrame\':$args[timeFrame]])');
        
                // 调用回调方法
                size.getSizeX(args['timeFrame']);
              }
              break;
            case 'MAParticleOverLifeModule::setSizeOverLife_Callback::getSizeY':
              if (size.getSizeY != null) {
                // 日志打印
                print('fluttify-dart-callback: MAParticleOverLifeModule::setSizeOverLife_getSizeY([\'timeFrame\':$args[timeFrame]])');
        
                // 调用回调方法
                size.getSizeY(args['timeFrame']);
              }
              break;
            case 'MAParticleOverLifeModule::setSizeOverLife_Callback::getSizeZ':
              if (size.getSizeZ != null) {
                // 日志打印
                print('fluttify-dart-callback: MAParticleOverLifeModule::setSizeOverLife_getSizeZ([\'timeFrame\':$args[timeFrame]])');
        
                // 调用回调方法
                size.getSizeZ(args['timeFrame']);
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setColorOverLife(MAParticleColorGenerate color) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverLifeModule@$refId::setColorOverLife([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAParticleOverLifeModule::setColorOverLife', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAParticleOverLifeModule::setColorOverLife_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'MAParticleOverLifeModule::setColorOverLife_Callback::getColor':
              if (color.getColor != null) {
                // 日志打印
                print('fluttify-dart-callback: MAParticleOverLifeModule::setColorOverLife_getColor([])');
        
                // 调用回调方法
                color.getColor();
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
}