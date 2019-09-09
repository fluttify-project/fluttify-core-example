import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IAnimation extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IAnimation.withRefId(int refId): super.withRefId(refId);

  String setAnimation(com_autonavi_amap_mapcore_animation_GLAnimation var1);
  
  bool startAnimation();
  
  String setAnimationListener(com_amap_api_maps_model_animation_Animation_AnimationListener var1);
  
}