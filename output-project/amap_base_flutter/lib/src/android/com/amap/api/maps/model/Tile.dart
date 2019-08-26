import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_Tile {
  com_amap_api_maps_model_Tile.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_width() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.Tile::get_width", {'refId': refId});
    return result;
  }
  
  Future<int> get_height() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.Tile::get_height", {'refId': refId});
    return result;
  }
  
  Future<List<int>> get_data() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.Tile::get_data", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  static Future<com_amap_api_maps_model_Tile> obtain(List<int> var2, int var0, int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Tile::obtain([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Tile::obtain', {"var0": var0, "var1": var1, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_Tile.withRefId(result);
  }
  
}