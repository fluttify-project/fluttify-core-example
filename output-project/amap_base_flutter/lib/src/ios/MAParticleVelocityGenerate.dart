import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class MAParticleVelocityGenerate extends Ref_iOS {
  MAParticleVelocityGenerate.withRefId(int refId) : super.withRefId(refId);

  double getX();
  
  double getY();
  
  double getZ();
  
}