import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAPolygon extends MAMultiPoint with MAAnnotation, MAOverlay {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<MAPolygon> polygonWithCoordinates(CLLocationCoordinate2D coords, int count) async {
    // 日志打印
    print('fluttify-dart: MAPolygon::polygonWithCoordinates([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAPolygon::polygonWithCoordinates', {"coords": coords.refId, "count": count});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAPolygon()..refId = result;
  }
  
  static Future<MAPolygon> polygonWithPoints(MAMapPoint points, int count) async {
    // 日志打印
    print('fluttify-dart: MAPolygon::polygonWithPoints([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAPolygon::polygonWithPoints', {"points": points.refId, "count": count});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAPolygon()..refId = result;
  }
  
   Future<bool> setPolygonWithPoints(MAMapPoint points, int count) async {
    // 日志打印
    print('fluttify-dart: MAPolygon@$refId::setPolygonWithPoints([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAPolygon::setPolygonWithPoints', {"points": points.refId, "count": count, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> setPolygonWithCoordinates(CLLocationCoordinate2D coords, int count) async {
    // 日志打印
    print('fluttify-dart: MAPolygon@$refId::setPolygonWithCoordinates([\'count\':$count])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAPolygon::setPolygonWithCoordinates', {"coords": coords.refId, "count": count, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}