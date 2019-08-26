import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class AMapServices {
  AMapServices.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<String> get_apiKey() async {
    final result = await _channel.invokeMethod("AMapServices::get_apiKey", {'refId': refId});
    return result;
  }
  
  Future<bool> get_enableHTTPS() async {
    final result = await _channel.invokeMethod("AMapServices::get_enableHTTPS", {'refId': refId});
    return result;
  }
  
  Future<bool> get_crashReportEnabled() async {
    final result = await _channel.invokeMethod("AMapServices::get_crashReportEnabled", {'refId': refId});
    return result;
  }
  
  Future<String> get_identifier() async {
    final result = await _channel.invokeMethod("AMapServices::get_identifier", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_enableHTTPS(bool enableHTTPS) async {
    await _channel.invokeMethod('AMapServices::set_enableHTTPS', {'refId': refId, "enableHTTPS": enableHTTPS});
  }
  
  Future<void> set_crashReportEnabled(bool crashReportEnabled) async {
    await _channel.invokeMethod('AMapServices::set_crashReportEnabled', {'refId': refId, "crashReportEnabled": crashReportEnabled});
  }
  

  // 生成方法们
  
}