import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IOverlay extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IOverlay.withRefId(int refId): super.withRefId(refId);

  String remove();
  
  String getId();
  
  String setZIndex(double var1);
  
  double getZIndex();
  
  String setVisible(bool var1);
  
  bool isVisible();
  
  bool equalsRemote(com_autonavi_amap_mapcore_interfaces_IOverlay var1);
  
  int hashCodeRemote();
  
  String destroy();
  
  bool isAboveMaskLayer();
  
  String setAboveMaskLayer(bool var1);
  
}