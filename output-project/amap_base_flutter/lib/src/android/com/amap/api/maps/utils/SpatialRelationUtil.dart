import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_utils_SpatialRelationUtil extends Ref_Android {
  com_amap_api_maps_utils_SpatialRelationUtil.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_MIN_POLYLINE_POINT_SIZE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.utils.SpatialRelationUtil::get_MIN_POLYLINE_POINT_SIZE", {'refId': refId});
    return result;
  }
  
  Future<int> get_A_HALF_CIRCLE_DEGREE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.utils.SpatialRelationUtil::get_A_HALF_CIRCLE_DEGREE", {'refId': refId});
    return result;
  }
  
  Future<int> get_A_CIRCLE_DEGREE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.utils.SpatialRelationUtil::get_A_CIRCLE_DEGREE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MIN_OFFSET_DEGREE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.utils.SpatialRelationUtil::get_MIN_OFFSET_DEGREE", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}