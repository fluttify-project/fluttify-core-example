import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_TileProjection extends Ref_Android {
  com_amap_api_maps_model_TileProjection.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_offsetX() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.TileProjection::get_offsetX", {'refId': refId});
    return result;
  }
  
  Future<int> get_offsetY() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.TileProjection::get_offsetY", {'refId': refId});
    return result;
  }
  
  Future<int> get_minX() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.TileProjection::get_minX", {'refId': refId});
    return result;
  }
  
  Future<int> get_maxX() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.TileProjection::get_maxX", {'refId': refId});
    return result;
  }
  
  Future<int> get_minY() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.TileProjection::get_minY", {'refId': refId});
    return result;
  }
  
  Future<int> get_maxY() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.TileProjection::get_maxY", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}