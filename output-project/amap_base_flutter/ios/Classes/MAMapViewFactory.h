#import <Foundation/Foundation.h>
#import <Flutter/Flutter.h>

extern NSMutableDictionary<NSNumber *, NSObject *> *REF_MAP;

@interface MAMapViewFactory : NSObject <FlutterPlatformViewFactory>
@end

@interface MAMapViewPlatformView: NSObject <FlutterPlatformView>

- (instancetype) initWithViewId: (NSInteger) viewId;

@end