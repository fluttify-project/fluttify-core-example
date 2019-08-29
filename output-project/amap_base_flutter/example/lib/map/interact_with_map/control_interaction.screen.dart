import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:amap_base_flutter_example/utils/misc.dart';
import 'package:amap_base_flutter_example/widgets/setting.widget.dart';
import 'package:decorated_flutter/decorated_flutter.dart';
import 'package:flutter/material.dart';

class ControlInteractionScreen extends StatefulWidget {
  ControlInteractionScreen();

  factory ControlInteractionScreen.forDesignTime() =>
      ControlInteractionScreen();

  @override
  _ControlInteractionScreenState createState() =>
      _ControlInteractionScreenState();
}

class _ControlInteractionScreenState extends State<ControlInteractionScreen> {
  AmapController _controller;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('控件交互'),
        backgroundColor: Colors.black,
        centerTitle: true,
      ),
      body: DecoratedColumn(
        children: <Widget>[
          Flexible(
            flex: 1,
            child: AmapView(
              onMapCreated: (controller) async {
                _controller = controller;
                if (await requestPermission()) {
                  await controller.showMyLocation(false);
                }
              },
            ),
          ),
          Flexible(
            child: DecoratedColumn(
              children: <Widget>[
                BooleanSetting(
                  head: '是否显示缩放按钮',
                  onSelected: (value) {
                    _controller?.showZoomControl(value);
                  },
                ),
                BooleanSetting(
                  head: '是否显示指南针',
                  onSelected: (value) {
                    _controller?.showCompass(value);
                  },
                ),
                DiscreteSetting(
                  head: '切换地图图层',
                  options: ['正常视图', '卫星视图', '黑夜视图', '导航视图', '公交视图'],
                  onSelected: (value) {
                    switch (value) {
                      case '正常视图':
                        _controller?.setMapType(MapType.Standard);
                        break;
                      case '卫星视图':
                        _controller?.setMapType(MapType.Satellite);
                        break;
                      case '黑夜视图':
                        _controller?.setMapType(MapType.Night);
                        break;
                      case '导航视图':
                        _controller?.setMapType(MapType.Navi);
                        break;
                      case '公交视图':
                        _controller?.setMapType(MapType.Bus);
                        break;
                    }
                  },
                ),
                BooleanSetting(
                  head: '是否显示路况信息',
                  onSelected: (value) {
                    _controller?.showTraffic(value);
                  },
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }

  @override
  void dispose() {
    super.dispose();
  }
}
