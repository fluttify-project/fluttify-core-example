import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_maps_AMap_OnCameraChangeListener extends Ref_Android {
  com_amap_api_maps_AMap_OnCameraChangeListener.withRefId(int refId): super.withRefId(refId);

  String onCameraChange(com_amap_api_maps_model_CameraPosition var1);
  
  String onCameraChangeFinish(com_amap_api_maps_model_CameraPosition var1);
  
}