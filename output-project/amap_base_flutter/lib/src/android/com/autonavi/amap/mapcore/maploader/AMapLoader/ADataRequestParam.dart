import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<String> get_requestUrl() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam::get_requestUrl", {'refId': refId});
    return result;
  }
  
  Future<int> get_handler() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam::get_handler", {'refId': refId});
    return result;
  }
  
  Future<int> get_nRequestType() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam::get_nRequestType", {'refId': refId});
    return result;
  }
  
  Future<int> get_nCompress() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam::get_nCompress", {'refId': refId});
    return result;
  }
  
  Future<String> get_requestBaseUrl() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam::get_requestBaseUrl", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_requestUrl(String requestUrl) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam::set_requestUrl', {'refId': refId, "requestUrl": requestUrl});
  
  
  }
  
  Future<void> set_handler(int handler) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam::set_handler', {'refId': refId, "handler": handler});
  
  
  }
  
  Future<void> set_nRequestType(int nRequestType) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam::set_nRequestType', {'refId': refId, "nRequestType": nRequestType});
  
  
  }
  
  Future<void> set_nCompress(int nCompress) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam::set_nCompress', {'refId': refId, "nCompress": nCompress});
  
  
  }
  
  Future<void> set_requestBaseUrl(String requestBaseUrl) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader.ADataRequestParam::set_requestBaseUrl', {'refId': refId, "requestBaseUrl": requestBaseUrl});
  
  
  }
  

  // 生成方法们
  
}