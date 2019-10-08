import 'dart:typed_data';

import 'package:amap_base_flutter/src/ios/ios.export.dart';
import 'package:amap_base_flutter/src/android/android.export.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import
mixin MAParticleSizeGenerate on NSObject {
  Future<double> getSizeX(double timeFrame) {}
  
  Future<double> getSizeY(double timeFrame) {}
  
  Future<double> getSizeZ(double timeFrame) {}
  
}