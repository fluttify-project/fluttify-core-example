import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_GLMapEngine extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<String> reloadMapResource(int var1, String var2, int var3) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::reloadMapResource([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::reloadMapResource', {"var1": var1, "var2": var2, "var3": var3, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> generateRequestId() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::generateRequestId([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::generateRequestId', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> requireMapRender(int var1, int var2, int var3) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::requireMapRender([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::requireMapRender', {"var1": var1, "var2": var2, "var3": var3, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onMapRender(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::onMapRender([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::onMapRender', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getMapDataTaskIsCancel(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getMapDataTaskIsCancel([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getMapDataTaskIsCancel', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> finishDownLoad(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::finishDownLoad([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::finishDownLoad', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> netError(int var1, int var2, int var4) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::netError([\'var1\':$var1, \'var2\':$var2, \'var4\':$var4])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::netError', {"var1": var1, "var2": var2, "var4": var4, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMapLoaderToTask(int var1, int var2, com_autonavi_amap_mapcore_maploader_AMapLoader var4) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setMapLoaderToTask([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setMapLoaderToTask', {"var1": var1, "var2": var2, "var4": var4.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<android_content_Context> getContext() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getContext([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getContext', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return android_content_Context()..refId = result;
  }
  
   Future<String> getUserAgent() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getUserAgent([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getUserAgent', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setParamater(int var1, int var2, int var3, int var4, int var5, int var6) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setParamater([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setParamater', {"var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onClearCache(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::onClearCache([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::onClearCache', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isInMapAction(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::isInMapAction([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::isInMapAction', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getNativeInstance() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getNativeInstance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getNativeInstance', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> canStopMapRender(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::canStopMapRender([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::canStopMapRender', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getEngineIDWithType(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getEngineIDWithType([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getEngineIDWithType', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isEngineCreated(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::isEngineCreated([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::isEngineCreated', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getMapStateInstance(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getMapStateInstance([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getMapStateInstance', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getEngineIDWithGestureInfo(com_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getEngineIDWithGestureInfo([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getEngineIDWithGestureInfo', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setServiceViewRect(int var1, int var2, int var3, int var4, int var5, int var6, int var7) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setServiceViewRect([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6, \'var7\':$var7])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setServiceViewRect', {"var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "var7": var7, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setSrvViewStateBoolValue(int var1, int var2, bool var3) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setSrvViewStateBoolValue([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setSrvViewStateBoolValue', {"var1": var1, "var2": var2, "var3": var3, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getSrvViewStateBoolValue(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getSrvViewStateBoolValue([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getSrvViewStateBoolValue', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> getIsProcessBuildingMark(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getIsProcessBuildingMark([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getIsProcessBuildingMark', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setIndoorBuildingToBeActive(int var1, String var2, int var3, String var4) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setIndoorBuildingToBeActive([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setIndoorBuildingToBeActive', {"var1": var1, "var2": var2, "var3": var3, "var4": var4, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMapListener(com_autonavi_amap_mapcore_interfaces_IAMapListener var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setMapListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setMapListener', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_autonavi_ae_gmap_GLMapState> getMapState(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getMapState([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getMapState', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_autonavi_ae_gmap_GLMapState()..refId = result;
  }
  
   Future<com_autonavi_ae_gmap_GLMapState> getNewMapState(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getNewMapState([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getNewMapState', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_autonavi_ae_gmap_GLMapState()..refId = result;
  }
  
   Future<com_autonavi_ae_gmap_GLMapState> getCloneMapState() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getCloneMapState([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getCloneMapState', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_autonavi_ae_gmap_GLMapState()..refId = result;
  }
  
   Future<String> setMapState(int var1, com_autonavi_ae_gmap_GLMapState var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setMapState([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setMapState', {"var1": var1, "var2": var2.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> addGestureMessage(int var1, com_autonavi_amap_mapcore_message_AbstractGestureMapMessage var2, bool var3, int var4, int var5) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::addGestureMessage([\'var1\':$var1, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::addGestureMessage', {"var1": var1, "var2": var2.refId, "var3": var3, "var4": var4, "var5": var5, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> interruptAnimation() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::interruptAnimation([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::interruptAnimation', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> addGroupAnimation(int var1, int var2, double var3, int var4, int var5, int var6, int var7, com_amap_api_maps_AMap_CancelableCallback var8) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::addGroupAnimation([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6, \'var7\':$var7])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::addGroupAnimation', {"var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "var7": var7, "refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.autonavi.ae.gmap.GLMapEngine::addGroupAnimation::Callback')
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          // final refId = args['callerRefId'] as int;
          // if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'Callback::com.amap.api.maps.AMap.CancelableCallback::onFinish':
              // 日志打印
              print('fluttify-dart-callback: onFinish([])');
        
                // 调用回调方法
              var8?.onFinish();
              break;
            case 'Callback::com.amap.api.maps.AMap.CancelableCallback::onCancel':
              // 日志打印
              print('fluttify-dart-callback: onCancel([])');
        
                // 调用回调方法
              var8?.onCancel();
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<bool> isInMapAnimation(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::isInMapAnimation([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::isInMapAnimation', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getAnimateionsCount() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getAnimateionsCount([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getAnimateionsCount', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> clearAllMessages(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::clearAllMessages([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::clearAllMessages', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> clearAnimations(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::clearAnimations([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::clearAnimations', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> startMapSlidAnim(int var1, android_graphics_Point var2, double var3, double var4) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::startMapSlidAnim([\'var1\':$var1, \'var3\':$var3, \'var4\':$var4])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::startMapSlidAnim', {"var1": var1, "var2": var2.refId, "var3": var3, "var4": var4, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> startPivotZoomRotateAnim(int var1, android_graphics_Point var2, double var3, int var4, int var5) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::startPivotZoomRotateAnim([\'var1\':$var1, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::startPivotZoomRotateAnim', {"var1": var1, "var2": var2.refId, "var3": var3, "var4": var4, "var5": var5, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getStateMessageCount() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getStateMessageCount([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getStateMessageCount', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> addMessage(com_autonavi_amap_mapcore_AbstractCameraUpdateMessage var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::addMessage([\'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::addMessage', {"var1": var1.refId, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_autonavi_amap_mapcore_AbstractCameraUpdateMessage> getStateMessage() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getStateMessage([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getStateMessage', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_autonavi_amap_mapcore_AbstractCameraUpdateMessage()..refId = result;
  }
  
   Future<String> setMapOpenLayer(String var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setMapOpenLayer([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setMapOpenLayer', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> pushRendererState() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::pushRendererState([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::pushRendererState', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> popRendererState() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::popRendererState([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::popRendererState', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> networkStateChanged(android_content_Context var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::networkStateChanged([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::networkStateChanged', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> createOverlay(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::createOverlay([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::createOverlay', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> addNativeOverlay(int var1, int var2, int var3) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::addNativeOverlay([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::addNativeOverlay', {"var1": var1, "var2": var2, "var3": var3, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getGlOverlayMgrPtr(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::getGlOverlayMgrPtr([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::getGlOverlayMgrPtr', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> addOverlayTexture(int var1, com_autonavi_ae_gmap_gloverlay_GLTextureProperty var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::addOverlayTexture([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::addOverlayTexture', {"var1": var1, "var2": var2.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> destroyOverlay(int var0, int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine::destroyOverlay([\'var0\':$var0, \'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::destroyOverlay', {"var0": var0, "var1": var1});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setSimple3DEnable(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setSimple3DEnable([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setSimple3DEnable', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRoadArrowEnable(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setRoadArrowEnable([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setRoadArrowEnable', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setTrafficEnable(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setTrafficEnable([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setTrafficEnable', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setBuildingEnable(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setBuildingEnable([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setBuildingEnable', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setLabelEnable(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setLabelEnable([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setLabelEnable', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setAllContentEnable(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setAllContentEnable([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setAllContentEnable', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setProjectionCenter(int var1, int var2, int var3) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setProjectionCenter([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setProjectionCenter', {"var1": var1, "var2": var2, "var3": var3, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setTrafficStyle(int var1, int var2, int var3, int var4, int var5, bool var6) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setTrafficStyle([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setTrafficStyle', {"var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> startCheckEngineRenderComplete() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::startCheckEngineRenderComplete([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::startCheckEngineRenderComplete', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setIndoorEnable(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setIndoorEnable([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setIndoorEnable', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setOfflineDataEnable(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setOfflineDataEnable([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setOfflineDataEnable', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setHighlightSubwayEnable(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setHighlightSubwayEnable([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setHighlightSubwayEnable', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setBuildingTextureEnable(int var1, bool var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::setBuildingTextureEnable([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::setBuildingTextureEnable', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> initNativeTexture(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::initNativeTexture([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::initNativeTexture', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> AddOverlayTexture(int var1, android_graphics_Bitmap var2, int var3, int var4) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::AddOverlayTexture([\'var1\':$var1, \'var3\':$var3, \'var4\':$var4])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::AddOverlayTexture', {"var1": var1, "var2": var2.refId, "var3": var3, "var4": var4, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> removeNativeOverlay(int var1, String var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::removeNativeOverlay([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::removeNativeOverlay', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> removeNativeAllOverlay(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::removeNativeAllOverlay([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::removeNativeAllOverlay', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> createAMapInstance(com_autonavi_ae_gmap_GLMapEngine_InitParam var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::createAMapInstance([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::createAMapInstance', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> createAMapEngineWithFrame(com_autonavi_ae_gmap_GLMapEngine_MapViewInitParam var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::createAMapEngineWithFrame([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::createAMapEngineWithFrame', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> changeSurface(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::changeSurface([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::changeSurface', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> renderAMap() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::renderAMap([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::renderAMap', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> releaseNetworkState() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::releaseNetworkState([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::releaseNetworkState', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> cancelAllAMapDownload() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::cancelAllAMapDownload([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::cancelAllAMapDownload', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> destroyAMapEngine() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine@$refId::destroyAMapEngine([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::destroyAMapEngine', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
  static Future<String> nativeGetMapEngineVersion(int var0) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapEngine::nativeGetMapEngineVersion([\'var0\':$var0])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapEngine::nativeGetMapEngineVersion', {"var0": var0});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}