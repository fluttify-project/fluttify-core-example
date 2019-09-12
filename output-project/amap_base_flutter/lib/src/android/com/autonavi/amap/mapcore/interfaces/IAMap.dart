import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class com_autonavi_amap_mapcore_interfaces_IAMap extends Ref_Android {
  com_autonavi_amap_mapcore_interfaces_IAMap.withRefId(int refId): super.withRefId(refId);

  com_amap_api_maps_model_CameraPosition getCameraPosition();
  
  double getMaxZoomLevel();
  
  double getMinZoomLevel();
  
  String moveCamera(com_amap_api_maps_CameraUpdate var1);
  
  String animateCamera(com_amap_api_maps_CameraUpdate var1);
  
  String animateCameraWithCallback(com_amap_api_maps_CameraUpdate var1, com_amap_api_maps_AMap_CancelableCallback var2);
  
  String animateCameraWithDurationAndCallback(com_amap_api_maps_CameraUpdate var1, int var2, com_amap_api_maps_AMap_CancelableCallback var4);
  
  String stopAnimation();
  
  com_amap_api_maps_model_NavigateArrow addNavigateArrow(com_amap_api_maps_model_NavigateArrowOptions var1);
  
  com_amap_api_maps_model_Polyline addPolyline(com_amap_api_maps_model_PolylineOptions var1);
  
  com_amap_api_maps_model_Circle addCircle(com_amap_api_maps_model_CircleOptions var1);
  
  com_amap_api_maps_model_Arc addArc(com_amap_api_maps_model_ArcOptions var1);
  
  com_amap_api_maps_model_Polygon addPolygon(com_amap_api_maps_model_PolygonOptions var1);
  
  com_amap_api_maps_model_GroundOverlay addGroundOverlay(com_amap_api_maps_model_GroundOverlayOptions var1);
  
  com_amap_api_maps_model_MultiPointOverlay addMultiPointOverlay(com_amap_api_maps_model_MultiPointOverlayOptions var1);
  
  com_amap_api_maps_model_Marker addMarker(com_amap_api_maps_model_MarkerOptions var1);
  
  List<com_amap_api_maps_model_Marker> addMarkers(com_amap_api_maps_model_MarkerOptions var1, bool var2);
  
  com_amap_api_maps_model_Text addText(com_amap_api_maps_model_TextOptions var1);
  
  com_amap_api_maps_model_TileOverlay addTileOverlay(com_amap_api_maps_model_TileOverlayOptions var1);
  
  String clear();
  
  String clear(bool var1);
  
  int getMapType();
  
  String setMapType(int var1);
  
  bool isTrafficEnabled();
  
  String setTrafficEnabled(bool var1);
  
  bool isIndoorEnabled();
  
  String setIndoorEnabled(bool var1);
  
  String set3DBuildingEnabled(bool var1);
  
  bool isMyLocationEnabled();
  
  String setMyLocationEnabled(bool var1);
  
  String setLoadOfflineData(bool var1);
  
  String setMyLocationStyle(com_amap_api_maps_model_MyLocationStyle var1);
  
  String setMyLocationType(int var1);
  
  List<com_amap_api_maps_model_Marker> getMapScreenMarkers();
  
  String setMapTextEnable(bool var1);
  
  String setRoadArrowEnable(bool var1);
  
  String setMyTrafficStyle(com_amap_api_maps_model_MyTrafficStyle var1);
  
  android_location_Location getMyLocation();
  
  String setLocationSource(com_amap_api_maps_LocationSource var1);
  
  String setMyLocationRotateAngle(double var1);
  
  com_amap_api_maps_UiSettings getAMapUiSettings();
  
  com_amap_api_maps_Projection getAMapProjection();
  
  String setOnCameraChangeListener(com_amap_api_maps_AMap_OnCameraChangeListener var1);
  
  String setOnMapClickListener(com_amap_api_maps_AMap_OnMapClickListener var1);
  
  String setOnMapTouchListener(com_amap_api_maps_AMap_OnMapTouchListener var1);
  
  String setOnMapLongClickListener(com_amap_api_maps_AMap_OnMapLongClickListener var1);
  
  String setOnMarkerClickListener(com_amap_api_maps_AMap_OnMarkerClickListener var1);
  
  String setOnPolylineClickListener(com_amap_api_maps_AMap_OnPolylineClickListener var1);
  
  String setOnMarkerDragListener(com_amap_api_maps_AMap_OnMarkerDragListener var1);
  
  String setOnMaploadedListener(com_amap_api_maps_AMap_OnMapLoadedListener var1);
  
  String setOnInfoWindowClickListener(com_amap_api_maps_AMap_OnInfoWindowClickListener var1);
  
  String setOnMyLocationChangeListener(com_amap_api_maps_AMap_OnMyLocationChangeListener var1);
  
  String setOnPOIClickListener(com_amap_api_maps_AMap_OnPOIClickListener var1);
  
  String setInfoWindowAdapter(com_amap_api_maps_AMap_InfoWindowAdapter var1);
  
  String setInfoWindowAdapter(com_amap_api_maps_AMap_CommonInfoWindowAdapter var1);
  
  String setOnIndoorBuildingActiveListener(com_amap_api_maps_AMap_OnIndoorBuildingActiveListener var1);
  
  String getMapPrintScreen(com_amap_api_maps_AMap_onMapPrintScreenListener var1);
  
  String getMapScreenShot(com_amap_api_maps_AMap_OnMapScreenShotListener var1);
  
  double getScalePerPixel();
  
  String setRunLowFrame(bool var1);
  
  String removecache();
  
  String removecache(com_amap_api_maps_AMap_OnCacheRemoveListener var1);
  
  String setCustomRenderer(com_amap_api_maps_CustomRenderer var1);
  
  String setCenterToPixel(int var1, int var2);
  
  String setMapTextZIndex(int var1);
  
  int getMapTextZIndex();
  
  String reloadMap();
  
  String setRenderFps(int var1);
  
  String setIndoorBuildingInfo(com_amap_api_maps_model_IndoorBuildingInfo var1);
  
  String setAMapGestureListener(com_amap_api_maps_model_AMapGestureListener var1);
  
  double getZoomToSpanLevel(com_amap_api_maps_model_LatLng var1, com_amap_api_maps_model_LatLng var2);
  
  com_autonavi_amap_mapcore_interfaces_Float,LatLng calculateZoomToSpanLevel(int var1, int var2, int var3, int var4, com_amap_api_maps_model_LatLng var5, com_amap_api_maps_model_LatLng var6);
  
  com_amap_api_maps_InfoWindowAnimationManager getInfoWindowAnimationManager();
  
  String setMaskLayerParams(int var1, int var2, int var3, int var4, int var5, int var6);
  
  String setMaxZoomLevel(double var1);
  
  String setMinZoomLevel(double var1);
  
  String resetMinMaxZoomPreference();
  
  String setMapStatusLimits(com_amap_api_maps_model_LatLngBounds var1);
  
  String setCustomMapStylePath(String var1);
  
  String setMapCustomEnable(bool var1);
  
  android_os_Handler getMainHandler();
  
  String onChangeFinish();
  
  String setZoomScaleParam(double var1);
  
  String onFling();
  
  int getMapWidth();
  
  int getMapHeight();
  
  double getCameraAngle();
  
  double getSkyHeight();
  
  bool isMaploaded();
  
  com_autonavi_amap_mapcore_MapConfig getMapConfig();
  
  android_view_View getView();
  
  String setZOrderOnTop(bool var1);
  
  String destroy();
  
  String setVisibilityEx(int var1);
  
  String onActivityPause();
  
  String onActivityResume();
  
  String queueEvent(com_autonavi_amap_mapcore_interfaces_Runnable var1);
  
  int createGLOverlay(int var1);
  
  int getGlOverlayMgrPtr();
  
  com_amap_api_maps_model_CrossOverlay addCrossVector(com_amap_api_maps_model_CrossOverlayOptions var1);
  
  com_amap_api_maps_model_RouteOverlay addNaviRouteOverlay();
  
  String removeEngineGLOverlay(com_autonavi_ae_gmap_gloverlay_BaseMapOverlay var1);
  
  List<float[]> getViewMatrix();
  
  List<float[]> getProjectionMatrix();
  
  String addOverlayTexture(int var1, com_autonavi_ae_gmap_gloverlay_GLTextureProperty var2);
  
  String renderSurface(javax_microedition_khronos_opengles_GL10 var1);
  
  String changeSurface(javax_microedition_khronos_opengles_GL10 var1, int var2, int var3);
  
  String createSurface(javax_microedition_khronos_opengles_GL10 var1, javax_microedition_khronos_egl_EGLConfig var2);
  
  bool onTouchEvent(android_view_MotionEvent var1);
  
  bool canStopMapRender();
  
  String getLatLngRect(com_autonavi_amap_mapcore_interfaces_DPoint[] var1);
  
  String setCustomTextureResourcePath(String var1);
  
  com_amap_api_maps_model_MyLocationStyle getMyLocationStyle();
  
  int getRenderMode();
  
  String destroySurface(int var1);
  
  String drawFrame(javax_microedition_khronos_opengles_GL10 var1);
  
  String requestRender();
  
  String resetRenderTime();
  
  String onIndoorBuildingActivity(int var1, List<int> var2);
  
  com_amap_api_maps_model_AMapCameraInfo getCamerInfo();
  
  String checkMapState(com_autonavi_ae_gmap_GLMapState var1);
  
  String setRenderMode(int var1);
  
  String setOnMultiPointClickListener(com_amap_api_maps_AMap_OnMultiPointClickListener var1);
  
  String getMapContentApprovalNumber();
  
  String getSatelliteImageApprovalNumber();
  
  String setMapLanguage(String var1);
  
  String setCustomMapStyleID(String var1);
  
  com_amap_api_maps_model_BuildingOverlay addBuildingOverlay();
  
  com_amap_api_maps_model_GL3DModel addGLModel(com_amap_api_maps_model_GL3DModelOptions var1);
  
  com_amap_api_maps_model_particle_ParticleOverlay addParticleOverlay(com_amap_api_maps_model_particle_ParticleOverlayOptions var1);
  
  String setCustomMapStyle(com_amap_api_maps_model_CustomMapStyleOptions var1);
  
}