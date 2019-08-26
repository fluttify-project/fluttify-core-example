#import <Foundation/Foundation.h>
#import <Flutter/Flutter.h>

extern NSMutableDictionary<NSNumber *, NSObject *> *REF_MAP;

@interface MAAnnotationViewFactory : NSObject <FlutterPlatformViewFactory>
@end

@interface MAAnnotationViewPlatformView: NSObject <FlutterPlatformView>

- (instancetype) initWithViewId: (NSInteger) viewId;

@end