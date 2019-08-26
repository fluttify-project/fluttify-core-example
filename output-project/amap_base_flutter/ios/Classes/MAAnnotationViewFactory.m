#import "MAAnnotationViewFactory.h"
#import "AmapBaseFlutterPlugin.h"
#import <MAMapKit/MAMapKit.h>

@implementation MAAnnotationViewFactory {

}
- (NSObject <FlutterPlatformView> *)createWithFrame:(CGRect)frame viewIdentifier:(int64_t)viewId arguments:(id _Nullable)args {
  return [[MAAnnotationViewPlatformView alloc] initWithViewId:viewId];
}

@end

@implementation MAAnnotationViewPlatformView {
  NSInteger _viewId;
}

- (instancetype)initWithViewId:(NSInteger)viewId {
  self = [super init];
  if (self) {
    _viewId = viewId;
  }

  return self;
}

- (UIView *)view {
  return [[MAAnnotationView alloc] init];
}

- (void)dealloc {
  [REF_MAP removeObjectForKey:@(_viewId)];
}

@end