import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_Inner_3dMap_locationManagerBase extends Ref_Android {
  com_autonavi_amap_mapcore_Inner_3dMap_locationManagerBase.withRefId(int refId): super.withRefId(refId);

  String setLocationOption(com_autonavi_amap_mapcore_Inner_3dMap_locationOption var1);
  
  String setLocationListener(com_autonavi_amap_mapcore_Inner_3dMap_locationListener var1);
  
  String startLocation();
  
  String stopLocation();
  
  String unRegisterLocationListener(com_autonavi_amap_mapcore_Inner_3dMap_locationListener var1);
  
  com_autonavi_amap_mapcore_Inner_3dMap_location getLastKnownLocation();
  
  String destroy();
  
}