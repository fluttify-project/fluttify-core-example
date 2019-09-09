import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IGroundOverlay extends com_autonavi_amap_mapcore_interfaces_IOverlay {
  com_autonavi_amap_mapcore_interfaces_IGroundOverlay.withRefId(int refId): super.withRefId(refId);

  String setPosition(com_amap_api_maps_model_LatLng var1);
  
  com_amap_api_maps_model_LatLng getPosition();
  
  String setDimensions(double var1);
  
  String setDimensions(double var1, double var2);
  
  double getWidth();
  
  double getHeight();
  
  String setPositionFromBounds(com_amap_api_maps_model_LatLngBounds var1);
  
  com_amap_api_maps_model_LatLngBounds getBounds();
  
  String setBearing(double var1);
  
  double getBearing();
  
  String setTransparency(double var1);
  
  double getTransparency();
  
  String setImage(com_amap_api_maps_model_BitmapDescriptor var1);
  
}