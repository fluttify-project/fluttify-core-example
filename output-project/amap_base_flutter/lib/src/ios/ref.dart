import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class Ref_iOS {
  Ref_iOS.withRefId(this.refId);

  final int refId;

  Future<bool> isKindOfAMapURLSearch() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfAMapURLSearch', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfAMapNaviConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfAMapNaviConfig', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfAMapRouteConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfAMapRouteConfig', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfAMapPOIConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfAMapPOIConfig', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfAMapServices() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfAMapServices', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAOfflineCity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAOfflineCity', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAOfflineItemNationWide() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAOfflineItemNationWide', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMultiPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMultiPoint', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAGroundOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAGroundOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAPolygonRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAPolygonRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAPinAnnotationView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAPinAnnotationView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAHeatMapNode() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAHeatMapNode', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAHeatMapGradient() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAHeatMapGradient', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAHeatMapTileOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAHeatMapTileOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMapStatus() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMapStatus', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAPointAnnotation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAPointAnnotation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMACircle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMACircle', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAArcRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAArcRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMapCustomStyleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMapCustomStyleOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAPolygon() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAPolygon', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAPolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAPolyline', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMultiColoredPolylineRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMultiColoredPolylineRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAAnimatedAnnotation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAAnimatedAnnotation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMultiTexturePolylineRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMultiTexturePolylineRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAOfflineProvince() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAOfflineProvince', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMATileOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMATileOverlayRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAOfflineItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAOfflineItem', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAGeodesicPolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAGeodesicPolyline', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMATouchPoi() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMATouchPoi', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAOfflineItemMunicipality() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAOfflineItemMunicipality', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMultiPolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMultiPolyline', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMATraceManager() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMATraceManager', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMultiPointOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMultiPointOverlayRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAIndoorFloorInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAIndoorFloorInfo', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAIndoorInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAIndoorInfo', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAPolylineRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAPolylineRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAAnnotationMoveAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAAnnotationMoveAnimation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAShape() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAShape', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAAnnotationView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAAnnotationView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMATileOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMATileOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMATileOverlayPath() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMATileOverlayPath', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMACustomCalloutView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMACustomCalloutView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAOfflineItemCommonCity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAOfflineItemCommonCity', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAOfflineMap() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAOfflineMap', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMACircleRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMACircleRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleOverlayRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMACoordinateBounds() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMACoordinateBounds', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMACoordinateSpan() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMACoordinateSpan', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMACoordinateRegion() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMACoordinateRegion', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMapPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMapPoint', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMapSize() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMapSize', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMapRect() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMapRect', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleRandomVelocityGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleRandomVelocityGenerate', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleRandomColorGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleRandomColorGenerate', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleConstantRotationGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleConstantRotationGenerate', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleCurveSizeGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleCurveSizeGenerate', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleEmissionModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleEmissionModule', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleSinglePointShapeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleSinglePointShapeModule', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleRectShapeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleRectShapeModule', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleOverLifeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleOverLifeModule', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleOverlayOptions', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAParticleOverlayOptionsFactory() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAParticleOverlayOptionsFactory', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAOverlayRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAUserLocation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAUserLocation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMultiPointItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMultiPointItem', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMultiPointOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMultiPointOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMACustomBuildingOverlayOption() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMACustomBuildingOverlayOption', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMACustomBuildingOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMACustomBuildingOverlay', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMATracePoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMATracePoint', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMATraceLocation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMATraceLocation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAArc() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAArc', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAUserLocationRepresentation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAUserLocationRepresentation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAMapView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAMapView', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAOverlayPathRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAOverlayPathRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMAGroundOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMAGroundOverlayRenderer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfMACustomBuildingOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::isKindOfMACustomBuildingOverlayRenderer', {'refId': refId});
    return result;
  }
  

  Future<AMapURLSearch> asAMapURLSearch() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asAMapURLSearch', {'refId': refId});
    return AMapURLSearch.withRefId(result);
  }
  
  Future<AMapNaviConfig> asAMapNaviConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asAMapNaviConfig', {'refId': refId});
    return AMapNaviConfig.withRefId(result);
  }
  
  Future<AMapRouteConfig> asAMapRouteConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asAMapRouteConfig', {'refId': refId});
    return AMapRouteConfig.withRefId(result);
  }
  
  Future<AMapPOIConfig> asAMapPOIConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asAMapPOIConfig', {'refId': refId});
    return AMapPOIConfig.withRefId(result);
  }
  
  Future<AMapServices> asAMapServices() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asAMapServices', {'refId': refId});
    return AMapServices.withRefId(result);
  }
  
  Future<MAOfflineCity> asMAOfflineCity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAOfflineCity', {'refId': refId});
    return MAOfflineCity.withRefId(result);
  }
  
  Future<MAOfflineItemNationWide> asMAOfflineItemNationWide() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAOfflineItemNationWide', {'refId': refId});
    return MAOfflineItemNationWide.withRefId(result);
  }
  
  Future<MAMultiPoint> asMAMultiPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMultiPoint', {'refId': refId});
    return MAMultiPoint.withRefId(result);
  }
  
  Future<MAGroundOverlay> asMAGroundOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAGroundOverlay', {'refId': refId});
    return MAGroundOverlay.withRefId(result);
  }
  
  Future<MAPolygonRenderer> asMAPolygonRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAPolygonRenderer', {'refId': refId});
    return MAPolygonRenderer.withRefId(result);
  }
  
  Future<MAPinAnnotationView> asMAPinAnnotationView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAPinAnnotationView', {'refId': refId});
    return MAPinAnnotationView.withRefId(result);
  }
  
  Future<MAHeatMapNode> asMAHeatMapNode() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAHeatMapNode', {'refId': refId});
    return MAHeatMapNode.withRefId(result);
  }
  
  Future<MAHeatMapGradient> asMAHeatMapGradient() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAHeatMapGradient', {'refId': refId});
    return MAHeatMapGradient.withRefId(result);
  }
  
  Future<MAHeatMapTileOverlay> asMAHeatMapTileOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAHeatMapTileOverlay', {'refId': refId});
    return MAHeatMapTileOverlay.withRefId(result);
  }
  
  Future<MAMapStatus> asMAMapStatus() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMapStatus', {'refId': refId});
    return MAMapStatus.withRefId(result);
  }
  
  Future<MAPointAnnotation> asMAPointAnnotation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAPointAnnotation', {'refId': refId});
    return MAPointAnnotation.withRefId(result);
  }
  
  Future<MACircle> asMACircle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMACircle', {'refId': refId});
    return MACircle.withRefId(result);
  }
  
  Future<MAArcRenderer> asMAArcRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAArcRenderer', {'refId': refId});
    return MAArcRenderer.withRefId(result);
  }
  
  Future<MAMapCustomStyleOptions> asMAMapCustomStyleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMapCustomStyleOptions', {'refId': refId});
    return MAMapCustomStyleOptions.withRefId(result);
  }
  
  Future<MAPolygon> asMAPolygon() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAPolygon', {'refId': refId});
    return MAPolygon.withRefId(result);
  }
  
  Future<MAParticleOverlay> asMAParticleOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleOverlay', {'refId': refId});
    return MAParticleOverlay.withRefId(result);
  }
  
  Future<MAPolyline> asMAPolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAPolyline', {'refId': refId});
    return MAPolyline.withRefId(result);
  }
  
  Future<MAMultiColoredPolylineRenderer> asMAMultiColoredPolylineRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMultiColoredPolylineRenderer', {'refId': refId});
    return MAMultiColoredPolylineRenderer.withRefId(result);
  }
  
  Future<MAAnimatedAnnotation> asMAAnimatedAnnotation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAAnimatedAnnotation', {'refId': refId});
    return MAAnimatedAnnotation.withRefId(result);
  }
  
  Future<MAMultiTexturePolylineRenderer> asMAMultiTexturePolylineRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMultiTexturePolylineRenderer', {'refId': refId});
    return MAMultiTexturePolylineRenderer.withRefId(result);
  }
  
  Future<MAOfflineProvince> asMAOfflineProvince() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAOfflineProvince', {'refId': refId});
    return MAOfflineProvince.withRefId(result);
  }
  
  Future<MATileOverlayRenderer> asMATileOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMATileOverlayRenderer', {'refId': refId});
    return MATileOverlayRenderer.withRefId(result);
  }
  
  Future<MAOfflineItem> asMAOfflineItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAOfflineItem', {'refId': refId});
    return MAOfflineItem.withRefId(result);
  }
  
  Future<MAGeodesicPolyline> asMAGeodesicPolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAGeodesicPolyline', {'refId': refId});
    return MAGeodesicPolyline.withRefId(result);
  }
  
  Future<MATouchPoi> asMATouchPoi() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMATouchPoi', {'refId': refId});
    return MATouchPoi.withRefId(result);
  }
  
  Future<MAOfflineItemMunicipality> asMAOfflineItemMunicipality() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAOfflineItemMunicipality', {'refId': refId});
    return MAOfflineItemMunicipality.withRefId(result);
  }
  
  Future<MAMultiPolyline> asMAMultiPolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMultiPolyline', {'refId': refId});
    return MAMultiPolyline.withRefId(result);
  }
  
  Future<MATraceManager> asMATraceManager() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMATraceManager', {'refId': refId});
    return MATraceManager.withRefId(result);
  }
  
  Future<MAMultiPointOverlayRenderer> asMAMultiPointOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMultiPointOverlayRenderer', {'refId': refId});
    return MAMultiPointOverlayRenderer.withRefId(result);
  }
  
  Future<MAIndoorFloorInfo> asMAIndoorFloorInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAIndoorFloorInfo', {'refId': refId});
    return MAIndoorFloorInfo.withRefId(result);
  }
  
  Future<MAIndoorInfo> asMAIndoorInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAIndoorInfo', {'refId': refId});
    return MAIndoorInfo.withRefId(result);
  }
  
  Future<MAPolylineRenderer> asMAPolylineRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAPolylineRenderer', {'refId': refId});
    return MAPolylineRenderer.withRefId(result);
  }
  
  Future<MAAnnotationMoveAnimation> asMAAnnotationMoveAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAAnnotationMoveAnimation', {'refId': refId});
    return MAAnnotationMoveAnimation.withRefId(result);
  }
  
  Future<MAShape> asMAShape() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAShape', {'refId': refId});
    return MAShape.withRefId(result);
  }
  
  Future<MAAnnotationView> asMAAnnotationView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAAnnotationView', {'refId': refId});
    return MAAnnotationView.withRefId(result);
  }
  
  Future<MATileOverlay> asMATileOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMATileOverlay', {'refId': refId});
    return MATileOverlay.withRefId(result);
  }
  
  Future<MATileOverlayPath> asMATileOverlayPath() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMATileOverlayPath', {'refId': refId});
    return MATileOverlayPath.withRefId(result);
  }
  
  Future<MACustomCalloutView> asMACustomCalloutView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMACustomCalloutView', {'refId': refId});
    return MACustomCalloutView.withRefId(result);
  }
  
  Future<MAOfflineItemCommonCity> asMAOfflineItemCommonCity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAOfflineItemCommonCity', {'refId': refId});
    return MAOfflineItemCommonCity.withRefId(result);
  }
  
  Future<MAOfflineMap> asMAOfflineMap() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAOfflineMap', {'refId': refId});
    return MAOfflineMap.withRefId(result);
  }
  
  Future<MACircleRenderer> asMACircleRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMACircleRenderer', {'refId': refId});
    return MACircleRenderer.withRefId(result);
  }
  
  Future<MAParticleOverlayRenderer> asMAParticleOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleOverlayRenderer', {'refId': refId});
    return MAParticleOverlayRenderer.withRefId(result);
  }
  
  Future<MACoordinateBounds> asMACoordinateBounds() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMACoordinateBounds', {'refId': refId});
    return MACoordinateBounds.withRefId(result);
  }
  
  Future<MACoordinateSpan> asMACoordinateSpan() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMACoordinateSpan', {'refId': refId});
    return MACoordinateSpan.withRefId(result);
  }
  
  Future<MACoordinateRegion> asMACoordinateRegion() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMACoordinateRegion', {'refId': refId});
    return MACoordinateRegion.withRefId(result);
  }
  
  Future<MAMapPoint> asMAMapPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMapPoint', {'refId': refId});
    return MAMapPoint.withRefId(result);
  }
  
  Future<MAMapSize> asMAMapSize() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMapSize', {'refId': refId});
    return MAMapSize.withRefId(result);
  }
  
  Future<MAMapRect> asMAMapRect() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMapRect', {'refId': refId});
    return MAMapRect.withRefId(result);
  }
  
  Future<MAParticleRandomVelocityGenerate> asMAParticleRandomVelocityGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleRandomVelocityGenerate', {'refId': refId});
    return MAParticleRandomVelocityGenerate.withRefId(result);
  }
  
  Future<MAParticleRandomColorGenerate> asMAParticleRandomColorGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleRandomColorGenerate', {'refId': refId});
    return MAParticleRandomColorGenerate.withRefId(result);
  }
  
  Future<MAParticleConstantRotationGenerate> asMAParticleConstantRotationGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleConstantRotationGenerate', {'refId': refId});
    return MAParticleConstantRotationGenerate.withRefId(result);
  }
  
  Future<MAParticleCurveSizeGenerate> asMAParticleCurveSizeGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleCurveSizeGenerate', {'refId': refId});
    return MAParticleCurveSizeGenerate.withRefId(result);
  }
  
  Future<MAParticleEmissionModule> asMAParticleEmissionModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleEmissionModule', {'refId': refId});
    return MAParticleEmissionModule.withRefId(result);
  }
  
  Future<MAParticleSinglePointShapeModule> asMAParticleSinglePointShapeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleSinglePointShapeModule', {'refId': refId});
    return MAParticleSinglePointShapeModule.withRefId(result);
  }
  
  Future<MAParticleRectShapeModule> asMAParticleRectShapeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleRectShapeModule', {'refId': refId});
    return MAParticleRectShapeModule.withRefId(result);
  }
  
  Future<MAParticleOverLifeModule> asMAParticleOverLifeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleOverLifeModule', {'refId': refId});
    return MAParticleOverLifeModule.withRefId(result);
  }
  
  Future<MAParticleOverlayOptions> asMAParticleOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleOverlayOptions', {'refId': refId});
    return MAParticleOverlayOptions.withRefId(result);
  }
  
  Future<MAParticleOverlayOptionsFactory> asMAParticleOverlayOptionsFactory() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAParticleOverlayOptionsFactory', {'refId': refId});
    return MAParticleOverlayOptionsFactory.withRefId(result);
  }
  
  Future<MAOverlayRenderer> asMAOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAOverlayRenderer', {'refId': refId});
    return MAOverlayRenderer.withRefId(result);
  }
  
  Future<MAUserLocation> asMAUserLocation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAUserLocation', {'refId': refId});
    return MAUserLocation.withRefId(result);
  }
  
  Future<MAMultiPointItem> asMAMultiPointItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMultiPointItem', {'refId': refId});
    return MAMultiPointItem.withRefId(result);
  }
  
  Future<MAMultiPointOverlay> asMAMultiPointOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMultiPointOverlay', {'refId': refId});
    return MAMultiPointOverlay.withRefId(result);
  }
  
  Future<MACustomBuildingOverlayOption> asMACustomBuildingOverlayOption() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMACustomBuildingOverlayOption', {'refId': refId});
    return MACustomBuildingOverlayOption.withRefId(result);
  }
  
  Future<MACustomBuildingOverlay> asMACustomBuildingOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMACustomBuildingOverlay', {'refId': refId});
    return MACustomBuildingOverlay.withRefId(result);
  }
  
  Future<MATracePoint> asMATracePoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMATracePoint', {'refId': refId});
    return MATracePoint.withRefId(result);
  }
  
  Future<MATraceLocation> asMATraceLocation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMATraceLocation', {'refId': refId});
    return MATraceLocation.withRefId(result);
  }
  
  Future<MAArc> asMAArc() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAArc', {'refId': refId});
    return MAArc.withRefId(result);
  }
  
  Future<MAUserLocationRepresentation> asMAUserLocationRepresentation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAUserLocationRepresentation', {'refId': refId});
    return MAUserLocationRepresentation.withRefId(result);
  }
  
  Future<MAMapView> asMAMapView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAMapView', {'refId': refId});
    return MAMapView.withRefId(result);
  }
  
  Future<MAOverlayPathRenderer> asMAOverlayPathRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAOverlayPathRenderer', {'refId': refId});
    return MAOverlayPathRenderer.withRefId(result);
  }
  
  Future<MAGroundOverlayRenderer> asMAGroundOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMAGroundOverlayRenderer', {'refId': refId});
    return MAGroundOverlayRenderer.withRefId(result);
  }
  
  Future<MACustomBuildingOverlayRenderer> asMACustomBuildingOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::asMACustomBuildingOverlayRenderer', {'refId': refId});
    return MACustomBuildingOverlayRenderer.withRefId(result);
  }
  
}