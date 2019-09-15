#import "AmapBaseFlutterPlugin.h"

typedef void (^Handler)(NSObject <FlutterPluginRegistrar> *, NSDictionary<NSString *, NSObject *> *, FlutterResult);

NSMutableDictionary<NSNumber *, NSObject *> *REF_MAP;

@implementation AmapBaseFlutterPlugin {
  NSObject <FlutterPluginRegistrar> * _registrar;
}

- (instancetype) initWithFlutterPluginRegistrar: (NSObject <FlutterPluginRegistrar> *) registrar {
  self = [super init];
  if (self) {
    _registrar = registrar;
  }

  return self;
}

+ (void)registerWithRegistrar:(NSObject <FlutterPluginRegistrar> *)registrar {
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"me.yohom/amap_base_flutter"
            binaryMessenger:[registrar messenger]];

  [registrar addMethodCallDelegate:[[AmapBaseFlutterPlugin alloc] initWithFlutterPluginRegistrar:registrar]
                           channel:channel];

  // 注册View
  [registrar registerViewFactory: [[MAAnnotationViewFactory alloc] initWithRegistrar:registrar] withId: @"me.yohom/MAAnnotationView"];
  [registrar registerViewFactory: [[MACustomCalloutViewFactory alloc] initWithRegistrar:registrar] withId: @"me.yohom/MACustomCalloutView"];
  [registrar registerViewFactory: [[MAMapViewFactory alloc] initWithRegistrar:registrar] withId: @"me.yohom/MAMapView"];
}

// Method Handlers
- (void)handleMethodCall:(FlutterMethodCall *)methodCall result:(FlutterResult)methodResult {
  // 引用Map
  REF_MAP = @{}.mutableCopy;

  // 处理方法们
  NSDictionary<NSString *, Handler> *_handlerMap = @{
    @"AMapURLSearch::getLatestAMapApp": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: AMapURLSearch::getLatestAMapApp(暂未实现参数打印)");
    
        // 开始调用
        [AMapURLSearch getLatestAMapApp ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"AMapURLSearch::openAMapNavigation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        AMapNaviConfig* config = (AMapNaviConfig*) REF_MAP[@([args[@"config"] integerValue])];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: AMapURLSearch::openAMapNavigation(暂未实现参数打印)");
    
        // 开始调用
        BOOL result = [AMapURLSearch openAMapNavigation: config];
    
        // 调用结果
        methodResult(@"success");
    },
    @"AMapURLSearch::openAMapRouteSearch": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        AMapRouteConfig* config = (AMapRouteConfig*) REF_MAP[@([args[@"config"] integerValue])];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: AMapURLSearch::openAMapRouteSearch(暂未实现参数打印)");
    
        // 开始调用
        BOOL result = [AMapURLSearch openAMapRouteSearch: config];
    
        // 调用结果
        methodResult(@"success");
    },
    @"AMapURLSearch::openAMapPOISearch": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        AMapPOIConfig* config = (AMapPOIConfig*) REF_MAP[@([args[@"config"] integerValue])];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: AMapURLSearch::openAMapPOISearch(暂未实现参数打印)");
    
        // 开始调用
        BOOL result = [AMapURLSearch openAMapPOISearch: config];
    
        // 调用结果
        methodResult(@"success");
    },
    @"AMapServices::sharedServices": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: AMapServices::sharedServices(暂未实现参数打印)");
    
        // 开始调用
        AMapServices* result = [AMapServices sharedServices];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAMapStatus::statusWithCenterCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordinateValue = (NSValue*) REF_MAP[@([args[@"coordinate"] integerValue])];
        CLLocationCoordinate2D coordinate;
        [coordinateValue getValue:&coordinate];
        // jsonable参数
        CGFloat zoomLevel = [args[@"zoomLevel"] floatValue];
        // jsonable参数
        CGFloat rotationDegree = [args[@"rotationDegree"] floatValue];
        // jsonable参数
        CGFloat cameraDegree = [args[@"cameraDegree"] floatValue];
        // 结构体参数
        NSValue* screenAnchorValue = (NSValue*) REF_MAP[@([args[@"screenAnchor"] integerValue])];
        CGPoint screenAnchor;
        [screenAnchorValue getValue:&screenAnchor];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapStatus::statusWithCenterCoordinate(暂未实现参数打印)");
    
        // 开始调用
        MAMapStatus* result = [MAMapStatus statusWithCenterCoordinate: coordinate zoomLevel: zoomLevel rotationDegree: rotationDegree cameraDegree: cameraDegree screenAnchor: screenAnchor];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MACircle::circleWithMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* mapRectValue = (NSValue*) REF_MAP[@([args[@"mapRect"] integerValue])];
        MAMapRect mapRect;
        [mapRectValue getValue:&mapRect];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MACircle::circleWithMapRect(暂未实现参数打印)");
    
        // 开始调用
        MACircle* result = [MACircle circleWithMapRect: mapRect];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAAnnotation::setCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* newCoordinateValue = (NSValue*) REF_MAP[@([args[@"newCoordinate"] integerValue])];
        CLLocationCoordinate2D newCoordinate;
        [newCoordinateValue getValue:&newCoordinate];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAAnnotation> ref = (id<MAAnnotation>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnnotation@%@::setCoordinate(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref setCoordinate : newCoordinate];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnimatableAnnotation::step": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat timeDelta = [args[@"timeDelta"] floatValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAAnimatableAnnotation> ref = (id<MAAnimatableAnnotation>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnimatableAnnotation@%@::step(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref step : timeDelta];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnimatableAnnotation::isAnimationFinished": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAAnimatableAnnotation> ref = (id<MAAnimatableAnnotation>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnimatableAnnotation@%@::isAnimationFinished(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref isAnimationFinished];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnimatableAnnotation::shouldAnimationStart": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAAnimatableAnnotation> ref = (id<MAAnimatableAnnotation>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnimatableAnnotation@%@::shouldAnimationStart(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref shouldAnimationStart];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnimatableAnnotation::rotateDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAAnimatableAnnotation> ref = (id<MAAnimatableAnnotation>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnimatableAnnotation@%@::rotateDegree(暂未实现参数打印)", @(refId));
    
        // 开始调用
        CLLocationDirection result = [ref rotateDegree];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAPolygon::polygonWithCoordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordsValue = (NSValue*) REF_MAP[@([args[@"coords"] integerValue])];
        CLLocationCoordinate2D* coords;
        [coordsValue getValue:&coords];
        // jsonable参数
        NSUInteger count = [args[@"count"] unsignedIntegerValue];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MAPolygon::polygonWithCoordinates(暂未实现参数打印)");
    
        // 开始调用
        MAPolygon* result = [MAPolygon polygonWithCoordinates: coords count: count];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAPolygon::polygonWithPoints": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* pointsValue = (NSValue*) REF_MAP[@([args[@"points"] integerValue])];
        MAMapPoint* points;
        [pointsValue getValue:&points];
        // jsonable参数
        NSUInteger count = [args[@"count"] unsignedIntegerValue];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MAPolygon::polygonWithPoints(暂未实现参数打印)");
    
        // 开始调用
        MAPolygon* result = [MAPolygon polygonWithPoints: points count: count];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAPolygon::setPolygonWithPoints": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* pointsValue = (NSValue*) REF_MAP[@([args[@"points"] integerValue])];
        MAMapPoint* points;
        [pointsValue getValue:&points];
        // jsonable参数
        NSInteger count = [args[@"count"] integerValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolygon * ref = (MAPolygon *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAPolygon@%@::setPolygonWithPoints(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref setPolygonWithPoints: points count: count];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAPolygon::setPolygonWithCoordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordsValue = (NSValue*) REF_MAP[@([args[@"coords"] integerValue])];
        CLLocationCoordinate2D* coords;
        [coordsValue getValue:&coords];
        // jsonable参数
        NSInteger count = [args[@"count"] integerValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolygon * ref = (MAPolygon *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAPolygon@%@::setPolygonWithCoordinates(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref setPolygonWithCoordinates: coords count: count];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleOverlay::particleOverlayWithOption": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAParticleOverlayOptions* option = (MAParticleOverlayOptions*) REF_MAP[@([args[@"option"] integerValue])];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleOverlay::particleOverlayWithOption(暂未实现参数打印)");
    
        // 开始调用
        MAParticleOverlay* result = [MAParticleOverlay particleOverlayWithOption: option];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAParticleOverlay::updateOverlayOption": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAParticleOverlayOptions* overlayOption = (MAParticleOverlayOptions*) REF_MAP[@([args[@"overlayOption"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlay * ref = (MAParticleOverlay *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleOverlay@%@::updateOverlayOption(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref updateOverlayOption : overlayOption];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAPolyline::polylineWithPoints": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* pointsValue = (NSValue*) REF_MAP[@([args[@"points"] integerValue])];
        MAMapPoint* points;
        [pointsValue getValue:&points];
        // jsonable参数
        NSUInteger count = [args[@"count"] unsignedIntegerValue];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MAPolyline::polylineWithPoints(暂未实现参数打印)");
    
        // 开始调用
        MAPolyline* result = [MAPolyline polylineWithPoints: points count: count];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAPolyline::polylineWithCoordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordsValue = (NSValue*) REF_MAP[@([args[@"coords"] integerValue])];
        CLLocationCoordinate2D* coords;
        [coordsValue getValue:&coords];
        // jsonable参数
        NSUInteger count = [args[@"count"] unsignedIntegerValue];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MAPolyline::polylineWithCoordinates(暂未实现参数打印)");
    
        // 开始调用
        MAPolyline* result = [MAPolyline polylineWithCoordinates: coords count: count];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAPolyline::setPolylineWithPoints": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* pointsValue = (NSValue*) REF_MAP[@([args[@"points"] integerValue])];
        MAMapPoint* points;
        [pointsValue getValue:&points];
        // jsonable参数
        NSInteger count = [args[@"count"] integerValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolyline * ref = (MAPolyline *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAPolyline@%@::setPolylineWithPoints(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref setPolylineWithPoints: points count: count];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAPolyline::setPolylineWithCoordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordsValue = (NSValue*) REF_MAP[@([args[@"coords"] integerValue])];
        CLLocationCoordinate2D* coords;
        [coordsValue getValue:&coords];
        // jsonable参数
        NSInteger count = [args[@"count"] integerValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolyline * ref = (MAPolyline *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAPolyline@%@::setPolylineWithCoordinates(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref setPolylineWithCoordinates: coords count: count];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnimatedAnnotation::addMoveAnimationWithKeyCoordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordinatesValue = (NSValue*) REF_MAP[@([args[@"coordinates"] integerValue])];
        CLLocationCoordinate2D* coordinates;
        [coordinatesValue getValue:&coordinates];
        // jsonable参数
        NSUInteger count = [args[@"count"] unsignedIntegerValue];
        // jsonable参数
        CGFloat duration = [args[@"duration"] floatValue];
        // jsonable参数
        NSString* name = (NSString*) args[@"name"];
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnimatedAnnotation * ref = (MAAnimatedAnnotation *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnimatedAnnotation@%@::addMoveAnimationWithKeyCoordinates(暂未实现参数打印)", @(refId));
    
        // 开始调用
        MAAnnotationMoveAnimation* result = [ref addMoveAnimationWithKeyCoordinates: coordinates count: count withDuration: duration withName: name completeCallback: nil /* lambda回调暂时不支持 */];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAAnimatedAnnotation::setNeedsStart": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnimatedAnnotation * ref = (MAAnimatedAnnotation *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnimatedAnnotation@%@::setNeedsStart(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref setNeedsStart ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MATileOverlayRenderer::reloadData": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlayRenderer * ref = (MATileOverlayRenderer *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MATileOverlayRenderer@%@::reloadData(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref reloadData ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAGeodesicPolyline::polylineWithPoints": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* pointsValue = (NSValue*) REF_MAP[@([args[@"points"] integerValue])];
        MAMapPoint* points;
        [pointsValue getValue:&points];
        // jsonable参数
        NSUInteger count = [args[@"count"] unsignedIntegerValue];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MAGeodesicPolyline::polylineWithPoints(暂未实现参数打印)");
    
        // 开始调用
        MAGeodesicPolyline* result = [MAGeodesicPolyline polylineWithPoints: points count: count];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAGeodesicPolyline::polylineWithCoordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordsValue = (NSValue*) REF_MAP[@([args[@"coords"] integerValue])];
        CLLocationCoordinate2D* coords;
        [coordsValue getValue:&coords];
        // jsonable参数
        NSUInteger count = [args[@"count"] unsignedIntegerValue];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MAGeodesicPolyline::polylineWithCoordinates(暂未实现参数打印)");
    
        // 开始调用
        MAGeodesicPolyline* result = [MAGeodesicPolyline polylineWithCoordinates: coords count: count];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAGeodesicPolyline::setPolylineWithPoints": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* pointsValue = (NSValue*) REF_MAP[@([args[@"points"] integerValue])];
        MAMapPoint* points;
        [pointsValue getValue:&points];
        // jsonable参数
        NSInteger count = [args[@"count"] integerValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAGeodesicPolyline * ref = (MAGeodesicPolyline *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAGeodesicPolyline@%@::setPolylineWithPoints(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref setPolylineWithPoints: points count: count];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAGeodesicPolyline::setPolylineWithCoordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordsValue = (NSValue*) REF_MAP[@([args[@"coords"] integerValue])];
        CLLocationCoordinate2D* coords;
        [coordsValue getValue:&coords];
        // jsonable参数
        NSInteger count = [args[@"count"] integerValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAGeodesicPolyline * ref = (MAGeodesicPolyline *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAGeodesicPolyline@%@::setPolylineWithCoordinates(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref setPolylineWithCoordinates: coords count: count];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MATraceDelegate::mapViewRequireLocationAuth": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        CLLocationManager* locationManager = (CLLocationManager*) REF_MAP[@([args[@"locationManager"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MATraceDelegate> ref = (id<MATraceDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MATraceDelegate@%@::mapViewRequireLocationAuth(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref mapViewRequireLocationAuth : locationManager];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MATraceManager::sharedInstance": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MATraceManager::sharedInstance(暂未实现参数打印)");
    
        // 开始调用
        MATraceManager* result = [MATraceManager sharedInstance];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MATraceManager::stopTrace": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceManager * ref = (MATraceManager *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MATraceManager@%@::stopTrace(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref stopTrace ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MATraceManager::start": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceManager * ref = (MATraceManager *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MATraceManager@%@::start(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref start ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MATraceManager::stop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceManager * ref = (MATraceManager *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MATraceManager@%@::stop(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref stop ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMultiPointOverlayRendererDelegate::multiPointOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMultiPointOverlayRenderer* renderer = (MAMultiPointOverlayRenderer*) REF_MAP[@([args[@"renderer"] integerValue])];
        // 引用参数
        MAMultiPointItem* item = (MAMultiPointItem*) REF_MAP[@([args[@"item"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMultiPointOverlayRendererDelegate> ref = (id<MAMultiPointOverlayRendererDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMultiPointOverlayRendererDelegate@%@::multiPointOverlayRenderer(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref multiPointOverlayRenderer : renderer didItemTapped: item];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnnotationMoveAnimation::name": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation * ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnnotationMoveAnimation@%@::name(暂未实现参数打印)", @(refId));
    
        // 开始调用
        NSString* result = [ref name];
    
        // 调用结果
        methodResult(result);
    },
    @"MAAnnotationMoveAnimation::coordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation * ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnnotationMoveAnimation@%@::coordinates(暂未实现参数打印)", @(refId));
    
        // 开始调用
        CLLocationCoordinate2D* result = [ref coordinates];
    
        // 调用结果
        NSValue* resultValue = [NSValue value:&result withObjCType:@encode(CLLocationCoordinate2D*)];
        REF_MAP[@(resultValue.hash)] = resultValue;
    
        methodResult(@(resultValue.hash));
    },
    @"MAAnnotationMoveAnimation::count": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation * ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnnotationMoveAnimation@%@::count(暂未实现参数打印)", @(refId));
    
        // 开始调用
        NSUInteger result = [ref count];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnnotationMoveAnimation::duration": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation * ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnnotationMoveAnimation@%@::duration(暂未实现参数打印)", @(refId));
    
        // 开始调用
        CGFloat result = [ref duration];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnnotationMoveAnimation::elapsedTime": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation * ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnnotationMoveAnimation@%@::elapsedTime(暂未实现参数打印)", @(refId));
    
        // 开始调用
        CGFloat result = [ref elapsedTime];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnnotationMoveAnimation::cancel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation * ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnnotationMoveAnimation@%@::cancel(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref cancel ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnnotationMoveAnimation::isCancelled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation * ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnnotationMoveAnimation@%@::isCancelled(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref isCancelled];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnnotationMoveAnimation::passedPointCount": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation * ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAAnnotationMoveAnimation@%@::passedPointCount(暂未实现参数打印)", @(refId));
    
        // 开始调用
        NSInteger result = [ref passedPointCount];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MATileOverlay::cancelLoadOfTileAtPath": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* pathValue = (NSValue*) REF_MAP[@([args[@"path"] integerValue])];
        MATileOverlayPath path;
        [pathValue getValue:&path];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MATileOverlay@%@::cancelLoadOfTileAtPath(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref cancelLoadOfTileAtPath : path];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::sharedOfflineMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MAOfflineMap::sharedOfflineMap(暂未实现参数打印)");
    
        // 开始调用
        MAOfflineMap* result = [MAOfflineMap sharedOfflineMap];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAOfflineMap::setupWithCompletionBlock": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap * ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAOfflineMap@%@::setupWithCompletionBlock(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref setupWithCompletionBlock : nil /* lambda回调暂时不支持 */];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::isDownloadingForItem": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAOfflineItem* item = (MAOfflineItem*) REF_MAP[@([args[@"item"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap * ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAOfflineMap@%@::isDownloadingForItem(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref isDownloadingForItem: item];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::pauseItem": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAOfflineItem* item = (MAOfflineItem*) REF_MAP[@([args[@"item"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap * ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAOfflineMap@%@::pauseItem(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref pauseItem: item];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::deleteItem": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAOfflineItem* item = (MAOfflineItem*) REF_MAP[@([args[@"item"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap * ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAOfflineMap@%@::deleteItem(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref deleteItem : item];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::cancelAll": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap * ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAOfflineMap@%@::cancelAll(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref cancelAll ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::clearDisk": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap * ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAOfflineMap@%@::clearDisk(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref clearDisk ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::isDownloadingForCity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAOfflineCity* city = (MAOfflineCity*) REF_MAP[@([args[@"city"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap * ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAOfflineMap@%@::isDownloadingForCity(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref isDownloadingForCity: city];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::pause": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAOfflineCity* city = (MAOfflineCity*) REF_MAP[@([args[@"city"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap * ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAOfflineMap@%@::pause(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref pause : city];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleVelocityGenerate::getX": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAParticleVelocityGenerate> ref = (id<MAParticleVelocityGenerate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleVelocityGenerate@%@::getX(暂未实现参数打印)", @(refId));
    
        // 开始调用
        CGFloat result = [ref getX];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleVelocityGenerate::getY": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAParticleVelocityGenerate> ref = (id<MAParticleVelocityGenerate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleVelocityGenerate@%@::getY(暂未实现参数打印)", @(refId));
    
        // 开始调用
        CGFloat result = [ref getY];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleVelocityGenerate::getZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAParticleVelocityGenerate> ref = (id<MAParticleVelocityGenerate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleVelocityGenerate@%@::getZ(暂未实现参数打印)", @(refId));
    
        // 开始调用
        CGFloat result = [ref getZ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleRotationGenerate::getRotate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAParticleRotationGenerate> ref = (id<MAParticleRotationGenerate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleRotationGenerate@%@::getRotate(暂未实现参数打印)", @(refId));
    
        // 开始调用
        float result = [ref getRotate];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleSizeGenerate::getSizeX": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        float timeFrame = [args[@"timeFrame"] floatValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAParticleSizeGenerate> ref = (id<MAParticleSizeGenerate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleSizeGenerate@%@::getSizeX(暂未实现参数打印)", @(refId));
    
        // 开始调用
        float result = [ref getSizeX: timeFrame];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleSizeGenerate::getSizeY": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        float timeFrame = [args[@"timeFrame"] floatValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAParticleSizeGenerate> ref = (id<MAParticleSizeGenerate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleSizeGenerate@%@::getSizeY(暂未实现参数打印)", @(refId));
    
        // 开始调用
        float result = [ref getSizeY: timeFrame];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleSizeGenerate::getSizeZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        float timeFrame = [args[@"timeFrame"] floatValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAParticleSizeGenerate> ref = (id<MAParticleSizeGenerate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleSizeGenerate@%@::getSizeZ(暂未实现参数打印)", @(refId));
    
        // 开始调用
        float result = [ref getSizeZ: timeFrame];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleShapeModule::isRatioEnable": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAParticleShapeModule> ref = (id<MAParticleShapeModule>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleShapeModule@%@::isRatioEnable(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref isRatioEnable];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleOverLifeModule::setVelocityOverLife": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        id<MAParticleVelocityGenerate> velocity = (id<MAParticleVelocityGenerate>) REF_MAP[@([args[@"velocity"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverLifeModule * ref = (MAParticleOverLifeModule *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleOverLifeModule@%@::setVelocityOverLife(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref setVelocityOverLife : velocity];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleOverLifeModule::setRotationOverLife": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        id<MAParticleRotationGenerate> rotation = (id<MAParticleRotationGenerate>) REF_MAP[@([args[@"rotation"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverLifeModule * ref = (MAParticleOverLifeModule *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleOverLifeModule@%@::setRotationOverLife(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref setRotationOverLife : rotation];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleOverLifeModule::setSizeOverLife": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        id<MAParticleSizeGenerate> size = (id<MAParticleSizeGenerate>) REF_MAP[@([args[@"size"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverLifeModule * ref = (MAParticleOverLifeModule *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleOverLifeModule@%@::setSizeOverLife(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref setSizeOverLife : size];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAParticleOverLifeModule::setColorOverLife": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        id<MAParticleColorGenerate> color = (id<MAParticleColorGenerate>) REF_MAP[@([args[@"color"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverLifeModule * ref = (MAParticleOverLifeModule *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAParticleOverLifeModule@%@::setColorOverLife(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref setColorOverLife : color];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MACustomBuildingOverlayOption::optionWithCoordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordsValue = (NSValue*) REF_MAP[@([args[@"coords"] integerValue])];
        CLLocationCoordinate2D* coords;
        [coordsValue getValue:&coords];
        // jsonable参数
        NSUInteger count = [args[@"count"] unsignedIntegerValue];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MACustomBuildingOverlayOption::optionWithCoordinates(暂未实现参数打印)");
    
        // 开始调用
        MACustomBuildingOverlayOption* result = [MACustomBuildingOverlayOption optionWithCoordinates: coords count: count];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MACustomBuildingOverlayOption::setOptionWithCoordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordsValue = (NSValue*) REF_MAP[@([args[@"coords"] integerValue])];
        CLLocationCoordinate2D* coords;
        [coordsValue getValue:&coords];
        // jsonable参数
        NSUInteger count = [args[@"count"] unsignedIntegerValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption * ref = (MACustomBuildingOverlayOption *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MACustomBuildingOverlayOption@%@::setOptionWithCoordinates(暂未实现参数打印)", @(refId));
    
        // 开始调用
        BOOL result = [ref setOptionWithCoordinates: coords count: count];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MACustomBuildingOverlay::addCustomOption": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MACustomBuildingOverlayOption* option = (MACustomBuildingOverlayOption*) REF_MAP[@([args[@"option"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlay * ref = (MACustomBuildingOverlay *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MACustomBuildingOverlay@%@::addCustomOption(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref addCustomOption : option];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MACustomBuildingOverlay::removeCustomOption": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MACustomBuildingOverlayOption* option = (MACustomBuildingOverlayOption*) REF_MAP[@([args[@"option"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlay * ref = (MACustomBuildingOverlay *) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MACustomBuildingOverlay@%@::removeCustomOption(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref removeCustomOption : option];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAArc::arcWithStartCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* startCoordinateValue = (NSValue*) REF_MAP[@([args[@"startCoordinate"] integerValue])];
        CLLocationCoordinate2D startCoordinate;
        [startCoordinateValue getValue:&startCoordinate];
        // 结构体参数
        NSValue* passedCoordinateValue = (NSValue*) REF_MAP[@([args[@"passedCoordinate"] integerValue])];
        CLLocationCoordinate2D passedCoordinate;
        [passedCoordinateValue getValue:&passedCoordinate];
        // 结构体参数
        NSValue* endCoordinateValue = (NSValue*) REF_MAP[@([args[@"endCoordinate"] integerValue])];
        CLLocationCoordinate2D endCoordinate;
        [endCoordinateValue getValue:&endCoordinate];
    
        // 调用对象引用
    
    
        // 日志打印
        NSLog(@"fluttify-objc: MAArc::arcWithStartCoordinate(暂未实现参数打印)");
    
        // 开始调用
        MAArc* result = [MAArc arcWithStartCoordinate: startCoordinate passedCoordinate: passedCoordinate endCoordinate: endCoordinate];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAMapViewDelegate::mapViewRegionChanged": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMapView* mapView = (MAMapView*) REF_MAP[@([args[@"mapView"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::mapViewRegionChanged(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref mapViewRegionChanged : mapView];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapViewDelegate::mapView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMapView* mapView = (MAMapView*) REF_MAP[@([args[@"mapView"] integerValue])];
        // jsonable参数
        BOOL animated = [args[@"animated"] boolValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::mapView(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref mapView : mapView regionWillChangeAnimated: animated];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapViewDelegate::mapViewWillStartLoadingMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMapView* mapView = (MAMapView*) REF_MAP[@([args[@"mapView"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::mapViewWillStartLoadingMap(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref mapViewWillStartLoadingMap : mapView];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapViewDelegate::mapViewDidFinishLoadingMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMapView* mapView = (MAMapView*) REF_MAP[@([args[@"mapView"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::mapViewDidFinishLoadingMap(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref mapViewDidFinishLoadingMap : mapView];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapViewDelegate::mapViewDidFailLoadingMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMapView* mapView = (MAMapView*) REF_MAP[@([args[@"mapView"] integerValue])];
        // 引用参数
        NSError* error = (NSError*) REF_MAP[@([args[@"error"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::mapViewDidFailLoadingMap(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref mapViewDidFailLoadingMap : mapView withError: error];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapViewDelegate::mapViewWillStartLocatingUser": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMapView* mapView = (MAMapView*) REF_MAP[@([args[@"mapView"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::mapViewWillStartLocatingUser(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref mapViewWillStartLocatingUser : mapView];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapViewDelegate::mapViewDidStopLocatingUser": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMapView* mapView = (MAMapView*) REF_MAP[@([args[@"mapView"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::mapViewDidStopLocatingUser(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref mapViewDidStopLocatingUser : mapView];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapViewDelegate::mapViewRequireLocationAuth": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        CLLocationManager* locationManager = (CLLocationManager*) REF_MAP[@([args[@"locationManager"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::mapViewRequireLocationAuth(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref mapViewRequireLocationAuth : locationManager];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapViewDelegate::mapInitComplete": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMapView* mapView = (MAMapView*) REF_MAP[@([args[@"mapView"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::mapInitComplete(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref mapInitComplete : mapView];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapViewDelegate::offlineDataWillReload": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMapView* mapView = (MAMapView*) REF_MAP[@([args[@"mapView"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::offlineDataWillReload(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref offlineDataWillReload : mapView];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapViewDelegate::offlineDataDidReload": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAMapView* mapView = (MAMapView*) REF_MAP[@([args[@"mapView"] integerValue])];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAMapViewDelegate> ref = (id<MAMapViewDelegate>) REF_MAP[@(refId)];
    
        // 日志打印
        NSLog(@"fluttify-objc: MAMapViewDelegate@%@::offlineDataDidReload(暂未实现参数打印)", @(refId));
    
        // 开始调用
        [ref offlineDataDidReload : mapView];
    
        // 调用结果
        methodResult(@"success");
    },
    @"AMapNaviConfig::get_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig * ref = (AMapNaviConfig *) REF_MAP[@(refId)];
    
        methodResult(ref.appScheme);
    },
    
    @"AMapNaviConfig::get_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig * ref = (AMapNaviConfig *) REF_MAP[@(refId)];
    
        methodResult(ref.appName);
    },
    
    @"AMapNaviConfig::get_destination": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig * ref = (AMapNaviConfig *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"AMapNaviConfig::get_strategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig * ref = (AMapNaviConfig *) REF_MAP[@(refId)];
    
        methodResult(@(ref.strategy));
    },
    
    @"AMapRouteConfig::get_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        methodResult(ref.appScheme);
    },
    
    @"AMapRouteConfig::get_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        methodResult(ref.appName);
    },
    
    @"AMapRouteConfig::get_startCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"AMapRouteConfig::get_destinationCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"AMapRouteConfig::get_drivingStrategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        methodResult(@(ref.drivingStrategy));
    },
    
    @"AMapRouteConfig::get_transitStrategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        methodResult(@(ref.transitStrategy));
    },
    
    @"AMapRouteConfig::get_routeType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        methodResult(@(ref.routeType));
    },
    
    @"AMapPOIConfig::get_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig * ref = (AMapPOIConfig *) REF_MAP[@(refId)];
    
        methodResult(ref.appScheme);
    },
    
    @"AMapPOIConfig::get_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig * ref = (AMapPOIConfig *) REF_MAP[@(refId)];
    
        methodResult(ref.appName);
    },
    
    @"AMapPOIConfig::get_keywords": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig * ref = (AMapPOIConfig *) REF_MAP[@(refId)];
    
        methodResult(ref.keywords);
    },
    
    @"AMapPOIConfig::get_leftTopCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig * ref = (AMapPOIConfig *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"AMapPOIConfig::get_rightBottomCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig * ref = (AMapPOIConfig *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"AMapServices::get_apiKey": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices * ref = (AMapServices *) REF_MAP[@(refId)];
    
        methodResult(ref.apiKey);
    },
    
    @"AMapServices::get_enableHTTPS": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices * ref = (AMapServices *) REF_MAP[@(refId)];
    
        methodResult(@(ref.enableHTTPS));
    },
    
    @"AMapServices::get_crashReportEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices * ref = (AMapServices *) REF_MAP[@(refId)];
    
        methodResult(@(ref.crashReportEnabled));
    },
    
    @"AMapServices::get_identifier": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices * ref = (AMapServices *) REF_MAP[@(refId)];
    
        methodResult(ref.identifier);
    },
    
    @"MAOfflineCity::get_cityCode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineCity * ref = (MAOfflineCity *) REF_MAP[@(refId)];
    
        methodResult(ref.cityCode);
    },
    
    @"MAMultiPoint::get_points": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPoint * ref = (MAMultiPoint *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAMultiPoint::get_pointCount": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPoint * ref = (MAMultiPoint *) REF_MAP[@(refId)];
    
        methodResult(@(ref.pointCount));
    },
    
    @"MAMultiPoint::get_cross180Longitude": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPoint * ref = (MAMultiPoint *) REF_MAP[@(refId)];
    
        methodResult(@(ref.cross180Longitude));
    },
    
    @"MAGroundOverlay::get_alpha": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAGroundOverlay * ref = (MAGroundOverlay *) REF_MAP[@(refId)];
    
        methodResult(@(ref.alpha));
    },
    
    @"MAGroundOverlay::get_zoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAGroundOverlay * ref = (MAGroundOverlay *) REF_MAP[@(refId)];
    
        methodResult(@(ref.zoomLevel));
    },
    
    @"MAGroundOverlay::get_bounds": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAGroundOverlay * ref = (MAGroundOverlay *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAPolygonRenderer::get_polygon": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolygonRenderer * ref = (MAPolygonRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.polygon);
    },
    
    @"MAPinAnnotationView::get_pinColor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPinAnnotationView * ref = (MAPinAnnotationView *) REF_MAP[@(refId)];
    
        methodResult(@(ref.pinColor));
    },
    
    @"MAPinAnnotationView::get_animatesDrop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPinAnnotationView * ref = (MAPinAnnotationView *) REF_MAP[@(refId)];
    
        methodResult(@(ref.animatesDrop));
    },
    
    @"MAHeatMapNode::get_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapNode * ref = (MAHeatMapNode *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAHeatMapNode::get_intensity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapNode * ref = (MAHeatMapNode *) REF_MAP[@(refId)];
    
        methodResult(@(ref.intensity));
    },
    
    @"MAHeatMapTileOverlay::get_radius": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay * ref = (MAHeatMapTileOverlay *) REF_MAP[@(refId)];
    
        methodResult(@(ref.radius));
    },
    
    @"MAHeatMapTileOverlay::get_opacity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay * ref = (MAHeatMapTileOverlay *) REF_MAP[@(refId)];
    
        methodResult(@(ref.opacity));
    },
    
    @"MAHeatMapTileOverlay::get_gradient": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay * ref = (MAHeatMapTileOverlay *) REF_MAP[@(refId)];
    
        methodResult(ref.gradient);
    },
    
    @"MAHeatMapTileOverlay::get_allowRetinaAdapting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay * ref = (MAHeatMapTileOverlay *) REF_MAP[@(refId)];
    
        methodResult(@(ref.allowRetinaAdapting));
    },
    
    @"MAMapStatus::get_centerCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus * ref = (MAMapStatus *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAMapStatus::get_zoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus * ref = (MAMapStatus *) REF_MAP[@(refId)];
    
        methodResult(@(ref.zoomLevel));
    },
    
    @"MAMapStatus::get_rotationDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus * ref = (MAMapStatus *) REF_MAP[@(refId)];
    
        methodResult(@(ref.rotationDegree));
    },
    
    @"MAMapStatus::get_cameraDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus * ref = (MAMapStatus *) REF_MAP[@(refId)];
    
        methodResult(@(ref.cameraDegree));
    },
    
    @"MAMapStatus::get_screenAnchor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus * ref = (MAMapStatus *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAPointAnnotation::get_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPointAnnotation * ref = (MAPointAnnotation *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAPointAnnotation::get_isLockedToScreen": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPointAnnotation * ref = (MAPointAnnotation *) REF_MAP[@(refId)];
    
        methodResult(@(ref.isLockedToScreen));
    },
    
    @"MAPointAnnotation::get_lockedScreenPoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPointAnnotation * ref = (MAPointAnnotation *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MACircle::get_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACircle * ref = (MACircle *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MACircle::get_boundingMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACircle * ref = (MACircle *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAArcRenderer::get_arc": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAArcRenderer * ref = (MAArcRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.arc);
    },
    
    @"MAAnnotation::get_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAAnnotation> ref = (id<MAAnnotation>) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAAnnotation::get_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAAnnotation> ref = (id<MAAnnotation>) REF_MAP[@(refId)];
    
        methodResult(ref.title);
    },
    
    @"MAAnnotation::get_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAAnnotation> ref = (id<MAAnnotation>) REF_MAP[@(refId)];
    
        methodResult(ref.subtitle);
    },
    
    @"MAMapCustomStyleOptions::get_styleId": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapCustomStyleOptions * ref = (MAMapCustomStyleOptions *) REF_MAP[@(refId)];
    
        methodResult(ref.styleId);
    },
    
    @"MAParticleOverlay::get_overlayOption": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlay * ref = (MAParticleOverlay *) REF_MAP[@(refId)];
    
        methodResult(ref.overlayOption);
    },
    
    @"MAMultiColoredPolylineRenderer::get_multiPolyline": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiColoredPolylineRenderer * ref = (MAMultiColoredPolylineRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.multiPolyline);
    },
    
    @"MAMultiColoredPolylineRenderer::get_isGradient": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiColoredPolylineRenderer * ref = (MAMultiColoredPolylineRenderer *) REF_MAP[@(refId)];
    
        methodResult(@(ref.isGradient));
    },
    
    @"MAAnimatedAnnotation::get_movingDirection": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnimatedAnnotation * ref = (MAAnimatedAnnotation *) REF_MAP[@(refId)];
    
        methodResult(@(ref.movingDirection));
    },
    
    @"MAOverlay::get_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAOverlay> ref = (id<MAOverlay>) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAOverlay::get_boundingMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAOverlay> ref = (id<MAOverlay>) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAMultiTexturePolylineRenderer::get_multiPolyline": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiTexturePolylineRenderer * ref = (MAMultiTexturePolylineRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.multiPolyline);
    },
    
    @"MATileOverlayRenderer::get_tileOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlayRenderer * ref = (MATileOverlayRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.tileOverlay);
    },
    
    @"MAOfflineItem::get_name": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItem * ref = (MAOfflineItem *) REF_MAP[@(refId)];
    
        methodResult(ref.name);
    },
    
    @"MAOfflineItem::get_jianpin": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItem * ref = (MAOfflineItem *) REF_MAP[@(refId)];
    
        methodResult(ref.jianpin);
    },
    
    @"MAOfflineItem::get_pinyin": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItem * ref = (MAOfflineItem *) REF_MAP[@(refId)];
    
        methodResult(ref.pinyin);
    },
    
    @"MAOfflineItem::get_adcode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItem * ref = (MAOfflineItem *) REF_MAP[@(refId)];
    
        methodResult(ref.adcode);
    },
    
    @"MAOfflineItem::get_itemStatus": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItem * ref = (MAOfflineItem *) REF_MAP[@(refId)];
    
        methodResult(@(ref.itemStatus));
    },
    
    @"MATouchPoi::get_name": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATouchPoi * ref = (MATouchPoi *) REF_MAP[@(refId)];
    
        methodResult(ref.name);
    },
    
    @"MATouchPoi::get_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATouchPoi * ref = (MATouchPoi *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MATouchPoi::get_uid": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATouchPoi * ref = (MATouchPoi *) REF_MAP[@(refId)];
    
        methodResult(ref.uid);
    },
    
    @"MATraceManager::get_delegate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceManager * ref = (MATraceManager *) REF_MAP[@(refId)];
    
        methodResult(ref.delegate);
    },
    
    @"MAMultiPointOverlayRenderer::get_delegate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointOverlayRenderer * ref = (MAMultiPointOverlayRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.delegate);
    },
    
    @"MAMultiPointOverlayRenderer::get_anchor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointOverlayRenderer * ref = (MAMultiPointOverlayRenderer *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAMultiPointOverlayRenderer::get_multiPointOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointOverlayRenderer * ref = (MAMultiPointOverlayRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.multiPointOverlay);
    },
    
    @"MAIndoorFloorInfo::get_floorName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorFloorInfo * ref = (MAIndoorFloorInfo *) REF_MAP[@(refId)];
    
        methodResult(ref.floorName);
    },
    
    @"MAIndoorFloorInfo::get_floorIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorFloorInfo * ref = (MAIndoorFloorInfo *) REF_MAP[@(refId)];
    
        methodResult(@(ref.floorIndex));
    },
    
    @"MAIndoorFloorInfo::get_floorNona": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorFloorInfo * ref = (MAIndoorFloorInfo *) REF_MAP[@(refId)];
    
        methodResult(ref.floorNona);
    },
    
    @"MAIndoorFloorInfo::get_isPark": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorFloorInfo * ref = (MAIndoorFloorInfo *) REF_MAP[@(refId)];
    
        methodResult(@(ref.isPark));
    },
    
    @"MAIndoorInfo::get_cnName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo * ref = (MAIndoorInfo *) REF_MAP[@(refId)];
    
        methodResult(ref.cnName);
    },
    
    @"MAIndoorInfo::get_enName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo * ref = (MAIndoorInfo *) REF_MAP[@(refId)];
    
        methodResult(ref.enName);
    },
    
    @"MAIndoorInfo::get_poiID": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo * ref = (MAIndoorInfo *) REF_MAP[@(refId)];
    
        methodResult(ref.poiID);
    },
    
    @"MAIndoorInfo::get_buildingType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo * ref = (MAIndoorInfo *) REF_MAP[@(refId)];
    
        methodResult(ref.buildingType);
    },
    
    @"MAIndoorInfo::get_activeFloorIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo * ref = (MAIndoorInfo *) REF_MAP[@(refId)];
    
        methodResult(@(ref.activeFloorIndex));
    },
    
    @"MAIndoorInfo::get_activeFloorInfoIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo * ref = (MAIndoorInfo *) REF_MAP[@(refId)];
    
        methodResult(@(ref.activeFloorInfoIndex));
    },
    
    @"MAIndoorInfo::get_numberOfFloor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo * ref = (MAIndoorInfo *) REF_MAP[@(refId)];
    
        methodResult(@(ref.numberOfFloor));
    },
    
    @"MAIndoorInfo::get_numberOfParkFloor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo * ref = (MAIndoorInfo *) REF_MAP[@(refId)];
    
        methodResult(@(ref.numberOfParkFloor));
    },
    
    @"MAPolylineRenderer::get_polyline": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolylineRenderer * ref = (MAPolylineRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.polyline);
    },
    
    @"MAPolylineRenderer::get_is3DArrowLine": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolylineRenderer * ref = (MAPolylineRenderer *) REF_MAP[@(refId)];
    
        methodResult(@(ref.is3DArrowLine));
    },
    
    @"MAShape::get_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAShape * ref = (MAShape *) REF_MAP[@(refId)];
    
        methodResult(ref.title);
    },
    
    @"MAShape::get_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAShape * ref = (MAShape *) REF_MAP[@(refId)];
    
        methodResult(ref.subtitle);
    },
    
    @"MATileOverlay::get_minimumZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        methodResult(@(ref.minimumZ));
    },
    
    @"MATileOverlay::get_maximumZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        methodResult(@(ref.maximumZ));
    },
    
    @"MATileOverlay::get_URLTemplate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        methodResult(ref.URLTemplate);
    },
    
    @"MATileOverlay::get_canReplaceMapContent": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        methodResult(@(ref.canReplaceMapContent));
    },
    
    @"MATileOverlay::get_boundingMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MATileOverlay::get_disableOffScreenTileLoading": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        methodResult(@(ref.disableOffScreenTileLoading));
    },
    
    @"MAOfflineItemCommonCity::get_province": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItemCommonCity * ref = (MAOfflineItemCommonCity *) REF_MAP[@(refId)];
    
        methodResult(ref.province);
    },
    
    @"MAOfflineMap::get_nationWide": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap * ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        methodResult(ref.nationWide);
    },
    
    @"MAOfflineMap::get_version": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap * ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        methodResult(ref.version);
    },
    
    @"MACircleRenderer::get_circle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACircleRenderer * ref = (MACircleRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.circle);
    },
    
    @"MAParticleOverlayRenderer::get_particleOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayRenderer * ref = (MAParticleOverlayRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.particleOverlay);
    },
    
    @"MAParticleOverlayOptions::get_visibile": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        methodResult(@(ref.visibile));
    },
    
    @"MAParticleOverlayOptions::get_loop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        methodResult(@(ref.loop));
    },
    
    @"MAParticleOverlayOptions::get_maxParticles": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        methodResult(@(ref.maxParticles));
    },
    
    @"MAParticleOverlayOptions::get_particleStartColor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        methodResult(ref.particleStartColor);
    },
    
    @"MAParticleOverlayOptions::get_particleStartSpeed": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        methodResult(ref.particleStartSpeed);
    },
    
    @"MAParticleOverlayOptions::get_particleEmissionModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        methodResult(ref.particleEmissionModule);
    },
    
    @"MAParticleOverlayOptions::get_particleShapeModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        methodResult(ref.particleShapeModule);
    },
    
    @"MAParticleOverlayOptions::get_particleOverLifeModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        methodResult(ref.particleOverLifeModule);
    },
    
    @"MAUserLocation::get_isUpdating": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocation * ref = (MAUserLocation *) REF_MAP[@(refId)];
    
        methodResult(@(ref.isUpdating));
    },
    
    @"MAMultiPointItem::get_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem * ref = (MAMultiPointItem *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAMultiPointItem::get_customID": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem * ref = (MAMultiPointItem *) REF_MAP[@(refId)];
    
        methodResult(ref.customID);
    },
    
    @"MAMultiPointItem::get_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem * ref = (MAMultiPointItem *) REF_MAP[@(refId)];
    
        methodResult(ref.title);
    },
    
    @"MAMultiPointItem::get_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem * ref = (MAMultiPointItem *) REF_MAP[@(refId)];
    
        methodResult(ref.subtitle);
    },
    
    @"MACustomBuildingOverlayOption::get_height": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption * ref = (MACustomBuildingOverlayOption *) REF_MAP[@(refId)];
    
        methodResult(@(ref.height));
    },
    
    @"MACustomBuildingOverlayOption::get_heightScale": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption * ref = (MACustomBuildingOverlayOption *) REF_MAP[@(refId)];
    
        methodResult(@(ref.heightScale));
    },
    
    @"MACustomBuildingOverlayOption::get_visibile": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption * ref = (MACustomBuildingOverlayOption *) REF_MAP[@(refId)];
    
        methodResult(@(ref.visibile));
    },
    
    @"MACustomBuildingOverlay::get_defaultOption": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlay * ref = (MACustomBuildingOverlay *) REF_MAP[@(refId)];
    
        methodResult(ref.defaultOption);
    },
    
    @"MATraceLocation::get_loc": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation * ref = (MATraceLocation *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MATraceLocation::get_angle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation * ref = (MATraceLocation *) REF_MAP[@(refId)];
    
        methodResult(@(ref.angle));
    },
    
    @"MATraceLocation::get_speed": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation * ref = (MATraceLocation *) REF_MAP[@(refId)];
    
        methodResult(@(ref.speed));
    },
    
    @"MATraceLocation::get_time": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation * ref = (MATraceLocation *) REF_MAP[@(refId)];
    
        methodResult(@(ref.time));
    },
    
    @"MAArc::get_startCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAArc * ref = (MAArc *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAArc::get_passedCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAArc * ref = (MAArc *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAArc::get_endCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAArc * ref = (MAArc *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAArc::get_boundingMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAArc * ref = (MAArc *) REF_MAP[@(refId)];
    
        methodResult(nil/* 结构体getter暂时不支持 */);
    },
    
    @"MAUserLocationRepresentation::get_showsAccuracyRing": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation * ref = (MAUserLocationRepresentation *) REF_MAP[@(refId)];
    
        methodResult(@(ref.showsAccuracyRing));
    },
    
    @"MAUserLocationRepresentation::get_showsHeadingIndicator": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation * ref = (MAUserLocationRepresentation *) REF_MAP[@(refId)];
    
        methodResult(@(ref.showsHeadingIndicator));
    },
    
    @"MAUserLocationRepresentation::get_lineWidth": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation * ref = (MAUserLocationRepresentation *) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineWidth));
    },
    
    @"MAUserLocationRepresentation::get_enablePulseAnnimation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation * ref = (MAUserLocationRepresentation *) REF_MAP[@(refId)];
    
        methodResult(@(ref.enablePulseAnnimation));
    },
    
    @"MAOverlayPathRenderer::get_lineWidth": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineWidth));
    },
    
    @"MAOverlayPathRenderer::get_lineJoinType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineJoinType));
    },
    
    @"MAOverlayPathRenderer::get_lineCapType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineCapType));
    },
    
    @"MAOverlayPathRenderer::get_miterLimit": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        methodResult(@(ref.miterLimit));
    },
    
    @"MAOverlayPathRenderer::get_lineDash": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineDash));
    },
    
    @"MAOverlayPathRenderer::get_lineDashType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineDashType));
    },
    
    @"MAGroundOverlayRenderer::get_groundOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAGroundOverlayRenderer * ref = (MAGroundOverlayRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.groundOverlay);
    },
    
    @"MACustomBuildingOverlayRenderer::get_customBuildingOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayRenderer * ref = (MACustomBuildingOverlayRenderer *) REF_MAP[@(refId)];
    
        methodResult(ref.customBuildingOverlay);
    },
    
    @"AMapNaviConfig::set_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appScheme = (NSString *) args[@"appScheme"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig * ref = (AMapNaviConfig *) REF_MAP[@(refId)];
    
        ref.appScheme = appScheme;
        methodResult(@"success");
    },
    
    @"AMapNaviConfig::set_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appName = (NSString *) args[@"appName"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig * ref = (AMapNaviConfig *) REF_MAP[@(refId)];
    
        ref.appName = appName;
        methodResult(@"success");
    },
    
    @"AMapNaviConfig::set_destination": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* destinationValue = (NSValue*) REF_MAP[@([args[@"destination"] integerValue])];
        CLLocationCoordinate2D destination;
        [destinationValue getValue:&destination];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig * ref = (AMapNaviConfig *) REF_MAP[@(refId)];
    
        ref.destination = destination;
        methodResult(@"success");
    },
    
    @"AMapNaviConfig::set_strategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        AMapDrivingStrategy strategy = (AMapDrivingStrategy) [args[@"strategy"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig * ref = (AMapNaviConfig *) REF_MAP[@(refId)];
    
        ref.strategy = strategy;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appScheme = (NSString *) args[@"appScheme"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        ref.appScheme = appScheme;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appName = (NSString *) args[@"appName"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        ref.appName = appName;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_startCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* startCoordinateValue = (NSValue*) REF_MAP[@([args[@"startCoordinate"] integerValue])];
        CLLocationCoordinate2D startCoordinate;
        [startCoordinateValue getValue:&startCoordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        ref.startCoordinate = startCoordinate;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_destinationCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* destinationCoordinateValue = (NSValue*) REF_MAP[@([args[@"destinationCoordinate"] integerValue])];
        CLLocationCoordinate2D destinationCoordinate;
        [destinationCoordinateValue getValue:&destinationCoordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        ref.destinationCoordinate = destinationCoordinate;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_drivingStrategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        AMapDrivingStrategy drivingStrategy = (AMapDrivingStrategy) [args[@"drivingStrategy"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        ref.drivingStrategy = drivingStrategy;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_transitStrategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        AMapTransitStrategy transitStrategy = (AMapTransitStrategy) [args[@"transitStrategy"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        ref.transitStrategy = transitStrategy;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_routeType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        AMapRouteSearchType routeType = (AMapRouteSearchType) [args[@"routeType"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig * ref = (AMapRouteConfig *) REF_MAP[@(refId)];
    
        ref.routeType = routeType;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appScheme = (NSString *) args[@"appScheme"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig * ref = (AMapPOIConfig *) REF_MAP[@(refId)];
    
        ref.appScheme = appScheme;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appName = (NSString *) args[@"appName"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig * ref = (AMapPOIConfig *) REF_MAP[@(refId)];
    
        ref.appName = appName;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_keywords": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * keywords = (NSString *) args[@"keywords"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig * ref = (AMapPOIConfig *) REF_MAP[@(refId)];
    
        ref.keywords = keywords;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_leftTopCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* leftTopCoordinateValue = (NSValue*) REF_MAP[@([args[@"leftTopCoordinate"] integerValue])];
        CLLocationCoordinate2D leftTopCoordinate;
        [leftTopCoordinateValue getValue:&leftTopCoordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig * ref = (AMapPOIConfig *) REF_MAP[@(refId)];
    
        ref.leftTopCoordinate = leftTopCoordinate;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_rightBottomCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* rightBottomCoordinateValue = (NSValue*) REF_MAP[@([args[@"rightBottomCoordinate"] integerValue])];
        CLLocationCoordinate2D rightBottomCoordinate;
        [rightBottomCoordinateValue getValue:&rightBottomCoordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig * ref = (AMapPOIConfig *) REF_MAP[@(refId)];
    
        ref.rightBottomCoordinate = rightBottomCoordinate;
        methodResult(@"success");
    },
    
    @"AMapServices::set_apiKey": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * apiKey = (NSString *) args[@"apiKey"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices * ref = (AMapServices *) REF_MAP[@(refId)];
    
        ref.apiKey = apiKey;
        methodResult(@"success");
    },
    
    @"AMapServices::set_enableHTTPS": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL enableHTTPS = [args[@"enableHTTPS"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices * ref = (AMapServices *) REF_MAP[@(refId)];
    
        ref.enableHTTPS = enableHTTPS;
        methodResult(@"success");
    },
    
    @"AMapServices::set_crashReportEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL crashReportEnabled = [args[@"crashReportEnabled"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices * ref = (AMapServices *) REF_MAP[@(refId)];
    
        ref.crashReportEnabled = crashReportEnabled;
        methodResult(@"success");
    },
    
    @"MAGroundOverlay::set_alpha": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat alpha = [args[@"alpha"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAGroundOverlay * ref = (MAGroundOverlay *) REF_MAP[@(refId)];
    
        ref.alpha = alpha;
        methodResult(@"success");
    },
    
    @"MAPinAnnotationView::set_pinColor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MAPinAnnotationColor pinColor = (MAPinAnnotationColor) [args[@"pinColor"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPinAnnotationView * ref = (MAPinAnnotationView *) REF_MAP[@(refId)];
    
        ref.pinColor = pinColor;
        methodResult(@"success");
    },
    
    @"MAPinAnnotationView::set_animatesDrop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL animatesDrop = [args[@"animatesDrop"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPinAnnotationView * ref = (MAPinAnnotationView *) REF_MAP[@(refId)];
    
        ref.animatesDrop = animatesDrop;
        methodResult(@"success");
    },
    
    @"MAHeatMapNode::set_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordinateValue = (NSValue*) REF_MAP[@([args[@"coordinate"] integerValue])];
        CLLocationCoordinate2D coordinate;
        [coordinateValue getValue:&coordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapNode * ref = (MAHeatMapNode *) REF_MAP[@(refId)];
    
        ref.coordinate = coordinate;
        methodResult(@"success");
    },
    
    @"MAHeatMapNode::set_intensity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        float intensity = [args[@"intensity"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapNode * ref = (MAHeatMapNode *) REF_MAP[@(refId)];
    
        ref.intensity = intensity;
        methodResult(@"success");
    },
    
    @"MAHeatMapTileOverlay::set_radius": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger radius = [args[@"radius"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay * ref = (MAHeatMapTileOverlay *) REF_MAP[@(refId)];
    
        ref.radius = radius;
        methodResult(@"success");
    },
    
    @"MAHeatMapTileOverlay::set_opacity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat opacity = [args[@"opacity"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay * ref = (MAHeatMapTileOverlay *) REF_MAP[@(refId)];
    
        ref.opacity = opacity;
        methodResult(@"success");
    },
    
    @"MAHeatMapTileOverlay::set_gradient": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAHeatMapGradient * gradient = (MAHeatMapGradient *) REF_MAP[@([args[@"gradient"] integerValue])];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay * ref = (MAHeatMapTileOverlay *) REF_MAP[@(refId)];
    
        ref.gradient = gradient;
        methodResult(@"success");
    },
    
    @"MAHeatMapTileOverlay::set_allowRetinaAdapting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL allowRetinaAdapting = [args[@"allowRetinaAdapting"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay * ref = (MAHeatMapTileOverlay *) REF_MAP[@(refId)];
    
        ref.allowRetinaAdapting = allowRetinaAdapting;
        methodResult(@"success");
    },
    
    @"MAMapStatus::set_centerCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* centerCoordinateValue = (NSValue*) REF_MAP[@([args[@"centerCoordinate"] integerValue])];
        CLLocationCoordinate2D centerCoordinate;
        [centerCoordinateValue getValue:&centerCoordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus * ref = (MAMapStatus *) REF_MAP[@(refId)];
    
        ref.centerCoordinate = centerCoordinate;
        methodResult(@"success");
    },
    
    @"MAMapStatus::set_zoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat zoomLevel = [args[@"zoomLevel"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus * ref = (MAMapStatus *) REF_MAP[@(refId)];
    
        ref.zoomLevel = zoomLevel;
        methodResult(@"success");
    },
    
    @"MAMapStatus::set_rotationDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat rotationDegree = [args[@"rotationDegree"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus * ref = (MAMapStatus *) REF_MAP[@(refId)];
    
        ref.rotationDegree = rotationDegree;
        methodResult(@"success");
    },
    
    @"MAMapStatus::set_cameraDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat cameraDegree = [args[@"cameraDegree"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus * ref = (MAMapStatus *) REF_MAP[@(refId)];
    
        ref.cameraDegree = cameraDegree;
        methodResult(@"success");
    },
    
    @"MAMapStatus::set_screenAnchor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* screenAnchorValue = (NSValue*) REF_MAP[@([args[@"screenAnchor"] integerValue])];
        CGPoint screenAnchor;
        [screenAnchorValue getValue:&screenAnchor];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus * ref = (MAMapStatus *) REF_MAP[@(refId)];
    
        ref.screenAnchor = screenAnchor;
        methodResult(@"success");
    },
    
    @"MAPointAnnotation::set_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordinateValue = (NSValue*) REF_MAP[@([args[@"coordinate"] integerValue])];
        CLLocationCoordinate2D coordinate;
        [coordinateValue getValue:&coordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPointAnnotation * ref = (MAPointAnnotation *) REF_MAP[@(refId)];
    
        ref.coordinate = coordinate;
        methodResult(@"success");
    },
    
    @"MAPointAnnotation::set_lockedToScreen": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL lockedToScreen = [args[@"lockedToScreen"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPointAnnotation * ref = (MAPointAnnotation *) REF_MAP[@(refId)];
    
        ref.lockedToScreen = lockedToScreen;
        methodResult(@"success");
    },
    
    @"MAPointAnnotation::set_lockedScreenPoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* lockedScreenPointValue = (NSValue*) REF_MAP[@([args[@"lockedScreenPoint"] integerValue])];
        CGPoint lockedScreenPoint;
        [lockedScreenPointValue getValue:&lockedScreenPoint];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPointAnnotation * ref = (MAPointAnnotation *) REF_MAP[@(refId)];
    
        ref.lockedScreenPoint = lockedScreenPoint;
        methodResult(@"success");
    },
    
    @"MACircle::set_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordinateValue = (NSValue*) REF_MAP[@([args[@"coordinate"] integerValue])];
        CLLocationCoordinate2D coordinate;
        [coordinateValue getValue:&coordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MACircle * ref = (MACircle *) REF_MAP[@(refId)];
    
        ref.coordinate = coordinate;
        methodResult(@"success");
    },
    
    @"MAAnnotation::set_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * title = (NSString *) args[@"title"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAAnnotation> ref = (id<MAAnnotation>) REF_MAP[@(refId)];
    
        ref.title = title;
        methodResult(@"success");
    },
    
    @"MAAnnotation::set_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * subtitle = (NSString *) args[@"subtitle"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        id<MAAnnotation> ref = (id<MAAnnotation>) REF_MAP[@(refId)];
    
        ref.subtitle = subtitle;
        methodResult(@"success");
    },
    
    @"MAMapCustomStyleOptions::set_styleId": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * styleId = (NSString *) args[@"styleId"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapCustomStyleOptions * ref = (MAMapCustomStyleOptions *) REF_MAP[@(refId)];
    
        ref.styleId = styleId;
        methodResult(@"success");
    },
    
    @"MAMultiColoredPolylineRenderer::set_gradient": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL gradient = [args[@"gradient"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiColoredPolylineRenderer * ref = (MAMultiColoredPolylineRenderer *) REF_MAP[@(refId)];
    
        ref.gradient = gradient;
        methodResult(@"success");
    },
    
    @"MAAnimatedAnnotation::set_movingDirection": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CLLocationDirection movingDirection = [args[@"movingDirection"] doubleValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnimatedAnnotation * ref = (MAAnimatedAnnotation *) REF_MAP[@(refId)];
    
        ref.movingDirection = movingDirection;
        methodResult(@"success");
    },
    
    @"MATraceManager::set_delegate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceManager * ref = (MATraceManager *) REF_MAP[@(refId)];
    
        ref.delegate = self;
        methodResult(@"success");
    },
    
    @"MAMultiPointOverlayRenderer::set_delegate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointOverlayRenderer * ref = (MAMultiPointOverlayRenderer *) REF_MAP[@(refId)];
    
        ref.delegate = self;
        methodResult(@"success");
    },
    
    @"MAMultiPointOverlayRenderer::set_anchor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* anchorValue = (NSValue*) REF_MAP[@([args[@"anchor"] integerValue])];
        CGPoint anchor;
        [anchorValue getValue:&anchor];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointOverlayRenderer * ref = (MAMultiPointOverlayRenderer *) REF_MAP[@(refId)];
    
        ref.anchor = anchor;
        methodResult(@"success");
    },
    
    @"MAPolylineRenderer::set_is3DArrowLine": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL is3DArrowLine = [args[@"is3DArrowLine"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolylineRenderer * ref = (MAPolylineRenderer *) REF_MAP[@(refId)];
    
        ref.is3DArrowLine = is3DArrowLine;
        methodResult(@"success");
    },
    
    @"MAShape::set_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * title = (NSString *) args[@"title"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAShape * ref = (MAShape *) REF_MAP[@(refId)];
    
        ref.title = title;
        methodResult(@"success");
    },
    
    @"MAShape::set_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * subtitle = (NSString *) args[@"subtitle"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAShape * ref = (MAShape *) REF_MAP[@(refId)];
    
        ref.subtitle = subtitle;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_minimumZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger minimumZ = [args[@"minimumZ"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        ref.minimumZ = minimumZ;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_maximumZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger maximumZ = [args[@"maximumZ"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        ref.maximumZ = maximumZ;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_canReplaceMapContent": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL canReplaceMapContent = [args[@"canReplaceMapContent"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        ref.canReplaceMapContent = canReplaceMapContent;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_boundingMapRect": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* boundingMapRectValue = (NSValue*) REF_MAP[@([args[@"boundingMapRect"] integerValue])];
        MAMapRect boundingMapRect;
        [boundingMapRectValue getValue:&boundingMapRect];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        ref.boundingMapRect = boundingMapRect;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_disableOffScreenTileLoading": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL disableOffScreenTileLoading = [args[@"disableOffScreenTileLoading"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay * ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        ref.disableOffScreenTileLoading = disableOffScreenTileLoading;
        methodResult(@"success");
    },
    
    @"MAOfflineItemCommonCity::set_province": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAOfflineItem * province = (MAOfflineItem *) REF_MAP[@([args[@"province"] integerValue])];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItemCommonCity * ref = (MAOfflineItemCommonCity *) REF_MAP[@(refId)];
    
        ref.province = province;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_visibile": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL visibile = [args[@"visibile"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        ref.visibile = visibile;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_loop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL loop = [args[@"loop"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        ref.loop = loop;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_maxParticles": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger maxParticles = [args[@"maxParticles"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        ref.maxParticles = maxParticles;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_particleStartColor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        id<MAParticleColorGenerate> particleStartColor = (id<MAParticleColorGenerate>) REF_MAP[@([args[@"particleStartColor"] integerValue])];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        ref.particleStartColor = particleStartColor;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_particleStartSpeed": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        id<MAParticleVelocityGenerate> particleStartSpeed = (id<MAParticleVelocityGenerate>) REF_MAP[@([args[@"particleStartSpeed"] integerValue])];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        ref.particleStartSpeed = particleStartSpeed;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_particleEmissionModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAParticleEmissionModule * particleEmissionModule = (MAParticleEmissionModule *) REF_MAP[@([args[@"particleEmissionModule"] integerValue])];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        ref.particleEmissionModule = particleEmissionModule;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_particleShapeModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        id<MAParticleShapeModule> particleShapeModule = (id<MAParticleShapeModule>) REF_MAP[@([args[@"particleShapeModule"] integerValue])];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        ref.particleShapeModule = particleShapeModule;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_particleOverLifeModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 引用参数
        MAParticleOverLifeModule * particleOverLifeModule = (MAParticleOverLifeModule *) REF_MAP[@([args[@"particleOverLifeModule"] integerValue])];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions * ref = (MAParticleOverlayOptions *) REF_MAP[@(refId)];
    
        ref.particleOverLifeModule = particleOverLifeModule;
        methodResult(@"success");
    },
    
    @"MAMultiPointItem::set_coordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* coordinateValue = (NSValue*) REF_MAP[@([args[@"coordinate"] integerValue])];
        CLLocationCoordinate2D coordinate;
        [coordinateValue getValue:&coordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem * ref = (MAMultiPointItem *) REF_MAP[@(refId)];
    
        ref.coordinate = coordinate;
        methodResult(@"success");
    },
    
    @"MAMultiPointItem::set_customID": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * customID = (NSString *) args[@"customID"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem * ref = (MAMultiPointItem *) REF_MAP[@(refId)];
    
        ref.customID = customID;
        methodResult(@"success");
    },
    
    @"MAMultiPointItem::set_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * title = (NSString *) args[@"title"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem * ref = (MAMultiPointItem *) REF_MAP[@(refId)];
    
        ref.title = title;
        methodResult(@"success");
    },
    
    @"MAMultiPointItem::set_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * subtitle = (NSString *) args[@"subtitle"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem * ref = (MAMultiPointItem *) REF_MAP[@(refId)];
    
        ref.subtitle = subtitle;
        methodResult(@"success");
    },
    
    @"MACustomBuildingOverlayOption::set_height": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat height = [args[@"height"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption * ref = (MACustomBuildingOverlayOption *) REF_MAP[@(refId)];
    
        ref.height = height;
        methodResult(@"success");
    },
    
    @"MACustomBuildingOverlayOption::set_heightScale": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat heightScale = [args[@"heightScale"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption * ref = (MACustomBuildingOverlayOption *) REF_MAP[@(refId)];
    
        ref.heightScale = heightScale;
        methodResult(@"success");
    },
    
    @"MACustomBuildingOverlayOption::set_visibile": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL visibile = [args[@"visibile"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption * ref = (MACustomBuildingOverlayOption *) REF_MAP[@(refId)];
    
        ref.visibile = visibile;
        methodResult(@"success");
    },
    
    @"MATraceLocation::set_loc": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* locValue = (NSValue*) REF_MAP[@([args[@"loc"] integerValue])];
        CLLocationCoordinate2D loc;
        [locValue getValue:&loc];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation * ref = (MATraceLocation *) REF_MAP[@(refId)];
    
        ref.loc = loc;
        methodResult(@"success");
    },
    
    @"MATraceLocation::set_angle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        double angle = [args[@"angle"] doubleValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation * ref = (MATraceLocation *) REF_MAP[@(refId)];
    
        ref.angle = angle;
        methodResult(@"success");
    },
    
    @"MATraceLocation::set_speed": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        double speed = [args[@"speed"] doubleValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation * ref = (MATraceLocation *) REF_MAP[@(refId)];
    
        ref.speed = speed;
        methodResult(@"success");
    },
    
    @"MATraceLocation::set_time": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        double time = [args[@"time"] doubleValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation * ref = (MATraceLocation *) REF_MAP[@(refId)];
    
        ref.time = time;
        methodResult(@"success");
    },
    
    @"MAArc::set_startCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* startCoordinateValue = (NSValue*) REF_MAP[@([args[@"startCoordinate"] integerValue])];
        CLLocationCoordinate2D startCoordinate;
        [startCoordinateValue getValue:&startCoordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAArc * ref = (MAArc *) REF_MAP[@(refId)];
    
        ref.startCoordinate = startCoordinate;
        methodResult(@"success");
    },
    
    @"MAArc::set_passedCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* passedCoordinateValue = (NSValue*) REF_MAP[@([args[@"passedCoordinate"] integerValue])];
        CLLocationCoordinate2D passedCoordinate;
        [passedCoordinateValue getValue:&passedCoordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAArc * ref = (MAArc *) REF_MAP[@(refId)];
    
        ref.passedCoordinate = passedCoordinate;
        methodResult(@"success");
    },
    
    @"MAArc::set_endCoordinate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* endCoordinateValue = (NSValue*) REF_MAP[@([args[@"endCoordinate"] integerValue])];
        CLLocationCoordinate2D endCoordinate;
        [endCoordinateValue getValue:&endCoordinate];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAArc * ref = (MAArc *) REF_MAP[@(refId)];
    
        ref.endCoordinate = endCoordinate;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_showsAccuracyRing": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsAccuracyRing = [args[@"showsAccuracyRing"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation * ref = (MAUserLocationRepresentation *) REF_MAP[@(refId)];
    
        ref.showsAccuracyRing = showsAccuracyRing;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_showsHeadingIndicator": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsHeadingIndicator = [args[@"showsHeadingIndicator"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation * ref = (MAUserLocationRepresentation *) REF_MAP[@(refId)];
    
        ref.showsHeadingIndicator = showsHeadingIndicator;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_lineWidth": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat lineWidth = [args[@"lineWidth"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation * ref = (MAUserLocationRepresentation *) REF_MAP[@(refId)];
    
        ref.lineWidth = lineWidth;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_enablePulseAnnimation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL enablePulseAnnimation = [args[@"enablePulseAnnimation"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation * ref = (MAUserLocationRepresentation *) REF_MAP[@(refId)];
    
        ref.enablePulseAnnimation = enablePulseAnnimation;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineWidth": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat lineWidth = [args[@"lineWidth"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        ref.lineWidth = lineWidth;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineJoinType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MALineJoinType lineJoinType = (MALineJoinType) [args[@"lineJoinType"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        ref.lineJoinType = lineJoinType;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineCapType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MALineCapType lineCapType = (MALineCapType) [args[@"lineCapType"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        ref.lineCapType = lineCapType;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_miterLimit": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat miterLimit = [args[@"miterLimit"] floatValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        ref.miterLimit = miterLimit;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineDash": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL lineDash = [args[@"lineDash"] boolValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        ref.lineDash = lineDash;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineDashType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MALineDashType lineDashType = (MALineDashType) [args[@"lineDashType"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer * ref = (MAOverlayPathRenderer *) REF_MAP[@(refId)];
    
        ref.lineDashType = lineDashType;
        methodResult(@"success");
    },
    
    @"RefClass::isKindOfAMapURLSearch": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[AMapURLSearch class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfAMapNaviConfig": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[AMapNaviConfig class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfAMapRouteConfig": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[AMapRouteConfig class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfAMapPOIConfig": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[AMapPOIConfig class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfAMapServices": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[AMapServices class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAOfflineCity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAOfflineCity class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAOfflineItemNationWide": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAOfflineItemNationWide class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAMultiPoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAMultiPoint class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAGroundOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAGroundOverlay class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAPolygonRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAPolygonRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAPinAnnotationView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAPinAnnotationView class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAHeatMapNode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAHeatMapNode class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAHeatMapGradient": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAHeatMapGradient class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAHeatMapTileOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAHeatMapTileOverlay class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAMapStatus": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAMapStatus class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAPointAnnotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAPointAnnotation class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMACircle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MACircle class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAArcRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAArcRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAMapCustomStyleOptions": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAMapCustomStyleOptions class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAPolygon": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAPolygon class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleOverlay class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAPolyline": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAPolyline class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAMultiColoredPolylineRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAMultiColoredPolylineRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAAnimatedAnnotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAAnimatedAnnotation class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAMultiTexturePolylineRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAMultiTexturePolylineRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAOfflineProvince": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAOfflineProvince class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMATileOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MATileOverlayRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAOfflineItem": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAOfflineItem class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAGeodesicPolyline": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAGeodesicPolyline class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMATouchPoi": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MATouchPoi class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAOfflineItemMunicipality": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAOfflineItemMunicipality class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAMultiPolyline": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAMultiPolyline class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMATraceManager": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MATraceManager class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAMultiPointOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAMultiPointOverlayRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAIndoorFloorInfo": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAIndoorFloorInfo class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAIndoorInfo": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAIndoorInfo class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAPolylineRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAPolylineRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAAnnotationMoveAnimation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAAnnotationMoveAnimation class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAShape": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAShape class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAAnnotationView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAAnnotationView class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMATileOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MATileOverlay class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMACustomCalloutView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MACustomCalloutView class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAOfflineItemCommonCity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAOfflineItemCommonCity class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAOfflineMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAOfflineMap class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMACircleRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MACircleRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleOverlayRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleRandomVelocityGenerate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleRandomVelocityGenerate class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleRandomColorGenerate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleRandomColorGenerate class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleConstantRotationGenerate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleConstantRotationGenerate class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleCurveSizeGenerate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleCurveSizeGenerate class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleEmissionModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleEmissionModule class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleSinglePointShapeModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleSinglePointShapeModule class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleRectShapeModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleRectShapeModule class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleOverLifeModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleOverLifeModule class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleOverlayOptions": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleOverlayOptions class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAParticleOverlayOptionsFactory": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAParticleOverlayOptionsFactory class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAOverlayRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAUserLocation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAUserLocation class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAMultiPointItem": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAMultiPointItem class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAMultiPointOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAMultiPointOverlay class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMACustomBuildingOverlayOption": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MACustomBuildingOverlayOption class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMACustomBuildingOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MACustomBuildingOverlay class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMATracePoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MATracePoint class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMATraceLocation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MATraceLocation class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAArc": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAArc class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAUserLocationRepresentation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAUserLocationRepresentation class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAMapView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAMapView class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAOverlayPathRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAOverlayPathRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMAGroundOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MAGroundOverlayRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::isKindOfMACustomBuildingOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        BOOL isTargetType = [ref isKindOfClass:[MACustomBuildingOverlayRenderer class]];
        methodResult(@(isTargetType));
    },
    
    @"RefClass::asAMapURLSearch": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (AMapURLSearch *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asAMapNaviConfig": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (AMapNaviConfig *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asAMapRouteConfig": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (AMapRouteConfig *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asAMapPOIConfig": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (AMapPOIConfig *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asAMapServices": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (AMapServices *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAOfflineCity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAOfflineCity *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAOfflineItemNationWide": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAOfflineItemNationWide *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAMultiPoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAMultiPoint *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAGroundOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAGroundOverlay *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAPolygonRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAPolygonRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAPinAnnotationView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAPinAnnotationView *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAHeatMapNode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAHeatMapNode *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAHeatMapGradient": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAHeatMapGradient *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAHeatMapTileOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAHeatMapTileOverlay *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAMapStatus": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAMapStatus *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAPointAnnotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAPointAnnotation *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMACircle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MACircle *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAArcRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAArcRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAMapCustomStyleOptions": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAMapCustomStyleOptions *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAPolygon": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAPolygon *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleOverlay *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAPolyline": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAPolyline *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAMultiColoredPolylineRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAMultiColoredPolylineRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAAnimatedAnnotation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAAnimatedAnnotation *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAMultiTexturePolylineRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAMultiTexturePolylineRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAOfflineProvince": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAOfflineProvince *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMATileOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MATileOverlayRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAOfflineItem": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAOfflineItem *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAGeodesicPolyline": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAGeodesicPolyline *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMATouchPoi": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MATouchPoi *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAOfflineItemMunicipality": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAOfflineItemMunicipality *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAMultiPolyline": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAMultiPolyline *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMATraceManager": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MATraceManager *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAMultiPointOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAMultiPointOverlayRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAIndoorFloorInfo": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAIndoorFloorInfo *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAIndoorInfo": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAIndoorInfo *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAPolylineRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAPolylineRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAAnnotationMoveAnimation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAAnnotationMoveAnimation *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAShape": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAShape *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAAnnotationView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAAnnotationView *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMATileOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MATileOverlay *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMACustomCalloutView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MACustomCalloutView *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAOfflineItemCommonCity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAOfflineItemCommonCity *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAOfflineMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAOfflineMap *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMACircleRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MACircleRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleOverlayRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleRandomVelocityGenerate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleRandomVelocityGenerate *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleRandomColorGenerate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleRandomColorGenerate *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleConstantRotationGenerate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleConstantRotationGenerate *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleCurveSizeGenerate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleCurveSizeGenerate *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleEmissionModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleEmissionModule *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleSinglePointShapeModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleSinglePointShapeModule *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleRectShapeModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleRectShapeModule *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleOverLifeModule": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleOverLifeModule *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleOverlayOptions": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleOverlayOptions *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAParticleOverlayOptionsFactory": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAParticleOverlayOptionsFactory *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAOverlayRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAUserLocation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAUserLocation *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAMultiPointItem": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAMultiPointItem *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAMultiPointOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAMultiPointOverlay *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMACustomBuildingOverlayOption": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MACustomBuildingOverlayOption *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMACustomBuildingOverlay": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MACustomBuildingOverlay *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMATracePoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MATracePoint *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMATraceLocation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MATraceLocation *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAArc": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAArc *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAUserLocationRepresentation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAUserLocationRepresentation *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAMapView": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAMapView *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAOverlayPathRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAOverlayPathRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMAGroundOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MAGroundOverlayRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
    @"RefClass::asMACustomBuildingOverlayRenderer": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        id ref = REF_MAP[@(refId)];
    
        // 转型
        ref = (MACustomBuildingOverlayRenderer *) ref;
        // 放回REF_MAP
        REF_MAP[@(refId)] = ref;
    
        methodResult(@(refId));
    },
    
  };

  NSDictionary<NSString *, id> *args = (NSDictionary<NSString *, id> *) [methodCall arguments];
  if ([@"ObjectFactory::release" isEqualToString:methodCall.method]) {
    [REF_MAP removeObjectForKey:(NSNumber *) args[@"refId"]];
    methodResult(@"success");
  } else if ([@"ObjectFactory::clearRefMap" isEqualToString:methodCall.method]) {
    [REF_MAP removeAllObjects];
    methodResult(@"success");
  } else if ([@"ObjectFactory::createCLLocationCoordinate2D" isEqualToString:methodCall.method]) {
    CLLocationDegrees latitude = [args[@"latitude"] doubleValue];
    CLLocationDegrees longitude = [args[@"longitude"] doubleValue];

    CLLocationCoordinate2D data = CLLocationCoordinate2DMake(latitude, longitude);

    NSValue* dataValue = [NSValue value:&data withObjCType:@encode(CLLocationCoordinate2D)];
    REF_MAP[@(dataValue.hash)] = dataValue;

    methodResult(@(dataValue.hash));
  } else {
    if (_handlerMap[methodCall.method] != nil) {
      _handlerMap[methodCall.method](_registrar, args, methodResult);
    } else {
      methodResult(FlutterMethodNotImplemented);
    }
  }
}

// 委托方法们
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


@end