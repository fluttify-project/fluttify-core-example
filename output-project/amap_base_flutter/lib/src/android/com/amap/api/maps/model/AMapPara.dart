import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_AMapPara extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_DOTTEDLINE_TYPE_DEFAULT() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.AMapPara::get_DOTTEDLINE_TYPE_DEFAULT", {'refId': refId});
    return result;
  }
  
  Future<int> get_DOTTEDLINE_TYPE_SQUARE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.AMapPara::get_DOTTEDLINE_TYPE_SQUARE", {'refId': refId});
    return result;
  }
  
  Future<int> get_DOTTEDLINE_TYPE_CIRCLE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.AMapPara::get_DOTTEDLINE_TYPE_CIRCLE", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}