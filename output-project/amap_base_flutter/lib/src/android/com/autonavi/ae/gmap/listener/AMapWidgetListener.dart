import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_ae_gmap_listener_AMapWidgetListener on Object {
  Future<String> invalidateScaleView() {}
  
  Future<String> invalidateCompassView() {}
  
  Future<String> invalidateZoomController(double var1) {}
  
  Future<String> setFrontViewVisibility(bool var1) {}
  
}