import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAParticleOverlay extends MAShape with MAAnnotation, MAOverlay {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAParticleOverlayOptions> get_overlayOption() async {
    final result = await _channel
        .invokeMethod("MAParticleOverlay::get_overlayOption", {'refId': refId});
    return result;
  }

  // 生成setters

  // 生成方法们
  static Future<MAParticleOverlay> particleOverlayWithOption(
      MAParticleOverlayOptions option) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverlay::particleOverlayWithOption([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAParticleOverlay::particleOverlayWithOption',
        {"option": option.refId});

    // 接受原生回调

    // 返回值
    return MAParticleOverlay()..refId = result;
  }

  Future<String> updateOverlayOption(
      MAParticleOverlayOptions overlayOption) async {
    // 日志打印
    print('fluttify-dart: MAParticleOverlay@$refId::updateOverlayOption([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAParticleOverlay::updateOverlayOption',
        {"overlayOption": overlayOption.refId, "refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }
}
