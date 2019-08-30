import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:amap_base_flutter/src/android/com/amap/api/maps/MapView.dart';
import 'package:amap_base_flutter/src/android/object_factory.dart';
import 'package:amap_base_flutter/src/ios/MAMapView.dart';

import 'enums.dart';

class AmapController {
  AmapController.android(this.androidController);

  AmapController.ios(this.iosController);

  com_amap_api_maps_MapView androidController;
  MAMapView iosController;

  /// 是否显示我的位置
  Future showMyLocation(bool show) async {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final locationStyle = await ObjectFactory_Android
            .createcom_amap_api_maps_model_MyLocationStyle();
        await locationStyle?.showMyLocation(show);
        await map.setMyLocationStyle(locationStyle);
        await map.setMyLocationEnabled(show);
      },
      ios: () async {
        await iosController.set_showsUserLocation(show);

        if (show) {
          await iosController.setUserTrackingMode(
              MAUserTrackingMode.MAUserTrackingModeFollow, true);
        }
      },
    );
  }

  /// 是否显示室内地图
  Future showIndoorMap(bool show) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        await map.showIndoorMap(show);
      },
      ios: () async {
        await iosController.set_showsIndoorMap(show);
      },
    );
  }

  /// 选择显示图层
  Future setMapType(MapType mapType) async {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        switch (mapType) {
          case MapType.Standard:
            await map.setMapType(1);
            break;
          case MapType.Satellite:
            await map.setMapType(2);
            break;
          case MapType.Night:
            await map.setMapType(3);
            break;
          case MapType.Navi:
            await map.setMapType(4);
            break;
          case MapType.Bus:
            await map.setMapType(5);
            break;
        }
      },
      ios: () async {
        switch (mapType) {
          case MapType.Standard:
            await iosController.set_mapType(MAMapType.MAMapTypeStandard);
            break;
          case MapType.Satellite:
            await iosController.set_mapType(MAMapType.MAMapTypeSatellite);
            break;
          case MapType.Night:
            await iosController.set_mapType(MAMapType.MAMapTypeStandardNight);
            break;
          case MapType.Navi:
            await iosController.set_mapType(MAMapType.MAMapTypeNavi);
            break;
          case MapType.Bus:
            await iosController.set_mapType(MAMapType.MAMapTypeBus);
            break;
        }
      },
    );
  }

  /// 显示路况信息
  Future showTraffic(bool enable) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        await map.setTrafficEnabled(enable);
      },
      ios: () async {
        await iosController.set_showTraffic(enable);
      },
    );
  }

  /// 显示缩放控件
  Future showZoomControl(bool enable) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final uiSetting = await map.getUiSettings();
        await uiSetting.setZoomControlsEnabled(enable);
      },
      ios: () async {
        print('ios端不支持显示缩放控件');
      },
    );
  }

  /// 显示指南针
  Future showCompass(bool enable) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final uiSetting = await map.getUiSettings();
        await uiSetting.setCompassEnabled(enable);
      },
      ios: () async {
        await iosController.set_showsCompass(enable);
      },
    );
  }

  /// 显示定位按钮
  Future showLocateControl(bool enable) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final uiSetting = await map.getUiSettings();
        await uiSetting.setMyLocationButtonEnabled(enable);
      },
      ios: () async {
        print('ios端不支持显示定位按钮');
      },
    );
  }

  /// 显示比例尺控件
  Future showScaleControl(bool enable) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final uiSetting = await map.getUiSettings();
        await uiSetting.setScaleControlsEnabled(enable);
      },
      ios: () async {
        await iosController.set_showsScale(enable);
      },
    );
  }

  /// 缩放手势使能
  Future setZoomGesturesEnabled(bool enable) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final uiSetting = await map.getUiSettings();
        await uiSetting.setZoomGesturesEnabled(enable);
      },
      ios: () async {
        await iosController.set_zoomEnabled(enable);
      },
    );
  }

  /// 滑动手势使能
  Future setScrollGesturesEnabled(bool enable) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final uiSetting = await map.getUiSettings();
        await uiSetting.setScrollGesturesEnabled(enable);
      },
      ios: () async {
        await iosController.set_scrollEnabled(enable);
      },
    );
  }

  /// 旋转手势使能
  Future setRotateGesturesEnabled(bool enable) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final uiSetting = await map.getUiSettings();
        await uiSetting.setRotateGesturesEnabled(enable);
      },
      ios: () async {
        await iosController.set_rotateEnabled(enable);
      },
    );
  }

  /// 旋转手势使能
  Future setTiltGesturesEnabled(bool enable) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final uiSetting = await map.getUiSettings();
        await uiSetting.setTiltGesturesEnabled(enable);
      },
      ios: () async {
        await iosController.set_rotateCameraEnabled(enable);
      },
    );
  }

  /// 所有手势使能
  Future setAllGesturesEnabled(bool enable) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final uiSetting = await map.getUiSettings();
        await uiSetting.setAllGesturesEnabled(enable);
      },
      ios: () async {
        await iosController.set_zoomEnabled(enable);
        await iosController.set_scrollEnabled(enable);
        await iosController.set_rotateEnabled(enable);
        await iosController.set_rotateCameraEnabled(enable);
      },
    );
  }

  /// 设置缩放大小
  Future setZoomLevel(double level, {bool animated = true}) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final cameraUpdate =
            await com_amap_api_maps_CameraUpdateFactory.zoomTo(level);
        if (animated) {
          await map.animateCamera(cameraUpdate);
        } else {
          await map.moveCamera(cameraUpdate);
        }
      },
      ios: () async {
        await iosController.setZoomLevel(animated, level);
      },
    );
  }

  /// 放大一个等级
  Future zoomIn({bool animated = true}) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final cameraUpdate =
            await com_amap_api_maps_CameraUpdateFactory.zoomIn();
        if (animated) {
          await map.animateCamera(cameraUpdate);
        } else {
          await map.moveCamera(cameraUpdate);
        }
      },
      ios: () async {
        final currentLevel = await iosController.get_zoomLevel();
        await iosController.setZoomLevel(animated, currentLevel + 1);
      },
    );
  }

  /// 放大一个等级
  Future zoomOut({bool animated = true}) {
    return platform(
      android: () async {
        final map = await androidController.getMap();
        final cameraUpdate =
            await com_amap_api_maps_CameraUpdateFactory.zoomOut();
        if (animated) {
          await map.animateCamera(cameraUpdate);
        } else {
          await map.moveCamera(cameraUpdate);
        }
      },
      ios: () async {
        final currentLevel = await iosController.get_zoomLevel();
        await iosController.setZoomLevel(animated, currentLevel - 1);
      },
    );
  }
}
