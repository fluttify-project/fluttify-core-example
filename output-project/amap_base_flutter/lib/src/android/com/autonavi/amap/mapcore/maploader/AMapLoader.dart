import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_maploader_AMapLoader extends Ref_Android {
  com_autonavi_amap_mapcore_maploader_AMapLoader.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_isFinish() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.maploader.AMapLoader::get_isFinish", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_isFinish(bool isFinish) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader::set_isFinish', {'refId': refId, "isFinish": isFinish});
  }
  

  // 生成方法们
   Future<String> onStop() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.AMapLoader@$refId::onStop([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader::onStop', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onFinish() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.AMapLoader@$refId::onFinish([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader::onFinish', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> doRequest() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.AMapLoader@$refId::doRequest([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader::doRequest', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> doCancel() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.AMapLoader@$refId::doCancel([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader::doCancel', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getDeviceId(android_content_Context var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.AMapLoader@$refId::getDeviceId([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader::getDeviceId', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}