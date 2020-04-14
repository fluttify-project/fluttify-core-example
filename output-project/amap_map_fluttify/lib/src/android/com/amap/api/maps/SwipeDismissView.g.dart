// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import, unused_local_variable, dead_code
//////////////////////////////////////////////////////////
// GENERATED BY FLUTTIFY. DO NOT EDIT IT.
//////////////////////////////////////////////////////////

import 'dart:typed_data';

import 'package:amap_map_fluttify/src/ios/ios.export.g.dart';
import 'package:amap_map_fluttify/src/android/android.export.g.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';

import 'package:foundation_fluttify/foundation_fluttify.dart';

class com_amap_api_maps_SwipeDismissView extends android_widget_RelativeLayout  {
  //region constants
  
  //endregion

  //region creators
  static Future<com_amap_api_maps_SwipeDismissView> create__android_content_Context__android_view_View(android_content_Context var1, android_view_View var2) async {
    final int refId = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('ObjectFactory::createcom_amap_api_maps_SwipeDismissView__android_content_Context__android_view_View', {"var1": var1.refId, "var2": var2.refId});
    final object = com_amap_api_maps_SwipeDismissView()..refId = refId..tag = 'amap_map_fluttify';
  
    kNativeObjectPool.add(object);
    return object;
  }
  
  static Future<List<com_amap_api_maps_SwipeDismissView>> create_batch__android_content_Context__android_view_View(List<android_content_Context> var1, List<android_view_View> var2) async {
    if (var1.length != var2.length) {
      return Future.error('all args must have same length!');
    }
    final List resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('ObjectFactory::create_batchcom_amap_api_maps_SwipeDismissView__android_content_Context__android_view_View', [for (int i = 0; i < var1.length; i++) {"var1": var1[i].refId, "var2": var2[i].refId}]);
  
    final List<com_amap_api_maps_SwipeDismissView> typedResult = resultBatch.map((result) => com_amap_api_maps_SwipeDismissView()..refId = result..tag = 'amap_map_fluttify').toList();
    kNativeObjectPool.addAll(typedResult);
    return typedResult;
  }
  
  //endregion

  //region getters
  
  //endregion

  //region setters
  
  //endregion

  //region methods
  Future<void> setCallback(com_amap_api_maps_WearMapView_OnDismissCallback var1) async {
    // print log
    if (fluttifyLogEnabled) {
      print('fluttify-dart: com.amap.api.maps.SwipeDismissView@$refId::setCallback([])');
    }
  
    // invoke native method
    final result = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.amap.api.maps.SwipeDismissView::setCallback', {"refId": refId});
  
  
    // handle native call
    MethodChannel('com.amap.api.maps.SwipeDismissView::setCallback::Callback')
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          // final refId = args['callerRefId'] as int;
          // if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'Callback::com.amap.api.maps.WearMapView.OnDismissCallback::onDismiss':
              // print log
              if (fluttifyLogEnabled) {
                print('fluttify-dart-callback: onDismiss([])');
              }
        
              // handle the native call
              var1?.onDismiss();
              break;
            case 'Callback::com.amap.api.maps.WearMapView.OnDismissCallback::onNotifySwipe':
              // print log
              if (fluttifyLogEnabled) {
                print('fluttify-dart-callback: onNotifySwipe([])');
              }
        
              // handle the native call
              var1?.onNotifySwipe();
              break;
            default:
              break;
          }
        });
  
    // convert native result to dart side object
    if (result == null) {
      return null;
    } else {
    
      return result;
    }
  }
  
  //endregion
}

extension com_amap_api_maps_SwipeDismissView_Batch on List<com_amap_api_maps_SwipeDismissView> {
  //region getters
  
  //endregion

  //region setters
  
  //endregion

  //region methods
  
  //endregion
}