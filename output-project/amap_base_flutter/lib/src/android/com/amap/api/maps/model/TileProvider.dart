import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_amap_api_maps_model_TileProvider on Object {
  Future<com_amap_api_maps_model_Tile> getTile(int var1, int var2, int var3) {}
  
  Future<int> getTileWidth() {}
  
  Future<int> getTileHeight() {}
  
}