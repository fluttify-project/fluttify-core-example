import 'package:flutter/services.dart';

class SystemRef {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  static Future<android_app_Application> getandroid_app_Application() async {
    final refId =
        await _channel.invokeMethod('SystemRef::getandroid_app_Application');
    return android_app_Application.withRefId(refId);
  }

  static Future<android_app_Activity> getandroid_app_Activity() async {
    final refId =
        await _channel.invokeMethod('SystemRef::getandroid_app_Activity');
    return android_app_Activity.withRefId(refId);
  }

  static Future<android_os_Bundle> createandroid_os_Bundle() async {
    final refId =
        await _channel.invokeMethod('SystemRef::createandroid_os_Bundle');
    return android_os_Bundle.withRefId(refId);
  }

  static Future<String> release(int refId) async {
    return await _channel.invokeMethod('SystemRef::release', {'refId': refId});
  }

  static Future<android_app_Activity> clearRefMap() async {
    return await _channel.invokeMethod('SystemRef::clearRefMap');
  }
}

class android_content_Context {
  android_content_Context.withRefId(this.refId);

  final int refId;
}

class android_app_Application extends android_content_Context {
  android_app_Application.withRefId(int refId) : super.withRefId(refId);
}

class android_app_Activity extends android_content_Context {
  android_app_Activity.withRefId(int refId) : super.withRefId(refId);
}

class android_os_Bundle {
  android_os_Bundle.withRefId(this.refId);

  final int refId;
}
