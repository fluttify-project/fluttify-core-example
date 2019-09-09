import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_maps_model_TileProvider extends Ref_Android {
  com_amap_api_maps_model_TileProvider.withRefId(int refId): super.withRefId(refId);

  com_amap_api_maps_model_Tile getTile(int var1, int var2, int var3);
  
  int getTileWidth();
  
  int getTileHeight();
  
}