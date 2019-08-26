import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_Polyline {
  com_amap_api_maps_model_Polyline.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> remove() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::remove([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::remove', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getId() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::getId([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::getId', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setPoints(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setPoints([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setPoints', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setGeodesic(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setGeodesic([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setGeodesic', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isGeodesic() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::isGeodesic([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::isGeodesic', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setDottedLine(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setDottedLine([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setDottedLine', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isDottedLine() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::isDottedLine([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::isDottedLine', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setWidth(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setWidth([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setWidth', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getWidth() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::getWidth([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::getWidth', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setColor(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setColor([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setColor', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getColor() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::getColor([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::getColor', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setZIndex(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setZIndex([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setZIndex', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getZIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::getZIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::getZIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setVisible(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setVisible([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setVisible', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isVisible() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::isVisible([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::isVisible', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_LatLng> getNearestLatLng(com_amap_api_maps_model_LatLng var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::getNearestLatLng([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::getNearestLatLng', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_LatLng.withRefId(result);
  }
  
   Future<String> setTransparency(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setTransparency([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setTransparency', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setAboveMaskLayer(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setAboveMaskLayer([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setAboveMaskLayer', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCustomTexture(com_amap_api_maps_model_BitmapDescriptor var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setCustomTexture([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setCustomTexture', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setOptions(com_amap_api_maps_model_PolylineOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setOptions([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setOptions', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_PolylineOptions> getOptions() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::getOptions([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::getOptions', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_PolylineOptions.withRefId(result);
  }
  
   Future<String> setCustemTextureIndex(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setCustemTextureIndex([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setCustemTextureIndex', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setShownRatio(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setShownRatio([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setShownRatio', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setShownRange(double var1, double var2) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setShownRange([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setShownRange', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getShownRatio() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::getShownRatio([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::getShownRatio', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCustomTextureList(com_amap_api_maps_model_BitmapDescriptor var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.Polyline@$refId::setCustomTextureList([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.Polyline::setCustomTextureList', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}