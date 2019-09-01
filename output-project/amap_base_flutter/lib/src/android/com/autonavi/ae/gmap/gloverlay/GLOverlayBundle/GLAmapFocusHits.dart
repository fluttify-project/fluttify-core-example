import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits extends Ref_Android {
  com_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_mOverlayHashCode() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayBundle.GLAmapFocusHits::get_mOverlayHashCode", {'refId': refId});
    return result;
  }
  
  Future<int> get_mHitedIndex() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayBundle.GLAmapFocusHits::get_mHitedIndex", {'refId': refId});
    return result;
  }
  
  Future<int> get_mHitedTimes() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gloverlay.GLOverlayBundle.GLAmapFocusHits::get_mHitedTimes", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_mOverlayHashCode(int mOverlayHashCode) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayBundle.GLAmapFocusHits::set_mOverlayHashCode', {'refId': refId, "mOverlayHashCode": mOverlayHashCode});
  }
  
  Future<void> set_mHitedIndex(int mHitedIndex) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayBundle.GLAmapFocusHits::set_mHitedIndex', {'refId': refId, "mHitedIndex": mHitedIndex});
  }
  
  Future<void> set_mHitedTimes(int mHitedTimes) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLOverlayBundle.GLAmapFocusHits::set_mHitedTimes', {'refId': refId, "mHitedTimes": mHitedTimes});
  }
  

  // 生成方法们
  
}