import 'package:flutter/services.dart';

import 'package:amap_base_flutter/amap_base_flutter.dart';

class ObjectFactory_Android {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  static Future<com_autonavi_ae_gmap_glinterface_MapLabelItem> createcom_autonavi_ae_gmap_glinterface_MapLabelItem() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_glinterface_MapLabelItem');
    return com_autonavi_ae_gmap_glinterface_MapLabelItem.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr> createcom_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr');
    return com_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_glanimation_AdglAnimationContantValues> createcom_autonavi_ae_gmap_glanimation_AdglAnimationContantValues() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_glanimation_AdglAnimationContantValues');
    return com_autonavi_ae_gmap_glanimation_AdglAnimationContantValues.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V> createcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V');
    return com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam2V> createcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam2V() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam2V');
    return com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam2V.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_style_StyleElement> createcom_autonavi_ae_gmap_style_StyleElement() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_style_StyleElement');
    return com_autonavi_ae_gmap_style_StyleElement.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_GLMapEngine_MapViewInitParam> createcom_autonavi_ae_gmap_GLMapEngine_MapViewInitParam() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_GLMapEngine_MapViewInitParam');
    return com_autonavi_ae_gmap_GLMapEngine_MapViewInitParam.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo> createcom_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo');
    return com_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_gloverlay_GLTextureProperty> createcom_autonavi_ae_gmap_gloverlay_GLTextureProperty() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_gloverlay_GLTextureProperty');
    return com_autonavi_ae_gmap_gloverlay_GLTextureProperty.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits> createcom_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits');
    return com_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr> createcom_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr');
    return com_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_gloverlay_GLRouteProperty> createcom_autonavi_ae_gmap_gloverlay_GLRouteProperty() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_gloverlay_GLRouteProperty');
    return com_autonavi_ae_gmap_gloverlay_GLRouteProperty.withRefId(refId);
  }
  
  static Future<com_autonavi_ae_gmap_GLMapEngine_InitParam> createcom_autonavi_ae_gmap_GLMapEngine_InitParam() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_ae_gmap_GLMapEngine_InitParam');
    return com_autonavi_ae_gmap_GLMapEngine_InitParam.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam> createcom_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam');
    return com_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_maploader_NetworkState> createcom_autonavi_amap_mapcore_maploader_NetworkState() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_maploader_NetworkState');
    return com_autonavi_amap_mapcore_maploader_NetworkState.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_MapProjection> createcom_autonavi_amap_mapcore_MapProjection() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_MapProjection');
    return com_autonavi_amap_mapcore_MapProjection.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_tools_TextTextureGenerator> createcom_autonavi_amap_mapcore_tools_TextTextureGenerator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_tools_TextTextureGenerator');
    return com_autonavi_amap_mapcore_tools_TextTextureGenerator.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_tools_GLFileUtil> createcom_autonavi_amap_mapcore_tools_GLFileUtil() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_tools_GLFileUtil');
    return com_autonavi_amap_mapcore_tools_GLFileUtil.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_tools_GlMapUtil> createcom_autonavi_amap_mapcore_tools_GlMapUtil() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_tools_GlMapUtil');
    return com_autonavi_amap_mapcore_tools_GlMapUtil.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_tools_GLMapStaticValue> createcom_autonavi_amap_mapcore_tools_GLMapStaticValue() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_tools_GLMapStaticValue');
    return com_autonavi_amap_mapcore_tools_GLMapStaticValue.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_tools_GLConvertUtil> createcom_autonavi_amap_mapcore_tools_GLConvertUtil() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_tools_GLConvertUtil');
    return com_autonavi_amap_mapcore_tools_GLConvertUtil.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_MsgProcessor> createcom_autonavi_amap_mapcore_MsgProcessor() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_MsgProcessor');
    return com_autonavi_amap_mapcore_MsgProcessor.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_AeUtil_UnZipFileBrake> createcom_autonavi_amap_mapcore_AeUtil_UnZipFileBrake() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_AeUtil_UnZipFileBrake');
    return com_autonavi_amap_mapcore_AeUtil_UnZipFileBrake.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_AbstractNativeInstance> createcom_autonavi_amap_mapcore_AbstractNativeInstance() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_AbstractNativeInstance');
    return com_autonavi_amap_mapcore_AbstractNativeInstance.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_LinkInfo> createcom_autonavi_amap_mapcore_LinkInfo() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_LinkInfo');
    return com_autonavi_amap_mapcore_LinkInfo.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_AMapNativePolyline> createcom_autonavi_amap_mapcore_AMapNativePolyline() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_AMapNativePolyline');
    return com_autonavi_amap_mapcore_AMapNativePolyline.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_IPoint> createcom_autonavi_amap_mapcore_IPoint() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_IPoint');
    return com_autonavi_amap_mapcore_IPoint.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_gles_AMapNativeGLShaderManager> createcom_autonavi_amap_mapcore_gles_AMapNativeGLShaderManager() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_gles_AMapNativeGLShaderManager');
    return com_autonavi_amap_mapcore_gles_AMapNativeGLShaderManager.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_DPoint> createcom_autonavi_amap_mapcore_DPoint() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_DPoint');
    return com_autonavi_amap_mapcore_DPoint.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_AMapNativeRenderer> createcom_autonavi_amap_mapcore_AMapNativeRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_AMapNativeRenderer');
    return com_autonavi_amap_mapcore_AMapNativeRenderer.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_FileUtil> createcom_autonavi_amap_mapcore_FileUtil() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_FileUtil');
    return com_autonavi_amap_mapcore_FileUtil.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_animation_GLTransformation> createcom_autonavi_amap_mapcore_animation_GLTransformation() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_animation_GLTransformation');
    return com_autonavi_amap_mapcore_animation_GLTransformation.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_animation_GLAnimation> createcom_autonavi_amap_mapcore_animation_GLAnimation() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_animation_GLAnimation');
    return com_autonavi_amap_mapcore_animation_GLAnimation.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_CoordUtil> createcom_autonavi_amap_mapcore_CoordUtil() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_CoordUtil');
    return com_autonavi_amap_mapcore_CoordUtil.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_AeUtil> createcom_autonavi_amap_mapcore_AeUtil() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_AeUtil');
    return com_autonavi_amap_mapcore_AeUtil.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_VirtualEarthProjection> createcom_autonavi_amap_mapcore_VirtualEarthProjection() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_VirtualEarthProjection');
    return com_autonavi_amap_mapcore_VirtualEarthProjection.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_Rectangle> createcom_autonavi_amap_mapcore_Rectangle() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_Rectangle');
    return com_autonavi_amap_mapcore_Rectangle.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_AMapEngineUtils> createcom_autonavi_amap_mapcore_AMapEngineUtils() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_AMapEngineUtils');
    return com_autonavi_amap_mapcore_AMapEngineUtils.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_FPoint3> createcom_autonavi_amap_mapcore_FPoint3() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_FPoint3');
    return com_autonavi_amap_mapcore_FPoint3.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_AMapEtaDecoder> createcom_autonavi_amap_mapcore_AMapEtaDecoder() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_AMapEtaDecoder');
    return com_autonavi_amap_mapcore_AMapEtaDecoder.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_FPointBounds_Builder> createcom_autonavi_amap_mapcore_FPointBounds_Builder() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_FPointBounds_Builder');
    return com_autonavi_amap_mapcore_FPointBounds_Builder.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_Inner_3dMap_locationOption> createcom_autonavi_amap_mapcore_Inner_3dMap_locationOption() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_Inner_3dMap_locationOption');
    return com_autonavi_amap_mapcore_Inner_3dMap_locationOption.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_FPoint> createcom_autonavi_amap_mapcore_FPoint() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_FPoint');
    return com_autonavi_amap_mapcore_FPoint.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_AMapNativeParticleSystem> createcom_autonavi_amap_mapcore_AMapNativeParticleSystem() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_AMapNativeParticleSystem');
    return com_autonavi_amap_mapcore_AMapNativeParticleSystem.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_AMapNativeBuildingRenderer> createcom_autonavi_amap_mapcore_AMapNativeBuildingRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_AMapNativeBuildingRenderer');
    return com_autonavi_amap_mapcore_AMapNativeBuildingRenderer.withRefId(refId);
  }
  
  static Future<com_autonavi_amap_mapcore_Convert> createcom_autonavi_amap_mapcore_Convert() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_autonavi_amap_mapcore_Convert');
    return com_autonavi_amap_mapcore_Convert.withRefId(refId);
  }
  
  static Future<com_amap_api_offlineservice_AMapPermissionActivity> createcom_amap_api_offlineservice_AMapPermissionActivity() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_offlineservice_AMapPermissionActivity');
    return com_amap_api_offlineservice_AMapPermissionActivity.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_InfoWindowParams> createcom_amap_api_maps_InfoWindowParams() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_InfoWindowParams');
    return com_amap_api_maps_InfoWindowParams.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_CameraUpdateFactory> createcom_amap_api_maps_CameraUpdateFactory() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_CameraUpdateFactory');
    return com_amap_api_maps_CameraUpdateFactory.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_AMapException> createcom_amap_api_maps_AMapException() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_AMapException');
    return com_amap_api_maps_AMapException.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_AMapOptions> createcom_amap_api_maps_AMapOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_AMapOptions');
    return com_amap_api_maps_AMapOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_AMapOptionsCreator> createcom_amap_api_maps_AMapOptionsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_AMapOptionsCreator');
    return com_amap_api_maps_AMapOptionsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_utils_SpatialRelationUtil> createcom_amap_api_maps_utils_SpatialRelationUtil() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_utils_SpatialRelationUtil');
    return com_amap_api_maps_utils_SpatialRelationUtil.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_MapFragment> createcom_amap_api_maps_MapFragment() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_MapFragment');
    return com_amap_api_maps_MapFragment.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_MapsInitializer> createcom_amap_api_maps_MapsInitializer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_MapsInitializer');
    return com_amap_api_maps_MapsInitializer.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_offlinemap_OfflineMapStatus> createcom_amap_api_maps_offlinemap_OfflineMapStatus() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_offlinemap_OfflineMapStatus');
    return com_amap_api_maps_offlinemap_OfflineMapStatus.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_offlinemap_OfflineMapProvince> createcom_amap_api_maps_offlinemap_OfflineMapProvince() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_offlinemap_OfflineMapProvince');
    return com_amap_api_maps_offlinemap_OfflineMapProvince.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_offlinemap_Province> createcom_amap_api_maps_offlinemap_Province() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_offlinemap_Province');
    return com_amap_api_maps_offlinemap_Province.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_offlinemap_OfflineMapCity> createcom_amap_api_maps_offlinemap_OfflineMapCity() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_offlinemap_OfflineMapCity');
    return com_amap_api_maps_offlinemap_OfflineMapCity.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_offlinemap_OfflineMapActivity> createcom_amap_api_maps_offlinemap_OfflineMapActivity() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_offlinemap_OfflineMapActivity');
    return com_amap_api_maps_offlinemap_OfflineMapActivity.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_offlinemap_City> createcom_amap_api_maps_offlinemap_City() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_offlinemap_City');
    return com_amap_api_maps_offlinemap_City.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_PolygonHoleOptions> createcom_amap_api_maps_model_PolygonHoleOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_PolygonHoleOptions');
    return com_amap_api_maps_model_PolygonHoleOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_TileOverlayOptionsCreator> createcom_amap_api_maps_model_TileOverlayOptionsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_TileOverlayOptionsCreator');
    return com_amap_api_maps_model_TileOverlayOptionsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_MyLocationStyle> createcom_amap_api_maps_model_MyLocationStyle() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_MyLocationStyle');
    return com_amap_api_maps_model_MyLocationStyle.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_LatLngCreator> createcom_amap_api_maps_model_LatLngCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_LatLngCreator');
    return com_amap_api_maps_model_LatLngCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_CircleHoleOptions> createcom_amap_api_maps_model_CircleHoleOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_CircleHoleOptions');
    return com_amap_api_maps_model_CircleHoleOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_LatLngBounds_Builder> createcom_amap_api_maps_model_LatLngBounds_Builder() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_LatLngBounds_Builder');
    return com_amap_api_maps_model_LatLngBounds_Builder.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_NavigateArrowOptions> createcom_amap_api_maps_model_NavigateArrowOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_NavigateArrowOptions');
    return com_amap_api_maps_model_NavigateArrowOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_BitmapDescriptorFactory> createcom_amap_api_maps_model_BitmapDescriptorFactory() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_BitmapDescriptorFactory');
    return com_amap_api_maps_model_BitmapDescriptorFactory.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_MultiPointOverlayOptions> createcom_amap_api_maps_model_MultiPointOverlayOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_MultiPointOverlayOptions');
    return com_amap_api_maps_model_MultiPointOverlayOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_PoiCreator> createcom_amap_api_maps_model_PoiCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_PoiCreator');
    return com_amap_api_maps_model_PoiCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_PolylineOptions> createcom_amap_api_maps_model_PolylineOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_PolylineOptions');
    return com_amap_api_maps_model_PolylineOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_NaviPara> createcom_amap_api_maps_model_NaviPara() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_NaviPara');
    return com_amap_api_maps_model_NaviPara.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_GroundOverlayOptions> createcom_amap_api_maps_model_GroundOverlayOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_GroundOverlayOptions');
    return com_amap_api_maps_model_GroundOverlayOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_GL3DModelOptions> createcom_amap_api_maps_model_GL3DModelOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_GL3DModelOptions');
    return com_amap_api_maps_model_GL3DModelOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_MyTrafficStyle> createcom_amap_api_maps_model_MyTrafficStyle() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_MyTrafficStyle');
    return com_amap_api_maps_model_MyTrafficStyle.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_TextOptionsCreator> createcom_amap_api_maps_model_TextOptionsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_TextOptionsCreator');
    return com_amap_api_maps_model_TextOptionsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_PoiPara> createcom_amap_api_maps_model_PoiPara() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_PoiPara');
    return com_amap_api_maps_model_PoiPara.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_MarkerOptions> createcom_amap_api_maps_model_MarkerOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_MarkerOptions');
    return com_amap_api_maps_model_MarkerOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_CustomMapStyleOptions> createcom_amap_api_maps_model_CustomMapStyleOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_CustomMapStyleOptions');
    return com_amap_api_maps_model_CustomMapStyleOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_BuildingOverlayOptions> createcom_amap_api_maps_model_BuildingOverlayOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_BuildingOverlayOptions');
    return com_amap_api_maps_model_BuildingOverlayOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_CrossOverlayOptions> createcom_amap_api_maps_model_CrossOverlayOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_CrossOverlayOptions');
    return com_amap_api_maps_model_CrossOverlayOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_VisibleRegionCreator> createcom_amap_api_maps_model_VisibleRegionCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_VisibleRegionCreator');
    return com_amap_api_maps_model_VisibleRegionCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_AMapPara> createcom_amap_api_maps_model_AMapPara() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_AMapPara');
    return com_amap_api_maps_model_AMapPara.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_CameraPosition_Builder> createcom_amap_api_maps_model_CameraPosition_Builder() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_CameraPosition_Builder');
    return com_amap_api_maps_model_CameraPosition_Builder.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_CircleOptionsCreator> createcom_amap_api_maps_model_CircleOptionsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_CircleOptionsCreator');
    return com_amap_api_maps_model_CircleOptionsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_PolygonOptions> createcom_amap_api_maps_model_PolygonOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_PolygonOptions');
    return com_amap_api_maps_model_PolygonOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_MyLocationStyleCreator> createcom_amap_api_maps_model_MyLocationStyleCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_MyLocationStyleCreator');
    return com_amap_api_maps_model_MyLocationStyleCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_MarkerOptionsCreator> createcom_amap_api_maps_model_MarkerOptionsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_MarkerOptionsCreator');
    return com_amap_api_maps_model_MarkerOptionsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_LatLngBoundsCreator> createcom_amap_api_maps_model_LatLngBoundsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_LatLngBoundsCreator');
    return com_amap_api_maps_model_LatLngBoundsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_ArcOptions> createcom_amap_api_maps_model_ArcOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_ArcOptions');
    return com_amap_api_maps_model_ArcOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_BitmapDescriptorCreator> createcom_amap_api_maps_model_BitmapDescriptorCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_BitmapDescriptorCreator');
    return com_amap_api_maps_model_BitmapDescriptorCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_CircleOptions> createcom_amap_api_maps_model_CircleOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_CircleOptions');
    return com_amap_api_maps_model_CircleOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_NavigateArrowOptionsCreator> createcom_amap_api_maps_model_NavigateArrowOptionsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_NavigateArrowOptionsCreator');
    return com_amap_api_maps_model_NavigateArrowOptionsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_HeatmapTileProvider_Builder> createcom_amap_api_maps_model_HeatmapTileProvider_Builder() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_HeatmapTileProvider_Builder');
    return com_amap_api_maps_model_HeatmapTileProvider_Builder.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_BaseOptions> createcom_amap_api_maps_model_BaseOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_BaseOptions');
    return com_amap_api_maps_model_BaseOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_PolylineOptionsCreator> createcom_amap_api_maps_model_PolylineOptionsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_PolylineOptionsCreator');
    return com_amap_api_maps_model_PolylineOptionsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_BaseOverlay> createcom_amap_api_maps_model_BaseOverlay() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_BaseOverlay');
    return com_amap_api_maps_model_BaseOverlay.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_TileOverlayOptions> createcom_amap_api_maps_model_TileOverlayOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_TileOverlayOptions');
    return com_amap_api_maps_model_TileOverlayOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_RoutePara> createcom_amap_api_maps_model_RoutePara() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_RoutePara');
    return com_amap_api_maps_model_RoutePara.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_ArcOptionsCreator> createcom_amap_api_maps_model_ArcOptionsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_ArcOptionsCreator');
    return com_amap_api_maps_model_ArcOptionsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_CameraPositionCreator> createcom_amap_api_maps_model_CameraPositionCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_CameraPositionCreator');
    return com_amap_api_maps_model_CameraPositionCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_particle_ParticleOverLifeModule> createcom_amap_api_maps_model_particle_ParticleOverLifeModule() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_particle_ParticleOverLifeModule');
    return com_amap_api_maps_model_particle_ParticleOverLifeModule.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_particle_ParticleOverlayOptionsFactory> createcom_amap_api_maps_model_particle_ParticleOverlayOptionsFactory() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_particle_ParticleOverlayOptionsFactory');
    return com_amap_api_maps_model_particle_ParticleOverlayOptionsFactory.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_particle_ParticleOverlayOptions> createcom_amap_api_maps_model_particle_ParticleOverlayOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_particle_ParticleOverlayOptions');
    return com_amap_api_maps_model_particle_ParticleOverlayOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_TextOptions> createcom_amap_api_maps_model_TextOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_TextOptions');
    return com_amap_api_maps_model_TextOptions.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_PolygonOptionsCreator> createcom_amap_api_maps_model_PolygonOptionsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_PolygonOptionsCreator');
    return com_amap_api_maps_model_PolygonOptionsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_TileProjectionCreator> createcom_amap_api_maps_model_TileProjectionCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_TileProjectionCreator');
    return com_amap_api_maps_model_TileProjectionCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_GroundOverlayOptionsCreator> createcom_amap_api_maps_model_GroundOverlayOptionsCreator() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_GroundOverlayOptionsCreator');
    return com_amap_api_maps_model_GroundOverlayOptionsCreator.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_model_IndoorBuildingInfo> createcom_amap_api_maps_model_IndoorBuildingInfo() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_model_IndoorBuildingInfo');
    return com_amap_api_maps_model_IndoorBuildingInfo.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_AMapUtils> createcom_amap_api_maps_AMapUtils() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_AMapUtils');
    return com_amap_api_maps_AMapUtils.withRefId(refId);
  }
  
  static Future<com_amap_api_maps_TextureMapFragment> createcom_amap_api_maps_TextureMapFragment() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_maps_TextureMapFragment');
    return com_amap_api_maps_TextureMapFragment.withRefId(refId);
  }
  
  static Future<com_amap_api_trace_TraceLocation> createcom_amap_api_trace_TraceLocation() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createcom_amap_api_trace_TraceLocation');
    return com_amap_api_trace_TraceLocation.withRefId(refId);
  }
  
}