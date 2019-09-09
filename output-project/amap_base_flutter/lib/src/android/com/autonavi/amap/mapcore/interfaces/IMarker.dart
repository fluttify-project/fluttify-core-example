import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IMarker extends com_autonavi_amap_mapcore_interfaces_IOverlayImage {
  com_autonavi_amap_mapcore_interfaces_IMarker.withRefId(int refId): super.withRefId(refId);

  String setPeriod(int var1);
  
  int getPeriod();
  
  String setIcons(com_amap_api_maps_model_BitmapDescriptor var1);
  
  List<com_amap_api_maps_model_BitmapDescriptor> getIcons();
  
  String set2Top();
  
  String setFlat(bool var1);
  
  bool isFlat();
  
  String setPerspective(bool var1);
  
  bool isPerspective();
  
  String setTitle(String var1);
  
  String getTitle();
  
  String setIcon(com_amap_api_maps_model_BitmapDescriptor var1);
  
  String setSnippet(String var1);
  
  String getSnippet();
  
  String setDraggable(bool var1);
  
  bool isDraggable();
  
  bool isRemoved();
  
  String showInfoWindow();
  
  String hideInfoWindow();
  
  bool isInfoWindowShown();
  
  String setGeoPoint(com_autonavi_amap_mapcore_IPoint var1);
  
  com_autonavi_amap_mapcore_IPoint getGeoPoint();
  
  com_autonavi_amap_mapcore_interfaces_IMarkerAction getIMarkerAction();
  
  String setPositionByPixels(int var1, int var2);
  
  String setBelowMaskLayer(bool var1);
  
  String setAnimation(com_amap_api_maps_model_animation_Animation var1);
  
  bool startAnimation();
  
  String setAnimationListener(com_amap_api_maps_model_animation_Animation_AnimationListener var1);
  
}