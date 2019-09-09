import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_amap_api_trace_TraceStatusListener extends Ref_Android {
  com_amap_api_trace_TraceStatusListener.withRefId(int refId): super.withRefId(refId);

  String onTraceStatus(com_amap_api_trace_TraceLocation var1, com_amap_api_maps_model_LatLng var2, String var3);
  
}