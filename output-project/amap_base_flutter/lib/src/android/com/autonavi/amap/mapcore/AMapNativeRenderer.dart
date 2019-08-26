import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_AMapNativeRenderer {
  com_autonavi_amap_mapcore_AMapNativeRenderer.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<String> nativeDrawLineByMultiTextureID(List<double> var0, List<double> var8, List<int> var3, List<int> var5, double var2, double var7, int var1, int var10, int var4, int var6, int var9) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawLineByMultiTextureID([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6, \'var7\':$var7, \'var8\':$var8, \'var9\':$var9, \'var10\':$var10])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawLineByMultiTextureID', {"var0": var0, "var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "var7": var7, "var8": var8, "var9": var9, "var10": var10});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeDrawLineByMultiColor(List<double> var0, List<double> var8, List<int> var4, List<int> var6, double var2, int var1, int var10, int var3, int var5, int var7, int var9) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawLineByMultiColor([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6, \'var7\':$var7, \'var8\':$var8, \'var9\':$var9, \'var10\':$var10])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawLineByMultiColor', {"var0": var0, "var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "var7": var7, "var8": var8, "var9": var9, "var10": var10});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeDrawGradientColorLine(List<double> var0, List<double> var8, List<int> var3, List<int> var5, double var2, int var1, int var10, int var4, int var6, int var7, int var9) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawGradientColorLine([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6, \'var7\':$var7, \'var8\':$var8, \'var9\':$var9, \'var10\':$var10])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawGradientColorLine', {"var0": var0, "var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "var7": var7, "var8": var8, "var9": var9, "var10": var10});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeDrawLineInit() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawLineInit([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawLineInit', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeDrawLineByTextureID(List<double> var0, List<double> var12, bool var10, bool var11, bool var9, double var2, double var4, double var5, double var6, double var7, double var8, int var1, int var13, int var14, int var3) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawLineByTextureID([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6, \'var7\':$var7, \'var8\':$var8, \'var9\':$var9, \'var10\':$var10, \'var11\':$var11, \'var12\':$var12, \'var13\':$var13, \'var14\':$var14])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeRenderer::nativeDrawLineByTextureID', {"var0": var0, "var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "var7": var7, "var8": var8, "var9": var9, "var10": var10, "var11": var11, "var12": var12, "var13": var13, "var14": var14});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}