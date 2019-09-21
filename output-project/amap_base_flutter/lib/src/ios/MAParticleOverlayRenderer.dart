import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAParticleOverlayRenderer extends MAOverlayRenderer  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAParticleOverlay> get_particleOverlay() async {
    final result = await _channel.invokeMethod("MAParticleOverlayRenderer::get_particleOverlay", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
   Future<MAParticleOverlayRenderer> initWithParticleOverlay(MAParticleOverlay particleOverlay) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverlayRenderer@$refId::initWithParticleOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAParticleOverlayRenderer::initWithParticleOverlay', {"particleOverlay": particleOverlay.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAParticleOverlayRenderer()..refId = result;
  }
  
}