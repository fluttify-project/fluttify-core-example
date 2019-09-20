import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_animation_GLEmergeAnimation extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<com_amap_api_maps_model_LatLng> get_mStartPoint() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.animation.GLEmergeAnimation::get_mStartPoint", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_mStartPoint(com_amap_api_maps_model_LatLng mStartPoint) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.animation.GLEmergeAnimation::set_mStartPoint', {'refId': refId, "mStartPoint": mStartPoint.refId});
  
  
  }
  

  // 生成方法们
  
}