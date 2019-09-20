import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_amap_api_maps_AMap_OnMarkerDragListener on Object {
  Future<String> onMarkerDragStart(com_amap_api_maps_model_Marker var1) {}
  
  Future<String> onMarkerDrag(com_amap_api_maps_model_Marker var1) {}
  
  Future<String> onMarkerDragEnd(com_amap_api_maps_model_Marker var1) {}
  
}