import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_offlinemap_Province extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> getProvinceName() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.Province@$refId::getProvinceName([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.Province::getProvinceName', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getJianpin() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.Province@$refId::getJianpin([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.Province::getJianpin', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getPinyin() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.Province@$refId::getPinyin([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.Province::getPinyin', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> setProvinceName(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.Province@$refId::setProvinceName([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.Province::setProvinceName', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> setJianpin(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.Province@$refId::setJianpin([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.Province::setJianpin', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> setPinyin(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.Province@$refId::setPinyin([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.Province::setPinyin', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<void> setProvinceCode(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.Province@$refId::setProvinceCode([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.Province::setProvinceCode', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getProvinceCode() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.Province@$refId::getProvinceCode([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.Province::getProvinceCode', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}