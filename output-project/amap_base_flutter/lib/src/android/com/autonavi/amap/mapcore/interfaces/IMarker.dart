import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IMarker on com.autonavi.amap.mapcore.interfaces.IOverlayImage {
  Future<String> setPeriod(int var1) {}
  
  Future<int> getPeriod() {}
  
  Future<String> setIcons(com_amap_api_maps_model_BitmapDescriptor var1) {}
  
  Future<List<com_amap_api_maps_model_BitmapDescriptor>> getIcons() {}
  
  Future<String> set2Top() {}
  
  Future<String> setFlat(bool var1) {}
  
  Future<bool> isFlat() {}
  
  Future<String> setPerspective(bool var1) {}
  
  Future<bool> isPerspective() {}
  
  Future<String> setTitle(String var1) {}
  
  Future<String> getTitle() {}
  
  Future<String> setIcon(com_amap_api_maps_model_BitmapDescriptor var1) {}
  
  Future<String> setSnippet(String var1) {}
  
  Future<String> getSnippet() {}
  
  Future<String> setDraggable(bool var1) {}
  
  Future<bool> isDraggable() {}
  
  Future<bool> isRemoved() {}
  
  Future<String> showInfoWindow() {}
  
  Future<String> hideInfoWindow() {}
  
  Future<bool> isInfoWindowShown() {}
  
  Future<String> setGeoPoint(com_autonavi_amap_mapcore_IPoint var1) {}
  
  Future<com_autonavi_amap_mapcore_IPoint> getGeoPoint() {}
  
  Future<com_autonavi_amap_mapcore_interfaces_IMarkerAction> getIMarkerAction() {}
  
  Future<String> setPositionByPixels(int var1, int var2) {}
  
  Future<String> setBelowMaskLayer(bool var1) {}
  
  Future<String> setAnimation(com_amap_api_maps_model_animation_Animation var1) {}
  
  Future<bool> startAnimation() {}
  
  Future<String> setAnimationListener(com_amap_api_maps_model_animation_Animation_AnimationListener var1) {}
  
}