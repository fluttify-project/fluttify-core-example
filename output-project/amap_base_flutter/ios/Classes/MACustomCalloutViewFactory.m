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
  HEAP[@(_viewId)] = view;

  //region handlers
  _handlerMap = @{
      @"MACustomCalloutView::get_customView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MACustomCalloutView::get_customView");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MACustomCalloutView* ref = (MACustomCalloutView*) HEAP[@(refId)];
      
          // 开始调用
          UIView* result = ref.customView;
      
      
      
          // 返回值: 引用
          HEAP[@(result.hash)] = result;
          methodResult(@(result.hash));
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
  [HEAP removeObjectForKey:@(_viewId)];
}


//region delegate
- (void)traceManager : (MATraceManager*)manager didTrace: (NSArray<CLLocation*>*)locations correct: (NSArray<MATracePoint*>*)tracePoints distance: (double)distance withError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MATraceDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MATraceDelegate::traceManagerDidTracecorrectdistancewithError");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmanager = @(manager.hash);
  HEAP[argmanager] = manager;
  // 列表回调参数
  NSMutableArray<NSNumber*>* arglocations = [NSMutableArray arrayWithCapacity:locations.count];
  for (int i = 0; i < locations.count; i++) {
      arglocations[i] = @(locations.hash);
      HEAP[@(locations.hash)] = locations;
  }
  // 列表回调参数
  NSMutableArray<NSNumber*>* argtracePoints = [NSMutableArray arrayWithCapacity:tracePoints.count];
  for (int i = 0; i < tracePoints.count; i++) {
      argtracePoints[i] = @(tracePoints.hash);
      HEAP[@(tracePoints.hash)] = tracePoints;
  }
  // jsonable回调参数
  NSNumber* argdistance = @(distance);
  // 引用回调参数
  NSNumber* argerror = @(error.hash);
  HEAP[argerror] = error;

  [channel invokeMethod:@"Callback::MATraceDelegate::traceManagerDidTracecorrectdistancewithError" arguments:@{@"manager": argmanager, @"locations": arglocations, @"tracePoints": argtracePoints, @"distance": argdistance, @"error": argerror}];
  
}

- (void)mapViewRequireLocationAuth : (CLLocationManager*)locationManager
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MATraceDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MATraceDelegate::mapViewRequireLocationAuth");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* arglocationManager = @(locationManager.hash);
  HEAP[arglocationManager] = locationManager;

  [channel invokeMethod:@"Callback::MATraceDelegate::mapViewRequireLocationAuth" arguments:@{@"locationManager": arglocationManager}];
  
}

- (void)multiPointOverlayRenderer : (MAMultiPointOverlayRenderer*)renderer didItemTapped: (MAMultiPointItem*)item
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMultiPointOverlayRendererDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMultiPointOverlayRendererDelegate::multiPointOverlayRendererDidItemTapped");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argrenderer = @(renderer.hash);
  HEAP[argrenderer] = renderer;
  // 引用回调参数
  NSNumber* argitem = @(item.hash);
  HEAP[argitem] = item;

  [channel invokeMethod:@"Callback::MAMultiPointOverlayRendererDelegate::multiPointOverlayRendererDidItemTapped" arguments:@{@"renderer": argrenderer, @"item": argitem}];
  
}

- (void)mapViewRegionChanged : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewRegionChanged");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionChanged" arguments:@{@"mapView": argmapView}];
  
}

- (void)mapView : (MAMapView*)mapView regionWillChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewRegionWillChangeAnimated");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // jsonable回调参数
  NSNumber* arganimated = @(animated);

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionWillChangeAnimated" arguments:@{@"mapView": argmapView, @"animated": arganimated}];
  
}

- (void)mapView : (MAMapView*)mapView regionDidChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewRegionDidChangeAnimated");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // jsonable回调参数
  NSNumber* arganimated = @(animated);

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionDidChangeAnimated" arguments:@{@"mapView": argmapView, @"animated": arganimated}];
  
}

- (void)mapView : (MAMapView*)mapView mapWillMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewMapWillMoveByUser");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // jsonable回调参数
  NSNumber* argwasUserAction = @(wasUserAction);

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapWillMoveByUser" arguments:@{@"mapView": argmapView, @"wasUserAction": argwasUserAction}];
  
}

- (void)mapView : (MAMapView*)mapView mapDidMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewMapDidMoveByUser");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // jsonable回调参数
  NSNumber* argwasUserAction = @(wasUserAction);

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapDidMoveByUser" arguments:@{@"mapView": argmapView, @"wasUserAction": argwasUserAction}];
  
}

- (void)mapView : (MAMapView*)mapView mapWillZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewMapWillZoomByUser");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // jsonable回调参数
  NSNumber* argwasUserAction = @(wasUserAction);

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapWillZoomByUser" arguments:@{@"mapView": argmapView, @"wasUserAction": argwasUserAction}];
  
}

- (void)mapView : (MAMapView*)mapView mapDidZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewMapDidZoomByUser");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // jsonable回调参数
  NSNumber* argwasUserAction = @(wasUserAction);

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapDidZoomByUser" arguments:@{@"mapView": argmapView, @"wasUserAction": argwasUserAction}];
  
}

- (void)mapViewWillStartLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewWillStartLoadingMap");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewWillStartLoadingMap" arguments:@{@"mapView": argmapView}];
  
}

- (void)mapViewDidFinishLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidFinishLoadingMap");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFinishLoadingMap" arguments:@{@"mapView": argmapView}];
  
}

- (void)mapViewDidFailLoadingMap : (MAMapView*)mapView withError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidFailLoadingMapWithError");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argerror = @(error.hash);
  HEAP[argerror] = error;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFailLoadingMapWithError" arguments:@{@"mapView": argmapView, @"error": argerror}];
  
}

- (MAAnnotationView*)mapView : (MAMapView*)mapView viewForAnnotation: (id<MAAnnotation>)annotation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewViewForAnnotation");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argannotation = @(annotation.hash);
  HEAP[argannotation] = annotation;

  // __block #__callback_result_type__# _callbackResult = nil;
  // [channel invokeMethod:@"#__callback_method__#"
  //             arguments:@{#__callback_args__#}
  //                result:^(id result) {
  //                  #__raw_callback_result__#
  //                }];
  //
  // while (_callbackResult == nil) {
  //   // _callbackResult有值前, 空转
  // }
  //
  // #__struct_value__#
  //
  // return #__callback_result__#;
  
  // 由于flutter无法同步调用method channel, 所以暂不支持有返回值的回调方法
  // 相关issue https://github.com/flutter/flutter/issues/28310
  NSLog(@"暂不支持有返回值的回调方法");
  return nil;
}

- (void)mapView : (MAMapView*)mapView didAddAnnotationViews: (NSArray*)views
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidAddAnnotationViews");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 列表回调参数
  NSMutableArray<NSNumber*>* argviews = [NSMutableArray arrayWithCapacity:views.count];
  for (int i = 0; i < views.count; i++) {
      argviews[i] = @(views.hash);
      HEAP[@(views.hash)] = views;
  }

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView didSelectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidSelectAnnotationView");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argview = @(view.hash);
  HEAP[argview] = view;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidSelectAnnotationView" arguments:@{@"mapView": argmapView, @"view": argview}];
  
}

- (void)mapView : (MAMapView*)mapView didDeselectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidDeselectAnnotationView");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argview = @(view.hash);
  HEAP[argview] = view;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidDeselectAnnotationView" arguments:@{@"mapView": argmapView, @"view": argview}];
  
}

- (void)mapViewWillStartLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewWillStartLocatingUser");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewWillStartLocatingUser" arguments:@{@"mapView": argmapView}];
  
}

- (void)mapViewDidStopLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidStopLocatingUser");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidStopLocatingUser" arguments:@{@"mapView": argmapView}];
  
}

- (void)mapView : (MAMapView*)mapView didUpdateUserLocation: (MAUserLocation*)userLocation updatingLocation: (BOOL)updatingLocation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidUpdateUserLocationupdatingLocation");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* arguserLocation = @(userLocation.hash);
  HEAP[arguserLocation] = userLocation;
  // jsonable回调参数
  NSNumber* argupdatingLocation = @(updatingLocation);

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidUpdateUserLocationupdatingLocation" arguments:@{@"mapView": argmapView, @"userLocation": arguserLocation, @"updatingLocation": argupdatingLocation}];
  
}

- (void)mapView : (MAMapView*)mapView didFailToLocateUserWithError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidFailToLocateUserWithError");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argerror = @(error.hash);
  HEAP[argerror] = error;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFailToLocateUserWithError" arguments:@{@"mapView": argmapView, @"error": argerror}];
  
}

- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view didChangeDragState: (MAAnnotationViewDragState)newState fromOldState: (MAAnnotationViewDragState)oldState
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewAnnotationViewdidChangeDragStatefromOldState");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argview = @(view.hash);
  HEAP[argview] = view;
  NSNumber* argnewState = @((NSInteger) newState);
  NSNumber* argoldState = @((NSInteger) oldState);

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewAnnotationViewdidChangeDragStatefromOldState" arguments:@{@"mapView": argmapView, @"view": argview, @"newState": argnewState, @"oldState": argoldState}];
  
}

- (MAOverlayRenderer*)mapView : (MAMapView*)mapView rendererForOverlay: (id<MAOverlay>)overlay
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewRendererForOverlay");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argoverlay = @(overlay.hash);
  HEAP[argoverlay] = overlay;

  // __block #__callback_result_type__# _callbackResult = nil;
  // [channel invokeMethod:@"#__callback_method__#"
  //             arguments:@{#__callback_args__#}
  //                result:^(id result) {
  //                  #__raw_callback_result__#
  //                }];
  //
  // while (_callbackResult == nil) {
  //   // _callbackResult有值前, 空转
  // }
  //
  // #__struct_value__#
  //
  // return #__callback_result__#;
  
  // 由于flutter无法同步调用method channel, 所以暂不支持有返回值的回调方法
  // 相关issue https://github.com/flutter/flutter/issues/28310
  NSLog(@"暂不支持有返回值的回调方法");
  return nil;
}

- (void)mapView : (MAMapView*)mapView didAddOverlayRenderers: (NSArray*)overlayRenderers
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidAddOverlayRenderers");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 列表回调参数
  NSMutableArray<NSNumber*>* argoverlayRenderers = [NSMutableArray arrayWithCapacity:overlayRenderers.count];
  for (int i = 0; i < overlayRenderers.count; i++) {
      argoverlayRenderers[i] = @(overlayRenderers.hash);
      HEAP[@(overlayRenderers.hash)] = overlayRenderers;
  }

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view calloutAccessoryControlTapped: (UIControl*)control
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewAnnotationViewcalloutAccessoryControlTapped");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argview = @(view.hash);
  HEAP[argview] = view;
  // 引用回调参数
  NSNumber* argcontrol = @(control.hash);
  HEAP[argcontrol] = control;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewAnnotationViewcalloutAccessoryControlTapped" arguments:@{@"mapView": argmapView, @"view": argview, @"control": argcontrol}];
  
}

- (void)mapView : (MAMapView*)mapView didAnnotationViewCalloutTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidAnnotationViewCalloutTapped");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argview = @(view.hash);
  HEAP[argview] = view;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidAnnotationViewCalloutTapped" arguments:@{@"mapView": argmapView, @"view": argview}];
  
}

- (void)mapView : (MAMapView*)mapView didAnnotationViewTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidAnnotationViewTapped");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argview = @(view.hash);
  HEAP[argview] = view;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidAnnotationViewTapped" arguments:@{@"mapView": argmapView, @"view": argview}];
  
}

- (void)mapView : (MAMapView*)mapView didChangeUserTrackingMode: (MAUserTrackingMode)mode animated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidChangeUserTrackingModeanimated");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  NSNumber* argmode = @((NSInteger) mode);
  // jsonable回调参数
  NSNumber* arganimated = @(animated);

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidChangeUserTrackingModeanimated" arguments:@{@"mapView": argmapView, @"mode": argmode, @"animated": arganimated}];
  
}

- (void)mapView : (MAMapView*)mapView didChangeOpenGLESDisabled: (BOOL)openGLESDisabled
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidChangeOpenGLESDisabled");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // jsonable回调参数
  NSNumber* argopenGLESDisabled = @(openGLESDisabled);

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidChangeOpenGLESDisabled" arguments:@{@"mapView": argmapView, @"openGLESDisabled": argopenGLESDisabled}];
  
}

- (void)mapView : (MAMapView*)mapView didTouchPois: (NSArray*)pois
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidTouchPois");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 列表回调参数
  NSMutableArray<NSNumber*>* argpois = [NSMutableArray arrayWithCapacity:pois.count];
  for (int i = 0; i < pois.count; i++) {
      argpois[i] = @(pois.hash);
      HEAP[@(pois.hash)] = pois;
  }

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView didSingleTappedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidSingleTappedAtCoordinate");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 结构体回调参数
  NSValue* coordinateValue = [NSValue value:&coordinate withObjCType:@encode(CLLocationCoordinate2D)];
  NSNumber* argcoordinate = @(coordinateValue.hash);
  HEAP[argcoordinate] = coordinateValue;
  

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidSingleTappedAtCoordinate" arguments:@{@"mapView": argmapView, @"coordinate": argcoordinate}];
  
}

- (void)mapView : (MAMapView*)mapView didLongPressedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidLongPressedAtCoordinate");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 结构体回调参数
  NSValue* coordinateValue = [NSValue value:&coordinate withObjCType:@encode(CLLocationCoordinate2D)];
  NSNumber* argcoordinate = @(coordinateValue.hash);
  HEAP[argcoordinate] = coordinateValue;
  

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidLongPressedAtCoordinate" arguments:@{@"mapView": argmapView, @"coordinate": argcoordinate}];
  
}

- (void)mapInitComplete : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapInitComplete");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapInitComplete" arguments:@{@"mapView": argmapView}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapShowed: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidIndoorMapShowed");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argindoorInfo = @(indoorInfo.hash);
  HEAP[argindoorInfo] = indoorInfo;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapShowed" arguments:@{@"mapView": argmapView, @"indoorInfo": argindoorInfo}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapFloorIndexChanged: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidIndoorMapFloorIndexChanged");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argindoorInfo = @(indoorInfo.hash);
  HEAP[argindoorInfo] = indoorInfo;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapFloorIndexChanged" arguments:@{@"mapView": argmapView, @"indoorInfo": argindoorInfo}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapHidden: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidIndoorMapHidden");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;
  // 引用回调参数
  NSNumber* argindoorInfo = @(indoorInfo.hash);
  HEAP[argindoorInfo] = indoorInfo;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapHidden" arguments:@{@"mapView": argmapView, @"indoorInfo": argindoorInfo}];
  
}

- (void)offlineDataWillReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::offlineDataWillReload");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::offlineDataWillReload" arguments:@{@"mapView": argmapView}];
  
}

- (void)offlineDataDidReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::offlineDataDidReload");

  // 构造可以直接传输的参数
  // 引用回调参数
  NSNumber* argmapView = @(mapView.hash);
  HEAP[argmapView] = mapView;

  [channel invokeMethod:@"Callback::MAMapViewDelegate::offlineDataDidReload" arguments:@{@"mapView": argmapView}];
  
}

//endregion

@end
