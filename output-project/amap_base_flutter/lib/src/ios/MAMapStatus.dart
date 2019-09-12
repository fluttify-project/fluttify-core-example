import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMapStatus extends NSObject {
  MAMapStatus.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<CLLocationCoordinate2D> get_centerCoordinate() async {
    final result = await _channel.invokeMethod("MAMapStatus::get_centerCoordinate", {'refId': refId});
    return result;
  }
  
  Future<double> get_zoomLevel() async {
    final result = await _channel.invokeMethod("MAMapStatus::get_zoomLevel", {'refId': refId});
    return result;
  }
  
  Future<double> get_rotationDegree() async {
    final result = await _channel.invokeMethod("MAMapStatus::get_rotationDegree", {'refId': refId});
    return result;
  }
  
  Future<double> get_cameraDegree() async {
    final result = await _channel.invokeMethod("MAMapStatus::get_cameraDegree", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_centerCoordinate(CLLocationCoordinate2D centerCoordinate) async {
    await _channel.invokeMethod('MAMapStatus::set_centerCoordinate', {'refId': refId, "centerCoordinate": centerCoordinate.refId});
  }
  
  Future<void> set_zoomLevel(double zoomLevel) async {
    await _channel.invokeMethod('MAMapStatus::set_zoomLevel', {'refId': refId, "zoomLevel": zoomLevel});
  }
  
  Future<void> set_rotationDegree(double rotationDegree) async {
    await _channel.invokeMethod('MAMapStatus::set_rotationDegree', {'refId': refId, "rotationDegree": rotationDegree});
  }
  
  Future<void> set_cameraDegree(double cameraDegree) async {
    await _channel.invokeMethod('MAMapStatus::set_cameraDegree', {'refId': refId, "cameraDegree": cameraDegree});
  }
  

  // 生成方法们
  
}