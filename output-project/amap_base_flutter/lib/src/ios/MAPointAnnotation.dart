import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAPointAnnotation extends MAShape {
  MAPointAnnotation.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<CLLocationCoordinate2D> get_coordinate() async {
    final result = await _channel.invokeMethod("MAPointAnnotation::get_coordinate", {'refId': refId});
    return result;
  }
  
  Future<bool> get_lockedToScreen() async {
    final result = await _channel.invokeMethod("MAPointAnnotation::get_isLockedToScreen", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_coordinate(CLLocationCoordinate2D coordinate) async {
    await _channel.invokeMethod('MAPointAnnotation::set_coordinate', {'refId': refId, "coordinate": coordinate.refId});
  }
  
  Future<void> set_lockedToScreen(bool lockedToScreen) async {
    await _channel.invokeMethod('MAPointAnnotation::set_lockedToScreen', {'refId': refId, "lockedToScreen": lockedToScreen});
  }
  

  // 生成方法们
  
}