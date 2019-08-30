import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_AMapNativeParticleSystem {
  com_autonavi_amap_mapcore_AMapNativeParticleSystem.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
  static Future<int> nativeCreate() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreate([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreate', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeSetGLShaderManager(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeSetGLShaderManager([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeSetGLShaderManager', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeDestroy(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeDestroy([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeDestroy', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setStartParticleSize(double var2, double var3, int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setStartParticleSize([\'var0\':$var0, \'var2\':$var2, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setStartParticleSize', {"var0": var0, "var2": var2, "var3": var3});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setMaxParticles(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setMaxParticles([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setMaxParticles', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setDuration(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setDuration([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setDuration', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setParticleLifeTime(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setParticleLifeTime([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setParticleLifeTime', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setParticleStartSpeed(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setParticleStartSpeed([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setParticleStartSpeed', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setLoop(bool var2, int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setLoop([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setLoop', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setParticleShapeModule(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setParticleShapeModule([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setParticleShapeModule', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setParticleEmission(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setParticleEmission([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setParticleEmission', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> getCurrentParticleNum(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::getCurrentParticleNum([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::getCurrentParticleNum', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setParticleOverLifeModule(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setParticleOverLifeModule([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setParticleOverLifeModule', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setPreWram(bool var2, int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setPreWram([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setPreWram', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> setStartColor(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::setStartColor([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::setStartColor', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeSetTextureId(int var0, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeSetTextureId([\'var0\':$var0, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeSetTextureId', {"var0": var0, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeCreateParticleEmissionModule(int var0, int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateParticleEmissionModule([\'var0\':$var0, \'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateParticleEmissionModule', {"var0": var0, "var1": var1});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeCreateSinglePointParticleShape(bool var3, double var0, double var1, double var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateSinglePointParticleShape([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateSinglePointParticleShape', {"var0": var0, "var1": var1, "var2": var2, "var3": var3});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeCreateRectParticleShape(bool var4, double var0, double var1, double var2, double var3) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateRectParticleShape([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateRectParticleShape', {"var0": var0, "var1": var1, "var2": var2, "var3": var3, "var4": var4});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeCreateRandomColorBetWeenTwoConstants(double var0, double var1, double var2, double var3, double var4, double var5, double var6, double var7) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateRandomColorBetWeenTwoConstants([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6, \'var7\':$var7])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateRandomColorBetWeenTwoConstants', {"var0": var0, "var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "var7": var7});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeCreateParticleOverLifeModule() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateParticleOverLifeModule([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateParticleOverLifeModule', );
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeCreateConstantRotationOverLife(double var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateConstantRotationOverLife([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateConstantRotationOverLife', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeCreateRandomVelocityBetweenTwoConstants(double var0, double var1, double var2, double var3, double var4, double var5) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateRandomVelocityBetweenTwoConstants([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateRandomVelocityBetweenTwoConstants', {"var0": var0, "var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<int> nativeCreateCurveSizeOverLife(double var0, double var1, double var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateCurveSizeOverLife([\'var0\':$var0, \'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeCreateCurveSizeOverLife', {"var0": var0, "var1": var1, "var2": var2});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeSetOverLifeItem(int var0, int var2, int var4) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeSetOverLifeItem([\'var0\':$var0, \'var2\':$var2, \'var4\':$var4])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeSetOverLifeItem', {"var0": var0, "var2": var2, "var4": var4});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeReleaseVelocityOverLife(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseVelocityOverLife([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseVelocityOverLife', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeReleaseColorGenerate(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseColorGenerate([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseColorGenerate', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeReleaseParticleEmissonModule(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseParticleEmissonModule([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseParticleEmissonModule', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeReleaseParticleOverLifeModule(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseParticleOverLifeModule([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseParticleOverLifeModule', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeReleaseParticleShapeModule(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseParticleShapeModule([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseParticleShapeModule', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeReleaseRotationOverLife(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseRotationOverLife([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseRotationOverLife', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeReleaseSizeOverLife(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseSizeOverLife([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapNativeParticleSystem::nativeReleaseSizeOverLife', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}