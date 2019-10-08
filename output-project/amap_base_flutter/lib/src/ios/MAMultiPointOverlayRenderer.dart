import 'dart:typed_data';

import 'package:amap_base_flutter/src/ios/ios.export.dart';
import 'package:amap_base_flutter/src/android/android.export.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import
class MAMultiPointOverlayRenderer extends MAOverlayRenderer  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<CGPoint> get_anchor() async {
    final result = await _channel.invokeMethod("MAMultiPointOverlayRenderer::get_anchor", {'refId': refId});
    return CGPoint()..refId = result;
  }
  
  Future<MAMultiPointOverlay> get_multiPointOverlay() async {
    final result = await _channel.invokeMethod("MAMultiPointOverlayRenderer::get_multiPointOverlay", {'refId': refId});
    return MAMultiPointOverlay()..refId = result;
  }
  

  // 生成setters
  Future<void> set_delegate(MAMultiPointOverlayRendererDelegate delegate) async {
    await _channel.invokeMethod('MAMultiPointOverlayRenderer::set_delegate', {'refId': refId, "delegate": delegate.refId});
  
    MethodChannel('MAMultiPointOverlayRendererDelegate::Callback')
      .setMethodCallHandler((methodCall) async {
        final args = methodCall.arguments as Map;
        // final refId = args['callerRefId'] as int;
        // if (refId != this.refId) return;
  
        switch (methodCall.method) {
          case 'Callback::MAMultiPointOverlayRendererDelegate::multiPointOverlayRendererDidItemTapped':
            // 日志打印
            print('fluttify-dart-callback: multiPointOverlayRendererDidItemTapped([])');
        
              // 调用回调方法
            delegate?.multiPointOverlayRendererDidItemTapped(MAMultiPointOverlayRenderer()..refId = (args['renderer']), MAMultiPointItem()..refId = (args['item']));
            break;
          default:
            break;
        }
      });
  }
  
  Future<void> set_anchor(CGPoint anchor) async {
    await _channel.invokeMethod('MAMultiPointOverlayRenderer::set_anchor', {'refId': refId, "anchor": anchor.refId});
  
  
  }
  

  // 生成方法们
  Future<MAMultiPointOverlayRenderer> initWithMultiPointOverlay(MAMultiPointOverlay multiPointOverlay) async {
    // 日志打印
    print('fluttify-dart: MAMultiPointOverlayRenderer@$refId::initWithMultiPointOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAMultiPointOverlayRenderer::initWithMultiPointOverlay', {"multiPointOverlay": multiPointOverlay.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    if (result == null) {
      return null;
    } else {
      return MAMultiPointOverlayRenderer()..refId = result;
    }
  }
  
}