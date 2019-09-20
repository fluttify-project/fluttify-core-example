import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IUiSettings on Object {
  Future<bool> isIndoorSwitchEnabled() {}
  
  Future<String> setIndoorSwitchEnabled(bool var1) {}
  
  Future<String> setScaleControlsEnabled(bool var1) {}
  
  Future<String> setZoomControlsEnabled(bool var1) {}
  
  Future<String> setCompassEnabled(bool var1) {}
  
  Future<String> setMyLocationButtonEnabled(bool var1) {}
  
  Future<String> setScrollGesturesEnabled(bool var1) {}
  
  Future<String> setZoomGesturesEnabled(bool var1) {}
  
  Future<String> setTiltGesturesEnabled(bool var1) {}
  
  Future<String> setRotateGesturesEnabled(bool var1) {}
  
  Future<String> setAllGesturesEnabled(bool var1) {}
  
  Future<String> setLogoPosition(int var1) {}
  
  Future<String> setZoomPosition(int var1) {}
  
  Future<bool> isScaleControlsEnabled() {}
  
  Future<bool> isZoomControlsEnabled() {}
  
  Future<bool> isCompassEnabled() {}
  
  Future<bool> isMyLocationButtonEnabled() {}
  
  Future<bool> isScrollGesturesEnabled() {}
  
  Future<bool> isZoomGesturesEnabled() {}
  
  Future<bool> isTiltGesturesEnabled() {}
  
  Future<bool> isRotateGesturesEnabled() {}
  
  Future<int> getLogoPosition() {}
  
  Future<int> getZoomPosition() {}
  
  Future<String> setZoomInByScreenCenter(bool var1) {}
  
  Future<bool> isZoomInByScreenCenter() {}
  
  Future<String> setLogoBottomMargin(int var1) {}
  
  Future<String> setLogoLeftMargin(int var1) {}
  
  Future<double> getLogoMarginRate(int var1) {}
  
  Future<String> setLogoMarginRate(int var1, double var2) {}
  
  Future<String> setGestureScaleByMapCenter(bool var1) {}
  
  Future<bool> isGestureScaleByMapCenter() {}
  
  Future<String> setLogoEnable(bool var1) {}
  
  Future<String> requestRefreshLogo() {}
  
  Future<bool> isLogoEnable() {}
  
}