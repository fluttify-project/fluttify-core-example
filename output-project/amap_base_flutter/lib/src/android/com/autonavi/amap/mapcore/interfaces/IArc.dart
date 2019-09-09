import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IArc extends com_autonavi_amap_mapcore_interfaces_IOverlay {
  com_autonavi_amap_mapcore_interfaces_IArc.withRefId(int refId): super.withRefId(refId);

  String setStrokeWidth(double var1);
  
  double getStrokeWidth();
  
  String setStrokeColor(int var1);
  
  int getStrokeColor();
  
}