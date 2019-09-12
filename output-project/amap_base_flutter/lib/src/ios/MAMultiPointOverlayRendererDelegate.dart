import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
abstract class MAMultiPointOverlayRendererDelegate extends Ref_iOS {
  MAMultiPointOverlayRendererDelegate.withRefId(int refId) : super.withRefId(refId);

  String multiPointOverlayRendererDidItemTapped(MAMultiPointOverlayRenderer renderer, MAMultiPointItem item);
  
}