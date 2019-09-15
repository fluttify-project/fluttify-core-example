import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin MAMapViewDelegate on NSObject {
  Future<String> mapViewRegionChanged(MAMapView mapView) {}
  
  Future<String> mapViewRegionWillChangeAnimated(MAMapView mapView, bool animated) {}
  
  Future<String> mapViewRegionDidChangeAnimated(MAMapView mapView, bool animated) {}
  
  Future<String> mapViewMapWillMoveByUser(MAMapView mapView, bool wasUserAction) {}
  
  Future<String> mapViewMapDidMoveByUser(MAMapView mapView, bool wasUserAction) {}
  
  Future<String> mapViewMapWillZoomByUser(MAMapView mapView, bool wasUserAction) {}
  
  Future<String> mapViewMapDidZoomByUser(MAMapView mapView, bool wasUserAction) {}
  
  Future<String> mapViewWillStartLoadingMap(MAMapView mapView) {}
  
  Future<String> mapViewDidFinishLoadingMap(MAMapView mapView) {}
  
  Future<String> mapViewDidFailLoadingMapWithError(MAMapView mapView, NSError error) {}
  
  Future<MAAnnotationView> mapViewViewForAnnotation(MAMapView mapView, MAAnnotation annotation) {}
  
  Future<String> mapViewDidAddAnnotationViews(MAMapView mapView, List views) {}
  
  Future<String> mapViewDidSelectAnnotationView(MAMapView mapView, MAAnnotationView view) {}
  
  Future<String> mapViewDidDeselectAnnotationView(MAMapView mapView, MAAnnotationView view) {}
  
  Future<String> mapViewWillStartLocatingUser(MAMapView mapView) {}
  
  Future<String> mapViewDidStopLocatingUser(MAMapView mapView) {}
  
  Future<String> mapViewDidUpdateUserLocationupdatingLocation(MAMapView mapView, MAUserLocation userLocation, bool updatingLocation) {}
  
  Future<String> mapViewRequireLocationAuth(CLLocationManager locationManager) {}
  
  Future<String> mapViewDidFailToLocateUserWithError(MAMapView mapView, NSError error) {}
  
  Future<String> mapViewAnnotationViewdidChangeDragStatefromOldState(MAMapView mapView, MAAnnotationView view, MAAnnotationViewDragState newState, MAAnnotationViewDragState oldState) {}
  
  Future<MAOverlayRenderer> mapViewRendererForOverlay(MAMapView mapView, MAOverlay overlay) {}
  
  Future<String> mapViewDidAddOverlayRenderers(MAMapView mapView, List overlayRenderers) {}
  
  Future<String> mapViewAnnotationViewcalloutAccessoryControlTapped(MAMapView mapView, MAAnnotationView view, UIControl control) {}
  
  Future<String> mapViewDidAnnotationViewCalloutTapped(MAMapView mapView, MAAnnotationView view) {}
  
  Future<String> mapViewDidAnnotationViewTapped(MAMapView mapView, MAAnnotationView view) {}
  
  Future<String> mapViewDidChangeUserTrackingModeanimated(MAMapView mapView, MAUserTrackingMode mode, bool animated) {}
  
  Future<String> mapViewDidChangeOpenGLESDisabled(MAMapView mapView, bool openGLESDisabled) {}
  
  Future<String> mapViewDidTouchPois(MAMapView mapView, List pois) {}
  
  Future<String> mapViewDidSingleTappedAtCoordinate(MAMapView mapView, CLLocationCoordinate2D coordinate) {}
  
  Future<String> mapViewDidLongPressedAtCoordinate(MAMapView mapView, CLLocationCoordinate2D coordinate) {}
  
  Future<String> mapInitComplete(MAMapView mapView) {}
  
  Future<String> mapViewDidIndoorMapShowed(MAMapView mapView, MAIndoorInfo indoorInfo) {}
  
  Future<String> mapViewDidIndoorMapFloorIndexChanged(MAMapView mapView, MAIndoorInfo indoorInfo) {}
  
  Future<String> mapViewDidIndoorMapHidden(MAMapView mapView, MAIndoorInfo indoorInfo) {}
  
  Future<String> offlineDataWillReload(MAMapView mapView) {}
  
  Future<String> offlineDataDidReload(MAMapView mapView) {}
  
}