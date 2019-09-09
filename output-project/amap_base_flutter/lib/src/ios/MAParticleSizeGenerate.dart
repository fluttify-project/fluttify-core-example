import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class MAParticleSizeGenerate extends Ref_iOS {
  MAParticleSizeGenerate.withRefId(int refId): super.withRefId(refId);

  double getSizeX(double timeFrame);
  
  double getSizeY(double timeFrame);
  
  double getSizeZ(double timeFrame);
  
}