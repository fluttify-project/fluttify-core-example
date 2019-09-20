import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_amap_api_trace_LBSTraceBase on Object {
  Future<String> queryProcessedTrace(int var1, com_amap_api_trace_TraceLocation var2, int var3, com_amap_api_trace_TraceListener var4) {}
  
  Future<String> setLocationInterval(int var1) {}
  
  Future<String> setTraceStatusInterval(int var1) {}
  
  Future<String> startTrace(com_amap_api_trace_TraceStatusListener var1) {}
  
  Future<String> stopTrace() {}
  
  Future<String> destroy() {}
  
}