import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAOfflineMap extends NSObject {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAOfflineItemNationWide> get_nationWide() async {
    final result = await _channel
        .invokeMethod("MAOfflineMap::get_nationWide", {'refId': refId});
    return result;
  }

  Future<String> get_version() async {
    final result = await _channel
        .invokeMethod("MAOfflineMap::get_version", {'refId': refId});
    return result;
  }

  // 生成setters

  // 生成方法们
  static Future<MAOfflineMap> sharedOfflineMap() async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap::sharedOfflineMap([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
      'MAOfflineMap::sharedOfflineMap',
    );

    // 接受原生回调

    // 返回值
    return MAOfflineMap()..refId = result;
  }

  Future<String> setupWithCompletionBlock(void block(bool setupSuccess)) async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::setupWithCompletionBlock([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAOfflineMap::setupWithCompletionBlock', {"refId": refId});

    // 接受原生回调
    MethodChannel('MAOfflineMap::Callback')
        .setMethodCallHandler((methodCall) async {
      final args = methodCall.arguments as Map;
      // final refId = args['callerRefId'] as int;
      // if (refId != this.refId) return;

      switch (methodCall.method) {
        case 'MAOfflineMap::setupWithCompletionBlock_Callback::block':
          // 日志打印

          // 调用回调方法
          block(args['setupSuccess']);
          break;
        default:
          break;
      }
    });

    // 返回值
    return result;
  }

  Future<bool> isDownloadingForItem(MAOfflineItem item) async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::isDownloadingForItem([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAOfflineMap::isDownloadingForItem',
        {"item": item.refId, "refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<bool> pauseItem(MAOfflineItem item) async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::pauseItem([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAOfflineMap::pauseItem', {"item": item.refId, "refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<String> deleteItem(MAOfflineItem item) async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::deleteItem([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAOfflineMap::deleteItem', {"item": item.refId, "refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<String> cancelAll() async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::cancelAll([])');

    // 调用原生方法
    final result = await _channel
        .invokeMethod('MAOfflineMap::cancelAll', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<String> clearDisk() async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::clearDisk([])');

    // 调用原生方法
    final result = await _channel
        .invokeMethod('MAOfflineMap::clearDisk', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<bool> isDownloadingForCity(MAOfflineCity city) async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::isDownloadingForCity([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAOfflineMap::isDownloadingForCity',
        {"city": city.refId, "refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<String> pause(MAOfflineCity city) async {
    // 日志打印
    print('fluttify-dart: MAOfflineMap@$refId::pause([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAOfflineMap::pause', {"city": city.refId, "refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }
}
