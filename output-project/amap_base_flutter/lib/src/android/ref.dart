import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class Ref_Android {
  Ref_Android(this.refId);

  final int refId;

  Future<com_autonavi_ae_gmap_maploader_Pools> castcom_autonavi_ae_gmap_maploader_Pools() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_maploader_Pools', {'refId': refId});
    return com_autonavi_ae_gmap_maploader_Pools.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_maploader_ProcessingTile> castcom_autonavi_ae_gmap_maploader_ProcessingTile() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_maploader_ProcessingTile', {'refId': refId});
    return com_autonavi_ae_gmap_maploader_ProcessingTile.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_GLMapEngine> castcom_autonavi_ae_gmap_GLMapEngine() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_GLMapEngine', {'refId': refId});
    return com_autonavi_ae_gmap_GLMapEngine.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_AbstractMapMessage> castcom_autonavi_ae_gmap_AbstractMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_AbstractMapMessage', {'refId': refId});
    return com_autonavi_ae_gmap_AbstractMapMessage.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glinterface_MapLabelItem> castcom_autonavi_ae_gmap_glinterface_MapLabelItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glinterface_MapLabelItem', {'refId': refId});
    return com_autonavi_ae_gmap_glinterface_MapLabelItem.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr> castcom_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AdglAnimation2V> castcom_autonavi_ae_gmap_glanimation_AdglAnimation2V() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AdglAnimation2V', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AdglAnimation2V.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AdglAnimationContantValues> castcom_autonavi_ae_gmap_glanimation_AdglAnimationContantValues() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AdglAnimationContantValues', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AdglAnimationContantValues.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AdglMapAnimFling> castcom_autonavi_ae_gmap_glanimation_AdglMapAnimFling() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AdglMapAnimFling', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AdglMapAnimFling.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AbstractAdglAnimation> castcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimation', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AbstractAdglAnimation.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AdglAnimation1V> castcom_autonavi_ae_gmap_glanimation_AdglAnimation1V() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AdglAnimation1V', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AdglAnimation1V.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AdglMapAnimPivotZoom> castcom_autonavi_ae_gmap_glanimation_AdglMapAnimPivotZoom() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AdglMapAnimPivotZoom', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AdglMapAnimPivotZoom.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam> castcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V> castcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AdglMapAnimGroup> castcom_autonavi_ae_gmap_glanimation_AdglMapAnimGroup() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AdglMapAnimGroup', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AdglMapAnimGroup.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam2V> castcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam2V() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam2V', {'refId': refId});
    return com_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam2V.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_style_StyleItem> castcom_autonavi_ae_gmap_style_StyleItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_style_StyleItem', {'refId': refId});
    return com_autonavi_ae_gmap_style_StyleItem.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_style_StyleElement> castcom_autonavi_ae_gmap_style_StyleElement() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_style_StyleElement', {'refId': refId});
    return com_autonavi_ae_gmap_style_StyleElement.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_GLMapRender> castcom_autonavi_ae_gmap_GLMapRender() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_GLMapRender', {'refId': refId});
    return com_autonavi_ae_gmap_GLMapRender.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_GLMapEngine_MapViewInitParam> castcom_autonavi_ae_gmap_GLMapEngine_MapViewInitParam() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_GLMapEngine_MapViewInitParam', {'refId': refId});
    return com_autonavi_ae_gmap_GLMapEngine_MapViewInitParam.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo> castcom_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo', {'refId': refId});
    return com_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_GLMapState> castcom_autonavi_ae_gmap_GLMapState() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_GLMapState', {'refId': refId});
    return com_autonavi_ae_gmap_GLMapState.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_gloverlay_BaseRouteOverlay> castcom_autonavi_ae_gmap_gloverlay_BaseRouteOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_gloverlay_BaseRouteOverlay', {'refId': refId});
    return com_autonavi_ae_gmap_gloverlay_BaseRouteOverlay.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_gloverlay_GLTextureProperty> castcom_autonavi_ae_gmap_gloverlay_GLTextureProperty() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_gloverlay_GLTextureProperty', {'refId': refId});
    return com_autonavi_ae_gmap_gloverlay_GLTextureProperty.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_gloverlay_GLCrossVector> castcom_autonavi_ae_gmap_gloverlay_GLCrossVector() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_gloverlay_GLCrossVector', {'refId': refId});
    return com_autonavi_ae_gmap_gloverlay_GLCrossVector.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits> castcom_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits', {'refId': refId});
    return com_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr> castcom_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr', {'refId': refId});
    return com_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_gloverlay_CrossVectorOverlay> castcom_autonavi_ae_gmap_gloverlay_CrossVectorOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_gloverlay_CrossVectorOverlay', {'refId': refId});
    return com_autonavi_ae_gmap_gloverlay_CrossVectorOverlay.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_gloverlay_GLOverlay> castcom_autonavi_ae_gmap_gloverlay_GLOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_gloverlay_GLOverlay', {'refId': refId});
    return com_autonavi_ae_gmap_gloverlay_GLOverlay.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_gloverlay_GLRouteProperty> castcom_autonavi_ae_gmap_gloverlay_GLRouteProperty() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_gloverlay_GLRouteProperty', {'refId': refId});
    return com_autonavi_ae_gmap_gloverlay_GLRouteProperty.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_gloverlay_GLOverlayTexture> castcom_autonavi_ae_gmap_gloverlay_GLOverlayTexture() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_gloverlay_GLOverlayTexture', {'refId': refId});
    return com_autonavi_ae_gmap_gloverlay_GLOverlayTexture.withRefId(result);
  }
  
  Future<com_autonavi_ae_gmap_GLMapEngine_InitParam> castcom_autonavi_ae_gmap_GLMapEngine_InitParam() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_ae_gmap_GLMapEngine_InitParam', {'refId': refId});
    return com_autonavi_ae_gmap_GLMapEngine_InitParam.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam> castcom_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam', {'refId': refId});
    return com_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_maploader_NetworkState> castcom_autonavi_amap_mapcore_maploader_NetworkState() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_maploader_NetworkState', {'refId': refId});
    return com_autonavi_amap_mapcore_maploader_NetworkState.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_maploader_AMapLoader_AMapGridDownloadRequest> castcom_autonavi_amap_mapcore_maploader_AMapLoader_AMapGridDownloadRequest() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_maploader_AMapLoader_AMapGridDownloadRequest', {'refId': refId});
    return com_autonavi_amap_mapcore_maploader_AMapLoader_AMapGridDownloadRequest.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_maploader_AMapLoader> castcom_autonavi_amap_mapcore_maploader_AMapLoader() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_maploader_AMapLoader', {'refId': refId});
    return com_autonavi_amap_mapcore_maploader_AMapLoader.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_MapProjection> castcom_autonavi_amap_mapcore_MapProjection() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_MapProjection', {'refId': refId});
    return com_autonavi_amap_mapcore_MapProjection.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_tools_TextTextureGenerator> castcom_autonavi_amap_mapcore_tools_TextTextureGenerator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_tools_TextTextureGenerator', {'refId': refId});
    return com_autonavi_amap_mapcore_tools_TextTextureGenerator.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_tools_GLFileUtil> castcom_autonavi_amap_mapcore_tools_GLFileUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_tools_GLFileUtil', {'refId': refId});
    return com_autonavi_amap_mapcore_tools_GLFileUtil.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_tools_GlMapUtil> castcom_autonavi_amap_mapcore_tools_GlMapUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_tools_GlMapUtil', {'refId': refId});
    return com_autonavi_amap_mapcore_tools_GlMapUtil.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_tools_GLMapStaticValue> castcom_autonavi_amap_mapcore_tools_GLMapStaticValue() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_tools_GLMapStaticValue', {'refId': refId});
    return com_autonavi_amap_mapcore_tools_GLMapStaticValue.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_tools_GLConvertUtil> castcom_autonavi_amap_mapcore_tools_GLConvertUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_tools_GLConvertUtil', {'refId': refId});
    return com_autonavi_amap_mapcore_tools_GLConvertUtil.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_MsgProcessor> castcom_autonavi_amap_mapcore_MsgProcessor() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_MsgProcessor', {'refId': refId});
    return com_autonavi_amap_mapcore_MsgProcessor.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_AeUtil_UnZipFileBrake> castcom_autonavi_amap_mapcore_AeUtil_UnZipFileBrake() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_AeUtil_UnZipFileBrake', {'refId': refId});
    return com_autonavi_amap_mapcore_AeUtil_UnZipFileBrake.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_AbstractNativeInstance> castcom_autonavi_amap_mapcore_AbstractNativeInstance() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_AbstractNativeInstance', {'refId': refId});
    return com_autonavi_amap_mapcore_AbstractNativeInstance.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_LinkInfo> castcom_autonavi_amap_mapcore_LinkInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_LinkInfo', {'refId': refId});
    return com_autonavi_amap_mapcore_LinkInfo.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_AMapNativePolyline> castcom_autonavi_amap_mapcore_AMapNativePolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_AMapNativePolyline', {'refId': refId});
    return com_autonavi_amap_mapcore_AMapNativePolyline.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_IPoint> castcom_autonavi_amap_mapcore_IPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_IPoint', {'refId': refId});
    return com_autonavi_amap_mapcore_IPoint.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_gles_AMapNativeGLShaderManager> castcom_autonavi_amap_mapcore_gles_AMapNativeGLShaderManager() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_gles_AMapNativeGLShaderManager', {'refId': refId});
    return com_autonavi_amap_mapcore_gles_AMapNativeGLShaderManager.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_DPoint> castcom_autonavi_amap_mapcore_DPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_DPoint', {'refId': refId});
    return com_autonavi_amap_mapcore_DPoint.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_AMapNativeRenderer> castcom_autonavi_amap_mapcore_AMapNativeRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_AMapNativeRenderer', {'refId': refId});
    return com_autonavi_amap_mapcore_AMapNativeRenderer.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_FileUtil> castcom_autonavi_amap_mapcore_FileUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_FileUtil', {'refId': refId});
    return com_autonavi_amap_mapcore_FileUtil.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_animation_GLTranslateAnimation> castcom_autonavi_amap_mapcore_animation_GLTranslateAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_animation_GLTranslateAnimation', {'refId': refId});
    return com_autonavi_amap_mapcore_animation_GLTranslateAnimation.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_animation_GLRotateAnimation> castcom_autonavi_amap_mapcore_animation_GLRotateAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_animation_GLRotateAnimation', {'refId': refId});
    return com_autonavi_amap_mapcore_animation_GLRotateAnimation.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_animation_GLAlphaAnimation> castcom_autonavi_amap_mapcore_animation_GLAlphaAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_animation_GLAlphaAnimation', {'refId': refId});
    return com_autonavi_amap_mapcore_animation_GLAlphaAnimation.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_animation_GLScaleAnimation> castcom_autonavi_amap_mapcore_animation_GLScaleAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_animation_GLScaleAnimation', {'refId': refId});
    return com_autonavi_amap_mapcore_animation_GLScaleAnimation.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_animation_GLTransformation> castcom_autonavi_amap_mapcore_animation_GLTransformation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_animation_GLTransformation', {'refId': refId});
    return com_autonavi_amap_mapcore_animation_GLTransformation.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_animation_GLAnimationSet> castcom_autonavi_amap_mapcore_animation_GLAnimationSet() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_animation_GLAnimationSet', {'refId': refId});
    return com_autonavi_amap_mapcore_animation_GLAnimationSet.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_animation_GLEmergeAnimation> castcom_autonavi_amap_mapcore_animation_GLEmergeAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_animation_GLEmergeAnimation', {'refId': refId});
    return com_autonavi_amap_mapcore_animation_GLEmergeAnimation.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_animation_GLAnimation> castcom_autonavi_amap_mapcore_animation_GLAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_animation_GLAnimation', {'refId': refId});
    return com_autonavi_amap_mapcore_animation_GLAnimation.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_MapConfig> castcom_autonavi_amap_mapcore_MapConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_MapConfig', {'refId': refId});
    return com_autonavi_amap_mapcore_MapConfig.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_message_HoverGestureMapMessage> castcom_autonavi_amap_mapcore_message_HoverGestureMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_message_HoverGestureMapMessage', {'refId': refId});
    return com_autonavi_amap_mapcore_message_HoverGestureMapMessage.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_message_MoveGestureMapMessage> castcom_autonavi_amap_mapcore_message_MoveGestureMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_message_MoveGestureMapMessage', {'refId': refId});
    return com_autonavi_amap_mapcore_message_MoveGestureMapMessage.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_message_ScaleGestureMapMessage> castcom_autonavi_amap_mapcore_message_ScaleGestureMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_message_ScaleGestureMapMessage', {'refId': refId});
    return com_autonavi_amap_mapcore_message_ScaleGestureMapMessage.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_message_AbstractGestureMapMessage> castcom_autonavi_amap_mapcore_message_AbstractGestureMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_message_AbstractGestureMapMessage', {'refId': refId});
    return com_autonavi_amap_mapcore_message_AbstractGestureMapMessage.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_message_RotateGestureMapMessage> castcom_autonavi_amap_mapcore_message_RotateGestureMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_message_RotateGestureMapMessage', {'refId': refId});
    return com_autonavi_amap_mapcore_message_RotateGestureMapMessage.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_FPointBounds> castcom_autonavi_amap_mapcore_FPointBounds() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_FPointBounds', {'refId': refId});
    return com_autonavi_amap_mapcore_FPointBounds.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_CoordUtil> castcom_autonavi_amap_mapcore_CoordUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_CoordUtil', {'refId': refId});
    return com_autonavi_amap_mapcore_CoordUtil.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_AeUtil> castcom_autonavi_amap_mapcore_AeUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_AeUtil', {'refId': refId});
    return com_autonavi_amap_mapcore_AeUtil.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_VirtualEarthProjection> castcom_autonavi_amap_mapcore_VirtualEarthProjection() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_VirtualEarthProjection', {'refId': refId});
    return com_autonavi_amap_mapcore_VirtualEarthProjection.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_Rectangle> castcom_autonavi_amap_mapcore_Rectangle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_Rectangle', {'refId': refId});
    return com_autonavi_amap_mapcore_Rectangle.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_Inner_3dMap_location> castcom_autonavi_amap_mapcore_Inner_3dMap_location() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_Inner_3dMap_location', {'refId': refId});
    return com_autonavi_amap_mapcore_Inner_3dMap_location.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_AMapEngineUtils> castcom_autonavi_amap_mapcore_AMapEngineUtils() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_AMapEngineUtils', {'refId': refId});
    return com_autonavi_amap_mapcore_AMapEngineUtils.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_FPoint3> castcom_autonavi_amap_mapcore_FPoint3() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_FPoint3', {'refId': refId});
    return com_autonavi_amap_mapcore_FPoint3.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_AMapEtaDecoder> castcom_autonavi_amap_mapcore_AMapEtaDecoder() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_AMapEtaDecoder', {'refId': refId});
    return com_autonavi_amap_mapcore_AMapEtaDecoder.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_FPointBounds_Builder> castcom_autonavi_amap_mapcore_FPointBounds_Builder() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_FPointBounds_Builder', {'refId': refId});
    return com_autonavi_amap_mapcore_FPointBounds_Builder.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_Inner_3dMap_locationOption> castcom_autonavi_amap_mapcore_Inner_3dMap_locationOption() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_Inner_3dMap_locationOption', {'refId': refId});
    return com_autonavi_amap_mapcore_Inner_3dMap_locationOption.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_FPoint> castcom_autonavi_amap_mapcore_FPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_FPoint', {'refId': refId});
    return com_autonavi_amap_mapcore_FPoint.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_AMapNativeParticleSystem> castcom_autonavi_amap_mapcore_AMapNativeParticleSystem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_AMapNativeParticleSystem', {'refId': refId});
    return com_autonavi_amap_mapcore_AMapNativeParticleSystem.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_AbstractCameraUpdateMessage> castcom_autonavi_amap_mapcore_AbstractCameraUpdateMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_AbstractCameraUpdateMessage', {'refId': refId});
    return com_autonavi_amap_mapcore_AbstractCameraUpdateMessage.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_AMapNativeBuildingRenderer> castcom_autonavi_amap_mapcore_AMapNativeBuildingRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_AMapNativeBuildingRenderer', {'refId': refId});
    return com_autonavi_amap_mapcore_AMapNativeBuildingRenderer.withRefId(result);
  }
  
  Future<com_autonavi_amap_mapcore_Convert> castcom_autonavi_amap_mapcore_Convert() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_autonavi_amap_mapcore_Convert', {'refId': refId});
    return com_autonavi_amap_mapcore_Convert.withRefId(result);
  }
  
  Future<com_amap_api_offlineservice_AMapPermissionActivity> castcom_amap_api_offlineservice_AMapPermissionActivity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_offlineservice_AMapPermissionActivity', {'refId': refId});
    return com_amap_api_offlineservice_AMapPermissionActivity.withRefId(result);
  }
  
  Future<com_amap_api_maps_UiSettings> castcom_amap_api_maps_UiSettings() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_UiSettings', {'refId': refId});
    return com_amap_api_maps_UiSettings.withRefId(result);
  }
  
  Future<com_amap_api_maps_SwipeDismissTouchListener> castcom_amap_api_maps_SwipeDismissTouchListener() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_SwipeDismissTouchListener', {'refId': refId});
    return com_amap_api_maps_SwipeDismissTouchListener.withRefId(result);
  }
  
  Future<com_amap_api_maps_InfoWindowParams> castcom_amap_api_maps_InfoWindowParams() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_InfoWindowParams', {'refId': refId});
    return com_amap_api_maps_InfoWindowParams.withRefId(result);
  }
  
  Future<com_amap_api_maps_CameraUpdateFactory> castcom_amap_api_maps_CameraUpdateFactory() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_CameraUpdateFactory', {'refId': refId});
    return com_amap_api_maps_CameraUpdateFactory.withRefId(result);
  }
  
  Future<com_amap_api_maps_AMapException> castcom_amap_api_maps_AMapException() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_AMapException', {'refId': refId});
    return com_amap_api_maps_AMapException.withRefId(result);
  }
  
  Future<com_amap_api_maps_AMapOptions> castcom_amap_api_maps_AMapOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_AMapOptions', {'refId': refId});
    return com_amap_api_maps_AMapOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_AMapOptionsCreator> castcom_amap_api_maps_AMapOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_AMapOptionsCreator', {'refId': refId});
    return com_amap_api_maps_AMapOptionsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_CoordinateConverter> castcom_amap_api_maps_CoordinateConverter() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_CoordinateConverter', {'refId': refId});
    return com_amap_api_maps_CoordinateConverter.withRefId(result);
  }
  
  Future<com_amap_api_maps_utils_SpatialRelationUtil> castcom_amap_api_maps_utils_SpatialRelationUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_utils_SpatialRelationUtil', {'refId': refId});
    return com_amap_api_maps_utils_SpatialRelationUtil.withRefId(result);
  }
  
  Future<com_amap_api_maps_utils_overlay_MovingPointOverlay> castcom_amap_api_maps_utils_overlay_MovingPointOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_utils_overlay_MovingPointOverlay', {'refId': refId});
    return com_amap_api_maps_utils_overlay_MovingPointOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_utils_overlay_SmoothMoveMarker> castcom_amap_api_maps_utils_overlay_SmoothMoveMarker() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_utils_overlay_SmoothMoveMarker', {'refId': refId});
    return com_amap_api_maps_utils_overlay_SmoothMoveMarker.withRefId(result);
  }
  
  Future<com_amap_api_maps_CameraUpdate> castcom_amap_api_maps_CameraUpdate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_CameraUpdate', {'refId': refId});
    return com_amap_api_maps_CameraUpdate.withRefId(result);
  }
  
  Future<com_amap_api_maps_MapFragment> castcom_amap_api_maps_MapFragment() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_MapFragment', {'refId': refId});
    return com_amap_api_maps_MapFragment.withRefId(result);
  }
  
  Future<com_amap_api_maps_SwipeDismissCallBack> castcom_amap_api_maps_SwipeDismissCallBack() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_SwipeDismissCallBack', {'refId': refId});
    return com_amap_api_maps_SwipeDismissCallBack.withRefId(result);
  }
  
  Future<com_amap_api_maps_SwipeDismissView> castcom_amap_api_maps_SwipeDismissView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_SwipeDismissView', {'refId': refId});
    return com_amap_api_maps_SwipeDismissView.withRefId(result);
  }
  
  Future<com_amap_api_maps_MapsInitializer> castcom_amap_api_maps_MapsInitializer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_MapsInitializer', {'refId': refId});
    return com_amap_api_maps_MapsInitializer.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_OfflineMapStatus> castcom_amap_api_maps_offlinemap_OfflineMapStatus() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_OfflineMapStatus', {'refId': refId});
    return com_amap_api_maps_offlinemap_OfflineMapStatus.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_OfflineMapProvince> castcom_amap_api_maps_offlinemap_OfflineMapProvince() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_OfflineMapProvince', {'refId': refId});
    return com_amap_api_maps_offlinemap_OfflineMapProvince.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_DownloadProgressView> castcom_amap_api_maps_offlinemap_DownloadProgressView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_DownloadProgressView', {'refId': refId});
    return com_amap_api_maps_offlinemap_DownloadProgressView.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_Province> castcom_amap_api_maps_offlinemap_Province() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_Province', {'refId': refId});
    return com_amap_api_maps_offlinemap_Province.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_OfflineMapManager> castcom_amap_api_maps_offlinemap_OfflineMapManager() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_OfflineMapManager', {'refId': refId});
    return com_amap_api_maps_offlinemap_OfflineMapManager.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_OfflineMapCity> castcom_amap_api_maps_offlinemap_OfflineMapCity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_OfflineMapCity', {'refId': refId});
    return com_amap_api_maps_offlinemap_OfflineMapCity.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_OfflineMapActivity> castcom_amap_api_maps_offlinemap_OfflineMapActivity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_OfflineMapActivity', {'refId': refId});
    return com_amap_api_maps_offlinemap_OfflineMapActivity.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_City> castcom_amap_api_maps_offlinemap_City() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_City', {'refId': refId});
    return com_amap_api_maps_offlinemap_City.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_DownLoadListView> castcom_amap_api_maps_offlinemap_DownLoadListView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_DownLoadListView', {'refId': refId});
    return com_amap_api_maps_offlinemap_DownLoadListView.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_DownLoadExpandListView> castcom_amap_api_maps_offlinemap_DownLoadExpandListView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_DownLoadExpandListView', {'refId': refId});
    return com_amap_api_maps_offlinemap_DownLoadExpandListView.withRefId(result);
  }
  
  Future<com_amap_api_maps_offlinemap_CityExpandView> castcom_amap_api_maps_offlinemap_CityExpandView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_offlinemap_CityExpandView', {'refId': refId});
    return com_amap_api_maps_offlinemap_CityExpandView.withRefId(result);
  }
  
  Future<com_amap_api_maps_Projection> castcom_amap_api_maps_Projection() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_Projection', {'refId': refId});
    return com_amap_api_maps_Projection.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_Polygon> castcom_amap_api_maps_model_Polygon() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_Polygon', {'refId': refId});
    return com_amap_api_maps_model_Polygon.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_BitmapDescriptor> castcom_amap_api_maps_model_BitmapDescriptor() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_BitmapDescriptor', {'refId': refId});
    return com_amap_api_maps_model_BitmapDescriptor.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_PolygonHoleOptions> castcom_amap_api_maps_model_PolygonHoleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_PolygonHoleOptions', {'refId': refId});
    return com_amap_api_maps_model_PolygonHoleOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_TileOverlayOptionsCreator> castcom_amap_api_maps_model_TileOverlayOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_TileOverlayOptionsCreator', {'refId': refId});
    return com_amap_api_maps_model_TileOverlayOptionsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_Poi> castcom_amap_api_maps_model_Poi() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_Poi', {'refId': refId});
    return com_amap_api_maps_model_Poi.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_MyLocationStyle> castcom_amap_api_maps_model_MyLocationStyle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_MyLocationStyle', {'refId': refId});
    return com_amap_api_maps_model_MyLocationStyle.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_RouteOverlay> castcom_amap_api_maps_model_RouteOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_RouteOverlay', {'refId': refId});
    return com_amap_api_maps_model_RouteOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_VisibleRegion> castcom_amap_api_maps_model_VisibleRegion() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_VisibleRegion', {'refId': refId});
    return com_amap_api_maps_model_VisibleRegion.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_LatLngCreator> castcom_amap_api_maps_model_LatLngCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_LatLngCreator', {'refId': refId});
    return com_amap_api_maps_model_LatLngCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_CircleHoleOptions> castcom_amap_api_maps_model_CircleHoleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_CircleHoleOptions', {'refId': refId});
    return com_amap_api_maps_model_CircleHoleOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_Text> castcom_amap_api_maps_model_Text() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_Text', {'refId': refId});
    return com_amap_api_maps_model_Text.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_LatLngBounds_Builder> castcom_amap_api_maps_model_LatLngBounds_Builder() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_LatLngBounds_Builder', {'refId': refId});
    return com_amap_api_maps_model_LatLngBounds_Builder.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_NavigateArrowOptions> castcom_amap_api_maps_model_NavigateArrowOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_NavigateArrowOptions', {'refId': refId});
    return com_amap_api_maps_model_NavigateArrowOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_BitmapDescriptorFactory> castcom_amap_api_maps_model_BitmapDescriptorFactory() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_BitmapDescriptorFactory', {'refId': refId});
    return com_amap_api_maps_model_BitmapDescriptorFactory.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_UrlTileProvider> castcom_amap_api_maps_model_UrlTileProvider() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_UrlTileProvider', {'refId': refId});
    return com_amap_api_maps_model_UrlTileProvider.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_MultiPointOverlayOptions> castcom_amap_api_maps_model_MultiPointOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_MultiPointOverlayOptions', {'refId': refId});
    return com_amap_api_maps_model_MultiPointOverlayOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_PoiCreator> castcom_amap_api_maps_model_PoiCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_PoiCreator', {'refId': refId});
    return com_amap_api_maps_model_PoiCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_PolylineOptions> castcom_amap_api_maps_model_PolylineOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_PolylineOptions', {'refId': refId});
    return com_amap_api_maps_model_PolylineOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_Tile> castcom_amap_api_maps_model_Tile() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_Tile', {'refId': refId});
    return com_amap_api_maps_model_Tile.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_GL3DModel> castcom_amap_api_maps_model_GL3DModel() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_GL3DModel', {'refId': refId});
    return com_amap_api_maps_model_GL3DModel.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_Gradient> castcom_amap_api_maps_model_Gradient() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_Gradient', {'refId': refId});
    return com_amap_api_maps_model_Gradient.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_NaviPara> castcom_amap_api_maps_model_NaviPara() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_NaviPara', {'refId': refId});
    return com_amap_api_maps_model_NaviPara.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_GroundOverlayOptions> castcom_amap_api_maps_model_GroundOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_GroundOverlayOptions', {'refId': refId});
    return com_amap_api_maps_model_GroundOverlayOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_GL3DModelOptions> castcom_amap_api_maps_model_GL3DModelOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_GL3DModelOptions', {'refId': refId});
    return com_amap_api_maps_model_GL3DModelOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_GroundOverlay> castcom_amap_api_maps_model_GroundOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_GroundOverlay', {'refId': refId});
    return com_amap_api_maps_model_GroundOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_MyTrafficStyle> castcom_amap_api_maps_model_MyTrafficStyle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_MyTrafficStyle', {'refId': refId});
    return com_amap_api_maps_model_MyTrafficStyle.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_CameraPosition> castcom_amap_api_maps_model_CameraPosition() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_CameraPosition', {'refId': refId});
    return com_amap_api_maps_model_CameraPosition.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_TextOptionsCreator> castcom_amap_api_maps_model_TextOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_TextOptionsCreator', {'refId': refId});
    return com_amap_api_maps_model_TextOptionsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_PoiPara> castcom_amap_api_maps_model_PoiPara() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_PoiPara', {'refId': refId});
    return com_amap_api_maps_model_PoiPara.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_MarkerOptions> castcom_amap_api_maps_model_MarkerOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_MarkerOptions', {'refId': refId});
    return com_amap_api_maps_model_MarkerOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_HeatmapTileProvider> castcom_amap_api_maps_model_HeatmapTileProvider() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_HeatmapTileProvider', {'refId': refId});
    return com_amap_api_maps_model_HeatmapTileProvider.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_NavigateArrow> castcom_amap_api_maps_model_NavigateArrow() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_NavigateArrow', {'refId': refId});
    return com_amap_api_maps_model_NavigateArrow.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_animation_AnimationSet> castcom_amap_api_maps_model_animation_AnimationSet() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_animation_AnimationSet', {'refId': refId});
    return com_amap_api_maps_model_animation_AnimationSet.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_animation_RotateAnimation> castcom_amap_api_maps_model_animation_RotateAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_animation_RotateAnimation', {'refId': refId});
    return com_amap_api_maps_model_animation_RotateAnimation.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_animation_TranslateAnimation> castcom_amap_api_maps_model_animation_TranslateAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_animation_TranslateAnimation', {'refId': refId});
    return com_amap_api_maps_model_animation_TranslateAnimation.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_animation_Animation> castcom_amap_api_maps_model_animation_Animation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_animation_Animation', {'refId': refId});
    return com_amap_api_maps_model_animation_Animation.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_animation_EmergeAnimation> castcom_amap_api_maps_model_animation_EmergeAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_animation_EmergeAnimation', {'refId': refId});
    return com_amap_api_maps_model_animation_EmergeAnimation.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_animation_AlphaAnimation> castcom_amap_api_maps_model_animation_AlphaAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_animation_AlphaAnimation', {'refId': refId});
    return com_amap_api_maps_model_animation_AlphaAnimation.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_animation_ScaleAnimation> castcom_amap_api_maps_model_animation_ScaleAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_animation_ScaleAnimation', {'refId': refId});
    return com_amap_api_maps_model_animation_ScaleAnimation.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_LatLngBounds> castcom_amap_api_maps_model_LatLngBounds() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_LatLngBounds', {'refId': refId});
    return com_amap_api_maps_model_LatLngBounds.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_CustomMapStyleOptions> castcom_amap_api_maps_model_CustomMapStyleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_CustomMapStyleOptions', {'refId': refId});
    return com_amap_api_maps_model_CustomMapStyleOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_BuildingOverlayOptions> castcom_amap_api_maps_model_BuildingOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_BuildingOverlayOptions', {'refId': refId});
    return com_amap_api_maps_model_BuildingOverlayOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_CrossOverlayOptions> castcom_amap_api_maps_model_CrossOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_CrossOverlayOptions', {'refId': refId});
    return com_amap_api_maps_model_CrossOverlayOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_VisibleRegionCreator> castcom_amap_api_maps_model_VisibleRegionCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_VisibleRegionCreator', {'refId': refId});
    return com_amap_api_maps_model_VisibleRegionCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_LatLng> castcom_amap_api_maps_model_LatLng() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_LatLng', {'refId': refId});
    return com_amap_api_maps_model_LatLng.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_TileProjection> castcom_amap_api_maps_model_TileProjection() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_TileProjection', {'refId': refId});
    return com_amap_api_maps_model_TileProjection.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_AMapPara> castcom_amap_api_maps_model_AMapPara() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_AMapPara', {'refId': refId});
    return com_amap_api_maps_model_AMapPara.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_CameraPosition_Builder> castcom_amap_api_maps_model_CameraPosition_Builder() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_CameraPosition_Builder', {'refId': refId});
    return com_amap_api_maps_model_CameraPosition_Builder.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_BasePointOverlay> castcom_amap_api_maps_model_BasePointOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_BasePointOverlay', {'refId': refId});
    return com_amap_api_maps_model_BasePointOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_CircleOptionsCreator> castcom_amap_api_maps_model_CircleOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_CircleOptionsCreator', {'refId': refId});
    return com_amap_api_maps_model_CircleOptionsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_Arc> castcom_amap_api_maps_model_Arc() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_Arc', {'refId': refId});
    return com_amap_api_maps_model_Arc.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_AMapCameraInfo> castcom_amap_api_maps_model_AMapCameraInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_AMapCameraInfo', {'refId': refId});
    return com_amap_api_maps_model_AMapCameraInfo.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_Circle> castcom_amap_api_maps_model_Circle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_Circle', {'refId': refId});
    return com_amap_api_maps_model_Circle.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_PolygonOptions> castcom_amap_api_maps_model_PolygonOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_PolygonOptions', {'refId': refId});
    return com_amap_api_maps_model_PolygonOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_WeightedLatLng> castcom_amap_api_maps_model_WeightedLatLng() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_WeightedLatLng', {'refId': refId});
    return com_amap_api_maps_model_WeightedLatLng.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_MyLocationStyleCreator> castcom_amap_api_maps_model_MyLocationStyleCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_MyLocationStyleCreator', {'refId': refId});
    return com_amap_api_maps_model_MyLocationStyleCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_MarkerOptionsCreator> castcom_amap_api_maps_model_MarkerOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_MarkerOptionsCreator', {'refId': refId});
    return com_amap_api_maps_model_MarkerOptionsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_MultiPointItem> castcom_amap_api_maps_model_MultiPointItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_MultiPointItem', {'refId': refId});
    return com_amap_api_maps_model_MultiPointItem.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_LatLngBoundsCreator> castcom_amap_api_maps_model_LatLngBoundsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_LatLngBoundsCreator', {'refId': refId});
    return com_amap_api_maps_model_LatLngBoundsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_ArcOptions> castcom_amap_api_maps_model_ArcOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_ArcOptions', {'refId': refId});
    return com_amap_api_maps_model_ArcOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_BitmapDescriptorCreator> castcom_amap_api_maps_model_BitmapDescriptorCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_BitmapDescriptorCreator', {'refId': refId});
    return com_amap_api_maps_model_BitmapDescriptorCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_CircleOptions> castcom_amap_api_maps_model_CircleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_CircleOptions', {'refId': refId});
    return com_amap_api_maps_model_CircleOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_NavigateArrowOptionsCreator> castcom_amap_api_maps_model_NavigateArrowOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_NavigateArrowOptionsCreator', {'refId': refId});
    return com_amap_api_maps_model_NavigateArrowOptionsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_RuntimeRemoteException> castcom_amap_api_maps_model_RuntimeRemoteException() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_RuntimeRemoteException', {'refId': refId});
    return com_amap_api_maps_model_RuntimeRemoteException.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_AMapGLOverlay> castcom_amap_api_maps_model_AMapGLOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_AMapGLOverlay', {'refId': refId});
    return com_amap_api_maps_model_AMapGLOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_HeatmapTileProvider_Builder> castcom_amap_api_maps_model_HeatmapTileProvider_Builder() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_HeatmapTileProvider_Builder', {'refId': refId});
    return com_amap_api_maps_model_HeatmapTileProvider_Builder.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_MultiPointOverlay> castcom_amap_api_maps_model_MultiPointOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_MultiPointOverlay', {'refId': refId});
    return com_amap_api_maps_model_MultiPointOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_BaseOptions> castcom_amap_api_maps_model_BaseOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_BaseOptions', {'refId': refId});
    return com_amap_api_maps_model_BaseOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_PolylineOptionsCreator> castcom_amap_api_maps_model_PolylineOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_PolylineOptionsCreator', {'refId': refId});
    return com_amap_api_maps_model_PolylineOptionsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_BaseOverlay> castcom_amap_api_maps_model_BaseOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_BaseOverlay', {'refId': refId});
    return com_amap_api_maps_model_BaseOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_Marker> castcom_amap_api_maps_model_Marker() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_Marker', {'refId': refId});
    return com_amap_api_maps_model_Marker.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_TileOverlayOptions> castcom_amap_api_maps_model_TileOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_TileOverlayOptions', {'refId': refId});
    return com_amap_api_maps_model_TileOverlayOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_RoutePara> castcom_amap_api_maps_model_RoutePara() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_RoutePara', {'refId': refId});
    return com_amap_api_maps_model_RoutePara.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_ArcOptionsCreator> castcom_amap_api_maps_model_ArcOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_ArcOptionsCreator', {'refId': refId});
    return com_amap_api_maps_model_ArcOptionsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_CameraPositionCreator> castcom_amap_api_maps_model_CameraPositionCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_CameraPositionCreator', {'refId': refId});
    return com_amap_api_maps_model_CameraPositionCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_CrossOverlay> castcom_amap_api_maps_model_CrossOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_CrossOverlay', {'refId': refId});
    return com_amap_api_maps_model_CrossOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_ParticleOverLifeModule> castcom_amap_api_maps_model_particle_ParticleOverLifeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_ParticleOverLifeModule', {'refId': refId});
    return com_amap_api_maps_model_particle_ParticleOverLifeModule.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_ConstantRotationOverLife> castcom_amap_api_maps_model_particle_ConstantRotationOverLife() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_ConstantRotationOverLife', {'refId': refId});
    return com_amap_api_maps_model_particle_ConstantRotationOverLife.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_SinglePointParticleShape> castcom_amap_api_maps_model_particle_SinglePointParticleShape() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_SinglePointParticleShape', {'refId': refId});
    return com_amap_api_maps_model_particle_SinglePointParticleShape.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_RandomVelocityBetweenTwoConstants> castcom_amap_api_maps_model_particle_RandomVelocityBetweenTwoConstants() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_RandomVelocityBetweenTwoConstants', {'refId': refId});
    return com_amap_api_maps_model_particle_RandomVelocityBetweenTwoConstants.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_CurveSizeOverLife> castcom_amap_api_maps_model_particle_CurveSizeOverLife() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_CurveSizeOverLife', {'refId': refId});
    return com_amap_api_maps_model_particle_CurveSizeOverLife.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_ParticleEmissionModule> castcom_amap_api_maps_model_particle_ParticleEmissionModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_ParticleEmissionModule', {'refId': refId});
    return com_amap_api_maps_model_particle_ParticleEmissionModule.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_SizeOverLife> castcom_amap_api_maps_model_particle_SizeOverLife() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_SizeOverLife', {'refId': refId});
    return com_amap_api_maps_model_particle_SizeOverLife.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_RectParticleShape> castcom_amap_api_maps_model_particle_RectParticleShape() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_RectParticleShape', {'refId': refId});
    return com_amap_api_maps_model_particle_RectParticleShape.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_ColorGenerate> castcom_amap_api_maps_model_particle_ColorGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_ColorGenerate', {'refId': refId});
    return com_amap_api_maps_model_particle_ColorGenerate.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_VelocityGenerate> castcom_amap_api_maps_model_particle_VelocityGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_VelocityGenerate', {'refId': refId});
    return com_amap_api_maps_model_particle_VelocityGenerate.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_RotationOverLife> castcom_amap_api_maps_model_particle_RotationOverLife() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_RotationOverLife', {'refId': refId});
    return com_amap_api_maps_model_particle_RotationOverLife.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_RandomColorBetWeenTwoConstants> castcom_amap_api_maps_model_particle_RandomColorBetWeenTwoConstants() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_RandomColorBetWeenTwoConstants', {'refId': refId});
    return com_amap_api_maps_model_particle_RandomColorBetWeenTwoConstants.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_ParticleShapeModule> castcom_amap_api_maps_model_particle_ParticleShapeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_ParticleShapeModule', {'refId': refId});
    return com_amap_api_maps_model_particle_ParticleShapeModule.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_ParticleOverlayOptionsFactory> castcom_amap_api_maps_model_particle_ParticleOverlayOptionsFactory() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_ParticleOverlayOptionsFactory', {'refId': refId});
    return com_amap_api_maps_model_particle_ParticleOverlayOptionsFactory.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_ParticleOverlayOptions> castcom_amap_api_maps_model_particle_ParticleOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_ParticleOverlayOptions', {'refId': refId});
    return com_amap_api_maps_model_particle_ParticleOverlayOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_particle_ParticleOverlay> castcom_amap_api_maps_model_particle_ParticleOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_particle_ParticleOverlay', {'refId': refId});
    return com_amap_api_maps_model_particle_ParticleOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_BaseHoleOptions> castcom_amap_api_maps_model_BaseHoleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_BaseHoleOptions', {'refId': refId});
    return com_amap_api_maps_model_BaseHoleOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_TextOptions> castcom_amap_api_maps_model_TextOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_TextOptions', {'refId': refId});
    return com_amap_api_maps_model_TextOptions.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_TileOverlay> castcom_amap_api_maps_model_TileOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_TileOverlay', {'refId': refId});
    return com_amap_api_maps_model_TileOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_PolygonOptionsCreator> castcom_amap_api_maps_model_PolygonOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_PolygonOptionsCreator', {'refId': refId});
    return com_amap_api_maps_model_PolygonOptionsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_TileProjectionCreator> castcom_amap_api_maps_model_TileProjectionCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_TileProjectionCreator', {'refId': refId});
    return com_amap_api_maps_model_TileProjectionCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_GroundOverlayOptionsCreator> castcom_amap_api_maps_model_GroundOverlayOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_GroundOverlayOptionsCreator', {'refId': refId});
    return com_amap_api_maps_model_GroundOverlayOptionsCreator.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_IndoorBuildingInfo> castcom_amap_api_maps_model_IndoorBuildingInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_IndoorBuildingInfo', {'refId': refId});
    return com_amap_api_maps_model_IndoorBuildingInfo.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_Polyline> castcom_amap_api_maps_model_Polyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_Polyline', {'refId': refId});
    return com_amap_api_maps_model_Polyline.withRefId(result);
  }
  
  Future<com_amap_api_maps_model_BuildingOverlay> castcom_amap_api_maps_model_BuildingOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_model_BuildingOverlay', {'refId': refId});
    return com_amap_api_maps_model_BuildingOverlay.withRefId(result);
  }
  
  Future<com_amap_api_maps_TextureMapView> castcom_amap_api_maps_TextureMapView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_TextureMapView', {'refId': refId});
    return com_amap_api_maps_TextureMapView.withRefId(result);
  }
  
  Future<com_amap_api_maps_AMapUtils> castcom_amap_api_maps_AMapUtils() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_AMapUtils', {'refId': refId});
    return com_amap_api_maps_AMapUtils.withRefId(result);
  }
  
  Future<com_amap_api_maps_TextureMapFragment> castcom_amap_api_maps_TextureMapFragment() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_TextureMapFragment', {'refId': refId});
    return com_amap_api_maps_TextureMapFragment.withRefId(result);
  }
  
  Future<com_amap_api_maps_InfoWindowAnimationManager> castcom_amap_api_maps_InfoWindowAnimationManager() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_InfoWindowAnimationManager', {'refId': refId});
    return com_amap_api_maps_InfoWindowAnimationManager.withRefId(result);
  }
  
  Future<com_amap_api_maps_WearMapView> castcom_amap_api_maps_WearMapView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_WearMapView', {'refId': refId});
    return com_amap_api_maps_WearMapView.withRefId(result);
  }
  
  Future<com_amap_api_maps_AMap> castcom_amap_api_maps_AMap() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_AMap', {'refId': refId});
    return com_amap_api_maps_AMap.withRefId(result);
  }
  
  Future<com_amap_api_maps_MapView> castcom_amap_api_maps_MapView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_maps_MapView', {'refId': refId});
    return com_amap_api_maps_MapView.withRefId(result);
  }
  
  Future<com_amap_api_trace_TraceLocation> castcom_amap_api_trace_TraceLocation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_trace_TraceLocation', {'refId': refId});
    return com_amap_api_trace_TraceLocation.withRefId(result);
  }
  
  Future<com_amap_api_trace_LBSTraceClient> castcom_amap_api_trace_LBSTraceClient() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_trace_LBSTraceClient', {'refId': refId});
    return com_amap_api_trace_LBSTraceClient.withRefId(result);
  }
  
  Future<com_amap_api_trace_TraceOverlay> castcom_amap_api_trace_TraceOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_trace_TraceOverlay', {'refId': refId});
    return com_amap_api_trace_TraceOverlay.withRefId(result);
  }
  
  Future<com_amap_api_mapcore_util_> castcom_amap_api_mapcore_util_() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castcom_amap_api_mapcore_util_', {'refId': refId});
    return com_amap_api_mapcore_util_.withRefId(result);
  }
  

  Future<bool> isKindOfcom_autonavi_ae_gmap_maploader_Pools() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_maploader_Pools', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_maploader_ProcessingTile() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_maploader_ProcessingTile', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_GLMapEngine() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_GLMapEngine', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_AbstractMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_AbstractMapMessage', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glinterface_MapLabelItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glinterface_MapLabelItem', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AdglMapAnimationMgr', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AdglAnimation2V() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AdglAnimation2V', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AdglAnimationContantValues() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AdglAnimationContantValues', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AdglMapAnimFling() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AdglMapAnimFling', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AdglAnimation1V() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AdglAnimation1V', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AdglMapAnimPivotZoom() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AdglMapAnimPivotZoom', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam1V', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AdglMapAnimGroup() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AdglMapAnimGroup', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam2V() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_glanimation_AbstractAdglAnimationParam2V', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_style_StyleItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_style_StyleItem', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_style_StyleElement() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_style_StyleElement', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_GLMapRender() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_GLMapRender', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_GLMapEngine_MapViewInitParam() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_GLMapEngine_MapViewInitParam', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_gesture_EAMapPlatformGestureInfo', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_GLMapState() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_GLMapState', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_gloverlay_BaseRouteOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_gloverlay_BaseRouteOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_gloverlay_GLTextureProperty() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_gloverlay_GLTextureProperty', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_gloverlay_GLCrossVector() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_gloverlay_GLCrossVector', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_gloverlay_GLOverlayBundle_GLAmapFocusHits', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_gloverlay_GLCrossVector_AVectorCrossAttr', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_gloverlay_CrossVectorOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_gloverlay_CrossVectorOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_gloverlay_GLOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_gloverlay_GLOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_gloverlay_GLRouteProperty() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_gloverlay_GLRouteProperty', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_gloverlay_GLOverlayTexture() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_gloverlay_GLOverlayTexture', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_ae_gmap_GLMapEngine_InitParam() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_ae_gmap_GLMapEngine_InitParam', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_maploader_AMapLoader_ADataRequestParam', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_maploader_NetworkState() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_maploader_NetworkState', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_maploader_AMapLoader_AMapGridDownloadRequest() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_maploader_AMapLoader_AMapGridDownloadRequest', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_maploader_AMapLoader() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_maploader_AMapLoader', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_MapProjection() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_MapProjection', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_tools_TextTextureGenerator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_tools_TextTextureGenerator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_tools_GLFileUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_tools_GLFileUtil', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_tools_GlMapUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_tools_GlMapUtil', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_tools_GLMapStaticValue() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_tools_GLMapStaticValue', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_tools_GLConvertUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_tools_GLConvertUtil', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_MsgProcessor() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_MsgProcessor', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_AeUtil_UnZipFileBrake() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_AeUtil_UnZipFileBrake', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_AbstractNativeInstance() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_AbstractNativeInstance', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_LinkInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_LinkInfo', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_AMapNativePolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_AMapNativePolyline', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_IPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_IPoint', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_gles_AMapNativeGLShaderManager() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_gles_AMapNativeGLShaderManager', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_DPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_DPoint', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_AMapNativeRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_AMapNativeRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_FileUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_FileUtil', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_animation_GLTranslateAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_animation_GLTranslateAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_animation_GLRotateAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_animation_GLRotateAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_animation_GLAlphaAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_animation_GLAlphaAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_animation_GLScaleAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_animation_GLScaleAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_animation_GLTransformation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_animation_GLTransformation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_animation_GLAnimationSet() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_animation_GLAnimationSet', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_animation_GLEmergeAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_animation_GLEmergeAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_animation_GLAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_animation_GLAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_MapConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_MapConfig', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_message_HoverGestureMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_message_HoverGestureMapMessage', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_message_MoveGestureMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_message_MoveGestureMapMessage', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_message_ScaleGestureMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_message_ScaleGestureMapMessage', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_message_AbstractGestureMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_message_AbstractGestureMapMessage', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_message_RotateGestureMapMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_message_RotateGestureMapMessage', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_FPointBounds() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_FPointBounds', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_CoordUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_CoordUtil', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_AeUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_AeUtil', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_VirtualEarthProjection() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_VirtualEarthProjection', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_Rectangle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_Rectangle', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_Inner_3dMap_location() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_Inner_3dMap_location', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_AMapEngineUtils() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_AMapEngineUtils', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_FPoint3() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_FPoint3', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_AMapEtaDecoder() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_AMapEtaDecoder', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_FPointBounds_Builder() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_FPointBounds_Builder', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_Inner_3dMap_locationOption() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_Inner_3dMap_locationOption', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_FPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_FPoint', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_AMapNativeParticleSystem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_AMapNativeParticleSystem', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_AbstractCameraUpdateMessage() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_AbstractCameraUpdateMessage', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_AMapNativeBuildingRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_AMapNativeBuildingRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_amap_mapcore_Convert() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_autonavi_amap_mapcore_Convert', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_offlineservice_AMapPermissionActivity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_offlineservice_AMapPermissionActivity', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_UiSettings() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_UiSettings', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_SwipeDismissTouchListener() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_SwipeDismissTouchListener', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_InfoWindowParams() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_InfoWindowParams', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_CameraUpdateFactory() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_CameraUpdateFactory', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_AMapException() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_AMapException', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_AMapOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_AMapOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_AMapOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_AMapOptionsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_CoordinateConverter() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_CoordinateConverter', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_utils_SpatialRelationUtil() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_utils_SpatialRelationUtil', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_utils_overlay_MovingPointOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_utils_overlay_MovingPointOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_utils_overlay_SmoothMoveMarker() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_utils_overlay_SmoothMoveMarker', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_CameraUpdate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_CameraUpdate', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_MapFragment() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_MapFragment', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_SwipeDismissCallBack() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_SwipeDismissCallBack', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_SwipeDismissView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_SwipeDismissView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_MapsInitializer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_MapsInitializer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_OfflineMapStatus() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_OfflineMapStatus', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_OfflineMapProvince() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_OfflineMapProvince', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_DownloadProgressView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_DownloadProgressView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_Province() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_Province', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_OfflineMapManager() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_OfflineMapManager', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_OfflineMapCity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_OfflineMapCity', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_OfflineMapActivity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_OfflineMapActivity', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_City() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_City', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_DownLoadListView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_DownLoadListView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_DownLoadExpandListView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_DownLoadExpandListView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_offlinemap_CityExpandView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_offlinemap_CityExpandView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_Projection() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_Projection', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_Polygon() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_Polygon', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_BitmapDescriptor() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_BitmapDescriptor', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_PolygonHoleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_PolygonHoleOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_TileOverlayOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_TileOverlayOptionsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_Poi() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_Poi', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_MyLocationStyle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_MyLocationStyle', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_RouteOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_RouteOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_VisibleRegion() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_VisibleRegion', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_LatLngCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_LatLngCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_CircleHoleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_CircleHoleOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_Text() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_Text', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_LatLngBounds_Builder() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_LatLngBounds_Builder', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_NavigateArrowOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_NavigateArrowOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_BitmapDescriptorFactory() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_BitmapDescriptorFactory', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_UrlTileProvider() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_UrlTileProvider', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_MultiPointOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_MultiPointOverlayOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_PoiCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_PoiCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_PolylineOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_PolylineOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_Tile() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_Tile', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_GL3DModel() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_GL3DModel', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_Gradient() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_Gradient', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_NaviPara() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_NaviPara', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_GroundOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_GroundOverlayOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_GL3DModelOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_GL3DModelOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_GroundOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_GroundOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_MyTrafficStyle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_MyTrafficStyle', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_CameraPosition() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_CameraPosition', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_TextOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_TextOptionsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_PoiPara() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_PoiPara', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_MarkerOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_MarkerOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_HeatmapTileProvider() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_HeatmapTileProvider', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_NavigateArrow() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_NavigateArrow', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_animation_AnimationSet() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_animation_AnimationSet', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_animation_RotateAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_animation_RotateAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_animation_TranslateAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_animation_TranslateAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_animation_Animation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_animation_Animation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_animation_EmergeAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_animation_EmergeAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_animation_AlphaAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_animation_AlphaAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_animation_ScaleAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_animation_ScaleAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_LatLngBounds() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_LatLngBounds', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_CustomMapStyleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_CustomMapStyleOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_BuildingOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_BuildingOverlayOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_CrossOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_CrossOverlayOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_VisibleRegionCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_VisibleRegionCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_LatLng() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_LatLng', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_TileProjection() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_TileProjection', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_AMapPara() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_AMapPara', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_CameraPosition_Builder() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_CameraPosition_Builder', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_BasePointOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_BasePointOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_CircleOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_CircleOptionsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_Arc() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_Arc', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_AMapCameraInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_AMapCameraInfo', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_Circle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_Circle', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_PolygonOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_PolygonOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_WeightedLatLng() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_WeightedLatLng', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_MyLocationStyleCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_MyLocationStyleCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_MarkerOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_MarkerOptionsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_MultiPointItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_MultiPointItem', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_LatLngBoundsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_LatLngBoundsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_ArcOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_ArcOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_BitmapDescriptorCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_BitmapDescriptorCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_CircleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_CircleOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_NavigateArrowOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_NavigateArrowOptionsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_RuntimeRemoteException() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_RuntimeRemoteException', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_AMapGLOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_AMapGLOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_HeatmapTileProvider_Builder() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_HeatmapTileProvider_Builder', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_MultiPointOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_MultiPointOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_BaseOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_BaseOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_PolylineOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_PolylineOptionsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_BaseOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_BaseOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_Marker() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_Marker', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_TileOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_TileOverlayOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_RoutePara() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_RoutePara', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_ArcOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_ArcOptionsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_CameraPositionCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_CameraPositionCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_CrossOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_CrossOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_ParticleOverLifeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_ParticleOverLifeModule', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_ConstantRotationOverLife() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_ConstantRotationOverLife', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_SinglePointParticleShape() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_SinglePointParticleShape', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_RandomVelocityBetweenTwoConstants() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_RandomVelocityBetweenTwoConstants', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_CurveSizeOverLife() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_CurveSizeOverLife', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_ParticleEmissionModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_ParticleEmissionModule', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_SizeOverLife() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_SizeOverLife', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_RectParticleShape() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_RectParticleShape', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_ColorGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_ColorGenerate', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_VelocityGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_VelocityGenerate', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_RotationOverLife() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_RotationOverLife', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_RandomColorBetWeenTwoConstants() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_RandomColorBetWeenTwoConstants', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_ParticleShapeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_ParticleShapeModule', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_ParticleOverlayOptionsFactory() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_ParticleOverlayOptionsFactory', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_ParticleOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_ParticleOverlayOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_particle_ParticleOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_particle_ParticleOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_BaseHoleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_BaseHoleOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_TextOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_TextOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_TileOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_TileOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_PolygonOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_PolygonOptionsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_TileProjectionCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_TileProjectionCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_GroundOverlayOptionsCreator() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_GroundOverlayOptionsCreator', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_IndoorBuildingInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_IndoorBuildingInfo', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_Polyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_Polyline', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_model_BuildingOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_model_BuildingOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_TextureMapView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_TextureMapView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_AMapUtils() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_AMapUtils', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_TextureMapFragment() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_TextureMapFragment', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_InfoWindowAnimationManager() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_InfoWindowAnimationManager', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_WearMapView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_WearMapView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_AMap() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_AMap', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_maps_MapView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_maps_MapView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_trace_TraceLocation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_trace_TraceLocation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_trace_LBSTraceClient() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_trace_LBSTraceClient', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_trace_TraceOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_trace_TraceOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_mapcore_util_() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfcom_amap_api_mapcore_util_', {'refId': refId});
    return result;
  }
  
}