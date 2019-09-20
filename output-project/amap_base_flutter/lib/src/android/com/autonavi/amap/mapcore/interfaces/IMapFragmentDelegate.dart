import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IMapFragmentDelegate on Object {
  Future<com_autonavi_amap_mapcore_interfaces_IAMap> getMap() {}
  
  Future<String> onInflate(android_app_Activity var1, com_amap_api_maps_AMapOptions var2, android_os_Bundle var3) {}
  
  Future<String> setContext(android_content_Context var1) {}
  
  Future<String> setOptions(com_amap_api_maps_AMapOptions var1) {}
  
  Future<String> onCreate(android_os_Bundle var1) {}
  
  Future<android_view_View> onCreateView(android_view_LayoutInflater var1, android_view_ViewGroup var2, android_os_Bundle var3) {}
  
  Future<String> onResume() {}
  
  Future<String> onPause() {}
  
  Future<String> onDestroyView() {}
  
  Future<String> onDestroy() {}
  
  Future<String> onLowMemory() {}
  
  Future<String> onSaveInstanceState(android_os_Bundle var1) {}
  
  Future<bool> isReady() {}
  
  Future<String> setVisibility(int var1) {}
  
}