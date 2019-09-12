import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IOverlayImage extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IOverlayImage.withRefId(int refId): super.withRefId(refId);

  bool remove();
  
  String destroy(bool var1);
  
  String setRotateAngle(double var1);
  
  double getRotateAngle();
  
  String setZIndex(double var1);
  
  double getZIndex();
  
  String getId();
  
  com_amap_api_maps_model_LatLng getPosition();
  
  String setPosition(com_amap_api_maps_model_LatLng var1);
  
  String setVisible(bool var1);
  
  bool isVisible();
  
  bool equalsRemote(com_autonavi_amap_mapcore_interfaces_IOverlayImage var1);
  
  int hashCodeRemote();
  
  String setObject(com_autonavi_amap_mapcore_interfaces_Object var1);
  
  com_autonavi_amap_mapcore_interfaces_Object getObject();
  
  String setAnchor(double var1, double var2);
  
  double getAnchorU();
  
  double getAnchorV();
  
}