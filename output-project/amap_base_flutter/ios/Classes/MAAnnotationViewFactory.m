#import "MAAnnotationViewFactory.h"
#import "AmapBaseFlutterPlugin.h"

typedef void (^Handler)(NSObject <FlutterPluginRegistrar> *, NSDictionary<NSString *, NSObject *> *, FlutterResult);

@implementation MAAnnotationViewFactory {
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
  return [[MAAnnotationViewPlatformView alloc] initWithViewId:viewId registrar:_registrar];
}

@end

@implementation MAAnnotationViewPlatformView {
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
  MAAnnotationView *view = [[MAAnnotationView alloc] init];
  REF_MAP[@(_viewId)] = view;

  //region handlers
  _handlerMap = @{
      @"MAAnnotationView::setSelected": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          BOOL selected = [args[@"selected"] boolValue];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAAnnotationView@%@::setSelected(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setSelected : selected animated: animated];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAAnnotationView::prepareForReuse": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
      
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAAnnotationView@%@::prepareForReuse(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref prepareForReuse ];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAAnnotationView::setDragState": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 枚举参数
          MAAnnotationViewDragState newDragState = (MAAnnotationViewDragState) [args[@"newDragState"] integerValue];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAAnnotationView@%@::setDragState(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setDragState : newDragState animated: animated];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAAnnotationView::get_reuseIdentifier": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.reuseIdentifier.hash));
      },
      
      @"MAAnnotationView::get_zIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.zIndex));
      },
      
      @"MAAnnotationView::get_annotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.annotation.hash));
      },
      
      @"MAAnnotationView::get_customCalloutView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.customCalloutView.hash));
      },
      
      @"MAAnnotationView::get_centerOffset": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAAnnotationView::get_calloutOffset": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAAnnotationView::get_isEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.isEnabled));
      },
      
      @"MAAnnotationView::get_isHighlighted": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.isHighlighted));
      },
      
      @"MAAnnotationView::get_isSelected": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.isSelected));
      },
      
      @"MAAnnotationView::get_canShowCallout": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.canShowCallout));
      },
      
      @"MAAnnotationView::get_leftCalloutAccessoryView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.leftCalloutAccessoryView.hash));
      },
      
      @"MAAnnotationView::get_rightCalloutAccessoryView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.rightCalloutAccessoryView.hash));
      },
      
      @"MAAnnotationView::get_isDraggable": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.isDraggable));
      },
      
      @"MAAnnotationView::get_dragState": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          methodResult(@(ref.dragState));
      },
      
      @"MAAnnotationView::set_zIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          NSInteger zIndex = [args[@"zIndex"] integerValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.zIndex = zIndex;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_annotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          id<MAAnnotation> annotation = (id<MAAnnotation>) REF_MAP[@([args[@"annotation"] integerValue])];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.annotation = annotation;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_customCalloutView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          MACustomCalloutView * customCalloutView = (MACustomCalloutView *) REF_MAP[@([args[@"customCalloutView"] integerValue])];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.customCalloutView = customCalloutView;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_centerOffset": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* centerOffsetValue = (NSValue*) REF_MAP[@([args[@"centerOffset"] integerValue])];
          CGPoint centerOffset;
          [centerOffsetValue getValue:&centerOffset];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.centerOffset = centerOffset;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_calloutOffset": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* calloutOffsetValue = (NSValue*) REF_MAP[@([args[@"calloutOffset"] integerValue])];
          CGPoint calloutOffset;
          [calloutOffsetValue getValue:&calloutOffset];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.calloutOffset = calloutOffset;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_enabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          BOOL enabled = [args[@"enabled"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.enabled = enabled;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_highlighted": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          BOOL highlighted = [args[@"highlighted"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.highlighted = highlighted;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_selected": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          BOOL selected = [args[@"selected"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.selected = selected;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_canShowCallout": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          BOOL canShowCallout = [args[@"canShowCallout"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.canShowCallout = canShowCallout;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_leftCalloutAccessoryView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          UIView * leftCalloutAccessoryView = (UIView *) REF_MAP[@([args[@"leftCalloutAccessoryView"] integerValue])];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.leftCalloutAccessoryView = leftCalloutAccessoryView;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_rightCalloutAccessoryView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          UIView * rightCalloutAccessoryView = (UIView *) REF_MAP[@([args[@"rightCalloutAccessoryView"] integerValue])];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.rightCalloutAccessoryView = rightCalloutAccessoryView;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_draggable": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          BOOL draggable = [args[@"draggable"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.draggable = draggable;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_dragState": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 枚举参数
          MAAnnotationViewDragState dragState = (MAAnnotationViewDragState) [args[@"dragState"] integerValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.dragState = dragState;
          methodResult(@"success");
      },
      
  };
  //endregion

  //region method call handler
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"me.yohom/amap_base_flutter/MAAnnotationView"
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
