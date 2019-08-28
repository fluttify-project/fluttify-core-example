import 'dart:io';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/cupertino.dart';

/// 除了地图以外的功能放在这里, 比如说sdk初始化
class AmapService {
  /// 设置ios端的key, android端需要在manifest里面设置, 无法通过代码设置
  static Future init(String iosKey) async {
    platform(
      android: () {
        print('android端需要在Manifest里面设置');
      },
      ios: () async {
        final service = await AMapServices.sharedServices();
        await service.set_apiKey(iosKey);
      },
    );
  }
}

void platform({VoidCallback android, VoidCallback ios}) {
  if (Platform.isAndroid) {
    if (android != null) android();
  } else if (Platform.isIOS) {
    if (ios != null) ios();
  }
}
