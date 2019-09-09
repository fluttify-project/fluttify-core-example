import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IProjection extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IProjection.withRefId(int refId): super.withRefId(refId);

  com_amap_api_maps_model_LatLng fromScreenLocation();
  
  android_graphics_Point toScreenLocation(com_amap_api_maps_model_LatLng var1);
  
  android_graphics_PointF toMapLocation(com_amap_api_maps_model_LatLng var1);
  
  com_amap_api_maps_model_VisibleRegion getVisibleRegion();
  
  double toMapLenWithWin(int var1);
  
  com_amap_api_maps_model_TileProjection fromBoundsToTile(com_amap_api_maps_model_LatLngBounds var1, int var2, int var3);
  
  com_amap_api_maps_model_LatLngBounds getMapBounds(com_amap_api_maps_model_LatLng var1, double var2);
  
  com_amap_api_maps_model_AMapCameraInfo getCameraInfo();
  
}