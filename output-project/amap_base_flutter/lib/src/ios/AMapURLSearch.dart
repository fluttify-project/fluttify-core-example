import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class AMapURLSearch {
  AMapURLSearch.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<String> getLatestAMapApp() async {
    // 日志打印
    print('fluttify-dart: AMapURLSearch::getLatestAMapApp([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('AMapURLSearch::getLatestAMapApp', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}