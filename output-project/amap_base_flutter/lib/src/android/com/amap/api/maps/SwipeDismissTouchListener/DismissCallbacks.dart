import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_amap_api_maps_SwipeDismissTouchListener_DismissCallbacks on Object {
  Future<bool> canDismiss(com_amap_api_maps_Object var1) {}
  
  Future<String> onDismiss(android_view_View var1, com_amap_api_maps_Object var2) {}
  
  Future<String> onNotifySwipe() {}
  
}