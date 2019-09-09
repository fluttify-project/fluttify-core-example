import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IText extends com_autonavi_amap_mapcore_interfaces_IOverlayImage {
  com_autonavi_amap_mapcore_interfaces_IText.withRefId(int refId): super.withRefId(refId);

  String setText(String var1);
  
  String getText();
  
  String setBackgroundColor(int var1);
  
  int getBackgroundColor();
  
  String setFontColor(int var1);
  
  int getFontColor();
  
  String setFontSize(int var1);
  
  int getFontSize();
  
  String setTypeface();
  
  android_graphics_Typeface getTypeface();
  
  String setAlign(int var1, int var2);
  
  int getAlignX();
  
  int getAlignY();
  
}