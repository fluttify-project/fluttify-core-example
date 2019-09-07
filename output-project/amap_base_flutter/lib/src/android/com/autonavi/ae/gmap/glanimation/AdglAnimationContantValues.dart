import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_glanimation_AdglAnimationContantValues extends Ref_Android {
  com_autonavi_ae_gmap_glanimation_AdglAnimationContantValues.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<double> get_ADGLANIMATION_ONE_TEN() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_ONE_TEN", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_ONE_QUARTER() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_ONE_QUARTER", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATOIN_ONE_HALF() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATOIN_ONE_HALF", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATOIN_THREE_QUARTER() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATOIN_THREE_QUARTER", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATOIN_ONE_FLOAT() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATOIN_ONE_FLOAT", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATOIN_ZERO_FLOAT() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATOIN_ZERO_FLOAT", {'refId': refId});
    return result;
  }
  
  Future<int> get_ADGLANIMATOIN_TWO_INT() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATOIN_TWO_INT", {'refId': refId});
    return result;
  }
  
  Future<int> get_ADGLANIMATOIN_FOUR_INT() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATOIN_FOUR_INT", {'refId': refId});
    return result;
  }
  
  Future<int> get_ADGLANIMATOIN_TWO_POWER_TEN() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATOIN_TWO_POWER_TEN", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATOIN_OFFSET() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATOIN_OFFSET", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATOIN_OFFSET1() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATOIN_OFFSET1", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_CV1() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_CV1", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_CV2() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_CV2", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_CV3() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_CV3", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_CV4() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_CV4", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_CV5() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_CV5", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_CV6() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_CV6", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_CV7() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_CV7", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_CV8() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_CV8", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_CV9() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_CV9", {'refId': refId});
    return result;
  }
  
  Future<double> get_ADGLANIMATION_CV10() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.glanimation.AdglAnimationContantValues::get_ADGLANIMATION_CV10", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}