import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_maps_AMap_OnMarkerDragListener extends Ref_Android {
  com_amap_api_maps_AMap_OnMarkerDragListener.withRefId(int refId): super.withRefId(refId);

  String onMarkerDragStart(com_amap_api_maps_model_Marker var1);
  
  String onMarkerDrag(com_amap_api_maps_model_Marker var1);
  
  String onMarkerDragEnd(com_amap_api_maps_model_Marker var1);
  
}