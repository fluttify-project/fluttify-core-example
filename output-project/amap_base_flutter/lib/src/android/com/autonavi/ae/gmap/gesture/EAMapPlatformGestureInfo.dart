import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_mGestureState() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo::get_mGestureState", {'refId': refId});
    return result;
  }
  
  Future<int> get_mGestureType() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo::get_mGestureType", {'refId': refId});
    return result;
  }
  
  Future<double> get_mScale() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo::get_mScale", {'refId': refId});
    return result;
  }
  
  Future<double> get_mRotation() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo::get_mRotation", {'refId': refId});
    return result;
  }
  
  Future<double> get_mVeLocityFloat() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo::get_mVeLocityFloat", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_mGestureState(int mGestureState) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo::set_mGestureState', {'refId': refId, "mGestureState": mGestureState});
  
  
  }
  
  Future<void> set_mGestureType(int mGestureType) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo::set_mGestureType', {'refId': refId, "mGestureType": mGestureType});
  
  
  }
  
  Future<void> set_mScale(double mScale) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo::set_mScale', {'refId': refId, "mScale": mScale});
  
  
  }
  
  Future<void> set_mRotation(double mRotation) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo::set_mRotation', {'refId': refId, "mRotation": mRotation});
  
  
  }
  
  Future<void> set_mVeLocityFloat(double mVeLocityFloat) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo::set_mVeLocityFloat', {'refId': refId, "mVeLocityFloat": mVeLocityFloat});
  
  
  }
  

  // 生成方法们
  
}