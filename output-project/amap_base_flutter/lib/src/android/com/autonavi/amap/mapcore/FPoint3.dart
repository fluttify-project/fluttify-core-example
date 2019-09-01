import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_FPoint3 extends Ref_Android {
  com_autonavi_amap_mapcore_FPoint3.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_colorIndex() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.FPoint3::get_colorIndex", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_colorIndex(int colorIndex) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.FPoint3::set_colorIndex', {'refId': refId, "colorIndex": colorIndex});
  }
  

  // 生成方法们
   Future<String> setColorIndex(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.amap.mapcore.FPoint3@$refId::setColorIndex([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.amap.mapcore.FPoint3::setColorIndex', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}