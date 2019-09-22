import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_amap_api_trace_LBSTraceBase on java_lang_Object {
  Future<void> queryProcessedTrace(int var1, com_amap_api_trace_TraceLocation var2, int var3, com_amap_api_trace_TraceListener var4) {}
  
  Future<void> setLocationInterval(int var1) {}
  
  Future<void> setTraceStatusInterval(int var1) {}
  
  Future<void> startTrace(com_amap_api_trace_TraceStatusListener var1) {}
  
  Future<void> stopTrace() {}
  
  Future<void> destroy() {}
  
}