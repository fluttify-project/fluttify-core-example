import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_maploader_AMapLoader_AMapGridDownloadRequest {
  com_autonavi_amap_mapcore_maploader_AMapLoader_AMapGridDownloadRequest.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> getURL() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.AMapLoader.AMapGridDownloadRequest@$refId::getURL([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader.AMapGridDownloadRequest::getURL', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setPostEntityBytes(List<int> var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.AMapLoader.AMapGridDownloadRequest@$refId::setPostEntityBytes([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader.AMapGridDownloadRequest::setPostEntityBytes', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<List<int>> getEntityBytes() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.maploader.AMapLoader.AMapGridDownloadRequest@$refId::getEntityBytes([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.maploader.AMapLoader.AMapGridDownloadRequest::getEntityBytes', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}