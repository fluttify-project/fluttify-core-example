import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IPolyline extends com_autonavi_amap_mapcore_interfaces_IOverlay {
  com_autonavi_amap_mapcore_interfaces_IPolyline.withRefId(int refId): super.withRefId(refId);

  String setWidth(double var1);
  
  double getWidth();
  
  String setColor(int var1);
  
  int getColor();
  
  String setPoints(com_amap_api_maps_model_LatLng var1);
  
  List<com_amap_api_maps_model_LatLng> getPoints();
  
  bool isGeodesic();
  
  String setGeodesic(bool var1);
  
  String setDottedLine(bool var1);
  
  bool isDottedLine();
  
  com_amap_api_maps_model_LatLng getNearestLatLng(com_amap_api_maps_model_LatLng var1);
  
  String setTransparency(double var1);
  
  String setCustomTexture(com_amap_api_maps_model_BitmapDescriptor var1);
  
  String setOptions(com_amap_api_maps_model_PolylineOptions var1);
  
  com_amap_api_maps_model_PolylineOptions getOptions();
  
  String setCustemTextureIndex(int var1);
  
  String setShownRatio(double var1);
  
  String setShowRange(double var1, double var2);
  
  double getShownRatio();
  
  String setCustomTextureList(com_amap_api_maps_model_BitmapDescriptor var1);
  
}