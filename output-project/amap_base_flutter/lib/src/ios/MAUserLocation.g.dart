import 'dart:typed_data';

import 'package:amap_base_flutter/src/ios/ios.export.g.dart';
import 'package:amap_base_flutter/src/android/android.export.g.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import
class MAUserLocation extends MAAnimatedAnnotation  {
  // 生成getters
  Future<bool> get_updating() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod("MAUserLocation::get_isUpdating", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}