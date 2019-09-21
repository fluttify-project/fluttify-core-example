import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAParticleRectShapeModule extends NSObject with MAParticleShapeModule {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters

  // 生成setters

  // 生成方法们
  Future<MAParticleRectShapeModule> initWithLeft(double left, double top,
      double right, double bottom, bool isUseRatio) async {
    // 日志打印
    print(
        'fluttify-dart: MAParticleRectShapeModule@$refId::initWithLeft([\'left\':$left, \'top\':$top, \'right\':$right, \'bottom\':$bottom, \'isUseRatio\':$isUseRatio])');

    // 调用原生方法
    final result =
        await _channel.invokeMethod('MAParticleRectShapeModule::initWithLeft', {
      "left": left,
      "top": top,
      "right": right,
      "bottom": bottom,
      "isUseRatio": isUseRatio,
      "refId": refId
    });

    // 接受原生回调

    // 返回值
    return MAParticleRectShapeModule()..refId = result;
  }
}
