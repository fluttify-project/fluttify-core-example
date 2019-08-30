import 'package:flutter/services.dart';

import 'package:amap_base_flutter/amap_base_flutter.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class ObjectFactory_iOS {
  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  static Future<CLLocationCoordinate2D> createCLLocationCoordinate2D(double latitude, double longitude) async {
    final int refId = await _channel.invokeMethod('ObjectFactory::createCLLocationCoordinate2D', {'latitude': latitude, 'longitude': longitude});
    return CLLocationCoordinate2D.withRefId(refId);
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

class CLLocationCoordinate2D {
  CLLocationCoordinate2D.withRefId(this.refId);

  final int refId;
}