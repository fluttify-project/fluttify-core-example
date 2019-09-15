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
      
          methodResult(ref.customView);
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
      methodChannelWithName:@"traceManager"
            binaryMessenger:[_registrar messenger]];

  // 暂不支持含有数组的方法
}

- (void)mapViewRequireLocationAuth : (CLLocationManager*)locationManager
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapViewRequireLocationAuth"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewRequireLocationAuth:CLLocationManager*" arguments:@{@"locationManager": @(locationManager.hash)}];
  
}

- (void)multiPointOverlayRenderer : (MAMultiPointOverlayRenderer*)renderer didItemTapped: (MAMultiPointItem*)item
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"multiPointOverlayRenderer"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"multiPointOverlayRenderer:MAMultiPointOverlayRenderer*:MAMultiPointItem*" arguments:@{@"renderer": @(renderer.hash), @"item": @(item.hash)}];
  
}

- (void)mapViewRegionChanged : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapViewRegionChanged"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewRegionChanged:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView regionWillChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView regionDidChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView mapWillMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapDidMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapWillZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapDidZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapViewWillStartLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapViewWillStartLoadingMap"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewWillStartLoadingMap:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidFinishLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapViewDidFinishLoadingMap"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewDidFinishLoadingMap:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidFailLoadingMap : (MAMapView*)mapView withError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapViewDidFailLoadingMap"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewDidFailLoadingMap:MAMapView*:NSError*" arguments:@{@"mapView": @(mapView.hash), @"error": @(error.hash)}];
  
}

- (MAAnnotationView*)mapView : (MAMapView*)mapView viewForAnnotation: (id<MAAnnotation>)annotation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  __block MAAnnotationView* _callbackResult = nil;
  [channel invokeMethod:@"mapView:MAMapView*:id<MAAnnotation>"
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
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView didSelectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didDeselectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapViewWillStartLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapViewWillStartLocatingUser"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewWillStartLocatingUser:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidStopLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapViewDidStopLocatingUser"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewDidStopLocatingUser:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didUpdateUserLocation: (MAUserLocation*)userLocation updatingLocation: (BOOL)updatingLocation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAUserLocation*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"userLocation": @(userLocation.hash), @"updatingLocation": @(updatingLocation)}];
  
}

- (void)mapView : (MAMapView*)mapView didFailToLocateUserWithError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:NSError*" arguments:@{@"mapView": @(mapView.hash), @"error": @(error.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view didChangeDragState: (MAAnnotationViewDragState)newState fromOldState: (MAAnnotationViewDragState)oldState
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*:MAAnnotationViewDragState:MAAnnotationViewDragState" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash), @"newState": @(newState), @"oldState": @(oldState)}];
  
}

- (MAOverlayRenderer*)mapView : (MAMapView*)mapView rendererForOverlay: (id<MAOverlay>)overlay
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  __block MAOverlayRenderer* _callbackResult = nil;
  [channel invokeMethod:@"mapView:MAMapView*:id<MAOverlay>"
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
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view calloutAccessoryControlTapped: (UIControl*)control
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*:UIControl*" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash), @"control": @(control.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didAnnotationViewCalloutTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didAnnotationViewTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didChangeUserTrackingMode: (MAUserTrackingMode)mode animated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAUserTrackingMode:BOOL" arguments:@{@"mapView": @(mapView.hash), @"mode": @(mode), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView didChangeOpenGLESDisabled: (BOOL)openGLESDisabled
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"openGLESDisabled": @(openGLESDisabled)}];
  
}

- (void)mapView : (MAMapView*)mapView didTouchPois: (NSArray*)pois
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView didSingleTappedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:CLLocationCoordinate2D" arguments:@{@"mapView": @(mapView.hash), @"coordinate": @([NSValue value:&coordinate withObjCType:@encode(CLLocationCoordinate2D)].hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didLongPressedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:CLLocationCoordinate2D" arguments:@{@"mapView": @(mapView.hash), @"coordinate": @([NSValue value:&coordinate withObjCType:@encode(CLLocationCoordinate2D)].hash)}];
  
}

- (void)mapInitComplete : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapInitComplete"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapInitComplete:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapShowed: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAIndoorInfo*" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapFloorIndexChanged: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAIndoorInfo*" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapHidden: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"mapView"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAIndoorInfo*" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)offlineDataWillReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"offlineDataWillReload"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"offlineDataWillReload:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)offlineDataDidReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"offlineDataDidReload"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"offlineDataDidReload:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}

//endregion

@end
