import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMapView {
  MAMapView.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
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
  
  Future<List> get_annotations() async {
    final result = await _channel.invokeMethod("MAMapView::get_annotations", {'refId': refId});
    return result;
  }
  
  Future<List> get_selectedAnnotations() async {
    final result = await _channel.invokeMethod("MAMapView::get_selectedAnnotations", {'refId': refId});
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
  
  Future<bool> get_customizeUserLocationAccuracyCircleRepresentation() async {
    final result = await _channel.invokeMethod("MAMapView::get_customizeUserLocationAccuracyCircleRepresentation", {'refId': refId});
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
  
  Future<List> get_overlays() async {
    final result = await _channel.invokeMethod("MAMapView::get_overlays", {'refId': refId});
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
  
  Future<void> set_selectedAnnotations(List selectedAnnotations) async {
    await _channel.invokeMethod('MAMapView::set_selectedAnnotations', {'refId': refId, "selectedAnnotations": selectedAnnotations});
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
   Future<MAMapStatus> getMapStatus() async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::getMapStatus([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::getMapStatus', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAMapStatus.withRefId(result);
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
  
   Future<String> addAnnotations(List annotations) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::addAnnotations([\'annotations\':$annotations])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::addAnnotations', {"annotations": annotations, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> removeAnnotations(List annotations) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::removeAnnotations([\'annotations\':$annotations])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::removeAnnotations', {"annotations": annotations, "refId": refId});
  
  
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
  
   Future<String> showAnnotations(List annotations, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::showAnnotations([\'annotations\':$annotations, \'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::showAnnotations', {"annotations": annotations, "animated": animated, "refId": refId});
  
  
    // 接受原生回调
  
  
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
  
   Future<List> overlaysInLevel(MAOverlayLevel level) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::overlaysInLevel([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::overlaysInLevel', {"level": level.index, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> addOverlays(List overlays) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::addOverlays([\'overlays\':$overlays])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::addOverlays', {"overlays": overlays, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> removeOverlays(List overlays) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::removeOverlays([\'overlays\':$overlays])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::removeOverlays', {"overlays": overlays, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> showOverlays(List overlays, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAMapView@$refId::showOverlays([\'overlays\':$overlays, \'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMapView::showOverlays', {"overlays": overlays, "animated": animated, "refId": refId});
  
  
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
  
}