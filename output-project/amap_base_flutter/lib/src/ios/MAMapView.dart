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
  

  // 生成setters
  Future<void> set_zoomingInPivotsAroundAnchorPoint(bool zoomingInPivotsAroundAnchorPoint) async {
    await _channel.invokeMethod('MAMapView::set_zoomingInPivotsAroundAnchorPoint', {'refId': refId, "zoomingInPivotsAroundAnchorPoint": zoomingInPivotsAroundAnchorPoint});
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
  
}