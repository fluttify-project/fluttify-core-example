import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IUiSettings extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IUiSettings.withRefId(int refId): super.withRefId(refId);

  bool isIndoorSwitchEnabled();
  
  String setIndoorSwitchEnabled(bool var1);
  
  String setScaleControlsEnabled(bool var1);
  
  String setZoomControlsEnabled(bool var1);
  
  String setCompassEnabled(bool var1);
  
  String setMyLocationButtonEnabled(bool var1);
  
  String setScrollGesturesEnabled(bool var1);
  
  String setZoomGesturesEnabled(bool var1);
  
  String setTiltGesturesEnabled(bool var1);
  
  String setRotateGesturesEnabled(bool var1);
  
  String setAllGesturesEnabled(bool var1);
  
  String setLogoPosition(int var1);
  
  String setZoomPosition(int var1);
  
  bool isScaleControlsEnabled();
  
  bool isZoomControlsEnabled();
  
  bool isCompassEnabled();
  
  bool isMyLocationButtonEnabled();
  
  bool isScrollGesturesEnabled();
  
  bool isZoomGesturesEnabled();
  
  bool isTiltGesturesEnabled();
  
  bool isRotateGesturesEnabled();
  
  int getLogoPosition();
  
  int getZoomPosition();
  
  String setZoomInByScreenCenter(bool var1);
  
  bool isZoomInByScreenCenter();
  
  String setLogoBottomMargin(int var1);
  
  String setLogoLeftMargin(int var1);
  
  double getLogoMarginRate(int var1);
  
  String setLogoMarginRate(int var1, double var2);
  
  String setGestureScaleByMapCenter(bool var1);
  
  bool isGestureScaleByMapCenter();
  
  String setLogoEnable(bool var1);
  
  String requestRefreshLogo();
  
  bool isLogoEnable();
  
}