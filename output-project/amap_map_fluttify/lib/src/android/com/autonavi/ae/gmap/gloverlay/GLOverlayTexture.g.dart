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

class com_autonavi_ae_gmap_gloverlay_GLOverlayTexture extends java_lang_Object  {
  //region constants
  
  //endregion

  //region creators
  static Future<com_autonavi_ae_gmap_gloverlay_GLOverlayTexture> create__int__int__int__int(int var1, int var2, int var3, int var4) async {
    final int refId = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_gloverlay_GLOverlayTexture__int__int__int__int', {"var1": var1, "var2": var2, "var3": var3, "var4": var4});
    final object = com_autonavi_ae_gmap_gloverlay_GLOverlayTexture()..refId = refId..tag = 'amap_map_fluttify';
  
    kNativeObjectPool.add(object);
    return object;
  }
  
  static Future<com_autonavi_ae_gmap_gloverlay_GLOverlayTexture> create__int__int__float__float__int__int(int var1, int var2, double var3, double var4, int var5, int var6) async {
    final int refId = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_gloverlay_GLOverlayTexture__int__int__float__float__int__int', {"var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6});
    final object = com_autonavi_ae_gmap_gloverlay_GLOverlayTexture()..refId = refId..tag = 'amap_map_fluttify';
  
    kNativeObjectPool.add(object);
    return object;
  }
  
  static Future<List<com_autonavi_ae_gmap_gloverlay_GLOverlayTexture>> create_batch__int__int__int__int(List<int> var1, List<int> var2, List<int> var3, List<int> var4) async {
    if (var1.length != var2.length || var2.length != var3.length || var3.length != var4.length) {
      return Future.error('all args must have same length!');
    }
    final List resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('ObjectFactory::create_batchcom_autonavi_ae_gmap_gloverlay_GLOverlayTexture__int__int__int__int', [for (int i = 0; i < var1.length; i++) {"var1": var1[i], "var2": var2[i], "var3": var3[i], "var4": var4[i]}]);
  
    final List<com_autonavi_ae_gmap_gloverlay_GLOverlayTexture> typedResult = resultBatch.map((result) => com_autonavi_ae_gmap_gloverlay_GLOverlayTexture()..refId = result..tag = 'amap_map_fluttify').toList();
    kNativeObjectPool.addAll(typedResult);
    return typedResult;
  }
  
  static Future<List<com_autonavi_ae_gmap_gloverlay_GLOverlayTexture>> create_batch__int__int__float__float__int__int(List<int> var1, List<int> var2, List<double> var3, List<double> var4, List<int> var5, List<int> var6) async {
    if (var1.length != var2.length || var2.length != var3.length || var3.length != var4.length || var4.length != var5.length || var5.length != var6.length) {
      return Future.error('all args must have same length!');
    }
    final List resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('ObjectFactory::create_batchcom_autonavi_ae_gmap_gloverlay_GLOverlayTexture__int__int__float__float__int__int', [for (int i = 0; i < var1.length; i++) {"var1": var1[i], "var2": var2[i], "var3": var3[i], "var4": var4[i], "var5": var5[i], "var6": var6[i]}]);
  
    final List<com_autonavi_ae_gmap_gloverlay_GLOverlayTexture> typedResult = resultBatch.map((result) => com_autonavi_ae_gmap_gloverlay_GLOverlayTexture()..refId = result..tag = 'amap_map_fluttify').toList();
    kNativeObjectPool.addAll(typedResult);
    return typedResult;
  }
  
  //endregion

  //region getters
  Future<int> get_mResId() async {
    final result = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mResId", {'refId': refId});
  
    return result;
  }
  
  Future<int> get_mWidth() async {
    final result = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mWidth", {'refId': refId});
  
    return result;
  }
  
  Future<int> get_mHeight() async {
    final result = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mHeight", {'refId': refId});
  
    return result;
  }
  
  Future<int> get_mResWidth() async {
    final result = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mResWidth", {'refId': refId});
  
    return result;
  }
  
  Future<int> get_mResHeight() async {
    final result = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mResHeight", {'refId': refId});
  
    return result;
  }
  
  Future<double> get_mAnchorXRatio() async {
    final result = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mAnchorXRatio", {'refId': refId});
  
    return result;
  }
  
  Future<double> get_mAnchorYRatio() async {
    final result = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mAnchorYRatio", {'refId': refId});
  
    return result;
  }
  
  Future<int> get_mAnchor() async {
    final result = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mAnchor", {'refId': refId});
  
    return result;
  }
  
  //endregion

  //region setters
  Future<void> set_mResId(int mResId) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mResId', {'refId': refId, "mResId": mResId});
  
  
  }
  
  Future<void> set_mWidth(int mWidth) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mWidth', {'refId': refId, "mWidth": mWidth});
  
  
  }
  
  Future<void> set_mHeight(int mHeight) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mHeight', {'refId': refId, "mHeight": mHeight});
  
  
  }
  
  Future<void> set_mResWidth(int mResWidth) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mResWidth', {'refId': refId, "mResWidth": mResWidth});
  
  
  }
  
  Future<void> set_mResHeight(int mResHeight) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mResHeight', {'refId': refId, "mResHeight": mResHeight});
  
  
  }
  
  Future<void> set_mAnchorXRatio(double mAnchorXRatio) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mAnchorXRatio', {'refId': refId, "mAnchorXRatio": mAnchorXRatio});
  
  
  }
  
  Future<void> set_mAnchorYRatio(double mAnchorYRatio) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mAnchorYRatio', {'refId': refId, "mAnchorYRatio": mAnchorYRatio});
  
  
  }
  
  Future<void> set_mAnchor(int mAnchor) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mAnchor', {'refId': refId, "mAnchor": mAnchor});
  
  
  }
  
  //endregion

  //region methods
  
  //endregion
}

extension com_autonavi_ae_gmap_gloverlay_GLOverlayTexture_Batch on List<com_autonavi_ae_gmap_gloverlay_GLOverlayTexture> {
  //region getters
  Future<List<int>> get_mResId_batch() async {
    final resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mResId_batch", [for (final item in this) {'refId': item.refId}]);
    final typedResult = (resultBatch as List).map((result) => result).toList();
  
    return typedResult;
  }
  
  Future<List<int>> get_mWidth_batch() async {
    final resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mWidth_batch", [for (final item in this) {'refId': item.refId}]);
    final typedResult = (resultBatch as List).map((result) => result).toList();
  
    return typedResult;
  }
  
  Future<List<int>> get_mHeight_batch() async {
    final resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mHeight_batch", [for (final item in this) {'refId': item.refId}]);
    final typedResult = (resultBatch as List).map((result) => result).toList();
  
    return typedResult;
  }
  
  Future<List<int>> get_mResWidth_batch() async {
    final resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mResWidth_batch", [for (final item in this) {'refId': item.refId}]);
    final typedResult = (resultBatch as List).map((result) => result).toList();
  
    return typedResult;
  }
  
  Future<List<int>> get_mResHeight_batch() async {
    final resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mResHeight_batch", [for (final item in this) {'refId': item.refId}]);
    final typedResult = (resultBatch as List).map((result) => result).toList();
  
    return typedResult;
  }
  
  Future<List<double>> get_mAnchorXRatio_batch() async {
    final resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mAnchorXRatio_batch", [for (final item in this) {'refId': item.refId}]);
    final typedResult = (resultBatch as List).map((result) => result).toList();
  
    return typedResult;
  }
  
  Future<List<double>> get_mAnchorYRatio_batch() async {
    final resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mAnchorYRatio_batch", [for (final item in this) {'refId': item.refId}]);
    final typedResult = (resultBatch as List).map((result) => result).toList();
  
    return typedResult;
  }
  
  Future<List<int>> get_mAnchor_batch() async {
    final resultBatch = await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::get_mAnchor_batch", [for (final item in this) {'refId': item.refId}]);
    final typedResult = (resultBatch as List).map((result) => result).toList();
  
    return typedResult;
  }
  
  //endregion

  //region setters
  Future<void> set_mResId_batch(List<int> mResId) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mResId_batch', [for (int i = 0; i < this.length; i++) {'refId': this[i].refId, "mResId": mResId[i]}]);
  
  
  }
  
  Future<void> set_mWidth_batch(List<int> mWidth) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mWidth_batch', [for (int i = 0; i < this.length; i++) {'refId': this[i].refId, "mWidth": mWidth[i]}]);
  
  
  }
  
  Future<void> set_mHeight_batch(List<int> mHeight) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mHeight_batch', [for (int i = 0; i < this.length; i++) {'refId': this[i].refId, "mHeight": mHeight[i]}]);
  
  
  }
  
  Future<void> set_mResWidth_batch(List<int> mResWidth) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mResWidth_batch', [for (int i = 0; i < this.length; i++) {'refId': this[i].refId, "mResWidth": mResWidth[i]}]);
  
  
  }
  
  Future<void> set_mResHeight_batch(List<int> mResHeight) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mResHeight_batch', [for (int i = 0; i < this.length; i++) {'refId': this[i].refId, "mResHeight": mResHeight[i]}]);
  
  
  }
  
  Future<void> set_mAnchorXRatio_batch(List<double> mAnchorXRatio) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mAnchorXRatio_batch', [for (int i = 0; i < this.length; i++) {'refId': this[i].refId, "mAnchorXRatio": mAnchorXRatio[i]}]);
  
  
  }
  
  Future<void> set_mAnchorYRatio_batch(List<double> mAnchorYRatio) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mAnchorYRatio_batch', [for (int i = 0; i < this.length; i++) {'refId': this[i].refId, "mAnchorYRatio": mAnchorYRatio[i]}]);
  
  
  }
  
  Future<void> set_mAnchor_batch(List<int> mAnchor) async {
    await MethodChannel('me.yohom/amap_map_fluttify').invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayTexture::set_mAnchor_batch', [for (int i = 0; i < this.length; i++) {'refId': this[i].refId, "mAnchor": mAnchor[i]}]);
  
  
  }
  
  //endregion

  //region methods
  
  //endregion
}