import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IPolygon extends com_autonavi_amap_mapcore_interfaces_IOverlay {
  com_autonavi_amap_mapcore_interfaces_IPolygon.withRefId(int refId): super.withRefId(refId);

  String setStrokeWidth(double var1);
  
  double getStrokeWidth();
  
  String setFillColor(int var1);
  
  int getFillColor();
  
  String setStrokeColor(int var1);
  
  String setPoints(com_amap_api_maps_model_LatLng var1);
  
  List<com_amap_api_maps_model_LatLng> getPoints();
  
  int getStrokeColor();
  
  bool contains(com_amap_api_maps_model_LatLng var1);
  
  String setHoleOptions(com_amap_api_maps_model_BaseHoleOptions var1);
  
  List<com_amap_api_maps_model_BaseHoleOptions> getHoleOptions();
  
}