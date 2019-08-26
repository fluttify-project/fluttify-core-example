import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_AMapNativePolyline {
  com_autonavi_amap_mapcore_AMapNativePolyline.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<int> nativeCreate() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativePolyline::nativeCreate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativePolyline::nativeCreate', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeSetGLShaderManager(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativePolyline::nativeSetGLShaderManager([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativePolyline::nativeSetGLShaderManager', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeDrawLineByTextureID(List<double> var14, List<double> var2, bool var11, bool var12, bool var13, double var10, double var4, double var6, double var7, double var8, double var9, int var0, int var15, int var16, int var3, int var5) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativePolyline::nativeDrawLineByTextureID([\'var0\':$var0, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6, \'var7\':$var7, \'var8\':$var8, \'var9\':$var9, \'var10\':$var10, \'var11\':$var11, \'var12\':$var12, \'var13\':$var13, \'var14\':$var14, \'var15\':$var15, \'var16\':$var16])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativePolyline::nativeDrawLineByTextureID', {"var0": var0, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "var7": var7, "var8": var8, "var9": var9, "var10": var10, "var11": var11, "var12": var12, "var13": var13, "var14": var14, "var15": var15, "var16": var16});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeDestroy(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativePolyline::nativeDestroy([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativePolyline::nativeDestroy', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}