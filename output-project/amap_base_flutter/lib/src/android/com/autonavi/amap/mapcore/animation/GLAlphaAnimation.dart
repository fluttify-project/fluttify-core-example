import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_animation_GLAlphaAnimation extends Ref_Android {
  com_autonavi_amap_mapcore_animation_GLAlphaAnimation.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<double> get_mFromAlpha() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.animation.GLAlphaAnimation::get_mFromAlpha", {'refId': refId});
    return result;
  }
  
  Future<double> get_mToAlpha() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.animation.GLAlphaAnimation::get_mToAlpha", {'refId': refId});
    return result;
  }
  
  Future<double> get_mCurAlpha() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.animation.GLAlphaAnimation::get_mCurAlpha", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_mFromAlpha(double mFromAlpha) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.animation.GLAlphaAnimation::set_mFromAlpha', {'refId': refId, "mFromAlpha": mFromAlpha});
  }
  
  Future<void> set_mToAlpha(double mToAlpha) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.animation.GLAlphaAnimation::set_mToAlpha', {'refId': refId, "mToAlpha": mToAlpha});
  }
  
  Future<void> set_mCurAlpha(double mCurAlpha) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.animation.GLAlphaAnimation::set_mCurAlpha', {'refId': refId, "mCurAlpha": mCurAlpha});
  }
  

  // 生成方法们
  
}