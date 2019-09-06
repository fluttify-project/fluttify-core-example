import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAHeatMapTileOverlay extends MATileOverlay {
  MAHeatMapTileOverlay.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_radius() async {
    final result = await _channel.invokeMethod("MAHeatMapTileOverlay::get_radius", {'refId': refId});
    return result;
  }
  
  Future<double> get_opacity() async {
    final result = await _channel.invokeMethod("MAHeatMapTileOverlay::get_opacity", {'refId': refId});
    return result;
  }
  
  Future<bool> get_allowRetinaAdapting() async {
    final result = await _channel.invokeMethod("MAHeatMapTileOverlay::get_allowRetinaAdapting", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_radius(int radius) async {
    await _channel.invokeMethod('MAHeatMapTileOverlay::set_radius', {'refId': refId, "radius": radius});
  }
  
  Future<void> set_opacity(double opacity) async {
    await _channel.invokeMethod('MAHeatMapTileOverlay::set_opacity', {'refId': refId, "opacity": opacity});
  }
  
  Future<void> set_allowRetinaAdapting(bool allowRetinaAdapting) async {
    await _channel.invokeMethod('MAHeatMapTileOverlay::set_allowRetinaAdapting', {'refId': refId, "allowRetinaAdapting": allowRetinaAdapting});
  }
  

  // 生成方法们
  
}