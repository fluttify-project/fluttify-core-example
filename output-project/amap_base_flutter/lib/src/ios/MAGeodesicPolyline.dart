import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAGeodesicPolyline extends MAPolyline {
  MAGeodesicPolyline.withRefId(int refId) : super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<MAGeodesicPolyline> polylineWithPoints(MAMapPoint points, int count) async {
    // 日志打印
    print('fluttify-dart: MAGeodesicPolyline::polylineWithPoints([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAGeodesicPolyline::polylineWithPoints', {"points": points.refId, "count": count});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAGeodesicPolyline.withRefId(result);
  }
  
  static Future<MAGeodesicPolyline> polylineWithCoordinates(CLLocationCoordinate2D coords, int count) async {
    // 日志打印
    print('fluttify-dart: MAGeodesicPolyline::polylineWithCoordinates([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAGeodesicPolyline::polylineWithCoordinates', {"coords": coords.refId, "count": count});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAGeodesicPolyline.withRefId(result);
  }
  
   Future<bool> setPolylineWithPoints(MAMapPoint points, int count) async {
    // 日志打印
    print('fluttify-dart: MAGeodesicPolyline@$refId::setPolylineWithPoints([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAGeodesicPolyline::setPolylineWithPoints', {"points": points.refId, "count": count, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> setPolylineWithCoordinates(CLLocationCoordinate2D coords, int count) async {
    // 日志打印
    print('fluttify-dart: MAGeodesicPolyline@$refId::setPolylineWithCoordinates([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAGeodesicPolyline::setPolylineWithCoordinates', {"coords": coords.refId, "count": count, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}