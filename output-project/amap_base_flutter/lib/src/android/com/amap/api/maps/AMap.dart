import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class com_amap_api_maps_AMap extends Ref_Android {
  com_amap_api_maps_AMap.withRefId(int refId): super(refId);

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  

  // 生成setters
  

  // 生成方法们
   Future<com_amap_api_maps_model_CameraPosition> getCameraPosition() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getCameraPosition([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getCameraPosition', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CameraPosition.withRefId(result);
  }
  
   Future<double> getMaxZoomLevel() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getMaxZoomLevel([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getMaxZoomLevel', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getMinZoomLevel() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getMinZoomLevel([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getMinZoomLevel', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> moveCamera(com_amap_api_maps_CameraUpdate var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::moveCamera([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::moveCamera', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> animateCamera(com_amap_api_maps_CameraUpdate var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::animateCamera([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::animateCamera', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> stopAnimation() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::stopAnimation([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::stopAnimation', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_NavigateArrow> addNavigateArrow(com_amap_api_maps_model_NavigateArrowOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addNavigateArrow([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addNavigateArrow', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_NavigateArrow.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_Polyline> addPolyline(com_amap_api_maps_model_PolylineOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addPolyline([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addPolyline', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_Polyline.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_BuildingOverlay> addBuildingOverlay() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addBuildingOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addBuildingOverlay', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_BuildingOverlay.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_Circle> addCircle(com_amap_api_maps_model_CircleOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addCircle([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addCircle', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_Circle.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_Arc> addArc(com_amap_api_maps_model_ArcOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addArc([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addArc', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_Arc.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_Polygon> addPolygon(com_amap_api_maps_model_PolygonOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addPolygon([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addPolygon', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_Polygon.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_GroundOverlay> addGroundOverlay(com_amap_api_maps_model_GroundOverlayOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addGroundOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addGroundOverlay', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_GroundOverlay.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_Marker> addMarker(com_amap_api_maps_model_MarkerOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addMarker([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addMarker', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_Marker.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_GL3DModel> addGL3DModel(com_amap_api_maps_model_GL3DModelOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addGL3DModel([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addGL3DModel', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_GL3DModel.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_Text> addText(com_amap_api_maps_model_TextOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addText([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addText', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_Text.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_TileOverlay> addTileOverlay(com_amap_api_maps_model_TileOverlayOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addTileOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addTileOverlay', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_TileOverlay.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_MultiPointOverlay> addMultiPointOverlay(com_amap_api_maps_model_MultiPointOverlayOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addMultiPointOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addMultiPointOverlay', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_MultiPointOverlay.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_particle_ParticleOverlay> addParticleOverlay(com_amap_api_maps_model_particle_ParticleOverlayOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addParticleOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addParticleOverlay', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_particle_ParticleOverlay.withRefId(result);
  }
  
   Future<String> clear() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::clear([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::clear', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getMapType() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getMapType([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getMapType', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMapType(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMapType([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMapType', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<bool> isTrafficEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::isTrafficEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::isTrafficEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setTrafficEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setTrafficEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setTrafficEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> showMapText(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::showMapText([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::showMapText', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> showIndoorMap(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::showIndoorMap([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::showIndoorMap', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> showBuildings(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::showBuildings([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::showBuildings', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMyTrafficStyle(com_amap_api_maps_model_MyTrafficStyle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMyTrafficStyle([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMyTrafficStyle', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_MyTrafficStyle> getMyTrafficStyle() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getMyTrafficStyle([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getMyTrafficStyle', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_MyTrafficStyle.withRefId(result);
  }
  
   Future<bool> isMyLocationEnabled() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::isMyLocationEnabled([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::isMyLocationEnabled', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMyLocationEnabled(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMyLocationEnabled([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMyLocationEnabled', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setLocationSource() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setLocationSource([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setLocationSource', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMyLocationStyle(com_amap_api_maps_model_MyLocationStyle var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMyLocationStyle([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMyLocationStyle', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_MyLocationStyle> getMyLocationStyle() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getMyLocationStyle([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getMyLocationStyle', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_MyLocationStyle.withRefId(result);
  }
  
   Future<String> setMyLocationType(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMyLocationType([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMyLocationType', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMyLocationRotateAngle(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMyLocationRotateAngle([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMyLocationRotateAngle', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_UiSettings> getUiSettings() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getUiSettings([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getUiSettings', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_UiSettings.withRefId(result);
  }
  
   Future<com_amap_api_maps_Projection> getProjection() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getProjection([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getProjection', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_Projection.withRefId(result);
  }
  
   Future<String> setOnCameraChangeListener({void onCameraChange(com_amap_api_maps_model_CameraPosition var1), void onCameraChangeFinish(com_amap_api_maps_model_CameraPosition var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnCameraChangeListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnCameraChangeListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnCameraChangeListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnCameraChangeListener_Callback::onCameraChange':
              if (onCameraChange != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnCameraChangeListener_onCameraChange([])');
        
                // 调用回调方法
                onCameraChange(com_amap_api_maps_model_CameraPosition.withRefId(args['var1']));
              }
              break;
            case 'com.amap.api.maps.AMap::setOnCameraChangeListener_Callback::onCameraChangeFinish':
              if (onCameraChangeFinish != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnCameraChangeListener_onCameraChangeFinish([])');
        
                // 调用回调方法
                onCameraChangeFinish(com_amap_api_maps_model_CameraPosition.withRefId(args['var1']));
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setOnMapClickListener({void onMapClick(com_amap_api_maps_model_LatLng var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnMapClickListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnMapClickListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnMapClickListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnMapClickListener_Callback::onMapClick':
              if (onMapClick != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnMapClickListener_onMapClick([])');
        
                // 调用回调方法
                onMapClick(com_amap_api_maps_model_LatLng.withRefId(args['var1']));
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setOnMapTouchListener() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnMapTouchListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnMapTouchListener', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setOnPOIClickListener({void onPOIClick(com_amap_api_maps_model_Poi var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnPOIClickListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnPOIClickListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnPOIClickListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnPOIClickListener_Callback::onPOIClick':
              if (onPOIClick != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnPOIClickListener_onPOIClick([])');
        
                // 调用回调方法
                onPOIClick(com_amap_api_maps_model_Poi.withRefId(args['var1']));
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setOnMyLocationChangeListener() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnMyLocationChangeListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnMyLocationChangeListener', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setOnMapLongClickListener({void onMapLongClick(com_amap_api_maps_model_LatLng var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnMapLongClickListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnMapLongClickListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnMapLongClickListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnMapLongClickListener_Callback::onMapLongClick':
              if (onMapLongClick != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnMapLongClickListener_onMapLongClick([])');
        
                // 调用回调方法
                onMapLongClick(com_amap_api_maps_model_LatLng.withRefId(args['var1']));
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setOnMarkerClickListener({void onMarkerClick(com_amap_api_maps_model_Marker var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnMarkerClickListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnMarkerClickListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnMarkerClickListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnMarkerClickListener_Callback::onMarkerClick':
              if (onMarkerClick != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnMarkerClickListener_onMarkerClick([])');
        
                // 调用回调方法
                onMarkerClick(com_amap_api_maps_model_Marker.withRefId(args['var1']));
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setOnPolylineClickListener({void onPolylineClick(com_amap_api_maps_model_Polyline var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnPolylineClickListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnPolylineClickListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnPolylineClickListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnPolylineClickListener_Callback::onPolylineClick':
              if (onPolylineClick != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnPolylineClickListener_onPolylineClick([])');
        
                // 调用回调方法
                onPolylineClick(com_amap_api_maps_model_Polyline.withRefId(args['var1']));
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setOnMarkerDragListener({void onMarkerDragStart(com_amap_api_maps_model_Marker var1), void onMarkerDrag(com_amap_api_maps_model_Marker var1), void onMarkerDragEnd(com_amap_api_maps_model_Marker var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnMarkerDragListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnMarkerDragListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnMarkerDragListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnMarkerDragListener_Callback::onMarkerDragStart':
              if (onMarkerDragStart != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnMarkerDragListener_onMarkerDragStart([])');
        
                // 调用回调方法
                onMarkerDragStart(com_amap_api_maps_model_Marker.withRefId(args['var1']));
              }
              break;
            case 'com.amap.api.maps.AMap::setOnMarkerDragListener_Callback::onMarkerDrag':
              if (onMarkerDrag != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnMarkerDragListener_onMarkerDrag([])');
        
                // 调用回调方法
                onMarkerDrag(com_amap_api_maps_model_Marker.withRefId(args['var1']));
              }
              break;
            case 'com.amap.api.maps.AMap::setOnMarkerDragListener_Callback::onMarkerDragEnd':
              if (onMarkerDragEnd != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnMarkerDragListener_onMarkerDragEnd([])');
        
                // 调用回调方法
                onMarkerDragEnd(com_amap_api_maps_model_Marker.withRefId(args['var1']));
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setOnInfoWindowClickListener({void onInfoWindowClick(com_amap_api_maps_model_Marker var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnInfoWindowClickListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnInfoWindowClickListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnInfoWindowClickListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnInfoWindowClickListener_Callback::onInfoWindowClick':
              if (onInfoWindowClick != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnInfoWindowClickListener_onInfoWindowClick([])');
        
                // 调用回调方法
                onInfoWindowClick(com_amap_api_maps_model_Marker.withRefId(args['var1']));
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setInfoWindowAdapter() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setInfoWindowAdapter([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setInfoWindowAdapter', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCommonInfoWindowAdapter() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setCommonInfoWindowAdapter([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setCommonInfoWindowAdapter', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setOnMapLoadedListener({void onMapLoaded()}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnMapLoadedListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnMapLoadedListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnMapLoadedListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnMapLoadedListener_Callback::onMapLoaded':
              if (onMapLoaded != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnMapLoadedListener_onMapLoaded([])');
        
                // 调用回调方法
                onMapLoaded();
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setOnIndoorBuildingActiveListener({void OnIndoorBuilding(com_amap_api_maps_model_IndoorBuildingInfo var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnIndoorBuildingActiveListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnIndoorBuildingActiveListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnIndoorBuildingActiveListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnIndoorBuildingActiveListener_Callback::OnIndoorBuilding':
              if (OnIndoorBuilding != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnIndoorBuildingActiveListener_OnIndoorBuilding([])');
        
                // 调用回调方法
                OnIndoorBuilding(com_amap_api_maps_model_IndoorBuildingInfo.withRefId(args['var1']));
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> setOnMultiPointClickListener({void onPointClick(com_amap_api_maps_model_MultiPointItem var1)}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setOnMultiPointClickListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setOnMultiPointClickListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setOnMultiPointClickListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setOnMultiPointClickListener_Callback::onPointClick':
              if (onPointClick != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setOnMultiPointClickListener_onPointClick([])');
        
                // 调用回调方法
                onPointClick(com_amap_api_maps_model_MultiPointItem.withRefId(args['var1']));
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<String> getMapPrintScreen() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getMapPrintScreen([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getMapPrintScreen', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getMapScreenShot() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getMapScreenShot([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getMapScreenShot', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<double> getScalePerPixel() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getScalePerPixel([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getScalePerPixel', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> runOnDrawFrame() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::runOnDrawFrame([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::runOnDrawFrame', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> removecache() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::removecache([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::removecache', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCustomRenderer() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setCustomRenderer([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setCustomRenderer', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setPointToCenter(int var1, int var2) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setPointToCenter([\'var1\':$var1, \'var2\':$var2])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setPointToCenter', {"var1": var1, "var2": var2, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMapTextZIndex(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMapTextZIndex([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMapTextZIndex', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setLoadOfflineData(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setLoadOfflineData([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setLoadOfflineData', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<int> getMapTextZIndex() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getMapTextZIndex([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getMapTextZIndex', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> reloadMap() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::reloadMap([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::reloadMap', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRenderFps(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setRenderFps([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setRenderFps', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setIndoorBuildingInfo(com_amap_api_maps_model_IndoorBuildingInfo var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setIndoorBuildingInfo([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setIndoorBuildingInfo', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setAMapGestureListener({void onDoubleTap(double var1, double var2), void onSingleTap(double var1, double var2), void onFling(double var1, double var2), void onScroll(double var1, double var2), void onLongPress(double var1, double var2), void onDown(double var1, double var2), void onUp(double var1, double var2), void onMapStable()}) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setAMapGestureListener([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setAMapGestureListener', {"refId": refId});
  
  
    // 接受原生回调
    MethodChannel('com.amap.api.maps.AMap::setAMapGestureListener_Callback' + refId.toString())
        .setMethodCallHandler((methodCall) async {
          final args = methodCall.arguments as Map;
          final refId = args['refId'] as int;
          if (refId != this.refId) return;
  
          switch (methodCall.method) {
            case 'com.amap.api.maps.AMap::setAMapGestureListener_Callback::onDoubleTap':
              if (onDoubleTap != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setAMapGestureListener_onDoubleTap([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
                // 调用回调方法
                onDoubleTap(args['var1'], args['var2']);
              }
              break;
            case 'com.amap.api.maps.AMap::setAMapGestureListener_Callback::onSingleTap':
              if (onSingleTap != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setAMapGestureListener_onSingleTap([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
                // 调用回调方法
                onSingleTap(args['var1'], args['var2']);
              }
              break;
            case 'com.amap.api.maps.AMap::setAMapGestureListener_Callback::onFling':
              if (onFling != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setAMapGestureListener_onFling([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
                // 调用回调方法
                onFling(args['var1'], args['var2']);
              }
              break;
            case 'com.amap.api.maps.AMap::setAMapGestureListener_Callback::onScroll':
              if (onScroll != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setAMapGestureListener_onScroll([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
                // 调用回调方法
                onScroll(args['var1'], args['var2']);
              }
              break;
            case 'com.amap.api.maps.AMap::setAMapGestureListener_Callback::onLongPress':
              if (onLongPress != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setAMapGestureListener_onLongPress([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
                // 调用回调方法
                onLongPress(args['var1'], args['var2']);
              }
              break;
            case 'com.amap.api.maps.AMap::setAMapGestureListener_Callback::onDown':
              if (onDown != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setAMapGestureListener_onDown([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
                // 调用回调方法
                onDown(args['var1'], args['var2']);
              }
              break;
            case 'com.amap.api.maps.AMap::setAMapGestureListener_Callback::onUp':
              if (onUp != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setAMapGestureListener_onUp([\'var1\':$args[var1], \'var2\':$args[var2]])');
        
                // 调用回调方法
                onUp(args['var1'], args['var2']);
              }
              break;
            case 'com.amap.api.maps.AMap::setAMapGestureListener_Callback::onMapStable':
              if (onMapStable != null) {
                // 日志打印
                print('fluttify-dart-callback: com.amap.api.maps.AMap::setAMapGestureListener_onMapStable([])');
        
                // 调用回调方法
                onMapStable();
              }
              break;
            default:
              break;
          }
        });
  
    // 返回值
    return result;
  }
  
   Future<double> getZoomToSpanLevel(com_amap_api_maps_model_LatLng var1, com_amap_api_maps_model_LatLng var2) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getZoomToSpanLevel([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getZoomToSpanLevel', {"var1": var1.refId, "var2": var2.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_InfoWindowAnimationManager> getInfoWindowAnimationManager() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getInfoWindowAnimationManager([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getInfoWindowAnimationManager', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_InfoWindowAnimationManager.withRefId(result);
  }
  
   Future<String> setMaskLayerParams(int var1, int var2, int var3, int var4, int var5, int var6) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMaskLayerParams([\'var1\':$var1, \'var2\':$var2, \'var3\':$var3, \'var4\':$var4, \'var5\':$var5, \'var6\':$var6])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMaskLayerParams', {"var1": var1, "var2": var2, "var3": var3, "var4": var4, "var5": var5, "var6": var6, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMaxZoomLevel(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMaxZoomLevel([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMaxZoomLevel', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMinZoomLevel(double var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMinZoomLevel([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMinZoomLevel', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> resetMinMaxZoomPreference() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::resetMinMaxZoomPreference([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::resetMinMaxZoomPreference', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMapStatusLimits(com_amap_api_maps_model_LatLngBounds var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMapStatusLimits([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMapStatusLimits', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<com_amap_api_maps_model_CrossOverlay> addCrossOverlay(com_amap_api_maps_model_CrossOverlayOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addCrossOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addCrossOverlay', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_CrossOverlay.withRefId(result);
  }
  
   Future<com_amap_api_maps_model_RouteOverlay> addRouteOverlay() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::addRouteOverlay([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::addRouteOverlay', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return com_amap_api_maps_model_RouteOverlay.withRefId(result);
  }
  
   Future<String> setMapCustomEnable(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMapCustomEnable([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMapCustomEnable', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCustomMapStylePath(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setCustomMapStylePath([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setCustomMapStylePath', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCustomMapStyle(com_amap_api_maps_model_CustomMapStyleOptions var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setCustomMapStyle([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setCustomMapStyle', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCustomMapStyleID(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setCustomMapStyleID([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setCustomMapStyleID', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setCustomTextureResourcePath(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setCustomTextureResourcePath([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setCustomTextureResourcePath', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRenderMode(int var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setRenderMode([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setRenderMode', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getP20MapCenter(com_autonavi_amap_mapcore_IPoint var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getP20MapCenter([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getP20MapCenter', {"var1": var1.refId, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getMapContentApprovalNumber() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getMapContentApprovalNumber([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getMapContentApprovalNumber', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> getSatelliteImageApprovalNumber() async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::getSatelliteImageApprovalNumber([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::getSatelliteImageApprovalNumber', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setMapLanguage(String var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setMapLanguage([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setMapLanguage', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setRoadArrowEnable(bool var1) async {
    // 日志打印
    print('fluttify-dart: com.amap.api.maps.AMap@$refId::setRoadArrowEnable([\'var1\':$var1])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('com.amap.api.maps.AMap::setRoadArrowEnable', {"var1": var1, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}