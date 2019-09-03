#import <Flutter/Flutter.h>
#import <AMapFoundationKit/AMapFoundationKit.h>
#import <MAMapKit/MAMapKit.h>
#import "MAAnnotationViewFactory.h"
#import "MACustomCalloutViewFactory.h"
#import "MAMapViewFactory.h"

@interface AmapBaseFlutterPlugin : NSObject<MATraceDelegate, MAMultiPointOverlayRendererDelegate, MAMapViewDelegate, FlutterPlugin>

- (instancetype) initWithFlutterPluginRegistrar: (NSObject <FlutterPluginRegistrar> *) registrar;

@end
