#import "AmapBaseFlutterPlugin.h"
#import <AMapFoundationKit/AMapFoundationKit.h>
#import <MAMapKit/MAMapKit.h>
#import "MAAnnotationViewFactory.h"
#import "MACustomCalloutViewFactory.h"
#import "MAMapViewFactory.h"

typedef void (^Handler)(NSObject <FlutterPluginRegistrar> *, NSDictionary<NSString *, NSObject *> *, FlutterResult);

NSMutableDictionary<NSNumber *, NSObject *> *REF_MAP;

@implementation AmapBaseFlutterPlugin

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
    
  };

  // 处理channel
  [channel setMethodCallHandler:^(FlutterMethodCall * _Nonnull methodCall, FlutterResult  _Nonnull methodResult) {
          NSDictionary<NSString *, NSObject *> *args = (NSDictionary<NSString *, NSObject *> *) [methodCall arguments];
          if ([@"SystemRef::release" isEqualToString:methodCall.method]) {
              [REF_MAP removeObjectForKey:(NSNumber *) args[@"refId"]];
              methodResult(@"success");
          } else if ([@"SystemRef::clearRefMap" isEqualToString:methodCall.method]) {
              [REF_MAP removeAllObjects];
              methodResult(@"success");
          } else {
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

@end