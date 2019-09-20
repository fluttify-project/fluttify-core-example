import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_autonavi_ae_gmap_GLMapRender extends Ref_Android  {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<int> get_NORMAL_TICK_COUNT() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_NORMAL_TICK_COUNT", {'refId': refId});
    return result;
  }
  
  Future<int> get_ANIMATION_TICK_COUNT() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_ANIMATION_TICK_COUNT", {'refId': refId});
    return result;
  }
  
  Future<int> get_LONG_TICK_COUNT() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_LONG_TICK_COUNT", {'refId': refId});
    return result;
  }
  
  Future<int> get_LONG_LONG_TICK_COUNT() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_LONG_LONG_TICK_COUNT", {'refId': refId});
    return result;
  }
  
  Future<int> get_RENDER_FPS_NAVI() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_RENDER_FPS_NAVI", {'refId': refId});
    return result;
  }
  
  Future<int> get_RENDER_FPS_NORMAL() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_RENDER_FPS_NORMAL", {'refId': refId});
    return result;
  }
  
  Future<int> get_RENDER_FPS_ANIMATION() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_RENDER_FPS_ANIMATION", {'refId': refId});
    return result;
  }
  
  Future<int> get_RENDER_FPS_GESTURE_ACTION() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_RENDER_FPS_GESTURE_ACTION", {'refId': refId});
    return result;
  }
  
  Future<com_autonavi_amap_mapcore_interfaces_IAMap> get_mGLMapView() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_mGLMapView", {'refId': refId});
    return result;
  }
  
  Future<bool> get_mSurfacedestoryed() async {
    final result = await _channel.invokeMethod("com.autonavi.ae.gmap.GLMapRender::get_mSurfacedestoryed", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_mGLMapView(com_autonavi_amap_mapcore_interfaces_IAMap mGLMapView) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::set_mGLMapView', {'refId': refId, "mGLMapView": ""});
  
    MethodChannel('com.autonavi.amap.mapcore.interfaces.IAMap::Callback')
      .setMethodCallHandler((methodCall) async {
        final args = methodCall.arguments as Map;
        // final refId = args['callerRefId'] as int;
        // if (refId != this.refId) return;
  
        switch (methodCall.method) {
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getCameraPosition':
            // 日志打印
            print('fluttify-dart-callback: getCameraPosition([])');
        
              // 调用回调方法
            mGLMapView?.getCameraPosition();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMaxZoomLevel':
            // 日志打印
            print('fluttify-dart-callback: getMaxZoomLevel([])');
        
              // 调用回调方法
            mGLMapView?.getMaxZoomLevel();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMinZoomLevel':
            // 日志打印
            print('fluttify-dart-callback: getMinZoomLevel([])');
        
              // 调用回调方法
            mGLMapView?.getMinZoomLevel();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::moveCamera':
            // 日志打印
            print('fluttify-dart-callback: moveCamera([])');
        
              // 调用回调方法
            mGLMapView?.moveCamera(com_amap_api_maps_CameraUpdate()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::animateCamera':
            // 日志打印
            print('fluttify-dart-callback: animateCamera([])');
        
              // 调用回调方法
            mGLMapView?.animateCamera(com_amap_api_maps_CameraUpdate()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::animateCameraWithCallback':
            // 日志打印
            print('fluttify-dart-callback: animateCameraWithCallback([])');
        
              // 调用回调方法
            mGLMapView?.animateCameraWithCallback(com_amap_api_maps_CameraUpdate()..refId = (args['var1']), com_amap_api_maps_AMap_CancelableCallback_Ref()..refId = (args['var2']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::animateCameraWithDurationAndCallback':
            // 日志打印
            print('fluttify-dart-callback: animateCameraWithDurationAndCallback([\'var2\':$args[var2]])');
        
              // 调用回调方法
            mGLMapView?.animateCameraWithDurationAndCallback(com_amap_api_maps_CameraUpdate()..refId = (args['var1']), args['var2'], com_amap_api_maps_AMap_CancelableCallback_Ref()..refId = (args['var4']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::stopAnimation':
            // 日志打印
            print('fluttify-dart-callback: stopAnimation([])');
        
              // 调用回调方法
            mGLMapView?.stopAnimation();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addNavigateArrow':
            // 日志打印
            print('fluttify-dart-callback: addNavigateArrow([])');
        
              // 调用回调方法
            mGLMapView?.addNavigateArrow(com_amap_api_maps_model_NavigateArrowOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addPolyline':
            // 日志打印
            print('fluttify-dart-callback: addPolyline([])');
        
              // 调用回调方法
            mGLMapView?.addPolyline(com_amap_api_maps_model_PolylineOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addCircle':
            // 日志打印
            print('fluttify-dart-callback: addCircle([])');
        
              // 调用回调方法
            mGLMapView?.addCircle(com_amap_api_maps_model_CircleOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addArc':
            // 日志打印
            print('fluttify-dart-callback: addArc([])');
        
              // 调用回调方法
            mGLMapView?.addArc(com_amap_api_maps_model_ArcOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addPolygon':
            // 日志打印
            print('fluttify-dart-callback: addPolygon([])');
        
              // 调用回调方法
            mGLMapView?.addPolygon(com_amap_api_maps_model_PolygonOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addGroundOverlay':
            // 日志打印
            print('fluttify-dart-callback: addGroundOverlay([])');
        
              // 调用回调方法
            mGLMapView?.addGroundOverlay(com_amap_api_maps_model_GroundOverlayOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addMultiPointOverlay':
            // 日志打印
            print('fluttify-dart-callback: addMultiPointOverlay([])');
        
              // 调用回调方法
            mGLMapView?.addMultiPointOverlay(com_amap_api_maps_model_MultiPointOverlayOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addMarker':
            // 日志打印
            print('fluttify-dart-callback: addMarker([])');
        
              // 调用回调方法
            mGLMapView?.addMarker(com_amap_api_maps_model_MarkerOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addMarkers':
            // 日志打印
            print('fluttify-dart-callback: addMarkers([\'var2\':$args[var2]])');
        
              // 调用回调方法
            mGLMapView?.addMarkers(com_amap_api_maps_model_MarkerOptions()..refId = (args['var1']), args['var2']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addText':
            // 日志打印
            print('fluttify-dart-callback: addText([])');
        
              // 调用回调方法
            mGLMapView?.addText(com_amap_api_maps_model_TextOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addTileOverlay':
            // 日志打印
            print('fluttify-dart-callback: addTileOverlay([])');
        
              // 调用回调方法
            mGLMapView?.addTileOverlay(com_amap_api_maps_model_TileOverlayOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::clear':
            // 日志打印
            print('fluttify-dart-callback: clear([])');
        
              // 调用回调方法
            mGLMapView?.clear();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::clear':
            // 日志打印
            print('fluttify-dart-callback: clear([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.clear(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMapType':
            // 日志打印
            print('fluttify-dart-callback: getMapType([])');
        
              // 调用回调方法
            mGLMapView?.getMapType();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMapType':
            // 日志打印
            print('fluttify-dart-callback: setMapType([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setMapType(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::isTrafficEnabled':
            // 日志打印
            print('fluttify-dart-callback: isTrafficEnabled([])');
        
              // 调用回调方法
            mGLMapView?.isTrafficEnabled();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setTrafficEnabled':
            // 日志打印
            print('fluttify-dart-callback: setTrafficEnabled([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setTrafficEnabled(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::isIndoorEnabled':
            // 日志打印
            print('fluttify-dart-callback: isIndoorEnabled([])');
        
              // 调用回调方法
            mGLMapView?.isIndoorEnabled();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setIndoorEnabled':
            // 日志打印
            print('fluttify-dart-callback: setIndoorEnabled([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setIndoorEnabled(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::set3DBuildingEnabled':
            // 日志打印
            print('fluttify-dart-callback: set3DBuildingEnabled([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.set3DBuildingEnabled(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::isMyLocationEnabled':
            // 日志打印
            print('fluttify-dart-callback: isMyLocationEnabled([])');
        
              // 调用回调方法
            mGLMapView?.isMyLocationEnabled();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMyLocationEnabled':
            // 日志打印
            print('fluttify-dart-callback: setMyLocationEnabled([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setMyLocationEnabled(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setLoadOfflineData':
            // 日志打印
            print('fluttify-dart-callback: setLoadOfflineData([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setLoadOfflineData(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMyLocationStyle':
            // 日志打印
            print('fluttify-dart-callback: setMyLocationStyle([])');
        
              // 调用回调方法
            mGLMapView?.setMyLocationStyle(com_amap_api_maps_model_MyLocationStyle()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMyLocationType':
            // 日志打印
            print('fluttify-dart-callback: setMyLocationType([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setMyLocationType(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMapScreenMarkers':
            // 日志打印
            print('fluttify-dart-callback: getMapScreenMarkers([])');
        
              // 调用回调方法
            mGLMapView?.getMapScreenMarkers();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMapTextEnable':
            // 日志打印
            print('fluttify-dart-callback: setMapTextEnable([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setMapTextEnable(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setRoadArrowEnable':
            // 日志打印
            print('fluttify-dart-callback: setRoadArrowEnable([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setRoadArrowEnable(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMyTrafficStyle':
            // 日志打印
            print('fluttify-dart-callback: setMyTrafficStyle([])');
        
              // 调用回调方法
            mGLMapView?.setMyTrafficStyle(com_amap_api_maps_model_MyTrafficStyle()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMyLocation':
            // 日志打印
            print('fluttify-dart-callback: getMyLocation([])');
        
              // 调用回调方法
            mGLMapView?.getMyLocation();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setLocationSource':
            // 日志打印
            print('fluttify-dart-callback: setLocationSource([])');
        
              // 调用回调方法
            mGLMapView?.setLocationSource(com_amap_api_maps_LocationSource_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMyLocationRotateAngle':
            // 日志打印
            print('fluttify-dart-callback: setMyLocationRotateAngle([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setMyLocationRotateAngle(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getAMapUiSettings':
            // 日志打印
            print('fluttify-dart-callback: getAMapUiSettings([])');
        
              // 调用回调方法
            mGLMapView?.getAMapUiSettings();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getAMapProjection':
            // 日志打印
            print('fluttify-dart-callback: getAMapProjection([])');
        
              // 调用回调方法
            mGLMapView?.getAMapProjection();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnCameraChangeListener':
            // 日志打印
            print('fluttify-dart-callback: setOnCameraChangeListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnCameraChangeListener(com_amap_api_maps_AMap_OnCameraChangeListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnMapClickListener':
            // 日志打印
            print('fluttify-dart-callback: setOnMapClickListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnMapClickListener(com_amap_api_maps_AMap_OnMapClickListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnMapTouchListener':
            // 日志打印
            print('fluttify-dart-callback: setOnMapTouchListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnMapTouchListener(com_amap_api_maps_AMap_OnMapTouchListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnMapLongClickListener':
            // 日志打印
            print('fluttify-dart-callback: setOnMapLongClickListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnMapLongClickListener(com_amap_api_maps_AMap_OnMapLongClickListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnMarkerClickListener':
            // 日志打印
            print('fluttify-dart-callback: setOnMarkerClickListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnMarkerClickListener(com_amap_api_maps_AMap_OnMarkerClickListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnPolylineClickListener':
            // 日志打印
            print('fluttify-dart-callback: setOnPolylineClickListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnPolylineClickListener(com_amap_api_maps_AMap_OnPolylineClickListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnMarkerDragListener':
            // 日志打印
            print('fluttify-dart-callback: setOnMarkerDragListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnMarkerDragListener(com_amap_api_maps_AMap_OnMarkerDragListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnMaploadedListener':
            // 日志打印
            print('fluttify-dart-callback: setOnMaploadedListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnMaploadedListener(com_amap_api_maps_AMap_OnMapLoadedListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnInfoWindowClickListener':
            // 日志打印
            print('fluttify-dart-callback: setOnInfoWindowClickListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnInfoWindowClickListener(com_amap_api_maps_AMap_OnInfoWindowClickListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnMyLocationChangeListener':
            // 日志打印
            print('fluttify-dart-callback: setOnMyLocationChangeListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnMyLocationChangeListener(com_amap_api_maps_AMap_OnMyLocationChangeListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnPOIClickListener':
            // 日志打印
            print('fluttify-dart-callback: setOnPOIClickListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnPOIClickListener(com_amap_api_maps_AMap_OnPOIClickListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setInfoWindowAdapter':
            // 日志打印
            print('fluttify-dart-callback: setInfoWindowAdapter([])');
        
              // 调用回调方法
            mGLMapView?.setInfoWindowAdapter(com_amap_api_maps_AMap_InfoWindowAdapter_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setInfoWindowAdapter':
            // 日志打印
            print('fluttify-dart-callback: setInfoWindowAdapter([])');
        
              // 调用回调方法
            mGLMapView?.setInfoWindowAdapter(com_amap_api_maps_AMap_CommonInfoWindowAdapter_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnIndoorBuildingActiveListener':
            // 日志打印
            print('fluttify-dart-callback: setOnIndoorBuildingActiveListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnIndoorBuildingActiveListener(com_amap_api_maps_AMap_OnIndoorBuildingActiveListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMapPrintScreen':
            // 日志打印
            print('fluttify-dart-callback: getMapPrintScreen([])');
        
              // 调用回调方法
            mGLMapView?.getMapPrintScreen(com_amap_api_maps_AMap_onMapPrintScreenListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMapScreenShot':
            // 日志打印
            print('fluttify-dart-callback: getMapScreenShot([])');
        
              // 调用回调方法
            mGLMapView?.getMapScreenShot(com_amap_api_maps_AMap_OnMapScreenShotListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getScalePerPixel':
            // 日志打印
            print('fluttify-dart-callback: getScalePerPixel([])');
        
              // 调用回调方法
            mGLMapView?.getScalePerPixel();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setRunLowFrame':
            // 日志打印
            print('fluttify-dart-callback: setRunLowFrame([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setRunLowFrame(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::removecache':
            // 日志打印
            print('fluttify-dart-callback: removecache([])');
        
              // 调用回调方法
            mGLMapView?.removecache();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::removecache':
            // 日志打印
            print('fluttify-dart-callback: removecache([])');
        
              // 调用回调方法
            mGLMapView?.removecache(com_amap_api_maps_AMap_OnCacheRemoveListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setCustomRenderer':
            // 日志打印
            print('fluttify-dart-callback: setCustomRenderer([])');
        
              // 调用回调方法
            mGLMapView?.setCustomRenderer(com_amap_api_maps_CustomRenderer_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setCenterToPixel':
            // 日志打印
            print('fluttify-dart-callback: setCenterToPixel([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
              // 调用回调方法
            mGLMapView?.setCenterToPixel(args['var1'], args['var2']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMapTextZIndex':
            // 日志打印
            print('fluttify-dart-callback: setMapTextZIndex([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setMapTextZIndex(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMapTextZIndex':
            // 日志打印
            print('fluttify-dart-callback: getMapTextZIndex([])');
        
              // 调用回调方法
            mGLMapView?.getMapTextZIndex();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::reloadMap':
            // 日志打印
            print('fluttify-dart-callback: reloadMap([])');
        
              // 调用回调方法
            mGLMapView?.reloadMap();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setRenderFps':
            // 日志打印
            print('fluttify-dart-callback: setRenderFps([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setRenderFps(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setIndoorBuildingInfo':
            // 日志打印
            print('fluttify-dart-callback: setIndoorBuildingInfo([])');
        
              // 调用回调方法
            mGLMapView?.setIndoorBuildingInfo(com_amap_api_maps_model_IndoorBuildingInfo()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setAMapGestureListener':
            // 日志打印
            print('fluttify-dart-callback: setAMapGestureListener([])');
        
              // 调用回调方法
            mGLMapView?.setAMapGestureListener(com_amap_api_maps_model_AMapGestureListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getZoomToSpanLevel':
            // 日志打印
            print('fluttify-dart-callback: getZoomToSpanLevel([])');
        
              // 调用回调方法
            mGLMapView?.getZoomToSpanLevel(com_amap_api_maps_model_LatLng()..refId = (args['var1']), com_amap_api_maps_model_LatLng()..refId = (args['var2']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::calculateZoomToSpanLevel':
            // 日志打印
            print('fluttify-dart-callback: calculateZoomToSpanLevel([\'var1\':$args[var1], \'var2\':$args[var2], \'var3\':$args[var3], \'var4\':$args[var4]])');
        
              // 调用回调方法
            mGLMapView?.calculateZoomToSpanLevel(args['var1'], args['var2'], args['var3'], args['var4'], com_amap_api_maps_model_LatLng()..refId = (args['var5']), com_amap_api_maps_model_LatLng()..refId = (args['var6']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getInfoWindowAnimationManager':
            // 日志打印
            print('fluttify-dart-callback: getInfoWindowAnimationManager([])');
        
              // 调用回调方法
            mGLMapView?.getInfoWindowAnimationManager();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMaskLayerParams':
            // 日志打印
            print('fluttify-dart-callback: setMaskLayerParams([\'var1\':$args[var1], \'var2\':$args[var2], \'var3\':$args[var3], \'var4\':$args[var4], \'var5\':$args[var5], \'var6\':$args[var6]])');
        
              // 调用回调方法
            mGLMapView?.setMaskLayerParams(args['var1'], args['var2'], args['var3'], args['var4'], args['var5'], args['var6']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMaxZoomLevel':
            // 日志打印
            print('fluttify-dart-callback: setMaxZoomLevel([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setMaxZoomLevel(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMinZoomLevel':
            // 日志打印
            print('fluttify-dart-callback: setMinZoomLevel([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setMinZoomLevel(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::resetMinMaxZoomPreference':
            // 日志打印
            print('fluttify-dart-callback: resetMinMaxZoomPreference([])');
        
              // 调用回调方法
            mGLMapView?.resetMinMaxZoomPreference();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMapStatusLimits':
            // 日志打印
            print('fluttify-dart-callback: setMapStatusLimits([])');
        
              // 调用回调方法
            mGLMapView?.setMapStatusLimits(com_amap_api_maps_model_LatLngBounds()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setCustomMapStylePath':
            // 日志打印
            print('fluttify-dart-callback: setCustomMapStylePath([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setCustomMapStylePath(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMapCustomEnable':
            // 日志打印
            print('fluttify-dart-callback: setMapCustomEnable([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setMapCustomEnable(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMainHandler':
            // 日志打印
            print('fluttify-dart-callback: getMainHandler([])');
        
              // 调用回调方法
            mGLMapView?.getMainHandler();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::onChangeFinish':
            // 日志打印
            print('fluttify-dart-callback: onChangeFinish([])');
        
              // 调用回调方法
            mGLMapView?.onChangeFinish();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setZoomScaleParam':
            // 日志打印
            print('fluttify-dart-callback: setZoomScaleParam([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setZoomScaleParam(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::onFling':
            // 日志打印
            print('fluttify-dart-callback: onFling([])');
        
              // 调用回调方法
            mGLMapView?.onFling();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMapWidth':
            // 日志打印
            print('fluttify-dart-callback: getMapWidth([])');
        
              // 调用回调方法
            mGLMapView?.getMapWidth();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMapHeight':
            // 日志打印
            print('fluttify-dart-callback: getMapHeight([])');
        
              // 调用回调方法
            mGLMapView?.getMapHeight();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getCameraAngle':
            // 日志打印
            print('fluttify-dart-callback: getCameraAngle([])');
        
              // 调用回调方法
            mGLMapView?.getCameraAngle();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getSkyHeight':
            // 日志打印
            print('fluttify-dart-callback: getSkyHeight([])');
        
              // 调用回调方法
            mGLMapView?.getSkyHeight();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::isMaploaded':
            // 日志打印
            print('fluttify-dart-callback: isMaploaded([])');
        
              // 调用回调方法
            mGLMapView?.isMaploaded();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMapConfig':
            // 日志打印
            print('fluttify-dart-callback: getMapConfig([])');
        
              // 调用回调方法
            mGLMapView?.getMapConfig();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getView':
            // 日志打印
            print('fluttify-dart-callback: getView([])');
        
              // 调用回调方法
            mGLMapView?.getView();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setZOrderOnTop':
            // 日志打印
            print('fluttify-dart-callback: setZOrderOnTop([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setZOrderOnTop(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::destroy':
            // 日志打印
            print('fluttify-dart-callback: destroy([])');
        
              // 调用回调方法
            mGLMapView?.destroy();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setVisibilityEx':
            // 日志打印
            print('fluttify-dart-callback: setVisibilityEx([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setVisibilityEx(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::onActivityPause':
            // 日志打印
            print('fluttify-dart-callback: onActivityPause([])');
        
              // 调用回调方法
            mGLMapView?.onActivityPause();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::onActivityResume':
            // 日志打印
            print('fluttify-dart-callback: onActivityResume([])');
        
              // 调用回调方法
            mGLMapView?.onActivityResume();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::queueEvent':
            // 日志打印
            print('fluttify-dart-callback: queueEvent([])');
        
              // 调用回调方法
            mGLMapView?.queueEvent(com_autonavi_amap_mapcore_interfaces_Runnable()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::createGLOverlay':
            // 日志打印
            print('fluttify-dart-callback: createGLOverlay([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.createGLOverlay(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getGlOverlayMgrPtr':
            // 日志打印
            print('fluttify-dart-callback: getGlOverlayMgrPtr([])');
        
              // 调用回调方法
            mGLMapView?.getGlOverlayMgrPtr();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addCrossVector':
            // 日志打印
            print('fluttify-dart-callback: addCrossVector([])');
        
              // 调用回调方法
            mGLMapView?.addCrossVector(com_amap_api_maps_model_CrossOverlayOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addNaviRouteOverlay':
            // 日志打印
            print('fluttify-dart-callback: addNaviRouteOverlay([])');
        
              // 调用回调方法
            mGLMapView?.addNaviRouteOverlay();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::removeEngineGLOverlay':
            // 日志打印
            print('fluttify-dart-callback: removeEngineGLOverlay([])');
        
              // 调用回调方法
            mGLMapView?.removeEngineGLOverlay(com_autonavi_ae_gmap_gloverlay_BaseMapOverlay()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getViewMatrix':
            // 日志打印
            print('fluttify-dart-callback: getViewMatrix([])');
        
              // 调用回调方法
            mGLMapView?.getViewMatrix();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getProjectionMatrix':
            // 日志打印
            print('fluttify-dart-callback: getProjectionMatrix([])');
        
              // 调用回调方法
            mGLMapView?.getProjectionMatrix();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addOverlayTexture':
            // 日志打印
            print('fluttify-dart-callback: addOverlayTexture([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.addOverlayTexture(args['var1'], com_autonavi_ae_gmap_gloverlay_GLTextureProperty()..refId = (args['var2']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::renderSurface':
            // 日志打印
            print('fluttify-dart-callback: renderSurface([])');
        
              // 调用回调方法
            mGLMapView?.renderSurface(javax_microedition_khronos_opengles_GL10()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::changeSurface':
            // 日志打印
            print('fluttify-dart-callback: changeSurface([\'var2\':$args[var2], \'var3\':$args[var3]])');
        
              // 调用回调方法
            mGLMapView?.changeSurface(javax_microedition_khronos_opengles_GL10()..refId = (args['var1']), args['var2'], args['var3']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::createSurface':
            // 日志打印
            print('fluttify-dart-callback: createSurface([])');
        
              // 调用回调方法
            mGLMapView?.createSurface(javax_microedition_khronos_opengles_GL10()..refId = (args['var1']), javax_microedition_khronos_egl_EGLConfig()..refId = (args['var2']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::onTouchEvent':
            // 日志打印
            print('fluttify-dart-callback: onTouchEvent([])');
        
              // 调用回调方法
            mGLMapView?.onTouchEvent(android_view_MotionEvent()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::canStopMapRender':
            // 日志打印
            print('fluttify-dart-callback: canStopMapRender([])');
        
              // 调用回调方法
            mGLMapView?.canStopMapRender();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getLatLngRect':
            // 日志打印
            print('fluttify-dart-callback: getLatLngRect([])');
        
              // 调用回调方法
            mGLMapView?.getLatLngRect(com_autonavi_amap_mapcore_interfaces_DPoint[]()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setCustomTextureResourcePath':
            // 日志打印
            print('fluttify-dart-callback: setCustomTextureResourcePath([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setCustomTextureResourcePath(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMyLocationStyle':
            // 日志打印
            print('fluttify-dart-callback: getMyLocationStyle([])');
        
              // 调用回调方法
            mGLMapView?.getMyLocationStyle();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getRenderMode':
            // 日志打印
            print('fluttify-dart-callback: getRenderMode([])');
        
              // 调用回调方法
            mGLMapView?.getRenderMode();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::destroySurface':
            // 日志打印
            print('fluttify-dart-callback: destroySurface([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.destroySurface(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::drawFrame':
            // 日志打印
            print('fluttify-dart-callback: drawFrame([])');
        
              // 调用回调方法
            mGLMapView?.drawFrame(javax_microedition_khronos_opengles_GL10()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::requestRender':
            // 日志打印
            print('fluttify-dart-callback: requestRender([])');
        
              // 调用回调方法
            mGLMapView?.requestRender();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::resetRenderTime':
            // 日志打印
            print('fluttify-dart-callback: resetRenderTime([])');
        
              // 调用回调方法
            mGLMapView?.resetRenderTime();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::onIndoorBuildingActivity':
            // 日志打印
            print('fluttify-dart-callback: onIndoorBuildingActivity([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
              // 调用回调方法
            mGLMapView?.onIndoorBuildingActivity(args['var1'], args['var2']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getCamerInfo':
            // 日志打印
            print('fluttify-dart-callback: getCamerInfo([])');
        
              // 调用回调方法
            mGLMapView?.getCamerInfo();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::checkMapState':
            // 日志打印
            print('fluttify-dart-callback: checkMapState([])');
        
              // 调用回调方法
            mGLMapView?.checkMapState(com_autonavi_ae_gmap_GLMapState()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setRenderMode':
            // 日志打印
            print('fluttify-dart-callback: setRenderMode([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setRenderMode(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setOnMultiPointClickListener':
            // 日志打印
            print('fluttify-dart-callback: setOnMultiPointClickListener([])');
        
              // 调用回调方法
            mGLMapView?.setOnMultiPointClickListener(com_amap_api_maps_AMap_OnMultiPointClickListener_Ref()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getMapContentApprovalNumber':
            // 日志打印
            print('fluttify-dart-callback: getMapContentApprovalNumber([])');
        
              // 调用回调方法
            mGLMapView?.getMapContentApprovalNumber();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::getSatelliteImageApprovalNumber':
            // 日志打印
            print('fluttify-dart-callback: getSatelliteImageApprovalNumber([])');
        
              // 调用回调方法
            mGLMapView?.getSatelliteImageApprovalNumber();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setMapLanguage':
            // 日志打印
            print('fluttify-dart-callback: setMapLanguage([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setMapLanguage(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setCustomMapStyleID':
            // 日志打印
            print('fluttify-dart-callback: setCustomMapStyleID([\'var1\':$args[var1]])');
        
              // 调用回调方法
            mGLMapView?.setCustomMapStyleID(args['var1']);
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addBuildingOverlay':
            // 日志打印
            print('fluttify-dart-callback: addBuildingOverlay([])');
        
              // 调用回调方法
            mGLMapView?.addBuildingOverlay();
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addGLModel':
            // 日志打印
            print('fluttify-dart-callback: addGLModel([])');
        
              // 调用回调方法
            mGLMapView?.addGLModel(com_amap_api_maps_model_GL3DModelOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::addParticleOverlay':
            // 日志打印
            print('fluttify-dart-callback: addParticleOverlay([])');
        
              // 调用回调方法
            mGLMapView?.addParticleOverlay(com_amap_api_maps_model_particle_ParticleOverlayOptions()..refId = (args['var1']));
            break;
          case 'Callback::com.autonavi.amap.mapcore.interfaces.IAMap::setCustomMapStyle':
            // 日志打印
            print('fluttify-dart-callback: setCustomMapStyle([])');
        
              // 调用回调方法
            mGLMapView?.setCustomMapStyle(com_amap_api_maps_model_CustomMapStyleOptions()..refId = (args['var1']));
            break;
          default:
            break;
        }
      });
  }
  
  Future<void> set_mSurfacedestoryed(bool mSurfacedestoryed) async {
    await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::set_mSurfacedestoryed', {'refId': refId, "mSurfacedestoryed": mSurfacedestoryed});
  
  
  }
  

  // 生成方法们
   Future<String> setTrafficMode(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::setTrafficMode([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::setTrafficMode', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> resetTickCount(int var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::resetTickCount([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::resetTickCount', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isRenderPause() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::isRenderPause([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::isRenderPause', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRenderFps(double var1) async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::setRenderFps([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::setRenderFps', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> renderPause() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::renderPause([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::renderPause', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> renderResume() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::renderResume([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::renderResume', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onAttachedToWindow() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::onAttachedToWindow([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::onAttachedToWindow', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onDetachedFromWindow() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::onDetachedFromWindow([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::onDetachedFromWindow', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> onSurfaceDestory() async {
    // 日志打印
    print('fluttify-dart: com.autonavi.ae.gmap.GLMapRender@$refId::onSurfaceDestory([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.autonavi.ae.gmap.GLMapRender::onSurfaceDestory', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}