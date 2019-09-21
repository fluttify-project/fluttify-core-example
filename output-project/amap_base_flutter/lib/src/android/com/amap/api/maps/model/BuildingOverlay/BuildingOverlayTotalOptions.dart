import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_BuildingOverlay_BuildingOverlayTotalOptions extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_isVisible() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions::get_isVisible", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_isVisible(bool isVisible) async {
    await _channel.invokeMethod('com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions::set_isVisible', {'refId': refId, "isVisible": isVisible});
  
  
  }
  

  // 生成方法们
  
}