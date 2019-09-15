import 'package:flutter/services.dart';

import 'package:amap_base_flutter/amap_base_flutter.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class ObjectFactory_iOS {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  static Future<CLLocationCoordinate2D> createCLLocationCoordinate2D(double latitude, double longitude) async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createCLLocationCoordinate2D', {'latitude': latitude, 'longitude': longitude});
    return CLLocationCoordinate2D.withRefId(refId);
  }

  static Future<AMapURLSearch> createAMapURLSearch() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createAMapURLSearch');
    return AMapURLSearch.withRefId(refId);
  }
  
  static Future<AMapNaviConfig> createAMapNaviConfig() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createAMapNaviConfig');
    return AMapNaviConfig.withRefId(refId);
  }
  
  static Future<AMapRouteConfig> createAMapRouteConfig() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createAMapRouteConfig');
    return AMapRouteConfig.withRefId(refId);
  }
  
  static Future<AMapPOIConfig> createAMapPOIConfig() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createAMapPOIConfig');
    return AMapPOIConfig.withRefId(refId);
  }
  
  static Future<AMapServices> createAMapServices() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createAMapServices');
    return AMapServices.withRefId(refId);
  }
  
  static Future<MAOfflineCity> createMAOfflineCity() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAOfflineCity');
    return MAOfflineCity.withRefId(refId);
  }
  
  static Future<MAOfflineItemNationWide> createMAOfflineItemNationWide() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAOfflineItemNationWide');
    return MAOfflineItemNationWide.withRefId(refId);
  }
  
  static Future<MAMultiPoint> createMAMultiPoint() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMultiPoint');
    return MAMultiPoint.withRefId(refId);
  }
  
  static Future<MAGroundOverlay> createMAGroundOverlay() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAGroundOverlay');
    return MAGroundOverlay.withRefId(refId);
  }
  
  static Future<MAPolygonRenderer> createMAPolygonRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAPolygonRenderer');
    return MAPolygonRenderer.withRefId(refId);
  }
  
  static Future<MAPinAnnotationView> createMAPinAnnotationView() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAPinAnnotationView');
    return MAPinAnnotationView.withRefId(refId);
  }
  
  static Future<MAHeatMapNode> createMAHeatMapNode() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAHeatMapNode');
    return MAHeatMapNode.withRefId(refId);
  }
  
  static Future<MAHeatMapGradient> createMAHeatMapGradient() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAHeatMapGradient');
    return MAHeatMapGradient.withRefId(refId);
  }
  
  static Future<MAHeatMapTileOverlay> createMAHeatMapTileOverlay() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAHeatMapTileOverlay');
    return MAHeatMapTileOverlay.withRefId(refId);
  }
  
  static Future<MAMapStatus> createMAMapStatus() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMapStatus');
    return MAMapStatus.withRefId(refId);
  }
  
  static Future<MAPointAnnotation> createMAPointAnnotation() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAPointAnnotation');
    return MAPointAnnotation.withRefId(refId);
  }
  
  static Future<MACircle> createMACircle() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMACircle');
    return MACircle.withRefId(refId);
  }
  
  static Future<MAArcRenderer> createMAArcRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAArcRenderer');
    return MAArcRenderer.withRefId(refId);
  }
  
  static Future<MAMapCustomStyleOptions> createMAMapCustomStyleOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMapCustomStyleOptions');
    return MAMapCustomStyleOptions.withRefId(refId);
  }
  
  static Future<MAPolygon> createMAPolygon() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAPolygon');
    return MAPolygon.withRefId(refId);
  }
  
  static Future<MAParticleOverlay> createMAParticleOverlay() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleOverlay');
    return MAParticleOverlay.withRefId(refId);
  }
  
  static Future<MAPolyline> createMAPolyline() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAPolyline');
    return MAPolyline.withRefId(refId);
  }
  
  static Future<MAMultiColoredPolylineRenderer> createMAMultiColoredPolylineRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMultiColoredPolylineRenderer');
    return MAMultiColoredPolylineRenderer.withRefId(refId);
  }
  
  static Future<MAAnimatedAnnotation> createMAAnimatedAnnotation() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAAnimatedAnnotation');
    return MAAnimatedAnnotation.withRefId(refId);
  }
  
  static Future<MAMultiTexturePolylineRenderer> createMAMultiTexturePolylineRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMultiTexturePolylineRenderer');
    return MAMultiTexturePolylineRenderer.withRefId(refId);
  }
  
  static Future<MAOfflineProvince> createMAOfflineProvince() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAOfflineProvince');
    return MAOfflineProvince.withRefId(refId);
  }
  
  static Future<MATileOverlayRenderer> createMATileOverlayRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMATileOverlayRenderer');
    return MATileOverlayRenderer.withRefId(refId);
  }
  
  static Future<MAOfflineItem> createMAOfflineItem() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAOfflineItem');
    return MAOfflineItem.withRefId(refId);
  }
  
  static Future<MAGeodesicPolyline> createMAGeodesicPolyline() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAGeodesicPolyline');
    return MAGeodesicPolyline.withRefId(refId);
  }
  
  static Future<MATouchPoi> createMATouchPoi() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMATouchPoi');
    return MATouchPoi.withRefId(refId);
  }
  
  static Future<MAOfflineItemMunicipality> createMAOfflineItemMunicipality() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAOfflineItemMunicipality');
    return MAOfflineItemMunicipality.withRefId(refId);
  }
  
  static Future<MAMultiPolyline> createMAMultiPolyline() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMultiPolyline');
    return MAMultiPolyline.withRefId(refId);
  }
  
  static Future<MATraceManager> createMATraceManager() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMATraceManager');
    return MATraceManager.withRefId(refId);
  }
  
  static Future<MAMultiPointOverlayRenderer> createMAMultiPointOverlayRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMultiPointOverlayRenderer');
    return MAMultiPointOverlayRenderer.withRefId(refId);
  }
  
  static Future<MAIndoorFloorInfo> createMAIndoorFloorInfo() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAIndoorFloorInfo');
    return MAIndoorFloorInfo.withRefId(refId);
  }
  
  static Future<MAIndoorInfo> createMAIndoorInfo() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAIndoorInfo');
    return MAIndoorInfo.withRefId(refId);
  }
  
  static Future<MAPolylineRenderer> createMAPolylineRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAPolylineRenderer');
    return MAPolylineRenderer.withRefId(refId);
  }
  
  static Future<MAAnnotationMoveAnimation> createMAAnnotationMoveAnimation() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAAnnotationMoveAnimation');
    return MAAnnotationMoveAnimation.withRefId(refId);
  }
  
  static Future<MAShape> createMAShape() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAShape');
    return MAShape.withRefId(refId);
  }
  
  static Future<MAAnnotationView> createMAAnnotationView() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAAnnotationView');
    return MAAnnotationView.withRefId(refId);
  }
  
  static Future<MATileOverlay> createMATileOverlay() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMATileOverlay');
    return MATileOverlay.withRefId(refId);
  }
  
  static Future<MATileOverlayPath> createMATileOverlayPath() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMATileOverlayPath');
    return MATileOverlayPath.withRefId(refId);
  }
  
  static Future<MACustomCalloutView> createMACustomCalloutView() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMACustomCalloutView');
    return MACustomCalloutView.withRefId(refId);
  }
  
  static Future<MAOfflineItemCommonCity> createMAOfflineItemCommonCity() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAOfflineItemCommonCity');
    return MAOfflineItemCommonCity.withRefId(refId);
  }
  
  static Future<MAOfflineMap> createMAOfflineMap() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAOfflineMap');
    return MAOfflineMap.withRefId(refId);
  }
  
  static Future<MACircleRenderer> createMACircleRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMACircleRenderer');
    return MACircleRenderer.withRefId(refId);
  }
  
  static Future<MAParticleOverlayRenderer> createMAParticleOverlayRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleOverlayRenderer');
    return MAParticleOverlayRenderer.withRefId(refId);
  }
  
  static Future<MACoordinateBounds> createMACoordinateBounds() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMACoordinateBounds');
    return MACoordinateBounds.withRefId(refId);
  }
  
  static Future<MACoordinateSpan> createMACoordinateSpan() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMACoordinateSpan');
    return MACoordinateSpan.withRefId(refId);
  }
  
  static Future<MACoordinateRegion> createMACoordinateRegion() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMACoordinateRegion');
    return MACoordinateRegion.withRefId(refId);
  }
  
  static Future<MAMapPoint> createMAMapPoint() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMapPoint');
    return MAMapPoint.withRefId(refId);
  }
  
  static Future<MAMapSize> createMAMapSize() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMapSize');
    return MAMapSize.withRefId(refId);
  }
  
  static Future<MAMapRect> createMAMapRect() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMapRect');
    return MAMapRect.withRefId(refId);
  }
  
  static Future<MAParticleRandomVelocityGenerate> createMAParticleRandomVelocityGenerate() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleRandomVelocityGenerate');
    return MAParticleRandomVelocityGenerate.withRefId(refId);
  }
  
  static Future<MAParticleRandomColorGenerate> createMAParticleRandomColorGenerate() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleRandomColorGenerate');
    return MAParticleRandomColorGenerate.withRefId(refId);
  }
  
  static Future<MAParticleConstantRotationGenerate> createMAParticleConstantRotationGenerate() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleConstantRotationGenerate');
    return MAParticleConstantRotationGenerate.withRefId(refId);
  }
  
  static Future<MAParticleCurveSizeGenerate> createMAParticleCurveSizeGenerate() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleCurveSizeGenerate');
    return MAParticleCurveSizeGenerate.withRefId(refId);
  }
  
  static Future<MAParticleEmissionModule> createMAParticleEmissionModule() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleEmissionModule');
    return MAParticleEmissionModule.withRefId(refId);
  }
  
  static Future<MAParticleSinglePointShapeModule> createMAParticleSinglePointShapeModule() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleSinglePointShapeModule');
    return MAParticleSinglePointShapeModule.withRefId(refId);
  }
  
  static Future<MAParticleRectShapeModule> createMAParticleRectShapeModule() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleRectShapeModule');
    return MAParticleRectShapeModule.withRefId(refId);
  }
  
  static Future<MAParticleOverLifeModule> createMAParticleOverLifeModule() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleOverLifeModule');
    return MAParticleOverLifeModule.withRefId(refId);
  }
  
  static Future<MAParticleOverlayOptions> createMAParticleOverlayOptions() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleOverlayOptions');
    return MAParticleOverlayOptions.withRefId(refId);
  }
  
  static Future<MAParticleOverlayOptionsFactory> createMAParticleOverlayOptionsFactory() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAParticleOverlayOptionsFactory');
    return MAParticleOverlayOptionsFactory.withRefId(refId);
  }
  
  static Future<MAOverlayRenderer> createMAOverlayRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAOverlayRenderer');
    return MAOverlayRenderer.withRefId(refId);
  }
  
  static Future<MAUserLocation> createMAUserLocation() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAUserLocation');
    return MAUserLocation.withRefId(refId);
  }
  
  static Future<MAMultiPointItem> createMAMultiPointItem() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMultiPointItem');
    return MAMultiPointItem.withRefId(refId);
  }
  
  static Future<MAMultiPointOverlay> createMAMultiPointOverlay() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMultiPointOverlay');
    return MAMultiPointOverlay.withRefId(refId);
  }
  
  static Future<MACustomBuildingOverlayOption> createMACustomBuildingOverlayOption() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMACustomBuildingOverlayOption');
    return MACustomBuildingOverlayOption.withRefId(refId);
  }
  
  static Future<MACustomBuildingOverlay> createMACustomBuildingOverlay() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMACustomBuildingOverlay');
    return MACustomBuildingOverlay.withRefId(refId);
  }
  
  static Future<MATracePoint> createMATracePoint() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMATracePoint');
    return MATracePoint.withRefId(refId);
  }
  
  static Future<MATraceLocation> createMATraceLocation() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMATraceLocation');
    return MATraceLocation.withRefId(refId);
  }
  
  static Future<MAArc> createMAArc() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAArc');
    return MAArc.withRefId(refId);
  }
  
  static Future<MAUserLocationRepresentation> createMAUserLocationRepresentation() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAUserLocationRepresentation');
    return MAUserLocationRepresentation.withRefId(refId);
  }
  
  static Future<MAMapView> createMAMapView() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAMapView');
    return MAMapView.withRefId(refId);
  }
  
  static Future<MAOverlayPathRenderer> createMAOverlayPathRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAOverlayPathRenderer');
    return MAOverlayPathRenderer.withRefId(refId);
  }
  
  static Future<MAGroundOverlayRenderer> createMAGroundOverlayRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMAGroundOverlayRenderer');
    return MAGroundOverlayRenderer.withRefId(refId);
  }
  
  static Future<MACustomBuildingOverlayRenderer> createMACustomBuildingOverlayRenderer() async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createMACustomBuildingOverlayRenderer');
    return MACustomBuildingOverlayRenderer.withRefId(refId);
  }
  
}

class NSObject extends Ref_iOS {
  NSObject.withRefId(int refId) : super.withRefId(refId);
}

// 结构体
class CLLocationCoordinate2D extends Ref_iOS {
  CLLocationCoordinate2D.withRefId(int refId) : super.withRefId(refId);
}

class CLLocation extends Ref_iOS {
  CLLocation.withRefId(int refId) : super.withRefId(refId);
}

class CGRect extends Ref_iOS {
  CGRect.withRefId(int refId) : super.withRefId(refId);
}

class CGPoint extends Ref_iOS {
  CGPoint.withRefId(int refId) : super.withRefId(refId);
}

// 类
class CLLocationManager extends Ref_iOS {
  CLLocationManager.withRefId(int refId) : super.withRefId(refId);
}

class NSError extends Ref_iOS {
  NSError.withRefId(int refId) : super.withRefId(refId);
}

mixin NSCoding on Ref_iOS {}

mixin NSCopying on Ref_iOS {}

class UIView extends Ref_iOS {
  UIView.withRefId(int refId) : super.withRefId(refId);
}

class UIControl extends UIView {
  UIControl.withRefId(int refId) : super.withRefId(refId);
}
