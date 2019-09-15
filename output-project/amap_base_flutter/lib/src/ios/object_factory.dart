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

class NSObject extends Ref_iOS {
  NSObject.withRefId(int refId) : super.withRefId(refId);
}

// 结构体
class CLLocationCoordinate2D extends Ref_iOS {
  CLLocationCoordinate2D.withRefId(int refId) : super.withRefId(refId);
}

class CLLocation extends Ref_iOS {
  CLLocation.withRefId(int refId) : super.withRefId(refId);
}

class CGRect extends Ref_iOS {
  CGRect.withRefId(int refId) : super.withRefId(refId);
}

class CGPoint extends Ref_iOS {
  CGPoint.withRefId(int refId) : super.withRefId(refId);
}

// 类
class CLLocationManager extends Ref_iOS {
  CLLocationManager.withRefId(int refId) : super.withRefId(refId);
}

class NSError extends Ref_iOS {
  NSError.withRefId(int refId) : super.withRefId(refId);
}

class UIView extends Ref_iOS {
  UIView.withRefId(int refId) : super.withRefId(refId);
}

class UIControl extends UIView {
  UIControl.withRefId(int refId) : super.withRefId(refId);
}
