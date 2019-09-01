import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class Ref_iOS {
  Ref_iOS(this.refId);

  final int refId;

  Future<AMapURLSearch> castAMapURLSearch() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castAMapURLSearch', {'refId': refId});
    return AMapURLSearch.withRefId(result);
  }
  
  Future<AMapNaviConfig> castAMapNaviConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castAMapNaviConfig', {'refId': refId});
    return AMapNaviConfig.withRefId(result);
  }
  
  Future<AMapRouteConfig> castAMapRouteConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castAMapRouteConfig', {'refId': refId});
    return AMapRouteConfig.withRefId(result);
  }
  
  Future<AMapPOIConfig> castAMapPOIConfig() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castAMapPOIConfig', {'refId': refId});
    return AMapPOIConfig.withRefId(result);
  }
  
  Future<AMapServices> castAMapServices() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castAMapServices', {'refId': refId});
    return AMapServices.withRefId(result);
  }
  
  Future<MAOfflineCity> castMAOfflineCity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAOfflineCity', {'refId': refId});
    return MAOfflineCity.withRefId(result);
  }
  
  Future<MAOfflineItemNationWide> castMAOfflineItemNationWide() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAOfflineItemNationWide', {'refId': refId});
    return MAOfflineItemNationWide.withRefId(result);
  }
  
  Future<MAMultiPoint> castMAMultiPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMultiPoint', {'refId': refId});
    return MAMultiPoint.withRefId(result);
  }
  
  Future<MAGroundOverlay> castMAGroundOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAGroundOverlay', {'refId': refId});
    return MAGroundOverlay.withRefId(result);
  }
  
  Future<MAPolygonRenderer> castMAPolygonRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAPolygonRenderer', {'refId': refId});
    return MAPolygonRenderer.withRefId(result);
  }
  
  Future<MAPinAnnotationView> castMAPinAnnotationView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAPinAnnotationView', {'refId': refId});
    return MAPinAnnotationView.withRefId(result);
  }
  
  Future<MAHeatMapNode> castMAHeatMapNode() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAHeatMapNode', {'refId': refId});
    return MAHeatMapNode.withRefId(result);
  }
  
  Future<MAHeatMapGradient> castMAHeatMapGradient() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAHeatMapGradient', {'refId': refId});
    return MAHeatMapGradient.withRefId(result);
  }
  
  Future<MAHeatMapTileOverlay> castMAHeatMapTileOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAHeatMapTileOverlay', {'refId': refId});
    return MAHeatMapTileOverlay.withRefId(result);
  }
  
  Future<MAMapStatus> castMAMapStatus() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMapStatus', {'refId': refId});
    return MAMapStatus.withRefId(result);
  }
  
  Future<MAPointAnnotation> castMAPointAnnotation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAPointAnnotation', {'refId': refId});
    return MAPointAnnotation.withRefId(result);
  }
  
  Future<MACircle> castMACircle() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMACircle', {'refId': refId});
    return MACircle.withRefId(result);
  }
  
  Future<MAArcRenderer> castMAArcRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAArcRenderer', {'refId': refId});
    return MAArcRenderer.withRefId(result);
  }
  
  Future<MAMapCustomStyleOptions> castMAMapCustomStyleOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMapCustomStyleOptions', {'refId': refId});
    return MAMapCustomStyleOptions.withRefId(result);
  }
  
  Future<MAPolygon> castMAPolygon() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAPolygon', {'refId': refId});
    return MAPolygon.withRefId(result);
  }
  
  Future<MAParticleOverlay> castMAParticleOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleOverlay', {'refId': refId});
    return MAParticleOverlay.withRefId(result);
  }
  
  Future<MAPolyline> castMAPolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAPolyline', {'refId': refId});
    return MAPolyline.withRefId(result);
  }
  
  Future<MAMultiColoredPolylineRenderer> castMAMultiColoredPolylineRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMultiColoredPolylineRenderer', {'refId': refId});
    return MAMultiColoredPolylineRenderer.withRefId(result);
  }
  
  Future<MAAnimatedAnnotation> castMAAnimatedAnnotation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAAnimatedAnnotation', {'refId': refId});
    return MAAnimatedAnnotation.withRefId(result);
  }
  
  Future<MAMultiTexturePolylineRenderer> castMAMultiTexturePolylineRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMultiTexturePolylineRenderer', {'refId': refId});
    return MAMultiTexturePolylineRenderer.withRefId(result);
  }
  
  Future<MAOfflineProvince> castMAOfflineProvince() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAOfflineProvince', {'refId': refId});
    return MAOfflineProvince.withRefId(result);
  }
  
  Future<MATileOverlayRenderer> castMATileOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMATileOverlayRenderer', {'refId': refId});
    return MATileOverlayRenderer.withRefId(result);
  }
  
  Future<MAOfflineItem> castMAOfflineItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAOfflineItem', {'refId': refId});
    return MAOfflineItem.withRefId(result);
  }
  
  Future<MAGeodesicPolyline> castMAGeodesicPolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAGeodesicPolyline', {'refId': refId});
    return MAGeodesicPolyline.withRefId(result);
  }
  
  Future<MATouchPoi> castMATouchPoi() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMATouchPoi', {'refId': refId});
    return MATouchPoi.withRefId(result);
  }
  
  Future<MAOfflineItemMunicipality> castMAOfflineItemMunicipality() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAOfflineItemMunicipality', {'refId': refId});
    return MAOfflineItemMunicipality.withRefId(result);
  }
  
  Future<MAMultiPolyline> castMAMultiPolyline() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMultiPolyline', {'refId': refId});
    return MAMultiPolyline.withRefId(result);
  }
  
  Future<MATraceManager> castMATraceManager() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMATraceManager', {'refId': refId});
    return MATraceManager.withRefId(result);
  }
  
  Future<MAMultiPointOverlayRenderer> castMAMultiPointOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMultiPointOverlayRenderer', {'refId': refId});
    return MAMultiPointOverlayRenderer.withRefId(result);
  }
  
  Future<MAIndoorFloorInfo> castMAIndoorFloorInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAIndoorFloorInfo', {'refId': refId});
    return MAIndoorFloorInfo.withRefId(result);
  }
  
  Future<MAIndoorInfo> castMAIndoorInfo() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAIndoorInfo', {'refId': refId});
    return MAIndoorInfo.withRefId(result);
  }
  
  Future<MAPolylineRenderer> castMAPolylineRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAPolylineRenderer', {'refId': refId});
    return MAPolylineRenderer.withRefId(result);
  }
  
  Future<MAAnnotationMoveAnimation> castMAAnnotationMoveAnimation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAAnnotationMoveAnimation', {'refId': refId});
    return MAAnnotationMoveAnimation.withRefId(result);
  }
  
  Future<MAShape> castMAShape() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAShape', {'refId': refId});
    return MAShape.withRefId(result);
  }
  
  Future<MAAnnotationView> castMAAnnotationView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAAnnotationView', {'refId': refId});
    return MAAnnotationView.withRefId(result);
  }
  
  Future<MATileOverlay> castMATileOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMATileOverlay', {'refId': refId});
    return MATileOverlay.withRefId(result);
  }
  
  Future<MATileOverlayPath> castMATileOverlayPath() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMATileOverlayPath', {'refId': refId});
    return MATileOverlayPath.withRefId(result);
  }
  
  Future<MACustomCalloutView> castMACustomCalloutView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMACustomCalloutView', {'refId': refId});
    return MACustomCalloutView.withRefId(result);
  }
  
  Future<MAOfflineItemCommonCity> castMAOfflineItemCommonCity() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAOfflineItemCommonCity', {'refId': refId});
    return MAOfflineItemCommonCity.withRefId(result);
  }
  
  Future<MAOfflineMap> castMAOfflineMap() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAOfflineMap', {'refId': refId});
    return MAOfflineMap.withRefId(result);
  }
  
  Future<MACircleRenderer> castMACircleRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMACircleRenderer', {'refId': refId});
    return MACircleRenderer.withRefId(result);
  }
  
  Future<MAParticleOverlayRenderer> castMAParticleOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleOverlayRenderer', {'refId': refId});
    return MAParticleOverlayRenderer.withRefId(result);
  }
  
  Future<MACoordinateBounds> castMACoordinateBounds() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMACoordinateBounds', {'refId': refId});
    return MACoordinateBounds.withRefId(result);
  }
  
  Future<MACoordinateSpan> castMACoordinateSpan() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMACoordinateSpan', {'refId': refId});
    return MACoordinateSpan.withRefId(result);
  }
  
  Future<MACoordinateRegion> castMACoordinateRegion() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMACoordinateRegion', {'refId': refId});
    return MACoordinateRegion.withRefId(result);
  }
  
  Future<MAMapPoint> castMAMapPoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMapPoint', {'refId': refId});
    return MAMapPoint.withRefId(result);
  }
  
  Future<MAMapSize> castMAMapSize() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMapSize', {'refId': refId});
    return MAMapSize.withRefId(result);
  }
  
  Future<MAMapRect> castMAMapRect() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMapRect', {'refId': refId});
    return MAMapRect.withRefId(result);
  }
  
  Future<MAParticleRandomVelocityGenerate> castMAParticleRandomVelocityGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleRandomVelocityGenerate', {'refId': refId});
    return MAParticleRandomVelocityGenerate.withRefId(result);
  }
  
  Future<MAParticleRandomColorGenerate> castMAParticleRandomColorGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleRandomColorGenerate', {'refId': refId});
    return MAParticleRandomColorGenerate.withRefId(result);
  }
  
  Future<MAParticleConstantRotationGenerate> castMAParticleConstantRotationGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleConstantRotationGenerate', {'refId': refId});
    return MAParticleConstantRotationGenerate.withRefId(result);
  }
  
  Future<MAParticleCurveSizeGenerate> castMAParticleCurveSizeGenerate() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleCurveSizeGenerate', {'refId': refId});
    return MAParticleCurveSizeGenerate.withRefId(result);
  }
  
  Future<MAParticleEmissionModule> castMAParticleEmissionModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleEmissionModule', {'refId': refId});
    return MAParticleEmissionModule.withRefId(result);
  }
  
  Future<MAParticleSinglePointShapeModule> castMAParticleSinglePointShapeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleSinglePointShapeModule', {'refId': refId});
    return MAParticleSinglePointShapeModule.withRefId(result);
  }
  
  Future<MAParticleRectShapeModule> castMAParticleRectShapeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleRectShapeModule', {'refId': refId});
    return MAParticleRectShapeModule.withRefId(result);
  }
  
  Future<MAParticleOverLifeModule> castMAParticleOverLifeModule() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleOverLifeModule', {'refId': refId});
    return MAParticleOverLifeModule.withRefId(result);
  }
  
  Future<MAParticleOverlayOptions> castMAParticleOverlayOptions() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleOverlayOptions', {'refId': refId});
    return MAParticleOverlayOptions.withRefId(result);
  }
  
  Future<MAParticleOverlayOptionsFactory> castMAParticleOverlayOptionsFactory() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAParticleOverlayOptionsFactory', {'refId': refId});
    return MAParticleOverlayOptionsFactory.withRefId(result);
  }
  
  Future<MAOverlayRenderer> castMAOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAOverlayRenderer', {'refId': refId});
    return MAOverlayRenderer.withRefId(result);
  }
  
  Future<MAUserLocation> castMAUserLocation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAUserLocation', {'refId': refId});
    return MAUserLocation.withRefId(result);
  }
  
  Future<MAMultiPointItem> castMAMultiPointItem() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMultiPointItem', {'refId': refId});
    return MAMultiPointItem.withRefId(result);
  }
  
  Future<MAMultiPointOverlay> castMAMultiPointOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMultiPointOverlay', {'refId': refId});
    return MAMultiPointOverlay.withRefId(result);
  }
  
  Future<MACustomBuildingOverlayOption> castMACustomBuildingOverlayOption() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMACustomBuildingOverlayOption', {'refId': refId});
    return MACustomBuildingOverlayOption.withRefId(result);
  }
  
  Future<MACustomBuildingOverlay> castMACustomBuildingOverlay() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMACustomBuildingOverlay', {'refId': refId});
    return MACustomBuildingOverlay.withRefId(result);
  }
  
  Future<MATracePoint> castMATracePoint() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMATracePoint', {'refId': refId});
    return MATracePoint.withRefId(result);
  }
  
  Future<MATraceLocation> castMATraceLocation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMATraceLocation', {'refId': refId});
    return MATraceLocation.withRefId(result);
  }
  
  Future<MAArc> castMAArc() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAArc', {'refId': refId});
    return MAArc.withRefId(result);
  }
  
  Future<MAUserLocationRepresentation> castMAUserLocationRepresentation() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAUserLocationRepresentation', {'refId': refId});
    return MAUserLocationRepresentation.withRefId(result);
  }
  
  Future<MAMapView> castMAMapView() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAMapView', {'refId': refId});
    return MAMapView.withRefId(result);
  }
  
  Future<MAOverlayPathRenderer> castMAOverlayPathRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAOverlayPathRenderer', {'refId': refId});
    return MAOverlayPathRenderer.withRefId(result);
  }
  
  Future<MAGroundOverlayRenderer> castMAGroundOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMAGroundOverlayRenderer', {'refId': refId});
    return MAGroundOverlayRenderer.withRefId(result);
  }
  
  Future<MACustomBuildingOverlayRenderer> castMACustomBuildingOverlayRenderer() async {
    final result = await MethodChannel('me.yohom/amap_base_flutter').invokeMethod('RefClass::castMACustomBuildingOverlayRenderer', {'refId': refId});
    return MACustomBuildingOverlayRenderer.withRefId(result);
  }
  

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
  
}