#import "MACustomCalloutViewFactory.h"
#import "AmapBaseFlutterPlugin.h"
#import <MAMapKit/MAMapKit.h>

@implementation MACustomCalloutViewFactory {

}
- (NSObject <FlutterPlatformView> *)createWithFrame:(CGRect)frame viewIdentifier:(int64_t)viewId arguments:(id _Nullable)args {
  return [[MACustomCalloutViewPlatformView alloc] initWithViewId:viewId];
}

@end

@implementation MACustomCalloutViewPlatformView {
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
  MACustomCalloutView *view = [[MACustomCalloutView alloc] init];
  REF_MAP[@(_viewId)] = view;
  return view;
}

- (void)dealloc {
  [REF_MAP removeObjectForKey:@(_viewId)];
}

@end