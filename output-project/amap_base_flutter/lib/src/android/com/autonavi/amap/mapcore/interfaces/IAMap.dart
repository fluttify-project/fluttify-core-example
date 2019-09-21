import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin com_autonavi_amap_mapcore_interfaces_IAMap on java_lang_Object {
  Future<com_amap_api_maps_model_CameraPosition> getCameraPosition() {}
  
  Future<double> getMaxZoomLevel() {}
  
  Future<double> getMinZoomLevel() {}
  
  Future<String> moveCamera(com_amap_api_maps_CameraUpdate var1) {}
  
  Future<String> animateCamera(com_amap_api_maps_CameraUpdate var1) {}
  
  Future<String> animateCameraWithCallback(com_amap_api_maps_CameraUpdate var1, com_amap_api_maps_AMap_CancelableCallback var2) {}
  
  Future<String> animateCameraWithDurationAndCallback(com_amap_api_maps_CameraUpdate var1, int var2, com_amap_api_maps_AMap_CancelableCallback var4) {}
  
  Future<String> stopAnimation() {}
  
  Future<com_amap_api_maps_model_NavigateArrow> addNavigateArrow(com_amap_api_maps_model_NavigateArrowOptions var1) {}
  
  Future<com_amap_api_maps_model_Polyline> addPolyline(com_amap_api_maps_model_PolylineOptions var1) {}
  
  Future<com_amap_api_maps_model_Circle> addCircle(com_amap_api_maps_model_CircleOptions var1) {}
  
  Future<com_amap_api_maps_model_Arc> addArc(com_amap_api_maps_model_ArcOptions var1) {}
  
  Future<com_amap_api_maps_model_Polygon> addPolygon(com_amap_api_maps_model_PolygonOptions var1) {}
  
  Future<com_amap_api_maps_model_GroundOverlay> addGroundOverlay(com_amap_api_maps_model_GroundOverlayOptions var1) {}
  
  Future<com_amap_api_maps_model_MultiPointOverlay> addMultiPointOverlay(com_amap_api_maps_model_MultiPointOverlayOptions var1) {}
  
  Future<com_amap_api_maps_model_Marker> addMarker(com_amap_api_maps_model_MarkerOptions var1) {}
  
  Future<com_amap_api_maps_model_Text> addText(com_amap_api_maps_model_TextOptions var1) {}
  
  Future<com_amap_api_maps_model_TileOverlay> addTileOverlay(com_amap_api_maps_model_TileOverlayOptions var1) {}
  
  Future<String> clear() {}
  
  Future<int> getMapType() {}
  
  Future<String> setMapType(int var1) {}
  
  Future<bool> isTrafficEnabled() {}
  
  Future<String> setTrafficEnabled(bool var1) {}
  
  Future<bool> isIndoorEnabled() {}
  
  Future<String> setIndoorEnabled(bool var1) {}
  
  Future<String> set3DBuildingEnabled(bool var1) {}
  
  Future<bool> isMyLocationEnabled() {}
  
  Future<String> setMyLocationEnabled(bool var1) {}
  
  Future<String> setLoadOfflineData(bool var1) {}
  
  Future<String> setMyLocationStyle(com_amap_api_maps_model_MyLocationStyle var1) {}
  
  Future<String> setMyLocationType(int var1) {}
  
  Future<String> setMapTextEnable(bool var1) {}
  
  Future<String> setRoadArrowEnable(bool var1) {}
  
  Future<String> setMyTrafficStyle(com_amap_api_maps_model_MyTrafficStyle var1) {}
  
  Future<android_location_Location> getMyLocation() {}
  
  Future<String> setLocationSource(com_amap_api_maps_LocationSource var1) {}
  
  Future<String> setMyLocationRotateAngle(double var1) {}
  
  Future<com_amap_api_maps_UiSettings> getAMapUiSettings() {}
  
  Future<com_amap_api_maps_Projection> getAMapProjection() {}
  
  Future<String> setOnCameraChangeListener(com_amap_api_maps_AMap_OnCameraChangeListener var1) {}
  
  Future<String> setOnMapClickListener(com_amap_api_maps_AMap_OnMapClickListener var1) {}
  
  Future<String> setOnMapTouchListener(com_amap_api_maps_AMap_OnMapTouchListener var1) {}
  
  Future<String> setOnMapLongClickListener(com_amap_api_maps_AMap_OnMapLongClickListener var1) {}
  
  Future<String> setOnMarkerClickListener(com_amap_api_maps_AMap_OnMarkerClickListener var1) {}
  
  Future<String> setOnPolylineClickListener(com_amap_api_maps_AMap_OnPolylineClickListener var1) {}
  
  Future<String> setOnMarkerDragListener(com_amap_api_maps_AMap_OnMarkerDragListener var1) {}
  
  Future<String> setOnMaploadedListener(com_amap_api_maps_AMap_OnMapLoadedListener var1) {}
  
  Future<String> setOnInfoWindowClickListener(com_amap_api_maps_AMap_OnInfoWindowClickListener var1) {}
  
  Future<String> setOnMyLocationChangeListener(com_amap_api_maps_AMap_OnMyLocationChangeListener var1) {}
  
  Future<String> setOnPOIClickListener(com_amap_api_maps_AMap_OnPOIClickListener var1) {}
  
  Future<String> setInfoWindowAdapter(com_amap_api_maps_AMap_InfoWindowAdapter var1) {}
  
  Future<String> setOnIndoorBuildingActiveListener(com_amap_api_maps_AMap_OnIndoorBuildingActiveListener var1) {}
  
  Future<String> getMapPrintScreen(com_amap_api_maps_AMap_onMapPrintScreenListener var1) {}
  
  Future<String> getMapScreenShot(com_amap_api_maps_AMap_OnMapScreenShotListener var1) {}
  
  Future<double> getScalePerPixel() {}
  
  Future<String> setRunLowFrame(bool var1) {}
  
  Future<String> removecache() {}
  
  Future<String> setCustomRenderer(com_amap_api_maps_CustomRenderer var1) {}
  
  Future<String> setCenterToPixel(int var1, int var2) {}
  
  Future<String> setMapTextZIndex(int var1) {}
  
  Future<int> getMapTextZIndex() {}
  
  Future<String> reloadMap() {}
  
  Future<String> setRenderFps(int var1) {}
  
  Future<String> setIndoorBuildingInfo(com_amap_api_maps_model_IndoorBuildingInfo var1) {}
  
  Future<String> setAMapGestureListener(com_amap_api_maps_model_AMapGestureListener var1) {}
  
  Future<double> getZoomToSpanLevel(com_amap_api_maps_model_LatLng var1, com_amap_api_maps_model_LatLng var2) {}
  
  Future<com_amap_api_maps_InfoWindowAnimationManager> getInfoWindowAnimationManager() {}
  
  Future<String> setMaskLayerParams(int var1, int var2, int var3, int var4, int var5, int var6) {}
  
  Future<String> setMaxZoomLevel(double var1) {}
  
  Future<String> setMinZoomLevel(double var1) {}
  
  Future<String> resetMinMaxZoomPreference() {}
  
  Future<String> setMapStatusLimits(com_amap_api_maps_model_LatLngBounds var1) {}
  
  Future<String> setCustomMapStylePath(String var1) {}
  
  Future<String> setMapCustomEnable(bool var1) {}
  
  Future<String> onChangeFinish() {}
  
  Future<String> setZoomScaleParam(double var1) {}
  
  Future<String> onFling() {}
  
  Future<int> getMapWidth() {}
  
  Future<int> getMapHeight() {}
  
  Future<double> getCameraAngle() {}
  
  Future<double> getSkyHeight() {}
  
  Future<bool> isMaploaded() {}
  
  Future<com_autonavi_amap_mapcore_MapConfig> getMapConfig() {}
  
  Future<android_view_View> getView() {}
  
  Future<String> setZOrderOnTop(bool var1) {}
  
  Future<String> destroy() {}
  
  Future<String> setVisibilityEx(int var1) {}
  
  Future<String> onActivityPause() {}
  
  Future<String> onActivityResume() {}
  
  Future<int> createGLOverlay(int var1) {}
  
  Future<int> getGlOverlayMgrPtr() {}
  
  Future<com_amap_api_maps_model_CrossOverlay> addCrossVector(com_amap_api_maps_model_CrossOverlayOptions var1) {}
  
  Future<com_amap_api_maps_model_RouteOverlay> addNaviRouteOverlay() {}
  
  Future<String> addOverlayTexture(int var1, com_autonavi_ae_gmap_gloverlay_GLTextureProperty var2) {}
  
  Future<bool> onTouchEvent(android_view_MotionEvent var1) {}
  
  Future<bool> canStopMapRender() {}
  
  Future<String> setCustomTextureResourcePath(String var1) {}
  
  Future<com_amap_api_maps_model_MyLocationStyle> getMyLocationStyle() {}
  
  Future<int> getRenderMode() {}
  
  Future<String> destroySurface(int var1) {}
  
  Future<String> requestRender() {}
  
  Future<String> resetRenderTime() {}
  
  Future<com_amap_api_maps_model_AMapCameraInfo> getCamerInfo() {}
  
  Future<String> checkMapState(com_autonavi_ae_gmap_GLMapState var1) {}
  
  Future<String> setRenderMode(int var1) {}
  
  Future<String> setOnMultiPointClickListener(com_amap_api_maps_AMap_OnMultiPointClickListener var1) {}
  
  Future<String> getMapContentApprovalNumber() {}
  
  Future<String> getSatelliteImageApprovalNumber() {}
  
  Future<String> setMapLanguage(String var1) {}
  
  Future<String> setCustomMapStyleID(String var1) {}
  
  Future<com_amap_api_maps_model_BuildingOverlay> addBuildingOverlay() {}
  
  Future<com_amap_api_maps_model_GL3DModel> addGLModel(com_amap_api_maps_model_GL3DModelOptions var1) {}
  
  Future<com_amap_api_maps_model_particle_ParticleOverlay> addParticleOverlay(com_amap_api_maps_model_particle_ParticleOverlayOptions var1) {}
  
  Future<String> setCustomMapStyle(com_amap_api_maps_model_CustomMapStyleOptions var1) {}
  
}