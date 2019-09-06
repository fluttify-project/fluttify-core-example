import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class AMapRouteConfig extends Ref_iOS {
  AMapRouteConfig.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<String> get_appScheme() async {
    final result = await _channel.invokeMethod("AMapRouteConfig::get_appScheme", {'refId': refId});
    return result;
  }
  
  Future<String> get_appName() async {
    final result = await _channel.invokeMethod("AMapRouteConfig::get_appName", {'refId': refId});
    return result;
  }
  
  Future<AMapDrivingStrategy> get_drivingStrategy() async {
    final result = await _channel.invokeMethod("AMapRouteConfig::get_drivingStrategy", {'refId': refId});
    return result;
  }
  
  Future<AMapTransitStrategy> get_transitStrategy() async {
    final result = await _channel.invokeMethod("AMapRouteConfig::get_transitStrategy", {'refId': refId});
    return result;
  }
  
  Future<AMapRouteSearchType> get_routeType() async {
    final result = await _channel.invokeMethod("AMapRouteConfig::get_routeType", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_appScheme(String appScheme) async {
    await _channel.invokeMethod('AMapRouteConfig::set_appScheme', {'refId': refId, "appScheme": appScheme});
  }
  
  Future<void> set_appName(String appName) async {
    await _channel.invokeMethod('AMapRouteConfig::set_appName', {'refId': refId, "appName": appName});
  }
  
  Future<void> set_drivingStrategy(AMapDrivingStrategy drivingStrategy) async {
    await _channel.invokeMethod('AMapRouteConfig::set_drivingStrategy', {'refId': refId, "drivingStrategy": drivingStrategy.index});
  }
  
  Future<void> set_transitStrategy(AMapTransitStrategy transitStrategy) async {
    await _channel.invokeMethod('AMapRouteConfig::set_transitStrategy', {'refId': refId, "transitStrategy": transitStrategy.index});
  }
  
  Future<void> set_routeType(AMapRouteSearchType routeType) async {
    await _channel.invokeMethod('AMapRouteConfig::set_routeType', {'refId': refId, "routeType": routeType.index});
  }
  

  // 生成方法们
  
}