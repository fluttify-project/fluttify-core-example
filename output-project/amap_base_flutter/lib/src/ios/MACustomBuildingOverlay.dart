import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MACustomBuildingOverlay extends MAShape {
  MACustomBuildingOverlay.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MACustomBuildingOverlayOption> get_defaultOption() async {
    final result = await _channel.invokeMethod("MACustomBuildingOverlay::get_defaultOption", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
   Future<String> addCustomOption(MACustomBuildingOverlayOption option) async {
    // 日志打印
    print('fluttify-dart: MACustomBuildingOverlay@$refId::addCustomOption([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MACustomBuildingOverlay::addCustomOption', {"option": option.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> removeCustomOption(MACustomBuildingOverlayOption option) async {
    // 日志打印
    print('fluttify-dart: MACustomBuildingOverlay@$refId::removeCustomOption([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MACustomBuildingOverlay::removeCustomOption', {"option": option.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}