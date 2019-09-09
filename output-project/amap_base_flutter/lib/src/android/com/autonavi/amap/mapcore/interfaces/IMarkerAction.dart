import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IMarkerAction extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IMarkerAction.withRefId(int refId): super.withRefId(refId);

  double getAlpha();
  
  String setAlpha(double var1);
  
  int getDisplayLevel();
  
  com_amap_api_maps_model_MarkerOptions getOptions();
  
  bool isClickable();
  
  bool isInfoWindowAutoOverturn();
  
  bool isInfoWindowEnable();
  
  String setInfoWindowEnable(bool var1);
  
  String setMarkerOptions(com_amap_api_maps_model_MarkerOptions var1);
  
  String setAutoOverturnInfoWindow(bool var1);
  
  String setClickable(bool var1);
  
  String setDisplayLevel(int var1);
  
  String setFixingPointEnable(bool var1);
  
  String setPositionNotUpdate(com_amap_api_maps_model_LatLng var1);
  
  String setRotateAngleNotUpdate(double var1);
  
  String setSnippet(String var1);
  
  String setTitle(String var1);
  
}