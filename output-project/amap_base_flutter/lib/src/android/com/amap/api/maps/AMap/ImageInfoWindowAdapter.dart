import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_maps_AMap_ImageInfoWindowAdapter extends com_amap_api_maps_AMap_InfoWindowAdapter {
  com_amap_api_maps_AMap_ImageInfoWindowAdapter.withRefId(int refId): super.withRefId(refId);

  int getInfoWindowUpdateTime();
  
}