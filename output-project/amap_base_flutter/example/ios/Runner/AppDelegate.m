#include "AppDelegate.h"
#include "GeneratedPluginRegistrant.h"
#import <MAMapKit/MAMapKit.h>
@implementation AppDelegate

- (BOOL)application:(UIApplication *)application
    didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
  [GeneratedPluginRegistrant registerWithRegistry:self];
  // Override point for customization after application launch.
    [AMapServices sharedServices].apiKey = @"您的Key";
    [AMapServices sharedServices].enableHTTPS = YES;


  return [super application:application didFinishLaunchingWithOptions:launchOptions];
}

@end
