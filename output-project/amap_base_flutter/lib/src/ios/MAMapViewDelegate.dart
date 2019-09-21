import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin MAMapViewDelegate on NSObject {
  Future<String> mapViewRegionChanged(MAMapView mapView) {}
  
  Future<String> mapViewRegionWillChangeAnimated(MAMapView mapView, bool animated) {}
  
  Future<String> mapViewWillStartLoadingMap(MAMapView mapView) {}
  
  Future<String> mapViewDidFinishLoadingMap(MAMapView mapView) {}
  
  Future<String> mapViewDidFailLoadingMapWithError(MAMapView mapView, NSError error) {}
  
  Future<String> mapViewWillStartLocatingUser(MAMapView mapView) {}
  
  Future<String> mapViewDidStopLocatingUser(MAMapView mapView) {}
  
  Future<String> mapViewRequireLocationAuth(CLLocationManager locationManager) {}
  
  Future<String> mapInitComplete(MAMapView mapView) {}
  
  Future<String> offlineDataWillReload(MAMapView mapView) {}
  
  Future<String> offlineDataDidReload(MAMapView mapView) {}
  
}