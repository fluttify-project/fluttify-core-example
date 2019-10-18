import 'dart:typed_data';

import 'package:amap_base_flutter/src/ios/ios.export.g.dart';
import 'package:amap_base_flutter/src/android/android.export.g.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import
class MAMapCustomStyleOptions extends NSObject  {
  // 生成getters
  Future<String> get_styleId() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod("MAMapCustomStyleOptions::get_styleId", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_styleId(String styleId) async {
    await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('MAMapCustomStyleOptions::set_styleId', {'refId': refId, "styleId": styleId});
  
  
  }
  

  // 生成方法们
  
}