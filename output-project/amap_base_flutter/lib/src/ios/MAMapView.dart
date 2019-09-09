import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMapView extends UIView {
  MAMapView.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

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
  
  Future<bool> get_showsScale() async {
    final result = await _channel.invokeMethod("MAMapView::get_showsScale", {'refId': refId});
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
  
  Future<bool> get_isAllowDecreaseFrame() async {
    final result = await _channel.invokeMethod("MAMapView::get_isAllowDecreaseFrame", {'refId': refId});
    return result;
  }
  
  Future<bool> get_openGLESDisabled() async {
    final result = await _channel.invokeMethod("MAMapView::get_openGLESDisabled", {'refId': refId});
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
    await _channel.invokeMethod('MAMapView::set_delegate', {'refId': refId, "delegate": delegate});
  }
  
  Future<void> set_mapType(MAMapType mapType) async {
    await _channel.invokeMethod('MAMapView::set_mapType', {'refId': refId, "mapType": mapType.index});
  }
  
  Future<void> set_centerCoordinate(CLLocationCoordinate2D centerCoordinate) async {
    await _channel.invokeMethod('MAMapView::set_centerCoordinate', {'refId': refId, "centerCoordinate": centerCoordinate});
  }
  
  Future<void> set_region(MACoordinateRegion region) async {
    await _channel.invokeMethod('MAMapView::set_region', {'refId': refId, "region": region});
  }
  
  Future<void> set_visibleMapRect(MAMapRect visibleMapRect) async {
    await _channel.invokeMethod('MAMapView::set_visibleMapRect', {'refId': refId, "visibleMapRect": visibleMapRect});
  }
  
  Future<void> set_limitRegion(MACoordinateRegion limitRegion) async {
    await _channel.invokeMethod('MAMapView::set_limitRegion', {'refId': refId, "limitRegion": limitRegion});
  }
  
  Future<void> set_limitMapRect(MAMapRect limitMapRect) async {
    await _channel.invokeMethod('MAMapView::set_limitMapRect', {'refId': refId, "limitMapRect": limitMapRect});
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
  
  Future<void> set_showsScale(bool showsScale) async {
    await _channel.invokeMethod('MAMapView::set_showsScale', {'refId': refId, "showsScale": showsScale});
  }
  
  Future<void> set_isAllowDecreaseFrame(bool isAllowDecreaseFrame) async {
    await _channel.invokeMethod('MAMapView::set_isAllowDecreaseFrame', {'refId': refId, "isAllowDecreaseFrame": isAllowDecreaseFrame});
  }
  
  Future<void> set_openGLESDisabled(bool openGLESDisabled) async {
    await _channel.invokeMethod('MAMapView::set_openGLESDisabled', {'refId': refId, "openGLESDisabled": openGLESDisabled});
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
    return MACoordinateRegion.withRefId(result);
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
    return MAMapRect.withRefId(result);
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
  
   Future<String> setZoomLevel(bool animated, double zoomLevel) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::setZoomLevel([\'zoomLevel\':$zoomLevel, \'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::setZoomLevel', {"zoomLevel": zoomLevel, "animated": animated, "refId": refId});
  
  
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
    return MAMapStatus.withRefId(result);
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
  
   Future<MAAnnotationView> dequeueReusableAnnotationViewWithIdentifier(String identifier) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::dequeueReusableAnnotationViewWithIdentifier([\'identifier\':$identifier])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::dequeueReusableAnnotationViewWithIdentifier', {"identifier": identifier, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAAnnotationView.withRefId(result);
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
  
   Future<List> overlaysInLevel(MAOverlayLevel level) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::overlaysInLevel([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::overlaysInLevel', {"level": level.index, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return (result as List).cast<List>();
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