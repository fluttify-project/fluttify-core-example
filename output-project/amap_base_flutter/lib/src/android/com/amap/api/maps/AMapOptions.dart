import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_AMapOptions extends Ref_Android {
  com_amap_api_maps_AMapOptions.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_LOGO_POSITION_BOTTOM_LEFT() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapOptions::get_LOGO_POSITION_BOTTOM_LEFT", {'refId': refId});
    return result;
  }
  
  Future<int> get_LOGO_POSITION_BOTTOM_CENTER() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapOptions::get_LOGO_POSITION_BOTTOM_CENTER", {'refId': refId});
    return result;
  }
  
  Future<int> get_LOGO_POSITION_BOTTOM_RIGHT() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapOptions::get_LOGO_POSITION_BOTTOM_RIGHT", {'refId': refId});
    return result;
  }
  
  Future<int> get_ZOOM_POSITION_RIGHT_CENTER() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapOptions::get_ZOOM_POSITION_RIGHT_CENTER", {'refId': refId});
    return result;
  }
  
  Future<int> get_ZOOM_POSITION_RIGHT_BUTTOM() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapOptions::get_ZOOM_POSITION_RIGHT_BUTTOM", {'refId': refId});
    return result;
  }
  
  Future<int> get_LOGO_MARGIN_LEFT() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapOptions::get_LOGO_MARGIN_LEFT", {'refId': refId});
    return result;
  }
  
  Future<int> get_LOGO_MARGIN_RIGHT() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapOptions::get_LOGO_MARGIN_RIGHT", {'refId': refId});
    return result;
  }
  
  Future<int> get_LOGO_MARGIN_BOTTOM() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.AMapOptions::get_LOGO_MARGIN_BOTTOM", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
   Future<com_amap_api_maps_AMapOptions> logoPosition(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::logoPosition([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::logoPosition', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMapOptions> zOrderOnTop(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::zOrderOnTop([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::zOrderOnTop', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMapOptions> mapType(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::mapType([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::mapType', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMapOptions> camera(com_amap_api_maps_model_CameraPosition var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::camera([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::camera', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMapOptions> scaleControlsEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::scaleControlsEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::scaleControlsEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMapOptions> zoomControlsEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::zoomControlsEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::zoomControlsEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMapOptions> compassEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::compassEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::compassEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMapOptions> scrollGesturesEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::scrollGesturesEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::scrollGesturesEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMapOptions> zoomGesturesEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::zoomGesturesEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::zoomGesturesEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMapOptions> tiltGesturesEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::tiltGesturesEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::tiltGesturesEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<com_amap_api_maps_AMapOptions> rotateGesturesEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::rotateGesturesEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::rotateGesturesEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
   Future<int> getLogoPosition() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getLogoPosition([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getLogoPosition', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getZOrderOnTop() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getZOrderOnTop([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getZOrderOnTop', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getMapType() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getMapType([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getMapType', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_CameraPosition> getCamera() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getCamera([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getCamera', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CameraPosition.withRefId(result);
  }
  
   Future<bool> getScaleControlsEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getScaleControlsEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getScaleControlsEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getZoomControlsEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getZoomControlsEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getZoomControlsEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getCompassEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getCompassEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getCompassEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getScrollGesturesEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getScrollGesturesEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getScrollGesturesEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getZoomGesturesEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getZoomGesturesEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getZoomGesturesEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getTiltGesturesEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getTiltGesturesEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getTiltGesturesEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getRotateGesturesEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMapOptions@$refId::getRotateGesturesEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMapOptions::getRotateGesturesEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}