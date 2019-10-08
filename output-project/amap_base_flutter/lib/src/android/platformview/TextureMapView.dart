import 'dart:convert';
import 'dart:typed_data';

import 'package:flutter/foundation.dart';
import 'package:flutter/gestures.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/services.dart';
import 'package:amap_base_flutter/src/android/android.export.dart';

typedef void TextureMapViewCreatedCallback(com_amap_api_maps_TextureMapView controller);

// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import
class com_amap_api_maps_TextureMapView_Android extends StatelessWidget {
  const com_amap_api_maps_TextureMapView_Android({
    Key key,
    this.onViewCreated,
  }) : super(key: key);

  final TextureMapViewCreatedCallback onViewCreated;

  @override
  Widget build(BuildContext context) {
    final gestureRecognizers = <Factory<OneSequenceGestureRecognizer>>[
      Factory<OneSequenceGestureRecognizer>(() => EagerGestureRecognizer()),
    ].toSet();

    final messageCodec = StandardMessageCodec();
    return AndroidView(
      viewType: 'me.yohom/com.amap.api.maps.TextureMapView',
      gestureRecognizers: gestureRecognizers,
      onPlatformViewCreated: _onViewCreated,
      creationParamsCodec: messageCodec,
    );
  }

  void _onViewCreated(int id) {
    final controller = com_amap_api_maps_TextureMapView()..refId = id;
    if (onViewCreated != null) {
      onViewCreated(controller);
    }
  }
}