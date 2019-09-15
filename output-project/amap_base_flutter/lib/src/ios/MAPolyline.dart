import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAPolyline extends MAMultiPoint {
  MAPolyline.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<MAPolyline> polylineWithPoints(MAMapPoint points, int count) async {
    // 日志打印
    print('fluttify-dart: MAPolyline::polylineWithPoints([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAPolyline::polylineWithPoints', {"points": points.refId, "count": count});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAPolyline.withRefId(result);
  }
  
  static Future<MAPolyline> polylineWithCoordinates(CLLocationCoordinate2D coords, int count) async {
    // 日志打印
    print('fluttify-dart: MAPolyline::polylineWithCoordinates([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAPolyline::polylineWithCoordinates', {"coords": coords.refId, "count": count});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAPolyline.withRefId(result);
  }
  
   Future<bool> setPolylineWithPoints(MAMapPoint points, int count) async {
    // 日志打印
    print('fluttify-dart: MAPolyline@$refId::setPolylineWithPoints([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAPolyline::setPolylineWithPoints', {"points": points.refId, "count": count, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> setPolylineWithCoordinates(CLLocationCoordinate2D coords, int count) async {
    // 日志打印
    print('fluttify-dart: MAPolyline@$refId::setPolylineWithCoordinates([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAPolyline::setPolylineWithCoordinates', {"coords": coords.refId, "count": count, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}