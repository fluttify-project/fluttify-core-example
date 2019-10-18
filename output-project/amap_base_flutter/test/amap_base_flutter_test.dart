import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:amap_base_flutter/amap_base_flutter.dart';

void main() {
  const MethodChannel channel = MethodChannel('amap_base_flutter');

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await AmapBaseFlutter.platformVersion, '42');
  });
}
