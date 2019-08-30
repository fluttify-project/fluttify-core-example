import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAArc {
  MAArc.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<MAArc> arcWithStartCoordinate(CLLocationCoordinate2D endCoordinate, CLLocationCoordinate2D passedCoordinate, CLLocationCoordinate2D startCoordinate) async {
    // 日志打印
    print('fluttify-dart: MAArc::arcWithStartCoordinate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAArc::arcWithStartCoordinate', {"startCoordinate": startCoordinate.refId, "passedCoordinate": passedCoordinate.refId, "endCoordinate": endCoordinate.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAArc.withRefId(result);
  }
  
}