import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IMultiPointOverlay extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IMultiPointOverlay.withRefId(int refId): super.withRefId(refId);

  String addItems(com_amap_api_maps_model_MultiPointItem var1);
  
  String addItem(com_amap_api_maps_model_MultiPointItem var1);
  
  String destroy(bool var1);
  
  String setVisible(bool var1);
  
  String draw(com_autonavi_amap_mapcore_MapConfig var1, List<double> var2, List<double> var3);
  
  com_amap_api_maps_model_MultiPointItem onClick(com_autonavi_amap_mapcore_IPoint var1);
  
  String setAnchor(double var1, double var2);
  
  String getId();
  
  String remove(bool var1);
  
}