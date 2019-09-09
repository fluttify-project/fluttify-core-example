import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IglModel extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IglModel.withRefId(int refId): super.withRefId(refId);

  String getTitle();
  
  String getSnippet();
  
  String getId();
  
  String setPosition(com_amap_api_maps_model_LatLng var1);
  
  String setRotateAngle(double var1);
  
  double getRotateAngle();
  
  com_amap_api_maps_model_LatLng getPosition();
  
  String setAnimation(com_amap_api_maps_model_animation_Animation var1);
  
  bool startAnimation();
  
  bool remove();
  
  String setVisible(bool var1);
  
  bool isVisible();
  
  String setObject();
  
  com_autonavi_amap_mapcore_interfaces_Object getObject();
  
  String setZoomLimit(double var1);
  
  String destroy();
  
  String setGeoPoint(com_autonavi_amap_mapcore_IPoint var1);
  
  String showInfoWindow();
  
  String setTitle(String var1);
  
  String setSnippet(String var1);
  
  String setModelFixedLength(int var1);
  
}