import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_VirtualEarthProjection extends Ref_Android {
  com_autonavi_amap_mapcore_VirtualEarthProjection.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_MAXZOOMLEVEL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.VirtualEarthProjection::get_MAXZOOMLEVEL", {'refId': refId});
    return result;
  }
  
  Future<int> get_PIXELS_PER_TILE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.VirtualEarthProjection::get_PIXELS_PER_TILE", {'refId': refId});
    return result;
  }
  
  Future<double> get_MIN_LATITUDE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.VirtualEarthProjection::get_MIN_LATITUDE", {'refId': refId});
    return result;
  }
  
  Future<double> get_MAX_LATITUDE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.VirtualEarthProjection::get_MAX_LATITUDE", {'refId': refId});
    return result;
  }
  
  Future<double> get_MIN_LONGITUDE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.VirtualEarthProjection::get_MIN_LONGITUDE", {'refId': refId});
    return result;
  }
  
  Future<double> get_MAX_LONGITUDE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.VirtualEarthProjection::get_MAX_LONGITUDE", {'refId': refId});
    return result;
  }
  
  Future<int> get_EARTH_RADIUS_IN_METERS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.VirtualEarthProjection::get_EARTH_RADIUS_IN_METERS", {'refId': refId});
    return result;
  }
  
  Future<int> get_TILE_SPLIT_LEVEL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.VirtualEarthProjection::get_TILE_SPLIT_LEVEL", {'refId': refId});
    return result;
  }
  
  Future<double> get_EARTH_CIRCUMFERENCE_IN_METERS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.VirtualEarthProjection::get_EARTH_CIRCUMFERENCE_IN_METERS", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  static Future<double> clip(double var0, double var2, double var4) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.VirtualEarthProjection::clip([\'var0\':$var0, \'var2\':$var2, \'var4\':$var4])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.VirtualEarthProjection::clip', {"var0": var0, "var2": var2, "var4": var4});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<com_autonavi_amap_mapcore_DPoint> pixelsToLatLong(int var0, int var2, int var4) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.VirtualEarthProjection::pixelsToLatLong([\'var0\':$var0, \'var2\':$var2, \'var4\':$var4])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.VirtualEarthProjection::pixelsToLatLong', {"var0": var0, "var2": var2, "var4": var4});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_autonavi_amap_mapcore_DPoint.withRefId(result);
  }
  
}