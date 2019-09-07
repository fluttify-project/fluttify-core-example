import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAOverlay extends Ref_iOS {
  MAOverlay.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<CLLocationCoordinate2D> get_coordinate() async {
    final result = await _channel.invokeMethod("MAOverlay::get_coordinate", {'refId': refId});
    return result;
  }
  
  Future<MAMapRect> get_boundingMapRect() async {
    final result = await _channel.invokeMethod("MAOverlay::get_boundingMapRect", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}