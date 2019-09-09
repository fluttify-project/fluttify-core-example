import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_maps_offlinemap_OfflineMapManager_OfflineMapDownloadListener extends Ref_Android {
  com_amap_api_maps_offlinemap_OfflineMapManager_OfflineMapDownloadListener.withRefId(int refId): super.withRefId(refId);

  String onDownload(int var1, int var2, String var3);
  
  String onCheckUpdate(bool var1, String var2);
  
  String onRemove(bool var1, String var2, String var3);
  
}