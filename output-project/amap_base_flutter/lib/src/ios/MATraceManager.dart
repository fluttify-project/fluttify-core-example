import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MATraceManager extends NSObject {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MATraceDelegate> get_delegate() async {
    final result = await _channel
        .invokeMethod("MATraceManager::get_delegate", {'refId': refId});
    return result;
  }

  // 生成setters
  Future<void> set_delegate(MATraceDelegate delegate) async {
    await _channel.invokeMethod(
        'MATraceManager::set_delegate', {'refId': refId, "delegate": ""});

    MethodChannel('MATraceDelegate::Callback')
        .setMethodCallHandler((methodCall) async {
      final args = methodCall.arguments as Map;
      // final refId = args['callerRefId'] as int;
      // if (refId != this.refId) return;

      switch (methodCall.method) {
        case 'Callback::MATraceDelegate::traceManagerDidTracecorrectdistancewithError':
          // 日志打印
          print(
              'fluttify-dart-callback: traceManagerDidTracecorrectdistancewithError([\'distance\':$args[distance]])');

          // 调用回调方法
          delegate?.traceManagerDidTracecorrectdistancewithError(
              MATraceManager()..refId = (args['manager']),
              [],
              [],
              args['distance'],
              NSError()..refId = (args['error']));
          break;
        case 'Callback::MATraceDelegate::mapViewRequireLocationAuth':
          // 日志打印
          print('fluttify-dart-callback: mapViewRequireLocationAuth([])');

          // 调用回调方法
          delegate?.mapViewRequireLocationAuth(
              CLLocationManager()..refId = (args['locationManager']));
          break;
        default:
          break;
      }
    });
  }

  // 生成方法们
  static Future<MATraceManager> sharedInstance() async {
    // 日志打印
    print('fluttify-dart: MATraceManager::sharedInstance([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
      'MATraceManager::sharedInstance',
    );

    // 接受原生回调

    // 返回值
    return MATraceManager()..refId = result;
  }

  Future<String> stopTrace() async {
    // 日志打印
    print('fluttify-dart: MATraceManager@$refId::stopTrace([])');

    // 调用原生方法
    final result = await _channel
        .invokeMethod('MATraceManager::stopTrace', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<String> start() async {
    // 日志打印
    print('fluttify-dart: MATraceManager@$refId::start([])');

    // 调用原生方法
    final result =
        await _channel.invokeMethod('MATraceManager::start', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<String> stop() async {
    // 日志打印
    print('fluttify-dart: MATraceManager@$refId::stop([])');

    // 调用原生方法
    final result =
        await _channel.invokeMethod('MATraceManager::stop', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }
}
