import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMapView extends UIView  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter/MAMapView');

  // 生成getters
  Future<MAMapViewDelegate> get_delegate() async {
    final result = await _channel.invokeMethod("MAMapView::get_delegate", {'refId': refId});
    return result;
  }
  
  Future<MAMapType> get_mapType() async {
    final result = await _channel.invokeMethod("MAMapView::get_mapType", {'refId': refId});
    return result;
  }
  
  Future<CLLocationCoordinate2D> get_centerCoordinate() async {
    final result = await _channel.invokeMethod("MAMapView::get_centerCoordinate", {'refId': refId});
    return result;
  }
  
  Future<MACoordinateRegion> get_region() async {
    final result = await _channel.invokeMethod("MAMapView::get_region", {'refId': refId});
    return result;
  }
  
  Future<MAMapRect> get_visibleMapRect() async {
    final result = await _channel.invokeMethod("MAMapView::get_visibleMapRect", {'refId': refId});
    return result;
  }
  
  Future<MACoordinateRegion> get_limitRegion() async {
    final result = await _channel.invokeMethod("MAMapView::get_limitRegion", {'refId': refId});
    return result;
  }
  
  Future<MAMapRect> get_limitMapRect() async {
    final result = await _channel.invokeMethod("MAMapView::get_limitMapRect", {'refId': refId});
    return result;
  }
  
  Future<double> get_zoomLevel() async {
    final result = await _channel.invokeMethod("MAMapView::get_zoomLevel", {'refId': refId});
    return result;
  }
  
  Future<double> get_minZoomLevel() async {
    final result = await _channel.invokeMethod("MAMapView::get_minZoomLevel", {'refId': refId});
    return result;
  }
  
  Future<double> get_maxZoomLevel() async {
    final result = await _channel.invokeMethod("MAMapView::get_maxZoomLevel", {'refId': refId});
    return result;
  }
  
  Future<double> get_rotationDegree() async {
    final result = await _channel.invokeMethod("MAMapView::get_rotationDegree", {'refId': refId});
    return result;
  }
  
  Future<double> get_cameraDegree() async {
    final result = await _channel.invokeMethod("MAMapView::get_cameraDegree", {'refId': refId});
    return result;
  }
  
  Future<bool> get_zoomingInPivotsAroundAnchorPoint() async {
    final result = await _channel.invokeMethod("MAMapView::get_zoomingInPivotsAroundAnchorPoint", {'refId': refId});
    return result;
  }
  
  Future<bool> get_zoomEnabled() async {
    final result = await _channel.invokeMethod("MAMapView::get_isZoomEnabled", {'refId': refId});
    return result;
  }
  
  Future<bool> get_scrollEnabled() async {
    final result = await _channel.invokeMethod("MAMapView::get_isScrollEnabled", {'refId': refId});
    return result;
  }
  
  Future<bool> get_rotateEnabled() async {
    final result = await _channel.invokeMethod("MAMapView::get_isRotateEnabled", {'refId': refId});
    return result;
  }
  
  Future<bool> get_rotateCameraEnabled() async {
    final result = await _channel.invokeMethod("MAMapView::get_isRotateCameraEnabled", {'refId': refId});
    return result;
  }
  
  Future<bool> get_skyModelEnable() async {
    final result = await _channel.invokeMethod("MAMapView::get_isSkyModelEnabled", {'refId': refId});
    return result;
  }
  
  Future<bool> get_showsBuildings() async {
    final result = await _channel.invokeMethod("MAMapView::get_isShowsBuildings", {'refId': refId});
    return result;
  }
  
  Future<bool> get_showsLabels() async {
    final result = await _channel.invokeMethod("MAMapView::get_isShowsLabels", {'refId': refId});
    return result;
  }
  
  Future<bool> get_showTraffic() async {
    final result = await _channel.invokeMethod("MAMapView::get_isShowTraffic", {'refId': refId});
    return result;
  }
  
  Future<double> get_trafficRatio() async {
    final result = await _channel.invokeMethod("MAMapView::get_trafficRatio", {'refId': refId});
    return result;
  }
  
  Future<bool> get_touchPOIEnabled() async {
    final result = await _channel.invokeMethod("MAMapView::get_touchPOIEnabled", {'refId': refId});
    return result;
  }
  
  Future<bool> get_showsCompass() async {
    final result = await _channel.invokeMethod("MAMapView::get_showsCompass", {'refId': refId});
    return result;
  }
  
  Future<CGPoint> get_compassOrigin() async {
    final result = await _channel.invokeMethod("MAMapView::get_compassOrigin", {'refId': refId});
    return result;
  }
  
  Future<bool> get_showsScale() async {
    final result = await _channel.invokeMethod("MAMapView::get_showsScale", {'refId': refId});
    return result;
  }
  
  Future<CGPoint> get_scaleOrigin() async {
    final result = await _channel.invokeMethod("MAMapView::get_scaleOrigin", {'refId': refId});
    return result;
  }
  
  Future<CGPoint> get_logoCenter() async {
    final result = await _channel.invokeMethod("MAMapView::get_logoCenter", {'refId': refId});
    return result;
  }
  
  Future<double> get_metersPerPointForCurrentZoom() async {
    final result = await _channel.invokeMethod("MAMapView::get_metersPerPointForCurrentZoom", {'refId': refId});
    return result;
  }
  
  Future<bool> get_isAbroad() async {
    final result = await _channel.invokeMethod("MAMapView::get_isAbroad", {'refId': refId});
    return result;
  }
  
  Future<int> get_maxRenderFrame() async {
    final result = await _channel.invokeMethod("MAMapView::get_maxRenderFrame", {'refId': refId});
    return result;
  }
  
  Future<bool> get_isAllowDecreaseFrame() async {
    final result = await _channel.invokeMethod("MAMapView::get_isAllowDecreaseFrame", {'refId': refId});
    return result;
  }
  
  Future<bool> get_openGLESDisabled() async {
    final result = await _channel.invokeMethod("MAMapView::get_openGLESDisabled", {'refId': refId});
    return result;
  }
  
  Future<CGPoint> get_screenAnchor() async {
    final result = await _channel.invokeMethod("MAMapView::get_screenAnchor", {'refId': refId});
    return result;
  }
  
  Future<CGRect> get_annotationVisibleRect() async {
    final result = await _channel.invokeMethod("MAMapView::get_annotationVisibleRect", {'refId': refId});
    return result;
  }
  
  Future<bool> get_allowsAnnotationViewSorting() async {
    final result = await _channel.invokeMethod("MAMapView::get_allowsAnnotationViewSorting", {'refId': refId});
    return result;
  }
  
  Future<bool> get_showsUserLocation() async {
    final result = await _channel.invokeMethod("MAMapView::get_showsUserLocation", {'refId': refId});
    return result;
  }
  
  Future<MAUserLocation> get_userLocation() async {
    final result = await _channel.invokeMethod("MAMapView::get_userLocation", {'refId': refId});
    return result;
  }
  
  Future<bool> get_customizeUserLocationAccuracyCircleRepresentation() async {
    final result = await _channel.invokeMethod("MAMapView::get_customizeUserLocationAccuracyCircleRepresentation", {'refId': refId});
    return result;
  }
  
  Future<MACircle> get_userLocationAccuracyCircle() async {
    final result = await _channel.invokeMethod("MAMapView::get_userLocationAccuracyCircle", {'refId': refId});
    return result;
  }
  
  Future<MAUserTrackingMode> get_userTrackingMode() async {
    final result = await _channel.invokeMethod("MAMapView::get_userTrackingMode", {'refId': refId});
    return result;
  }
  
  Future<bool> get_userLocationVisible() async {
    final result = await _channel.invokeMethod("MAMapView::get_isUserLocationVisible", {'refId': refId});
    return result;
  }
  
  Future<bool> get_pausesLocationUpdatesAutomatically() async {
    final result = await _channel.invokeMethod("MAMapView::get_pausesLocationUpdatesAutomatically", {'refId': refId});
    return result;
  }
  
  Future<bool> get_allowsBackgroundLocationUpdates() async {
    final result = await _channel.invokeMethod("MAMapView::get_allowsBackgroundLocationUpdates", {'refId': refId});
    return result;
  }
  
  Future<bool> get_showsIndoorMap() async {
    final result = await _channel.invokeMethod("MAMapView::get_isShowsIndoorMap", {'refId': refId});
    return result;
  }
  
  Future<bool> get_showsIndoorMapControl() async {
    final result = await _channel.invokeMethod("MAMapView::get_isShowsIndoorMapControl", {'refId': refId});
    return result;
  }
  
  Future<bool> get_customMapStyleEnabled() async {
    final result = await _channel.invokeMethod("MAMapView::get_customMapStyleEnabled", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_delegate(MAMapViewDelegate delegate) async {
    await _channel.invokeMethod('MAMapView::set_delegate', {'refId': refId, "delegate": ""});
  
    MethodChannel('MAMapViewDelegate::delegate_Callback' + refId.toString())
      .setMethodCallHandler((methodCall) async {
        final args = methodCall.arguments as Map;
        final refId = args['callerRefId'] as int;
        if (refId != this.refId) return;
  
        switch (methodCall.method) {
          case 'MAMapView::delegate_Callback::mapViewRegionChanged':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapViewRegionChanged([])');
        
              // 调用回调方法
            delegate?.mapViewRegionChanged(MAMapView()..refId = (args['mapView']));
            break;
          case 'MAMapView::delegate_Callback::mapViewRegionWillChangeAnimated':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'animated\':$args[animated]])');
        
              // 调用回调方法
            delegate?.mapViewRegionWillChangeAnimated(MAMapView()..refId = (args['mapView']), args['animated']);
            break;
          case 'MAMapView::delegate_Callback::mapViewRegionDidChangeAnimated':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'animated\':$args[animated]])');
        
              // 调用回调方法
            delegate?.mapViewRegionDidChangeAnimated(MAMapView()..refId = (args['mapView']), args['animated']);
            break;
          case 'MAMapView::delegate_Callback::mapViewMapWillMoveByUser':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'wasUserAction\':$args[wasUserAction]])');
        
              // 调用回调方法
            delegate?.mapViewMapWillMoveByUser(MAMapView()..refId = (args['mapView']), args['wasUserAction']);
            break;
          case 'MAMapView::delegate_Callback::mapViewMapDidMoveByUser':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'wasUserAction\':$args[wasUserAction]])');
        
              // 调用回调方法
            delegate?.mapViewMapDidMoveByUser(MAMapView()..refId = (args['mapView']), args['wasUserAction']);
            break;
          case 'MAMapView::delegate_Callback::mapViewMapWillZoomByUser':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'wasUserAction\':$args[wasUserAction]])');
        
              // 调用回调方法
            delegate?.mapViewMapWillZoomByUser(MAMapView()..refId = (args['mapView']), args['wasUserAction']);
            break;
          case 'MAMapView::delegate_Callback::mapViewMapDidZoomByUser':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'wasUserAction\':$args[wasUserAction]])');
        
              // 调用回调方法
            delegate?.mapViewMapDidZoomByUser(MAMapView()..refId = (args['mapView']), args['wasUserAction']);
            break;
          case 'MAMapView::delegate_Callback::mapViewWillStartLoadingMap':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapViewWillStartLoadingMap([])');
        
              // 调用回调方法
            delegate?.mapViewWillStartLoadingMap(MAMapView()..refId = (args['mapView']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidFinishLoadingMap':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapViewDidFinishLoadingMap([])');
        
              // 调用回调方法
            delegate?.mapViewDidFinishLoadingMap(MAMapView()..refId = (args['mapView']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidFailLoadingMapWithError':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapViewDidFailLoadingMap([])');
        
              // 调用回调方法
            delegate?.mapViewDidFailLoadingMapWithError(MAMapView()..refId = (args['mapView']), NSError()..refId = (args['error']));
            break;
          case 'MAMapView::delegate_Callback::mapViewViewForAnnotation':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewViewForAnnotation(MAMapView()..refId = (args['mapView']), MAAnnotation_Ref()..refId = (args['annotation']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidAddAnnotationViews':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'views\':$args[views]])');
        
              // 调用回调方法
            delegate?.mapViewDidAddAnnotationViews(MAMapView()..refId = (args['mapView']), args['views']);
            break;
          case 'MAMapView::delegate_Callback::mapViewDidSelectAnnotationView':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewDidSelectAnnotationView(MAMapView()..refId = (args['mapView']), MAAnnotationView()..refId = (args['view']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidDeselectAnnotationView':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewDidDeselectAnnotationView(MAMapView()..refId = (args['mapView']), MAAnnotationView()..refId = (args['view']));
            break;
          case 'MAMapView::delegate_Callback::mapViewWillStartLocatingUser':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapViewWillStartLocatingUser([])');
        
              // 调用回调方法
            delegate?.mapViewWillStartLocatingUser(MAMapView()..refId = (args['mapView']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidStopLocatingUser':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapViewDidStopLocatingUser([])');
        
              // 调用回调方法
            delegate?.mapViewDidStopLocatingUser(MAMapView()..refId = (args['mapView']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidUpdateUserLocationupdatingLocation':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'updatingLocation\':$args[updatingLocation]])');
        
              // 调用回调方法
            delegate?.mapViewDidUpdateUserLocationupdatingLocation(MAMapView()..refId = (args['mapView']), MAUserLocation()..refId = (args['userLocation']), args['updatingLocation']);
            break;
          case 'MAMapView::delegate_Callback::mapViewRequireLocationAuth':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapViewRequireLocationAuth([])');
        
              // 调用回调方法
            delegate?.mapViewRequireLocationAuth(CLLocationManager()..refId = (args['locationManager']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidFailToLocateUserWithError':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewDidFailToLocateUserWithError(MAMapView()..refId = (args['mapView']), NSError()..refId = (args['error']));
            break;
          case 'MAMapView::delegate_Callback::mapViewAnnotationViewdidChangeDragStatefromOldState':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewAnnotationViewdidChangeDragStatefromOldState(MAMapView()..refId = (args['mapView']), MAAnnotationView()..refId = (args['view']), MAAnnotationViewDragState.values[(args['newState'])], MAAnnotationViewDragState.values[(args['oldState'])]);
            break;
          case 'MAMapView::delegate_Callback::mapViewRendererForOverlay':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewRendererForOverlay(MAMapView()..refId = (args['mapView']), MAOverlay_Ref()..refId = (args['overlay']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidAddOverlayRenderers':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'overlayRenderers\':$args[overlayRenderers]])');
        
              // 调用回调方法
            delegate?.mapViewDidAddOverlayRenderers(MAMapView()..refId = (args['mapView']), args['overlayRenderers']);
            break;
          case 'MAMapView::delegate_Callback::mapViewAnnotationViewcalloutAccessoryControlTapped':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewAnnotationViewcalloutAccessoryControlTapped(MAMapView()..refId = (args['mapView']), MAAnnotationView()..refId = (args['view']), UIControl()..refId = (args['control']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidAnnotationViewCalloutTapped':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewDidAnnotationViewCalloutTapped(MAMapView()..refId = (args['mapView']), MAAnnotationView()..refId = (args['view']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidAnnotationViewTapped':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewDidAnnotationViewTapped(MAMapView()..refId = (args['mapView']), MAAnnotationView()..refId = (args['view']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidChangeUserTrackingModeanimated':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'animated\':$args[animated]])');
        
              // 调用回调方法
            delegate?.mapViewDidChangeUserTrackingModeanimated(MAMapView()..refId = (args['mapView']), MAUserTrackingMode.values[(args['mode'])], args['animated']);
            break;
          case 'MAMapView::delegate_Callback::mapViewDidChangeOpenGLESDisabled':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'openGLESDisabled\':$args[openGLESDisabled]])');
        
              // 调用回调方法
            delegate?.mapViewDidChangeOpenGLESDisabled(MAMapView()..refId = (args['mapView']), args['openGLESDisabled']);
            break;
          case 'MAMapView::delegate_Callback::mapViewDidTouchPois':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([\'pois\':$args[pois]])');
        
              // 调用回调方法
            delegate?.mapViewDidTouchPois(MAMapView()..refId = (args['mapView']), args['pois']);
            break;
          case 'MAMapView::delegate_Callback::mapViewDidSingleTappedAtCoordinate':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewDidSingleTappedAtCoordinate(MAMapView()..refId = (args['mapView']), CLLocationCoordinate2D()..refId = (args['coordinate']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidLongPressedAtCoordinate':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewDidLongPressedAtCoordinate(MAMapView()..refId = (args['mapView']), CLLocationCoordinate2D()..refId = (args['coordinate']));
            break;
          case 'MAMapView::delegate_Callback::mapInitComplete':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapInitComplete([])');
        
              // 调用回调方法
            delegate?.mapInitComplete(MAMapView()..refId = (args['mapView']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidIndoorMapShowed':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewDidIndoorMapShowed(MAMapView()..refId = (args['mapView']), MAIndoorInfo()..refId = (args['indoorInfo']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidIndoorMapFloorIndexChanged':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewDidIndoorMapFloorIndexChanged(MAMapView()..refId = (args['mapView']), MAIndoorInfo()..refId = (args['indoorInfo']));
            break;
          case 'MAMapView::delegate_Callback::mapViewDidIndoorMapHidden':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_mapView([])');
        
              // 调用回调方法
            delegate?.mapViewDidIndoorMapHidden(MAMapView()..refId = (args['mapView']), MAIndoorInfo()..refId = (args['indoorInfo']));
            break;
          case 'MAMapView::delegate_Callback::offlineDataWillReload':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_offlineDataWillReload([])');
        
              // 调用回调方法
            delegate?.offlineDataWillReload(MAMapView()..refId = (args['mapView']));
            break;
          case 'MAMapView::delegate_Callback::offlineDataDidReload':
            // 日志打印
            print('fluttify-dart-callback: MAMapView::delegate_offlineDataDidReload([])');
        
              // 调用回调方法
            delegate?.offlineDataDidReload(MAMapView()..refId = (args['mapView']));
            break;
          default:
            break;
        }
      });
  }
  
  Future<void> set_mapType(MAMapType mapType) async {
    await _channel.invokeMethod('MAMapView::set_mapType', {'refId': refId, "mapType": mapType.index});
  
  
  }
  
  Future<void> set_centerCoordinate(CLLocationCoordinate2D centerCoordinate) async {
    await _channel.invokeMethod('MAMapView::set_centerCoordinate', {'refId': refId, "centerCoordinate": centerCoordinate.refId});
  
  
  }
  
  Future<void> set_region(MACoordinateRegion region) async {
    await _channel.invokeMethod('MAMapView::set_region', {'refId': refId, "region": region.refId});
  
  
  }
  
  Future<void> set_visibleMapRect(MAMapRect visibleMapRect) async {
    await _channel.invokeMethod('MAMapView::set_visibleMapRect', {'refId': refId, "visibleMapRect": visibleMapRect.refId});
  
  
  }
  
  Future<void> set_limitRegion(MACoordinateRegion limitRegion) async {
    await _channel.invokeMethod('MAMapView::set_limitRegion', {'refId': refId, "limitRegion": limitRegion.refId});
  
  
  }
  
  Future<void> set_limitMapRect(MAMapRect limitMapRect) async {
    await _channel.invokeMethod('MAMapView::set_limitMapRect', {'refId': refId, "limitMapRect": limitMapRect.refId});
  
  
  }
  
  Future<void> set_zoomLevel(double zoomLevel) async {
    await _channel.invokeMethod('MAMapView::set_zoomLevel', {'refId': refId, "zoomLevel": zoomLevel});
  
  
  }
  
  Future<void> set_minZoomLevel(double minZoomLevel) async {
    await _channel.invokeMethod('MAMapView::set_minZoomLevel', {'refId': refId, "minZoomLevel": minZoomLevel});
  
  
  }
  
  Future<void> set_maxZoomLevel(double maxZoomLevel) async {
    await _channel.invokeMethod('MAMapView::set_maxZoomLevel', {'refId': refId, "maxZoomLevel": maxZoomLevel});
  
  
  }
  
  Future<void> set_rotationDegree(double rotationDegree) async {
    await _channel.invokeMethod('MAMapView::set_rotationDegree', {'refId': refId, "rotationDegree": rotationDegree});
  
  
  }
  
  Future<void> set_cameraDegree(double cameraDegree) async {
    await _channel.invokeMethod('MAMapView::set_cameraDegree', {'refId': refId, "cameraDegree": cameraDegree});
  
  
  }
  
  Future<void> set_zoomingInPivotsAroundAnchorPoint(bool zoomingInPivotsAroundAnchorPoint) async {
    await _channel.invokeMethod('MAMapView::set_zoomingInPivotsAroundAnchorPoint', {'refId': refId, "zoomingInPivotsAroundAnchorPoint": zoomingInPivotsAroundAnchorPoint});
  
  
  }
  
  Future<void> set_zoomEnabled(bool zoomEnabled) async {
    await _channel.invokeMethod('MAMapView::set_zoomEnabled', {'refId': refId, "zoomEnabled": zoomEnabled});
  
  
  }
  
  Future<void> set_scrollEnabled(bool scrollEnabled) async {
    await _channel.invokeMethod('MAMapView::set_scrollEnabled', {'refId': refId, "scrollEnabled": scrollEnabled});
  
  
  }
  
  Future<void> set_rotateEnabled(bool rotateEnabled) async {
    await _channel.invokeMethod('MAMapView::set_rotateEnabled', {'refId': refId, "rotateEnabled": rotateEnabled});
  
  
  }
  
  Future<void> set_rotateCameraEnabled(bool rotateCameraEnabled) async {
    await _channel.invokeMethod('MAMapView::set_rotateCameraEnabled', {'refId': refId, "rotateCameraEnabled": rotateCameraEnabled});
  
  
  }
  
  Future<void> set_skyModelEnable(bool skyModelEnable) async {
    await _channel.invokeMethod('MAMapView::set_skyModelEnable', {'refId': refId, "skyModelEnable": skyModelEnable});
  
  
  }
  
  Future<void> set_showsBuildings(bool showsBuildings) async {
    await _channel.invokeMethod('MAMapView::set_showsBuildings', {'refId': refId, "showsBuildings": showsBuildings});
  
  
  }
  
  Future<void> set_showsLabels(bool showsLabels) async {
    await _channel.invokeMethod('MAMapView::set_showsLabels', {'refId': refId, "showsLabels": showsLabels});
  
  
  }
  
  Future<void> set_showTraffic(bool showTraffic) async {
    await _channel.invokeMethod('MAMapView::set_showTraffic', {'refId': refId, "showTraffic": showTraffic});
  
  
  }
  
  Future<void> set_trafficRatio(double trafficRatio) async {
    await _channel.invokeMethod('MAMapView::set_trafficRatio', {'refId': refId, "trafficRatio": trafficRatio});
  
  
  }
  
  Future<void> set_touchPOIEnabled(bool touchPOIEnabled) async {
    await _channel.invokeMethod('MAMapView::set_touchPOIEnabled', {'refId': refId, "touchPOIEnabled": touchPOIEnabled});
  
  
  }
  
  Future<void> set_showsCompass(bool showsCompass) async {
    await _channel.invokeMethod('MAMapView::set_showsCompass', {'refId': refId, "showsCompass": showsCompass});
  
  
  }
  
  Future<void> set_compassOrigin(CGPoint compassOrigin) async {
    await _channel.invokeMethod('MAMapView::set_compassOrigin', {'refId': refId, "compassOrigin": compassOrigin.refId});
  
  
  }
  
  Future<void> set_showsScale(bool showsScale) async {
    await _channel.invokeMethod('MAMapView::set_showsScale', {'refId': refId, "showsScale": showsScale});
  
  
  }
  
  Future<void> set_scaleOrigin(CGPoint scaleOrigin) async {
    await _channel.invokeMethod('MAMapView::set_scaleOrigin', {'refId': refId, "scaleOrigin": scaleOrigin.refId});
  
  
  }
  
  Future<void> set_logoCenter(CGPoint logoCenter) async {
    await _channel.invokeMethod('MAMapView::set_logoCenter', {'refId': refId, "logoCenter": logoCenter.refId});
  
  
  }
  
  Future<void> set_maxRenderFrame(int maxRenderFrame) async {
    await _channel.invokeMethod('MAMapView::set_maxRenderFrame', {'refId': refId, "maxRenderFrame": maxRenderFrame});
  
  
  }
  
  Future<void> set_isAllowDecreaseFrame(bool isAllowDecreaseFrame) async {
    await _channel.invokeMethod('MAMapView::set_isAllowDecreaseFrame', {'refId': refId, "isAllowDecreaseFrame": isAllowDecreaseFrame});
  
  
  }
  
  Future<void> set_openGLESDisabled(bool openGLESDisabled) async {
    await _channel.invokeMethod('MAMapView::set_openGLESDisabled', {'refId': refId, "openGLESDisabled": openGLESDisabled});
  
  
  }
  
  Future<void> set_screenAnchor(CGPoint screenAnchor) async {
    await _channel.invokeMethod('MAMapView::set_screenAnchor', {'refId': refId, "screenAnchor": screenAnchor.refId});
  
  
  }
  
  Future<void> set_allowsAnnotationViewSorting(bool allowsAnnotationViewSorting) async {
    await _channel.invokeMethod('MAMapView::set_allowsAnnotationViewSorting', {'refId': refId, "allowsAnnotationViewSorting": allowsAnnotationViewSorting});
  
  
  }
  
  Future<void> set_showsUserLocation(bool showsUserLocation) async {
    await _channel.invokeMethod('MAMapView::set_showsUserLocation', {'refId': refId, "showsUserLocation": showsUserLocation});
  
  
  }
  
  Future<void> set_customizeUserLocationAccuracyCircleRepresentation(bool customizeUserLocationAccuracyCircleRepresentation) async {
    await _channel.invokeMethod('MAMapView::set_customizeUserLocationAccuracyCircleRepresentation', {'refId': refId, "customizeUserLocationAccuracyCircleRepresentation": customizeUserLocationAccuracyCircleRepresentation});
  
  
  }
  
  Future<void> set_userTrackingMode(MAUserTrackingMode userTrackingMode) async {
    await _channel.invokeMethod('MAMapView::set_userTrackingMode', {'refId': refId, "userTrackingMode": userTrackingMode.index});
  
  
  }
  
  Future<void> set_pausesLocationUpdatesAutomatically(bool pausesLocationUpdatesAutomatically) async {
    await _channel.invokeMethod('MAMapView::set_pausesLocationUpdatesAutomatically', {'refId': refId, "pausesLocationUpdatesAutomatically": pausesLocationUpdatesAutomatically});
  
  
  }
  
  Future<void> set_allowsBackgroundLocationUpdates(bool allowsBackgroundLocationUpdates) async {
    await _channel.invokeMethod('MAMapView::set_allowsBackgroundLocationUpdates', {'refId': refId, "allowsBackgroundLocationUpdates": allowsBackgroundLocationUpdates});
  
  
  }
  
  Future<void> set_showsIndoorMap(bool showsIndoorMap) async {
    await _channel.invokeMethod('MAMapView::set_showsIndoorMap', {'refId': refId, "showsIndoorMap": showsIndoorMap});
  
  
  }
  
  Future<void> set_showsIndoorMapControl(bool showsIndoorMapControl) async {
    await _channel.invokeMethod('MAMapView::set_showsIndoorMapControl', {'refId': refId, "showsIndoorMapControl": showsIndoorMapControl});
  
  
  }
  
  Future<void> set_customMapStyleEnabled(bool customMapStyleEnabled) async {
    await _channel.invokeMethod('MAMapView::set_customMapStyleEnabled', {'refId': refId, "customMapStyleEnabled": customMapStyleEnabled});
  
  
  }
  

  // 生成方法们
   Future<String> setRegion(MACoordinateRegion region, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setRegion([\'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setRegion', {"region": region.refId, "animated": animated, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<MACoordinateRegion> regionThatFits(MACoordinateRegion region) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::regionThatFits([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::regionThatFits', {"region": region.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MACoordinateRegion()..refId = result;
  }
  
   Future<String> setVisibleMapRect(MAMapRect mapRect, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setVisibleMapRect([\'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setVisibleMapRect', {"mapRect": mapRect.refId, "animated": animated, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<MAMapRect> mapRectThatFits(MAMapRect mapRect) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::mapRectThatFits([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::mapRectThatFits', {"mapRect": mapRect.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAMapRect()..refId = result;
  }
  
   Future<String> setCenterCoordinate(CLLocationCoordinate2D coordinate, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setCenterCoordinate([\'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setCenterCoordinate', {"coordinate": coordinate.refId, "animated": animated, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setZoomLevel(double zoomLevel, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setZoomLevel([\'zoomLevel\':$zoomLevel, \'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setZoomLevel', {"zoomLevel": zoomLevel, "animated": animated, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRotationDegree(double rotationDegree, bool animated, double duration) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setRotationDegree([\'rotationDegree\':$rotationDegree, \'animated\':$animated, \'duration\':$duration])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setRotationDegree', {"rotationDegree": rotationDegree, "animated": animated, "duration": duration, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCameraDegree(double cameraDegree, bool animated, double duration) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setCameraDegree([\'cameraDegree\':$cameraDegree, \'animated\':$animated, \'duration\':$duration])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setCameraDegree', {"cameraDegree": cameraDegree, "animated": animated, "duration": duration, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<MAMapStatus> getMapStatus() async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::getMapStatus([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::getMapStatus', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAMapStatus()..refId = result;
  }
  
   Future<String> setMapStatus(MAMapStatus status, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setMapStatus([\'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setMapStatus', {"status": status.refId, "animated": animated, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> metersPerPointForZoomLevel(double zoomLevel) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::metersPerPointForZoomLevel([\'zoomLevel\':$zoomLevel])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::metersPerPointForZoomLevel', {"zoomLevel": zoomLevel, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<CGPoint> convertCoordinate(CLLocationCoordinate2D coordinate, UIView view) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::convertCoordinate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::convertCoordinate', {"coordinate": coordinate.refId, "view": view.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return CGPoint()..refId = result;
  }
  
   Future<CLLocationCoordinate2D> convertPoint(CGPoint point, UIView view) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::convertPoint([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::convertPoint', {"point": point.refId, "view": view.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return CLLocationCoordinate2D()..refId = result;
  }
  
   Future<CGRect> convertRegion(MACoordinateRegion region, UIView view) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::convertRegion([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::convertRegion', {"region": region.refId, "view": view.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return CGRect()..refId = result;
  }
  
   Future<MACoordinateRegion> convertRect(CGRect rect, UIView view) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::convertRect([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::convertRect', {"rect": rect.refId, "view": view.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MACoordinateRegion()..refId = result;
  }
  
   Future<String> reloadMap() async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::reloadMap([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::reloadMap', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> clearDisk() async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::clearDisk([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::clearDisk', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> reloadInternalTexture() async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::reloadInternalTexture([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::reloadInternalTexture', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> mapContentApprovalNumber() async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::mapContentApprovalNumber([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::mapContentApprovalNumber', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> satelliteImageApprovalNumber() async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::satelliteImageApprovalNumber([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::satelliteImageApprovalNumber', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> forceRefresh() async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::forceRefresh([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::forceRefresh', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> addAnnotation(MAAnnotation annotation) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::addAnnotation([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::addAnnotation', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAMapView::addAnnotation_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'MAMapView::addAnnotation_Callback::setCoordinate':
              // 日志打印
              print('fluttify-dart-callback: MAMapView::addAnnotation_setCoordinate([])');
        
                // 调用回调方法
              annotation?.setCoordinate(CLLocationCoordinate2D()..refId = (args['newCoordinate']));
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> removeAnnotation(MAAnnotation annotation) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::removeAnnotation([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::removeAnnotation', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAMapView::removeAnnotation_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'MAMapView::removeAnnotation_Callback::setCoordinate':
              // 日志打印
              print('fluttify-dart-callback: MAMapView::removeAnnotation_setCoordinate([])');
        
                // 调用回调方法
              annotation?.setCoordinate(CLLocationCoordinate2D()..refId = (args['newCoordinate']));
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<MAAnnotationView> viewForAnnotation(MAAnnotation annotation) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::viewForAnnotation([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::viewForAnnotation', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAMapView::viewForAnnotation_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'MAMapView::viewForAnnotation_Callback::setCoordinate':
              // 日志打印
              print('fluttify-dart-callback: MAMapView::viewForAnnotation_setCoordinate([])');
        
                // 调用回调方法
              annotation?.setCoordinate(CLLocationCoordinate2D()..refId = (args['newCoordinate']));
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return MAAnnotationView()..refId = result;
  }
  
   Future<MAAnnotationView> dequeueReusableAnnotationViewWithIdentifier(String identifier) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::dequeueReusableAnnotationViewWithIdentifier([\'identifier\':$identifier])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::dequeueReusableAnnotationViewWithIdentifier', {"identifier": identifier, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAAnnotationView()..refId = result;
  }
  
   Future<String> selectAnnotation(MAAnnotation annotation, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::selectAnnotation([\'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::selectAnnotation', {"animated": animated, "refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAMapView::selectAnnotation_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'MAMapView::selectAnnotation_Callback::setCoordinate':
              // 日志打印
              print('fluttify-dart-callback: MAMapView::selectAnnotation_setCoordinate([])');
        
                // 调用回调方法
              annotation?.setCoordinate(CLLocationCoordinate2D()..refId = (args['newCoordinate']));
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> deselectAnnotation(MAAnnotation annotation, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::deselectAnnotation([\'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::deselectAnnotation', {"animated": animated, "refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAMapView::deselectAnnotation_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'MAMapView::deselectAnnotation_Callback::setCoordinate':
              // 日志打印
              print('fluttify-dart-callback: MAMapView::deselectAnnotation_setCoordinate([])');
        
                // 调用回调方法
              annotation?.setCoordinate(CLLocationCoordinate2D()..refId = (args['newCoordinate']));
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setUserTrackingMode(MAUserTrackingMode mode, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setUserTrackingMode([\'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setUserTrackingMode', {"mode": mode.index, "animated": animated, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> updateUserLocationRepresentation(MAUserLocationRepresentation representation) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::updateUserLocationRepresentation([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::updateUserLocationRepresentation', {"representation": representation.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> addOverlay(MAOverlay overlay) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::addOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::addOverlay', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAMapView::addOverlay_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
        
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> removeOverlay(MAOverlay overlay) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::removeOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::removeOverlay', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAMapView::removeOverlay_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
        
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> exchangeOverlayAtIndex(int index1, int index2) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::exchangeOverlayAtIndex([\'index1\':$index1, \'index2\':$index2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::exchangeOverlayAtIndex', {"index1": index1, "index2": index2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> exchangeOverlay(MAOverlay overlay1, MAOverlay overlay2) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::exchangeOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::exchangeOverlay', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAMapView::exchangeOverlay_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
        
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<MAOverlayRenderer> rendererForOverlay(MAOverlay overlay) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::rendererForOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::rendererForOverlay', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('MAMapView::rendererForOverlay_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['callerRefId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
        
            default:
              break;
          }
        });
  
    // 返回值
    return MAOverlayRenderer()..refId = result;
  }
  
   Future<String> setIndoorMapControlOrigin(CGPoint origin) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setIndoorMapControlOrigin([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setIndoorMapControlOrigin', {"origin": origin.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCurrentIndoorMapFloorIndex(int floorIndex) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setCurrentIndoorMapFloorIndex([\'floorIndex\':$floorIndex])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setCurrentIndoorMapFloorIndex', {"floorIndex": floorIndex, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> clearIndoorMapCache() async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::clearIndoorMapCache([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::clearIndoorMapCache', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCustomMapStyleOptions(MAMapCustomStyleOptions styleOptions) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setCustomMapStyleOptions([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setCustomMapStyleOptions', {"styleOptions": styleOptions.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}