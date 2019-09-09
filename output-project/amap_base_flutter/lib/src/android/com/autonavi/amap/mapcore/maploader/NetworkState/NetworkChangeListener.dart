import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_maploader_NetworkState_NetworkChangeListener extends Ref_Android {
  com_autonavi_amap_mapcore_maploader_NetworkState_NetworkChangeListener.withRefId(int refId): super.withRefId(refId);

  String networkStateChanged(android_content_Context var1);
  
}