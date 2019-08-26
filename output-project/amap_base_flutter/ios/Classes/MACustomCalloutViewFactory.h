#import <Foundation/Foundation.h>
#import <Flutter/Flutter.h>

extern NSMutableDictionary<NSNumber *, NSObject *> *REF_MAP;

@interface MACustomCalloutViewFactory : NSObject <FlutterPlatformViewFactory>
@end

@interface MACustomCalloutViewPlatformView: NSObject <FlutterPlatformView>

- (instancetype) initWithViewId: (NSInteger) viewId;

@end