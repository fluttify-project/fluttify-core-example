import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAOfflineItem {
  MAOfflineItem.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<String> get_name() async {
    final result = await _channel.invokeMethod("MAOfflineItem::get_name", {'refId': refId});
    return result;
  }
  
  Future<String> get_jianpin() async {
    final result = await _channel.invokeMethod("MAOfflineItem::get_jianpin", {'refId': refId});
    return result;
  }
  
  Future<String> get_pinyin() async {
    final result = await _channel.invokeMethod("MAOfflineItem::get_pinyin", {'refId': refId});
    return result;
  }
  
  Future<String> get_adcode() async {
    final result = await _channel.invokeMethod("MAOfflineItem::get_adcode", {'refId': refId});
    return result;
  }
  
  Future<MAOfflineItemStatus> get_itemStatus() async {
    final result = await _channel.invokeMethod("MAOfflineItem::get_itemStatus", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}