import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMultiPointOverlayRenderer extends MAOverlayRenderer  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<MAMultiPointOverlayRendererDelegate> get_delegate() async {
    final result = await _channel.invokeMethod("MAMultiPointOverlayRenderer::get_delegate", {'refId': refId});
    return result;
  }
  
  Future<CGPoint> get_anchor() async {
    final result = await _channel.invokeMethod("MAMultiPointOverlayRenderer::get_anchor", {'refId': refId});
    return result;
  }
  
  Future<MAMultiPointOverlay> get_multiPointOverlay() async {
    final result = await _channel.invokeMethod("MAMultiPointOverlayRenderer::get_multiPointOverlay", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_delegate(MAMultiPointOverlayRendererDelegate delegate) async {
    await _channel.invokeMethod('MAMultiPointOverlayRenderer::set_delegate', {'refId': refId, "delegate": ""});
  
    MethodChannel('MAMultiPointOverlayRendererDelegate::Callback')
      .setMethodCallHandler((methodCall) async {
        final args = methodCall.arguments as Map;
        // final refId = args['callerRefId'] as int;
        // if (refId != this.refId) return;
  
        switch (methodCall.method) {
          case 'Callback::MAMultiPointOverlayRendererDelegate::multiPointOverlayRendererDidItemTapped':
            // 日志打印
            print('fluttify-dart-callback: multiPointOverlayRenderer([])');
        
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
    return MAMultiPointOverlayRenderer()..refId = result;
  }
  
}