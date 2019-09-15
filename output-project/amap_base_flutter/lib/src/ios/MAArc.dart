import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAArc extends MAShape with MAAnnotation, MAOverlay {
  MAArc.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<CLLocationCoordinate2D> get_startCoordinate() async {
    final result = await _channel.invokeMethod("MAArc::get_startCoordinate", {'refId': refId});
    return result;
  }
  
  Future<CLLocationCoordinate2D> get_passedCoordinate() async {
    final result = await _channel.invokeMethod("MAArc::get_passedCoordinate", {'refId': refId});
    return result;
  }
  
  Future<CLLocationCoordinate2D> get_endCoordinate() async {
    final result = await _channel.invokeMethod("MAArc::get_endCoordinate", {'refId': refId});
    return result;
  }
  
  Future<MAMapRect> get_boundingMapRect() async {
    final result = await _channel.invokeMethod("MAArc::get_boundingMapRect", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_startCoordinate(CLLocationCoordinate2D startCoordinate) async {
    await _channel.invokeMethod('MAArc::set_startCoordinate', {'refId': refId, "startCoordinate": startCoordinate.refId});
  }
  
  Future<void> set_passedCoordinate(CLLocationCoordinate2D passedCoordinate) async {
    await _channel.invokeMethod('MAArc::set_passedCoordinate', {'refId': refId, "passedCoordinate": passedCoordinate.refId});
  }
  
  Future<void> set_endCoordinate(CLLocationCoordinate2D endCoordinate) async {
    await _channel.invokeMethod('MAArc::set_endCoordinate', {'refId': refId, "endCoordinate": endCoordinate.refId});
  }
  

  // 生成方法们
  static Future<MAArc> arcWithStartCoordinate(CLLocationCoordinate2D startCoordinate, CLLocationCoordinate2D passedCoordinate, CLLocationCoordinate2D endCoordinate) async {
    // 日志打印
    print('fluttify-dart: MAArc::arcWithStartCoordinate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAArc::arcWithStartCoordinate', {"startCoordinate": startCoordinate.refId, "passedCoordinate": passedCoordinate.refId, "endCoordinate": endCoordinate.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAArc.withRefId(result);
  }
  
}