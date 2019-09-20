import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_model_TileOverlayOptions extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<com_amap_api_maps_model_TileOverlayOptions> tileProvider(com_amap_api_maps_model_TileProvider var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::tileProvider([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::tileProvider', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.model.TileOverlayOptions::Callback')
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          // final refId = args['callerRefId'] as int;
          // if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'Callback::com.amap.api.maps.model.TileProvider::getTile':
              // 日志打印
              print('fluttify-dart-callback: getTile([\'var1\':$args[var1], \'var2\':$args[var2], \'var3\':$args[var3]])');
        
                // 调用回调方法
              var1?.getTile(args['var1'], args['var2'], args['var3']);
              break;
            case 'Callback::com.amap.api.maps.model.TileProvider::getTileWidth':
              // 日志打印
              print('fluttify-dart-callback: getTileWidth([])');
        
                // 调用回调方法
              var1?.getTileWidth();
              break;
            case 'Callback::com.amap.api.maps.model.TileProvider::getTileHeight':
              // 日志打印
              print('fluttify-dart-callback: getTileHeight([])');
        
                // 调用回调方法
              var1?.getTileHeight();
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return com_amap_api_maps_model_TileOverlayOptions()..refId = result;
  }
  
   Future<com_amap_api_maps_model_TileOverlayOptions> zIndex(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::zIndex([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::zIndex', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_TileOverlayOptions()..refId = result;
  }
  
   Future<com_amap_api_maps_model_TileOverlayOptions> visible(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::visible([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::visible', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_TileOverlayOptions()..refId = result;
  }
  
   Future<com_amap_api_maps_model_TileOverlayOptions> memCacheSize(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::memCacheSize([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::memCacheSize', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_TileOverlayOptions()..refId = result;
  }
  
   Future<com_amap_api_maps_model_TileOverlayOptions> diskCacheSize(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::diskCacheSize([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::diskCacheSize', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_TileOverlayOptions()..refId = result;
  }
  
   Future<com_amap_api_maps_model_TileOverlayOptions> diskCacheDir(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::diskCacheDir([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::diskCacheDir', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_TileOverlayOptions()..refId = result;
  }
  
   Future<com_amap_api_maps_model_TileOverlayOptions> memoryCacheEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::memoryCacheEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::memoryCacheEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_TileOverlayOptions()..refId = result;
  }
  
   Future<com_amap_api_maps_model_TileOverlayOptions> diskCacheEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::diskCacheEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::diskCacheEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_TileOverlayOptions()..refId = result;
  }
  
   Future<com_amap_api_maps_model_TileProvider> getTileProvider() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::getTileProvider([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::getTileProvider', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_TileProvider()..refId = result;
  }
  
   Future<double> getZIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::getZIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::getZIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isVisible() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::isVisible([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::isVisible', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getMemCacheSize() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::getMemCacheSize([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::getMemCacheSize', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getDiskCacheSize() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::getDiskCacheSize([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::getDiskCacheSize', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getDiskCacheDir() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::getDiskCacheDir([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::getDiskCacheDir', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getMemoryCacheEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::getMemoryCacheEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::getMemoryCacheEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getDiskCacheEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.model.TileOverlayOptions@$refId::getDiskCacheEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.model.TileOverlayOptions::getDiskCacheEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}