import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAOfflineMapViewController {
  MAOfflineMapViewController.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAOfflineMap> get_offlineMap() async {
    final result = await _channel.invokeMethod("MAOfflineMapViewController::get_offlineMap", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  static Future<MAOfflineMapViewController> sharedInstance() async {
    // 日志打印
    print('fluttify-dart: MAOfflineMapViewController::sharedInstance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAOfflineMapViewController::sharedInstance', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return MAOfflineMapViewController.withRefId(result);
  }
  
}