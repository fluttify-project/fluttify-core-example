import 'dart:convert';
import 'dart:typed_data';

import 'package:flutter/foundation.dart';
import 'package:flutter/gestures.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/services.dart';
import 'package:amap_base_flutter/amap_base_flutter.dart';

typedef void MACustomCalloutViewCreatedCallback(MACustomCalloutView controller);

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
    final controller = MACustomCalloutView.withRefId(id);
    if (onViewCreated != null) {
      onViewCreated(controller);
    }
  }
}