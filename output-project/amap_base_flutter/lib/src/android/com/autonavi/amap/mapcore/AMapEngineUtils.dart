import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_AMapEngineUtils extends Ref_Android {
  com_autonavi_amap_mapcore_AMapEngineUtils.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_AMAP_ENGINE_TYPE_MAIN() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_AMAP_ENGINE_TYPE_MAIN", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAP_ENGINE_TYPE_EAGLEEYE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_AMAP_ENGINE_TYPE_EAGLEEYE", {'refId': refId});
    return result;
  }
  
  Future<String> get_MAP_MAP_ASSETS_NAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MAP_MAP_ASSETS_NAME", {'refId': refId});
    return result;
  }
  
  Future<String> get_MAP_MAP_ASSETS_TRL_NAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MAP_MAP_ASSETS_TRL_NAME", {'refId': refId});
    return result;
  }
  
  Future<String> get_MAP_MAP_ASSETS_BACKGROUND_NAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MAP_MAP_ASSETS_BACKGROUND_NAME", {'refId': refId});
    return result;
  }
  
  Future<String> get_MAP_MAP_ASSETS_ICON_5_NAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MAP_MAP_ASSETS_ICON_5_NAME", {'refId': refId});
    return result;
  }
  
  Future<String> get_MAP_MAP_ASSETS_ICON_5_NAME_FOR_CUSTOM() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MAP_MAP_ASSETS_ICON_5_NAME_FOR_CUSTOM", {'refId': refId});
    return result;
  }
  
  Future<String> get_MAP_MAP_ASSETS_STYLE_DATA() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MAP_MAP_ASSETS_STYLE_DATA", {'refId': refId});
    return result;
  }
  
  Future<String> get_MAP_MAP_ASSETS_STYLE_DATA_0() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MAP_MAP_ASSETS_STYLE_DATA_0", {'refId': refId});
    return result;
  }
  
  Future<String> get_MAP_MAP_ASSETS_STYLE_DATA_0_FOR_TEXTURE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MAP_MAP_ASSETS_STYLE_DATA_0_FOR_TEXTURE", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEFAULT_RECTPACKER_WIDTH() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_DEFAULT_RECTPACKER_WIDTH", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEFAULT_RECTPACKER_HEIGHT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_DEFAULT_RECTPACKER_HEIGHT", {'refId': refId});
    return result;
  }
  
  Future<int> get_MARKER_VERTEX_BUFFER_OBJECT_STRIDE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MARKER_VERTEX_BUFFER_OBJECT_STRIDE", {'refId': refId});
    return result;
  }
  
  Future<String> get_DEFAULT_MAPLANGUAGE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_DEFAULT_MAPLANGUAGE", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEFAULT_WORLDGRID_SHOW_ZOOM() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_DEFAULT_WORLDGRID_SHOW_ZOOM", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEFAULT_DURATION() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_DEFAULT_DURATION", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAX_P20_WIDTH() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MAX_P20_WIDTH", {'refId': refId});
    return result;
  }
  
  Future<int> get_HALF_MAX_P20_WIDTH() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_HALF_MAX_P20_WIDTH", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAX_LONGITUDE_DEGREE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MAX_LONGITUDE_DEGREE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MIN_LONGITUDE_DEGREE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_MIN_LONGITUDE_DEGREE", {'refId': refId});
    return result;
  }
  
  Future<int> get_LOGO_CUSTOM_ICON_DAY_TYPE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_LOGO_CUSTOM_ICON_DAY_TYPE", {'refId': refId});
    return result;
  }
  
  Future<int> get_LOGO_CUSTOM_ICON_NIGHT_TYPE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_LOGO_CUSTOM_ICON_NIGHT_TYPE", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEFATULT_NATIVE_INSTANCE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_DEFATULT_NATIVE_INSTANCE", {'refId': refId});
    return result;
  }
  
  Future<int> get_DEFATULT_TEXTURE_ID() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_DEFATULT_TEXTURE_ID", {'refId': refId});
    return result;
  }
  
  Future<String> get_LOGO_CUSTOM_ICON_DAY_NAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_LOGO_CUSTOM_ICON_DAY_NAME", {'refId': refId});
    return result;
  }
  
  Future<String> get_LOGO_CUSTOM_ICON_NIGHT_NAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_LOGO_CUSTOM_ICON_NIGHT_NAME", {'refId': refId});
    return result;
  }
  
  Future<int> get_ARROW_LINE_INNER_TEXTURE_ID() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_ARROW_LINE_INNER_TEXTURE_ID", {'refId': refId});
    return result;
  }
  
  Future<int> get_ARROW_LINE_OUTER_TEXTURE_ID() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_ARROW_LINE_OUTER_TEXTURE_ID", {'refId': refId});
    return result;
  }
  
  Future<int> get_ARROW_LINE_SHADOW_TEXTURE_ID() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.AMapEngineUtils::get_ARROW_LINE_SHADOW_TEXTURE_ID", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_LOGO_CUSTOM_ICON_DAY_NAME(String LOGO_CUSTOM_ICON_DAY_NAME) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapEngineUtils::set_LOGO_CUSTOM_ICON_DAY_NAME', {'refId': refId, "LOGO_CUSTOM_ICON_DAY_NAME": LOGO_CUSTOM_ICON_DAY_NAME});
  }
  
  Future<void> set_LOGO_CUSTOM_ICON_NIGHT_NAME(String LOGO_CUSTOM_ICON_NIGHT_NAME) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.AMapEngineUtils::set_LOGO_CUSTOM_ICON_NIGHT_NAME', {'refId': refId, "LOGO_CUSTOM_ICON_NIGHT_NAME": LOGO_CUSTOM_ICON_NIGHT_NAME});
  }
  

  // 生成方法们
  
}