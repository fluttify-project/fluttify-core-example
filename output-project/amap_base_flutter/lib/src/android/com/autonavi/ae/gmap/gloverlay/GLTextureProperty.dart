import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_gloverlay_GLTextureProperty {
  com_autonavi_ae_gmap_gloverlay_GLTextureProperty.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_mId() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gloverlay.GLTextureProperty::get_mId", {'refId': refId});
    return result;
  }
  
  Future<List<int>> get_mPngBuffer() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gloverlay.GLTextureProperty::get_mPngBuffer", {'refId': refId});
    return result;
  }
  
  Future<int> get_mAnchor() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gloverlay.GLTextureProperty::get_mAnchor", {'refId': refId});
    return result;
  }
  
  Future<double> get_mXRatio() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gloverlay.GLTextureProperty::get_mXRatio", {'refId': refId});
    return result;
  }
  
  Future<double> get_mYRatio() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gloverlay.GLTextureProperty::get_mYRatio", {'refId': refId});
    return result;
  }
  
  Future<bool> get_isGenMimps() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gloverlay.GLTextureProperty::get_isGenMimps", {'refId': refId});
    return result;
  }
  
  Future<bool> get_isRepeat() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.gloverlay.GLTextureProperty::get_isRepeat", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_mId(int mId) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLTextureProperty::set_mId', {'refId': refId, "mId": mId});
  }
  
  Future<void> set_mPngBuffer(List<int> mPngBuffer) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLTextureProperty::set_mPngBuffer', {'refId': refId, "mPngBuffer": mPngBuffer});
  }
  
  Future<void> set_mAnchor(int mAnchor) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLTextureProperty::set_mAnchor', {'refId': refId, "mAnchor": mAnchor});
  }
  
  Future<void> set_mXRatio(double mXRatio) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLTextureProperty::set_mXRatio', {'refId': refId, "mXRatio": mXRatio});
  }
  
  Future<void> set_mYRatio(double mYRatio) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLTextureProperty::set_mYRatio', {'refId': refId, "mYRatio": mYRatio});
  }
  
  Future<void> set_isGenMimps(bool isGenMimps) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLTextureProperty::set_isGenMimps', {'refId': refId, "isGenMimps": isGenMimps});
  }
  
  Future<void> set_isRepeat(bool isRepeat) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.gloverlay.GLTextureProperty::set_isRepeat', {'refId': refId, "isRepeat": isRepeat});
  }
  

  // 生成方法们
  
}