import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_WeightedLatLng extends Ref_Android {
  com_amap_api_maps_model_WeightedLatLng.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<double> get_intensity() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.model.WeightedLatLng::get_intensity", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}