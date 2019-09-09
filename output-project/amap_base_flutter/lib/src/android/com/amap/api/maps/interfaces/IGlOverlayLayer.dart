import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_maps_interfaces_IGlOverlayLayer extends Ref_Android {
  com_amap_api_maps_interfaces_IGlOverlayLayer.withRefId(int refId): super.withRefId(refId);

  String updateOption(String var1);
  
  bool removeOverlay(String var1);
  
  String prepareIcon();
  
  int getCurrentParticleNum(String var1);
  
  com_amap_api_maps_model_LatLng getNearestLatLng(com_amap_api_maps_model_PolylineOptions var1, com_amap_api_maps_model_LatLng var2);
  
  bool IsPolygonContainsPoint(com_amap_api_maps_model_PolygonOptions var1, com_amap_api_maps_model_LatLng var2);
  
  String processPolygonHoleOption(com_amap_api_maps_model_PolygonOptions var1);
  
  bool IsCircleContainPoint(com_amap_api_maps_model_CircleOptions var1, com_amap_api_maps_model_LatLng var2);
  
  String processCircleHoleOption(com_amap_api_maps_model_CircleOptions var1);
  
}