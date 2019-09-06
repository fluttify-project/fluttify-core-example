import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAIndoorFloorInfo extends Ref_iOS {
  MAIndoorFloorInfo.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<String> get_floorName() async {
    final result = await _channel.invokeMethod("MAIndoorFloorInfo::get_floorName", {'refId': refId});
    return result;
  }
  
  Future<int> get_floorIndex() async {
    final result = await _channel.invokeMethod("MAIndoorFloorInfo::get_floorIndex", {'refId': refId});
    return result;
  }
  
  Future<String> get_floorNona() async {
    final result = await _channel.invokeMethod("MAIndoorFloorInfo::get_floorNona", {'refId': refId});
    return result;
  }
  
  Future<bool> get_isPark() async {
    final result = await _channel.invokeMethod("MAIndoorFloorInfo::get_isPark", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}