import 'package:amap_base_flutter/amap_base_flutter.dart';
import 'package:amap_base_flutter_example/utils/misc.dart';
import 'package:amap_base_flutter_example/widgets/setting.widget.dart';
import 'package:decorated_flutter/decorated_flutter.dart';
import 'package:flutter/material.dart';

class CodeInteractionScreen extends StatefulWidget {
  CodeInteractionScreen();

  factory CodeInteractionScreen.forDesignTime() => CodeInteractionScreen();

  @override
  _CodeInteractionScreenState createState() => _CodeInteractionScreenState();
}

class _CodeInteractionScreenState extends State<CodeInteractionScreen> {
  AmapController _controller;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('调用方法交互'),
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
              scrollable: true,
              children: <Widget>[
                ContinuousSetting(
                  head: '缩放大小',
                  min: 0,
                  max: 20,
                  onChanged: (value) {
                    _controller?.setZoomLevel(value);
                  },
                ),
                DiscreteSetting(
                  head: '放大/缩小一个等级',
                  options: ['放大', '缩小'],
                  onSelected: (value) {
                    switch (value) {
                      case '放大':
                        _controller?.zoomIn();
                        break;
                      case '缩小':
                        _controller?.zoomOut();
                        break;
                    }
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
