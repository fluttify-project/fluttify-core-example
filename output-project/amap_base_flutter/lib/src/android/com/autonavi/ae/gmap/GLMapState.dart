import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_GLMapState extends Ref_Android {
  com_autonavi_ae_gmap_GLMapState.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<String> geo2LonLat(com_autonavi_amap_mapcore_DPoint var2, int var0, int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::geo2LonLat([\'var0\':$var0, \'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::geo2LonLat', {"var0": var0, "var1": var1, "var2": var2.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMapGeoCenter(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::setMapGeoCenter([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::setMapGeoCenter', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCameraDegree(double var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::setCameraDegree([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::setCameraDegree', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMapAngle(double var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::setMapAngle([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::setMapAngle', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMapZoomer(double var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::setMapZoomer([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::setMapZoomer', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getMapZoomer() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::getMapZoomer([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::getMapZoomer', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getCameraDegree() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::getCameraDegree([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::getCameraDegree', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getMapAngle() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::getMapAngle([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::getMapAngle', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> recalculate() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::recalculate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::recalculate', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> reset() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::reset([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::reset', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getMapLenWithWin(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::getMapLenWithWin([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::getMapLenWithWin', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getGLUnitWithWin(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::getGLUnitWithWin([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::getGLUnitWithWin', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getNativeInstance() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::getNativeInstance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::getNativeInstance', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getSkyHeight() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::getSkyHeight([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::getSkyHeight', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setNativeMapengineState(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState@$refId::setNativeMapengineState([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::setNativeMapengineState', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<double> calMapZoomScalefactor(int var0, int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::calMapZoomScalefactor([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::calMapZoomScalefactor', {"var0": var0, "var1": var1, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeNewInstance(int var0, int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeNewInstance([\'var0\':$var0, \'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeNewInstance', {"var0": var0, "var1": var1});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeSetMapCenter(int var0, int var2, int var3) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeSetMapCenter([\'var0\':$var0, \'var2\':$var2, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeSetMapCenter', {"var0": var0, "var2": var2, "var3": var3});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<double> nativeGetMapZoomer(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeGetMapZoomer([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeGetMapZoomer', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeSetMapZoomer(double var2, int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeSetMapZoomer([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeSetMapZoomer', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeSetMapAngle(double var2, int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeSetMapAngle([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeSetMapAngle', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<double> nativeGetCameraDegree(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeGetCameraDegree([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeGetCameraDegree', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<double> nativeGetMapAngle(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeGetMapAngle([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeGetMapAngle', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeSetCameraDegree(double var2, int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeSetCameraDegree([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeSetCameraDegree', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeRecalculate(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeRecalculate([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeRecalculate', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeStateDestroy(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeStateDestroy([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeStateDestroy', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<double> nativeGetSkyHeight(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeGetSkyHeight([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeGetSkyHeight', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<double> nativeGetGLUnitWithWin(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeGetGLUnitWithWin([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeGetGLUnitWithWin', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<double> nativeCalMapZoomScalefactor(double var2, int var0, int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapState::nativeCalMapZoomScalefactor([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapState::nativeCalMapZoomScalefactor', {"var0": var0, "var1": var1, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}