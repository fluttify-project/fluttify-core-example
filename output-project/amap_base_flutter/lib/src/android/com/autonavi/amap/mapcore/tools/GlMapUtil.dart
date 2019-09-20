import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_tools_GlMapUtil extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_1() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_1", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_1_EAGLE_EYE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_1_EAGLE_EYE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_2() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_2", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_2_EAGLE_EYE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_2_EAGLE_EYE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_3() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_3", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_3_EAGLE_EYE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_3_EAGLE_EYE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_ENGINE_ID_INVALID() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AN_ENGINE_ID_INVALID", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_ENGINE_ID_MAIN() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AN_ENGINE_ID_MAIN", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_ENGINE_ID_EAGLE_EYE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AN_ENGINE_ID_EAGLE_EYE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_ENGINE_ID_DISPLAY_EXTERNAL_1() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AN_ENGINE_ID_DISPLAY_EXTERNAL_1", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_ENGINE_ID_DISPLAY_EXTERNAL_1_EAGLE_EYE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AN_ENGINE_ID_DISPLAY_EXTERNAL_1_EAGLE_EYE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_ENGINE_ID_DISPLAY_EXTERNAL_2() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AN_ENGINE_ID_DISPLAY_EXTERNAL_2", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_ENGINE_ID_DISPLAY_EXTERNAL_2_EAGLE_EYE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AN_ENGINE_ID_DISPLAY_EXTERNAL_2_EAGLE_EYE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_ENGINE_ID_DISPLAY_EXTERNAL_3() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AN_ENGINE_ID_DISPLAY_EXTERNAL_3", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_ENGINE_ID_DISPLAY_EXTERNAL_3_EAGLE_EYE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_AN_ENGINE_ID_DISPLAY_EXTERNAL_3_EAGLE_EYE", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEVICE_DISPLAY_DPI_LOW() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_DEVICE_DISPLAY_DPI_LOW", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEVICE_DISPLAY_DPI_NORMAL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_DEVICE_DISPLAY_DPI_NORMAL", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEVICE_DISPLAY_DPI_MEDIAN() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_DEVICE_DISPLAY_DPI_MEDIAN", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEVICE_DISPLAY_DPI_HIGH() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_DEVICE_DISPLAY_DPI_HIGH", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEVICE_DISPLAY_DPI_XHIGH() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_DEVICE_DISPLAY_DPI_XHIGH", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEVICE_DISPLAY_DPI_XXHIGH() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GlMapUtil::get_DEVICE_DISPLAY_DPI_XXHIGH", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  static Future<int> dipToPixel(android_content_Context var0, int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.tools.GlMapUtil::dipToPixel([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GlMapUtil::dipToPixel', {"var0": var0.refId, "var1": var1});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> spToPixel(android_content_Context var0, int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.tools.GlMapUtil::spToPixel([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GlMapUtil::spToPixel', {"var0": var0.refId, "var1": var1});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> getString(android_content_Context var0, int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.tools.GlMapUtil::getString([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GlMapUtil::getString', {"var0": var0.refId, "var1": var1});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<bool> isAssic(String var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.tools.GlMapUtil::isAssic([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GlMapUtil::isAssic', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> getAppVersionName(android_content_Context var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.tools.GlMapUtil::getAppVersionName([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GlMapUtil::getAppVersionName', {"var0": var0.refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}