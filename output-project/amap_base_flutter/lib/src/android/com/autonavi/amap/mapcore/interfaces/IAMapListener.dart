import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IAMapListener extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IAMapListener.withRefId(int refId): super.withRefId(refId);

  String afterDrawFrame(int var1, com_autonavi_ae_gmap_GLMapState var2);
  
  String afterDrawLabel(int var1, com_autonavi_ae_gmap_GLMapState var2);
  
  String beforeDrawLabel(int var1, com_autonavi_ae_gmap_GLMapState var2);
  
  String afterRendererOver(int var1, com_autonavi_ae_gmap_GLMapState var2);
  
  String afterAnimation();
  
}