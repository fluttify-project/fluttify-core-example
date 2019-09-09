import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_maps_model_AMapGestureListener extends Ref_Android {
  com_amap_api_maps_model_AMapGestureListener.withRefId(int refId): super.withRefId(refId);

  String onDoubleTap(double var1, double var2);
  
  String onSingleTap(double var1, double var2);
  
  String onFling(double var1, double var2);
  
  String onScroll(double var1, double var2);
  
  String onLongPress(double var1, double var2);
  
  String onDown(double var1, double var2);
  
  String onUp(double var1, double var2);
  
  String onMapStable();
  
}