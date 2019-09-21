import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IInfoWindowManager on java_lang_Object {
  Future<String> setInfoWindowAnimation(com_amap_api_maps_model_animation_Animation var1, com_amap_api_maps_model_animation_Animation_AnimationListener var2) {}
  
  Future<String> setInfoWindowAppearAnimation(com_amap_api_maps_model_animation_Animation var1) {}
  
  Future<String> setInfoWindowBackColor(int var1) {}
  
  Future<String> setInfoWindowBackEnable(bool var1) {}
  
  Future<String> setInfoWindowBackScale(double var1, double var2) {}
  
  Future<String> setInfoWindowDisappearAnimation(com_amap_api_maps_model_animation_Animation var1) {}
  
  Future<String> setInfoWindowMovingAnimation(com_amap_api_maps_model_animation_Animation var1) {}
  
  Future<String> startAnimation() {}
  
}