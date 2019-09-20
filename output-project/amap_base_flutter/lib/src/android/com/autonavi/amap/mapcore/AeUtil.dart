import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_AeUtil extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_IS_AE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AeUtil::get_IS_AE", {'refId': refId});
    return result;
  }
  
  Future<String> get_ROOTPATH() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AeUtil::get_ROOTPATH", {'refId': refId});
    return result;
  }
  
  Future<String> get_ROOT_DATA_PATH_OLD_NAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AeUtil::get_ROOT_DATA_PATH_OLD_NAME", {'refId': refId});
    return result;
  }
  
  Future<String> get_ROOT_DATA_PATH_NAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AeUtil::get_ROOT_DATA_PATH_NAME", {'refId': refId});
    return result;
  }
  
  Future<String> get_CONFIGNAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AeUtil::get_CONFIGNAME", {'refId': refId});
    return result;
  }
  
  Future<String> get_RESZIPNAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AeUtil::get_RESZIPNAME", {'refId': refId});
    return result;
  }
  
  Future<String> get_SO_FILENAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AeUtil::get_SO_FILENAME", {'refId': refId});
    return result;
  }
  
  Future<String> get_SO_FILENAME_NAVI() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AeUtil::get_SO_FILENAME_NAVI", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  static Future<String> loadLib(android_content_Context var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AeUtil::loadLib([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AeUtil::loadLib', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<com_autonavi_ae_gmap_GLMapEngine_InitParam> initResource(android_content_Context var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AeUtil::initResource([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AeUtil::initResource', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_autonavi_ae_gmap_GLMapEngine_InitParam()..refId = result;
  }
  
  static Future<String> readAssetsFileAndSave(String var0, String var1, android_content_Context var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AeUtil::readAssetsFileAndSave([\'var0\':$var0, \'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AeUtil::readAssetsFileAndSave', {"var0": var0, "var1": var1, "var2": var2.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}