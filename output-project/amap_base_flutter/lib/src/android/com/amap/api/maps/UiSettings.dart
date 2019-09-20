import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_UiSettings extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setScaleControlsEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setScaleControlsEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setScaleControlsEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setZoomControlsEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setZoomControlsEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setZoomControlsEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCompassEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setCompassEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setCompassEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMyLocationButtonEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setMyLocationButtonEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setMyLocationButtonEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setScrollGesturesEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setScrollGesturesEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setScrollGesturesEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setZoomGesturesEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setZoomGesturesEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setZoomGesturesEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setTiltGesturesEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setTiltGesturesEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setTiltGesturesEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRotateGesturesEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setRotateGesturesEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setRotateGesturesEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setAllGesturesEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setAllGesturesEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setAllGesturesEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setLogoPosition(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setLogoPosition([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setLogoPosition', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setZoomPosition(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setZoomPosition([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setZoomPosition', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getZoomPosition() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::getZoomPosition([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::getZoomPosition', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isScaleControlsEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::isScaleControlsEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::isScaleControlsEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isZoomControlsEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::isZoomControlsEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::isZoomControlsEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isCompassEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::isCompassEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::isCompassEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isMyLocationButtonEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::isMyLocationButtonEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::isMyLocationButtonEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isScrollGesturesEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::isScrollGesturesEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::isScrollGesturesEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isZoomGesturesEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::isZoomGesturesEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::isZoomGesturesEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isTiltGesturesEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::isTiltGesturesEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::isTiltGesturesEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isRotateGesturesEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::isRotateGesturesEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::isRotateGesturesEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getLogoPosition() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::getLogoPosition([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::getLogoPosition', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isIndoorSwitchEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::isIndoorSwitchEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::isIndoorSwitchEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setIndoorSwitchEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setIndoorSwitchEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setIndoorSwitchEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setLogoMarginRate(int var1, double var2) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setLogoMarginRate([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setLogoMarginRate', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getLogoMarginRate(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::getLogoMarginRate([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::getLogoMarginRate', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setLogoLeftMargin(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setLogoLeftMargin([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setLogoLeftMargin', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setLogoBottomMargin(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setLogoBottomMargin([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setLogoBottomMargin', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setZoomInByScreenCenter(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setZoomInByScreenCenter([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setZoomInByScreenCenter', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setGestureScaleByMapCenter(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::setGestureScaleByMapCenter([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::setGestureScaleByMapCenter', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isGestureScaleByMapCenter() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.UiSettings@$refId::isGestureScaleByMapCenter([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.UiSettings::isGestureScaleByMapCenter', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}