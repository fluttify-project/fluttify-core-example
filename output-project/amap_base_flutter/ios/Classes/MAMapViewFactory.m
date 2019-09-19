#import "MAMapViewFactory.h"
#import "AmapBaseFlutterPlugin.h"

typedef void (^Handler)(NSObject <FlutterPluginRegistrar> *, NSDictionary<NSString *, NSObject *> *, FlutterResult);

@implementation MAMapViewFactory {
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
  return [[MAMapViewPlatformView alloc] initWithViewId:viewId registrar:_registrar];
}

@end

@implementation MAMapViewPlatformView {
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
  MAMapView *view = [[MAMapView alloc] init];
  REF_MAP[@(_viewId)] = view;

  //region handlers
  _handlerMap = @{
      @"MAMapView::setRegion": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* regionValue = (NSValue*) REF_MAP[@([args[@"region"] integerValue])];
          MACoordinateRegion region;
          [regionValue getValue:&region];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setRegion(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setRegion : region animated: animated];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::regionThatFits": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* regionValue = (NSValue*) REF_MAP[@([args[@"region"] integerValue])];
          MACoordinateRegion region;
          [regionValue getValue:&region];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::regionThatFits(暂未实现参数打印)", @(refId));
      
          // 开始调用
          MACoordinateRegion result = [ref regionThatFits: region];
      
          // 调用结果
          NSValue* resultValue = [NSValue value:&result withObjCType:@encode(MACoordinateRegion)];
          REF_MAP[@(resultValue.hash)] = resultValue;
      
          methodResult(@(resultValue.hash));
      },
      @"MAMapView::setVisibleMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* mapRectValue = (NSValue*) REF_MAP[@([args[@"mapRect"] integerValue])];
          MAMapRect mapRect;
          [mapRectValue getValue:&mapRect];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setVisibleMapRect(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setVisibleMapRect : mapRect animated: animated];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::mapRectThatFits": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* mapRectValue = (NSValue*) REF_MAP[@([args[@"mapRect"] integerValue])];
          MAMapRect mapRect;
          [mapRectValue getValue:&mapRect];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::mapRectThatFits(暂未实现参数打印)", @(refId));
      
          // 开始调用
          MAMapRect result = [ref mapRectThatFits: mapRect];
      
          // 调用结果
          NSValue* resultValue = [NSValue value:&result withObjCType:@encode(MAMapRect)];
          REF_MAP[@(resultValue.hash)] = resultValue;
      
          methodResult(@(resultValue.hash));
      },
      @"MAMapView::setCenterCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* coordinateValue = (NSValue*) REF_MAP[@([args[@"coordinate"] integerValue])];
          CLLocationCoordinate2D coordinate;
          [coordinateValue getValue:&coordinate];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setCenterCoordinate(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setCenterCoordinate : coordinate animated: animated];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::setZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          CGFloat zoomLevel = [args[@"zoomLevel"] floatValue];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setZoomLevel(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setZoomLevel : zoomLevel animated: animated];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::setRotationDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          CGFloat rotationDegree = [args[@"rotationDegree"] floatValue];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
          // jsonable参数
          CFTimeInterval duration = [args[@"duration"] doubleValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setRotationDegree(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setRotationDegree : rotationDegree animated: animated duration: duration];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::setCameraDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          CGFloat cameraDegree = [args[@"cameraDegree"] floatValue];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
          // jsonable参数
          CFTimeInterval duration = [args[@"duration"] doubleValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setCameraDegree(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setCameraDegree : cameraDegree animated: animated duration: duration];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::getMapStatus": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
      
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::getMapStatus(暂未实现参数打印)", @(refId));
      
          // 开始调用
          MAMapStatus* result = [ref getMapStatus];
      
          // 调用结果
          NSInteger returnRefId = [result hash];
          REF_MAP[@(returnRefId)] = result;
      
          methodResult(@(returnRefId));
      },
      @"MAMapView::setMapStatus": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          MAMapStatus* status = (MAMapStatus*) REF_MAP[@([args[@"status"] integerValue])];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setMapStatus(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setMapStatus : status animated: animated];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::metersPerPointForZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          CGFloat zoomLevel = [args[@"zoomLevel"] floatValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::metersPerPointForZoomLevel(暂未实现参数打印)", @(refId));
      
          // 开始调用
          double result = [ref metersPerPointForZoomLevel: zoomLevel];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::convertCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* coordinateValue = (NSValue*) REF_MAP[@([args[@"coordinate"] integerValue])];
          CLLocationCoordinate2D coordinate;
          [coordinateValue getValue:&coordinate];
          // 引用参数
          UIView* view = (UIView*) REF_MAP[@([args[@"view"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::convertCoordinate(暂未实现参数打印)", @(refId));
      
          // 开始调用
          CGPoint result = [ref convertCoordinate: coordinate toPointToView: view];
      
          // 调用结果
          NSValue* resultValue = [NSValue value:&result withObjCType:@encode(CGPoint)];
          REF_MAP[@(resultValue.hash)] = resultValue;
      
          methodResult(@(resultValue.hash));
      },
      @"MAMapView::convertPoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* pointValue = (NSValue*) REF_MAP[@([args[@"point"] integerValue])];
          CGPoint point;
          [pointValue getValue:&point];
          // 引用参数
          UIView* view = (UIView*) REF_MAP[@([args[@"view"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::convertPoint(暂未实现参数打印)", @(refId));
      
          // 开始调用
          CLLocationCoordinate2D result = [ref convertPoint: point toCoordinateFromView: view];
      
          // 调用结果
          NSValue* resultValue = [NSValue value:&result withObjCType:@encode(CLLocationCoordinate2D)];
          REF_MAP[@(resultValue.hash)] = resultValue;
      
          methodResult(@(resultValue.hash));
      },
      @"MAMapView::convertRegion": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* regionValue = (NSValue*) REF_MAP[@([args[@"region"] integerValue])];
          MACoordinateRegion region;
          [regionValue getValue:&region];
          // 引用参数
          UIView* view = (UIView*) REF_MAP[@([args[@"view"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::convertRegion(暂未实现参数打印)", @(refId));
      
          // 开始调用
          CGRect result = [ref convertRegion: region toRectToView: view];
      
          // 调用结果
          NSValue* resultValue = [NSValue value:&result withObjCType:@encode(CGRect)];
          REF_MAP[@(resultValue.hash)] = resultValue;
      
          methodResult(@(resultValue.hash));
      },
      @"MAMapView::convertRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* rectValue = (NSValue*) REF_MAP[@([args[@"rect"] integerValue])];
          CGRect rect;
          [rectValue getValue:&rect];
          // 引用参数
          UIView* view = (UIView*) REF_MAP[@([args[@"view"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::convertRect(暂未实现参数打印)", @(refId));
      
          // 开始调用
          MACoordinateRegion result = [ref convertRect: rect toRegionFromView: view];
      
          // 调用结果
          NSValue* resultValue = [NSValue value:&result withObjCType:@encode(MACoordinateRegion)];
          REF_MAP[@(resultValue.hash)] = resultValue;
      
          methodResult(@(resultValue.hash));
      },
      @"MAMapView::reloadMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
      
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::reloadMap(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref reloadMap ];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::clearDisk": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
      
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::clearDisk(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref clearDisk ];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::reloadInternalTexture": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
      
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::reloadInternalTexture(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref reloadInternalTexture ];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::mapContentApprovalNumber": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
      
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::mapContentApprovalNumber(暂未实现参数打印)", @(refId));
      
          // 开始调用
          NSString* result = [ref mapContentApprovalNumber];
      
          // 调用结果
          methodResult(result);
      },
      @"MAMapView::satelliteImageApprovalNumber": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
      
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::satelliteImageApprovalNumber(暂未实现参数打印)", @(refId));
      
          // 开始调用
          NSString* result = [ref satelliteImageApprovalNumber];
      
          // 调用结果
          methodResult(result);
      },
      @"MAMapView::forceRefresh": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
      
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::forceRefresh(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref forceRefresh ];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::addAnnotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          id<MAAnnotation> annotation = (id<MAAnnotation>) REF_MAP[@([args[@"annotation"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::addAnnotation(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref addAnnotation : annotation];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::removeAnnotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          id<MAAnnotation> annotation = (id<MAAnnotation>) REF_MAP[@([args[@"annotation"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::removeAnnotation(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref removeAnnotation : annotation];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::viewForAnnotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          id<MAAnnotation> annotation = (id<MAAnnotation>) REF_MAP[@([args[@"annotation"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::viewForAnnotation(暂未实现参数打印)", @(refId));
      
          // 开始调用
          MAAnnotationView* result = [ref viewForAnnotation: annotation];
      
          // 调用结果
          NSInteger returnRefId = [result hash];
          REF_MAP[@(returnRefId)] = result;
      
          methodResult(@(returnRefId));
      },
      @"MAMapView::dequeueReusableAnnotationViewWithIdentifier": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          NSString* identifier = (NSString*) args[@"identifier"];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::dequeueReusableAnnotationViewWithIdentifier(暂未实现参数打印)", @(refId));
      
          // 开始调用
          MAAnnotationView* result = [ref dequeueReusableAnnotationViewWithIdentifier: identifier];
      
          // 调用结果
          NSInteger returnRefId = [result hash];
          REF_MAP[@(returnRefId)] = result;
      
          methodResult(@(returnRefId));
      },
      @"MAMapView::selectAnnotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          id<MAAnnotation> annotation = (id<MAAnnotation>) REF_MAP[@([args[@"annotation"] integerValue])];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::selectAnnotation(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref selectAnnotation : annotation animated: animated];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::deselectAnnotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          id<MAAnnotation> annotation = (id<MAAnnotation>) REF_MAP[@([args[@"annotation"] integerValue])];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::deselectAnnotation(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref deselectAnnotation : annotation animated: animated];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::setUserTrackingMode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 枚举参数
          MAUserTrackingMode mode = (MAUserTrackingMode) [args[@"mode"] integerValue];
          // jsonable参数
          BOOL animated = [args[@"animated"] boolValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setUserTrackingMode(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setUserTrackingMode : mode animated: animated];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::updateUserLocationRepresentation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          MAUserLocationRepresentation* representation = (MAUserLocationRepresentation*) REF_MAP[@([args[@"representation"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::updateUserLocationRepresentation(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref updateUserLocationRepresentation : representation];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::addOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          id<MAOverlay> overlay = (id<MAOverlay>) REF_MAP[@([args[@"overlay"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::addOverlay(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref addOverlay : overlay];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::removeOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          id<MAOverlay> overlay = (id<MAOverlay>) REF_MAP[@([args[@"overlay"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::removeOverlay(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref removeOverlay : overlay];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::exchangeOverlayAtIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          NSUInteger index1 = [args[@"index1"] unsignedIntegerValue];
          // jsonable参数
          NSUInteger index2 = [args[@"index2"] unsignedIntegerValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::exchangeOverlayAtIndex(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref exchangeOverlayAtIndex : index1 withOverlayAtIndex: index2];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::exchangeOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          id<MAOverlay> overlay1 = (id<MAOverlay>) REF_MAP[@([args[@"overlay1"] integerValue])];
          // 引用参数
          id<MAOverlay> overlay2 = (id<MAOverlay>) REF_MAP[@([args[@"overlay2"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::exchangeOverlay(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref exchangeOverlay : overlay1 withOverlay: overlay2];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::rendererForOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          id<MAOverlay> overlay = (id<MAOverlay>) REF_MAP[@([args[@"overlay"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::rendererForOverlay(暂未实现参数打印)", @(refId));
      
          // 开始调用
          MAOverlayRenderer* result = [ref rendererForOverlay: overlay];
      
          // 调用结果
          NSInteger returnRefId = [result hash];
          REF_MAP[@(returnRefId)] = result;
      
          methodResult(@(returnRefId));
      },
      @"MAMapView::setIndoorMapControlOrigin": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 结构体参数
          NSValue* originValue = (NSValue*) REF_MAP[@([args[@"origin"] integerValue])];
          CGPoint origin;
          [originValue getValue:&origin];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setIndoorMapControlOrigin(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setIndoorMapControlOrigin : origin];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::setCurrentIndoorMapFloorIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // jsonable参数
          NSInteger floorIndex = [args[@"floorIndex"] integerValue];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setCurrentIndoorMapFloorIndex(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setCurrentIndoorMapFloorIndex : floorIndex];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::clearIndoorMapCache": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
      
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::clearIndoorMapCache(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref clearIndoorMapCache ];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::setCustomMapStyleOptions": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          // 参数
          // 引用参数
          MAMapCustomStyleOptions* styleOptions = (MAMapCustomStyleOptions*) REF_MAP[@([args[@"styleOptions"] integerValue])];
      
          // 调用对象引用
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          // 日志打印
          NSLog(@"fluttify-objc: MAMapView@%@::setCustomMapStyleOptions(暂未实现参数打印)", @(refId));
      
          // 开始调用
          [ref setCustomMapStyleOptions : styleOptions];
      
          // 调用结果
          methodResult(@"success");
      },
      @"MAMapView::get_delegate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_delegate");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.delegate.hash));
      },
      
      @"MAMapView::get_mapType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_mapType");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.mapType));
      },
      
      @"MAMapView::get_centerCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_centerCoordinate");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          NSLog(@"MAMapView::get_centerCoordinate:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAMapView::get_region": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_region");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          NSLog(@"MAMapView::get_region:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAMapView::get_visibleMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_visibleMapRect");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          NSLog(@"MAMapView::get_visibleMapRect:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAMapView::get_limitRegion": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_limitRegion");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          NSLog(@"MAMapView::get_limitRegion:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAMapView::get_limitMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_limitMapRect");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          NSLog(@"MAMapView::get_limitMapRect:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAMapView::get_zoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_zoomLevel");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.zoomLevel));
      },
      
      @"MAMapView::get_minZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_minZoomLevel");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.minZoomLevel));
      },
      
      @"MAMapView::get_maxZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_maxZoomLevel");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.maxZoomLevel));
      },
      
      @"MAMapView::get_rotationDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_rotationDegree");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.rotationDegree));
      },
      
      @"MAMapView::get_cameraDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_cameraDegree");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.cameraDegree));
      },
      
      @"MAMapView::get_zoomingInPivotsAroundAnchorPoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_zoomingInPivotsAroundAnchorPoint");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.zoomingInPivotsAroundAnchorPoint));
      },
      
      @"MAMapView::get_isZoomEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isZoomEnabled");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isZoomEnabled));
      },
      
      @"MAMapView::get_isScrollEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isScrollEnabled");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isScrollEnabled));
      },
      
      @"MAMapView::get_isRotateEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isRotateEnabled");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isRotateEnabled));
      },
      
      @"MAMapView::get_isRotateCameraEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isRotateCameraEnabled");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isRotateCameraEnabled));
      },
      
      @"MAMapView::get_isSkyModelEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isSkyModelEnabled");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isSkyModelEnabled));
      },
      
      @"MAMapView::get_isShowsBuildings": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isShowsBuildings");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isShowsBuildings));
      },
      
      @"MAMapView::get_isShowsLabels": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isShowsLabels");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isShowsLabels));
      },
      
      @"MAMapView::get_isShowTraffic": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isShowTraffic");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isShowTraffic));
      },
      
      @"MAMapView::get_trafficRatio": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_trafficRatio");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.trafficRatio));
      },
      
      @"MAMapView::get_touchPOIEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_touchPOIEnabled");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.touchPOIEnabled));
      },
      
      @"MAMapView::get_showsCompass": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_showsCompass");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.showsCompass));
      },
      
      @"MAMapView::get_compassOrigin": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_compassOrigin");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          NSLog(@"MAMapView::get_compassOrigin:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAMapView::get_showsScale": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_showsScale");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.showsScale));
      },
      
      @"MAMapView::get_scaleOrigin": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_scaleOrigin");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          NSLog(@"MAMapView::get_scaleOrigin:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAMapView::get_logoCenter": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_logoCenter");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          NSLog(@"MAMapView::get_logoCenter:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAMapView::get_metersPerPointForCurrentZoom": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_metersPerPointForCurrentZoom");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.metersPerPointForCurrentZoom));
      },
      
      @"MAMapView::get_isAbroad": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isAbroad");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isAbroad));
      },
      
      @"MAMapView::get_maxRenderFrame": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_maxRenderFrame");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.maxRenderFrame));
      },
      
      @"MAMapView::get_isAllowDecreaseFrame": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isAllowDecreaseFrame");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isAllowDecreaseFrame));
      },
      
      @"MAMapView::get_openGLESDisabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_openGLESDisabled");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.openGLESDisabled));
      },
      
      @"MAMapView::get_screenAnchor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_screenAnchor");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          NSLog(@"MAMapView::get_screenAnchor:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAMapView::get_annotationVisibleRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_annotationVisibleRect");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          NSLog(@"MAMapView::get_annotationVisibleRect:结构体getter暂时不支持");
      
          methodResult(nil/* 结构体getter暂时不支持 */);
      },
      
      @"MAMapView::get_allowsAnnotationViewSorting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_allowsAnnotationViewSorting");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.allowsAnnotationViewSorting));
      },
      
      @"MAMapView::get_showsUserLocation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_showsUserLocation");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.showsUserLocation));
      },
      
      @"MAMapView::get_userLocation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_userLocation");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.userLocation.hash));
      },
      
      @"MAMapView::get_customizeUserLocationAccuracyCircleRepresentation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_customizeUserLocationAccuracyCircleRepresentation");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.customizeUserLocationAccuracyCircleRepresentation));
      },
      
      @"MAMapView::get_userLocationAccuracyCircle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_userLocationAccuracyCircle");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.userLocationAccuracyCircle.hash));
      },
      
      @"MAMapView::get_userTrackingMode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_userTrackingMode");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.userTrackingMode));
      },
      
      @"MAMapView::get_isUserLocationVisible": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isUserLocationVisible");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isUserLocationVisible));
      },
      
      @"MAMapView::get_pausesLocationUpdatesAutomatically": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_pausesLocationUpdatesAutomatically");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.pausesLocationUpdatesAutomatically));
      },
      
      @"MAMapView::get_allowsBackgroundLocationUpdates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_allowsBackgroundLocationUpdates");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.allowsBackgroundLocationUpdates));
      },
      
      @"MAMapView::get_isShowsIndoorMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isShowsIndoorMap");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isShowsIndoorMap));
      },
      
      @"MAMapView::get_isShowsIndoorMapControl": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_isShowsIndoorMapControl");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.isShowsIndoorMapControl));
      },
      
      @"MAMapView::get_customMapStyleEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::get_customMapStyleEnabled");
      
          // 引用对象
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
      
      
          methodResult(@(ref.customMapStyleEnabled));
      },
      
      @"MAMapView::set_delegate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_delegate");
      
          // 参数
      
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.delegate = self;
          methodResult(@"success");
      },
      
      @"MAMapView::set_mapType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_mapType");
      
          // 参数
          // 枚举参数
          MAMapType mapType = (MAMapType) [args[@"mapType"] integerValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.mapType = mapType;
          methodResult(@"success");
      },
      
      @"MAMapView::set_centerCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_centerCoordinate");
      
          // 参数
          // 结构体参数
          NSValue* centerCoordinateValue = (NSValue*) REF_MAP[@([args[@"centerCoordinate"] integerValue])];
          CLLocationCoordinate2D centerCoordinate;
          [centerCoordinateValue getValue:&centerCoordinate];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.centerCoordinate = centerCoordinate;
          methodResult(@"success");
      },
      
      @"MAMapView::set_region": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_region");
      
          // 参数
          // 结构体参数
          NSValue* regionValue = (NSValue*) REF_MAP[@([args[@"region"] integerValue])];
          MACoordinateRegion region;
          [regionValue getValue:&region];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.region = region;
          methodResult(@"success");
      },
      
      @"MAMapView::set_visibleMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_visibleMapRect");
      
          // 参数
          // 结构体参数
          NSValue* visibleMapRectValue = (NSValue*) REF_MAP[@([args[@"visibleMapRect"] integerValue])];
          MAMapRect visibleMapRect;
          [visibleMapRectValue getValue:&visibleMapRect];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.visibleMapRect = visibleMapRect;
          methodResult(@"success");
      },
      
      @"MAMapView::set_limitRegion": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_limitRegion");
      
          // 参数
          // 结构体参数
          NSValue* limitRegionValue = (NSValue*) REF_MAP[@([args[@"limitRegion"] integerValue])];
          MACoordinateRegion limitRegion;
          [limitRegionValue getValue:&limitRegion];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.limitRegion = limitRegion;
          methodResult(@"success");
      },
      
      @"MAMapView::set_limitMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_limitMapRect");
      
          // 参数
          // 结构体参数
          NSValue* limitMapRectValue = (NSValue*) REF_MAP[@([args[@"limitMapRect"] integerValue])];
          MAMapRect limitMapRect;
          [limitMapRectValue getValue:&limitMapRect];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.limitMapRect = limitMapRect;
          methodResult(@"success");
      },
      
      @"MAMapView::set_zoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_zoomLevel");
      
          // 参数
          // jsonable参数
          CGFloat zoomLevel = [args[@"zoomLevel"] floatValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.zoomLevel = zoomLevel;
          methodResult(@"success");
      },
      
      @"MAMapView::set_minZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_minZoomLevel");
      
          // 参数
          // jsonable参数
          CGFloat minZoomLevel = [args[@"minZoomLevel"] floatValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.minZoomLevel = minZoomLevel;
          methodResult(@"success");
      },
      
      @"MAMapView::set_maxZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_maxZoomLevel");
      
          // 参数
          // jsonable参数
          CGFloat maxZoomLevel = [args[@"maxZoomLevel"] floatValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.maxZoomLevel = maxZoomLevel;
          methodResult(@"success");
      },
      
      @"MAMapView::set_rotationDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_rotationDegree");
      
          // 参数
          // jsonable参数
          CGFloat rotationDegree = [args[@"rotationDegree"] floatValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.rotationDegree = rotationDegree;
          methodResult(@"success");
      },
      
      @"MAMapView::set_cameraDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_cameraDegree");
      
          // 参数
          // jsonable参数
          CGFloat cameraDegree = [args[@"cameraDegree"] floatValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.cameraDegree = cameraDegree;
          methodResult(@"success");
      },
      
      @"MAMapView::set_zoomingInPivotsAroundAnchorPoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_zoomingInPivotsAroundAnchorPoint");
      
          // 参数
          // jsonable参数
          BOOL zoomingInPivotsAroundAnchorPoint = [args[@"zoomingInPivotsAroundAnchorPoint"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.zoomingInPivotsAroundAnchorPoint = zoomingInPivotsAroundAnchorPoint;
          methodResult(@"success");
      },
      
      @"MAMapView::set_zoomEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_zoomEnabled");
      
          // 参数
          // jsonable参数
          BOOL zoomEnabled = [args[@"zoomEnabled"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.zoomEnabled = zoomEnabled;
          methodResult(@"success");
      },
      
      @"MAMapView::set_scrollEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_scrollEnabled");
      
          // 参数
          // jsonable参数
          BOOL scrollEnabled = [args[@"scrollEnabled"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.scrollEnabled = scrollEnabled;
          methodResult(@"success");
      },
      
      @"MAMapView::set_rotateEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_rotateEnabled");
      
          // 参数
          // jsonable参数
          BOOL rotateEnabled = [args[@"rotateEnabled"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.rotateEnabled = rotateEnabled;
          methodResult(@"success");
      },
      
      @"MAMapView::set_rotateCameraEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_rotateCameraEnabled");
      
          // 参数
          // jsonable参数
          BOOL rotateCameraEnabled = [args[@"rotateCameraEnabled"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.rotateCameraEnabled = rotateCameraEnabled;
          methodResult(@"success");
      },
      
      @"MAMapView::set_skyModelEnable": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_skyModelEnable");
      
          // 参数
          // jsonable参数
          BOOL skyModelEnable = [args[@"skyModelEnable"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.skyModelEnable = skyModelEnable;
          methodResult(@"success");
      },
      
      @"MAMapView::set_showsBuildings": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_showsBuildings");
      
          // 参数
          // jsonable参数
          BOOL showsBuildings = [args[@"showsBuildings"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.showsBuildings = showsBuildings;
          methodResult(@"success");
      },
      
      @"MAMapView::set_showsLabels": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_showsLabels");
      
          // 参数
          // jsonable参数
          BOOL showsLabels = [args[@"showsLabels"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.showsLabels = showsLabels;
          methodResult(@"success");
      },
      
      @"MAMapView::set_showTraffic": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_showTraffic");
      
          // 参数
          // jsonable参数
          BOOL showTraffic = [args[@"showTraffic"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.showTraffic = showTraffic;
          methodResult(@"success");
      },
      
      @"MAMapView::set_trafficRatio": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_trafficRatio");
      
          // 参数
          // jsonable参数
          CGFloat trafficRatio = [args[@"trafficRatio"] floatValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.trafficRatio = trafficRatio;
          methodResult(@"success");
      },
      
      @"MAMapView::set_touchPOIEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_touchPOIEnabled");
      
          // 参数
          // jsonable参数
          BOOL touchPOIEnabled = [args[@"touchPOIEnabled"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.touchPOIEnabled = touchPOIEnabled;
          methodResult(@"success");
      },
      
      @"MAMapView::set_showsCompass": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_showsCompass");
      
          // 参数
          // jsonable参数
          BOOL showsCompass = [args[@"showsCompass"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.showsCompass = showsCompass;
          methodResult(@"success");
      },
      
      @"MAMapView::set_compassOrigin": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_compassOrigin");
      
          // 参数
          // 结构体参数
          NSValue* compassOriginValue = (NSValue*) REF_MAP[@([args[@"compassOrigin"] integerValue])];
          CGPoint compassOrigin;
          [compassOriginValue getValue:&compassOrigin];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.compassOrigin = compassOrigin;
          methodResult(@"success");
      },
      
      @"MAMapView::set_showsScale": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_showsScale");
      
          // 参数
          // jsonable参数
          BOOL showsScale = [args[@"showsScale"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.showsScale = showsScale;
          methodResult(@"success");
      },
      
      @"MAMapView::set_scaleOrigin": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_scaleOrigin");
      
          // 参数
          // 结构体参数
          NSValue* scaleOriginValue = (NSValue*) REF_MAP[@([args[@"scaleOrigin"] integerValue])];
          CGPoint scaleOrigin;
          [scaleOriginValue getValue:&scaleOrigin];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.scaleOrigin = scaleOrigin;
          methodResult(@"success");
      },
      
      @"MAMapView::set_logoCenter": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_logoCenter");
      
          // 参数
          // 结构体参数
          NSValue* logoCenterValue = (NSValue*) REF_MAP[@([args[@"logoCenter"] integerValue])];
          CGPoint logoCenter;
          [logoCenterValue getValue:&logoCenter];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.logoCenter = logoCenter;
          methodResult(@"success");
      },
      
      @"MAMapView::set_maxRenderFrame": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_maxRenderFrame");
      
          // 参数
          // jsonable参数
          NSUInteger maxRenderFrame = [args[@"maxRenderFrame"] unsignedIntegerValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.maxRenderFrame = maxRenderFrame;
          methodResult(@"success");
      },
      
      @"MAMapView::set_isAllowDecreaseFrame": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_isAllowDecreaseFrame");
      
          // 参数
          // jsonable参数
          BOOL isAllowDecreaseFrame = [args[@"isAllowDecreaseFrame"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.isAllowDecreaseFrame = isAllowDecreaseFrame;
          methodResult(@"success");
      },
      
      @"MAMapView::set_openGLESDisabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_openGLESDisabled");
      
          // 参数
          // jsonable参数
          BOOL openGLESDisabled = [args[@"openGLESDisabled"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.openGLESDisabled = openGLESDisabled;
          methodResult(@"success");
      },
      
      @"MAMapView::set_screenAnchor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_screenAnchor");
      
          // 参数
          // 结构体参数
          NSValue* screenAnchorValue = (NSValue*) REF_MAP[@([args[@"screenAnchor"] integerValue])];
          CGPoint screenAnchor;
          [screenAnchorValue getValue:&screenAnchor];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.screenAnchor = screenAnchor;
          methodResult(@"success");
      },
      
      @"MAMapView::set_allowsAnnotationViewSorting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_allowsAnnotationViewSorting");
      
          // 参数
          // jsonable参数
          BOOL allowsAnnotationViewSorting = [args[@"allowsAnnotationViewSorting"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.allowsAnnotationViewSorting = allowsAnnotationViewSorting;
          methodResult(@"success");
      },
      
      @"MAMapView::set_showsUserLocation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_showsUserLocation");
      
          // 参数
          // jsonable参数
          BOOL showsUserLocation = [args[@"showsUserLocation"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.showsUserLocation = showsUserLocation;
          methodResult(@"success");
      },
      
      @"MAMapView::set_customizeUserLocationAccuracyCircleRepresentation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_customizeUserLocationAccuracyCircleRepresentation");
      
          // 参数
          // jsonable参数
          BOOL customizeUserLocationAccuracyCircleRepresentation = [args[@"customizeUserLocationAccuracyCircleRepresentation"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.customizeUserLocationAccuracyCircleRepresentation = customizeUserLocationAccuracyCircleRepresentation;
          methodResult(@"success");
      },
      
      @"MAMapView::set_userTrackingMode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_userTrackingMode");
      
          // 参数
          // 枚举参数
          MAUserTrackingMode userTrackingMode = (MAUserTrackingMode) [args[@"userTrackingMode"] integerValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.userTrackingMode = userTrackingMode;
          methodResult(@"success");
      },
      
      @"MAMapView::set_pausesLocationUpdatesAutomatically": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_pausesLocationUpdatesAutomatically");
      
          // 参数
          // jsonable参数
          BOOL pausesLocationUpdatesAutomatically = [args[@"pausesLocationUpdatesAutomatically"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.pausesLocationUpdatesAutomatically = pausesLocationUpdatesAutomatically;
          methodResult(@"success");
      },
      
      @"MAMapView::set_allowsBackgroundLocationUpdates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_allowsBackgroundLocationUpdates");
      
          // 参数
          // jsonable参数
          BOOL allowsBackgroundLocationUpdates = [args[@"allowsBackgroundLocationUpdates"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.allowsBackgroundLocationUpdates = allowsBackgroundLocationUpdates;
          methodResult(@"success");
      },
      
      @"MAMapView::set_showsIndoorMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_showsIndoorMap");
      
          // 参数
          // jsonable参数
          BOOL showsIndoorMap = [args[@"showsIndoorMap"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.showsIndoorMap = showsIndoorMap;
          methodResult(@"success");
      },
      
      @"MAMapView::set_showsIndoorMapControl": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_showsIndoorMapControl");
      
          // 参数
          // jsonable参数
          BOOL showsIndoorMapControl = [args[@"showsIndoorMapControl"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.showsIndoorMapControl = showsIndoorMapControl;
          methodResult(@"success");
      },
      
      @"MAMapView::set_customMapStyleEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
          NSLog(@"MAMapView::set_customMapStyleEnabled");
      
          // 参数
          // jsonable参数
          BOOL customMapStyleEnabled = [args[@"customMapStyleEnabled"] boolValue];
      
          NSInteger refId = [args[@"refId"] integerValue];
          MAMapView * ref = (MAMapView *) REF_MAP[@(refId)];
      
          ref.customMapStyleEnabled = customMapStyleEnabled;
          methodResult(@"success");
      },
      
  };
  //endregion

  //region method call handler
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"me.yohom/amap_base_flutter/MAMapView"
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

  NSLog(@"traceManager");

  // 暂不支持含有数组的方法
}

- (void)mapViewRequireLocationAuth : (CLLocationManager*)locationManager
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MATraceDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapViewRequireLocationAuth");

  [channel invokeMethod:@"Callback::MATraceDelegate::mapViewRequireLocationAuth" arguments:@{@"locationManager": @(locationManager.hash)}];
  
}

- (void)multiPointOverlayRenderer : (MAMultiPointOverlayRenderer*)renderer didItemTapped: (MAMultiPointItem*)item
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMultiPointOverlayRendererDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"multiPointOverlayRenderer");

  [channel invokeMethod:@"Callback::MAMultiPointOverlayRendererDelegate::multiPointOverlayRendererDidItemTapped" arguments:@{@"renderer": @(renderer.hash), @"item": @(item.hash)}];
  
}

- (void)mapViewRegionChanged : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapViewRegionChanged");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionChanged" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView regionWillChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionWillChangeAnimated" arguments:@{@"mapView": @(mapView.hash), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView regionDidChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewRegionDidChangeAnimated" arguments:@{@"mapView": @(mapView.hash), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView mapWillMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapWillMoveByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapDidMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapDidMoveByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapWillZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapWillZoomByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapView : (MAMapView*)mapView mapDidZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewMapDidZoomByUser" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction)}];
  
}

- (void)mapViewWillStartLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapViewWillStartLoadingMap");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewWillStartLoadingMap" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidFinishLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapViewDidFinishLoadingMap");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFinishLoadingMap" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidFailLoadingMap : (MAMapView*)mapView withError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapViewDidFailLoadingMap");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFailLoadingMapWithError" arguments:@{@"mapView": @(mapView.hash), @"error": @(error.hash)}];
  
}

- (MAAnnotationView*)mapView : (MAMapView*)mapView viewForAnnotation: (id<MAAnnotation>)annotation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

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

  NSLog(@"mapView");

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView didSelectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidSelectAnnotationView" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didDeselectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidDeselectAnnotationView" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapViewWillStartLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapViewWillStartLocatingUser");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewWillStartLocatingUser" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapViewDidStopLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapViewDidStopLocatingUser");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidStopLocatingUser" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didUpdateUserLocation: (MAUserLocation*)userLocation updatingLocation: (BOOL)updatingLocation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidUpdateUserLocationupdatingLocation" arguments:@{@"mapView": @(mapView.hash), @"userLocation": @(userLocation.hash), @"updatingLocation": @(updatingLocation)}];
  
}

- (void)mapView : (MAMapView*)mapView didFailToLocateUserWithError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidFailToLocateUserWithError" arguments:@{@"mapView": @(mapView.hash), @"error": @(error.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view didChangeDragState: (MAAnnotationViewDragState)newState fromOldState: (MAAnnotationViewDragState)oldState
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewAnnotationViewdidChangeDragStatefromOldState" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash), @"newState": @(newState), @"oldState": @(oldState)}];
  
}

- (MAOverlayRenderer*)mapView : (MAMapView*)mapView rendererForOverlay: (id<MAOverlay>)overlay
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

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

  NSLog(@"mapView");

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view calloutAccessoryControlTapped: (UIControl*)control
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewAnnotationViewcalloutAccessoryControlTapped" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash), @"control": @(control.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didAnnotationViewCalloutTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidAnnotationViewCalloutTapped" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didAnnotationViewTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidAnnotationViewTapped" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didChangeUserTrackingMode: (MAUserTrackingMode)mode animated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidChangeUserTrackingModeanimated" arguments:@{@"mapView": @(mapView.hash), @"mode": @(mode), @"animated": @(animated)}];
  
}

- (void)mapView : (MAMapView*)mapView didChangeOpenGLESDisabled: (BOOL)openGLESDisabled
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidChangeOpenGLESDisabled" arguments:@{@"mapView": @(mapView.hash), @"openGLESDisabled": @(openGLESDisabled)}];
  
}

- (void)mapView : (MAMapView*)mapView didTouchPois: (NSArray*)pois
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  // 暂不支持含有数组的方法
}

- (void)mapView : (MAMapView*)mapView didSingleTappedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidSingleTappedAtCoordinate" arguments:@{@"mapView": @(mapView.hash), @"coordinate": @([NSValue value:&coordinate withObjCType:@encode(CLLocationCoordinate2D)].hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didLongPressedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidLongPressedAtCoordinate" arguments:@{@"mapView": @(mapView.hash), @"coordinate": @([NSValue value:&coordinate withObjCType:@encode(CLLocationCoordinate2D)].hash)}];
  
}

- (void)mapInitComplete : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapInitComplete");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapInitComplete" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapShowed: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapShowed" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapFloorIndexChanged: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapFloorIndexChanged" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)mapView : (MAMapView*)mapView didIndoorMapHidden: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"mapView");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::mapViewDidIndoorMapHidden" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}

- (void)offlineDataWillReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"offlineDataWillReload");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::offlineDataWillReload" arguments:@{@"mapView": @(mapView.hash)}];
  
}

- (void)offlineDataDidReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"MAMapViewDelegate::Callback"
            binaryMessenger:[_registrar messenger]];

  NSLog(@"offlineDataDidReload");

  [channel invokeMethod:@"Callback::MAMapViewDelegate::offlineDataDidReload" arguments:@{@"mapView": @(mapView.hash)}];
  
}

//endregion

@end
