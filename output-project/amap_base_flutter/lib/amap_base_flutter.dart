import 'dart:async';

import 'package:flutter/services.dart';

class AmapBaseFlutter {
  static const MethodChannel _channel =
      const MethodChannel('amap_base_flutter');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
