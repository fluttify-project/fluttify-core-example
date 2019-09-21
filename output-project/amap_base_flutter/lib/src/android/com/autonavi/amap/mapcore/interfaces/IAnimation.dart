import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IAnimation on java_lang_Object {
  Future<String> setAnimation(com_autonavi_amap_mapcore_animation_GLAnimation var1) {}
  
  Future<bool> startAnimation() {}
  
  Future<String> setAnimationListener(com_amap_api_maps_model_animation_Animation_AnimationListener var1) {}
  
}