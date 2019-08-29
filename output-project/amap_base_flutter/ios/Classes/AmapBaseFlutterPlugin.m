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
    @"MAMultiTexturePolylineRenderer::loadStrokeTextureImages": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSArray* textureImages = (NSArray*) args[@"textureImages"];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiTexturePolylineRenderer* ref = (MAMultiTexturePolylineRenderer *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        BOOL result = [ref loadStrokeTextureImages: textureImages];
    
        // 调用结果
        methodResult(@(result));
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
        BOOL selected = (BOOL) args[@"selected"];
        // jsonable参数
        BOOL animated = (BOOL) args[@"animated"];
    
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
        MAAnnotationViewDragState newDragState = (MAAnnotationViewDragState) args[@"newDragState"];
        // jsonable参数
        BOOL animated = (BOOL) args[@"animated"];
    
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
    @"MAMapView::addAnnotations": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSArray* annotations = (NSArray*) args[@"annotations"];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref addAnnotations : annotations];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::removeAnnotations": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSArray* annotations = (NSArray*) args[@"annotations"];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref removeAnnotations : annotations];
    
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
    @"MAMapView::showAnnotations": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSArray* annotations = (NSArray*) args[@"annotations"];
        // jsonable参数
        BOOL animated = (BOOL) args[@"animated"];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref showAnnotations : annotations animated: animated];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::setUserTrackingMode": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // 枚举参数
        MAUserTrackingMode mode = (MAUserTrackingMode) args[@"mode"];
        // jsonable参数
        BOOL animated = (BOOL) args[@"animated"];
    
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
        MAOverlayLevel level = (MAOverlayLevel) args[@"level"];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        NSArray* result = [ref overlaysInLevel: level];
    
        // 调用结果
        methodResult(result);
    },
    @"MAMapView::addOverlays": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSArray* overlays = (NSArray*) args[@"overlays"];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref addOverlays : overlays];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::removeOverlays": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSArray* overlays = (NSArray*) args[@"overlays"];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref removeOverlays : overlays];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::showOverlays": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSArray* overlays = (NSArray*) args[@"overlays"];
        // jsonable参数
        BOOL animated = (BOOL) args[@"animated"];
    
        // 调用对象引用
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView *) REF_MAP[@(refId)];
    
        // 日志打印
    
    
        // 开始调用
        [ref showOverlays : overlays animated: animated];
    
        // 调用结果
        methodResult(@"success");
    },
    @"MAMapView::setCurrentIndoorMapFloorIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 参数
        // jsonable参数
        NSInteger floorIndex = (NSInteger) args[@"floorIndex"];
    
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
    
    @"MAHeatMapTileOverlay::get_allowRetinaAdapting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay* ref = (MAHeatMapTileOverlay*) REF_MAP[@(refId)];
    
        methodResult(@(ref.allowRetinaAdapting));
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
    
    @"MAMultiTexturePolylineRenderer::get_strokeTextureImages": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiTexturePolylineRenderer* ref = (MAMultiTexturePolylineRenderer*) REF_MAP[@(refId)];
    
        methodResult(ref.strokeTextureImages);
    },
    
    @"MAOfflineProvince::get_cities": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOfflineProvince* ref = (MAOfflineProvince*) REF_MAP[@(refId)];
    
        methodResult(ref.cities);
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
    
    @"MAIndoorInfo::get_floorInfo": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAIndoorInfo* ref = (MAIndoorInfo*) REF_MAP[@(refId)];
    
        methodResult(ref.floorInfo);
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
    
//    @"MAOfflineMap::get_": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
//        // 引用对象
//        NSInteger refId = [args[@"refId"] integerValue];
//        MAOfflineMap* ref = (MAOfflineMap*) REF_MAP[@(refId)];
//    
//        methodResult(ref.);
//    },
//    
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
    
    @"MAUserLocationRepresentation::get_enablePulseAnnimation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        methodResult(@(ref.enablePulseAnnimation));
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
    
    @"MAMapView::get_annotations": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(ref.annotations);
    },
    
    @"MAMapView::get_selectedAnnotations": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(ref.selectedAnnotations);
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
    
    @"MAMapView::get_overlays": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        methodResult(ref.overlays);
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
    
    @"MAOverlayPathRenderer::get_lineDash": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        // 引用对象
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        methodResult(@(ref.lineDash));
    },
    
    @"AMapNaviConfig::set_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * appScheme = (NSString *) args[@"appScheme"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig* ref = (AMapNaviConfig*) REF_MAP[@(refId)];
    
        ref.appScheme = appScheme;
        methodResult(@"success");
    },
    
    @"AMapNaviConfig::set_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * appName = (NSString *) args[@"appName"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapNaviConfig* ref = (AMapNaviConfig*) REF_MAP[@(refId)];
    
        ref.appName = appName;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * appScheme = (NSString *) args[@"appScheme"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        ref.appScheme = appScheme;
        methodResult(@"success");
    },
    
    @"AMapRouteConfig::set_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * appName = (NSString *) args[@"appName"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapRouteConfig* ref = (AMapRouteConfig*) REF_MAP[@(refId)];
    
        ref.appName = appName;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_appScheme": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * appScheme = (NSString *) args[@"appScheme"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig* ref = (AMapPOIConfig*) REF_MAP[@(refId)];
    
        ref.appScheme = appScheme;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_appName": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * appName = (NSString *) args[@"appName"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig* ref = (AMapPOIConfig*) REF_MAP[@(refId)];
    
        ref.appName = appName;
        methodResult(@"success");
    },
    
    @"AMapPOIConfig::set_keywords": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * keywords = (NSString *) args[@"keywords"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapPOIConfig* ref = (AMapPOIConfig*) REF_MAP[@(refId)];
    
        ref.keywords = keywords;
        methodResult(@"success");
    },
    
    @"AMapServices::set_apiKey": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * apiKey = (NSString *) args[@"apiKey"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices* ref = (AMapServices*) REF_MAP[@(refId)];
    
        ref.apiKey = apiKey;
        methodResult(@"success");
    },
    
    @"AMapServices::set_enableHTTPS": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL enableHTTPS = (BOOL) args[@"enableHTTPS"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices* ref = (AMapServices*) REF_MAP[@(refId)];
    
        ref.enableHTTPS = enableHTTPS;
        methodResult(@"success");
    },
    
    @"AMapServices::set_crashReportEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL crashReportEnabled = (BOOL) args[@"crashReportEnabled"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        AMapServices* ref = (AMapServices*) REF_MAP[@(refId)];
    
        ref.crashReportEnabled = crashReportEnabled;
        methodResult(@"success");
    },
    
    @"MAPinAnnotationView::set_animatesDrop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL animatesDrop = (BOOL) args[@"animatesDrop"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPinAnnotationView* ref = (MAPinAnnotationView*) REF_MAP[@(refId)];
    
        ref.animatesDrop = animatesDrop;
        methodResult(@"success");
    },
    
    @"MAHeatMapNode::set_intensity": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSNumber* intensity = (NSNumber*) args[@"intensity"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapNode* ref = (MAHeatMapNode*) REF_MAP[@(refId)];
    
        ref.intensity = intensity.floatValue;
        methodResult(@"success");
    },
    
    @"MAHeatMapTileOverlay::set_radius": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSInteger radius = (NSInteger) args[@"radius"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay* ref = (MAHeatMapTileOverlay*) REF_MAP[@(refId)];
    
        ref.radius = radius;
        methodResult(@"success");
    },
    
    @"MAHeatMapTileOverlay::set_allowRetinaAdapting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL allowRetinaAdapting = (BOOL) args[@"allowRetinaAdapting"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAHeatMapTileOverlay* ref = (MAHeatMapTileOverlay*) REF_MAP[@(refId)];
    
        ref.allowRetinaAdapting = allowRetinaAdapting;
        methodResult(@"success");
    },
    
    @"MAMapCustomStyleOptions::set_styleId": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * styleId = (NSString *) args[@"styleId"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapCustomStyleOptions* ref = (MAMapCustomStyleOptions*) REF_MAP[@(refId)];
    
        ref.styleId = styleId;
        methodResult(@"success");
    },
    
    @"MAMultiTexturePolylineRenderer::set_strokeTextureImages": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSArray * strokeTextureImages = (NSArray *) args[@"strokeTextureImages"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiTexturePolylineRenderer* ref = (MAMultiTexturePolylineRenderer*) REF_MAP[@(refId)];
    
        ref.strokeTextureImages = strokeTextureImages;
        methodResult(@"success");
    },
    
    @"MAPolylineRenderer::set_is3DArrowLine": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL is3DArrowLine = (BOOL) args[@"is3DArrowLine"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAPolylineRenderer* ref = (MAPolylineRenderer*) REF_MAP[@(refId)];
    
        ref.is3DArrowLine = is3DArrowLine;
        methodResult(@"success");
    },
    
    @"MAShape::set_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * title = (NSString *) args[@"title"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAShape* ref = (MAShape*) REF_MAP[@(refId)];
    
        ref.title = title;
        methodResult(@"success");
    },
    
    @"MAShape::set_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * subtitle = (NSString *) args[@"subtitle"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAShape* ref = (MAShape*) REF_MAP[@(refId)];
    
        ref.subtitle = subtitle;
        methodResult(@"success");
    },
    
    @"MAAnnotationView::set_zIndex": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSInteger zIndex = (NSInteger) args[@"zIndex"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        ref.zIndex = zIndex;
        methodResult(@"success");
    },
    
    @"MAAnnotationView::set_canShowCallout": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL canShowCallout = (BOOL) args[@"canShowCallout"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAAnnotationView* ref = (MAAnnotationView*) REF_MAP[@(refId)];
    
        ref.canShowCallout = canShowCallout;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_minimumZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSInteger minimumZ = (NSInteger) args[@"minimumZ"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        ref.minimumZ = minimumZ;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_maximumZ": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSInteger maximumZ = (NSInteger) args[@"maximumZ"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        ref.maximumZ = maximumZ;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_canReplaceMapContent": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL canReplaceMapContent = (BOOL) args[@"canReplaceMapContent"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        ref.canReplaceMapContent = canReplaceMapContent;
        methodResult(@"success");
    },
    
    @"MATileOverlay::set_disableOffScreenTileLoading": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL disableOffScreenTileLoading = (BOOL) args[@"disableOffScreenTileLoading"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATileOverlay* ref = (MATileOverlay*) REF_MAP[@(refId)];
    
        ref.disableOffScreenTileLoading = disableOffScreenTileLoading;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_visibile": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL visibile = (BOOL) args[@"visibile"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions* ref = (MAParticleOverlayOptions*) REF_MAP[@(refId)];
    
        ref.visibile = visibile;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_loop": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL loop = (BOOL) args[@"loop"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions* ref = (MAParticleOverlayOptions*) REF_MAP[@(refId)];
    
        ref.loop = loop;
        methodResult(@"success");
    },
    
    @"MAParticleOverlayOptions::set_maxParticles": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSInteger maxParticles = (NSInteger) args[@"maxParticles"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAParticleOverlayOptions* ref = (MAParticleOverlayOptions*) REF_MAP[@(refId)];
    
        ref.maxParticles = maxParticles;
        methodResult(@"success");
    },
    
    @"MAMultiPointItem::set_customID": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * customID = (NSString *) args[@"customID"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem* ref = (MAMultiPointItem*) REF_MAP[@(refId)];
    
        ref.customID = customID;
        methodResult(@"success");
    },
    
    @"MAMultiPointItem::set_title": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * title = (NSString *) args[@"title"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem* ref = (MAMultiPointItem*) REF_MAP[@(refId)];
    
        ref.title = title;
        methodResult(@"success");
    },
    
    @"MAMultiPointItem::set_subtitle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSString * subtitle = (NSString *) args[@"subtitle"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMultiPointItem* ref = (MAMultiPointItem*) REF_MAP[@(refId)];
    
        ref.subtitle = subtitle;
        methodResult(@"success");
    },
    
    @"MACustomBuildingOverlayOption::set_visibile": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL visibile = (BOOL) args[@"visibile"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MACustomBuildingOverlayOption* ref = (MACustomBuildingOverlayOption*) REF_MAP[@(refId)];
    
        ref.visibile = visibile;
        methodResult(@"success");
    },
    
    @"MATraceLocation::set_angle": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSNumber* angle = (NSNumber*) args[@"angle"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation* ref = (MATraceLocation*) REF_MAP[@(refId)];
    
        ref.angle = angle.doubleValue;
        methodResult(@"success");
    },
    
    @"MATraceLocation::set_speed": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSNumber* speed = (NSNumber*) args[@"speed"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation* ref = (MATraceLocation*) REF_MAP[@(refId)];
    
        ref.speed = speed.doubleValue;
        methodResult(@"success");
    },
    
    @"MATraceLocation::set_time": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSNumber* time = (NSNumber*) args[@"time"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MATraceLocation* ref = (MATraceLocation*) REF_MAP[@(refId)];
    
        ref.time = time.doubleValue;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_showsAccuracyRing": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL showsAccuracyRing = (BOOL) args[@"showsAccuracyRing"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        ref.showsAccuracyRing = showsAccuracyRing;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_showsHeadingIndicator": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL showsHeadingIndicator = (BOOL) args[@"showsHeadingIndicator"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        ref.showsHeadingIndicator = showsHeadingIndicator;
        methodResult(@"success");
    },
    
    @"MAUserLocationRepresentation::set_enablePulseAnnimation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL enablePulseAnnimation = (BOOL) args[@"enablePulseAnnimation"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAUserLocationRepresentation* ref = (MAUserLocationRepresentation*) REF_MAP[@(refId)];
    
        ref.enablePulseAnnimation = enablePulseAnnimation;
        methodResult(@"success");
    },
    
    @"MAMapView::set_zoomingInPivotsAroundAnchorPoint": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL zoomingInPivotsAroundAnchorPoint = (BOOL) args[@"zoomingInPivotsAroundAnchorPoint"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.zoomingInPivotsAroundAnchorPoint = zoomingInPivotsAroundAnchorPoint;
        methodResult(@"success");
    },
    
    @"MAMapView::set_touchPOIEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL touchPOIEnabled = (BOOL) args[@"touchPOIEnabled"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.touchPOIEnabled = touchPOIEnabled;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showsCompass": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL showsCompass = (BOOL) args[@"showsCompass"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showsCompass = showsCompass;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showsScale": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL showsScale = (BOOL) args[@"showsScale"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showsScale = showsScale;
        methodResult(@"success");
    },
    
    @"MAMapView::set_isAllowDecreaseFrame": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL isAllowDecreaseFrame = (BOOL) args[@"isAllowDecreaseFrame"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.isAllowDecreaseFrame = isAllowDecreaseFrame;
        methodResult(@"success");
    },
    
    @"MAMapView::set_openGLESDisabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL openGLESDisabled = (BOOL) args[@"openGLESDisabled"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.openGLESDisabled = openGLESDisabled;
        methodResult(@"success");
    },
    
    @"MAMapView::set_selectedAnnotations": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        NSArray * selectedAnnotations = (NSArray *) args[@"selectedAnnotations"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.selectedAnnotations = selectedAnnotations;
        methodResult(@"success");
    },
    
    @"MAMapView::set_allowsAnnotationViewSorting": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL allowsAnnotationViewSorting = (BOOL) args[@"allowsAnnotationViewSorting"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.allowsAnnotationViewSorting = allowsAnnotationViewSorting;
        methodResult(@"success");
    },
    
    @"MAMapView::set_showsUserLocation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL showsUserLocation = (BOOL) args[@"showsUserLocation"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.showsUserLocation = showsUserLocation;
        methodResult(@"success");
    },
    
    @"MAMapView::set_customizeUserLocationAccuracyCircleRepresentation": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL customizeUserLocationAccuracyCircleRepresentation = (BOOL) args[@"customizeUserLocationAccuracyCircleRepresentation"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.customizeUserLocationAccuracyCircleRepresentation = customizeUserLocationAccuracyCircleRepresentation;
        methodResult(@"success");
    },
    
    @"MAMapView::set_pausesLocationUpdatesAutomatically": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL pausesLocationUpdatesAutomatically = (BOOL) args[@"pausesLocationUpdatesAutomatically"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.pausesLocationUpdatesAutomatically = pausesLocationUpdatesAutomatically;
        methodResult(@"success");
    },
    
    @"MAMapView::set_allowsBackgroundLocationUpdates": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL allowsBackgroundLocationUpdates = (BOOL) args[@"allowsBackgroundLocationUpdates"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.allowsBackgroundLocationUpdates = allowsBackgroundLocationUpdates;
        methodResult(@"success");
    },
    
    @"MAMapView::set_customMapStyleEnabled": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL customMapStyleEnabled = (BOOL) args[@"customMapStyleEnabled"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAMapView* ref = (MAMapView*) REF_MAP[@(refId)];
    
        ref.customMapStyleEnabled = customMapStyleEnabled;
        methodResult(@"success");
    },
    
    @"MAOverlayPathRenderer::set_lineDash": ^(NSObject <FlutterPluginRegistrar> * registrar, NSDictionary<NSString *, id> * args, FlutterResult methodResult) {
        BOOL lineDash = (BOOL) args[@"lineDash"];
    
        NSInteger refId = [args[@"refId"] integerValue];
        MAOverlayPathRenderer* ref = (MAOverlayPathRenderer*) REF_MAP[@(refId)];
    
        ref.lineDash = lineDash;
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
