import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:amap_base_flutter_example/utils/utils.export.dart';
import 'package:amap_base_flutter_example/widgets/setting.widget.dart';
import 'package:decorated_flutter/decorated_flutter.dart';
import 'package:flutter/material.dart';

class ShowLocationScreen extends StatefulWidget {
  @override
  _ShowLocationScreenState createState() => _ShowLocationScreenState();
}

class _ShowLocationScreenState extends State<ShowLocationScreen> {
  AmapController _controller;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('自定义地图')),
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
                  head: '是否显示地图',
                  onSelected: (value) {
                    _controller?.showMyLocation(value);
                  },
                ),
                BooleanSetting(
                  head: '是否显示室内地图',
                  onSelected: (value) {
                    _controller?.showIndoorMap(value);
                  },
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
