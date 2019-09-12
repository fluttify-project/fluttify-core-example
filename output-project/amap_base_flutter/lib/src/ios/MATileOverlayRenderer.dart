import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MATileOverlayRenderer extends MAOverlayRenderer {
  MATileOverlayRenderer.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MATileOverlay> get_tileOverlay() async {
    final result = await _channel.invokeMethod("MATileOverlayRenderer::get_tileOverlay", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
   Future<String> reloadData() async {
    // 日志打印
    print('fluttify-dart: MATileOverlayRenderer@$refId::reloadData([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MATileOverlayRenderer::reloadData', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}