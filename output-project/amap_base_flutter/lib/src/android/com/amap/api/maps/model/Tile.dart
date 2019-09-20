import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_Tile extends Ref_Android  {
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
  

  // 生成setters
  

  // 生成方法们
  
}