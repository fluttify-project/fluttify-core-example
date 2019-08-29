#import "MAMapViewFactory.h"
#import "AmapBaseFlutterPlugin.h"
#import <MAMapKit/MAMapKit.h>

@implementation MAMapViewFactory {

}
- (NSObject <FlutterPlatformView> *)createWithFrame:(CGRect)frame viewIdentifier:(int64_t)viewId arguments:(id _Nullable)args {
  return [[MAMapViewPlatformView alloc] initWithViewId:viewId];
}

@end

@implementation MAMapViewPlatformView {
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
  MAMapView *view = [[MAMapView alloc] init];
  REF_MAP[@(_viewId)] = view;
  return view;
}

- (void)dealloc {
  [REF_MAP removeObjectForKey:@(_viewId)];
}

@end