import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IMapFragmentDelegate extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IMapFragmentDelegate.withRefId(int refId): super.withRefId(refId);

  com_autonavi_amap_mapcore_interfaces_IAMap getMap();
  
  String onInflate(android_app_Activity var1, com_amap_api_maps_AMapOptions var2, android_os_Bundle var3);
  
  String setContext(android_content_Context var1);
  
  String setOptions(com_amap_api_maps_AMapOptions var1);
  
  String onCreate(android_os_Bundle var1);
  
  android_view_View onCreateView(android_os_Bundle var3);
  
  String onResume();
  
  String onPause();
  
  String onDestroyView();
  
  String onDestroy();
  
  String onLowMemory();
  
  String onSaveInstanceState(android_os_Bundle var1);
  
  bool isReady();
  
  String setVisibility(int var1);
  
}