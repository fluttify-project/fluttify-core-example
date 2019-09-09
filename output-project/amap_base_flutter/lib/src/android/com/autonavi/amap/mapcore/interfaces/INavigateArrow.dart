import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_INavigateArrow extends com_autonavi_amap_mapcore_interfaces_IOverlay {
  com_autonavi_amap_mapcore_interfaces_INavigateArrow.withRefId(int refId): super.withRefId(refId);

  String setTopColor(int var1);
  
  String setSideColor(int var1);
  
  int getTopColor();
  
  int getSideColor();
  
  String setPoints(com_amap_api_maps_model_LatLng var1);
  
  List<com_amap_api_maps_model_LatLng> getPoints();
  
  String setWidth(double var1);
  
  double getWidth();
  
  String set3DModel(bool var1);
  
  bool is3DModel();
  
}