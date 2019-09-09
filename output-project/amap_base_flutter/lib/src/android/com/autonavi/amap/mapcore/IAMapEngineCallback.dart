import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_IAMapEngineCallback extends Ref_Android {
  com_autonavi_amap_mapcore_IAMapEngineCallback.withRefId(int refId): super.withRefId(refId);

  List<byte[]> requireMapResource(int var1, String var2);
  
  String reloadMapResource(int var1, String var2, int var3);
  
  String requireMapData(int var1, List<int> var2);
  
  List<byte[]> requireCharBitmap(int var1, int var2, int var3);
  
  List<byte[]> requireCharsWidths(int var1, List<int> var2, int var3, int var4);
  
  String requireMapRender(int var1, int var2, int var3);
  
  String onMapRender(int var1, int var2);
  
  String cancelRequireMapData();
  
  String OnIndoorBuildingActivity(int var1, List<int> var2);
  
  int generateRequestId();
  
  int requireMapDataAsyn(int var1, List<int> var2);
  
}