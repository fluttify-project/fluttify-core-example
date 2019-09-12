import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class MAMapViewDelegate extends Ref_iOS {
  MAMapViewDelegate.withRefId(int refId): super.withRefId(refId);

  String mapViewRegionChanged(MAMapView mapView);
  
  String mapViewRegionWillChangeAnimated(MAMapView mapView, bool animated);
  
  String mapViewRegionDidChangeAnimated(MAMapView mapView, bool animated);
  
  String mapViewMapWillMoveByUser(MAMapView mapView, bool wasUserAction);
  
  String mapViewMapDidMoveByUser(MAMapView mapView, bool wasUserAction);
  
  String mapViewMapWillZoomByUser(MAMapView mapView, bool wasUserAction);
  
  String mapViewMapDidZoomByUser(MAMapView mapView, bool wasUserAction);
  
  String mapViewWillStartLoadingMap(MAMapView mapView);
  
  String mapViewDidFinishLoadingMap(MAMapView mapView);
  
  String mapViewDidFailLoadingMapWithError(MAMapView mapView, NSError error);
  
  MAAnnotationView mapViewViewForAnnotation(MAMapView mapView, MAAnnotation annotation);
  
  String mapViewDidAddAnnotationViews(MAMapView mapView, List views);
  
  String mapViewDidSelectAnnotationView(MAMapView mapView, MAAnnotationView view);
  
  String mapViewDidDeselectAnnotationView(MAMapView mapView, MAAnnotationView view);
  
  String mapViewWillStartLocatingUser(MAMapView mapView);
  
  String mapViewDidStopLocatingUser(MAMapView mapView);
  
  String mapViewDidUpdateUserLocationupdatingLocation(MAMapView mapView, MAUserLocation userLocation, bool updatingLocation);
  
  String mapViewRequireLocationAuth(CLLocationManager locationManager);
  
  String mapViewDidFailToLocateUserWithError(MAMapView mapView, NSError error);
  
  String mapViewAnnotationViewdidChangeDragStatefromOldState(MAMapView mapView, MAAnnotationView view, MAAnnotationViewDragState newState, MAAnnotationViewDragState oldState);
  
  MAOverlayRenderer mapViewRendererForOverlay(MAMapView mapView, MAOverlay overlay);
  
  String mapViewDidAddOverlayRenderers(MAMapView mapView, List overlayRenderers);
  
  String mapViewAnnotationViewcalloutAccessoryControlTapped(MAMapView mapView, MAAnnotationView view, UIControl control);
  
  String mapViewDidAnnotationViewCalloutTapped(MAMapView mapView, MAAnnotationView view);
  
  String mapViewDidAnnotationViewTapped(MAMapView mapView, MAAnnotationView view);
  
  String mapViewDidChangeUserTrackingModeanimated(MAMapView mapView, MAUserTrackingMode mode, bool animated);
  
  String mapViewDidChangeOpenGLESDisabled(MAMapView mapView, bool openGLESDisabled);
  
  String mapViewDidTouchPois(MAMapView mapView, List pois);
  
  String mapViewDidSingleTappedAtCoordinate(MAMapView mapView, CLLocationCoordinate2D coordinate);
  
  String mapViewDidLongPressedAtCoordinate(MAMapView mapView, CLLocationCoordinate2D coordinate);
  
  String mapInitComplete(MAMapView mapView);
  
  String mapViewDidIndoorMapShowed(MAMapView mapView, MAIndoorInfo indoorInfo);
  
  String mapViewDidIndoorMapFloorIndexChanged(MAMapView mapView, MAIndoorInfo indoorInfo);
  
  String mapViewDidIndoorMapHidden(MAMapView mapView, MAIndoorInfo indoorInfo);
  
  String offlineDataWillReload(MAMapView mapView);
  
  String offlineDataDidReload(MAMapView mapView);
  
}