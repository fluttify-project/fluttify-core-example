import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAAnnotationMoveAnimation extends NSObject {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters

  // 生成setters

  // 生成方法们
  Future<String> name() async {
    // 日志打印
    print('fluttify-dart: MAAnnotationMoveAnimation@$refId::name([])');

    // 调用原生方法
    final result = await _channel
        .invokeMethod('MAAnnotationMoveAnimation::name', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<CLLocationCoordinate2D> coordinates() async {
    // 日志打印
    print('fluttify-dart: MAAnnotationMoveAnimation@$refId::coordinates([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAAnnotationMoveAnimation::coordinates', {"refId": refId});

    // 接受原生回调

    // 返回值
    return CLLocationCoordinate2D()..refId = result;
  }

  Future<int> count() async {
    // 日志打印
    print('fluttify-dart: MAAnnotationMoveAnimation@$refId::count([])');

    // 调用原生方法
    final result = await _channel
        .invokeMethod('MAAnnotationMoveAnimation::count', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<double> duration() async {
    // 日志打印
    print('fluttify-dart: MAAnnotationMoveAnimation@$refId::duration([])');

    // 调用原生方法
    final result = await _channel
        .invokeMethod('MAAnnotationMoveAnimation::duration', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<double> elapsedTime() async {
    // 日志打印
    print('fluttify-dart: MAAnnotationMoveAnimation@$refId::elapsedTime([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAAnnotationMoveAnimation::elapsedTime', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<String> cancel() async {
    // 日志打印
    print('fluttify-dart: MAAnnotationMoveAnimation@$refId::cancel([])');

    // 调用原生方法
    final result = await _channel
        .invokeMethod('MAAnnotationMoveAnimation::cancel', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<bool> isCancelled() async {
    // 日志打印
    print('fluttify-dart: MAAnnotationMoveAnimation@$refId::isCancelled([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAAnnotationMoveAnimation::isCancelled', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }

  Future<int> passedPointCount() async {
    // 日志打印
    print(
        'fluttify-dart: MAAnnotationMoveAnimation@$refId::passedPointCount([])');

    // 调用原生方法
    final result = await _channel.invokeMethod(
        'MAAnnotationMoveAnimation::passedPointCount', {"refId": refId});

    // 接受原生回调

    // 返回值
    return result;
  }
}
