import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MATraceLocation extends NSObject {
  MATraceLocation.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<CLLocationCoordinate2D> get_loc() async {
    final result = await _channel.invokeMethod("MATraceLocation::get_loc", {'refId': refId});
    return result;
  }
  
  Future<double> get_angle() async {
    final result = await _channel.invokeMethod("MATraceLocation::get_angle", {'refId': refId});
    return result;
  }
  
  Future<double> get_speed() async {
    final result = await _channel.invokeMethod("MATraceLocation::get_speed", {'refId': refId});
    return result;
  }
  
  Future<double> get_time() async {
    final result = await _channel.invokeMethod("MATraceLocation::get_time", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_loc(CLLocationCoordinate2D loc) async {
    await _channel.invokeMethod('MATraceLocation::set_loc', {'refId': refId, "loc": loc});
  }
  
  Future<void> set_angle(double angle) async {
    await _channel.invokeMethod('MATraceLocation::set_angle', {'refId': refId, "angle": angle});
  }
  
  Future<void> set_speed(double speed) async {
    await _channel.invokeMethod('MATraceLocation::set_speed', {'refId': refId, "speed": speed});
  }
  
  Future<void> set_time(double time) async {
    await _channel.invokeMethod('MATraceLocation::set_time', {'refId': refId, "time": time});
  }
  

  // 生成方法们
  
}