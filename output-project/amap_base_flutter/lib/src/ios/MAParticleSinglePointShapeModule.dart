import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAParticleSinglePointShapeModule extends NSObject with MAParticleShapeModule {
  MAParticleSinglePointShapeModule.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<MAParticleSinglePointShapeModule> initWithShapeX(double x, double y, double z, bool isUseRatio) async {
    // 日志打印
    print('fluttify-dart: MAParticleSinglePointShapeModule@$refId::initWithShapeX([\'x\':$x, \'y\':$y, \'z\':$z, \'isUseRatio\':$isUseRatio])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAParticleSinglePointShapeModule::initWithShapeX', {"x": x, "y": y, "z": z, "isUseRatio": isUseRatio, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAParticleSinglePointShapeModule.withRefId(result);
  }
  
}