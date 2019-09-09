import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_maps_AMap_OnIndoorBuildingActiveListener extends Ref_Android {
  com_amap_api_maps_AMap_OnIndoorBuildingActiveListener.withRefId(int refId): super.withRefId(refId);

  String OnIndoorBuilding(com_amap_api_maps_model_IndoorBuildingInfo var1);
  
}