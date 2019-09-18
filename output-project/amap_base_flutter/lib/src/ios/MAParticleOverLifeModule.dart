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
    final result = await _channel.invokeMethod('MAParticleOverLifeModule::setVelocityOverLife', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAParticleOverLifeModule::Callback')
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          // final refId = args['callerRefId'] as int;
          // if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'Callback::MAParticleVelocityGenerate::getX':
              // 日志打印
              print('fluttify-dart-callback: getX([])');
        
                // 调用回调方法
              velocity?.getX();
              break;
            case 'Callback::MAParticleVelocityGenerate::getY':
              // 日志打印
              print('fluttify-dart-callback: getY([])');
        
                // 调用回调方法
              velocity?.getY();
              break;
            case 'Callback::MAParticleVelocityGenerate::getZ':
              // 日志打印
              print('fluttify-dart-callback: getZ([])');
        
                // 调用回调方法
              velocity?.getZ();
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
    MethodChannel('MAParticleOverLifeModule::Callback')
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          // final refId = args['callerRefId'] as int;
          // if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'Callback::MAParticleRotationGenerate::getRotate':
              // 日志打印
              print('fluttify-dart-callback: getRotate([])');
        
                // 调用回调方法
              rotation?.getRotate();
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
    MethodChannel('MAParticleOverLifeModule::Callback')
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          // final refId = args['callerRefId'] as int;
          // if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'Callback::MAParticleSizeGenerate::getSizeX':
              // 日志打印
              print('fluttify-dart-callback: getSizeX([\'timeFrame\':$args[timeFrame]])');
        
                // 调用回调方法
              size?.getSizeX(args['timeFrame']);
              break;
            case 'Callback::MAParticleSizeGenerate::getSizeY':
              // 日志打印
              print('fluttify-dart-callback: getSizeY([\'timeFrame\':$args[timeFrame]])');
        
                // 调用回调方法
              size?.getSizeY(args['timeFrame']);
              break;
            case 'Callback::MAParticleSizeGenerate::getSizeZ':
              // 日志打印
              print('fluttify-dart-callback: getSizeZ([\'timeFrame\':$args[timeFrame]])');
        
                // 调用回调方法
              size?.getSizeZ(args['timeFrame']);
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
    MethodChannel('MAParticleOverLifeModule::Callback')
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          // final refId = args['callerRefId'] as int;
          // if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'Callback::MAParticleColorGenerate::getColor':
              // 日志打印
              print('fluttify-dart-callback: getColor([])');
        
                // 调用回调方法
              color?.getColor();
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
}