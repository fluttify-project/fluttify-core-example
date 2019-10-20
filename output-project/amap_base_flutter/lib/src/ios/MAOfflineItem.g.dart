import 'dart:typed_data';

import 'package:amap_base_flutter/src/ios/ios.export.g.dart';
import 'package:amap_base_flutter/src/android/android.export.g.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import
class MAOfflineItem extends NSObject  {
  // 生成getters
  Future<String> get_name() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod("MAOfflineItem::get_name", {'refId': refId});
  
    return result;
  }
  
  Future<String> get_jianpin() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod("MAOfflineItem::get_jianpin", {'refId': refId});
  
    return result;
  }
  
  Future<String> get_pinyin() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod("MAOfflineItem::get_pinyin", {'refId': refId});
  
    return result;
  }
  
  Future<String> get_adcode() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod("MAOfflineItem::get_adcode", {'refId': refId});
  
    return result;
  }
  
  Future<MAOfflineItemStatus> get_itemStatus() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod("MAOfflineItem::get_itemStatus", {'refId': refId});
  
    return MAOfflineItemStatus.values[result];
  }
  

  // 生成setters
  

  // 生成方法们
  
}