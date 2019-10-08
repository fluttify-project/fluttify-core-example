#import <Foundation/Foundation.h>
#import <Flutter/Flutter.h>
#import <MAMapKit/MAMapKit.h>

extern NSMutableDictionary<NSNumber *, NSObject *> *HEAP;

@interface MAAnnotationViewFactory : NSObject <FlutterPlatformViewFactory>
- (instancetype)initWithRegistrar:(NSObject <FlutterPluginRegistrar> *)registrar;
@end

@interface MAAnnotationViewPlatformView : NSObject <MATraceDelegate, MAMultiPointOverlayRendererDelegate, MAMapViewDelegate, FlutterPlatformView>
- (instancetype)initWithViewId:(NSInteger)viewId registrar:(NSObject <FlutterPluginRegistrar> *)registrar;
@end
