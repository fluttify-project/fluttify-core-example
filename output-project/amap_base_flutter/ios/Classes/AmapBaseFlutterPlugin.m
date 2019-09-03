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

  // 引用Map
  REF_MAP = @{}.mutableCopy;

  // 处理方法们
  NSDictionary<NSString *, Handler> *_handlerMap = @{
    @"AMapURLSearch::getLatestAMapApp": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
    
    
        // 日志打印
    
    
        // 开始调用
        [AMapURLSearch getLatestAMapApp ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"AMapServices::sharedServices": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
    
    
        // 日志打印
    
    
        // 开始调用
        AMapServices* result = [AMapServices sharedServices];
    
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
    
    
        // 开始调用
        MACircle* result = [MACircle circleWithMapRect: mapRect];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAAnimatedAnnotation::setNeedsStart": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnimatedAnnotation* ref = (MAAnimatedAnnotation *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref setNeedsStart ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MATileOverlayRenderer::reloadData": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlayRenderer* ref = (MATileOverlayRenderer *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref reloadData ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MATraceManager::sharedInstance": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
    
    
        // 日志打印
    
    
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
        MATraceManager* ref = (MATraceManager *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref stopTrace ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MATraceManager::start": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceManager* ref = (MATraceManager *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref start ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MATraceManager::stop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceManager* ref = (MATraceManager *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref stop ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnnotationMoveAnimation::name": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation* ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        NSString* result = [ref name];
    
        // 调用结果
        methodResult(result);
    },
    @"MAAnnotationMoveAnimation::coordinates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation* ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        CLLocationCoordinate2D* result = [ref coordinates];
    
        // 调用结果
        NSValue* resultValue = [NSValue value:&result withObjCType:@encode(CLLocationCoordinate2D*)];
        REF_MAP[@(resultValue.hash)] = resultValue;
    
        methodResult(@(resultValue.hash));
    },
    @"MAAnnotationMoveAnimation::duration": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation* ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        CGFloat result = [ref duration];
    
        // 调用结果
        methodResult(@(result));
    },
    @"MAAnnotationMoveAnimation::elapsedTime": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation* ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        CGFloat result = [ref elapsedTime];
    
        // 调用结果
        methodResult(@(result));
    },
    @"MAAnnotationMoveAnimation::cancel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation* ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref cancel ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnnotationMoveAnimation::isCancelled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation* ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        BOOL result = [ref isCancelled];
    
        // 调用结果
        methodResult(@(result));
    },
    @"MAAnnotationMoveAnimation::passedPointCount": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationMoveAnimation* ref = (MAAnnotationMoveAnimation *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        NSInteger result = [ref passedPointCount];
    
        // 调用结果
        methodResult(@(result));
    },
    @"MAAnnotationView::setSelected": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL selected = [args[@"selected"] boolValue];;
        // jsonable参数
        BOOL animated = [args[@"animated"] boolValue];;
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref setSelected : selected animated: animated];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAAnnotationView::prepareForReuse": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
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
        BOOL animated = [args[@"animated"] boolValue];;
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref setDragState : newDragState animated: animated];
    
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
        MATileOverlay* ref = (MATileOverlay *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref cancelLoadOfTileAtPath : path];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::sharedOfflineMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
    
    
        // 日志打印
    
    
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
        MAOfflineMap* ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref setupWithCompletionBlock : ^(BOOL setupSuccess) {
            // method channel
            FlutterMethodChannel *callbackChannel = [FlutterMethodChannel
                  methodChannelWithName:@"MAOfflineMap::setupWithCompletionBlock_Callback\(refId)"
                        binaryMessenger:[registrar messenger]];
    
            // 日志打印
    
    
            // 开始回调
            [callbackChannel invokeMethod:@"MAOfflineMap::setupWithCompletionBlock_Callback::void|BOOL setupSuccess"
                                arguments:@{
                                     @"setupSuccess": @(setupSuccess),
                             
                                     @"refId": @(refId)
                                }];
    
            // 方法返回值
    
        }];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::cancelAll": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap* ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref cancelAll ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAOfflineMap::clearDisk": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap* ref = (MAOfflineMap *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref clearDisk ];
    
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
    
    
        // 开始调用
        MAArc* result = [MAArc arcWithStartCoordinate: startCoordinate passedCoordinate: passedCoordinate endCoordinate: endCoordinate];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAMapView::setRegion": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 结构体参数
        NSValue* regionValue = (NSValue*) REF_MAP[@([args[@"region"] integerValue])];
        MACoordinateRegion region;
        [regionValue getValue:&region];
        // jsonable参数
        BOOL animated = [args[@"animated"] boolValue];;
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
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
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
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
        BOOL animated = [args[@"animated"] boolValue];;
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
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
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
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
        BOOL animated = [args[@"animated"] boolValue];;
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref setCenterCoordinate : coordinate animated: animated];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::setZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat zoomLevel = [args[@"zoomLevel"] floatValue];;
        // jsonable参数
        BOOL animated = [args[@"animated"] boolValue];;
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref setZoomLevel : zoomLevel animated: animated];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::getMapStatus": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        MAMapStatus* result = [ref getMapStatus];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAMapView::metersPerPointForZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat zoomLevel = [args[@"zoomLevel"] floatValue];;
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        double result = [ref metersPerPointForZoomLevel: zoomLevel];
    
        // 调用结果
        methodResult(@(result));
    },
    @"MAMapView::reloadMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref reloadMap ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::clearDisk": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref clearDisk ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::reloadInternalTexture": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref reloadInternalTexture ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::mapContentApprovalNumber": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        NSString* result = [ref mapContentApprovalNumber];
    
        // 调用结果
        methodResult(result);
    },
    @"MAMapView::satelliteImageApprovalNumber": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        NSString* result = [ref satelliteImageApprovalNumber];
    
        // 调用结果
        methodResult(result);
    },
    @"MAMapView::forceRefresh": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref forceRefresh ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::dequeueReusableAnnotationViewWithIdentifier": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString* identifier = (NSString*) args[@"identifier"];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        MAAnnotationView* result = [ref dequeueReusableAnnotationViewWithIdentifier: identifier];
    
        // 调用结果
        NSInteger returnRefId = [result hash];
        REF_MAP[@(returnRefId)] = result;
    
        methodResult(@(returnRefId));
    },
    @"MAMapView::setUserTrackingMode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MAUserTrackingMode mode = (MAUserTrackingMode) [args[@"mode"] integerValue];
        // jsonable参数
        BOOL animated = [args[@"animated"] boolValue];;
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref setUserTrackingMode : mode animated: animated];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::overlaysInLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MAOverlayLevel level = (MAOverlayLevel) [args[@"level"] integerValue];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        NSArray* result = [ref overlaysInLevel: level];
    
        // 调用结果
        methodResult(result);
    },
    @"MAMapView::setCurrentIndoorMapFloorIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger floorIndex = [args[@"floorIndex"] integerValue];;
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref setCurrentIndoorMapFloorIndex : floorIndex];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::clearIndoorMapCache": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
    
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref clearIndoorMapCache ];
    
        // 调用结果
        methodResult(@"success");
    },
    @"AMapNaviConfig::get_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig* ref = (AMapNaviConfig*) REF_MAP[@(refId)];
    
        methodResult(ref.appScheme);
    },
    
    @"AMapNaviConfig::get_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig* ref = (AMapNaviConfig*) REF_MAP[@(refId)];
    
        methodResult(ref.appName);
    },
    
    @"AMapNaviConfig::get_strategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig* ref = (AMapNaviConfig*) REF_MAP[@(refId)];
    
        methodResult(@(ref.strategy));
    },
    
    @"AMapRouteConfig::get_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        methodResult(ref.appScheme);
    },
    
    @"AMapRouteConfig::get_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        methodResult(ref.appName);
    },
    
    @"AMapRouteConfig::get_drivingStrategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        methodResult(@(ref.drivingStrategy));
    },
    
    @"AMapRouteConfig::get_transitStrategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        methodResult(@(ref.transitStrategy));
    },
    
    @"AMapRouteConfig::get_routeType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        methodResult(@(ref.routeType));
    },
    
    @"AMapPOIConfig::get_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig* ref = (AMapPOIConfig*) REF_MAP[@(refId)];
    
        methodResult(ref.appScheme);
    },
    
    @"AMapPOIConfig::get_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig* ref = (AMapPOIConfig*) REF_MAP[@(refId)];
    
        methodResult(ref.appName);
    },
    
    @"AMapPOIConfig::get_keywords": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig* ref = (AMapPOIConfig*) REF_MAP[@(refId)];
    
        methodResult(ref.keywords);
    },
    
    @"AMapServices::get_apiKey": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices* ref = (AMapServices*) REF_MAP[@(refId)];
    
        methodResult(ref.apiKey);
    },
    
    @"AMapServices::get_enableHTTPS": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices* ref = (AMapServices*) REF_MAP[@(refId)];
    
        methodResult(@(ref.enableHTTPS));
    },
    
    @"AMapServices::get_crashReportEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices* ref = (AMapServices*) REF_MAP[@(refId)];
    
        methodResult(@(ref.crashReportEnabled));
    },
    
    @"AMapServices::get_identifier": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices* ref = (AMapServices*) REF_MAP[@(refId)];
    
        methodResult(ref.identifier);
    },
    
    @"MAOfflineCity::get_cityCode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineCity* ref = (MAOfflineCity*) REF_MAP[@(refId)];
    
        methodResult(ref.cityCode);
    },
    
    @"MAMultiPoint::get_cross180Longitude": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPoint* ref = (MAMultiPoint*) REF_MAP[@(refId)];
    
        methodResult(@(ref.cross180Longitude));
    },
    
    @"MAGroundOverlay::get_alpha": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAGroundOverlay* ref = (MAGroundOverlay*) REF_MAP[@(refId)];
    
        methodResult(@(ref.alpha));
    },
    
    @"MAGroundOverlay::get_zoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAGroundOverlay* ref = (MAGroundOverlay*) REF_MAP[@(refId)];
    
        methodResult(@(ref.zoomLevel));
    },
    
    @"MAPinAnnotationView::get_pinColor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPinAnnotationView* ref = (MAPinAnnotationView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.pinColor));
    },
    
    @"MAPinAnnotationView::get_animatesDrop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPinAnnotationView* ref = (MAPinAnnotationView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.animatesDrop));
    },
    
    @"MAHeatMapNode::get_intensity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapNode* ref = (MAHeatMapNode*) REF_MAP[@(refId)];
    
        methodResult(@(ref.intensity));
    },
    
    @"MAHeatMapTileOverlay::get_radius": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay* ref = (MAHeatMapTileOverlay*) REF_MAP[@(refId)];
    
        methodResult(@(ref.radius));
    },
    
    @"MAHeatMapTileOverlay::get_opacity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay* ref = (MAHeatMapTileOverlay*) REF_MAP[@(refId)];
    
        methodResult(@(ref.opacity));
    },
    
    @"MAHeatMapTileOverlay::get_allowRetinaAdapting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay* ref = (MAHeatMapTileOverlay*) REF_MAP[@(refId)];
    
        methodResult(@(ref.allowRetinaAdapting));
    },
    
    @"MAMapStatus::get_zoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus* ref = (MAMapStatus*) REF_MAP[@(refId)];
    
        methodResult(@(ref.zoomLevel));
    },
    
    @"MAMapStatus::get_rotationDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus* ref = (MAMapStatus*) REF_MAP[@(refId)];
    
        methodResult(@(ref.rotationDegree));
    },
    
    @"MAMapStatus::get_cameraDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus* ref = (MAMapStatus*) REF_MAP[@(refId)];
    
        methodResult(@(ref.cameraDegree));
    },
    
    @"MAPointAnnotation::get_isLockedToScreen": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPointAnnotation* ref = (MAPointAnnotation*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isLockedToScreen));
    },
    
    @"MAMapCustomStyleOptions::get_styleId": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapCustomStyleOptions* ref = (MAMapCustomStyleOptions*) REF_MAP[@(refId)];
    
        methodResult(ref.styleId);
    },
    
    @"MAMultiColoredPolylineRenderer::get_isGradient": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiColoredPolylineRenderer* ref = (MAMultiColoredPolylineRenderer*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isGradient));
    },
    
    @"MAOfflineItem::get_name": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItem* ref = (MAOfflineItem*) REF_MAP[@(refId)];
    
        methodResult(ref.name);
    },
    
    @"MAOfflineItem::get_jianpin": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItem* ref = (MAOfflineItem*) REF_MAP[@(refId)];
    
        methodResult(ref.jianpin);
    },
    
    @"MAOfflineItem::get_pinyin": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItem* ref = (MAOfflineItem*) REF_MAP[@(refId)];
    
        methodResult(ref.pinyin);
    },
    
    @"MAOfflineItem::get_adcode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItem* ref = (MAOfflineItem*) REF_MAP[@(refId)];
    
        methodResult(ref.adcode);
    },
    
    @"MAOfflineItem::get_itemStatus": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineItem* ref = (MAOfflineItem*) REF_MAP[@(refId)];
    
        methodResult(@(ref.itemStatus));
    },
    
    @"MATouchPoi::get_name": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATouchPoi* ref = (MATouchPoi*) REF_MAP[@(refId)];
    
        methodResult(ref.name);
    },
    
    @"MATouchPoi::get_uid": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATouchPoi* ref = (MATouchPoi*) REF_MAP[@(refId)];
    
        methodResult(ref.uid);
    },
    
    @"MAIndoorFloorInfo::get_floorName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorFloorInfo* ref = (MAIndoorFloorInfo*) REF_MAP[@(refId)];
    
        methodResult(ref.floorName);
    },
    
    @"MAIndoorFloorInfo::get_floorIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorFloorInfo* ref = (MAIndoorFloorInfo*) REF_MAP[@(refId)];
    
        methodResult(@(ref.floorIndex));
    },
    
    @"MAIndoorFloorInfo::get_floorNona": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorFloorInfo* ref = (MAIndoorFloorInfo*) REF_MAP[@(refId)];
    
        methodResult(ref.floorNona);
    },
    
    @"MAIndoorFloorInfo::get_isPark": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorFloorInfo* ref = (MAIndoorFloorInfo*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isPark));
    },
    
    @"MAIndoorInfo::get_cnName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo* ref = (MAIndoorInfo*) REF_MAP[@(refId)];
    
        methodResult(ref.cnName);
    },
    
    @"MAIndoorInfo::get_enName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo* ref = (MAIndoorInfo*) REF_MAP[@(refId)];
    
        methodResult(ref.enName);
    },
    
    @"MAIndoorInfo::get_poiID": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo* ref = (MAIndoorInfo*) REF_MAP[@(refId)];
    
        methodResult(ref.poiID);
    },
    
    @"MAIndoorInfo::get_buildingType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo* ref = (MAIndoorInfo*) REF_MAP[@(refId)];
    
        methodResult(ref.buildingType);
    },
    
    @"MAIndoorInfo::get_activeFloorIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo* ref = (MAIndoorInfo*) REF_MAP[@(refId)];
    
        methodResult(@(ref.activeFloorIndex));
    },
    
    @"MAIndoorInfo::get_activeFloorInfoIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo* ref = (MAIndoorInfo*) REF_MAP[@(refId)];
    
        methodResult(@(ref.activeFloorInfoIndex));
    },
    
    @"MAIndoorInfo::get_numberOfFloor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo* ref = (MAIndoorInfo*) REF_MAP[@(refId)];
    
        methodResult(@(ref.numberOfFloor));
    },
    
    @"MAIndoorInfo::get_numberOfParkFloor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo* ref = (MAIndoorInfo*) REF_MAP[@(refId)];
    
        methodResult(@(ref.numberOfParkFloor));
    },
    
    @"MAPolylineRenderer::get_is3DArrowLine": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolylineRenderer* ref = (MAPolylineRenderer*) REF_MAP[@(refId)];
    
        methodResult(@(ref.is3DArrowLine));
    },
    
    @"MAShape::get_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAShape* ref = (MAShape*) REF_MAP[@(refId)];
    
        methodResult(ref.title);
    },
    
    @"MAShape::get_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAShape* ref = (MAShape*) REF_MAP[@(refId)];
    
        methodResult(ref.subtitle);
    },
    
    @"MAAnnotationView::get_reuseIdentifier": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        methodResult(ref.reuseIdentifier);
    },
    
    @"MAAnnotationView::get_zIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.zIndex));
    },
    
    @"MAAnnotationView::get_isEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isEnabled));
    },
    
    @"MAAnnotationView::get_isHighlighted": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isHighlighted));
    },
    
    @"MAAnnotationView::get_isSelected": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isSelected));
    },
    
    @"MAAnnotationView::get_canShowCallout": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.canShowCallout));
    },
    
    @"MAAnnotationView::get_isDraggable": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isDraggable));
    },
    
    @"MAAnnotationView::get_dragState": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.dragState));
    },
    
    @"MATileOverlay::get_minimumZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        methodResult(@(ref.minimumZ));
    },
    
    @"MATileOverlay::get_maximumZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        methodResult(@(ref.maximumZ));
    },
    
    @"MATileOverlay::get_URLTemplate": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        methodResult(ref.URLTemplate);
    },
    
    @"MATileOverlay::get_canReplaceMapContent": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        methodResult(@(ref.canReplaceMapContent));
    },
    
    @"MATileOverlay::get_disableOffScreenTileLoading": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        methodResult(@(ref.disableOffScreenTileLoading));
    },
    
    @"MAOfflineMap::get_version": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineMap* ref = (MAOfflineMap*) REF_MAP[@(refId)];
    
        methodResult(ref.version);
    },
    
    @"MAParticleOverlayOptions::get_visibile": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions* ref = (MAParticleOverlayOptions*) REF_MAP[@(refId)];
    
        methodResult(@(ref.visibile));
    },
    
    @"MAParticleOverlayOptions::get_loop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions* ref = (MAParticleOverlayOptions*) REF_MAP[@(refId)];
    
        methodResult(@(ref.loop));
    },
    
    @"MAParticleOverlayOptions::get_maxParticles": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions* ref = (MAParticleOverlayOptions*) REF_MAP[@(refId)];
    
        methodResult(@(ref.maxParticles));
    },
    
    @"MAUserLocation::get_isUpdating": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocation* ref = (MAUserLocation*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isUpdating));
    },
    
    @"MAMultiPointItem::get_customID": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem* ref = (MAMultiPointItem*) REF_MAP[@(refId)];
    
        methodResult(ref.customID);
    },
    
    @"MAMultiPointItem::get_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem* ref = (MAMultiPointItem*) REF_MAP[@(refId)];
    
        methodResult(ref.title);
    },
    
    @"MAMultiPointItem::get_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem* ref = (MAMultiPointItem*) REF_MAP[@(refId)];
    
        methodResult(ref.subtitle);
    },
    
    @"MACustomBuildingOverlayOption::get_height": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption* ref = (MACustomBuildingOverlayOption*) REF_MAP[@(refId)];
    
        methodResult(@(ref.height));
    },
    
    @"MACustomBuildingOverlayOption::get_heightScale": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption* ref = (MACustomBuildingOverlayOption*) REF_MAP[@(refId)];
    
        methodResult(@(ref.heightScale));
    },
    
    @"MACustomBuildingOverlayOption::get_visibile": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption* ref = (MACustomBuildingOverlayOption*) REF_MAP[@(refId)];
    
        methodResult(@(ref.visibile));
    },
    
    @"MATraceLocation::get_angle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation* ref = (MATraceLocation*) REF_MAP[@(refId)];
    
        methodResult(@(ref.angle));
    },
    
    @"MATraceLocation::get_speed": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation* ref = (MATraceLocation*) REF_MAP[@(refId)];
    
        methodResult(@(ref.speed));
    },
    
    @"MATraceLocation::get_time": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation* ref = (MATraceLocation*) REF_MAP[@(refId)];
    
        methodResult(@(ref.time));
    },
    
    @"MAUserLocationRepresentation::get_showsAccuracyRing": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        methodResult(@(ref.showsAccuracyRing));
    },
    
    @"MAUserLocationRepresentation::get_showsHeadingIndicator": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        methodResult(@(ref.showsHeadingIndicator));
    },
    
    @"MAUserLocationRepresentation::get_lineWidth": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineWidth));
    },
    
    @"MAUserLocationRepresentation::get_enablePulseAnnimation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        methodResult(@(ref.enablePulseAnnimation));
    },
    
    @"MAMapView::get_mapType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.mapType));
    },
    
    @"MAMapView::get_zoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.zoomLevel));
    },
    
    @"MAMapView::get_minZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.minZoomLevel));
    },
    
    @"MAMapView::get_maxZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.maxZoomLevel));
    },
    
    @"MAMapView::get_rotationDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.rotationDegree));
    },
    
    @"MAMapView::get_cameraDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.cameraDegree));
    },
    
    @"MAMapView::get_zoomingInPivotsAroundAnchorPoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.zoomingInPivotsAroundAnchorPoint));
    },
    
    @"MAMapView::get_isZoomEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isZoomEnabled));
    },
    
    @"MAMapView::get_isScrollEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isScrollEnabled));
    },
    
    @"MAMapView::get_isRotateEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isRotateEnabled));
    },
    
    @"MAMapView::get_isRotateCameraEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isRotateCameraEnabled));
    },
    
    @"MAMapView::get_isSkyModelEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isSkyModelEnabled));
    },
    
    @"MAMapView::get_isShowsBuildings": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isShowsBuildings));
    },
    
    @"MAMapView::get_isShowsLabels": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isShowsLabels));
    },
    
    @"MAMapView::get_isShowTraffic": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isShowTraffic));
    },
    
    @"MAMapView::get_trafficRatio": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.trafficRatio));
    },
    
    @"MAMapView::get_touchPOIEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.touchPOIEnabled));
    },
    
    @"MAMapView::get_showsCompass": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.showsCompass));
    },
    
    @"MAMapView::get_showsScale": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.showsScale));
    },
    
    @"MAMapView::get_metersPerPointForCurrentZoom": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.metersPerPointForCurrentZoom));
    },
    
    @"MAMapView::get_isAbroad": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isAbroad));
    },
    
    @"MAMapView::get_isAllowDecreaseFrame": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isAllowDecreaseFrame));
    },
    
    @"MAMapView::get_openGLESDisabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.openGLESDisabled));
    },
    
    @"MAMapView::get_allowsAnnotationViewSorting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.allowsAnnotationViewSorting));
    },
    
    @"MAMapView::get_showsUserLocation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.showsUserLocation));
    },
    
    @"MAMapView::get_customizeUserLocationAccuracyCircleRepresentation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.customizeUserLocationAccuracyCircleRepresentation));
    },
    
    @"MAMapView::get_userTrackingMode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.userTrackingMode));
    },
    
    @"MAMapView::get_isUserLocationVisible": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isUserLocationVisible));
    },
    
    @"MAMapView::get_pausesLocationUpdatesAutomatically": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.pausesLocationUpdatesAutomatically));
    },
    
    @"MAMapView::get_allowsBackgroundLocationUpdates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.allowsBackgroundLocationUpdates));
    },
    
    @"MAMapView::get_isShowsIndoorMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isShowsIndoorMap));
    },
    
    @"MAMapView::get_isShowsIndoorMapControl": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.isShowsIndoorMapControl));
    },
    
    @"MAMapView::get_customMapStyleEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(@(ref.customMapStyleEnabled));
    },
    
    @"MAOverlayPathRenderer::get_lineWidth": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineWidth));
    },
    
    @"MAOverlayPathRenderer::get_lineJoinType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineJoinType));
    },
    
    @"MAOverlayPathRenderer::get_lineCapType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineCapType));
    },
    
    @"MAOverlayPathRenderer::get_miterLimit": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        methodResult(@(ref.miterLimit));
    },
    
    @"MAOverlayPathRenderer::get_lineDash": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineDash));
    },
    
    @"MAOverlayPathRenderer::get_lineDashType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineDashType));
    },
    
    @"AMapNaviConfig::set_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appScheme = (NSString *) args[@"appScheme"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig* ref = (AMapNaviConfig*) REF_MAP[@(refId)];
    
        ref.appScheme = appScheme;
        methodResult(@"success");
    },
    
    @"AMapNaviConfig::set_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appName = (NSString *) args[@"appName"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig* ref = (AMapNaviConfig*) REF_MAP[@(refId)];
    
        ref.appName = appName;
        methodResult(@"success");
    },
    
    @"AMapNaviConfig::set_strategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        AMapDrivingStrategy strategy = (AMapDrivingStrategy) [args[@"strategy"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig* ref = (AMapNaviConfig*) REF_MAP[@(refId)];
    
        ref.strategy = strategy;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appScheme = (NSString *) args[@"appScheme"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        ref.appScheme = appScheme;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appName = (NSString *) args[@"appName"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        ref.appName = appName;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_drivingStrategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        AMapDrivingStrategy drivingStrategy = (AMapDrivingStrategy) [args[@"drivingStrategy"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        ref.drivingStrategy = drivingStrategy;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_transitStrategy": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        AMapTransitStrategy transitStrategy = (AMapTransitStrategy) [args[@"transitStrategy"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        ref.transitStrategy = transitStrategy;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_routeType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        AMapRouteSearchType routeType = (AMapRouteSearchType) [args[@"routeType"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        ref.routeType = routeType;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appScheme = (NSString *) args[@"appScheme"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig* ref = (AMapPOIConfig*) REF_MAP[@(refId)];
    
        ref.appScheme = appScheme;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * appName = (NSString *) args[@"appName"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig* ref = (AMapPOIConfig*) REF_MAP[@(refId)];
    
        ref.appName = appName;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_keywords": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * keywords = (NSString *) args[@"keywords"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig* ref = (AMapPOIConfig*) REF_MAP[@(refId)];
    
        ref.keywords = keywords;
        methodResult(@"success");
    },
    
    @"AMapServices::set_apiKey": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * apiKey = (NSString *) args[@"apiKey"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices* ref = (AMapServices*) REF_MAP[@(refId)];
    
        ref.apiKey = apiKey;
        methodResult(@"success");
    },
    
    @"AMapServices::set_enableHTTPS": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL enableHTTPS = [args[@"enableHTTPS"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices* ref = (AMapServices*) REF_MAP[@(refId)];
    
        ref.enableHTTPS = enableHTTPS;
        methodResult(@"success");
    },
    
    @"AMapServices::set_crashReportEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL crashReportEnabled = [args[@"crashReportEnabled"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices* ref = (AMapServices*) REF_MAP[@(refId)];
    
        ref.crashReportEnabled = crashReportEnabled;
        methodResult(@"success");
    },
    
    @"MAGroundOverlay::set_alpha": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat alpha = [args[@"alpha"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAGroundOverlay* ref = (MAGroundOverlay*) REF_MAP[@(refId)];
    
        ref.alpha = alpha;
        methodResult(@"success");
    },
    
    @"MAPinAnnotationView::set_pinColor": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MAPinAnnotationColor pinColor = (MAPinAnnotationColor) [args[@"pinColor"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPinAnnotationView* ref = (MAPinAnnotationView*) REF_MAP[@(refId)];
    
        ref.pinColor = pinColor;
        methodResult(@"success");
    },
    
    @"MAPinAnnotationView::set_animatesDrop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL animatesDrop = [args[@"animatesDrop"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPinAnnotationView* ref = (MAPinAnnotationView*) REF_MAP[@(refId)];
    
        ref.animatesDrop = animatesDrop;
        methodResult(@"success");
    },
    
    @"MAHeatMapNode::set_intensity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        float intensity = [args[@"intensity"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapNode* ref = (MAHeatMapNode*) REF_MAP[@(refId)];
    
        ref.intensity = intensity;
        methodResult(@"success");
    },
    
    @"MAHeatMapTileOverlay::set_radius": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger radius = [args[@"radius"] integerValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay* ref = (MAHeatMapTileOverlay*) REF_MAP[@(refId)];
    
        ref.radius = radius;
        methodResult(@"success");
    },
    
    @"MAHeatMapTileOverlay::set_opacity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat opacity = [args[@"opacity"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay* ref = (MAHeatMapTileOverlay*) REF_MAP[@(refId)];
    
        ref.opacity = opacity;
        methodResult(@"success");
    },
    
    @"MAHeatMapTileOverlay::set_allowRetinaAdapting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL allowRetinaAdapting = [args[@"allowRetinaAdapting"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay* ref = (MAHeatMapTileOverlay*) REF_MAP[@(refId)];
    
        ref.allowRetinaAdapting = allowRetinaAdapting;
        methodResult(@"success");
    },
    
    @"MAMapStatus::set_zoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat zoomLevel = [args[@"zoomLevel"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus* ref = (MAMapStatus*) REF_MAP[@(refId)];
    
        ref.zoomLevel = zoomLevel;
        methodResult(@"success");
    },
    
    @"MAMapStatus::set_rotationDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat rotationDegree = [args[@"rotationDegree"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus* ref = (MAMapStatus*) REF_MAP[@(refId)];
    
        ref.rotationDegree = rotationDegree;
        methodResult(@"success");
    },
    
    @"MAMapStatus::set_cameraDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat cameraDegree = [args[@"cameraDegree"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapStatus* ref = (MAMapStatus*) REF_MAP[@(refId)];
    
        ref.cameraDegree = cameraDegree;
        methodResult(@"success");
    },
    
    @"MAPointAnnotation::set_lockedToScreen": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL lockedToScreen = [args[@"lockedToScreen"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPointAnnotation* ref = (MAPointAnnotation*) REF_MAP[@(refId)];
    
        ref.lockedToScreen = lockedToScreen;
        methodResult(@"success");
    },
    
    @"MAMapCustomStyleOptions::set_styleId": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * styleId = (NSString *) args[@"styleId"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapCustomStyleOptions* ref = (MAMapCustomStyleOptions*) REF_MAP[@(refId)];
    
        ref.styleId = styleId;
        methodResult(@"success");
    },
    
    @"MAMultiColoredPolylineRenderer::set_gradient": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL gradient = [args[@"gradient"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiColoredPolylineRenderer* ref = (MAMultiColoredPolylineRenderer*) REF_MAP[@(refId)];
    
        ref.gradient = gradient;
        methodResult(@"success");
    },
    
    @"MAPolylineRenderer::set_is3DArrowLine": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL is3DArrowLine = [args[@"is3DArrowLine"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolylineRenderer* ref = (MAPolylineRenderer*) REF_MAP[@(refId)];
    
        ref.is3DArrowLine = is3DArrowLine;
        methodResult(@"success");
    },
    
    @"MAShape::set_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * title = (NSString *) args[@"title"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAShape* ref = (MAShape*) REF_MAP[@(refId)];
    
        ref.title = title;
        methodResult(@"success");
    },
    
    @"MAShape::set_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * subtitle = (NSString *) args[@"subtitle"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAShape* ref = (MAShape*) REF_MAP[@(refId)];
    
        ref.subtitle = subtitle;
        methodResult(@"success");
    },
    
    @"MAAnnotationView::set_zIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger zIndex = [args[@"zIndex"] integerValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        ref.zIndex = zIndex;
        methodResult(@"success");
    },
    
    @"MAAnnotationView::set_enabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL enabled = [args[@"enabled"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        ref.enabled = enabled;
        methodResult(@"success");
    },
    
    @"MAAnnotationView::set_highlighted": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL highlighted = [args[@"highlighted"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        ref.highlighted = highlighted;
        methodResult(@"success");
    },
    
    @"MAAnnotationView::set_selected": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL selected = [args[@"selected"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        ref.selected = selected;
        methodResult(@"success");
    },
    
    @"MAAnnotationView::set_canShowCallout": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL canShowCallout = [args[@"canShowCallout"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        ref.canShowCallout = canShowCallout;
        methodResult(@"success");
    },
    
    @"MAAnnotationView::set_draggable": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL draggable = [args[@"draggable"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        ref.draggable = draggable;
        methodResult(@"success");
    },
    
    @"MAAnnotationView::set_dragState": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MAAnnotationViewDragState dragState = (MAAnnotationViewDragState) [args[@"dragState"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        ref.dragState = dragState;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_minimumZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger minimumZ = [args[@"minimumZ"] integerValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        ref.minimumZ = minimumZ;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_maximumZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger maximumZ = [args[@"maximumZ"] integerValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        ref.maximumZ = maximumZ;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_canReplaceMapContent": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL canReplaceMapContent = [args[@"canReplaceMapContent"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        ref.canReplaceMapContent = canReplaceMapContent;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_disableOffScreenTileLoading": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL disableOffScreenTileLoading = [args[@"disableOffScreenTileLoading"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        ref.disableOffScreenTileLoading = disableOffScreenTileLoading;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_visibile": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL visibile = [args[@"visibile"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions* ref = (MAParticleOverlayOptions*) REF_MAP[@(refId)];
    
        ref.visibile = visibile;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_loop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL loop = [args[@"loop"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions* ref = (MAParticleOverlayOptions*) REF_MAP[@(refId)];
    
        ref.loop = loop;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_maxParticles": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger maxParticles = [args[@"maxParticles"] integerValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions* ref = (MAParticleOverlayOptions*) REF_MAP[@(refId)];
    
        ref.maxParticles = maxParticles;
        methodResult(@"success");
    },
    
    @"MAMultiPointItem::set_customID": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * customID = (NSString *) args[@"customID"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem* ref = (MAMultiPointItem*) REF_MAP[@(refId)];
    
        ref.customID = customID;
        methodResult(@"success");
    },
    
    @"MAMultiPointItem::set_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * title = (NSString *) args[@"title"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem* ref = (MAMultiPointItem*) REF_MAP[@(refId)];
    
        ref.title = title;
        methodResult(@"success");
    },
    
    @"MAMultiPointItem::set_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSString * subtitle = (NSString *) args[@"subtitle"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem* ref = (MAMultiPointItem*) REF_MAP[@(refId)];
    
        ref.subtitle = subtitle;
        methodResult(@"success");
    },
    
    @"MACustomBuildingOverlayOption::set_height": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat height = [args[@"height"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption* ref = (MACustomBuildingOverlayOption*) REF_MAP[@(refId)];
    
        ref.height = height;
        methodResult(@"success");
    },
    
    @"MACustomBuildingOverlayOption::set_heightScale": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat heightScale = [args[@"heightScale"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption* ref = (MACustomBuildingOverlayOption*) REF_MAP[@(refId)];
    
        ref.heightScale = heightScale;
        methodResult(@"success");
    },
    
    @"MACustomBuildingOverlayOption::set_visibile": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL visibile = [args[@"visibile"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption* ref = (MACustomBuildingOverlayOption*) REF_MAP[@(refId)];
    
        ref.visibile = visibile;
        methodResult(@"success");
    },
    
    @"MATraceLocation::set_angle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        double angle = [args[@"angle"] doubleValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation* ref = (MATraceLocation*) REF_MAP[@(refId)];
    
        ref.angle = angle;
        methodResult(@"success");
    },
    
    @"MATraceLocation::set_speed": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        double speed = [args[@"speed"] doubleValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation* ref = (MATraceLocation*) REF_MAP[@(refId)];
    
        ref.speed = speed;
        methodResult(@"success");
    },
    
    @"MATraceLocation::set_time": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        double time = [args[@"time"] doubleValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation* ref = (MATraceLocation*) REF_MAP[@(refId)];
    
        ref.time = time;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_showsAccuracyRing": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsAccuracyRing = [args[@"showsAccuracyRing"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        ref.showsAccuracyRing = showsAccuracyRing;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_showsHeadingIndicator": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsHeadingIndicator = [args[@"showsHeadingIndicator"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        ref.showsHeadingIndicator = showsHeadingIndicator;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_lineWidth": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat lineWidth = [args[@"lineWidth"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        ref.lineWidth = lineWidth;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_enablePulseAnnimation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL enablePulseAnnimation = [args[@"enablePulseAnnimation"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        ref.enablePulseAnnimation = enablePulseAnnimation;
        methodResult(@"success");
    },
    
    @"MAMapView::set_mapType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MAMapType mapType = (MAMapType) [args[@"mapType"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.mapType = mapType;
        methodResult(@"success");
    },
    
    @"MAMapView::set_zoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat zoomLevel = [args[@"zoomLevel"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.zoomLevel = zoomLevel;
        methodResult(@"success");
    },
    
    @"MAMapView::set_minZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat minZoomLevel = [args[@"minZoomLevel"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.minZoomLevel = minZoomLevel;
        methodResult(@"success");
    },
    
    @"MAMapView::set_maxZoomLevel": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat maxZoomLevel = [args[@"maxZoomLevel"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.maxZoomLevel = maxZoomLevel;
        methodResult(@"success");
    },
    
    @"MAMapView::set_rotationDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat rotationDegree = [args[@"rotationDegree"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.rotationDegree = rotationDegree;
        methodResult(@"success");
    },
    
    @"MAMapView::set_cameraDegree": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat cameraDegree = [args[@"cameraDegree"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.cameraDegree = cameraDegree;
        methodResult(@"success");
    },
    
    @"MAMapView::set_zoomingInPivotsAroundAnchorPoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL zoomingInPivotsAroundAnchorPoint = [args[@"zoomingInPivotsAroundAnchorPoint"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.zoomingInPivotsAroundAnchorPoint = zoomingInPivotsAroundAnchorPoint;
        methodResult(@"success");
    },
    
    @"MAMapView::set_zoomEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL zoomEnabled = [args[@"zoomEnabled"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.zoomEnabled = zoomEnabled;
        methodResult(@"success");
    },
    
    @"MAMapView::set_scrollEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL scrollEnabled = [args[@"scrollEnabled"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.scrollEnabled = scrollEnabled;
        methodResult(@"success");
    },
    
    @"MAMapView::set_rotateEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL rotateEnabled = [args[@"rotateEnabled"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.rotateEnabled = rotateEnabled;
        methodResult(@"success");
    },
    
    @"MAMapView::set_rotateCameraEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL rotateCameraEnabled = [args[@"rotateCameraEnabled"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.rotateCameraEnabled = rotateCameraEnabled;
        methodResult(@"success");
    },
    
    @"MAMapView::set_skyModelEnable": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL skyModelEnable = [args[@"skyModelEnable"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.skyModelEnable = skyModelEnable;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showsBuildings": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsBuildings = [args[@"showsBuildings"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showsBuildings = showsBuildings;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showsLabels": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsLabels = [args[@"showsLabels"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showsLabels = showsLabels;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showTraffic": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showTraffic = [args[@"showTraffic"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showTraffic = showTraffic;
        methodResult(@"success");
    },
    
    @"MAMapView::set_trafficRatio": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat trafficRatio = [args[@"trafficRatio"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.trafficRatio = trafficRatio;
        methodResult(@"success");
    },
    
    @"MAMapView::set_touchPOIEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL touchPOIEnabled = [args[@"touchPOIEnabled"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.touchPOIEnabled = touchPOIEnabled;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showsCompass": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsCompass = [args[@"showsCompass"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showsCompass = showsCompass;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showsScale": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsScale = [args[@"showsScale"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showsScale = showsScale;
        methodResult(@"success");
    },
    
    @"MAMapView::set_isAllowDecreaseFrame": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL isAllowDecreaseFrame = [args[@"isAllowDecreaseFrame"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.isAllowDecreaseFrame = isAllowDecreaseFrame;
        methodResult(@"success");
    },
    
    @"MAMapView::set_openGLESDisabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL openGLESDisabled = [args[@"openGLESDisabled"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.openGLESDisabled = openGLESDisabled;
        methodResult(@"success");
    },
    
    @"MAMapView::set_allowsAnnotationViewSorting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL allowsAnnotationViewSorting = [args[@"allowsAnnotationViewSorting"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.allowsAnnotationViewSorting = allowsAnnotationViewSorting;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showsUserLocation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsUserLocation = [args[@"showsUserLocation"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showsUserLocation = showsUserLocation;
        methodResult(@"success");
    },
    
    @"MAMapView::set_customizeUserLocationAccuracyCircleRepresentation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL customizeUserLocationAccuracyCircleRepresentation = [args[@"customizeUserLocationAccuracyCircleRepresentation"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.customizeUserLocationAccuracyCircleRepresentation = customizeUserLocationAccuracyCircleRepresentation;
        methodResult(@"success");
    },
    
    @"MAMapView::set_userTrackingMode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MAUserTrackingMode userTrackingMode = (MAUserTrackingMode) [args[@"userTrackingMode"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.userTrackingMode = userTrackingMode;
        methodResult(@"success");
    },
    
    @"MAMapView::set_pausesLocationUpdatesAutomatically": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL pausesLocationUpdatesAutomatically = [args[@"pausesLocationUpdatesAutomatically"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.pausesLocationUpdatesAutomatically = pausesLocationUpdatesAutomatically;
        methodResult(@"success");
    },
    
    @"MAMapView::set_allowsBackgroundLocationUpdates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL allowsBackgroundLocationUpdates = [args[@"allowsBackgroundLocationUpdates"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.allowsBackgroundLocationUpdates = allowsBackgroundLocationUpdates;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showsIndoorMap": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsIndoorMap = [args[@"showsIndoorMap"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showsIndoorMap = showsIndoorMap;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showsIndoorMapControl": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL showsIndoorMapControl = [args[@"showsIndoorMapControl"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showsIndoorMapControl = showsIndoorMapControl;
        methodResult(@"success");
    },
    
    @"MAMapView::set_customMapStyleEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL customMapStyleEnabled = [args[@"customMapStyleEnabled"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.customMapStyleEnabled = customMapStyleEnabled;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineWidth": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat lineWidth = [args[@"lineWidth"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        ref.lineWidth = lineWidth;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineJoinType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MALineJoinType lineJoinType = (MALineJoinType) [args[@"lineJoinType"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        ref.lineJoinType = lineJoinType;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineCapType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MALineCapType lineCapType = (MALineCapType) [args[@"lineCapType"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        ref.lineCapType = lineCapType;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_miterLimit": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        CGFloat miterLimit = [args[@"miterLimit"] floatValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        ref.miterLimit = miterLimit;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineDash": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        BOOL lineDash = [args[@"lineDash"] boolValue];;
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        ref.lineDash = lineDash;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineDashType": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MALineDashType lineDashType = (MALineDashType) [args[@"lineDashType"] integerValue];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
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

  // 处理channel
  [channel setMethodCallHandler:^(FlutterMethodCall * _Nonnull methodCall, FlutterResult  _Nonnull methodResult) {
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
          }
          else {
              if (_handlerMap[methodCall.method] != nil) {
                  _handlerMap[methodCall.method](registrar, args, methodResult);
              } else {
                  methodResult(FlutterMethodNotImplemented);
              }
          }
      }];

  // 注册View
  [registrar registerViewFactory: [[MAAnnotationViewFactory alloc] init] withId: @"me.yohom/MAAnnotationView"];
  [registrar registerViewFactory: [[MACustomCalloutViewFactory alloc] init] withId: @"me.yohom/MACustomCalloutView"];
  [registrar registerViewFactory: [[MAMapViewFactory alloc] init] withId: @"me.yohom/MAMapView"];
}

// 委托方法们
- (void)traceManager : (MATraceManager*)manager didTrace: (NSArray<CLLocation*>*)locations correct: (NSArray<MATracePoint*>*)tracePoints distance: (double)distance withError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"traceManager:MATraceManager*:NSArray<CLLocation*>*:NSArray<MATracePoint*>*:double:NSError*" arguments:@{@"manager": @(manager.hash), @"locations": @(locations.hash), @"tracePoints": @(tracePoints.hash), @"distance": @(distance.hash), @"error": @(error.hash)}];
  
}
- (void)mapViewRequireLocationAuth : (CLLocationManager*)locationManager
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewRequireLocationAuth:CLLocationManager*" arguments:@{@"locationManager": @(locationManager.hash)}];
  
}
- (void)multiPointOverlayRenderer : (MAMultiPointOverlayRenderer*)renderer didItemTapped: (MAMultiPointItem*)item
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"multiPointOverlayRenderer:MAMultiPointOverlayRenderer*:MAMultiPointItem*" arguments:@{@"renderer": @(renderer.hash), @"item": @(item.hash)}];
  
}
- (void)mapViewRegionChanged : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewRegionChanged:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView regionWillChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"animated": @(animated.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView regionDidChangeAnimated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"animated": @(animated.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView mapWillMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView mapDidMoveByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView mapWillZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView mapDidZoomByUser: (BOOL)wasUserAction
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"wasUserAction": @(wasUserAction.hash)}];
  
}
- (void)mapViewWillStartLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewWillStartLoadingMap:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}
- (void)mapViewDidFinishLoadingMap : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewDidFinishLoadingMap:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}
- (void)mapViewDidFailLoadingMap : (MAMapView*)mapView withError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewDidFailLoadingMap:MAMapView*:NSError*" arguments:@{@"mapView": @(mapView.hash), @"error": @(error.hash)}];
  
}
- (MAAnnotationView*)mapView : (MAMapView*)mapView viewForAnnotation: (id<MAAnnotation>)annotation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  __block MAAnnotationView* _result = nil;
  [channel invokeMethod:@"mapView:MAMapView*:id<MAAnnotation>"
              arguments:@{@"mapView": @(mapView.hash), @"annotation": @(annotation.hash)}
                 result:^(id result) {
                   _result = (MAAnnotationView*) result;
                 }];
  
  while (!_result) {
    // _result有值前, 空转
  }
  
  return _result;
}
- (void)mapView : (MAMapView*)mapView didAddAnnotationViews: (NSArray*)views
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:NSArray*" arguments:@{@"mapView": @(mapView.hash), @"views": @(views.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didSelectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didDeselectAnnotationView: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}
- (void)mapViewWillStartLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewWillStartLocatingUser:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}
- (void)mapViewDidStopLocatingUser : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapViewDidStopLocatingUser:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didUpdateUserLocation: (MAUserLocation*)userLocation updatingLocation: (BOOL)updatingLocation
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAUserLocation*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"userLocation": @(userLocation.hash), @"updatingLocation": @(updatingLocation.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didFailToLocateUserWithError: (NSError*)error
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:NSError*" arguments:@{@"mapView": @(mapView.hash), @"error": @(error.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view didChangeDragState: (MAAnnotationViewDragState)newState fromOldState: (MAAnnotationViewDragState)oldState
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*:MAAnnotationViewDragState:MAAnnotationViewDragState" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash), @"newState": @(newState.hash), @"oldState": @(oldState.hash)}];
  
}
- (MAOverlayRenderer*)mapView : (MAMapView*)mapView rendererForOverlay: (id<MAOverlay>)overlay
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  __block MAOverlayRenderer* _result = nil;
  [channel invokeMethod:@"mapView:MAMapView*:id<MAOverlay>"
              arguments:@{@"mapView": @(mapView.hash), @"overlay": @(overlay.hash)}
                 result:^(id result) {
                   _result = (MAOverlayRenderer*) result;
                 }];
  
  while (!_result) {
    // _result有值前, 空转
  }
  
  return _result;
}
- (void)mapView : (MAMapView*)mapView didAddOverlayRenderers: (NSArray*)overlayRenderers
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:NSArray*" arguments:@{@"mapView": @(mapView.hash), @"overlayRenderers": @(overlayRenderers.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView annotationView: (MAAnnotationView*)view calloutAccessoryControlTapped: (UIControl*)control
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*:UIControl*" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash), @"control": @(control.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didAnnotationViewCalloutTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didAnnotationViewTapped: (MAAnnotationView*)view
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAAnnotationView*" arguments:@{@"mapView": @(mapView.hash), @"view": @(view.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didChangeUserTrackingMode: (MAUserTrackingMode)mode animated: (BOOL)animated
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAUserTrackingMode:BOOL" arguments:@{@"mapView": @(mapView.hash), @"mode": @(mode.hash), @"animated": @(animated.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didChangeOpenGLESDisabled: (BOOL)openGLESDisabled
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:BOOL" arguments:@{@"mapView": @(mapView.hash), @"openGLESDisabled": @(openGLESDisabled.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didTouchPois: (NSArray*)pois
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:NSArray*" arguments:@{@"mapView": @(mapView.hash), @"pois": @(pois.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didSingleTappedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:CLLocationCoordinate2D" arguments:@{@"mapView": @(mapView.hash), @"coordinate": @(coordinate.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didLongPressedAtCoordinate: (CLLocationCoordinate2D)coordinate
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:CLLocationCoordinate2D" arguments:@{@"mapView": @(mapView.hash), @"coordinate": @(coordinate.hash)}];
  
}
- (void)mapInitComplete : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapInitComplete:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didIndoorMapShowed: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAIndoorInfo*" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didIndoorMapFloorIndexChanged: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAIndoorInfo*" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}
- (void)mapView : (MAMapView*)mapView didIndoorMapHidden: (MAIndoorInfo*)indoorInfo
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"mapView:MAMapView*:MAIndoorInfo*" arguments:@{@"mapView": @(mapView.hash), @"indoorInfo": @(indoorInfo.hash)}];
  
}
- (void)offlineDataWillReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"offlineDataWillReload:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}
- (void)offlineDataDidReload : (MAMapView*)mapView
{
  FlutterMethodChannel *channel = [FlutterMethodChannel
      methodChannelWithName:@"#__method_channel__#"
            binaryMessenger:[_registrar messenger]];

  [channel invokeMethod:@"offlineDataDidReload:MAMapView*" arguments:@{@"mapView": @(mapView.hash)}];
  
}

@end