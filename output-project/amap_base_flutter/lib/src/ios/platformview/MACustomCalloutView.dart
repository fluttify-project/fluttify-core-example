import 'dart:convert';
import 'dart:typed_data';

import 'package:flutter/foundation.dart';
import 'package:flutter/gestures.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/services.dart';
import 'package:amap_base_flutter/src/ios/ios.export.dart';

typedef void MACustomCalloutViewCreatedCallback(MACustomCalloutView controller);

// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import
class MACustomCalloutView_iOS extends StatelessWidget {
  const MACustomCalloutView_iOS({
    Key key,
    this.onViewCreated,
  }) : super(key: key);

  final MACustomCalloutViewCreatedCallback onViewCreated;

  @override
  Widget build(BuildContext context) {
    final gestureRecognizers = <Factory<OneSequenceGestureRecognizer>>[
      Factory<OneSequenceGestureRecognizer>(() => EagerGestureRecognizer()),
    ].toSet();

    final messageCodec = StandardMessageCodec();
    return UiKitView(
      viewType: 'me.yohom/MACustomCalloutView',
      gestureRecognizers: gestureRecognizers,
      onPlatformViewCreated: _onViewCreated,
      creationParamsCodec: messageCodec,
    );
  }

  void _onViewCreated(int id) {
    final controller = MACustomCalloutView()..refId = id;
    if (onViewCreated != null) {
      onViewCreated(controller);
    }
  }
}