import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAGroundOverlay extends MAShape {
  MAGroundOverlay.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<double> get_alpha() async {
    final result = await _channel.invokeMethod("MAGroundOverlay::get_alpha", {'refId': refId});
    return result;
  }
  
  Future<double> get_zoomLevel() async {
    final result = await _channel.invokeMethod("MAGroundOverlay::get_zoomLevel", {'refId': refId});
    return result;
  }
  
  Future<MACoordinateBounds> get_bounds() async {
    final result = await _channel.invokeMethod("MAGroundOverlay::get_bounds", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_alpha(double alpha) async {
    await _channel.invokeMethod('MAGroundOverlay::set_alpha', {'refId': refId, "alpha": alpha});
  }
  

  // 生成方法们
  
}