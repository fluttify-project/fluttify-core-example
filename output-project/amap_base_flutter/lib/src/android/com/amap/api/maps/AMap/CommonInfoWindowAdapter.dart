import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_maps_AMap_CommonInfoWindowAdapter extends Ref_Android {
  com_amap_api_maps_AMap_CommonInfoWindowAdapter.withRefId(int refId): super.withRefId(refId);

  com_amap_api_maps_InfoWindowParams getInfoWindowParams(com_amap_api_maps_model_BasePointOverlay var1);
  
}