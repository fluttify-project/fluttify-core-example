import 'dart:io';

import 'package:amap_base_flutter/src/ios/ios.export.dart';

typedef Future FutureCallback();

/// 除了地图以外的功能放在这里, 比如说sdk初始化
class AmapService {
  /// 设置ios端的key, android端需要在manifest里面设置, 无法通过代码设置
  static Future init(String iosKey) async {
    return platform(
      android: () async {
        print('android端需要在Manifest里面设置');
      },
      ios: () async {
        final service = await AMapServices.sharedServices();
        await service.set_apiKey(iosKey);
        await service.set_enableHTTPS(true);
      },
    );
  }
}

Future platform({FutureCallback android, FutureCallback ios}) async {
  if (Platform.isAndroid) {
    if (android != null && Platform.isAndroid) return await android();
  } else if (Platform.isIOS) {
    if (ios != null && Platform.isIOS) return await ios();
  }
}
