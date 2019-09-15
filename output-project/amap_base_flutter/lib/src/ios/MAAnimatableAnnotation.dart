import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
mixin MAAnimatableAnnotation on Ref_iOS {
  String step(double timeDelta) {}
  
  bool isAnimationFinished() {}
  
  bool shouldAnimationStart() {}
  
  double rotateDegree() {}
  
}