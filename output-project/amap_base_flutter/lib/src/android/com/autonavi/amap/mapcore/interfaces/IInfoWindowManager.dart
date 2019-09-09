import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IInfoWindowManager extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IInfoWindowManager.withRefId(int refId): super.withRefId(refId);

  String setInfoWindowAnimation(com_amap_api_maps_model_animation_Animation var1, com_amap_api_maps_model_animation_Animation_AnimationListener var2);
  
  String setInfoWindowAppearAnimation(com_amap_api_maps_model_animation_Animation var1);
  
  String setInfoWindowBackColor(int var1);
  
  String setInfoWindowBackEnable(bool var1);
  
  String setInfoWindowBackScale(double var1, double var2);
  
  String setInfoWindowDisappearAnimation(com_amap_api_maps_model_animation_Animation var1);
  
  String setInfoWindowMovingAnimation(com_amap_api_maps_model_animation_Animation var1);
  
  String startAnimation();
  
}