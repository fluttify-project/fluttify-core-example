import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMultiTexturePolylineRenderer {
  MAMultiTexturePolylineRenderer.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<List> get_strokeTextureImages() async {
    final result = await _channel.invokeMethod("MAMultiTexturePolylineRenderer::get_strokeTextureImages", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_strokeTextureImages(List strokeTextureImages) async {
    await _channel.invokeMethod('MAMultiTexturePolylineRenderer::set_strokeTextureImages', {'refId': refId, "strokeTextureImages": strokeTextureImages});
  }
  

  // 生成方法们
   Future<bool> loadStrokeTextureImages(List textureImages) async {
    // 日志打印
    print('fluttify-dart: MAMultiTexturePolylineRenderer@$refId::loadStrokeTextureImages([\'textureImages\':$textureImages])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMultiTexturePolylineRenderer::loadStrokeTextureImages', {"textureImages": textureImages, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}