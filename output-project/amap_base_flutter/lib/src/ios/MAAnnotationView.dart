import 'dart:typed_data';

import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types
class MAAnnotationView {
  MAAnnotationView.withRefId(this.refId);

  final int refId;

  static final _channel = MethodChannel('me.yohom/amap_base_flutter');

  // 生成getters
  Future<String> get_reuseIdentifier() async {
    final result = await _channel.invokeMethod("MAAnnotationView::get_reuseIdentifier", {'refId': refId});
    return result;
  }
  
  Future<int> get_zIndex() async {
    final result = await _channel.invokeMethod("MAAnnotationView::get_zIndex", {'refId': refId});
    return result;
  }
  
  Future<bool> get_enabled() async {
    final result = await _channel.invokeMethod("MAAnnotationView::get_isEnabled", {'refId': refId});
    return result;
  }
  
  Future<bool> get_highlighted() async {
    final result = await _channel.invokeMethod("MAAnnotationView::get_isHighlighted", {'refId': refId});
    return result;
  }
  
  Future<bool> get_selected() async {
    final result = await _channel.invokeMethod("MAAnnotationView::get_isSelected", {'refId': refId});
    return result;
  }
  
  Future<bool> get_canShowCallout() async {
    final result = await _channel.invokeMethod("MAAnnotationView::get_canShowCallout", {'refId': refId});
    return result;
  }
  
  Future<bool> get_draggable() async {
    final result = await _channel.invokeMethod("MAAnnotationView::get_isDraggable", {'refId': refId});
    return result;
  }
  

  // 生成setters
  Future<void> set_zIndex(int zIndex) async {
    await _channel.invokeMethod('MAAnnotationView::set_zIndex', {'refId': refId, "zIndex": zIndex});
  }
  
  Future<void> set_canShowCallout(bool canShowCallout) async {
    await _channel.invokeMethod('MAAnnotationView::set_canShowCallout', {'refId': refId, "canShowCallout": canShowCallout});
  }
  

  // 生成方法们
   Future<String> setSelected(bool animated, bool selected) async {
    // 日志打印
    print('fluttify-dart: MAAnnotationView@$refId::setSelected([\'selected\':$selected, \'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAAnnotationView::setSelected', {"selected": selected, "animated": animated, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> prepareForReuse() async {
    // 日志打印
    print('fluttify-dart: MAAnnotationView@$refId::prepareForReuse([])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAAnnotationView::prepareForReuse', {"refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
   Future<String> setDragState(MAAnnotationViewDragState newDragState, bool animated) async {
    // 日志打印
    print('fluttify-dart: MAAnnotationView@$refId::setDragState([\'animated\':$animated])');
  
    // 调用原生方法
    final result = await _channel.invokeMethod('MAAnnotationView::setDragState', {"newDragState": newDragState.index, "animated": animated, "refId": refId});
  
  
    // 接受原生回调
  
  
    // 返回值
    return result;
  }
  
}