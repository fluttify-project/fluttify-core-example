import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_FileUtil {
  com_autonavi_amap_mapcore_FileUtil.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<String> getMapBaseStorage(android_content_Context var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.FileUtil::getMapBaseStorage([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.FileUtil::getMapBaseStorage', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> getExternalStroragePath(android_content_Context var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.FileUtil::getExternalStroragePath([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.FileUtil::getExternalStroragePath', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> createNoMediaFileIfNotExist(String var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.FileUtil::createNoMediaFileIfNotExist([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.FileUtil::createNoMediaFileIfNotExist', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> saveFile(String var0, String var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.FileUtil::saveFile([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.FileUtil::saveFile', {"var0": var0, "var1": var1, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> getName(String var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.FileUtil::getName([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.FileUtil::getName', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> indexOfLastSeparator(String var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.FileUtil::indexOfLastSeparator([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.FileUtil::indexOfLastSeparator', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}