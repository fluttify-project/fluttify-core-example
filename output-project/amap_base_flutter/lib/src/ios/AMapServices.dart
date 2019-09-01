import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class AMapServices extends Ref_Android {
  AMapServices.withRefId(int refId): super(refId);

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
  Future<void> set_apiKey(String apiKey) async {
    await _channel.invokeMethod('AMapServices::set_apiKey', {'refId': refId, "apiKey": apiKey});
  }
  
  Future<void> set_enableHTTPS(bool enableHTTPS) async {
    await _channel.invokeMethod('AMapServices::set_enableHTTPS', {'refId': refId, "enableHTTPS": enableHTTPS});
  }
  
  Future<void> set_crashReportEnabled(bool crashReportEnabled) async {
    await _channel.invokeMethod('AMapServices::set_crashReportEnabled', {'refId': refId, "crashReportEnabled": crashReportEnabled});
  }
  

  // 生成方法们
  static Future<AMapServices> sharedServices() async {
    // 日志打印
    print('fluttify-dart: AMapServices::sharedServices([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('AMapServices::sharedServices', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return AMapServices.withRefId(result);
  }
  
}