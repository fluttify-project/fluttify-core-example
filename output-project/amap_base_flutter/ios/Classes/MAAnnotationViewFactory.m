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
      @"MAAnnotationView::setSelectedAnimated": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
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
      @"MAAnnotationView::setDragStateAnimated": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
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
          NSLog(@"MAAnnotationView::get_reuseIdentifier");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.reuseIdentifier.hash));
      },
      
      @"MAAnnotationView::get_zIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_zIndex");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.zIndex));
      },
      
      @"MAAnnotationView::get_annotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_annotation");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.annotation.hash));
      },
      
      @"MAAnnotationView::get_customCalloutView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_customCalloutView");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.customCalloutView.hash));
      },
      
      @"MAAnnotationView::get_centerOffset": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_centerOffset");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          NSLog(@"MAAnnotationView::get_centerOffset:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAAnnotationView::get_calloutOffset": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_calloutOffset");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          NSLog(@"MAAnnotationView::get_calloutOffset:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAAnnotationView::get_isEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_isEnabled");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isEnabled));
      },
      
      @"MAAnnotationView::get_isHighlighted": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_isHighlighted");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isHighlighted));
      },
      
      @"MAAnnotationView::get_isSelected": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_isSelected");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isSelected));
      },
      
      @"MAAnnotationView::get_canShowCallout": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_canShowCallout");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.canShowCallout));
      },
      
      @"MAAnnotationView::get_leftCalloutAccessoryView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_leftCalloutAccessoryView");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.leftCalloutAccessoryView.hash));
      },
      
      @"MAAnnotationView::get_rightCalloutAccessoryView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_rightCalloutAccessoryView");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.rightCalloutAccessoryView.hash));
      },
      
      @"MAAnnotationView::get_isDraggable": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_isDraggable");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isDraggable));
      },
      
      @"MAAnnotationView::get_dragState": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::get_dragState");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.dragState));
      },
      
      @"MAAnnotationView::set_zIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_zIndex");
      
          // 参数
          // jsonable参数
          NSInteger zIndex = [args[@"zIndex"] integerValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.zIndex = zIndex;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_annotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_annotation");
      
          // 参数
          // 引用参数
          id<MAAnnotation> annotation = (id<MAAnnotation>) REF_MAP[@([args[@"annotation"] integerValue])];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.annotation = annotation;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_customCalloutView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_customCalloutView");
      
          // 参数
          // 引用参数
          MACustomCalloutView * customCalloutView = (MACustomCalloutView *) REF_MAP[@([args[@"customCalloutView"] integerValue])];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.customCalloutView = customCalloutView;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_centerOffset": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_centerOffset");
      
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
          NSLog(@"MAAnnotationView::set_calloutOffset");
      
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
          NSLog(@"MAAnnotationView::set_enabled");
      
          // 参数
          // jsonable参数
          BOOL enabled = [args[@"enabled"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.enabled = enabled;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_highlighted": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_highlighted");
      
          // 参数
          // jsonable参数
          BOOL highlighted = [args[@"highlighted"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.highlighted = highlighted;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_selected": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_selected");
      
          // 参数
          // jsonable参数
          BOOL selected = [args[@"selected"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.selected = selected;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_canShowCallout": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_canShowCallout");
      
          // 参数
          // jsonable参数
          BOOL canShowCallout = [args[@"canShowCallout"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.canShowCallout = canShowCallout;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_leftCalloutAccessoryView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_leftCalloutAccessoryView");
      
          // 参数
          // 引用参数
          UIView * leftCalloutAccessoryView = (UIView *) REF_MAP[@([args[@"leftCalloutAccessoryView"] integerValue])];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.leftCalloutAccessoryView = leftCalloutAccessoryView;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_rightCalloutAccessoryView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_rightCalloutAccessoryView");
      
          // 参数
          // 引用参数
          UIView * rightCalloutAccessoryView = (UIView *) REF_MAP[@([args[@"rightCalloutAccessoryView"] integerValue])];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.rightCalloutAccessoryView = rightCalloutAccessoryView;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_draggable": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_draggable");
      
          // 参数
          // jsonable参数
          BOOL draggable = [args[@"draggable"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAAnnotationView * ref = (MAAnnotationView *) REF_MAP[@(refId)];
      
          ref.draggable = draggable;
          methodResult(@"success");
      },
      
      @"MAAnnotationView::set_dragState": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAAnnotationView::set_dragState");
      
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

  NSLog(@"MATraceDelegate::traceManagerDidTracecorrectdistancewithError");

  // 暂不支持含有数组的方法
}

- (void)mapViewRequireLocationAuth : (CLLocationManager*)locationManager
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MATraceDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MATraceDelegate::mapViewRequireLocationAuth");

  [channel invokeMethod:@"Callback::MATraceDelegate::mapViewRequireLocationAuth" arguments:@{@"locationManager": @(locationManager.hash)}];
  
}

- (void)multiPointOverlayRenderer : (MAMultiPointOverlayRenderer*)renderer didItemTapped: (MAMultiPointItem*)item
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMultiPointOverlayRendererDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMultiPointOverlayRendererDelegate::multiPointOverlayRendererDidItemTapped");

  [channel invokeMethod:@"Callback::MAMultiPointOverlayRendererDelegate::multiPointOverlayRendererDidItemTapped" arguments:@{@"renderer": @(renderer.hash), @"item": @(item.hash)}];
  
}

- (void)mapViewRegionChanged : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewRegionChanged");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionChanged" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView regionWillChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewRegionWillChangeAnimated");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionWillChangeAnimated" arguments:@{@"mapView": @(mapView.hash), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView regionDidChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewRegionDidChangeAnimated");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionDidChangeAnimated" arguments:@{@"mapView": @(mapView.hash), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView mapWillMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewMapWillMoveByUser");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapWillMoveByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapDidMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewMapDidMoveByUser");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapDidMoveByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapWillZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewMapWillZoomByUser");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapWillZoomByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapDidZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewMapDidZoomByUser");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapDidZoomByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapViewWillStartLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewWillStartLoadingMap");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewWillStartLoadingMap" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidFinishLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidFinishLoadingMap");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFinishLoadingMap" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidFailLoadingMap : (MAMapView*)mapView withError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidFailLoadingMapWithError");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFailLoadingMapWithError" arguments:@{@"mapView": @(mapView.hash), @"error": @(error.hash)}];
  
}

- (MAAnnotationView*)mapView : (MAMapView*)mapView viewForAnnotation: (id<MAAnnotation>)annotation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewViewForAnnotation");

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

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView didSelectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidSelectAnnotationView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidSelectAnnotationView" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didDeselectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidDeselectAnnotationView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidDeselectAnnotationView" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapViewWillStartLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewWillStartLocatingUser");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewWillStartLocatingUser" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidStopLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidStopLocatingUser");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidStopLocatingUser" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didUpdateUserLocation: (MAUserLocation*)userLocation updatingLocation: (BOOL)updatingLocation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidUpdateUserLocationupdatingLocation");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidUpdateUserLocationupdatingLocation" arguments:@{@"mapView": @(mapView.hash), @"userLocation": @(userLocation.hash), @"updatingLocation": @(updatingLocation)}];
  
}

- (void)mapView : (MAMapView*)mapView didFailToLocateUserWithError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidFailToLocateUserWithError");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFailToLocateUserWithError" arguments:@{@"mapView": @(mapView.hash), @"error": @(error.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view didChangeDragState: (MAAnnotationViewDragState)newState fromOldState: (MAAnnotationViewDragState)oldState
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewAnnotationViewdidChangeDragStatefromOldState");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewAnnotationViewdidChangeDragStatefromOldState" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash), @"newState": @(newState), @"oldState": @(oldState)}];
  
}

- (MAOverlayRenderer*)mapView : (MAMapView*)mapView rendererForOverlay: (id<MAOverlay>)overlay
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewRendererForOverlay");

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

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view calloutAccessoryControlTapped: (UIControl*)control
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewAnnotationViewcalloutAccessoryControlTapped");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewAnnotationViewcalloutAccessoryControlTapped" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash), @"control": @(control.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didAnnotationViewCalloutTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidAnnotationViewCalloutTapped");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidAnnotationViewCalloutTapped" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didAnnotationViewTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidAnnotationViewTapped");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidAnnotationViewTapped" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didChangeUserTrackingMode: (MAUserTrackingMode)mode animated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidChangeUserTrackingModeanimated");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidChangeUserTrackingModeanimated" arguments:@{@"mapView": @(mapView.hash), @"mode": @(mode), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView didChangeOpenGLESDisabled: (BOOL)openGLESDisabled
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidChangeOpenGLESDisabled");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidChangeOpenGLESDisabled" arguments:@{@"mapView": @(mapView.hash), @"openGLESDisabled": @(openGLESDisabled)}];
  
}

- (void)mapView : (MAMapView*)mapView didTouchPois: (NSArray*)pois
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidTouchPois");

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView didSingleTappedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidSingleTappedAtCoordinate");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidSingleTappedAtCoordinate" arguments:@{@"mapView": @(mapView.hash), @"coordinate": @([NSValue value:&coordinate withObjCType:@encode(CLLocationCoordinate2D)].hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didLongPressedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidLongPressedAtCoordinate");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidLongPressedAtCoordinate" arguments:@{@"mapView": @(mapView.hash), @"coordinate": @([NSValue value:&coordinate withObjCType:@encode(CLLocationCoordinate2D)].hash)}];
  
}

- (void)mapInitComplete : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapInitComplete");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapInitComplete" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapShowed: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidIndoorMapShowed");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapShowed" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapFloorIndexChanged: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidIndoorMapFloorIndexChanged");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapFloorIndexChanged" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapHidden: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::mapViewDidIndoorMapHidden");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapHidden" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)offlineDataWillReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::offlineDataWillReload");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::offlineDataWillReload" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)offlineDataDidReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"MAMapViewDelegate::offlineDataDidReload");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::offlineDataDidReload" arguments:@{@"mapView": @(mapView.hash)}];
  
}

//endregion

@end
