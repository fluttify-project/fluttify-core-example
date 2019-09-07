import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_amap_mapcore_tools_GLMapStaticValue extends Ref_Android {
  com_autonavi_amap_mapcore_tools_GLMapStaticValue.withRefId(int refId): super.withRefId(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_MAPVIEW_MODE_NORAML() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_MODE_NORAML", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_MODE_SATELLITE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_MODE_SATELLITE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_MODE_BUS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_MODE_BUS", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_TIME_DAY() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_TIME_DAY", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_TIME_NIGHT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_TIME_NIGHT", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAX_CAMERA_HEADER_DEGREE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAX_CAMERA_HEADER_DEGREE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAX_FARCLIPANGLE_CAMERAHEADERANGLE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAX_FARCLIPANGLE_CAMERAHEADERANGLE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MIN_ZOOM() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MIN_ZOOM", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAX_ZOOM() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAX_ZOOM", {'refId': refId});
    return result;
  }
  
  Future<bool> get_USE_SCALE_ROATE_INTERIAL_GESTURE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_USE_SCALE_ROATE_INTERIAL_GESTURE", {'refId': refId});
    return result;
  }
  
  Future<int> get_ANIMATION_MOVE_TIME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ANIMATION_MOVE_TIME", {'refId': refId});
    return result;
  }
  
  Future<int> get_ANIMATION_FLUENT_TIME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ANIMATION_FLUENT_TIME", {'refId': refId});
    return result;
  }
  
  Future<int> get_ANIMATION_NORMAL_TIME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ANIMATION_NORMAL_TIME", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_NORMAL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_NORMAL", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_PREVIEW_CAR() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_PREVIEW_CAR", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_PREVIEW_BUS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_PREVIEW_BUS", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_PREVIEW_FOOT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_PREVIEW_FOOT", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_NAVI_CAR() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_NAVI_CAR", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_NAVI_BUS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_NAVI_BUS", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_NAVI_FOOT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_NAVI_FOOT", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_CAMERA_PHOTO() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_CAMERA_PHOTO", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_CAMERA_OPENLAYER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_CAMERA_OPENLAYER", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_CAMERA_FESTIVAL_SKIN() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_CAMERA_FESTIVAL_SKIN", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_CAMERA_SEARCH() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_CAMERA_SEARCH", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_PREVIEW_RIDE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_PREVIEW_RIDE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_NAVI_RIDE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_NAVI_RIDE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_PREVIEW_TAKETAXI() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_PREVIEW_TAKETAXI", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_PREVIEW_TRUCK() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_PREVIEW_TRUCK", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPVIEW_STATE_NAVI_TRUCK() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPVIEW_STATE_NAVI_TRUCK", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_PREPARE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_PREPARE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_ENTER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_ENTER", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_BASEMAPBEGIN() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_BASEMAPBEGIN", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_BUILDINGBEGIN() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_BUILDINGBEGIN", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_LABELSBEGIN() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_LABELSBEGIN", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_LABELSEND() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_LABELSEND", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_RENDEROVER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_RENDEROVER", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_NOMORENEEDRENDER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_NOMORENEEDRENDER", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_ORTHOPROJECTION() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_ORTHOPROJECTION", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_RENDER_RCTFRAMEMOVE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_RENDER_RCTFRAMEMOVE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_GRID_CAN_FILL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_GRID_CAN_FILL", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_REALCITY_EXIT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_REALCITY_EXIT", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_RENDERCOMPLETE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_RENDERCOMPLETE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAPRENDER_CAN_STOP_AND_FULLSCREEN_RENDEROVER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAPRENDER_CAN_STOP_AND_FULLSCREEN_RENDEROVER", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_PROCESS_BUILDING() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_PROCESS_BUILDING", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_PROCESS_3DOBJECT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_PROCESS_3DOBJECT", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_PROCESS_ROADARROW() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_PROCESS_ROADARROW", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_PROCESS_LABEL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_PROCESS_LABEL", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_PROCESS_INDOOR() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_PROCESS_INDOOR", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_PROCESS_GUIDE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_PROCESS_GUIDE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_SCENIC_WIDGET_FILTER_INDEX() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_SCENIC_WIDGET_FILTER_INDEX", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_SCENIC_WIDGET_ICON_CONTER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_SCENIC_WIDGET_ICON_CONTER", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_SCENIC() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_SCENIC", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_MAPVIEW_LEFT_TOP() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_MAPVIEW_LEFT_TOP", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_FORCE_NAVI_LABEL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_FORCE_NAVI_LABEL", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_TRAFFIC() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_TRAFFIC", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_SATELLITE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_SATELLITE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_CLEAN_SELECTED_SUBWAY() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_CLEAN_SELECTED_SUBWAY", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_MAP_HEAT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_MAP_HEAT", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_SHOW_BUILDING_NORMAL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_SHOW_BUILDING_NORMAL", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_SHOW_BUILDING_POI() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_SHOW_BUILDING_POI", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_CLEAR_INDOORBUILDING_DATA() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_CLEAR_INDOORBUILDING_DATA", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_OPENLAYER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_OPENLAYER", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_TEXTURE_ICON_INFO() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_TEXTURE_ICON_INFO", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_CLEAR_INDOORBUILDING_LAST() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_CLEAR_INDOORBUILDING_LAST", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_BUILD_COLLISION_IN_SIGHTLINE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_BUILD_COLLISION_IN_SIGHTLINE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_SHOW_BUILDING_TEXTURE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_SHOW_BUILDING_TEXTURE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_SHOW_SIMPLE3D() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_SHOW_SIMPLE3D", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_SIMPLE3D_HEIGHT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_SIMPLE3D_HEIGHT", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_TRAFFIC_REFRESH() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_TRAFFIC_REFRESH", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_FBO_CONTROL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_FBO_CONTROL", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_MAP_VALUE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_MAP_VALUE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_MAP_TEXTSCALE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_MAP_TEXTSCALE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_RESTORED_MAPMODESTATE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_RESTORED_MAPMODESTATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_SHOW_BUILDING_ANIMATION_ALPHA() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_SHOW_BUILDING_ANIMATION_ALPHA", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAPVIEW_MSG_GESTURE_MOVE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AMAPVIEW_MSG_GESTURE_MOVE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAPVIEW_MSG_GESTURE_SCALE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AMAPVIEW_MSG_GESTURE_SCALE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAPVIEW_MSG_GESTURE_ROTATE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AMAPVIEW_MSG_GESTURE_ROTATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAPVIEW_MSG_GESTURE_TILT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AMAPVIEW_MSG_GESTURE_TILT", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAPVIEW_MSG_NAVIOVERLAY_STATE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AMAPVIEW_MSG_NAVIOVERLAY_STATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_TEXTURE_BOARD_ICON() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_TEXTURE_BOARD_ICON", {'refId': refId});
    return result;
  }
  
  Future<int> get_TEXTURE_TOP_COVER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_TEXTURE_TOP_COVER", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAP_TEXTUREDATATYPE_PNG() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AMAP_TEXTUREDATATYPE_PNG", {'refId': refId});
    return result;
  }
  
  Future<int> get_AMAP_TEXTUREDATATYPE_JPG() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AMAP_TEXTUREDATATYPE_JPG", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_VBO_ENABLE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_VBO_ENABLE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_RASTER_ENABLE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_RASTER_ENABLE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_PROCESS_BUILDING() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_PROCESS_BUILDING", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_PROCESS_3DOBJECT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_PROCESS_3DOBJECT", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_PROCESS_ROADARROW() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_PROCESS_ROADARROW", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_PROCESS_LABEL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_PROCESS_LABEL", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_PROCESS_INDOOR() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_PROCESS_INDOOR", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_PROCESS_GUIDE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_PROCESS_GUIDE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SCENIC_WIDGET_FILTER_INDEX() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SCENIC_WIDGET_FILTER_INDEX", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SCENIC_WIDGET_ICON_CONTER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SCENIC_WIDGET_ICON_CONTER", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_MAPVIEW_LEFT_TOP() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_MAPVIEW_LEFT_TOP", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_FORCE_NAVI_LABEL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_FORCE_NAVI_LABEL", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SETTRAFFICTEXTURE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SETTRAFFICTEXTURE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SETCOLORBLINDSTATUS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SETCOLORBLINDSTATUS", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SETISSTIMAP() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SETISSTIMAP", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_MAPMODESTATE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_MAPMODESTATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_CLEAN_SELECTED_SUBWAY() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_CLEAN_SELECTED_SUBWAY", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_MAP_HEAT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_MAP_HEAT", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SHOW_BUILDING_NORMAL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SHOW_BUILDING_NORMAL", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SHOW_BUILDING_MARK() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SHOW_BUILDING_MARK", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SHOW_BUILDING_POI() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SHOW_BUILDING_POI", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_CLEAR_INDOORBUILDING_DATA() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_CLEAR_INDOORBUILDING_DATA", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SHOW_OPENLAYER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SHOW_OPENLAYER", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_TEXTURE_ICON_INFO() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_TEXTURE_ICON_INFO", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SHOW_BUILDING_TEXTURE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SHOW_BUILDING_TEXTURE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SHOW_BUILDING_ANIMATION_ALPHA() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SHOW_BUILDING_ANIMATION_ALPHA", {'refId': refId});
    return result;
  }
  
  Future<int> get_MAP_PARAMETERNAME_POLYGON_FILL_CONTROL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_MAP_PARAMETERNAME_POLYGON_FILL_CONTROL", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SHOW_SIMPLE3D() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SHOW_SIMPLE3D", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SIMPLE3D_HEIGHT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SIMPLE3D_HEIGHT", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_TRAFFIC_REFRESH() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_TRAFFIC_REFRESH", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_FBO_CONTROL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_FBO_CONTROL", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_MAP_VALUE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_MAP_VALUE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_MAP_TEXTSCALE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_MAP_TEXTSCALE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_TEXT_GL_UNIT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_TEXT_GL_UNIT", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_RESTORED_MAPMODESTATE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_RESTORED_MAPMODESTATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_MAXFPS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_MAXFPS", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_NIGHT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_NIGHT", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_ON_OFF_ASYN_TASK() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_ON_OFF_ASYN_TASK", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_ON_OFF_DBLITE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_ON_OFF_DBLITE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_CACHE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_CACHE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_RESET_CACHE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_RESET_CACHE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_CLEAR_OL_FILE_CACHE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_CLEAR_OL_FILE_CACHE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_RENDER_COMPLETE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_RENDER_COMPLETE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_PROCESS_REALCITY() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_PROCESS_REALCITY", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_REALCITY_3DLINEVALID() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_REALCITY_3DLINEVALID", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_REALCITY_ANIMATE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_REALCITY_ANIMATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_HALF_LEVEL_ZOOM() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_HALF_LEVEL_ZOOM", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_NETWORK() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_NETWORK", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_MAX_RENDER_DURATION() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_MAX_RENDER_DURATION", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SHOW_POI_FILTER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SHOW_POI_FILTER", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_3D_MAP_MODE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_3D_MAP_MODE", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_NORMAL_TRAFFIC() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_NORMAL_TRAFFIC", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_COLORBLIND_TRAFFIC() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_COLORBLIND_TRAFFIC", {'refId': refId});
    return result;
  }
  
  Future<int> get_ALLOW_CAMERA_HEAD_CHANGE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ALLOW_CAMERA_HEAD_CHANGE", {'refId': refId});
    return result;
  }
  
  Future<int> get_SINGLE_FINGER_ZOOM() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_SINGLE_FINGER_ZOOM", {'refId': refId});
    return result;
  }
  
  Future<int> get_NEED_CANCEL_SINGLE_TAP() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_NEED_CANCEL_SINGLE_TAP", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_LOCK_ROTATE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_LOCK_ROTATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_SHOW_BUILD_TEXTURE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_SHOW_BUILD_TEXTURE", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_TRAFFIC_ON() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_TRAFFIC_ON", {'refId': refId});
    return result;
  }
  
  Future<int> get_ENABLE_CLEAR_FOCUS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ENABLE_CLEAR_FOCUS", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_SHOW_BUILD_MODEL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_SHOW_BUILD_MODEL", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_LOCK_HOVER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_LOCK_HOVER", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_SHOW_LABEL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_SHOW_LABEL", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_SHOW_BUILD_LAND() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_SHOW_BUILD_LAND", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_SHOW_BUILD_NORMAL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_SHOW_BUILD_NORMAL", {'refId': refId});
    return result;
  }
  
  Future<int> get_IS_SIMPLE3D_ON() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_SIMPLE3D_ON", {'refId': refId});
    return result;
  }
  
  Future<int> get_HAS_USER_SET_LEFTTOP() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_HAS_USER_SET_LEFTTOP", {'refId': refId});
    return result;
  }
  
  Future<int> get_TMC_REFRESH_TIMELIMIT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_TMC_REFRESH_TIMELIMIT", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_CALLBACK_CHANGEMAPLOGO() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_CALLBACK_CHANGEMAPLOGO", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_CALLBACK_NEED_NEXTFRAME() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_CALLBACK_NEED_NEXTFRAME", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_CALLBACK_INDOOR_NETWORK_ERR() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_CALLBACK_INDOOR_NETWORK_ERR", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SHOW_OPTION() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SHOW_OPTION", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_SHOW_CONTENT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_SHOW_CONTENT", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_ROAD() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_ROAD", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_BUILDING() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_BUILDING", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_SATELLITE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_SATELLITE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_TMC() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_TMC", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_REGION() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_REGION", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_POI() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_POI", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_INDOOR() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_INDOOR", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_OPENLAYER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_OPENLAYER", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_GUIDE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_GUIDE", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_HEAT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_HEAT", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_REALCITY() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_REALCITY", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_VECTORMODEL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_VECTORMODEL", {'refId': refId});
    return result;
  }
  
  Future<int> get_AN_MAP_CONTENT_SHOW_ALL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AN_MAP_CONTENT_SHOW_ALL", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_STATE_POSSIBLE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_STATE_POSSIBLE", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_STATE_BEGAN() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_STATE_BEGAN", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_STATE_CHANGED() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_STATE_CHANGED", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_STATE_ENDED() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_STATE_ENDED", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_STATE_CANCELLED() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_STATE_CANCELLED", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_STATE_FAILED() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_STATE_FAILED", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_STATE_RECOGNIZED() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_STATE_RECOGNIZED", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_TYPE_TAP_ZOOM_IN() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_TYPE_TAP_ZOOM_IN", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_TYPE_TAP_ZOOM_OUT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_TYPE_TAP_ZOOM_OUT", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_TYPE_MOVE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_TYPE_MOVE", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_TYPE_PINCH_ZOOM() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_TYPE_PINCH_ZOOM", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_TYPE_ROTATION() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_TYPE_ROTATION", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_TYPE_CAMERA_HEADER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_TYPE_CAMERA_HEADER", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_TYPE_LONG_PRESS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_TYPE_LONG_PRESS", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_TYPE_SINGLE_TAP() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_TYPE_SINGLE_TAP", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_TYPE_SINGLE_ZOOM() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_TYPE_SINGLE_ZOOM", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_CENTER_TYPE_DEFAULT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_CENTER_TYPE_DEFAULT", {'refId': refId});
    return result;
  }
  
  Future<int> get_EA_MAP_GESTURE_CENTER_TYPE_SCREEN_CENTER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EA_MAP_GESTURE_CENTER_TYPE_SCREEN_CENTER", {'refId': refId});
    return result;
  }
  
  Future<bool> get_IS_USE_IN_AUTO() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_USE_IN_AUTO", {'refId': refId});
    return result;
  }
  
  Future<int> get_EAMAPOVERLAY_DRAWDEFAULT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EAMAPOVERLAY_DRAWDEFAULT", {'refId': refId});
    return result;
  }
  
  Future<int> get_EAMAPOVERLAY_DRAWBEFORELABELS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EAMAPOVERLAY_DRAWBEFORELABELS", {'refId': refId});
    return result;
  }
  
  Future<int> get_EAMAPOVERLAY_DRAWAFTERLABELS() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_EAMAPOVERLAY_DRAWAFTERLABELS", {'refId': refId});
    return result;
  }
  
  Future<bool> get_IS_USE_BACK_MAP_CAPTURE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_USE_BACK_MAP_CAPTURE", {'refId': refId});
    return result;
  }
  
  Future<bool> get_IS_USE_FRONT_MAP_CAPTURE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_IS_USE_FRONT_MAP_CAPTURE", {'refId': refId});
    return result;
  }
  
  Future<int> get_GL_DISPLAY_DEFAULT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_GL_DISPLAY_DEFAULT", {'refId': refId});
    return result;
  }
  
  Future<int> get_NORMAL_TICK_COUNT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_NORMAL_TICK_COUNT", {'refId': refId});
    return result;
  }
  
  Future<int> get_ANIMATION_TICK_COUNT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ANIMATION_TICK_COUNT", {'refId': refId});
    return result;
  }
  
  Future<int> get_LONG_TICK_COUNT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_LONG_TICK_COUNT", {'refId': refId});
    return result;
  }
  
  Future<int> get_LONG_LONG_TICK_COUNT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_LONG_LONG_TICK_COUNT", {'refId': refId});
    return result;
  }
  
  Future<int> get_RENDER_FPS_MAX() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_RENDER_FPS_MAX", {'refId': refId});
    return result;
  }
  
  Future<int> get_RENDER_FPS_NAVI() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_RENDER_FPS_NAVI", {'refId': refId});
    return result;
  }
  
  Future<int> get_RENDER_FPS_NORMAL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_RENDER_FPS_NORMAL", {'refId': refId});
    return result;
  }
  
  Future<int> get_RENDER_FPS_ANIMATION() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_RENDER_FPS_ANIMATION", {'refId': refId});
    return result;
  }
  
  Future<int> get_RENDER_FPS_GESTURE_ACTION() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_RENDER_FPS_GESTURE_ACTION", {'refId': refId});
    return result;
  }
  
  Future<int> get_RENDER_FPS_ANIMATION_WATERWAVE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_RENDER_FPS_ANIMATION_WATERWAVE", {'refId': refId});
    return result;
  }
  
  Future<bool> get_LOG_NAVI_STATE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_LOG_NAVI_STATE", {'refId': refId});
    return result;
  }
  
  Future<int> get_ESCREEN_SHOT_MODE_NULL() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ESCREEN_SHOT_MODE_NULL", {'refId': refId});
    return result;
  }
  
  Future<int> get_ESCREEN_SHOT_MODE_BACKGROUND() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ESCREEN_SHOT_MODE_BACKGROUND", {'refId': refId});
    return result;
  }
  
  Future<int> get_ESCREEN_SHOT_MODE_FRONT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ESCREEN_SHOT_MODE_FRONT", {'refId': refId});
    return result;
  }
  
  Future<int> get_ESCREEN_SHOT_CARTYPE_DEFAULT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ESCREEN_SHOT_CARTYPE_DEFAULT", {'refId': refId});
    return result;
  }
  
  Future<int> get_ESCREEN_SHOT_CARTYPE_JILI() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ESCREEN_SHOT_CARTYPE_JILI", {'refId': refId});
    return result;
  }
  
  Future<int> get_ESCREEN_SHOT_CARTYPE_LUCHANG() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ESCREEN_SHOT_CARTYPE_LUCHANG", {'refId': refId});
    return result;
  }
  
  Future<int> get_SCREEN_SHOT_BITMAP_COMPRESS_RATIO() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_SCREEN_SHOT_BITMAP_COMPRESS_RATIO", {'refId': refId});
    return result;
  }
  
  Future<int> get_ESCREEN_SHOT_CALLBACK_BUFFER() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ESCREEN_SHOT_CALLBACK_BUFFER", {'refId': refId});
    return result;
  }
  
  Future<int> get_ESCREEN_SHOT_CALLBACK_BITMAP() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ESCREEN_SHOT_CALLBACK_BITMAP", {'refId': refId});
    return result;
  }
  
  Future<int> get_ESCREEN_SHOT_CALLBACK_FILE() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_ESCREEN_SHOT_CALLBACK_FILE", {'refId': refId});
    return result;
  }
  
  Future<int> get_E_DISPLAY_DEFAULT() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_E_DISPLAY_DEFAULT", {'refId': refId});
    return result;
  }
  
  Future<int> get_AM_PARAMETERNAME_PROCESS_MAP() async {
    final result = await _channel.invokeMethod("com.autonavi.amap.mapcore.tools.GLMapStaticValue::get_AM_PARAMETERNAME_PROCESS_MAP", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_RENDER_FPS_NAVI(int RENDER_FPS_NAVI) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_RENDER_FPS_NAVI', {'refId': refId, "RENDER_FPS_NAVI": RENDER_FPS_NAVI});
  }
  
  Future<void> set_RENDER_FPS_NORMAL(int RENDER_FPS_NORMAL) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_RENDER_FPS_NORMAL', {'refId': refId, "RENDER_FPS_NORMAL": RENDER_FPS_NORMAL});
  }
  
  Future<void> set_RENDER_FPS_ANIMATION(int RENDER_FPS_ANIMATION) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_RENDER_FPS_ANIMATION', {'refId': refId, "RENDER_FPS_ANIMATION": RENDER_FPS_ANIMATION});
  }
  
  Future<void> set_RENDER_FPS_GESTURE_ACTION(int RENDER_FPS_GESTURE_ACTION) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_RENDER_FPS_GESTURE_ACTION', {'refId': refId, "RENDER_FPS_GESTURE_ACTION": RENDER_FPS_GESTURE_ACTION});
  }
  
  Future<void> set_RENDER_FPS_ANIMATION_WATERWAVE(int RENDER_FPS_ANIMATION_WATERWAVE) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_RENDER_FPS_ANIMATION_WATERWAVE', {'refId': refId, "RENDER_FPS_ANIMATION_WATERWAVE": RENDER_FPS_ANIMATION_WATERWAVE});
  }
  
  Future<void> set_LOG_NAVI_STATE(bool LOG_NAVI_STATE) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_LOG_NAVI_STATE', {'refId': refId, "LOG_NAVI_STATE": LOG_NAVI_STATE});
  }
  
  Future<void> set_ESCREEN_SHOT_MODE_NULL(int ESCREEN_SHOT_MODE_NULL) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_ESCREEN_SHOT_MODE_NULL', {'refId': refId, "ESCREEN_SHOT_MODE_NULL": ESCREEN_SHOT_MODE_NULL});
  }
  
  Future<void> set_ESCREEN_SHOT_MODE_BACKGROUND(int ESCREEN_SHOT_MODE_BACKGROUND) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_ESCREEN_SHOT_MODE_BACKGROUND', {'refId': refId, "ESCREEN_SHOT_MODE_BACKGROUND": ESCREEN_SHOT_MODE_BACKGROUND});
  }
  
  Future<void> set_ESCREEN_SHOT_MODE_FRONT(int ESCREEN_SHOT_MODE_FRONT) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_ESCREEN_SHOT_MODE_FRONT', {'refId': refId, "ESCREEN_SHOT_MODE_FRONT": ESCREEN_SHOT_MODE_FRONT});
  }
  
  Future<void> set_ESCREEN_SHOT_CARTYPE_DEFAULT(int ESCREEN_SHOT_CARTYPE_DEFAULT) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_ESCREEN_SHOT_CARTYPE_DEFAULT', {'refId': refId, "ESCREEN_SHOT_CARTYPE_DEFAULT": ESCREEN_SHOT_CARTYPE_DEFAULT});
  }
  
  Future<void> set_ESCREEN_SHOT_CARTYPE_JILI(int ESCREEN_SHOT_CARTYPE_JILI) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_ESCREEN_SHOT_CARTYPE_JILI', {'refId': refId, "ESCREEN_SHOT_CARTYPE_JILI": ESCREEN_SHOT_CARTYPE_JILI});
  }
  
  Future<void> set_ESCREEN_SHOT_CARTYPE_LUCHANG(int ESCREEN_SHOT_CARTYPE_LUCHANG) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_ESCREEN_SHOT_CARTYPE_LUCHANG', {'refId': refId, "ESCREEN_SHOT_CARTYPE_LUCHANG": ESCREEN_SHOT_CARTYPE_LUCHANG});
  }
  
  Future<void> set_SCREEN_SHOT_BITMAP_COMPRESS_RATIO(int SCREEN_SHOT_BITMAP_COMPRESS_RATIO) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_SCREEN_SHOT_BITMAP_COMPRESS_RATIO', {'refId': refId, "SCREEN_SHOT_BITMAP_COMPRESS_RATIO": SCREEN_SHOT_BITMAP_COMPRESS_RATIO});
  }
  
  Future<void> set_ESCREEN_SHOT_CALLBACK_BUFFER(int ESCREEN_SHOT_CALLBACK_BUFFER) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_ESCREEN_SHOT_CALLBACK_BUFFER', {'refId': refId, "ESCREEN_SHOT_CALLBACK_BUFFER": ESCREEN_SHOT_CALLBACK_BUFFER});
  }
  
  Future<void> set_ESCREEN_SHOT_CALLBACK_BITMAP(int ESCREEN_SHOT_CALLBACK_BITMAP) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_ESCREEN_SHOT_CALLBACK_BITMAP', {'refId': refId, "ESCREEN_SHOT_CALLBACK_BITMAP": ESCREEN_SHOT_CALLBACK_BITMAP});
  }
  
  Future<void> set_ESCREEN_SHOT_CALLBACK_FILE(int ESCREEN_SHOT_CALLBACK_FILE) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_ESCREEN_SHOT_CALLBACK_FILE', {'refId': refId, "ESCREEN_SHOT_CALLBACK_FILE": ESCREEN_SHOT_CALLBACK_FILE});
  }
  
  Future<void> set_E_DISPLAY_DEFAULT(int E_DISPLAY_DEFAULT) async {
    await _channel.invokeMethod('com.autonavi.amap.mapcore.tools.GLMapStaticValue::set_E_DISPLAY_DEFAULT', {'refId': refId, "E_DISPLAY_DEFAULT": E_DISPLAY_DEFAULT});
  }
  

  // 生成方法们
  
}