import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_custom_IUnityCallback extends Ref_Android {
  com_autonavi_custom_IUnityCallback.withRefId(int refId): super.withRefId(refId);

  String UnitySetGraphicsDevice(int var1);
  
  String UnityRenderEvent(int var1);
  
}