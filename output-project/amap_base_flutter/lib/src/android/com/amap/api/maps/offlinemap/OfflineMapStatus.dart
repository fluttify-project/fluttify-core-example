import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_offlinemap_OfflineMapStatus extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_CHECKUPDATES() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_CHECKUPDATES", {'refId': refId});
    return result;
  }
  
  Future<int> get_ERROR() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_ERROR", {'refId': refId});
    return result;
  }
  
  Future<int> get_STOP() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_STOP", {'refId': refId});
    return result;
  }
  
  Future<int> get_LOADING() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_LOADING", {'refId': refId});
    return result;
  }
  
  Future<int> get_UNZIP() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_UNZIP", {'refId': refId});
    return result;
  }
  
  Future<int> get_WAITING() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_WAITING", {'refId': refId});
    return result;
  }
  
  Future<int> get_PAUSE() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_PAUSE", {'refId': refId});
    return result;
  }
  
  Future<int> get_SUCCESS() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_SUCCESS", {'refId': refId});
    return result;
  }
  
  Future<int> get_NEW_VERSION() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_NEW_VERSION", {'refId': refId});
    return result;
  }
  
  Future<int> get_EXCEPTION_NETWORK_LOADING() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_EXCEPTION_NETWORK_LOADING", {'refId': refId});
    return result;
  }
  
  Future<int> get_EXCEPTION_AMAP() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_EXCEPTION_AMAP", {'refId': refId});
    return result;
  }
  
  Future<int> get_EXCEPTION_SDCARD() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_EXCEPTION_SDCARD", {'refId': refId});
    return result;
  }
  
  Future<int> get_START_DOWNLOAD_FAILD() async {
    final result = await _channel.invokeMethod("com.amap.api.maps.offlinemap.OfflineMapStatus::get_START_DOWNLOAD_FAILD", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}