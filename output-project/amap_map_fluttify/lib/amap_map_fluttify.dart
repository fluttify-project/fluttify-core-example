import 'dart:async';

import 'package:flutter/services.dart';

class AmapMapFluttify {
  static const MethodChannel _channel =
      const MethodChannel('amap_map_fluttify');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
