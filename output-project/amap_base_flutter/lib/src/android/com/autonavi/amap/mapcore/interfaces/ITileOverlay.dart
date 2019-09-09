import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_ITileOverlay extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_ITileOverlay.withRefId(int refId): super.withRefId(refId);

  String remove();
  
  String destroy(bool var1);
  
  String clearTileCache();
  
  String getId();
  
  String setZIndex(double var1);
  
  double getZIndex();
  
  String setVisible(bool var1);
  
  bool isVisible();
  
  bool equalsRemote(com_autonavi_amap_mapcore_interfaces_ITileOverlay var1);
  
  int hashCodeRemote();
  
}