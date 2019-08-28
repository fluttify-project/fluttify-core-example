import 'dart:io';

import 'package:flutter/cupertino.dart';

/// 除了地图以外的功能放在这里, 比如说sdk初始化
class Service {
  static Future init() async {}
}

void platform({VoidCallback android, VoidCallback ios}) {
  if (Platform.isAndroid) {
    if (android != null) android();
  } else if (Platform.isIOS) {
    if (ios != null) ios();
  }
}
