#import "MACustomCalloutViewFactory.h"
#import "AmapBaseFlutterPlugin.h"

typedef void (^Handler)(NSObject <FlutterPluginRegistrar> *, NSDictionary<NSString *, NSObject *> *, FlutterResult);

@implementation MACustomCalloutViewFactory {
  NSObject <FlutterPluginRegistrar> *_registrar;
}

- (instancetype)initWithRegistrar:(NSObject <FlutterPluginRegistrar> *)registrar {
  self = [super init];
  if (self) {
    _registrar = registrar;
  }

  return self;
}

- (NSObject <FlutterPlatformView> *)createWithFrame:(CGRect)frame viewIdentifier:(int64_t)viewId arguments:(id _Nullable)args {
  return [[MACustomCalloutViewPlatformView alloc] initWithViewId:viewId registrar:_registrar];
}

@end

@implementation MACustomCalloutViewPlatformView {
  NSObject <FlutterPluginRegistrar> *_registrar;
  NSInteger _viewId;
  NSDictionary<NSString *, Handler> *_handlerMap;
}

- (instancetype)initWithViewId:(NSInteger)viewId registrar:(NSObject <FlutterPluginRegistrar> *)registrar {
  self = [super init];
  if (self) {
    _viewId = viewId;
    _registrar = registrar;
  }

  return self;
}

- (UIView *)view {
  MACustomCalloutView *view = [[MACustomCalloutView alloc] init];
  REF_MAP[@(_viewId)] = view;

  //region handlers
  _handlerMap = @{
      @"MACustomCalloutView::get_customView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MACustomCalloutView * ref = (MACustomCalloutView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.customView.hash));
      },
      
  };
  //endregion

  //region method call handler
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"me.yohom/amap_base_flutter/MACustomCalloutView"
            binaryMessenger:[_registrar messenger]];

  [channel setMethodCallHandler:^(FlutterMethodCall *methodCall, FlutterResult methodResult) {
    NSDictionary<NSString *, id> *args = (NSDictionary<NSString *, id> *) [methodCall arguments];
    if (_handlerMap[methodCall.method] != nil) {
      _handlerMap[methodCall.method](_registrar, args, methodResult);
    } else {
      methodResult(FlutterMethodNotImplemented);
    }
  }];
  //endregion
  return view;
}

- (void)dealloc {
  [REF_MAP removeObjectForKey:@(_viewId)];
}


//region delegate
- (void)traceManager : (MATraceManager*)manager didTrace: (NSArray<CLLocation*>*)locations correct: (NSArray<MATracePoint*>*)tracePoints distance: (double)distance withError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MATraceDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  // 暂不支持含有数组的方法
}

- (void)mapViewRequireLocationAuth : (CLLocationManager*)locationManager
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MATraceDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MATraceDelegate::mapViewRequireLocationAuth" arguments:@{@"locationManager": @(locationManager.hash)}];
  
}

- (void)multiPointOverlayRenderer : (MAMultiPointOverlayRenderer*)renderer didItemTapped: (MAMultiPointItem*)item
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMultiPointOverlayRendererDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMultiPointOverlayRendererDelegate::multiPointOverlayRendererDidItemTapped" arguments:@{@"renderer": @(renderer.hash), @"item": @(item.hash)}];
  
}

- (void)mapViewRegionChanged : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionChanged" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView regionWillChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionWillChangeAnimated" arguments:@{@"mapView": @(mapView.hash), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView regionDidChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionDidChangeAnimated" arguments:@{@"mapView": @(mapView.hash), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView mapWillMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapWillMoveByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapDidMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapDidMoveByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapWillZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapWillZoomByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapDidZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapDidZoomByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapViewWillStartLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewWillStartLoadingMap" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidFinishLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFinishLoadingMap" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidFailLoadingMap : (MAMapView*)mapView withError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFailLoadingMapWithError" arguments:@{@"mapView": @(mapView.hash), @"error": @(error.hash)}];
  
}

- (MAAnnotationView*)mapView : (MAMapView*)mapView viewForAnnotation: (id<MAAnnotation>)annotation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  __block MAAnnotationView* _callbackResult = nil;
  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewViewForAnnotation"
              arguments:@{@"mapView": @(mapView.hash), @"annotation": @(annotation.hash)}
                 result:^(id result) {
                   NSInteger refId = (NSInteger) result;
                   _callbackResult = (MAAnnotationView*) REF_MAP[@(refId)];
                 }];
  
  while (_callbackResult == nil) {
    // _callbackResult有值前, 空转
  }
  
  
  
  return _callbackResult;
}

- (void)mapView : (MAMapView*)mapView didAddAnnotationViews: (NSArray*)views
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView didSelectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidSelectAnnotationView" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didDeselectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidDeselectAnnotationView" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapViewWillStartLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewWillStartLocatingUser" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidStopLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidStopLocatingUser" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didUpdateUserLocation: (MAUserLocation*)userLocation updatingLocation: (BOOL)updatingLocation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidUpdateUserLocationupdatingLocation" arguments:@{@"mapView": @(mapView.hash), @"userLocation": @(userLocation.hash), @"updatingLocation": @(updatingLocation)}];
  
}

- (void)mapView : (MAMapView*)mapView didFailToLocateUserWithError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFailToLocateUserWithError" arguments:@{@"mapView": @(mapView.hash), @"error": @(error.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view didChangeDragState: (MAAnnotationViewDragState)newState fromOldState: (MAAnnotationViewDragState)oldState
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewAnnotationViewdidChangeDragStatefromOldState" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash), @"newState": @(newState), @"oldState": @(oldState)}];
  
}

- (MAOverlayRenderer*)mapView : (MAMapView*)mapView rendererForOverlay: (id<MAOverlay>)overlay
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  __block MAOverlayRenderer* _callbackResult = nil;
  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRendererForOverlay"
              arguments:@{@"mapView": @(mapView.hash), @"overlay": @(overlay.hash)}
                 result:^(id result) {
                   NSInteger refId = (NSInteger) result;
                   _callbackResult = (MAOverlayRenderer*) REF_MAP[@(refId)];
                 }];
  
  while (_callbackResult == nil) {
    // _callbackResult有值前, 空转
  }
  
  
  
  return _callbackResult;
}

- (void)mapView : (MAMapView*)mapView didAddOverlayRenderers: (NSArray*)overlayRenderers
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view calloutAccessoryControlTapped: (UIControl*)control
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewAnnotationViewcalloutAccessoryControlTapped" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash), @"control": @(control.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didAnnotationViewCalloutTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidAnnotationViewCalloutTapped" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didAnnotationViewTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidAnnotationViewTapped" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didChangeUserTrackingMode: (MAUserTrackingMode)mode animated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidChangeUserTrackingModeanimated" arguments:@{@"mapView": @(mapView.hash), @"mode": @(mode), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView didChangeOpenGLESDisabled: (BOOL)openGLESDisabled
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidChangeOpenGLESDisabled" arguments:@{@"mapView": @(mapView.hash), @"openGLESDisabled": @(openGLESDisabled)}];
  
}

- (void)mapView : (MAMapView*)mapView didTouchPois: (NSArray*)pois
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView didSingleTappedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidSingleTappedAtCoordinate" arguments:@{@"mapView": @(mapView.hash), @"coordinate": @([NSValue value:&coordinate withObjCType:@encode(CLLocationCoordinate2D)].hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didLongPressedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidLongPressedAtCoordinate" arguments:@{@"mapView": @(mapView.hash), @"coordinate": @([NSValue value:&coordinate withObjCType:@encode(CLLocationCoordinate2D)].hash)}];
  
}

- (void)mapInitComplete : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapInitComplete" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapShowed: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapShowed" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapFloorIndexChanged: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapFloorIndexChanged" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapHidden: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapHidden" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)offlineDataWillReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::offlineDataWillReload" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)offlineDataDidReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"Callback::MAMapViewDelegate::offlineDataDidReload" arguments:@{@"mapView": @(mapView.hash)}];
  
}

//endregion

@end
