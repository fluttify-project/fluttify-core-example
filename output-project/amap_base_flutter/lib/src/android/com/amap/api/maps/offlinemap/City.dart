import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_offlinemap_City extends Ref_Android {
  com_amap_api_maps_offlinemap_City.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> setCity(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.City@$refId::setCity([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.City::setCity', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getCity() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.City@$refId::getCity([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.City::getCity', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCode(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.City@$refId::setCode([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.City::setCode', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getCode() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.City@$refId::getCode([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.City::getCode', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getJianpin() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.City@$refId::getJianpin([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.City::getJianpin', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setJianpin(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.City@$refId::setJianpin([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.City::setJianpin', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getPinyin() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.City@$refId::getPinyin([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.City::getPinyin', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setPinyin(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.City@$refId::setPinyin([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.City::setPinyin', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getAdcode() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.City@$refId::getAdcode([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.City::getAdcode', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setAdcode(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.offlinemap.City@$refId::setAdcode([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.offlinemap.City::setAdcode', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}