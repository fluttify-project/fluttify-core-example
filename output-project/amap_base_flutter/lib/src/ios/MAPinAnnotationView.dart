import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAPinAnnotationView extends MAAnnotationView {
  MAPinAnnotationView.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAPinAnnotationColor> get_pinColor() async {
    final result = await _channel.invokeMethod("MAPinAnnotationView::get_pinColor", {'refId': refId});
    return result;
  }
  
  Future<bool> get_animatesDrop() async {
    final result = await _channel.invokeMethod("MAPinAnnotationView::get_animatesDrop", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_pinColor(MAPinAnnotationColor pinColor) async {
    await _channel.invokeMethod('MAPinAnnotationView::set_pinColor', {'refId': refId, "pinColor": pinColor.index});
  }
  
  Future<void> set_animatesDrop(bool animatesDrop) async {
    await _channel.invokeMethod('MAPinAnnotationView::set_animatesDrop', {'refId': refId, "animatesDrop": animatesDrop});
  }
  

  // 生成方法们
  
}