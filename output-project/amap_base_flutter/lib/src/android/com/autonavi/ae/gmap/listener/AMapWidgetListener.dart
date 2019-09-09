import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_ae_gmap_listener_AMapWidgetListener extends Ref_Android {
  com_autonavi_ae_gmap_listener_AMapWidgetListener.withRefId(int refId): super.withRefId(refId);

  String invalidateScaleView();
  
  String invalidateCompassView();
  
  String invalidateZoomController(double var1);
  
  String setFrontViewVisibility(bool var1);
  
}