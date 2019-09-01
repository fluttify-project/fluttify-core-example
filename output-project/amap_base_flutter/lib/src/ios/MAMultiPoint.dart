import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAMultiPoint extends Ref_Android {
  MAMultiPoint.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<bool> get_cross180Longitude() async {
    final result = await _channel.invokeMethod("MAMultiPoint::get_cross180Longitude", {'refId': refId});
    return result;
  }
  

  // 生成setters
  

  // 生成方法们
  
}